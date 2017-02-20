package services;

import services.impl.EmarketDataServiceFake;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by An on 2/20/2017.
 */
@Singleton
public class ServiceFactory {
    private EmarketDataServiceFake emarketDataServiceFake;

    @Inject
    public ServiceFactory(EmarketDataServiceFake emarketDataServiceFake) {
        this.emarketDataServiceFake =emarketDataServiceFake;
    }

    public EmarketDataService getEmarketDataService() {
        return emarketDataServiceFake;
    }
}
