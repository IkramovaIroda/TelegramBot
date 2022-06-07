package com.company;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

public class Menu {
    public  String menu (SendMessage sendMessage, String text ){
        sendMessage.setText("<b>" + "<i>" + text + "</i>" + "</b>");
        sendMessage.setParseMode("HTML");
       String responceText = "<b>" + "<i>" + "Главное меню " + "</i>" + "</b>  ";
        ReplyKeyboardService keyboardService = new ReplyKeyboardService();
        sendMessage.setReplyMarkup(keyboardService.menuKeyboard());
        return responceText;
    }
}
