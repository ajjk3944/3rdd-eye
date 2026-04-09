package com.facebook.ads.redexgen.core;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.bu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC3184bu {
    public static String[] A00 = {"M7M7680JiQXMJzeuHBUdBK3CqcsunIE3", "7YJQc0MEUr6fNb1HoLhvfznehf2fNPi1", "fqXve0BGHc", "EJDyhBK8ScH8NN0H4G45MCvGKFSIU6i3", "lE5hsHUrpnTpaSUAUiDOdKdDJm2EXpBt", "fXhWa5fzMs", "jGMjXmbPjJmsUXbAj46daPhZmilD9JtA", "gy7nSuWAyo"};
    public static final Map<String, WeakReference<C3183bt>> A01 = new HashMap();

    public static int A00() {
        Map<String, WeakReference<C3183bt>> map = A01;
        if (A00[4].charAt(3) != 'h') {
            throw new RuntimeException();
        }
        String[] strArr = A00;
        strArr[3] = "KcOG1rzwVGm5OqslsWQoAqhkYEC7FRij";
        strArr[1] = "Dhj4Lprngz6YVn4AutwbBiUWJOZdaDii";
        return map.size();
    }

    public static C3183bt A01(C3272dL c3272dL, AbstractC3547hy abstractC3547hy, int i, InterfaceC3181br interfaceC3181br) throws JSONException {
        C3183bt c3183bt = new C3183bt(c3272dL, abstractC3547hy, c3272dL.A02().A0A(), i);
        c3183bt.A0b(interfaceC3181br);
        c3183bt.A0X();
        A01.put(abstractC3547hy.A17(), new WeakReference<>(c3183bt));
        return c3183bt;
    }

    public static C3183bt A02(String str) {
        WeakReference<C3183bt> weakReference = A01.get(str);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static void A03(AbstractC3547hy abstractC3547hy, C3183bt c3183bt) {
        A01.put(abstractC3547hy.A17(), new WeakReference<>(c3183bt));
    }

    public static void A04(String str) {
        A01.remove(str);
    }
}
