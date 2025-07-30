package application.models;

import java.text.DecimalFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class SelectionTableModel extends AbstractTableModel {
    List<SelectionModel> selections;
    DecimalFormat df2 = new DecimalFormat("0.000");
    
    public SelectionTableModel(List<SelectionModel> selections) {
        this.selections = selections;
    }

    @Override
    public int getRowCount() {
        return selections.size();
    }
    
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "ID";
            case 1:
                return "Nama Karyawan";
            case 2:
                return "No. HP";
            case 3:
                return "Hasil Penilaian";
            default:
                return null;
        }
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch (column) {
            case 0:
                return selections.get(row).getId();
            case 1:
                return selections.get(row).getName();
            case 2:
                return selections.get(row).getPhoneNumber();
            case 3:
                return df2.format(selections.get(row).getScore());
            default:
                return null;
        }
    }
}