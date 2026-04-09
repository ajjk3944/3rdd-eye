package com.yandex.mobile.ads.impl;

import android.util.Log;
import c9.C2092m;
import c9.C2097r;
import c9.C2099t;
import io.appmetrica.analytics.impl.Oo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class y82 {

    /* renamed from: a, reason: collision with root package name */
    private static final List<String> f35661a = C2092m.W("The integrated version of the Yandex Mobile Ads SDK is outdated.", "Please update com.yandex.android:mobileads to the latest version.");

    private static String a(int i, String str) {
        return Oo.f("* ", str, y9.n.W(i - str.length(), " "), " *");
    }

    public static void b() {
        Integer numValueOf;
        ArrayList arrayListY0 = C2097r.y0(a(), C2097r.y0(C2092m.W("Learn more about the latest version of the SDK here:", "https://yandex.ru/dev/mobile-ads/doc/android/quick-start/android-ads-component.html"), f35661a));
        Iterator it = arrayListY0.iterator();
        String strU0 = null;
        if (it.hasNext()) {
            numValueOf = Integer.valueOf(((String) it.next()).length());
            while (it.hasNext()) {
                Integer numValueOf2 = Integer.valueOf(((String) it.next()).length());
                if (numValueOf.compareTo(numValueOf2) < 0) {
                    numValueOf = numValueOf2;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            String strW = y9.n.W(iIntValue + 4, "*");
            ArrayList arrayList = new ArrayList(C2092m.T(arrayListY0, 10));
            Iterator it2 = arrayListY0.iterator();
            while (it2.hasNext()) {
                arrayList.add(a(iIntValue, (String) it2.next()));
            }
            strU0 = C2097r.u0(C2097r.z0(C2097r.y0(arrayList, E.u.G(strW)), strW), "\n", null, null, null, 62);
        }
        Log.e("Yandex Mobile Ads", "Yandex Mobile Ads version validation\n" + strU0 + "\n");
    }

    private static List a() {
        if (bm.a() != null) {
            return E.u.G("Changelog: " + bm.a());
        }
        return C2099t.f18581b;
    }
}
