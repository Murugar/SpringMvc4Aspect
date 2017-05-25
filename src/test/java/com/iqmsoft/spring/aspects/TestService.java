package com.iqmsoft.spring.aspects;

import java.io.EOFException;
import java.io.IOException;

import org.springframework.stereotype.Service;

import com.iqmsoft.spring.aspects.annotations.Retry;

@Service
public class TestService {

	@Retry(attempts = RetryAspectTest.ATTEMPTS, timeout = RetryAspectTest.TIMEOUT, exceptionClass = IOException.class)
	public void testMethodWithExceptionThatShouldRetry() throws Exception {
		throw RetryAspectTest.EXCEPTION;
	}

	@Retry(attempts = RetryAspectTest.ATTEMPTS, timeout = RetryAspectTest.TIMEOUT, exceptionClass = NullPointerException.class)
	public void testMethodWithExceptionThatShouldntRetry() throws Exception {
		throw RetryAspectTest.EXCEPTION;
	}
	
	@Retry(attempts = 10, timeout = 5000, exceptionClass = EOFException.class)
	public void testMethod1WithExceptionThatShouldntRetry() throws Exception {
		throw RetryAspectTest.EXCEPTION;
	}
	
}