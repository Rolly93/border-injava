package com.track;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.io.IOException;
import javafx.scene.control.cell.PropertyValueFactory;;
import javafx.collections.*;
import javafx.collections.ObservableList;


public class Border_Crossing {
@FXML
private TableView<Shipment> tableView;
//#region Predefiniendo columnas para manipulacion
@FXML
private TableColumn <Shipment , String> Referencia;
@FXML
private TableColumn <Shipment , String> Cliente;
@FXML
private TableColumn <Shipment , String> TipoVehiculo;
@FXML
private TableColumn <Shipment , String> numVehiculo;
@FXML
private TableColumn <Shipment , String> ESTATUS;
@FXML
private TableColumn <Shipment , String> scac;
@FXML
private TableColumn <Shipment , String> TodFecha;
@FXML
private TableColumn <Shipment , String> TodHora;
@FXML
private TableColumn <Shipment , String> tnfFecha;
@FXML
private TableColumn <Shipment , String> tnfHora;
@FXML
private TableColumn <Shipment , String> dxsFecha;
@FXML
private TableColumn <Shipment , String> dxsHora;
@FXML
private TableColumn <Shipment , String> dlyFecha;
@FXML
private TableColumn <Shipment , String> dlyTiempo;
@FXML
private TableColumn <Shipment , String> dlyTipo;
@FXML
private TableColumn <Shipment , String> afsFecha;
@FXML
private TableColumn <Shipment , String> afsTiempo;
@FXML
private TableColumn <Shipment , String> dpuFecha;
@FXML
private TableColumn <Shipment , String> dpuTiempo;
@FXML
private TableColumn <Shipment , String> exrFecha;
@FXML
private TableColumn <Shipment , String> exrHora;
@FXML
private TableColumn <Shipment , String> exrNotas;
@FXML
private TableColumn <Shipment , String> eccFecha;
@FXML
private TableColumn <Shipment , String> eccTiempo;
@FXML
private TableColumn <Shipment , String> ilrFecha;
@FXML
private TableColumn <Shipment , String> ilrTiempo;
@FXML
private TableColumn <Shipment , String> ilrtipo;
@FXML
private TableColumn <Shipment , String> iltNotas;
@FXML
private TableColumn <Shipment , String> clrFecha;
@FXML
private TableColumn <Shipment , String> clrTiempo;
@FXML
private TableColumn <Shipment , String> st1Fecha;
@FXML
private TableColumn <Shipment , String> st1Tiempo;
@FXML
private TableColumn <Shipment , String> st1Notas;
@FXML
private TableColumn <Shipment , String> tscFecha;
@FXML
private TableColumn <Shipment , String> tscTiempo;
@FXML
private TableColumn <Shipment , String> tscNotas;
//#endregion



@FXML
    private void switchToSecondary() throws IOException {   
            initialize();
        App.setRoot("secondary");
    }
    @FXML
    private void initialize(){
        //#region headers
        Referencia.setCellValueFactory(new PropertyValueFactory <>("referencia"));
        Cliente.setCellValueFactory(new PropertyValueFactory <>("cliente"));
        TipoVehiculo.setCellValueFactory(new PropertyValueFactory <>("tipoVehiculo"));
        numVehiculo.setCellValueFactory(new PropertyValueFactory <>("numVehiculo"));
        ESTATUS.setCellValueFactory(new PropertyValueFactory <>("estatus"));
        scac.setCellValueFactory(new PropertyValueFactory <>("scac"));
        TodFecha.setCellValueFactory(new PropertyValueFactory <>("todFecha"));
        TodHora.setCellValueFactory(new PropertyValueFactory <>("todTiempo"));
        tnfFecha.setCellValueFactory(new PropertyValueFactory <>("tnfFecha"));
        tnfHora.setCellValueFactory(new PropertyValueFactory <>("tnfTiempo"));
        dxsFecha.setCellValueFactory(new PropertyValueFactory <>("dxsFecha"));
        dxsHora.setCellValueFactory(new PropertyValueFactory <>("dxsTiempo"));
        dlyFecha.setCellValueFactory(new PropertyValueFactory <>("dlyFecha"));
        dlyTiempo.setCellValueFactory(new PropertyValueFactory <>("dlyTiempo"));
        dlyTipo.setCellValueFactory(new PropertyValueFactory <>("dlyTipo"));
        afsFecha.setCellValueFactory(new PropertyValueFactory <>("afsFecha"));
        afsTiempo.setCellValueFactory(new PropertyValueFactory <>("afsTiempo"));
        dpuFecha.setCellValueFactory(new PropertyValueFactory <>("dpuFecha"));
        dpuTiempo.setCellValueFactory(new PropertyValueFactory <>("dpuTiempo"));
        exrFecha.setCellValueFactory(new PropertyValueFactory <>("exrFecha"));
        exrHora.setCellValueFactory(new PropertyValueFactory <>("exrHora"));
        exrNotas.setCellValueFactory(new PropertyValueFactory <>("exrNotas"));
        eccFecha.setCellValueFactory(new PropertyValueFactory <>("eccFecha"));
        eccTiempo.setCellValueFactory(new PropertyValueFactory <>("eccTiempo"));
        ilrFecha.setCellValueFactory(new PropertyValueFactory <>("ilrFecha"));
        ilrTiempo.setCellValueFactory(new PropertyValueFactory <>("ilrTiempo"));
        ilrtipo.setCellValueFactory(new PropertyValueFactory <>("ilrTipo"));
        iltNotas.setCellValueFactory(new PropertyValueFactory <>("iltNotas"));
        clrFecha.setCellValueFactory(new PropertyValueFactory <>("clrFecha"));
        clrTiempo.setCellValueFactory(new PropertyValueFactory <>("clrTiempo"));
        st1Fecha.setCellValueFactory(new PropertyValueFactory <>("st1Fecha"));
        st1Tiempo.setCellValueFactory(new PropertyValueFactory <>("st1Tiempo"));
        st1Notas.setCellValueFactory(new PropertyValueFactory <>("st1Notas"));
        tscFecha.setCellValueFactory(new PropertyValueFactory <>("tscFecha"));
        tscTiempo.setCellValueFactory(new PropertyValueFactory <>("tscTiempo"));
        tscNotas.setCellValueFactory(new PropertyValueFactory <>("tscNotas"));
       //#endregion
        ObservableList<Shipment> data = 
        tableView.setItems(data);


    }

}
