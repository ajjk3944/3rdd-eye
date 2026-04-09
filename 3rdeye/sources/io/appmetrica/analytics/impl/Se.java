package io.appmetrica.analytics.impl;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.Locale;

/* loaded from: classes3.dex */
public abstract class Se {

    /* renamed from: a, reason: collision with root package name */
    public static final SafePackageManager f40106a = new SafePackageManager();

    /* renamed from: b, reason: collision with root package name */
    public static final Ne f40107b = new Ne();

    /* renamed from: c, reason: collision with root package name */
    public static final Oe f40108c = new Oe();

    /* renamed from: d, reason: collision with root package name */
    public static final Pe f40109d = new Pe(2);

    public static String a(Locale locale) {
        String language = locale.getLanguage();
        String country = locale.getCountry();
        StringBuilder sb = new StringBuilder(language);
        String script = locale.getScript();
        if (!TextUtils.isEmpty(script)) {
            sb.append('-');
            sb.append(script);
        }
        if (!TextUtils.isEmpty(country)) {
            sb.append('_');
            sb.append(country);
        }
        return sb.toString();
    }

    public static Re a(ConnectivityManager connectivityManager) {
        NetworkInfo networkInfo;
        Re re = Re.UNDEFINED;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (!AndroidUtils.isApiAchieved(29) ? !(activeNetwork != null && ((networkInfo = connectivityManager.getNetworkInfo(activeNetwork)) == null || networkInfo.isConnected())) : activeNetwork == null) {
            return Re.OFFLINE;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        if (networkCapabilities != null) {
            for (Integer num : f40108c.f40333a.keySet()) {
                if (networkCapabilities.hasTransport(num.intValue())) {
                    return (Re) f40108c.a(num);
                }
            }
        }
        return re;
    }
}
