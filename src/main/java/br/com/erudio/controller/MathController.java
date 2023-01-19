package br.com.erudio.controller;

import br.com.erudio.SimpleMath;
import br.com.erudio.exceptions.UnsupportedMathOperationException;
import br.com.erudio.common.NumberValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {
    @Autowired
    private final NumberValidation numberValidation;

    public MathController(NumberValidation numberValidation) {
        this.numberValidation = numberValidation;
    }
    private SimpleMath math = new SimpleMath();
    @RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double sum(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception{
        if(!numberValidation.isNumeric(numberOne) || !numberValidation.isNumeric(numberTwo)){
            throw new UnsupportedOperationException("Please set a numeric value!");
        }
        return math.sum(numberValidation.convertToDouble(numberOne), numberValidation.convertToDouble(numberTwo));
    }

    @RequestMapping(value = "/subtraction/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double subtraction(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception{
        if(!numberValidation.isNumeric(numberOne) || !numberValidation.isNumeric(numberTwo)){
            throw new UnsupportedOperationException("Please set a numeric value!");
        }
        return math.subtraction(numberValidation.convertToDouble(numberOne), numberValidation.convertToDouble(numberTwo));
    }

    @RequestMapping(value = "/multiplication/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double multiplication(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception{
        if(!numberValidation.isNumeric(numberOne) || !numberValidation.isNumeric(numberTwo)){
            throw new UnsupportedOperationException("Please set a numeric value!");
        }
        return math.multiplication(numberValidation.convertToDouble(numberOne), numberValidation.convertToDouble(numberTwo));
    }

    @RequestMapping(value = "/division/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double division(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception{
        if(!numberValidation.isNumeric(numberOne) || !numberValidation.isNumeric(numberTwo)){
            throw new UnsupportedOperationException("Please set a numeric value!");
        }
        return math.division(numberValidation.convertToDouble(numberOne), numberValidation.convertToDouble(numberTwo));
    }

    @RequestMapping(value = "/mean/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double mean(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception{
        if(!numberValidation.isNumeric(numberOne) || !numberValidation.isNumeric(numberTwo)){
            throw new UnsupportedOperationException("Please set a numeric value!");
        }
        return math.mean(numberValidation.convertToDouble(numberOne), numberValidation.convertToDouble(numberTwo));
    }


}


