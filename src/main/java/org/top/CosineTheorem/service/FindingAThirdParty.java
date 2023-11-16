package org.top.CosineTheorem.service;

import org.springframework.stereotype.Service;
import org.top.CosineTheorem.entity.Coefficient;
import org.top.CosineTheorem.entity.Solution;

@Service
public interface FindingAThirdParty {
    Solution finding(Coefficient coefficient);
}
