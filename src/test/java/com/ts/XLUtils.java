package com.ts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
/*import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;*/
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.codehaus.plexus.util.xml.XmlUtil;
import org.testng.annotations.DataProvider;

public class XLUtils {

	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static XSSFRow row;
	public static XSSFCell cell;
	String xlfile ="/home/rohit.singh/git/repository1/truth_screen/documents/TSAUTOMATIONSAMPLE.xlsx";
	String xlsheet= "NidSample";
	String xlsheet1= "UtilitySample";
	String xlsheet2= "BusinessSample";
	String xlsheet3= "ProfessionalsSample";
	String xlsheet4= "OthersSample";
	String xlsheet5= "OCRSample";
	String xlsheet6= "EmploymentSample";
	String xlsheet7= "BankSample";	
	String xlsheet8= "URLSample";

	public static int getRowCount(String xlfile,String xlsheet) throws IOException 
	{
		fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheet);
		int rowcount=ws.getLastRowNum();
		wb.close();
		fi.close();
		return rowcount;		
	}

	public static int getCellCount(String xlfile,String xlsheet,int rownum) throws IOException
	{
		fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheet);
		row=ws.getRow(rownum);
		int cellcount=row.getLastCellNum();
		wb.close();
		fi.close();
		return cellcount;
	}

	public static String getCellData(String xlfile,String xlsheet,int rownum,int colnum) throws IOException
	{
		fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheet);
		row=ws.getRow(rownum);
		cell=row.getCell(colnum);
		String data;
		try 
		{
			DataFormatter formatter = new DataFormatter();
			String cellData = formatter.formatCellValue(cell);
			return cellData;
		}
		catch (Exception e) 
		{
			data="";
		}
		wb.close();
		fi.close();
		return data;
	}

	public static Object[][] fetchMultipleData( String sheetName, String path ) throws Throwable {
		FileInputStream fisExcel=new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fisExcel);
		org.apache.poi.ss.usermodel.Sheet sh = wb.getSheet(sheetName);
		Object[][] arr=new Object[sh.getLastRowNum()][sh.getRow(0).getLastCellNum()];
		for(int i=0; i<sh.getLastRowNum(); i++)
		{
			for(int j=0; j<sh.getRow(i).getLastCellNum(); j++)
			{
				arr[i][j]=sh.getRow(i+1).getCell(j).getStringCellValue();
			}
		}
		wb.close();
		return arr;
	}
	public static void getMultipleData() {

	}

	public static void setCellData(String xlfile,String xlsheet,int rownum,int colnum,String data) throws IOException
	{
		fi=new FileInputStream(xlfile);
		wb=new 	XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheet);
		row=ws.getRow(rownum);
		cell=row.createCell(colnum);
		cell.setCellValue(data);
		fo=new FileOutputStream(xlfile);
		wb.write(fo);		
		wb.close();
		fi.close();
		fo.close();
	}

	// **********NID Samples ***********//	
	//PAN
	public String Pandata() throws IOException{

		String pansample = XLUtils.getCellData(xlfile, xlsheet, 1, 2);
		return pansample;
	}

	// VOTERID
	public String VoterIddata() throws IOException{

		String voteridsample = XLUtils.getCellData(xlfile, xlsheet, 2, 2);
		return voteridsample;
	}

	//AAdhar Verification	
	public String AAdhardata() throws IOException{

		String aadharsample = XLUtils.getCellData(xlfile, xlsheet, 3, 2);
		return aadharsample;

	}

	//DL Verification	License Number
	public String Dldata() throws IOException{

		String dlsampleno = XLUtils.getCellData(xlfile, xlsheet, 4, 2);
		return dlsampleno;

	}
	//DL Verification	Date of Birth
	public String Dldatadob() throws IOException{

		String dlsampledob = XLUtils.getCellData(xlfile, xlsheet, 4, 3);
		return dlsampledob;		
	}

	//PAN Name 
	public String PanNameSample() throws IOException{

		String pansamplename = XLUtils.getCellData(xlfile, xlsheet, 1, 4);
		return pansamplename;	
	}
	public String PanMobSample() throws IOException{

		String pansamplename = XLUtils.getCellData(xlfile, xlsheet, 1, 5);
		return pansamplename;	
	}

	//PAN DOB
	public String PandobSample() throws IOException{

		String pansampldob = XLUtils.getCellData(xlfile, xlsheet, 1, 3);
		return pansampldob;	
	}
	//EPFO Employer Advance verification company name
	public String EmpAdvaverificationCompanyNameSample() throws IOException {
		String empAdvaVeriCompanyName = XLUtils.getCellData(xlfile, xlsheet, 10, 2);
		return empAdvaVeriCompanyName;
	}
	//EPFO Employer Advance verification employee name
	public String EmpAdvaverificationEmployeeNameSample() throws IOException {
		String empAdvaVeriEmployeeName = XLUtils.getCellData(xlfile, xlsheet, 10, 4);
		return empAdvaVeriEmployeeName;
	}

	//E AAdhar Name
	public String EaadharNameSample() throws IOException{

		String eaadharname = XLUtils.getCellData(xlfile, xlsheet, 5, 4);
		return eaadharname;	
	}
	//E AAdhar Name year of birth
	public String EaadharyobSample() throws IOException{

		String eaadharyob = XLUtils.getCellData(xlfile, xlsheet, 5, 5);
		return eaadharyob;	
	}
	//E AAdhar Name eaadhar pdf
	public String EaadharpdfSample() throws IOException{

		String eaadharpdf = XLUtils.getCellData(xlfile, xlsheet, 5, 6);
		return eaadharpdf;	
	}
	//Passport File
	public String PassportfileSample() throws IOException{

		String fileno = XLUtils.getCellData(xlfile, xlsheet, 6, 2);
		return fileno;	
	}
	//Passport Dob Sample
	public String PassportdobSample() throws IOException{	
		String dob = XLUtils.getCellData(xlfile, xlsheet, 6, 3);
		return dob;
	}
	//Passport Dob Sample
	public String cKycSample() throws IOException{	
		String dob = XLUtils.getCellData(xlfile, xlsheet, 7, 2);
		return dob;
	}
	//Passport Drop Down option

	public String PassportddSample() throws IOException{	
		String dob = XLUtils.getCellData(xlfile, xlsheet, 8, 2);
		return dob;
	}
	
	public String EPandata() throws IOException{
		String Epansample = XLUtils.getCellData(xlfile, xlsheet, 11, 2);
		return Epansample;
	}
	public String PropertytaxNo() throws IOException{
		String Propertytax = XLUtils.getCellData(xlfile, xlsheet, 12, 4);
		return Propertytax;
	}
	
	


	//*************Utility Section Samples***************//

	// Electricity Bill Sample
	public String ElecBillSample() throws IOException{	
		String elecbill = XLUtils.getCellData(xlfile, xlsheet1, 1, 2);
		return elecbill;
	}

	public String Elecdropdownvalue() throws IOException{	
		String elecbill = XLUtils.getCellData(xlfile, xlsheet1, 1, 3);
		return elecbill;
	}


	// Vehicle Registration Sample
	public String VehicleRegSample() throws IOException{

		String VehicleReg = XLUtils.getCellData(xlfile, xlsheet1, 3, 2);
		return VehicleReg;
	}
	// Ration Card Sample
	public String RationCardSample() throws IOException{

		String RationCard = XLUtils.getCellData(xlfile, xlsheet1, 4, 2);
		return RationCard;
	}

	public String RationStateSample() throws IOException{

		String RationCard = XLUtils.getCellData(xlfile, xlsheet1, 4, 3);
		return RationCard;
	}
	//RC Sample
	public String RCSample() throws IOException{

		String RC = XLUtils.getCellData(xlfile, xlsheet1, 5, 2);
		return RC;
	}

	//Stolen Vehicle Sample
	public String StolenVehicleample() throws IOException{

		String RC = XLUtils.getCellData(xlfile, xlsheet1, 6, 2);
		return RC;
	}


	//****************Business Section Sample****************//
	//Din Name
	public String DinnameSample() throws IOException{	
		String din = XLUtils.getCellData(xlfile, xlsheet2, 1, 3);
		return din;
	}
	//Din Number
	public String DinnoSample() throws IOException{	
		String din = XLUtils.getCellData(xlfile, xlsheet2, 1, 2);
		return din;
	}
	//Cin
	public String CinSample() throws IOException{	
		String cin = XLUtils.getCellData(xlfile, xlsheet2, 2, 2);
		return cin;
	}
	//Tin
	public String TinSample() throws IOException{	
		String tin = XLUtils.getCellData(xlfile, xlsheet2, 3, 2);
		return tin;
	}
	//Service Tax
	public String ServiceTaxSample() throws IOException{	
		String STax = XLUtils.getCellData(xlfile, xlsheet2, 4, 2);
		return STax;
	}
	// Shop n Establishment
	public String ShopSample() throws IOException{	
		String Shopnest = XLUtils.getCellData(xlfile, xlsheet2, 5, 2);
		return Shopnest;
	}
	//Drug License 
	public String DrugSample() throws IOException{	
		String DS = XLUtils.getCellData(xlfile, xlsheet2, 6, 2);
		return DS;
	}

	public String DrugdropdownSample() throws IOException{	
		String DS = XLUtils.getCellData(xlfile, xlsheet2, 6, 3);
		return DS;
	}

	//Udyog Adhaar
	public String UdyogAdhaarSample() throws IOException{	
		String UAS = XLUtils.getCellData(xlfile, xlsheet2, 7, 2);
		return UAS;
	}

	//PAN Director
	public String PANdirectorSample() throws IOException{	
		String pds = XLUtils.getCellData(xlfile, xlsheet2, 8, 2);
		return pds;
	}

	//ESIC
	public String ESICSample() throws IOException{	
		String pds = XLUtils.getCellData(xlfile, xlsheet2, 9, 2);
		return pds;
	}

	//IEC
	public String IECSample() throws IOException{	
		String pds = XLUtils.getCellData(xlfile, xlsheet2, 10, 2);
		return pds;
	}

	//GSTIN
	public String GSTSample() throws IOException{	
		String pds = XLUtils.getCellData(xlfile, xlsheet2, 11, 2);
		return pds;
	}
	//Industry Type
	public String IndtypeSample() throws IOException{	
		String pds = XLUtils.getCellData(xlfile, xlsheet2, 12, 2);
		return pds;
	}

	//PAN_GST
	public String PAN_GSTSample() throws IOException{	
		String pds = XLUtils.getCellData(xlfile, xlsheet2, 13, 2);
		return pds;
	}

	//Company_Search
	public String CompanySearchSample() throws IOException{	
		String pds = XLUtils.getCellData(xlfile, xlsheet2, 14, 2);
		return pds;
	}

	//Know Your GSTIN using PAN
	public String GSTINPANSample() throws IOException{	
		String pds = XLUtils.getCellData(xlfile, xlsheet2, 15, 2);
		return pds;
	}

	//Know Your GSTIN verification
	public String GSTIverificationSample() throws IOException
	{	String pds = XLUtils.getCellData(xlfile, xlsheet2, 16, 2);
	return pds;
	}

	//Know Your GST Return verification no.
	public String GSTReturnverificationSample() throws IOException
	{	String pds = XLUtils.getCellData(xlfile, xlsheet2, 17, 2);
	return pds;
	}

	//Know Your GST Return verificaion Username
	public String GSTReturnverificationusernameSample() throws IOException
	{	String pds = XLUtils.getCellData(xlfile, xlsheet2, 17, 3);
	return pds;
	}

	//Udyam Verification
	public String udyamVerificationSample() throws IOException
	{	String pds = XLUtils.getCellData(xlfile, xlsheet2, 23, 2);
	return pds;
	}

	//udyog verification using phone sample
	public String uamSample() throws IOException
	{	String pds = XLUtils.getCellData(xlfile, xlsheet2, 24, 2);
	return pds;
	}
	//udyog verification using phone sample
	public String uamRelatedPhoneSample() throws IOException
	{	String pds = XLUtils.getCellData(xlfile, xlsheet2, 24, 3);
	return pds;
	}

	//GST TRACK And Return sample
	public String gstSample() throws IOException {
		String pds = XLUtils.getCellData(xlfile, xlsheet2, 25, 2);
		return pds;
	}

	public String financialYear() throws IOException {
		String pds = XLUtils.getCellData(xlfile, xlsheet2, 25, 3);
		return pds;
	}

	//Know Your ESIC Employer Verification
	public String EsicEmplSample() throws IOException
	{	String pds = XLUtils.getCellData(xlfile, xlsheet2, 18, 2);
	return pds;
	}

	public String EsicstateSample() throws IOException
	{	String pds = XLUtils.getCellData(xlfile, xlsheet2, 18, 3);
	return pds;
	}

	public String EsicdisttSample() throws IOException
	{	String pds = XLUtils.getCellData(xlfile, xlsheet2, 18, 4);
	return pds;
	}

	//Credit Rating 
	public String CreditRatingSample() throws IOException
	{	String pds = XLUtils.getCellData(xlfile, xlsheet2, 19, 2);
	return pds;
	}

	//FSSAI 
	public String FssaiSample() throws IOException
	{	String pds = XLUtils.getCellData(xlfile, xlsheet2, 20, 2);
	System.out.println(pds);
	return pds;
	}

	//STV Ulb No
	public String STVulbSample() throws IOException
	{	String pds = XLUtils.getCellData(xlfile, xlsheet2, 21, 2);
	return pds;
	}

	//STV Name of the Street Vendor
	public String STVnameSample() throws IOException
	{	String pds = XLUtils.getCellData(xlfile, xlsheet2, 21, 3);
	return pds;
	}

	//STV father's Name of the Street Vendor
	public String STVfathernameSample() throws IOException
	{	String pds = XLUtils.getCellData(xlfile, xlsheet2, 21, 4);
	return pds;
	}

	//STV Mobile No
	public String STVmobilenoSample() throws IOException
	{	String pds = XLUtils.getCellData(xlfile, xlsheet2, 21, 5);
	return pds;
	}

	//STV Mobile No
	public String STVstateSample() throws IOException
	{	String pds = XLUtils.getCellData(xlfile, xlsheet2, 21, 6);
	return pds;
	}

	//Comprehensive CGST 
	public String CGSTSample() throws IOException
	{	String pds = XLUtils.getCellData(xlfile, xlsheet2, 22, 2);
	return pds;
	}
	public String GSTBasisPANSample() throws IOException{	
		String pds = XLUtils.getCellData(xlfile, xlsheet2, 26, 2);
		return pds;
	}


	//*****************Professional Section Sample***********//

	// Insurance Agent 
	public String IASample() throws IOException
	{	String pds = XLUtils.getCellData(xlfile, xlsheet3, 1, 2);
	return pds;
	}
	//NUID Nurse Verification
	public String NuidSample() throws IOException {
		String nuidsamplenumber = XLUtils.getCellData(xlfile, xlsheet, 9, 2);
		return nuidsamplenumber;
	}
	//CA verification
	public String CASample() throws IOException	{
		String pds = XLUtils.getCellData(xlfile, xlsheet3, 2,2 );
		return pds;
	}

	//Doctor verification

	public String DocstateSample() throws IOException
	{	String pds = XLUtils.getCellData(xlfile, xlsheet3,3,4);
	return pds;
	}

	public String DocSample() throws IOException
	{	String pds = XLUtils.getCellData(xlfile, xlsheet3,3,2 );
	return pds;
	}

	//Dentist  verification

	public String DenstateSample() throws IOException
	{	String pds = XLUtils.getCellData(xlfile, xlsheet3,4,4 );
	return pds;
	}

	public String DenSample() throws IOException
	{	String pds = XLUtils.getCellData(xlfile, xlsheet3,4,2 );
	return pds;
	}

	//ICSI verification
	public String ICSISample() throws IOException
	{	String pds = XLUtils.getCellData(xlfile, xlsheet3,5,2 );
	return pds;
	}

	//ICWAI verification
	public String ICWAISample() throws IOException
	{	String pds = XLUtils.getCellData(xlfile, xlsheet3,6,2 );
	return pds;
	}


	//ICWAI  Name verification
	public String ICWAInameSamp() throws IOException
	{	String pds = XLUtils.getCellData(xlfile, xlsheet3,6,3 );
	return pds;
	}

	//*******Others************//

	public String PhnSample() throws IOException
	{	String pds = XLUtils.getCellData(xlfile, xlsheet4,1,2 );
	return pds;
	}

	public String EmailSample() throws IOException
	{	String pds = XLUtils.getCellData(xlfile, xlsheet4,2,2 );
	return pds;
	}

	public String NameSample1() throws IOException
	{	String pds = XLUtils.getCellData(xlfile, xlsheet4,3,2 );
	return pds;
	}

	public String NameSample2() throws IOException
	{	String pds = XLUtils.getCellData(xlfile, xlsheet4,4,2 );
	return pds;
	}

	public String FacefrontSample() throws IOException
	{	String pds = XLUtils.getCellData(xlfile, xlsheet4,6,2 );
	return pds;
	}

	public String FacebackSample() throws IOException
	{	String pds = XLUtils.getCellData(xlfile, xlsheet4,5,2 );
	return pds;
	}

	public String MailSample() throws IOException
	{	String pds = XLUtils.getCellData(xlfile, xlsheet4,7,2 );
	return pds;
	}


	public String CourtNameSample() throws IOException
	{	String pds = XLUtils.getCellData(xlfile, xlsheet4,8,2 );
	return pds;
	}
	
	public String LivenessSample() throws IOException {
		String pds = XLUtils.getCellData(xlfile, xlsheet4,9,2);
		return pds;
	}

	public String AdvNameAddMatchFirstNameSample() throws IOException {
		String pds = XLUtils.getCellData(xlfile, xlsheet4,10,2);
		return pds;
	}

	public String AdvNameAddMatchSecondNameSample() throws IOException {
		String pds = XLUtils.getCellData(xlfile, xlsheet4,10,3);
		return pds;
	}
	public String cowinLinkGenSample() throws IOException {
		String pds = XLUtils.getCellData(xlfile, xlsheet4,11,2);
		return pds;
	}
	public String PEPsample() throws IOException{
		String pds = XLUtils.getCellData(xlfile, xlsheet4,12,2 );
		return pds;
	}
	public String ComprehensiveEmailsample() throws IOException
	{	String pds = XLUtils.getCellData(xlfile, xlsheet4,13,2 );
	return pds;
	}
	
	public String CourtAddressSample() throws IOException
	{	String pds = XLUtils.getCellData(xlfile, xlsheet4,8,3);
	return pds;
	}
	
	public String LitigationCheckSample() throws IOException
	{	String pds = XLUtils.getCellData(xlfile, xlsheet4,16,2);
	return pds;
	}
	//Employment Check EPFO
	public String OfficialEmailIDsample() throws IOException {
		String pds = XLUtils.getCellData(xlfile, xlsheet4,14,2 );
		return pds;
	}
	public String EmployeeNamesample() throws IOException {
		String pds = XLUtils.getCellData(xlfile, xlsheet4,14,3 );
		return pds;
	}
	public String EmployerName() throws IOException {
		String pds = XLUtils.getCellData(xlfile, xlsheet4,14,4 );
		return pds;
	}
	public String DomainName() throws IOException {
		String pds = XLUtils.getCellData(xlfile, xlsheet4,15,2 );
		return pds;
	}

	//*************OCR********************//

	public String Aadhaocr1Sample() throws IOException
	{	String pds = XLUtils.getCellData(xlfile, xlsheet5,1,2 );
	return pds;
	}

	public String Aadhaocr2Sample() throws IOException
	{	String pds = XLUtils.getCellData(xlfile, xlsheet5,2,2 );
	return pds;
	}

	public String Panocr1Sample() throws IOException
	{	String pds = XLUtils.getCellData(xlfile, xlsheet5,3,2 );
	return pds;
	}

	public String Panocr2Sample() throws IOException
	{	String pds = XLUtils.getCellData(xlfile, xlsheet5,4,2 );
	return pds;
	}

	public String dlocr1Sample() throws IOException
	{	String pds = XLUtils.getCellData(xlfile, xlsheet5,5,2 );
	return pds;
	}

	public String dlocr2Sample() throws IOException
	{	String pds = XLUtils.getCellData(xlfile, xlsheet5,6,2 );
	return pds;
	}

	public String voteridocr1Sample() throws IOException
	{	String pds = XLUtils.getCellData(xlfile, xlsheet5,7,2 );
	return pds;
	}

	public String voteridocr2Sample() throws IOException
	{	String pds = XLUtils.getCellData(xlfile, xlsheet5,8,2 );
	return pds;
	}

	public String Passportocr1Sample() throws IOException
	{	String pds = XLUtils.getCellData(xlfile, xlsheet5,9,2 );
	return pds;
	}

	public String Passportocr2Sample() throws IOException
	{	String pds = XLUtils.getCellData(xlfile, xlsheet5,10,2 );
	return pds;
	}

	public String ChequeOcrSample() throws IOException {
		String pds = XLUtils.getCellData(xlfile, xlsheet5,11,2 );
		return pds;
	}

	//**************Employment****************//

	public String SalarynameSample() throws IOException
	{	String pds = XLUtils.getCellData(xlfile, xlsheet6, 1,2 );
	return pds;
	}

	public String SalarymailidSample() throws IOException
	{	String pds = XLUtils.getCellData(xlfile, xlsheet6, 2,2 );
	return pds;
	}

	public String SalaryphnnoSample() throws IOException
	{	String pds = XLUtils.getCellData(xlfile, xlsheet6, 3,2 );
	return pds;
	}

	public String uanoSample() throws IOException
	{	String pds = XLUtils.getCellData(xlfile, xlsheet6, 4,2 );
	return pds;
	}

	public String uanpassSample() throws IOException
	{	String pds = XLUtils.getCellData(xlfile, xlsheet6, 5,2 );
	return pds;
	}

	public String itrnameSample() throws IOException
	{	String pds = XLUtils.getCellData(xlfile, xlsheet6, 6,2 );
	return pds;
	}

	public String itrmailidSample() throws IOException
	{	String pds = XLUtils.getCellData(xlfile, xlsheet6, 6,3 );
	return pds;
	}

	public String itrphnnoSample() throws IOException
	{	String pds = XLUtils.getCellData(xlfile, xlsheet6, 6,4);
	return pds;
	}

	public String itrpannoSample() throws IOException
	{	String pds = XLUtils.getCellData(xlfile, xlsheet6, 6,5);
	return pds;
	}

	public String itrdobSample() throws IOException
	{	String pds = XLUtils.getCellData(xlfile, xlsheet6, 6,6);
	return pds;
	}

	public String From16Sample() throws IOException
	{	String pds = XLUtils.getCellData(xlfile, xlsheet6, 7,2);
	return pds;
	}

	public String PANnoSample() throws IOException
	{	String pds = XLUtils.getCellData(xlfile, xlsheet6, 8,2);
	return pds;
	}

	public String TANnoSample() throws IOException
	{	String pds = XLUtils.getCellData(xlfile, xlsheet6, 8,3);
	return pds;
	}

	public String StartdateSample() throws IOException
	{	String pds = XLUtils.getCellData(xlfile, xlsheet6, 8,4);
	return pds;
	}

	public String EnddateSample() throws IOException
	{	String pds = XLUtils.getCellData(xlfile, xlsheet6, 8,5);
	return pds;
	}

	public String itrtanSample() throws IOException
	{	String pds = XLUtils.getCellData(xlfile, xlsheet6, 9,2);
	return pds;
	}

	public String itrtanfromSample() throws IOException
	{	String pds = XLUtils.getCellData(xlfile, xlsheet6, 9,3);
	return pds;
	}

	public String itrtantoSample() throws IOException
	{	String pds = XLUtils.getCellData(xlfile, xlsheet6, 9,4);
	return pds;
	}

	public String itrstatusnoSample() throws IOException
	{	String pds = XLUtils.getCellData(xlfile, xlsheet6, 10,2);
	return pds;
	}

	public String itrstatusacknoSample() throws IOException
	{	String pds = XLUtils.getCellData(xlfile, xlsheet6, 10,3);
	return pds;
	}
	//	public String itrstatusMobSample() throws IOException
	//	{	String pds = XLUtils.getCellData(xlfile, xlsheet6, 10,4);
	//	return pds;
	//	}

	public String epfoCompanyNameSample() throws IOException {
		String pds = XLUtils.getCellData(xlfile, xlsheet6, 11,2);
		return pds;
	}

	public String epfoPersonNameSample() throws IOException {
		String pds = XLUtils.getCellData(xlfile, xlsheet6, 11,3);
		return pds;
	}
	public String epfoEmployerNameSample() throws IOException {
		String pds = XLUtils.getCellData(xlfile, xlsheet6, 12,2);
		return pds;
	}
	public String epfoEmployeeCompanyNameSample() throws IOException {
		String pds = XLUtils.getCellData(xlfile, xlsheet6, 13,2);
		return pds;
	}
	public String epfoEmployeeNameSample() throws IOException {
		String pds = XLUtils.getCellData(xlfile, xlsheet6, 13,3);
		return pds;
	}
	public String epfoEmployeeDOJSample() throws IOException {
		String pds = XLUtils.getCellData(xlfile, xlsheet6, 13,4);
		return pds;
	}
	public String EmployerDefaultCheckEstablishmentIdSample() throws IOException {
		String pds = XLUtils.getCellData(xlfile, xlsheet6, 14,2);
		return pds;
	}
	public String EmployerDefaultCheckFromDate() throws IOException {
		String pds = XLUtils.getCellData(xlfile, xlsheet6, 14,3);
		return pds;
	}
	public String EmployerDefaultCheckToDate() throws IOException {
		String pds = XLUtils.getCellData(xlfile, xlsheet6, 14,4);
		return pds;
	}
	public String BgvEmployeeNameSample() throws IOException {
		String pds = XLUtils.getCellData(xlfile, xlsheet6, 15,2);
		return pds;
	}
	public String BgvEmployeeMobNum() throws IOException {
		String pds = XLUtils.getCellData(xlfile, xlsheet6, 15,3);
		return pds;
	}
	public String BgvEmployeeDOB() throws IOException {
		String pds = XLUtils.getCellData(xlfile, xlsheet6, 15,4);
		return pds;
	}
	//Dual Employer check
	public String DualEmployercheckUANSample() throws IOException {
		String pds = XLUtils.getCellData(xlfile, xlsheet6, 16,2);
		return pds;
	}
	public String DualEmployercheckEmployerSample() throws IOException {
		String pds = XLUtils.getCellData(xlfile, xlsheet6, 16,3);
		return pds;
	}
	public String NegativeDueDiligenceSample() throws IOException
	{	String pds = XLUtils.getCellData(xlfile, xlsheet6, 17,2 );
	return pds;
	}

	//***************Bank**********************//

	public String IFSCCodeSample() throws IOException
	{	String pds = XLUtils.getCellData(xlfile, xlsheet7, 1,2);
	return pds;
	}

	public String BankStatementSample() throws IOException
	{	String pds = XLUtils.getCellData(xlfile, xlsheet7, 2,2);
	return pds;
	}

	public String candidateName() throws IOException
	{	String pds = XLUtils.getCellData(xlfile, xlsheet7, 3,2);
	return pds;
	}

	public String candidateEmail() throws IOException
	{	String pds = XLUtils.getCellData(xlfile, xlsheet7, 3,3);
	return pds;
	}

	public String bankName() throws IOException
	{	String pds = XLUtils.getCellData(xlfile, xlsheet7, 3,4);
	return pds;
	}
	public String ifscAddress() throws IOException {
		String pds = XLUtils.getCellData(xlfile, xlsheet7, 4,2);
		return pds;
	}
	public String BankAccountSample() throws IOException {
		String pds = XLUtils.getCellData(xlfile, xlsheet7, 5,2);
		return pds;
	}
	public String BankIfscCodeSample() throws IOException {
		String pds = XLUtils.getCellData(xlfile, xlsheet7, 5,3);
		return pds;
	}
	//***************URL**********************//

	@DataProvider(name = "test-data")
	public Object[] dataProvFunc(){
		//ArrayList<String> list=new ArrayList<String>();

		int i=0;
		Object[] obj = null;
		try {
			fi = new FileInputStream(
					new File("xlsfile1"));
			HSSFWorkbook workbook = new HSSFWorkbook(fi);
			HSSFSheet sheet = workbook.getSheetAt(0);
			Iterator<Row> rowIterator = sheet.iterator();
			obj=new Object[(sheet.getLastRowNum()+1)];
			while (rowIterator.hasNext()) {
				Row row = rowIterator.next();
				Iterator<Cell> cellIterator
				= row.cellIterator();
				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();
					obj[i]=cell.getStringCellValue();
					i++;
				}
			}
			fi.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return obj;
	}

}
