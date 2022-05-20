package co.incubyte.wordapp;

import jakarta.inject.Singleton;

@Singleton
public class WordService {
    public WordService(WordRepository wordRepository) {
    }

    public Word save(Word word) {
        throw new UnsupportedOperationException();
    }
}
