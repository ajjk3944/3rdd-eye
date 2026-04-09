package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* renamed from: com.google.android.gms.internal.ads.aB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0868aB implements Serializable, ZA {

    /* renamed from: a, reason: collision with root package name */
    public final transient C1086eB f13079a = new C1086eB();

    /* renamed from: b, reason: collision with root package name */
    public final ZA f13080b;

    /* renamed from: c, reason: collision with root package name */
    public volatile transient boolean f13081c;

    /* renamed from: d, reason: collision with root package name */
    public transient Object f13082d;

    public C0868aB(ZA za) {
        this.f13080b = za;
    }

    @Override // com.google.android.gms.internal.ads.ZA
    public final Object a() {
        if (!this.f13081c) {
            synchronized (this.f13079a) {
                try {
                    if (!this.f13081c) {
                        Object objA = this.f13080b.a();
                        this.f13082d = objA;
                        this.f13081c = true;
                        return objA;
                    }
                } finally {
                }
            }
        }
        return this.f13082d;
    }

    public final String toString() {
        Object objN;
        if (this.f13081c) {
            String strValueOf = String.valueOf(this.f13082d);
            objN = AbstractC1135f5.n(new StringBuilder(strValueOf.length() + 25), "<supplier that returned ", strValueOf, ">");
        } else {
            objN = this.f13080b;
        }
        String string = objN.toString();
        return AbstractC1135f5.n(new StringBuilder(string.length() + 19), "Suppliers.memoize(", string, ")");
    }
}
