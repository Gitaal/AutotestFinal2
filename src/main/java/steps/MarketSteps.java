package steps;

import pages.MarketPage;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by OWL on 27.01.2018.
 */
public class MarketSteps {

    @Step("Выбран раздел - Электроника")
    public void stepSelectElectronic(){
        new MarketPage().selectElectronic();
    }

    @Step("Выбран раздел - Наушники")
    public void stepSelectHeaders(){
        new MarketPage().selectHeadset();
    }
}
