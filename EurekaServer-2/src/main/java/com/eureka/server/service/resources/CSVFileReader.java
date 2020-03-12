package com.eureka.server.service.resources;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eureka.server.model.service.CSVFileService;
import com.eureka.server.model.service.DTO.CSVDTO;

@RestController
@RequestMapping("/csv")
public class CSVFileReader {

	@Autowired
	CSVFileService csvFileService;

	@PostMapping("/savefile")
	public String csvfile() throws IOException {
		return csvFileService.savecsv();
	}

	@GetMapping("/csvparser")
	public String csvparser() throws FileNotFoundException, IOException {
		return csvFileService.saveparser();
	}

	@GetMapping("/csvwithheader")
	public String header() throws IOException {
		return csvFileService.header();
	}

	@GetMapping("/csvhashmap")
	public String hashCSV() throws IOException {
		return csvFileService.hashcsv();
	}

	@GetMapping("/groupbycsv")
	public String group(CSVDTO csvdto) {
		return csvdto.getCity();
	}

	
	@GetMapping("/csvwithhashmap")
	public String hashmapCSV() throws IOException 
	{
		return csvFileService.hashmapcsv();
	}
						
		
}

