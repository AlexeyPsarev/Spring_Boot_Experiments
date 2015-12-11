package com.dataart.example.controllers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.commons.io.IOUtils;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImageController
{
	@RequestMapping(value = "/images", method = RequestMethod.GET, produces = MediaType.IMAGE_PNG_VALUE)
	public byte[] getImage(@RequestParam(value = "name") String name) throws FileNotFoundException, IOException
	{
		FileInputStream in = new FileInputStream("C:\\temp\\img\\" + name);
		return IOUtils.toByteArray(in);
	}
}
