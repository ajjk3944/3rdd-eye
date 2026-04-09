package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class gm1 extends AbstractSet {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11554a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ km1 f11555b;

    public /* synthetic */ gm1(km1 km1Var, int i4) {
        this.f11554a = i4;
        this.f11555b = km1Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f11554a) {
            case 0:
                this.f11555b.clear();
                break;
            default:
                this.f11555b.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        jm1 jm1VarA;
        switch (this.f11554a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                km1 km1Var = this.f11555b;
                km1Var.getClass();
                Object key = entry.getKey();
                jm1 jm1Var = null;
                if (key != null) {
                    try {
                        jm1VarA = km1Var.a(key, false);
                    } catch (ClassCastException unused) {
                    }
                } else {
                    jm1VarA = null;
                }
                if (jm1VarA != null && Objects.equals(jm1VarA.g, entry.getValue())) {
                    jm1Var = jm1VarA;
                }
                return jm1Var != null;
            default:
                return this.f11555b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f11554a) {
            case 0:
                return new fm1(this.f11555b, 0);
            default:
                return new fm1(this.f11555b, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        jm1 jm1VarA;
        switch (this.f11554a) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    km1 km1Var = this.f11555b;
                    km1Var.getClass();
                    Object key = entry.getKey();
                    jm1 jm1Var = null;
                    if (key != null) {
                        try {
                            jm1VarA = km1Var.a(key, false);
                        } catch (ClassCastException unused) {
                        }
                    } else {
                        jm1VarA = null;
                    }
                    if (jm1VarA != null && Objects.equals(jm1VarA.g, entry.getValue())) {
                        jm1Var = jm1VarA;
                    }
                    if (jm1Var != null) {
                        km1Var.b(jm1Var, true);
                        break;
                    }
                }
                break;
            default:
                km1 km1Var2 = this.f11555b;
                km1Var2.getClass();
                jm1 jm1VarA2 = null;
                if (obj != null) {
                    try {
                        jm1VarA2 = km1Var2.a(obj, false);
                    } catch (ClassCastException unused2) {
                    }
                }
                if (jm1VarA2 != null) {
                    km1Var2.b(jm1VarA2, true);
                }
                if (jm1VarA2 != null) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f11554a) {
        }
        return this.f11555b.f13203c;
    }
}
