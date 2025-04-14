package pageMethods;

import base.PredefinedActions;
import constant.ConstantPath;
import utility.PropOperation;

public class SignInPageMethods extends PredefinedActions {
    public PropOperation propOperation;

    public SignInPageMethods() {
        propOperation = new PropOperation(ConstantPath.SIGNINPAGELOCATORS);

    }

    public void clickOnSignInButtonOfClient() {
        clickOnElement(propOperation.getValue("LoginButtonClient"), true);
    }


    public boolean isCompanylogoVisible() {
        return isElementVisible(propOperation.getValue("HeaderCompanyLogo"));

    }


    public boolean isCompanyNameVisible() {
        return isElementVisible(propOperation.getValue("HeaderCompanyName"));
    }

    public boolean isSignupButtonVisible() {
        return isElementVisible(propOperation.getValue("SignUpButton"));
    }

    public boolean isWelcomeBackTextVisible() {
        return isElementVisible(propOperation.getValue("WelcomeBack!Text"));

    }

    public boolean isDoNotHaveAnAccountYetTextVisible() {
        return isElementVisible(propOperation.getValue("DoNotHaveAnAccountYet?CreateAccount"));

    }

    public boolean isEmailLabelVisible() {
        return isElementVisible(propOperation.getValue("EmailLabel"));
    }

    public boolean isPasswordlabelVisible() {
        return isElementVisible(propOperation.getValue("PasswordlLabel"));

    }

    public boolean isEmailPlaceholderVisible() {
        return isElementVisible(propOperation.getValue("EmailPlaceHolder"));

    }


    public boolean isPasswordPlaceholderVisible() {
        return isElementVisible(propOperation.getValue("PasswordPlaceHolder"));

    }

    public boolean isForgotPasswordVisible() {
        return isElementVisible(propOperation.getValue("ForgotPassword"));

    }

    public boolean isloginButtonVisible() {
        return isElementVisible(propOperation.getValue("LoginButton"));

    }

    public boolean isFooterCompanyLogoVisible() {
        return isElementVisible(propOperation.getValue("FooterCompanyLogo"));

    }

    public boolean isFooterCompnayNameVisible() {
        return isElementVisible(propOperation.getValue("FooterCompanyName"));

    }

    public boolean isFooterConnectingYouToTrustedChildcareTextVisible() {
        return isElementVisible(propOperation.getValue("ConnectingYouToTrustedChildcareText"));


    }

    public boolean isInstagramLogoVisible() {
        return isElementVisible(propOperation.getValue("InstagramButton"));
    }

    public boolean isFacebooklogoVisible() {
        return isElementVisible(propOperation.getValue("FaceBookButton"));
    }

    public boolean isPhoneNumberIconVisible() {
        return isElementVisible(propOperation.getValue("FooterPhoneIcon"));
    }

    public boolean isEmailIconVisible() {
        return isElementVisible(propOperation.getValue("FooterEmailIcon"));
    }

    public boolean isContactNumberVisible() {
        return isElementVisible(propOperation.getValue("PhoneNumber"));
    }

    public boolean isFooterEmailVisible() {
        return isElementVisible(propOperation.getValue("FooterEmail"));

    }

    public boolean isPrivacyPolicyTextVisible() {
        return isElementVisible(propOperation.getValue("PrivacyPolicyText"));
    }

    public boolean isTermAndConditionTextVisible() {
        return isElementVisible(propOperation.getValue("TermsAndCondtionText"));
    }

    public boolean isHopscotchConnectAllRightsReservedTextVisible() {
        return isElementVisible(propOperation.getValue("©2025HopscotchConnect.AllRightsReservedText"));
    }

    public boolean isCompanyNameClickable() {
        return isElementClickable(propOperation.getValue("HeaderCompanyName"), true);
    }

    public boolean isHeaderSignupButtonClickable() {
        return isElementDisplayed(propOperation.getValue("SignUpButton"), true);
    }

    public boolean isEmailFieldClickable() {
        return isElementDisplayed(propOperation.getValue("EmailField"), true);
    }

    public boolean isPasswordFieldClickable() {
        return isElementDisplayed(propOperation.getValue("PasswordField"), true);
    }

    public boolean isLoginButtonClickable() {
        return isElementDisplayed(propOperation.getValue("LoginButton"), true);
    }

    public boolean isForgotPasswordClickable() {
        return isElementDisplayed(propOperation.getValue("ForgotPassword"), true);
    }

    public boolean isCreateAccountButtonClickable() {
        return isElementDisplayed(propOperation.getValue("CreateAccount"), true);

    }

    public boolean isInstagramLogoClickable() {
        return isElementClickable(propOperation.getValue("InstagramButton"), true);
    }

    public boolean isFacebookLogoClickable() {
        return isElementClickable(propOperation.getValue("FaceBookButton"), true);
    }

    public boolean isFooterEmailClickable() {
        return isElementClickable(propOperation.getValue("FooterEmail"), true);
    }

    public void clickOnSignupButtonInTheLoginPageForClient() {
        clickOnElement(propOperation.getValue("SignUpButton"), true);

    }

    public boolean isWelcomeToHopscotchTextVisible() {
        return isElementVisible(propOperation.getValue("WelcomeToHoscotch!Text"));

    }

    public void clickOnCreateAccountButton() {
        clickOnElement(propOperation.getValue("CreateAccount"), true);
    }

    public void clickOnForgotPasswordButton() {
        clickOnElement(propOperation.getValue("ForgotPassword"), true);
    }

    public boolean isForgotYourPasswordTextVisible() {
        return isElementDisplayed(propOperation.getValue("ForgotYourPassword?Text"), true);
    }

    public void EnterEmailAddress(String emailAddress) {
        setText(propOperation.getValue("EmailField"), true, emailAddress);
    }

    public void EnterPassword(String password){
        setText(propOperation.getValue("PasswordField"), true, password);
    }

    public void ClickOnLoginButton(){
        clickOnElement(propOperation.getValue("LoginButtonBewloForgotPassword"), true);
    }

    public boolean isFindTrustedChildCareProvidersVisible(){
        return isElementVisible(propOperation.getValue("FindTrustedChildCareProvidersTextOnDashboard"));
    }
}

























