package br.com.djeferson;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.djeferson.exceptions.UnsupportedMathOperationException;

@RestController
public class MathController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double sum(
			@PathVariable(value= "numberOne")String numberOne,
			@PathVariable(value= "numberTwo")String numberTwo) throws Exception{
		
		if(!isNumeric(numberOne) || !isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("PLEASE SET A NUMERIC VALUE!");
		}
		return convertToDouble(numberOne) + convertToDouble(numberTwo) ;
		
	}
	@RequestMapping(value = "/substraction/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double subs(
			@PathVariable(value= "numberOne")String numberOne,
			@PathVariable(value= "numberTwo")String numberTwo) throws Exception{
		
		if(!isNumeric(numberOne) || !isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("PLEASE SET A NUMERIC VALUE!");
		}
		return convertToDouble(numberOne) - convertToDouble(numberTwo) ;
		
	}
	
	@RequestMapping(value = "/multiplication/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double multi(
			@PathVariable(value= "numberOne")String numberOne,
			@PathVariable(value= "numberTwo")String numberTwo) throws Exception{
		
		if(!isNumeric(numberOne) || !isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("PLEASE SET A NUMERIC VALUE!");
		}
		return convertToDouble(numberOne) * convertToDouble(numberTwo) ;
		
	}
	
	@RequestMapping(value = "/division/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double division(
			@PathVariable(value= "numberOne")String numberOne,
			@PathVariable(value= "numberTwo")String numberTwo) throws Exception{
		
		if(!isNumeric(numberOne) || !isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("PLEASE SET A NUMERIC VALUE!");
		}
		return convertToDouble(numberOne) / convertToDouble(numberTwo) ;
		
	}
	
	private Double convertToDouble(String strNumber) {
		if(strNumber == null) return 0D;
		String number = strNumber.replaceAll(",",".");
		return 0D;
	}

	private boolean isNumeric(String strNumber) {
		if(strNumber == null) return false;
		String number = strNumber.replaceAll(",",".");
		return number.matches("[-+]?[0-9]*\\.?[0-9]+");
	}
}
