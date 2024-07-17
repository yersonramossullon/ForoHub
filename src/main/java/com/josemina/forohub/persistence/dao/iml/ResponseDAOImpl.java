package com.josemina.forohub.persistence.dao.iml;

import com.josemina.forohub.persistence.entities.Response;
import com.josemina.forohub.persistence.dao.IResponseDAO;
import com.josemina.forohub.persistence.repository.ResponseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ResponseDAOImpl implements IResponseDAO {

    @Autowired
    private ResponseRepository responseRepository;

    @Override
    public List<Response> findAll() {
        return (List<Response>) responseRepository.findAll();
    }

    @Override
    public Optional<Response> findById(Long id) {
        return responseRepository.findById(id);
    }

    @Override
    public void save(Response response) {
        responseRepository.save(response);
    }

    @Override
    public void deleteById(Long id) {
        responseRepository.deleteById(id);
    }
}
