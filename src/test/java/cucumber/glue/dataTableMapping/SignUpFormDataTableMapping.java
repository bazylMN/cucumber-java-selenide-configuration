package cucumber.glue.dataTableMapping;

import io.cucumber.datatable.DataTable;

import java.util.Map;

public class SignUpFormDataTableMapping {

    private Map<String, String> dataMap;

    public Map get(){
        return dataMap;
    }

    public Map writeDataToMap(DataTable data){
        dataMap = data.asMap(String.class, String.class);
        return dataMap;
    }
}
