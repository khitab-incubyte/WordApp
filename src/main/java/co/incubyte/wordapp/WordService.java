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

    public Iterable<Word> getAllWords() {
        return wordRepository.findAllOrderById();
    }

    public Iterable<Word> deleteWord(long id) {
        wordRepository.deleteById(id);
        return wordRepository.findAllOrderById();
    }

    public Iterable<Word> updateWord(Word word) {
        wordRepository.update(word);
        return wordRepository.findAllOrderById();
    }
}
