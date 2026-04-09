package com.yandex.mobile.ads.impl;

import java.util.Comparator;

/* renamed from: com.yandex.mobile.ads.impl.s2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4196s2 {

    /* renamed from: com.yandex.mobile.ads.impl.s2$a */
    public static final class a implements Comparator<zs> {
        @Override // java.util.Comparator
        public final int compare(zs zsVar, zs zsVar2) {
            zs first = zsVar;
            zs second = zsVar2;
            kotlin.jvm.internal.l.f(first, "first");
            kotlin.jvm.internal.l.f(second, "second");
            return (int) v9.h.M(first.b().b() - second.b().b(), -1L, 1L);
        }
    }
}
