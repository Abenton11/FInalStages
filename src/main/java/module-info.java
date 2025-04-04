module com.example.templatemodule2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;
    requires org.apache.servicemix.bundles.poi;
    requires java.mail;

    opens com.example.templatemodule2 to javafx.fxml;
    exports com.example.templatemodule2;

}