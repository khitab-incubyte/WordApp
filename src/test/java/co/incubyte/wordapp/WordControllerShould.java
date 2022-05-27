package co.incubyte.wordapp;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class WordControllerShould {

    @Mock
    WordService wordService;

    @Test
    public void call_service_to_save_word()
    {
        WordController wordController = new WordController(wordService);

        Word word = new Word();
        wordController.save(word);

        verify(wordService).save(word);
    }

    @Test
    public void call_service_to_find_word()
    {
        WordController wordController = new WordController(wordService);
        long id = 100L;

        Optional<Word> word = wordController.findById(id);
        verify(wordService).get(id);
    }

    @Test
    public void get_all_words()
    {
        WordController wordController = new WordController(wordService);

        Iterable<Word> words = wordController.getAllWords();

        verify(wordService).getAllWords();
    }
}
