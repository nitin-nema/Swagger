package com.example.Swagger.springDoc;

@Test
public void createUser() throws Exception {
    User user = new User("John Doe", 30);

    this.mockMvc.perform(post("/users")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content(objectMapper.writeValueAsString(user)))
            .andExpect(status().isCreated())
            .andDo(document("users/create",

                    requestFields(
                            fieldWithPath("name").description("The user's name"),
                            fieldWithPath("age").description("The user's age")
                    ),
                    responseFields(
                            fieldWithPath("id").description("The user's ID")
                    )
            ));
}
