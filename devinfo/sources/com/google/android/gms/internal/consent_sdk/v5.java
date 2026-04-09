package com.google.android.gms.internal.consent_sdk;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class v5 implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final w5 f19545a;

    /* renamed from: b, reason: collision with root package name */
    public w5 f19546b;

    public v5(w5 w5Var) {
        this.f19545a = w5Var;
        if (w5Var.e()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f19546b = (w5) w5Var.f(4);
    }

    public final w5 a() {
        w5 w5VarB = b();
        w5VarB.getClass();
        boolean zG = true;
        byte bByteValue = ((Byte) w5VarB.f(1)).byteValue();
        if (bByteValue != 1) {
            if (bByteValue == 0) {
                zG = false;
            } else {
                zG = n6.f19445c.a(w5VarB.getClass()).g(w5VarB);
                w5VarB.f(2);
            }
        }
        if (zG) {
            return w5VarB;
        }
        throw new ac.m("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final w5 b() {
        if (!this.f19546b.e()) {
            return this.f19546b;
        }
        this.f19546b.j();
        return this.f19546b;
    }

    public final Object clone() {
        v5 v5Var = (v5) this.f19545a.f(5);
        v5Var.f19546b = b();
        return v5Var;
    }

    public final void d() {
        if (this.f19546b.e()) {
            return;
        }
        w5 w5Var = (w5) this.f19545a.f(4);
        n6.f19445c.a(w5Var.getClass()).e(w5Var, this.f19546b);
        this.f19546b = w5Var;
    }
}
