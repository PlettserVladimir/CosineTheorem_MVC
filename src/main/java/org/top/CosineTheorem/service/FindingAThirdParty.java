package org.top.CosineTheorem.service;

import org.springframework.stereotype.Service;

@Service
public interface FindingAThirdParty {
    Double finding(Double a,Double b,Double alfa,Boolean isRadian);
}
