package mypack

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class Register {

	@Keyword
	public void TestCaseEmailRegister(){
		WebUI.navigateToUrl('https://hotfix.student.cakap.com/login/register/email')
		WebUI.setText(findTestObject('Object Repository/Page_Cakap Student  Dashboard/input_Email_inputemail'), 'fairuz@gmail.com')
		WebUI.click(findTestObject('Object Repository/Page_Cakap Student  Dashboard/label_Male'))
		WebUI.setText(findTestObject('Object Repository/Page_Cakap Student  Dashboard/input_First Name_inputfirst'), 'fairuz')
		WebUI.setText(findTestObject('Object Repository/Page_Cakap Student  Dashboard/input_Last Name_inputlast'), 'zumar')
		WebUI.setText(findTestObject('Object Repository/Page_Cakap Student  Dashboard/input_Password_inputpassword'), 'qwerasd123')
		WebUI.setText(findTestObject('Object Repository/Page_Cakap Student  Dashboard/input_Confirm Password_inputconfirmpass'), 'qwerasd123')
		WebUI.click(findTestObject('Object Repository/Page_Cakap Student  Dashboard/button_SIGN UP'))
		WebUI.click(findTestObject('Object Repository/Page_Cakap Student  Dashboard/label_English Course'))
		WebUI.click(findTestObject('Object Repository/Page_Cakap Student  Dashboard/button_NEXT'))
		WebUI.setText(findTestObject('Object Repository/Page_Cakap Student  Dashboard/input_Zimbabwe (263)_input-phone'), '085704343047')
		WebUI.click(findTestObject('Object Repository/Page_Cakap Student  Dashboard/button_START LEARNING'))
		WebUI.click(findTestObject('Object Repository/Page_Cakap Student  Congratulation/button_GO TO MY DASHBOARD'))
		WebUI.click(findTestObject('Object Repository/Page_Cakap Student  Dashboard/span_(GMT0700) Krasnoyarsk Time Bangkok Hanoi Jakarta'))
		WebUI.click(findTestObject('Object Repository/Page_Cakap Student  Dashboard/button_OK'))
	}
}
