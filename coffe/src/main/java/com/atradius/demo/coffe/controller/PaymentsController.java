package com.atradius.demo.coffe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.atradius.demo.coffe.constants.Constants;
import com.atradius.demo.coffe.dto.ResponseDTO;
import com.atradius.demo.coffe.exceptions.UserDoesNotExistException;
import com.atradius.demo.coffe.service.PaymentService;
import com.atradius.demo.coffe.utils.ResponseDispatcher;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;

@RestController
@RequestMapping("/payments")
@PropertySource({ "classpath:application.properties" })
@Tag(name = "Payments", description = "Payments management API")
public class PaymentsController {

	@Autowired(required = false)
	private PaymentService paymentService;

	@Operation(summary = "Get user's payments total", description = "Get user's payment total by user name")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "OK - User's payments total", content = {
			@Content(mediaType = Constants.RESP_PRODUCE, schema = @Schema(implementation = ResponseDTO.class)) }),
			@ApiResponse(responseCode = "400", description = "Bad request", content = {
					@Content(mediaType = Constants.RESP_PRODUCE, schema = @Schema(implementation = ResponseDTO.class)) }) })
	@SuppressWarnings("unchecked")
	@GetMapping(value = "/getPaymentsTotalByUser", produces = Constants.RESP_PRODUCE)
	public <T> ResponseEntity<ResponseDTO<T>> getPaymentsTotalByUser(@RequestParam String userName) {
		try {
			return new ResponseDispatcher<T>()
					.setResponseOkWithBodyHeader((T) paymentService.getPaymentsTotalByUser(userName));
		} catch (UserDoesNotExistException ex) {
			ResponseDTO<T> error = new ResponseDTO<T>(Boolean.FALSE, ex.getMessage(), null);
			return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
		}
	}

	@Operation(summary = "Get a list with the users' owes", description = "Get a list with the users' owes")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "OK - List with the users' owes", content = {
					@Content(mediaType = Constants.RESP_PRODUCE, schema = @Schema(implementation = ResponseDTO.class)) }),
			@ApiResponse(responseCode = "400", description = "Bad request", content = {
					@Content(mediaType = Constants.RESP_PRODUCE, schema = @Schema(implementation = ResponseDTO.class)) }) })
	@SuppressWarnings("unchecked")
	@GetMapping(value = "/getPaymentsUsersOwes", produces = Constants.RESP_PRODUCE)
	public <T> ResponseEntity<ResponseDTO<T>> getPaymentsUsersOwes() {
		return new ResponseDispatcher<T>().setResponseOkWithBodyHeader((T) paymentService.getPaymentsUsersOwes());
	}

}
