package com.example.Swagger.springDoc;

@Test
public void updateUser() throws Exception {
    User user = new User("John Doe", 30);

    updateUser.setId(1L);
    this.mockMvc.perform(put("/users/{id}" + updateUser.getId())
                    .contentType(MediaType.APPLICATION_JSON)
                    .content(objectMapper.writeValueAsString(user)))
            .andExpect(status().isOk())
            .andDo(document("users/update",
                    pathParamter(
                            parameterWithName("id").description("The user's id to be modified"),
                            ),
                    requestFields(
                            fieldWithPath("name").description("The user's name"),
                            fieldWithPath("age").description("The user's age")
                    ),
                    responseFields(
                            fieldWithPath("id").description("The user's ID").
                                    fieldWithPath("name").description("The user's name"),
                            fieldWithPath("age").description("The user's age")
                    )));
}

