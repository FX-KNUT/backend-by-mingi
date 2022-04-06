package com.event.backend.service;

import com.event.backend.repository.*;
import org.springframework.stereotype.Service;


@Service
public class FindService {

    private FindRepository findRepository;
    public FindService(FindRepository findRepository){
        this.findRepository = findRepository;
    }

    public boolean findname(String brand, String event) throws Exception{
//        Optional<MemberEntity> userEntityWrapper = memberRepository.findByEmail(findDto.getEmail());
//            MemberEntity userEntity = userEntityWrapper.get();
//        findRepository.findname(brand, event, name);
        if(findRepository.findname(brand, event).isEmpty()){
            return false;
        }
        return true;
    }
}
