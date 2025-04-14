package stepDefinition;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageMethods.SignInPageMethods;


public class SigninPageSteps {
    SignInPageMethods signInPageMethods = new SignInPageMethods();

    @Given("user on the Sign in page for client")
    public void user_on_the_sign_in_page() {
        signInPageMethods.clickOnSignInButtonOfClient();
    }


    @Then("Logo should be visible")
    public void logo_Should_Be_Visible() {
        Assert.assertTrue("Header Logo is not visible", signInPageMethods.isCompanylogoVisible());
    }

    @Then("Company name text should be visible")
    public void company_name_text_should_be_visible() {
        Assert.assertTrue("Header company name is not visible", signInPageMethods.isCompanyNameVisible());
    }

    @Then("Header signup button should be visible")
    public void header_signup_button_should_be_visible() {
        Assert.assertTrue("Header sign up button is not visible", signInPageMethods.isSignupButtonVisible());
    }

    @Then("Welcome back! text should be visible")
    public void welcome_back_text_should_be_visible() {
        Assert.assertTrue("Welcome back text is not visible", signInPageMethods.isWelcomeBackTextVisible());
    }

    @Then("Do not have an account yet? text should be visible")
    public void do_not_have_an_account_yet_text_should_be_visible() {
        Assert.assertTrue("Do not have an account yet? text is not visible", signInPageMethods.isDoNotHaveAnAccountYetTextVisible());
    }

    @Then("Email label should be visible")
    public void emailLabelShouldBeVisible() {
        Assert.assertTrue("email label is not visible", signInPageMethods.isEmailLabelVisible());
    }

    @Then("Password label should be visible")
    public void password_label_should_be_visible() {
        Assert.assertTrue("Password lable is not visible", signInPageMethods.isPasswordlabelVisible());
    }

    @Then("Enter Email placeholder should be visible")
    public void enter_email_placeholder_should_be_visible() {
        Assert.assertTrue("Email placeholder is not visible", signInPageMethods.isEmailPlaceholderVisible());
    }

    @Then("Enter password placeholder should be visible")
    public void enter_password_placeholder_should_be_visible() {
        Assert.assertTrue("Password placeholder is not visible", signInPageMethods.isPasswordPlaceholderVisible());
    }

    @Then("Forgot password should be visible")
    public void forgot_password_should_be_visible() {
        Assert.assertTrue("Forgot password is not Visible", signInPageMethods.isForgotPasswordVisible());
    }

    @Then("login button should be visible")
    public void login_button_should_be_visible() {
        Assert.assertTrue("Login button is not visible", signInPageMethods.isloginButtonVisible());
    }

    @Then("Footer logo should be visible")
    public void footer_logo_should_be_visible() {
        Assert.assertTrue("Company Footer logo is not visible.", signInPageMethods.isFooterCompanyLogoVisible());
    }

    @Then("Footer compnay name should be visible")
    public void footer_compnay_name_should_be_visible() {
        Assert.assertTrue("Footer company name is not visible", signInPageMethods.isFooterCompnayNameVisible());
    }

    @Then("Footer Connecting you to trusted childcare text should be visible")
    public void footer_connecting_you_to_trusted_childcare_text_should_be_visible() {
        Assert.assertTrue("Footer Connecting you to trusted childcare text is not visible",
                signInPageMethods.isFooterConnectingYouToTrustedChildcareTextVisible());
    }

    @Then("Instagram logo should be visible")
    public void instagram_logo_should_be_visible() {
        Assert.assertTrue("Instagram logo is not visible", signInPageMethods.isInstagramLogoVisible());
    }

    @Then("Facebook logo should be visible")
    public void facebook_logo_should_be_visible() {
        Assert.assertTrue("Facbook logo is not visible", signInPageMethods.isFacebooklogoVisible());
    }

    @Then("Phone number icon should be visible")
    public void phone_number_icon_should_be_visible() {
        Assert.assertTrue("Phone number icon is not visible", signInPageMethods.isPhoneNumberIconVisible());
    }

    @Then("Email icon should be visible")
    public void email_icon_should_be_visible() {
        Assert.assertTrue("Footer Email icon is not visible", signInPageMethods.isEmailIconVisible());

    }

    @Then("Contact number should be visible")
    public void contact_number_should_be_visible() {
        Assert.assertTrue("Contact number is not visible", signInPageMethods.isContactNumberVisible());
    }

    @Then("Email should be visible")
    public void email_should_be_visible() {
        Assert.assertTrue("Footer email is not visible", signInPageMethods.isFooterEmailVisible());
    }

    @Then("Privacy Policy text should be visible")
    public void privacy_policy_text_should_be_visible() {
        Assert.assertTrue("Privacy Policy Text is not visible", signInPageMethods.isPrivacyPolicyTextVisible());
    }

    @Then("Term and condition text should be visible")
    public void term_and_condition_text_should_be_visible() {
        Assert.assertTrue("Terms And Condition Text is not visible", signInPageMethods.isTermAndConditionTextVisible());
    }

    @Then("© {int} Hopscotch Connect. All rights reserved. text should be visible")
    public void hopscotch_connect_all_rights_reserved_text_should_be_visible(Integer int1) {
        Assert.assertTrue("©2025HopscotchConnect. All Rights Reserved Text is not visible", signInPageMethods.isHopscotchConnectAllRightsReservedTextVisible());
    }

    @Then("Hopscotch name should be clickable in Header")
    public void hopscotch_name_should_be_clickable_in_header() {
        Assert.assertTrue("Hopscotch name is not clickable in Header", signInPageMethods.isCompanyNameClickable());

    }

    @Then("Header signup button should be clickable")
    public void header_signup_button_should_be_clickable() {
        Assert.assertTrue("Header signup button is not clickable", signInPageMethods.isHeaderSignupButtonClickable());
    }

    @Then("Email address input field should be clickable")
    public void email_address_input_field_should_be_clickable() {
        Assert.assertTrue("Email address input field is not clickable", signInPageMethods.isEmailFieldClickable());
    }

    @Then("Password input field should be clickable")
    public void password_input_field_should_be_clickable() {
        Assert.assertTrue("Password input field is not clickable", signInPageMethods.isPasswordFieldClickable());
    }

    @Then("sign in button should be clickable")
    public void sign_in_button_should_be_clickable() {
        Assert.assertTrue("sign in button is not clickable", signInPageMethods.isLoginButtonClickable());
    }

    @Then("Forgot your password link should be clickable")
    public void forgot_your_password_link_should_be_clickable() {
        Assert.assertTrue("Forgot your password link is not clickable", signInPageMethods.isForgotPasswordClickable());
    }

    @Then("Create account button should be clickable")
    public void create_account_button_should_be_clickable() {
        Assert.assertTrue("Create account button is not clickable", signInPageMethods.isCreateAccountButtonClickable());
    }

    @Then("Instagram logo should be clickable")
    public void instagram_logo_should_be_clickable() {
        Assert.assertTrue("Instagram logo is not clickable", signInPageMethods.isInstagramLogoClickable());
    }

    @Then("Facebook logo should be clickable")
    public void facebook_logo_should_be_clickable() {
        Assert.assertTrue("Facebook logo is mot clickable", signInPageMethods.isFacebookLogoClickable());
    }

    @Then("Footer Email should be clickable")
    public void footer_email_should_be_clickable() {
        Assert.assertTrue("Footer Email is not clickable", signInPageMethods.isFooterEmailClickable());
    }

    @When("user click on the signup button in the login page for client")
    public void user_click_on_the_signup_button_in_the_login_page_for_client() {
        signInPageMethods.clickOnSignupButtonInTheLoginPageForClient();
    }

    @Then("the user should be redirected to the sign up page")
    public void the_user_should_be_redirected_to_the_sign_up_page() {
        Assert.assertTrue("Welcome To Hoscotch!Text is not visible", signInPageMethods.isWelcomeToHopscotchTextVisible());
    }

    @When("user click on Create account button in login page for client")
    public void user_click_on_create_account_button_in_login_page_for_client() {
        signInPageMethods.clickOnCreateAccountButton();
    }

    @When("user click on the forgot password button in login page for client")
    public void user_click_on_the_forgot_password_button_in_login_page_for_client() {
        signInPageMethods.clickOnForgotPasswordButton();
    }

    @Then("the user should be redirected to forgot password page")
    public void the_user_should_be_redirected_to_forgot_password_page() {
        Assert.assertTrue("Forgot Your Password? Text id not visible", signInPageMethods.isForgotYourPasswordTextVisible());
    }

    @When("the user enter username {string}")
    public void the_user_enter_uername(String string) {
        signInPageMethods.EnterEmailAddress("pankaj@yopmail.com");
    }

    @When("the user enter the password {string}")
    public void the_user_enter_the_password(String string) {
        signInPageMethods.EnterPassword("Test@12345");
    }

    @When("user clicks on the sign in button")
    public void user_clicks_on_the_sign_in_button() {
        signInPageMethods.ClickOnLoginButton();
    }

    @Then("the user should be logged in sucessfully")
    public void the_user_should_be_logged_in_sucessfully() {
        Assert.assertTrue("Find Trusted ChildCare Providers Text is not visible", signInPageMethods.isFindTrustedChildCareProvidersVisible());
    }


}

