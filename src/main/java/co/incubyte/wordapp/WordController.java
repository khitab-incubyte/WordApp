package co.incubyte.wordapp;

import io.micronaut.http.annotation.*;

import java.util.Optional;

@Controller("/word")
public class WordController {
    private final WordService wordService;

    public WordController(WordService wordService) {
        this.wordService = wordService;
    }

    @Post("/")
    public Word save(@Body Word word) {
        return wordService.save(word);
    }

    @Get("/{id}")
    public Optional<Word> findById(long id) {
        return wordService.get(id);
    }

    @Get("/")
    public Iterable<Word> getAllWords() {
        return wordService.getAllWords();
    }

    @Delete("/")
    public Iterable<Word> deleteWord(long id)
    {
        return wordService.deleteWord(id);
    }

    @Patch
    public Iterable<Word> updateWord(@Body Word word)
    {
        return wordService.updateWord(word);
    }
}
