package io.loop.utilities;

public class TestExcel {
    public static void main(String[] args) {


        ExcelUtils excelUtils = new ExcelUtils("C:\\Users\\Admin\\IdeaProjects\\cucumber-project-b4\\src\\test\\resources\\TestExcell.xlsx", "Sheet1");

        System.out.println("excelUtils.getCellData(0,0) = " + excelUtils.getCellData(0, 0));

        excelUtils.setCellData("Nadir",3,4);
    }
}