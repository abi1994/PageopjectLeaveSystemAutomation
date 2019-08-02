package com.abi.automation.TestData.LeaveType;

import com.abi.automation.Utils.ExcelDataConfig;
import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;

public class AddLeaveType extends ExcelDataConfig {
    private static final Logger LOGGER = Logger.getLogger(AddLeaveType.class);
    public AddLeaveType() {super
            ("src\\test\\resources\\ExcelSheet\\LeaveType.xlsx");

    }
    @DataProvider(name = "AddLeaveType")
    public Object[][] AddLeaveType() {

        int rows = getRowCount("AddLeaveType");
        int col = getColumnCount("AddLeaveType");

        LOGGER.info("row = "+ rows + " columns = "+ col);

        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i - 1][j] = getData("AddLeaveType", i, j);
            }
        }
        return data;
    }
}
