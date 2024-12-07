package Main.Java;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class InventoryController {
    @FXML
    private TableView<Album> tableView;
    @FXML
    private TextField albumNameField, artistField, totalField, availableField;
    private ObservableList<Album> albums;

    public void initialize() {
        albums = FXCollections.observableArrayList();
        tableView.setItems(albums);
    }

    @FXML
    public void addAlbum() {
        try {
            String albumName = albumNameField.getText();
            String artist = artistField.getText();
            int total = Integer.parseInt(totalField.getText());
            albums.add(new Album(albumName, artist, total, total, 0));
            showAlert("Album berhasil ditambahkan!");
        } catch (Exception e) {
            showError("Input tidak valid!");
        }
    }

    @FXML
    public void deleteAlbum() {
        Album selectedAlbum = tableView.getSelectionModel().getSelectedItem();
        if (selectedAlbum != null) {
            albums.remove(selectedAlbum);
            showAlert("Album berhasil dihapus!");
        } else {
            showError("Pilih album terlebih dahulu!");
        }
    }

    @FXML
    public void updateAlbum() {
        try {
            Album selectedAlbum = tableView.getSelectionModel().getSelectedItem();
            if (selectedAlbum != null) {
                selectedAlbum.setAlbumName(albumNameField.getText());
                selectedAlbum.setArtist(artistField.getText());
                selectedAlbum.setTotal(Integer.parseInt(totalField.getText()));
                selectedAlbum.setAvailable(Integer.parseInt(availableField.getText()));
                tableView.refresh();
                showAlert("Album berhasil diubah!");
            }
        } catch (Exception e) {
            showError("Input tidak valid!");
        }
    }

    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText(message);
        alert.show();
    }

    private void showError(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setContentText(message);
        alert.show();
    }
}
