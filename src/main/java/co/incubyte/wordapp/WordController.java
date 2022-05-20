package co.incubyte.wordapp;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;

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

}
