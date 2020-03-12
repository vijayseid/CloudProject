package com.eureka.server.model.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eureka.server.model.CustomerDetails;
import com.eureka.server.model.repo.CustomerDetailsRepo;

@Service
public class CSVFileService {

	
	@Autowired
	CustomerDetailsRepo customerDetailsRepo;
	
	public String savecsv() throws IOException {
		
		@SuppressWarnings("resource")
		BufferedReader bufferedReader=new BufferedReader(new FileReader("src/main/resources/CustomerDetails.csv"));
		String line="";
		while((line=bufferedReader.readLine())!=null) 
		{
			String csvData[]=line.split(",");
			CustomerDetails customerDetails=new CustomerDetails();
			
			customerDetails.setCity(csvData[0]);
			customerDetails.setName(csvData[1]);
			customerDetails.setNumber(csvData[2]);
			
			
			for(int i=0;i<=2;i++)
			{
				System.out.println(csvData[i]);
				
			}
			
			customerDetailsRepo.save(customerDetails);
			
		}
		return "CSVFileSaved";

	}

	public String saveparser() throws FileNotFoundException, IOException {
		
		String CSV_FILE_PATH="src/main/resources/CustomerDetails2.csv";
		
		Reader reader = Files.newBufferedReader(Paths.get(CSV_FILE_PATH));
		
		@SuppressWarnings("resource")
		CSVParser csvParser=new CSVParser(reader, CSVFormat.EXCEL.withFirstRecordAsHeader().withTrim());
		
		
		for(CSVRecord csvRecord: csvParser) 
		{			
			//System.out.println(csvRecord);

			for(int i=0;i<3;i++) 
			{
				System.out.print(csvRecord.get(i)+"   ");
				System.out.println("");
				
			}
//			String City=csvRecord.get(0);
//			String Name= csvRecord.get(1);
//			String Contact =csvRecord.get(2);
//			
//			System.out.println("CITY -"+City);
//			System.out.println("NAME -"+Name);
//			System.out.println("NUMBER -"+Contact);
		}
		
		
		return "Done";
	}

	public String header() throws IOException {
		
		String CSV_FILE_PATH="src/main/resources/CustomerDetails2.csv";
		
		
		Reader reader=Files.newBufferedReader(Paths.get(CSV_FILE_PATH));
		
		@SuppressWarnings("resource")
		CSVParser csvParser=new CSVParser(reader, CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());
		
		
		
		for(CSVRecord csvRecord: csvParser) 
		{
			String city=csvRecord.get("CITY");
			String name= csvRecord.get("NAME");
			String num =csvRecord.get("NUMBER");
			
			System.out.println("CITY -"+city);
			System.out.println("NAME -"+name);
			System.out.println("NUMBER -"+num);
		}
		
		
		return "CSV_WITH_HEADER";
	}

	public String hashcsv() throws IOException {
		
		@SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(new FileReader("src/main/resources/CustomerDetails2.csv"));
		
	    String line =  null;
	    
	    HashMap<String,String> map = new HashMap<String, String>();

	    while((line=br.readLine())!=null)
	    {
	        String str[] = line.split(",");
	        
	        for(int i=0;i<str.length;i++)
	        {
	            String arr[] = str[i].split(":");
	            map.put(arr[0], arr[1]);
	    	    System.out.println(map);

	        }
	    }
	    
	
		return "HASH_MAP_CSV";
	}

	public String hashmapcsv() throws IOException {
		
		String CSV_LOCATION = "src/main/resources/CustomerDetails2.csv";

		Reader reader = Files.newBufferedReader(Paths.get(CSV_LOCATION));

		@SuppressWarnings("resource")
		CSVParser csvParser = new CSVParser(reader, CSVFormat.EXCEL.withFirstRecordAsHeader().withTrim().withIgnoreHeaderCase());
		
		Stream<CSVRecord> csvRecord = StreamSupport.stream(csvParser.spliterator(), false);

		List<Map<String, String>> keyValues = csvRecord.map(csvRecordOBJ -> csvRecordOBJ.toMap()).collect(Collectors.toList());

		System.out.println(keyValues);
		
		return "Completed"; 
	}

}
