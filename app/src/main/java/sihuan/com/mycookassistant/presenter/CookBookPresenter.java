package sihuan.com.mycookassistant.presenter;

import sihuan.com.mycookassistant.base.RxPresenter;
import sihuan.com.mycookassistant.presenter.contract.CookBookContract;
import sihuan.com.mycookassistant.view.CookBookView;

/**
 * sihuan.com.mycookassistant.presenter
 * Created by sihuan on 2016/10/25.
 */

public class CookBookPresenter extends RxPresenter implements CookBookContract.Presenter {

    private CookBookView mView;


    public CookBookPresenter(CookBookView view) {
        mView = view;
        mView.setPresenter(this);
        mView.initNavigationDrawer();
//        getTabData();
    }

//    @Override
//    public void getTabData() {
//
//    }


}
