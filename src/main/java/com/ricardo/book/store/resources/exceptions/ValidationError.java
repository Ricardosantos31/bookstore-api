package com.ricardo.book.store.resources.exceptions;

import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError{

    private List<FieldMessege> erros = new ArrayList<>();

    public ValidationError() {
        super();
    }

    public ValidationError(Long timestemp, Integer status, String error) {
        super(timestemp, status, error);
    }

    public List<FieldMessege> getErros() {
        return erros;
    }

    public void addErros(String fieldname, String messege) {
        this.erros.add(new FieldMessege(fieldname,messege));
    }
}
