package com.github.appintro;

/* compiled from: AppIntroViewPagerListener.kt */
/* loaded from: classes.dex */
public interface AppIntroViewPagerListener {
    boolean onCanRequestNextPage();

    void onIllegallyRequestedNextPage();

    void onUserRequestedPermissionsDialog();
}
