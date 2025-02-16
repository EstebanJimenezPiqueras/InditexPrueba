package inditex.esteban.prueba.controller;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;



@SpringBootTest
@ExtendWith(MockitoExtension.class)
@AutoConfigureMockMvc
public class PriceControllerTest {

    @Autowired
    private MockMvc mockMvc;


    @Test
    @DisplayName("Test 1: peticiÃ³n a las 10:00 del dÃ\u00ADa 14 del producto 35455   para la brand 1 (ZARA)")
    public void testPriceAt10amOn14th() throws Exception {

        mockMvc.perform(get("/api/prices/getPrice")
                        .param("productId", "35455")
                        .param("brandId", "1")
                        .param("applicationDate", "2020-06-14T10:00:00")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.productId").value(35455))
                .andExpect(jsonPath("$.brandId").value(1))
                .andExpect(jsonPath("$.price").value(35.50))
                .andExpect(jsonPath("$.currency").value("EUR"));
    }

    @Test
    @DisplayName("Test 2: peticiÃ³n a las 16:00 del dÃ\u00ADa 14 del producto 35455   para la brand 1 (ZARA)")
    public void testPriceAt16amOn14th() throws Exception {

        mockMvc.perform(get("/api/prices/getPrice")
                        .param("productId", "35455")
                        .param("brandId", "1")
                        .param("applicationDate", "2020-06-14T16:00:00")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.productId").value(35455))
                .andExpect(jsonPath("$.brandId").value(1))
                .andExpect(jsonPath("$.price").value(25.45))
                .andExpect(jsonPath("$.currency").value("EUR"));
    }

    @Test
    @DisplayName("Test 3: peticiÃ³n a las 21:00 del dÃ\u00ADa 14 del producto 35455   para la brand 1 (ZARA)")
    public void testPriceAt21amOn14th() throws Exception {

        mockMvc.perform(get("/api/prices/getPrice")
                        .param("productId", "35455")
                        .param("brandId", "1")
                        .param("applicationDate", "2020-06-14T21:00:00")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.productId").value(35455))
                .andExpect(jsonPath("$.brandId").value(1))
                .andExpect(jsonPath("$.price").value(35.50))
                .andExpect(jsonPath("$.currency").value("EUR"));
    }


    @Test
    @DisplayName("Test 4: peticiÃ³n a las 10:00 del dÃ\u00ADa 15 del producto 35455   para la brand 1 (ZARA)")
    public void testPriceAt10amOn15th() throws Exception {

        mockMvc.perform(get("/api/prices/getPrice")
                        .param("productId", "35455")
                        .param("brandId", "1")
                        .param("applicationDate", "2020-06-15T10:00:00")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.productId").value(35455))
                .andExpect(jsonPath("$.brandId").value(1))
                .andExpect(jsonPath("$.price").value(30.50))
                .andExpect(jsonPath("$.currency").value("EUR"));
    }

    @Test
    @DisplayName("Test 5: peticiÃ³n a las 21:00 del dÃ\u00ADa 16 del producto 35455   para la brand 1 (ZARA)")
    public void testPriceAt21amOn16th() throws Exception {

        mockMvc.perform(get("/api/prices/getPrice")
                        .param("productId", "35455")
                        .param("brandId", "1")
                        .param("applicationDate", "2020-06-16T21:00:00")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.productId").value(35455))
                .andExpect(jsonPath("$.brandId").value(1))
                .andExpect(jsonPath("$.price").value(38.95))
                .andExpect(jsonPath("$.currency").value("EUR"));
    }

}