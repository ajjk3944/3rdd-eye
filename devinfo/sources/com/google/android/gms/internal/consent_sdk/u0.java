package com.google.android.gms.internal.consent_sdk;

import java.util.Iterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class u0 extends r0 {

    /* renamed from: h, reason: collision with root package name */
    public static final Object[] f19530h;

    /* renamed from: i, reason: collision with root package name */
    public static final u0 f19531i;

    /* renamed from: c, reason: collision with root package name */
    public final transient Object[] f19532c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f19533d;

    /* renamed from: e, reason: collision with root package name */
    public final transient Object[] f19534e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int f19535f;
    public final transient int g;

    static {
        Object[] objArr = new Object[0];
        f19530h = objArr;
        f19531i = new u0(0, 0, 0, objArr, objArr);
    }

    public u0(int i4, int i10, int i11, Object[] objArr, Object[] objArr2) {
        this.f19532c = objArr;
        this.f19533d = i4;
        this.f19534e = objArr2;
        this.f19535f = i10;
        this.g = i11;
    }

    @Override // com.google.android.gms.internal.consent_sdk.n0
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.f19532c;
        int i4 = this.g;
        System.arraycopy(objArr2, 0, objArr, 0, i4);
        return i4;
    }

    @Override // com.google.android.gms.internal.consent_sdk.n0
    public final int c() {
        return this.g;
    }

    @Override // com.google.android.gms.internal.consent_sdk.n0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        Object[] objArr = this.f19534e;
        if (objArr.length == 0) {
            return false;
        }
        int iRotateLeft = (int) (Integer.rotateLeft((int) (obj.hashCode() * (-862048943)), 15) * 461845907);
        while (true) {
            int i4 = iRotateLeft & this.f19535f;
            Object obj2 = objArr[i4];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iRotateLeft = i4 + 1;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.n0
    public final int d() {
        return 0;
    }

    @Override // com.google.android.gms.internal.consent_sdk.n0
    public final Object[] f() {
        return this.f19532c;
    }

    @Override // com.google.android.gms.internal.consent_sdk.r0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f19533d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        q0 t0Var = this.f19502b;
        if (t0Var == null) {
            o0 o0Var = q0.f19473b;
            int i4 = this.g;
            t0Var = i4 == 0 ? t0.f19517e : new t0(this.f19532c, i4);
            this.f19502b = t0Var;
        }
        return t0Var.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.g;
    }
}
