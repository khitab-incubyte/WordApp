package co.incubyte.wordapp;

import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.runtime.EmbeddedApplication;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import jakarta.inject.Inject;
import org.mockito.Mock;

@MicronautTest
class WordControllerTest {

    @Inject
    @Client("/")
    HttpClient httpClient;

    @Mock
    WordService wordService;

    @Test
    public void call_service_to_save_word()
    {
        WordController wordController = new WordController(wordService);
    }
}
