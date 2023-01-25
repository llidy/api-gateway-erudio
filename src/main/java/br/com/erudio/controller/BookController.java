package br.com.erudio.controller;

import br.com.erudio.data.vo.v1.BookVO;
import br.com.erudio.services.BookServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/book/v1")
public class BookController {

    @Autowired
    private BookServices service;

    @GetMapping
    public List<BookVO> findAll(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public BookVO findById(@PathVariable(value = "id") Long id){
        return service.findById(id);
    }

    @PostMapping
    public BookVO create(@RequestBody BookVO bookVO){
        return service.create(bookVO);
    }

    @PutMapping("/{id}")
    public BookVO update(@RequestBody BookVO bookVO, @PathVariable(value = "id") Long id){
        return service.update(bookVO, id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable(value = "id") Long id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

}
