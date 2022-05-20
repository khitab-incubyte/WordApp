package co.incubyte.wordapp;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class WordServiceShould {
    @Mock
    WordRepository wordRepository;

    @Test
    public void save_word_by_calling_repository()
    {
        Word word = new Word();

    WordService wordService = new WordService(wordRepository);
        wordService.save(word);
    }

}
