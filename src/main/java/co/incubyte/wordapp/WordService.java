package co.incubyte.wordapp;

import jakarta.inject.Singleton;

import java.util.Optional;

@Singleton
public class WordService {
    private final WordRepository wordRepository;

    public WordService(WordRepository wordRepository) {
        this.wordRepository = wordRepository;
    }

    public Word save(Word word) {
        return wordRepository.save(word);
    }

    public Optional<Word> get(long id) {
        return wordRepository.findById(id);
    }
}
