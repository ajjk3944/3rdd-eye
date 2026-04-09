package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f51 extends e51 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11006d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final transient Object f11007e;

    public f51(g51 g51Var) {
        this.f11007e = g51Var;
    }

    @Override // com.google.android.gms.internal.ads.t41
    public final h61 a() {
        switch (this.f11006d) {
            case 0:
                return new a51((g51) this.f11007e);
            default:
                return new k51(this.f11007e);
        }
    }

    @Override // com.google.android.gms.internal.ads.t41, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f11006d) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    g51 g51Var = (g51) this.f11007e;
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    Collection collection = (Collection) ((z51) g51Var.d()).get(key);
                    if (collection != null && collection.contains(value)) {
                        return true;
                    }
                }
                return false;
            default:
                return this.f11007e.equals(obj);
        }
    }

    @Override // com.google.android.gms.internal.ads.e51, com.google.android.gms.internal.ads.t41
    public x41 g() {
        switch (this.f11006d) {
            case 1:
                return x41.l(this.f11007e);
            default:
                return super.g();
        }
    }

    @Override // com.google.android.gms.internal.ads.e51, java.util.Collection, java.util.Set
    public int hashCode() {
        switch (this.f11006d) {
            case 1:
                return this.f11007e.hashCode();
            default:
                return super.hashCode();
        }
    }

    @Override // com.google.android.gms.internal.ads.t41
    public final boolean i() {
        switch (this.f11006d) {
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        switch (this.f11006d) {
            case 0:
                return new a51((g51) this.f11007e);
            default:
                return new k51(this.f11007e);
        }
    }

    @Override // com.google.android.gms.internal.ads.t41
    public int j(Object[] objArr, int i4) {
        switch (this.f11006d) {
            case 1:
                objArr[i4] = this.f11007e;
                return i4 + 1;
            default:
                return super.j(objArr, i4);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f11006d) {
            case 0:
                return ((g51) this.f11007e).f11382e;
            default:
                return 1;
        }
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        switch (this.f11006d) {
            case 1:
                String string = this.f11007e.toString();
                return r5.c.m(new StringBuilder(String.valueOf(string).length() + 2), "[", string, "]");
            default:
                return super.toString();
        }
    }

    public f51(Object obj) {
        obj.getClass();
        this.f11007e = obj;
    }
}
