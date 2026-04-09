package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class m31 implements Serializable, l31 {

    /* renamed from: a, reason: collision with root package name */
    public final transient q31 f13747a = new q31();

    /* renamed from: b, reason: collision with root package name */
    public final l31 f13748b;

    /* renamed from: c, reason: collision with root package name */
    public volatile transient boolean f13749c;

    /* renamed from: d, reason: collision with root package name */
    public transient Object f13750d;

    public m31(l31 l31Var) {
        this.f13748b = l31Var;
    }

    @Override // com.google.android.gms.internal.ads.l31
    public final Object b() {
        if (!this.f13749c) {
            synchronized (this.f13747a) {
                try {
                    if (!this.f13749c) {
                        Object objB = this.f13748b.b();
                        this.f13750d = objB;
                        this.f13749c = true;
                        return objB;
                    }
                } finally {
                }
            }
        }
        return this.f13750d;
    }

    public final String toString() {
        Object objM;
        if (this.f13749c) {
            String strValueOf = String.valueOf(this.f13750d);
            objM = r5.c.m(new StringBuilder(strValueOf.length() + 25), "<supplier that returned ", strValueOf, ">");
        } else {
            objM = this.f13748b;
        }
        String string = objM.toString();
        return r5.c.m(new StringBuilder(string.length() + 19), "Suppliers.memoize(", string, ")");
    }
}
