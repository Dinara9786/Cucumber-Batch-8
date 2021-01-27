package com.hrms.utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Constants {


    public static final String CONFIGURATION_FILEPATH=System.getProperty("user.dir")+"/src/test/resources/configs/configuration.properties";

    public static final String TESTDATA_FILEPATH=System.getProperty("user.dir")+"/src/test/resources/testdata/HrmsTestData.xlsx";

    public static final String SCREENSHOT_FILEPATH= System.getProperty("user.dir")+"/screenshots/";

    public static final int IMPLICIT_WAIT=10;

    public static final int EXPLICIT_WAIT=20;


}