package ReadExcel1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws Exception {
		File src=new File("/Users/rajive/Desktop/ExcelData.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheetAt(0);
		int rowcount = sheet1.getLastRowNum();
		System.out.println(rowcount+1);
		//using for loop
		for(int i=0;i<rowcount;i++)
		{
			String data0=sheet1.getRow(i).getCell(0).getStringCellValue();
			//System.out.println("total number of row"+data0);
			System.out.println("Data from row"+i+"  is  "+data0);
		}
		wb.close();

	}

}
