package io.github.bastien.test.jhipster.cucumber.stepdefs;

import io.github.bastien.test.jhipster.TestThipsterApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = TestThipsterApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
