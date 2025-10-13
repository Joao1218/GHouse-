package com.GHouseApi.GHouseApi.mappers;

import com.GHouseApi.GHouseApi.dto.inviteFamilyDTO;
import com.GHouseApi.GHouseApi.model.inviteFamilyModel;

public class inviteFamilyMapper {
    public static inviteFamilyModel dtoEmModel(inviteFamilyDTO inviteFamilyDTO){
        return new inviteFamilyModel(null, null, inviteFamilyDTO.invite());
    }

    public static inviteFamilyDTO modelEmDto(inviteFamilyModel inviteFamilyModel){
        return new inviteFamilyDTO(inviteFamilyModel.getCodigoConvite());
    }
}
