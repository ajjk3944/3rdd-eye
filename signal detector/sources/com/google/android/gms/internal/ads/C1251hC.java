package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.AbstractMap;

/* renamed from: com.google.android.gms.internal.ads.hC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1251hC extends LB {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1305iC f14463c;

    public C1251hC(C1305iC c1305iC) {
        this.f14463c = c1305iC;
    }

    @Override // com.google.android.gms.internal.ads.HB
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        C1305iC c1305iC = this.f14463c;
        AbstractC0582Jp.k0(i, c1305iC.f14682f);
        Object[] objArr = c1305iC.f14681e;
        int i3 = i + i;
        Object obj = objArr[i3];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i3 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14463c.f14682f;
    }
}
