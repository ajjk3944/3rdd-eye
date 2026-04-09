package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* loaded from: classes3.dex */
public final class Nm {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f39913a;

    public Nm() {
        HashMap map = new HashMap();
        this.f39913a = map;
        Hm hm = new Hm();
        Im im = new Im();
        Jm jm = new Jm();
        Km km = new Km();
        Lm lm = new Lm();
        map.put(C4647gm.class, hm);
        map.put(Z1.class, im);
        map.put(C4873pf.class, jm);
        map.put(C5038w2.class, km);
        map.put(O3.class, lm);
    }

    public static Om a(Class cls) {
        return (Om) Mm.f39879a.f39913a.get(cls);
    }
}
