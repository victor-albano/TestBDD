package br.com.Accenture.ProjetoBDD.Utilitarios;



public class ExtraindoDadosExcel {

		public String getMarca () throws Exception {
			ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData , "PrimeiraPag");
			return ExcelUtils.getCellData(0, 1);
		}
		
		public String getModel () throws Exception {
			ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData , "PrimeiraPag");
			return ExcelUtils.getCellData(1, 1);
		}
		
		public String getCylinder () throws Exception {
			ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData , "PrimeiraPag");
			return ExcelUtils.getCellData(2, 1);
		}
		
		public String getEnginePerformance () throws Exception {
			ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData , "PrimeiraPag");
			return ExcelUtils.getCellData(3, 1);
		}
		
		public String getDateOfManufacture () throws Exception {
			ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData , "PrimeiraPag");
			return ExcelUtils.getCellData(4, 1);
		}
		
		public String getNumberOfSeats () throws Exception {
			ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData , "PrimeiraPag");
			return ExcelUtils.getCellData(5, 1);
		}
		
		public String getNumberOfSeats2 () throws Exception {
			ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData , "PrimeiraPag");
			return ExcelUtils.getCellData(6, 1);
		}
		
		public String getFuelType () throws Exception {
			ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData , "PrimeiraPag");
			return ExcelUtils.getCellData(7, 1);
		}
		
		public String getPayload () throws Exception {
			ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData , "PrimeiraPag");
			return ExcelUtils.getCellData(8, 1);
		}
		
		public String getTotalWeight () throws Exception {
			ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData , "PrimeiraPag");
			return ExcelUtils.getCellData(9, 1);
		}
		
		public String getListPrice () throws Exception {
			ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData , "PrimeiraPag");
			return ExcelUtils.getCellData(10, 1);
		}
		
		public String getAnnualMileage () throws Exception {
			ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData , "PrimeiraPag");
			return ExcelUtils.getCellData(11, 1);
		}
		
		public String getName () throws Exception {
			ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData , "SegundaPag");
			return ExcelUtils.getCellData(0, 1);
		}
		
		public String getSobrenome () throws Exception {
			ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData , "SegundaPag");
			return ExcelUtils.getCellData(1, 1);
		}
		
		public String getDataNascimento () throws Exception {
			ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData , "SegundaPag");
			return ExcelUtils.getCellData(2, 1);	
		}
		
		public String getPais () throws Exception {
			ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData , "SegundaPag");
			return ExcelUtils.getCellData(3, 1);
		}
		
		public String getCEP () throws Exception {
			ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData , "SegundaPag");
			return ExcelUtils.getCellData(4, 1);	
		}
		
		public String getOccupation () throws Exception {
			ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData , "SegundaPag");
			return ExcelUtils.getCellData(5, 1);	
		}
		
		public String getStartDate () throws Exception {
			ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData , "TerceiraPag");
			return ExcelUtils.getCellData(0, 1);	
		}
		
		public String getInsuranceSum () throws Exception {
			ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData , "TerceiraPag");
			return ExcelUtils.getCellData(1, 1);	
		}
		
		public String getMeritRating () throws Exception {
			ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData , "TerceiraPag");
			return ExcelUtils.getCellData(2, 1);	
		}
		
		public String getDamageInsurance () throws Exception {
			ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData , "TerceiraPag");
			return ExcelUtils.getCellData(3, 1);	
		}
		
		public String getCourtesyCar () throws Exception {
			ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData , "TerceiraPag");
			return ExcelUtils.getCellData(4, 1);	
		}
		
		public String getEmail () throws Exception {
			ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData , "QuintaPag");
			return ExcelUtils.getCellData(0, 1);	
		}
		
		public String getUsername () throws Exception {
			ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData , "QuintaPag");
			return ExcelUtils.getCellData(1, 1);	
		}
		
		public String getPassword () throws Exception {
			ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData , "QuintaPag");
			return ExcelUtils.getCellData(2, 1);	
		}
}
