package com.atradius.demo.coffe.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.atradius.demo.coffe.constants.Constants;
import com.atradius.demo.coffe.dto.ResponseDTO;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ResponseDispatcher<T> {

	public ResponseEntity<ResponseDTO<T>> setResponseOkWithBodyHeader(T body) {
		ResponseDTO<T> response = new ResponseDTO<>(Boolean.TRUE, Constants.ResponseInfo.OK, body);

		return new ResponseEntity<ResponseDTO<T>>(response, HttpStatus.OK);
	}

	public ResponseEntity<ResponseDTO<T>> setResponse(ResponseDTO<T> response) {
		return new ResponseEntity<ResponseDTO<T>>(response,
				response.getSuccess() ? HttpStatus.OK : HttpStatus.BAD_REQUEST);
	}
}
