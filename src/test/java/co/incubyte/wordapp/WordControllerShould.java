package co.incubyte.wordapp;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

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

    }
}
