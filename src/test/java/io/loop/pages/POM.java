package io.loop.pages;

public class POM {
    private LoginPage loginPage;
    private GoogleSearchPage googleSearchPage;
    private WikiSearchPage wikiSearchPage;
    private ProductPage productPage;
    private SmartBearOrderPage smartBearPages;
    private DocuportHomePageForClient docuportHomePageForClient;

    public SmartBearOrderPage getSmartBearPages() {
        if(smartBearPages==null){
            smartBearPages = new SmartBearOrderPage();
        }
        return smartBearPages;
    }

    public LoginPage getLoginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }

    public GoogleSearchPage getGoogleSearchPage() {
        if (googleSearchPage == null) {
            googleSearchPage = new GoogleSearchPage();
        }
        return googleSearchPage;
    }

    public WikiSearchPage getWikiSearchPage() {
        if (wikiSearchPage == null) {
            wikiSearchPage = new WikiSearchPage();
        }
        return wikiSearchPage;
    }
    public ProductPage getProductPage() {
        if (productPage == null) {
            productPage = new ProductPage();
        }
        return productPage;
    }
    public DocuportHomePageForClient getDocuportHomePageForClient() {
        if (docuportHomePageForClient == null) {
            docuportHomePageForClient = new DocuportHomePageForClient();
        }
        return docuportHomePageForClient;
    }

}
