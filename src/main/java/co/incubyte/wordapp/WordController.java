package co.incubyte.wordapp;

import io.micronaut.http.annotation.Controller;

@Controller("/word")
public class WordController {
    private final WordService wordService;

    public WordController(WordService wordService) {
        this.wordService = wordService;
    }

    public void save(Word word) {
        throw new UnsupportedOperationException();
    }
}
