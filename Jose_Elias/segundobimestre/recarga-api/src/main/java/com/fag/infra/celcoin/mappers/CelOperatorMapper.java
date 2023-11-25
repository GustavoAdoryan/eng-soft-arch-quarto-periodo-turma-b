package com.fag.infra.celcoin.mappers;

import com.fag.domain.dto.OperatorDTO;
import com.fag.infra.celcoin.dto.CelOperatorDTO;

public class CelOperatorMapper {

    public static OperatorDTO toAppDTO(CelOperatorDTO vendorDTO) {
        OperatorDTO appDTO = new OperatorDTO();

        appDTO.setCategory(vendorDTO.getCategory());
        appDTO.setMaxValue(vendorDTO.getMaxValue());
        appDTO.setMinValue(vendorDTO.getMinValue());
        appDTO.setName(vendorDTO.getName());
        appDTO.setProviderId(vendorDTO.getProviderId());
        appDTO.setRechargeType(vendorDTO.getRechargeType());

        return appDTO;
    }

}
