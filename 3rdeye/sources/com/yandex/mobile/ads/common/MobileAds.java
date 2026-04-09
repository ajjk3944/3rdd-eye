package com.yandex.mobile.ads.common;

import android.content.Context;
import android.content.Intent;
import com.yandex.mobile.ads.features.debugpanel.ui.IntegrationInspectorActivity;
import com.yandex.mobile.ads.impl.ew1;
import com.yandex.mobile.ads.impl.f11;
import com.yandex.mobile.ads.impl.ml2;
import com.yandex.mobile.ads.impl.rm2;
import kotlin.jvm.internal.l;

/* loaded from: classes3.dex */
public final class MobileAds {
    public static final MobileAds INSTANCE = new MobileAds();

    private MobileAds() {
    }

    public static final void enableDebugErrorIndicator(boolean z10) {
        f11 f11Var = f11.f27170a;
        ew1.a.a().a(z10);
    }

    public static final void enableLogging(boolean z10) {
        f11.a(z10);
    }

    public static final String getLibraryVersion() {
        f11 f11Var = f11.f27170a;
        return "7.14.0";
    }

    public static final void initialize(Context context, InitializationListener initializationListener) {
        l.f(context, "context");
        l.f(initializationListener, "initializationListener");
        f11.a(context, new rm2(context), new ml2(initializationListener));
    }

    public static final void setAgeRestrictedUser(boolean z10) {
        f11 f11Var = f11.f27170a;
        ew1.a.a().c(z10);
    }

    public static final void setAppAdAnalyticsReporting(boolean z10) {
        f11 f11Var = f11.f27170a;
        ew1.a.a().d(z10);
    }

    public static final void setLocationConsent(boolean z10) {
        f11 f11Var = f11.f27170a;
        ew1.a.a().e(z10);
    }

    public static final void setUserConsent(boolean z10) {
        f11 f11Var = f11.f27170a;
        ew1.a.a().f(z10);
    }

    public static final void showDebugPanel(Context context) {
        l.f(context, "context");
        Intent intent = new Intent(context, (Class<?>) IntegrationInspectorActivity.class);
        intent.addFlags(805306368);
        context.startActivity(intent);
    }

    public static /* synthetic */ void getLibraryVersion$annotations() {
    }
}
