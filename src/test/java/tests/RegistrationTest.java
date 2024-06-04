package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.RegistrationPage;
import static io.qameta.allure.Allure.step;


public class RegistrationTest extends TestBase {

    private final RegistrationPage registrationPage = new RegistrationPage();

    @DisplayName("Проверка заполнения и отправки всех полей формы")
    @Test
    void allFormFieldsTest() {

        step("Открываем главную страницу", () -> {
            registrationPage.openPage();
        });
        step("Удаляем баннеры со страницы", () -> {
            registrationPage.removeBanners();
        });
        step("Заполняем поле First Name", () -> {
            registrationPage.setFistNameInput("Yana");
        });
        step("Заполняем поле Last Name", () -> {
            registrationPage.setLastNameInput("Avvakumova");
        });
        step("Заполняем поле Email", () -> {
            registrationPage.setUserEmailInput("test@mail.ru");
        });
        step("Заполняем поле Gender", () -> {
            registrationPage.setGenderInput("Female");
        });
        step("Заполняем поле Mobile(", () -> {
            registrationPage.setNumberInput("7987654321");
        });
        step("Заполняем поле Date of Birth", () -> {
            registrationPage.setDate("1993", "6", "10");
        });
        step("Заполняем поле Subjects", () -> {
            registrationPage.setSubjects("Maths");
        });
        step("Заполняем поле Hobbies", () -> {
            registrationPage.setHobbies("Reading");
        });
        step("Загружаем изображение в раздел Picture", () -> {
            registrationPage.setPicture("TestHW3.png");
        });
        step("Заполняем поле Current Address", () -> {
            registrationPage.setAddress("Test address");
        });
        step("Заполняем поле State в разделе State and City", () -> {
            registrationPage.setState("NCR");
        });
        step("Заполняем поле City в разделе State and City", () -> {
            registrationPage.setCity("Noida");
        });
        step("Нажимаем кнопку Submit", () -> {
            registrationPage.clickSubmit();
        });
        step("Проверяем таблицу с отправленными значениями", () -> {
            registrationPage.checkTable("Yana Avvakumova", "test@mail.ru",
                    "Female", "7987654321",
                    "10 July,1993", "Maths",
                    "Reading", "TestHW3.png",
                    "Test address", "NCR Noida");
        });
    }
}