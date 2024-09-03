import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    private static Stream<Arguments>
    provideNames_fullNameList () {
        return Stream.of(
                Arguments.of(new Person("Bill", null, "Nye"), false),
                Arguments.of(new Person("Phillip", "J", "Fry"), true),
                Arguments.of(new Person("Daphne", "Anne", "Blake"), true),
                Arguments.of(new Person("Quincy", "", "Magoo"), false),
                Arguments.of(new Person("Leopold", " ", "Stotch"), false)
        );
    }

    @DisplayName("Seeing if a person has full name")
    @ParameterizedTest
    @MethodSource("provideNames_fullNameList")
    void hasFullName_mixOfName_shouldReturn2T3F(Person p, boolean expected) {
        boolean hFN = p.hasFullName();
        assertEquals(expected, hFN);

    }

    private static Stream<Arguments>
    provideNames_nameDisplay () {
        return Stream.of(
                Arguments.of(new Person("Douglas", "Yancey", "Funnie"), "Douglas Yancey Funnie"),
                Arguments.of(new Person("Phillip", "Theodore", "Cartman"), "Eric Theodore Cartman"),
                Arguments.of(new Person("Thomas", "", "Pickles"), "Thomas Pickles")
        );
    }

    @DisplayName("seeing full anme prints")
    @ParameterizedTest
    @MethodSource("provideNames_nameDisplay")
    void FullName_pixOfNames_shouldReturnDisplay(Person p, String Name) {
        String name = p.fullName();
        assertEquals(Name, name);
    }

}