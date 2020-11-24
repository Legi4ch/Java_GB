package sample;

import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField messageInput;

    @FXML
    private ListView<String> listView;
    private final ObservableList<String> wordList = FXCollections.observableArrayList("Привет!","Скоро тут появятся сообщения");

    @FXML
    public void initialize() {
        listView.setItems(wordList);
    }

    @FXML
    public void addMessage() {
        String message = messageInput.getText();
        if (!message.isEmpty()) {
            addMessageToList(message);
        }
    }

    public void addMessageToList(String message) {
            listView.getItems().add(message);
            messageInput.clear();
    }

    @FXML
    public void exit() {
        System.exit(1);
    }

    @FXML
    public void clearMessageList() {
        listView.getItems().clear();

    }

}
