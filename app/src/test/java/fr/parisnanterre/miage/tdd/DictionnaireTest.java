/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package fr.parisnanterre.miage.tdd;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.MatcherAssert.assertThat;

class DictionnaireTest {
    private Dictionnaire dictionary;

    @BeforeEach
    public void initialize(){
        this.dictionary= new Dictionnaire("contre");
    }

    @Test
    public void testDictionaryName(){
        assertThat(dictionary.getName(),equalTo("contre"));
    }

    @Test public void testDictionnaryIsEmpty(){
        assertThat(dictionary.isEmpty(),equalTo(true));
    }

    @Test public void testOneTranslation(){
        dictionary.addTranslation("contre","against");
        assertThat(dictionary.getTranslation("contre"),containsInAnyOrder("against"));
    }

    @Test public void testMultiplesTranslation() {
        dictionary.addTranslation("contre", "against");
        dictionary.addTranslation("contre", "versus");
        assertThat(dictionary.getMutliplesTranslations("contre"), containsInAnyOrder("against", "versus"));
    }

    @AfterEach
    public void cleanUp(){
        this.dictionary= null;
    }
}
