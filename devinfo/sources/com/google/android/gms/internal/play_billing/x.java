package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class x extends t {

    /* renamed from: c, reason: collision with root package name */
    public final transient s f20246c;

    /* renamed from: d, reason: collision with root package name */
    public final transient Object[] f20247d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f20248e;

    public x(s sVar, Object[] objArr, int i4) {
        this.f20246c = sVar;
        this.f20247d = objArr;
        this.f20248e = i4;
    }

    @Override // com.google.android.gms.internal.play_billing.n
    public final int a(Object[] objArr) {
        return f().a(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f20246c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return f().listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.t
    public final q j() {
        return new w(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f20248e;
    }
}
