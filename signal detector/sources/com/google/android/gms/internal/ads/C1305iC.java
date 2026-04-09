package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.iC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1305iC extends RB {

    /* renamed from: d, reason: collision with root package name */
    public final transient C1465lC f14680d;

    /* renamed from: e, reason: collision with root package name */
    public final transient Object[] f14681e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int f14682f;

    public C1305iC(C1465lC c1465lC, Object[] objArr, int i) {
        this.f14680d = c1465lC;
        this.f14681e = objArr;
        this.f14682f = i;
    }

    @Override // com.google.android.gms.internal.ads.HB
    public final AbstractC1896tC a() {
        return e().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.HB, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f14680d.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.HB
    public final boolean f() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.HB
    public final int g(Object[] objArr, int i) {
        return e().g(objArr, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return e().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.RB
    public final LB l() {
        return new C1251hC(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f14682f;
    }
}
