package com.company;

import org.checkerframework.checker.units.qual.C;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendLocation;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.*;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboard;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardRemove;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.io.*;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

public class MyTelegramBot extends TelegramLongPollingBot {
   public int level =0;
    @Override
    public String getBotUsername() {
        return "ikramova_iroda_bot";
    }

    @Override
    public String getBotToken() {
        return "5019904507:AAEJx2oDk2D3RRiF-RiNsLwTpxWINkLetZs";
    }

    @Override
    public void onUpdateReceived(Update update) {
        ReplyKeyboardService keyboardService = new ReplyKeyboardService();
        Message message = update.getMessage();
        SendMessage sendMessage = new SendMessage();
        String responceText = "";
        String responceText1 = "";
        System.out.println(update);
        if (update.hasMessage()) {
            User user = message.getFrom();
            sendMessage.setChatId(user.getId().toString());
            String text = message.getText();
            responceText1=text;

//        String [] commands = text.split("/");
//        String command = commands[1];

            if (text.equalsIgnoreCase("/start") ) {
                 sendMessage.setText("<b>" + "<i>" + "<u>" + text + "</u>" + "</i>" + "</b>");
               sendMessage.setParseMode("HTML");
                responceText = "<b>"+" <i>"+" <u>"+"?????????????????????????????? "+" </u>"+" </i>"+" </b> "+ user.getFirstName() + "\n"+"<b>"+" <i> "+"???????????????????????? \n  ???????? ???????????? ???????????? ?????????????????????????????????????????? ???????????? ???????? ???? ?????????????? ????   /menu "+" </i>"+" </b> ";
        //        sendMessage.setParseMode("HTML");
            }
            else if (text.equalsIgnoreCase("????????????????") ) {
                sendMessage.setText("<b>" + "<i>" + text + "</i>" + "</b>");
                sendMessage.setParseMode("HTML");
                responceText = "<b>" + "<i>" + "?????????????? ???????? " + "</i>" + "</b>  ";
                sendMessage.setReplyMarkup(keyboardService.??????????Keyboard());
level=2;
            }
            else  if(text.equalsIgnoreCase("????????????????")){
                String chatId = message.getChatId().toString();
                sendMessage.setChatId(chatId);
                sendMessage.setParseMode("Markdown");
                sendMessage.setText("   ?????????????? ????   *SEND LOCATION*   ?????????? ?????????????????? ?????????????? ");
                ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                replyKeyboardMarkup.setResizeKeyboard(true);
                replyKeyboardMarkup.setSelective(true);
                List<KeyboardRow> rows = new ArrayList<>();
                KeyboardRow keyboardRow = new KeyboardRow();
                KeyboardButton button = new KeyboardButton("SEND LOCATION");
                button.setRequestLocation(true);
                keyboardRow.add(button);
                rows.add(keyboardRow);
                replyKeyboardMarkup.setKeyboard(rows);
                sendMessage.setReplyMarkup(replyKeyboardMarkup);
//

                try {
                    execute(sendMessage);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
//                sendMessage.setText("<b>" + "<i>" + "<u>" + text + "</u>" + "</i>" + "</b>");
//               sendMessage.setParseMode("HTML");
//               responceText = "<b>" + "<i>" + "<u>" + "?????????????? ?????? ?????????? ???????????? " + "</u>" + "</i>" + "</b> " ;
//                ReplyKeyboardRemove replyKeyboardRemove = new ReplyKeyboardRemove();
//                replyKeyboardRemove.setRemoveKeyboard(true);
//                sendMessage.setReplyMarkup(replyKeyboardRemove);
//                try {
//                    execute(sendMessage);
//                } catch (TelegramApiException e) {
//                    e.printStackTrace();
//                }
            }
            else  if (text.equalsIgnoreCase("???????? ??????????")){
                String chatId = message.getChatId().toString();
                SendLocation sendLocation=new SendLocation();
                sendLocation.setChatId(chatId);

                sendLocation.setLatitude(41.3264751);
                sendLocation.setLongitude(69.2284847);
                sendMessage.setText("<b>" + "<i>" + "<u>" + text + "</u>" + "</i>" + "</b>");
                sendMessage.setParseMode("HTML");
                responceText = "<b>" + "<i>" + "<u>" + "?????????????? ?????? ?????????? ???????????? " + "</u>" + "</i>" + "</b> " ;
                ReplyKeyboardRemove replyKeyboardRemove = new ReplyKeyboardRemove();
       replyKeyboardRemove.setRemoveKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardRemove);
                try {
                    execute(sendLocation);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }

            }
            else if (text.equalsIgnoreCase("?????? ????????????") ) {
                sendMessage.setText("<b>" + "<i>" + text + "</i>" + "</b>");
                sendMessage.setParseMode("HTML");
                responceText = "<b>" + "<i>" + "???????? ???????????? " + "</i>" + "</b>  ";

 level=4;
            }
            else if (text.equalsIgnoreCase("?????????????????? ?? ????????????????????") ) {
                sendMessage.setText("<b>" + "<i>" + text + "</i>" + "</b>");
                sendMessage.setParseMode("HTML");
                responceText = "<b>" + "<i>" + "?????????????????? ???? ?????????? ????????????  +998 (99)6168673 " + "</i>" + "</b>  ";
               // sendMessage.setReplyMarkup(menuKeyboard());

            }else  if (text.equalsIgnoreCase("??????????")){
                Menu menu = new Menu();
                responceText=  menu.menu(sendMessage,text);

            }
            else if (text.equalsIgnoreCase("/menu") ) {
              Menu menu = new Menu();
            responceText=  menu.menu(sendMessage,text);
            }
            else if (text.equalsIgnoreCase("???????? ??????????")){
                ???????????? ???????????? = new ????????????();
               responceText=????????????.??????????????????????(sendMessage,text);
            }else if (text.equalsIgnoreCase("??????????, ???????????????????? ??????????????????")){
                String chatId = message.getChatId().toString();

                File file=new File("G:\\java abdumajid\\maven_Iroda_selfStudy\\src\\main\\resources\\rec.jpg");
                SendPhoto sendPhoto=new SendPhoto();

                sendPhoto.setChatId(chatId);
                sendPhoto.setPhoto(new InputFile(file));
                sendPhoto.setCaption("??????????, ???????????????????? ??????????????????    \n 32.000");
                sendMessage.setReplyMarkup(menuKeyboard());
                try {
                    execute(sendPhoto);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }

            }
            else if (text.equalsIgnoreCase("???????????????????????????? ??????????")){
                String chatId = message.getChatId().toString();

                File file=new File("G:\\java abdumajid\\maven_Iroda_selfStudy\\src\\main\\resources\\274px-Pizza_with_tomato,_sun-dried_tomato_and_onion.jpg");
                SendPhoto sendPhoto=new SendPhoto();
                sendPhoto.setChatId(chatId);
                sendPhoto.setPhoto(new InputFile(file));
                sendPhoto.setCaption("???????????????????????????? ??????????   \n 30.000");
                try {
                    execute(sendPhoto);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
            else if (text.equalsIgnoreCase("?????????? ??????????????")){
                String chatId = message.getChatId().toString();

                File file=new File("G:\\java abdumajid\\maven_Iroda_selfStudy\\src\\main\\resources\\?????? ????????????????.jfif");
                SendPhoto sendPhoto=new SendPhoto();
                sendPhoto.setChatId(chatId);
                sendPhoto.setPhoto(new InputFile(file));
                sendPhoto.setCaption("?????????? ??????????????   \n 36.000");
                try {
                    execute(sendPhoto);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
            else if (text.equalsIgnoreCase("?????????? ???????????? ????????????")){
                String chatId = message.getChatId().toString();

                File file=new File("G:\\java abdumajid\\maven_Iroda_selfStudy\\src\\main\\resources\\?????? ????????????????.jfif");
                SendPhoto sendPhoto=new SendPhoto();
                sendPhoto.setChatId(chatId);
                sendPhoto.setPhoto(new InputFile(file));
                sendPhoto.setCaption("?????????? ???????????? ????????????  \n 30.000");
                try {
                    execute(sendPhoto);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
            else if (text.equalsIgnoreCase("???????????? ????????")){
                String chatId = message.getChatId().toString();

                File file=new File("G:\\java abdumajid\\maven_Iroda_selfStudy\\src\\main\\resources\\?????? ???????????????? (2).jfif");
                SendPhoto sendPhoto=new SendPhoto();
                sendPhoto.setChatId(chatId);
                sendPhoto.setPhoto(new InputFile(file));
                sendPhoto.setCaption("???????????? ????????  \n 25.000");
                try {
                    execute(sendPhoto);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
            else if (text.equalsIgnoreCase("?????????? ??????????????????")){
                String chatId = message.getChatId().toString();

                File file=new File("G:\\java abdumajid\\maven_Iroda_selfStudy\\src\\main\\resources\\?????? ???????????????? (3).jfif");
                SendPhoto sendPhoto=new SendPhoto();
                sendPhoto.setChatId(chatId);
                sendPhoto.setPhoto(new InputFile(file));
                sendPhoto.setCaption("?????????? ??????????????????  \n 40.000");
                try {
                    execute(sendPhoto);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
            else if (text.equalsIgnoreCase("?????????? ??????????????????")){
                String chatId = message.getChatId().toString();

                File file=new File("G:\\java abdumajid\\maven_Iroda_selfStudy\\src\\main\\resources\\?????? ???????????????? (4).jfif");
                SendPhoto sendPhoto=new SendPhoto();
                sendPhoto.setChatId(chatId);
                sendPhoto.setPhoto(new InputFile(file));
                sendPhoto.setCaption("?????????? ??????????????????  \n 39.900");
                try {
                    execute(sendPhoto);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
            else if (text.equalsIgnoreCase("???????????????????????????? ??????????")){
                String chatId = message.getChatId().toString();

                File file=new File("G:\\java abdumajid\\maven_Iroda_selfStudy\\src\\main\\resources\\?????? ???????????????? (5).jfif");
                SendPhoto sendPhoto=new SendPhoto();
                sendPhoto.setChatId(chatId);
                sendPhoto.setPhoto(new InputFile(file));
                sendPhoto.setCaption("???????????????????????????? ?????????? \n 23.900");
                try {
                    execute(sendPhoto);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }


            sendMessage.setText(responceText);


        }  else {
            sendMessage.setText("<b>" + "<i>" + "Sorry not found " + "</i>" + "</b>");
        }
        if (update.hasCallbackQuery()) {
            User user = update.getCallbackQuery().getFrom();
            long chatId = user.getId();
            CallbackQuery callbackQuery = update.getCallbackQuery();
            message = callbackQuery.getMessage();
            String text1 = message.getText();
            String command = callbackQuery.getData();
            sendMessage.setChatId(user.getId().toString());
            if (command != null) {
                if (command.startsWith("/????????????")) {
                    moizakazi moizakazi = new moizakazi();
                    try {
                        execute(moizakazi.korzinka(text1));
                    } catch (IOException | TelegramApiException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        sendMessage.setText(responceText);
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    private InlineKeyboardMarkup menuKeyboard() {
        InlineKeyboardButton button1 = InlineButtonUtil.button("K??????????", "/????????????");
        List<List<InlineKeyboardButton>> rowList = InlineButtonUtil.collection(InlineButtonUtil.row(button1));
        return InlineButtonUtil.keyboard(rowList);
    }

}