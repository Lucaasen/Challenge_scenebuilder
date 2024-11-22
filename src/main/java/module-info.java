module nl._404hhs.hello {
    requires javafx.controls;
    requires javafx.fxml;


    opens nl._404hhs.hello to javafx.fxml;
    exports nl._404hhs.hello;
}