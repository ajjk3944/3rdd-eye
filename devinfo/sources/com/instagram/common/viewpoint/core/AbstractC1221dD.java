package com.instagram.common.viewpoint.core;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.dD, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1221dD {
    public static String[] A00 = {"M7M7680JiQXMJzeuHBUdBK3CqcsunIE3", "7YJQc0MEUr6fNb1HoLhvfznehf2fNPi1", "fqXve0BGHc", "EJDyhBK8ScH8NN0H4G45MCvGKFSIU6i3", "lE5hsHUrpnTpaSUAUiDOdKdDJm2EXpBt", "fXhWa5fzMs", "jGMjXmbPjJmsUXbAj46daPhZmilD9JtA", "gy7nSuWAyo"};
    public static final Map<String, WeakReference<C1220dC>> A01 = new HashMap();

    public static int A00() {
        Map<String, WeakReference<C1220dC>> map = A01;
        if (A00[4].charAt(3) != 'h') {
            throw new RuntimeException();
        }
        String[] strArr = A00;
        strArr[3] = "KcOG1rzwVGm5OqslsWQoAqhkYEC7FRij";
        strArr[1] = "Dhj4Lprngz6YVn4AutwbBiUWJOZdaDii";
        return map.size();
    }

    public static C1220dC A01(C1436gi c1436gi, AbstractC1601jd abstractC1601jd, int i4, InterfaceC1218dA interfaceC1218dA) throws JSONException {
        C1220dC c1220dC = new C1220dC(c1436gi, abstractC1601jd, c1436gi.A02().A0A(), i4);
        c1220dC.A0b(interfaceC1218dA);
        c1220dC.A0X();
        A01.put(abstractC1601jd.A1D(), new WeakReference<>(c1220dC));
        return c1220dC;
    }

    public static C1220dC A02(String str) {
        WeakReference<C1220dC> weakReference = A01.get(str);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static void A03(AbstractC1601jd abstractC1601jd, C1220dC c1220dC) {
        A01.put(abstractC1601jd.A1D(), new WeakReference<>(c1220dC));
    }

    public static void A04(String str) {
        A01.remove(str);
    }
}
