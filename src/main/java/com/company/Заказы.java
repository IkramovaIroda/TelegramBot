package com.company;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

public class Заказы {
    public   String ПОслеЗаказа(SendMessage sendMessage , String text){
        sendMessage.setText("<b>" + "<i>" + text + "</i>" + "</b>");
        sendMessage.setParseMode("HTML");
        String responceText = "<b>" + "<i>" + "Виды пиций " + "</i>" + "</b>  ";
        ReplyKeyboardService keyboardService = new ReplyKeyboardService();
        sendMessage.setReplyMarkup(keyboardService.ПОслеЗаказа());
        return responceText;
    }
}
