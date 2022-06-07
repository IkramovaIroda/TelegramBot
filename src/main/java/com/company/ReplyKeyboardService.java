package com.company;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboard;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

public class ReplyKeyboardService {
    public ReplyKeyboard menuKeyboard() {
        ReplyKeyboardMarkup keyboard = new ReplyKeyboardMarkup();
        keyboard.setResizeKeyboard(true);
        keyboard.setOneTimeKeyboard(false);
        KeyboardRow FirstRow = new KeyboardRow();
        KeyboardRow ovqat = new KeyboardRow();
ovqat.add(new KeyboardButton("Виды пиций"));
        FirstRow.add(new KeyboardButton("Заказать"));

        KeyboardRow secondRow = new KeyboardRow();
        secondRow.add(new KeyboardButton("Мои заказы"));

        KeyboardRow thirtRow = new KeyboardRow();
        secondRow.add(new KeyboardButton("Связаться с оператором"));

        List<KeyboardRow> keyboardRowList = new ArrayList<>();
        keyboardRowList.add(ovqat);
        keyboardRowList.add(secondRow);
        keyboardRowList.add(FirstRow);


        keyboard.setKeyboard(keyboardRowList);

        return keyboard;
    }
    public ReplyKeyboard заказKeyboard (){
        ReplyKeyboardMarkup keyboard = new ReplyKeyboardMarkup();
        keyboard.setResizeKeyboard(true);
        keyboard.setOneTimeKeyboard(false);
        KeyboardRow FirstRow = new KeyboardRow();


        FirstRow.add(new KeyboardButton("Доставка"));

        KeyboardRow secondRow = new KeyboardRow();
        FirstRow.add(new KeyboardButton("Само вызов"));

        secondRow.add(new KeyboardButton("Назад"));

        List<KeyboardRow> keyboardRowList = new ArrayList<>();
        keyboardRowList.add(FirstRow);
        keyboardRowList.add(secondRow);
        keyboard.setKeyboard(keyboardRowList);
        return keyboard;
    }
    public ReplyKeyboard ПОслеЗаказа(){
        ReplyKeyboardMarkup keyboard = new ReplyKeyboardMarkup();
        keyboard.setResizeKeyboard(true);
        keyboard.setOneTimeKeyboard(false);
        KeyboardRow FirstRow = new KeyboardRow();


        FirstRow.add(new KeyboardButton("Пицца, порезанная кусочками"));

        KeyboardRow secondRow = new KeyboardRow();
        FirstRow.add(new KeyboardButton("Неаполитанская пицца"));

        secondRow.add(new KeyboardButton("Пицца Пульезе"));
secondRow.add(new KeyboardButton("Пицца Четыре сезона"));
        KeyboardRow Third = new KeyboardRow();
        Third.add(new KeyboardButton("Четыре Сыра"));
        Third.add(new KeyboardButton("Пицца Капричоза"));
        KeyboardRow Fourth = new KeyboardRow();
        Fourth.add(new KeyboardButton("Пицца Маргарита"));
        Fourth.add(new KeyboardButton("Неаполитанская пицца"));
        KeyboardRow пятый  = new KeyboardRow();
        пятый.add(new KeyboardButton("Назад "));
        List<KeyboardRow> keyboardRowList = new ArrayList<>();
        keyboardRowList.add(FirstRow);
        keyboardRowList.add(secondRow);
        keyboardRowList.add(Third);
keyboardRowList.add(Fourth);
        keyboardRowList.add(пятый);
        keyboard.setKeyboard(keyboardRowList);
        return keyboard;
    }
}
