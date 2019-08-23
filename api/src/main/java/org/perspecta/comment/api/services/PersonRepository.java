/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.perspecta.comment.api.services;

import org.perspecta.comment.api.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 *
 * @author 500540
 */
public interface PersonRepository extends JpaRepository<Person, Integer> {
     
}