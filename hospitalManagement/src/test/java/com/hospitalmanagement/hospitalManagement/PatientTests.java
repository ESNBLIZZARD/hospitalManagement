package com.hospitalmanagement.hospitalManagement;

import com.hospitalmanagement.hospitalManagement.dto.BloodGroupCountResponseEntity;
import com.hospitalmanagement.hospitalManagement.entity.Patient;
import com.hospitalmanagement.hospitalManagement.repository.PatientRepository;
import com.hospitalmanagement.hospitalManagement.service.PatientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.time.LocalDate;
import java.util.List;

@SpringBootTest
public class PatientTests {

    @Autowired
    private PatientService patientService;

    @Autowired
    private PatientRepository patientRepository;

//    @Test
//    public void testPatientRepository() {
//        List<Patient> patientList = patientRepository.findAll();
//        System.out.println(patientList);
//
//        Patient p1 = new Patient();
//    }

    @Test
    public void testTransactionMethods(){
//        Patient patient = patientService.getPatientByPatientId(1L);
//        Patient patient = patientRepository.findById(1L).orElseThrow(() -> new EntityNotFoundException("Patient not found with id: 1 "));
//        Patient patient = patientRepository.findByName("Lamine Yamal");
//        List<Patient> patientList = patientRepository.findByBirthDateOrEmail(LocalDate.of(2008, 06, 10), "lamineyamal@gmail.com");
//        List<Patient> patientList = patientRepository.findByNameContaining("Lamine");
        Page<Patient> patientList = patientRepository.findAllPatient(PageRequest.of(0, 2, Sort.by("name")));
        for(Patient patient : patientList) {
            System.out.println(patient);
        }

//        List<Object[]> bloodGroupList = patientRepository.countEachBloodGroupType();
//        for(Object[] object : bloodGroupList) {
//            System.out.println(object[0]+ " " +object[1]);
//        }

//        int rowsUpdated = patientRepository.updateNameWithId("Raphina", 4L);
//        System.out.println(rowsUpdated);

//--------PROJECTION
//        List<BloodGroupCountResponseEntity> bloodGroupList = patientRepository.countEachBloodGroupType();
//         for(BloodGroupCountResponseEntity bloodGroupCountResponse : bloodGroupList) {
//              System.out.println(bloodGroupCountResponse);
//          }
    }
}
