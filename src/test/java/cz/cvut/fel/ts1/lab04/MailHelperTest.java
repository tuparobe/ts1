package cz.cvut.fel.ts1.lab04;

import cz.cvut.fel.ts1.Calculator;
import cz.cvut.fel.ts1.refactoring.MailHelper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MailHelperTest {
    private MailHelper helper;


    @BeforeEach
    public void setup() {
        helper = new MailHelper();
        helper.createAndSendMail("to", "subject", "body");
    }

    @Test
    public void setTo_toIsTo_IsCorrect() {
        assertEquals("to", helper.getMail().getTo());
    }

    @Test
    public void setSubject_subjectIsSubject_IsCorrect() {
        assertEquals("subject", helper.getMail().getSubject());
    }

    @Test
    public void setBody_bodyIsBody_IsCorrect() {
        assertEquals("body", helper.getMail().getBody());
    }

}
