package co.incubyte.wordapp;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.mockito.Mockito.verify;

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

        verify(wordRepository).save(word);
    }

    @Test
    public void read_todo_by_calling_repository()
    {
        WordService wordService = new WordService(wordRepository);
        long id = 100L;
        Optional<Word> retrivedWord = wordService.get(id);
        verify(wordRepository).findById(id);
    }

}
