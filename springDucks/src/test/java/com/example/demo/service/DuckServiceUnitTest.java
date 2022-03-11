package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.demo.entity.Duck;
import com.example.demo.repo.DuckRepo;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class DuckServiceUnitTest {

	
	@Autowired
    private DuckService service;

    @MockBean
    private DuckRepo repo;

    @Test
    void testCreate() {

        // GIVEN
        Duck toSave = new Duck(18, "Male", "lake", "adam");
        Duck saved = new Duck(1L, 18, "Male", "lake", "adam");

        // WHEN
        Mockito.when(this.repo.save(toSave)).thenReturn(saved);

        // THEN
        Assertions.assertThat(this.service.create(toSave)).isEqualTo(saved);

        // verify
        Mockito.verify(this.repo, Mockito.times(1)).save(toSave);
    }

    @Test
    void testReadById() {

        // GIVEN
        Long id = 1L;
        Duck expected = new Duck(id, 18, "Male", "lake", "adam");

        // WHEN
        Mockito.when(this.repo.findById(id)).thenReturn(Optional.of(expected));

        // THEN
        Assertions.assertThat(this.service.readById(id)).isEqualTo(expected);

        // verify
        Mockito.verify(this.repo, Mockito.times(1)).findById(id);
    }

    @Test
    void testReadAll() {

        // GIVEN
        Long id = 1L;
        Duck testDuck = new Duck(18, "Male", "lake", "adam");
        testDuck.setId(id);
        List<Duck> Ducks = List.of(testDuck);

        // WHEN
        Mockito.when(this.repo.findAll()).thenReturn(Ducks);

        // THEN
        Assertions.assertThat(this.service.readAll()).isEqualTo(Ducks);

        // verify
        Mockito.verify(this.repo, Mockito.times(1)).findAll();

    }

    @Test
    void testUpdate() {

        // GIVEN
        Long id = 1L;
        Duck newValues = new Duck(20, "Male", "lake", "adam");
        Duck existingDuck = new Duck(id, 18, "Male", "lake", "adam");
        Duck updated = new Duck(id, newValues.getAge(), newValues.getGender(), newValues.getHabitat(), newValues.getName());

        // WHEN
        Mockito.when (this.repo.findById(id)).thenReturn(Optional.of(existingDuck));
        Mockito.when(this.repo.save(updated)).thenReturn(updated);
        
        // THEN
        assertEquals(updated, this.service.update(id, existingDuck));

        // verify
        Mockito.verify(this.repo, Mockito.times(1)).findById(id);
        Mockito.verify(this.repo, Mockito.times(1)).save(updated);

    }

  @Test void TruetestDelete() {
  
   //GIVEN 
   Long id = 1L;
  
   //WHEN 
   Mockito.when(this.repo.existsById(id)).thenReturn(false);
  
  //THEN 
   assertTrue(this.service.delete(id));
  
   //verify 
   Mockito.verify(this.repo, Mockito.times(1)).deleteById(id);
   Mockito.verify(this.repo, Mockito.times(1)).existsById(id);
  
  }
  
  @Test void FalsetestDelete() {
	  
	   //GIVEN 
	   Long id = 1L;
	  
	   //WHEN 
	   Mockito.when(this.repo.existsById(id)).thenReturn(true);
	  
	  //THEN 
	   assertFalse(this.service.delete(id));
	  
	   //verify 
	   Mockito.verify(this.repo, Mockito.times(1)).deleteById(id);
	   Mockito.verify(this.repo, Mockito.times(1)).existsById(id);
	  
	  }
  
  }
 