package com.bytedance.sdk.component.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import java.util.Locale;

/* loaded from: classes.dex */
public class sup {

    @SuppressLint({"StaticFieldLeak"})
    private static Context emc;

    public static void emc(Context context, String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        try {
            emc = context.createConfigurationContext(ypw(context, str, str2));
        } catch (Throwable th) {
            th.getMessage();
        }
        rie.emc(emc);
    }

    private static Configuration ypw(Context context, String str, String str2) {
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(new Locale(str, str2));
        return configuration;
    }
}
