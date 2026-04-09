package com.bytedance.sdk.component.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import java.util.Locale;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ryl {

    @SuppressLint({"StaticFieldLeak"})
    private static Context ouw;

    public static void ouw(Context context, String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        try {
            Configuration configuration = new Configuration(context.getResources().getConfiguration());
            configuration.setLocale(new Locale(str, str2));
            ouw = context.createConfigurationContext(configuration);
        } catch (Throwable th2) {
            ko.yu(th2.getMessage());
        }
        vpp.ouw(ouw);
    }
}
