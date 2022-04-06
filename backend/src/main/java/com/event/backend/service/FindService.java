package com.event.backend.service;

import com.event.backend.repository.*;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class FindService {

    private FindRepository findRepository;
    public FindService(FindRepository findRepository){
        this.findRepository = findRepository;
    }

    public List findname(String brand) throws Exception{
//        Optional<MemberEntity> userEntityWrapper = memberRepository.findByEmail(findDto.getEmail());
//            MemberEntity userEntity = userEntityWrapper.get();
//        findRepository.findname(brand, event, name);
        System.out.println(findRepository.findname(brand).size());

        return findRepository.findname(brand);
    }
//    public boolean findname(String brand, String event) throws Exception{
////        Optional<MemberEntity> userEntityWrapper = memberRepository.findByEmail(findDto.getEmail());
////            MemberEntity userEntity = userEntityWrapper.get();
////        findRepository.findname(brand, event, name);
//        if(findRepository.findname(brand, event).isEmpty()){
//            return false;
//        }
//        return true;
//    }
//    public boolean findname(String brand, String event, String name ) throws Exception{
////        Optional<MemberEntity> userEntityWrapper = memberRepository.findByEmail(findDto.getEmail());
////            MemberEntity userEntity = userEntityWrapper.get();
////        findRepository.findname(brand, event, name);
//        if(findRepository.findname(brand, event, name).isEmpty()){
//            return false;
//        }
//        return true;
//    }
}
