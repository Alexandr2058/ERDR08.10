package pages;

import io.qameta.allure.Step;
import libs.ActionsWithOurElements;
import libs.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KrimOffensePage extends ParentPage {

    @FindBy (id = "control_42")
    private WebElement statement;

    @FindBy (id = "icon_44")
    private WebElement calendars;

    @FindBy (id = "control_52")
    private WebElement lastName;

    @FindBy (id = "control_54")
    private WebElement name;

    @FindBy (id = "control_56")
    private WebElement patronymic;

    @FindBy (id = "item_0_63")
    private WebElement gender;

    @FindBy (id = "control_65")
    private WebElement birthDay;

    @FindBy (id = "control_67")
    private WebElement adress;

    @FindBy (id = "control_83")
    private WebElement dataOffense;

    @FindBy (id = "item_3_85")
    private WebElement osoba;

    @FindBy (id = "control_87")
    private WebElement story;

    @FindBy (xpath = ".//*[@id='image_377']")
    private WebElement buttonOfQual;

    @FindBy (xpath = ".//*[@id='tpHead_14']")
    private String qualificationOfaCrime;

    @FindBy (id = "filter1_column1_14")
    private WebElement numQual;

    @FindBy (xpath = ".//*[@title='Вибрати виділений запис']")
    private WebElement choose;

    @FindBy (id = "group_382")
    private String window;

    @FindBy (id = "group_382")
    private WebElement windowW;

    @FindBy (id = "image_383")
    private WebElement buttonArea;

    @FindBy (id = "th_code_17")
    private String territoryOfOffense;

    @FindBy (xpath = "/html/body/div[4]/table/tbody/tr[1]/td/div/table/tbody/tr[2]/td/div/table/tbody[2]/tr[9]/td[3]/a/div")
    private WebElement city;

    @FindBy (xpath = "/html/body/div[4]/table/tbody/tr[1]/td/div/table/tbody/tr[2]/td/div/table/tbody[2]/tr[9]/td[5]/a/div")
    private WebElement district;

    @FindBy (id = "zenlbl_100")
    private WebElement okno;

    @FindBy (id = "btn_2_16")
    private WebElement featurePP;

    @FindBy (id = "control_362")
    private WebElement saveProv;

    @FindBy (id = "popup_ok")
    private WebElement Ok;

    @FindBy (id = "btn_96")
    private WebElement buttPlur;

    @FindBy (id = "chbox_0_96")
    private WebElement qualPlurCrim;

    @FindBy (id = "btn_3_16")
    private WebElement victim;

    @FindBy (id = "control_366")
    private WebElement exitProv;

    @FindBy (id = "textRadio_2_90")
    private WebElement changeCrimeY;

    @FindBy (id = "control_366")
    private WebElement exitTub;

    @FindBy (id = "control_362")
    private WebElement sendingReg;

    @FindBy (id = "btn_32")
    private WebElement butInto;

    @FindBy (id = "item_2_32")
    private WebElement pastYear;

    @FindBy (id = "control_35")
    private WebElement numOfCase;

    @FindBy (id = "control_37")
    private WebElement calendarCS;

    @FindBy (id = "control_44")
    private WebElement pastDateArea;

    @FindBy (id = "zenlbl_67")
    private WebElement adr;

    @FindBy (id = "image_389")
    private WebElement butServ;

    @FindBy (id = "th_column1_14")
    private String codeServ;

    @FindBy (id = "filter1_column1_14")
    private WebElement codeField;

    @FindBy (id = "input_400")
    private WebElement windowPP;

    @FindBy (id = "textRadio_2_46")
    private WebElement legalPers;

    @FindBy (id = "control_73")
    private WebElement nameLP;

    @FindBy (id = "control_75")
    private WebElement codeLP;

    @FindBy (id = "control_77")
    private WebElement legAddress;

    @FindBy (id = "control_79")
    private WebElement actAddress;

    @FindBy (id = "caption_3_46")
    private WebElement anothSource;

    @FindBy (id = "image_371")
    private WebElement anSourceBut;

    @FindBy (id = "item_1_32")
    private WebElement foreignCountries;

    @FindBy (id = "control_363")
    private WebElement registr;

    @FindBy (id = "control_363")
    private WebElement regBut;

    @FindBy (id = "control_362")
    private WebElement saveEditProv;

    @FindBy (id = "btn_1_8")
    private WebElement but;

    @FindBy (id = "control_42")
    private String kjhj;

    @FindBy (id = "control_166")
    private WebElement saveDamage;

    @FindBy (id = "control_224")
    private WebElement addNote;

    @FindBy (id = "filter1_code_14")
    private WebElement araeAddNot;

    public KrimOffensePage(WebDriver webDriver) {
        super(webDriver);
    }

    @Step
    public void selectKRODRInDD() {
        try {
            Thread.sleep(2000);
            actionsWithOurElements.selectDataInDD(".//*[@id='btn_27']");
            logger.info("kerODR was selected");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(1500);
            actionsWithOurElements.selectDataInDD(".//*[@id='chbox_0_27']");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        webDriver.findElement(By.id("input_27")).sendKeys(Keys.DOWN, Keys.ENTER);
    }

    @Step
    public void selectKerOP() {
        try {
            Thread.sleep(2000);
            webDriver.findElement(By.id("control_42")).click();
            actionsWithOurElements.selectDataInDD(".//*[@id='btn_29']");
            actionsWithOurElements.selectDataInDD(".//*[@id='chbox_0_29']");
            logger.info("kerOP was selected");
        } catch (Exception e) {
            e.printStackTrace();
        }
        webDriver.findElement(By.id("input_29")).sendKeys(Keys.DOWN, Keys.ENTER);
    }

    @Step
    public void enterNumStatement() {
        actionsWithOurElements.enterTextIntoElement(statement, "1" + Utils.getDateAndTime("HH:mm:ss"));
        logger.info("number of a statement was added");
    }

    @Step
    public void enterDate() {
        try {
            actionsWithOurElements.clickOnElement(calendars);
            actionsWithOurElements.enterDate();
            logger.info("Date of receipt of the application was added");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Step
    public void enterLastName() {
        try {
            Thread.sleep(1000);
            actionsWithOurElements.enterTextIntoElement(lastName, "иванов");
            logger.info("last name was added");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Step
    public void enterName() {
        actionsWithOurElements.enterTextIntoElement(name, ActionsWithOurElements.getRandomName());
        logger.info("name was added");
    }

    @Step
    public void patronymic() {
        actionsWithOurElements.enterTextIntoElement(patronymic, "иванович");
        logger.info("patronymic was added");
    }

    @Step
    public void selectGender() {
        try {
            Thread.sleep(2500);
            webDriver.findElement(By.id("btn_63")).click();
            actionsWithOurElements.clickOnElement(gender);
            logger.info("gender was selected");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Step
    public void selectDataOfBirth() {
        actionsWithOurElements.enterTextIntoElement(birthDay, "01.05.1980");
        logger.info("Data of birth was selected");
    }

    @Step
    public void enterAdress(String adressa) {
        try {
            Thread.sleep(2000);
        actionsWithOurElements.windowSearchs(adr);
        try {
            Thread.sleep(3000);
            actionsWithOurElements.enterTextIntoElement(adress, adressa);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logger.info("adress was added");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Step
    public void offense() {
        actionsWithOurElements.enterTextIntoElement(dataOffense, "01.05.2000 01:00:00");
        logger.info("offense was entered");
    }//Правопорушення учинено

    @Step
    public void personWhoCriminal() {
//        actionsWithOurElements.scroll();
        try {
            Thread.sleep(3000);
            webDriver.findElement(By.id("btn_85")).click();
            actionsWithOurElements.clickOnElement(osoba);
            logger.info("person was selected");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Step
    public void enterStory() {
        actionsWithOurElements.enterTextIntoElement(story, "фабула " + Utils.getDateAndTime("HH:mm"));
        logger.info("story was entered");
    }

    @Step
    public void qualificationCrime(String article) {
        actionsWithOurElements.clickOnElement(buttonOfQual);
        actionsWithOurElements.windowSearch(qualificationOfaCrime);
        try {
            Thread.sleep(3000);
            actionsWithOurElements.enterTextIntoElement(numQual, article);
            webDriver.findElement(By.id("filter1_column1_14")).sendKeys(Keys.ENTER);
        } catch (Exception e) {
            e.printStackTrace();
        }
        actionsWithOurElements.clickOnElement(choose);
        actionsWithOurElements.windowSearch(window);
    }

    @Step
    public void chooseArea() {
        actionsWithOurElements.clickOnElement(buttonArea);
        actionsWithOurElements.windowSearch(territoryOfOffense);
        actionsWithOurElements.clickOnElement(city);
        actionsWithOurElements.clickOnElement(district);
        logger.info("area was added");
        actionsWithOurElements.windowSearch(window);
    }

    @Step
    public void environmentalOffenses() {
        try {
            Thread.sleep(2000);
            actionsWithOurElements.clickOnElement(okno);
            webDriver.findElement(By.xpath(".//*[@id='btn_100']")).click();
            Thread.sleep(1000);
            webDriver.findElement(By.id("input_100")).sendKeys(Keys.DOWN, Keys.DOWN, Keys.ENTER);
            logger.info("offenses was added");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Step
    public void offenseATO() {
        try {
            Thread.sleep(2000);
            actionsWithOurElements.clickOnElement(okno);
            webDriver.findElement(By.xpath(".//*[@id='btn_102']")).click();
            Thread.sleep(1000);
            webDriver.findElement(By.id("input_102")).sendKeys(Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.ENTER);
            logger.info("offenses was added");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Step
    public void tortureOfPersons() {
        try {
            Thread.sleep(2000);
            actionsWithOurElements.clickOnElement(okno);
            webDriver.findElement(By.xpath(".//*[@id='btn_104']")).click();
            Thread.sleep(1000);
            webDriver.findElement(By.id("input_104")).sendKeys(Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.ENTER);
            logger.info("type torture of person was selected");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Step
    public void switchToTabFeaturePP() {
        try {
            Thread.sleep(1000);
            actionsWithOurElements.clickOnElement(featurePP);
            logger.info("tab Characteristics Of Criminal Offense was opened");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Step
    public void save() {
        try {
            Thread.sleep(1500);
            actionsWithOurElements.windowSearchs(saveProv);
//            actionsWithOurElements.clickOnElement(saveProv);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            actionsWithOurElements.clickOnElement(Ok);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Step
    public void pluralQualCrime() {
        try {
            Thread.sleep(1000);
            actionsWithOurElements.clickOnElement(buttPlur);
            Thread.sleep(1000);
            actionsWithOurElements.clickOnElement(qualPlurCrim);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        webDriver.findElement(By.id("input_96")).sendKeys(Keys.ENTER);
    }

    @Step
    public void switchToTabVictim() {
        try {
            Thread.sleep(1000);
            actionsWithOurElements.clickOnElement(victim);
            logger.info("tab victim was opened");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Step
    public void crim1960() {
        actionsWithOurElements.clickOnElement(changeCrimeY);
    }


    @Step
    public void sendToReg() {
        actionsWithOurElements.windowSearchs(exitTub);
        actionsWithOurElements.clickOnElement(sendingReg);
        try {
            Thread.sleep(1500);
            actionsWithOurElements.clickOnElement(Ok);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Step
    public void sendToRegWithoutOk () {
        actionsWithOurElements.windowSearchs(exitTub);
        actionsWithOurElements.clickOnElement(sendingReg);
    }

    @Step
    public void takeIntoAccount() {
        try {
            Thread.sleep(2000);
            actionsWithOurElements.clickOnElement(butInto);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actionsWithOurElements.clickOnElement(pastYear);
    }

    @Step
    public void numberOfCriminalCase() {
        actionsWithOurElements.enterTextIntoElement(numOfCase, "2" + Utils.getDateAndTime("HH:mm"));
    }

    @Step
    public void dateOfInitiationOfCriminalCase() {
        actionsWithOurElements.enterTextIntoElement(calendarCS, "01.07.2000");
    }

    @Step
    public void enterDatePast() {
        actionsWithOurElements.enterTextIntoElement(pastDateArea, "01.06.2000");
    }

    @Step
    public void saveWOk() {
        try {
            Thread.sleep(1000);
//            actionsWithOurElements.windowSearchs(exitTub);
            actionsWithOurElements.clickOnElement(saveProv);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Step
    public void detectByServ(String codServ) {
        actionsWithOurElements.clickOnElement(butServ);
        actionsWithOurElements.windowSearch(codeServ);
        try {
            Thread.sleep(1000);
            actionsWithOurElements.enterTextIntoElement(codeField, codServ);
            webDriver.findElement(By.id("filter1_column1_14")).sendKeys(Keys.ENTER);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actionsWithOurElements.clickOnElement(choose);
        actionsWithOurElements.windowSearchs(windowPP);
    }

    @Step
    public void selectLegPers() {
        actionsWithOurElements.clickOnElement(legalPers);
    }

    @Step
    public void enterNameLegPers() {
        actionsWithOurElements.enterTextIntoElement(nameLP, "Роги та копита");
    }

    @Step
    public void enterCodeLP() {
        actionsWithOurElements.enterTextIntoElement(codeLP, "7873616315");
    }

    @Step
    public void enterLegAddress() {
        actionsWithOurElements.enterTextIntoElement(legAddress, "Печенізька");
    }

    @Step
    public void actualAddress() {
        actionsWithOurElements.enterTextIntoElement(actAddress, "Солом");
    }

    @Step
    public void selectAnothSource() {
        actionsWithOurElements.clickOnElement(anothSource);
    }

    @Step
    public void valueAnotherSource(String codeSource) {
        actionsWithOurElements.clickOnElement(anSourceBut);
        actionsWithOurElements.windowSearch(codeServ);
        try {
            Thread.sleep(1000);
            actionsWithOurElements.enterTextIntoElement(codeField, codeSource);
            webDriver.findElement(By.id("filter1_column1_14")).sendKeys(Keys.ENTER);
        } catch (Exception e) {
            e.printStackTrace();
        }
        actionsWithOurElements.clickOnElement(choose);
        actionsWithOurElements.windowSearchs(windowW);
    }

    @Step
    public void takeIntoAccountID() {
        try {
            Thread.sleep(2000);
            actionsWithOurElements.clickOnElement(butInto);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actionsWithOurElements.clickOnElement(foreignCountries);
    }

    @Step
    public void sendForRegistr() {
        try {
            Thread.sleep(3000);
            actionsWithOurElements.windowSearchs(registr);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(1000);
            actionsWithOurElements.clickOnElement(regBut);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(1000);
            actionsWithOurElements.clickOnElement(Ok);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Step
    public void withdrawFromReg() {
        try {
            Thread.sleep(2000);
            actionsWithOurElements.windowSearchs(registr);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//    WebDriverWait wait = new WebDriverWait(webDriver, 10);
//        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(regBut));
        try {
            Thread.sleep(2000);
            actionsWithOurElements.clickOnElement(regBut);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(1000);
            actionsWithOurElements.clickOnElement(Ok);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Step
    public void saveEdProc() {
        try {
            Thread.sleep(1500);
//            actionsWithOurElements.windowSearchs(exitProv);
            actionsWithOurElements.clickOnElement(saveEditProv);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            actionsWithOurElements.clickOnElement(Ok);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Step
    public void saveDamageCard() {
        actionsWithOurElements.clickOnElement(saveDamage);
    }

    @Step
    public void chooseWind() {
        try {
            Thread.sleep(2500);
            actionsWithOurElements.windowSearchThre(but);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Step
    public void serchQualCrimeField() {
        actionsWithOurElements.windowSearch(kjhj);
        try {
            Thread.sleep(2500);
            actionsWithOurElements.scrollJS();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Step
    public void addNotes() {
        actionsWithOurElements.clickOnElement(addNote);
        try {
            Thread.sleep(1000);
            actionsWithOurElements.windowSearchThre(araeAddNot);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
