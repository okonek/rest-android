package org.jbossoutreach.restandroid;

import android.arch.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {
    final SingleLiveEvent<NavigationItem> navigationLiveData = new SingleLiveEvent<>();

    public MainActivityViewModel() {
        super();

        navigationLiveData.setValue(NavigationItem.REQUEST);
    }

    void onNavigationItemClicked(NavigationItem item) {
        navigationLiveData.setValue(item);
    }

    enum NavigationItem {
        REQUEST,
        HISTORY
    }
}
