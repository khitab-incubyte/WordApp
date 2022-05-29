package co.incubyte.wordapp;

import io.micronaut.core.type.Argument;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import jakarta.inject.Inject;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@MicronautTest
public class WordControllerTest {

  @Inject
  @Client("/")
  HttpClient httpClient;

  @Test
  public void call_service_to_save_word() {
    Word word = new Word();
    word.setWord("Apple");

    Word savedWord =
        this.httpClient
            .toBlocking()
            .retrieve(HttpRequest.POST("/word", word), Argument.of(Word.class));

    assertThat(savedWord.getWord()).isEqualTo("Apple");

    Word retrievedWord = this.httpClient.toBlocking().retrieve(HttpRequest.GET("/word/" + savedWord.getId()), Argument.of(Word.class));

    assertThat(retrievedWord.getWord()).isEqualTo(savedWord.getWord());
  }

//  @Test
//  public void get_all_words()
//  {
//    Word firstWord = new Word();
//    firstWord.setId(1L);
//    firstWord.setWord("Apple");
//
//    Word secondWord = new Word();
//    secondWord.setId(2L);
//    secondWord.setWord("Bat");
//
//    Word saveFirstWord = this.httpClient.toBlocking().retrieve(HttpRequest.POST("/word", firstWord), Argument.of(Word.class));
//    Word saveSecondWord = this.httpClient.toBlocking().retrieve(HttpRequest.POST("/word", secondWord), Argument.of(Word.class));
//
//    List<Word> retrivedWords = this.httpClient.toBlocking().retrieve(HttpRequest.GET("word/"), Argument.listOf(Word.class));
//
//    assertThat(retrivedWords).contains(saveFirstWord, saveSecondWord);
//  }
}
