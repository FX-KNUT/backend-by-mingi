package com.event.event.service;

import com.event.event.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;


@Service
public class FindService {
    @Autowired
    private FindRepository findRepository;
    public FindService(FindRepository FindRepository){
        this.findRepository = findRepository;
    }

    public boolean findname(String brand, String name) throws Exception{
//        Optional<MemberEntity> userEntityWrapper = memberRepository.findByEmail(findDto.getEmail());
//            MemberEntity userEntity = userEntityWrapper.get();
        if(findRepository.findname(brand, name).isEmpty()){
            return false;
        }
        return true;
    }
}
