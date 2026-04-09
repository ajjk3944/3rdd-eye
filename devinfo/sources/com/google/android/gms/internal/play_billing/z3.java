package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class z3 {

    /* renamed from: a, reason: collision with root package name */
    public Object f20274a;

    /* renamed from: b, reason: collision with root package name */
    public b4 f20275b;

    /* renamed from: c, reason: collision with root package name */
    public c4 f20276c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f20277d;

    public final void a(Object obj) {
        this.f20277d = true;
        b4 b4Var = this.f20275b;
        if (b4Var != null) {
            a4 a4Var = b4Var.f20092b;
            a4Var.getClass();
            if (obj == null) {
                obj = y3.g;
            }
            if (y3.f20266f.A(a4Var, null, obj)) {
                y3.d(a4Var);
                this.f20274a = null;
                this.f20275b = null;
                this.f20276c = null;
            }
        }
    }

    public final void finalize() {
        c4 c4Var;
        b4 b4Var = this.f20275b;
        if (b4Var != null) {
            a4 a4Var = b4Var.f20092b;
            if (!a4Var.isDone()) {
                if (y3.f20266f.A(a4Var, null, new z1(new k1("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(this.f20274a)), 1)))) {
                    y3.d(a4Var);
                }
            }
        }
        if (this.f20277d || (c4Var = this.f20276c) == null) {
            return;
        }
        c4Var.i(null);
    }
}
