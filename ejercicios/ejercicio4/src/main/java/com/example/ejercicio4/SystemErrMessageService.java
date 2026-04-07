package com.example.ejercicio4;

import org.springframework.stereotype.Service;

@Service
public class SystemErrMessageService implements MessageService {
    @Override
    public void showMessage(String message) {
        System.err.println(message);

    }
}
