package com.yandex.mobile.ads.impl;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class p9 {

    /* renamed from: a, reason: collision with root package name */
    private final zk f31680a;

    public p9(zk biddingSettings) {
        kotlin.jvm.internal.l.f(biddingSettings, "biddingSettings");
        this.f31680a = biddingSettings;
    }

    public final n9 a(String str) {
        Object next;
        Iterator<T> it = this.f31680a.c().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (kotlin.jvm.internal.l.b(((n9) next).e(), str)) {
                break;
            }
        }
        return (n9) next;
    }
}
