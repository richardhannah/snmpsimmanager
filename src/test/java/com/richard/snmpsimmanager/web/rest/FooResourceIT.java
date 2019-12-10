package com.richard.snmpsimmanager.web.rest;

import com.richard.snmpsimmanager.SnmpsimmanagerApp;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
/**
 * Test class for the FooResource REST controller.
 *
 * @see FooResource
 */
@SpringBootTest(classes = SnmpsimmanagerApp.class)
public class FooResourceIT {

    private MockMvc restMockMvc;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);

        FooResource fooResource = new FooResource();
        restMockMvc = MockMvcBuilders
            .standaloneSetup(fooResource)
            .build();
    }

    /**
     * Test test
     */
    @Test
    public void testTest() throws Exception {
        restMockMvc.perform(get("/api/foo/test"))
            .andExpect(status().isOk());
    }

    /**
     * Test test
     */
    @Test
    public void testGetSnmpRec() throws Exception {
        restMockMvc.perform(get("/api/foo/snmprec/public"))
            .andExpect(status().isOk());
    }

    /**
     * Test test
     */
    @Test
    public void testpostSnmpRec() throws Exception {

        String postContent = "some post content";

        restMockMvc.perform(post("/api/foo/snmprec/bum").contentType("text/html")
            .content(postContent))
            .andExpect(status().isOk());
    }
}
