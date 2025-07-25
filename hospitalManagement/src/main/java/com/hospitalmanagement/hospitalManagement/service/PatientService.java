package com.hospitalmanagement.hospitalManagement.service;

import com.hospitalmanagement.hospitalManagement.entity.Patient;
import com.hospitalmanagement.hospitalManagement.repository.PatientRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PatientService {
    private final PatientRepository patientRepository;

    @Transactional
    public Patient getPatientByPatientId(Long id) {

        Patient p1 = patientRepository.findById(id).orElseThrow();

        Patient p2 = patientRepository.findById(id).orElseThrow();

        //patientRepository.findById(id).orElseThrow();

        System.out.println(p1 == p2);

        p1.setName("Juju");

        return p1;
    }
}
