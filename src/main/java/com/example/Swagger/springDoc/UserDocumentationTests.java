package com.example.Swagger.springDoc;

@RunWith(SpringRunner.class)
@WebMvcTest(UserController.class)
@AutoConfigureRestDocs(outputDir = "target/generated-snippets")
public class UserDocumentationTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getUserById() throws Exception {
        this.mockMvc.perform(get("/users/{id}", 1))
                .andExpect(status().isOk())
                .andDo(document("users/get-by-id"));
    }

}
