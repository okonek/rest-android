package org.jbossoutreach.restandroid;

import android.content.Intent;
import android.support.v4.app.Fragment;

public abstract class MainFragment extends Fragment {
    protected abstract void onNewIntent(Intent intent);
}
