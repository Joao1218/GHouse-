package com.GHouseApi.GHouseApi.service;

import com.GHouseApi.GHouseApi.enums.userEnum;
import com.GHouseApi.GHouseApi.model.userModel;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@SpringBootTest
public class userTest {

    @Autowired
    private userService service;


    @Test
    public void atualizar() throws Exception {
        service.atualizarInformações(UUID.fromString("6ee5c2ad-9134-4d85-897b-9c5a3988d9fc"), "Joõa Henrique", "joaohmreinaldo@gmail.com");
    }

    @Test
    public void deletar(){
        service.deletarUsuario(UUID.fromString("f54756fc-8571-400a-ab07-a63613fabca5"));
    }
}
