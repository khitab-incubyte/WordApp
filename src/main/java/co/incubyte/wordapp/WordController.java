package co.incubyte.wordapp;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;

import java.util.Optional;

@Controller("/word")
public class WordController {
    private final WordService wordService;

    public WordController(WordService wordService) {
        this.wordService = wordService;
    }

    @Post("/")
    public Word save(Word word) {
        return wordService.save(word);
    }

    @Get("/{id}")
    public Optional<Word> findById(long id) {
        throw new UnsupportedOperationException();
    }
}
