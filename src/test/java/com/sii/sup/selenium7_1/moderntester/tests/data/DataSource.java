package com.sii.sup.selenium7_1.moderntester.tests.data;

import com.sii.sup.selenium7_1.moderntester.utils.Helper;
import com.sii.sup.selenium7_1.moderntester.pageobject.Gender;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class DataSource {

    public static Stream<Arguments> formTestDataSource() {
        return Stream.of(
                Arguments.of(
                        "Michal", "Nazwany", 23, "jegomail@gmail.pl", Gender.Male, Helper.getRandomString(12), true)
        );
    }
}
