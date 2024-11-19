package com.comarch.szkolenia.car.rent.gui;

public interface GUIInterface {
    String showManuAndReadChoose();
    void listCars();
    String askForPlate();
    void showResult(boolean result);
    void showWrongChooseMessage();
}
