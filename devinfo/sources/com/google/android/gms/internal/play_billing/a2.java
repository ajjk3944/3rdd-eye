package com.google.android.gms.internal.play_billing;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a2 implements d2 {

    /* renamed from: b, reason: collision with root package name */
    public static final n1 f20081b = new n1(3);

    /* renamed from: a, reason: collision with root package name */
    public final Object f20082a;

    public a2(d2... d2VarArr) {
        this.f20082a = d2VarArr;
    }

    public void a(int i4, Object obj, l2 l2Var) {
        h1 h1Var = (h1) this.f20082a;
        h1Var.h0(i4, 3);
        l2Var.f((b1) obj, h1Var.f20138b);
        h1Var.h0(i4, 4);
    }

    public void b(int i4, Object obj, l2 l2Var) {
        b1 b1Var = (b1) obj;
        h1 h1Var = (h1) this.f20082a;
        h1Var.j0((i4 << 3) | 2);
        h1Var.j0(b1Var.b(l2Var));
        l2Var.f(b1Var, h1Var.f20138b);
    }

    @Override // com.google.android.gms.internal.play_billing.d2
    public k2 d(Class cls) {
        for (int i4 = 0; i4 < 2; i4++) {
            d2 d2Var = ((d2[]) this.f20082a)[i4];
            if (d2Var.e(cls)) {
                return d2Var.d(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.play_billing.d2
    public boolean e(Class cls) {
        for (int i4 = 0; i4 < 2; i4++) {
            if (((d2[]) this.f20082a)[i4].e(cls)) {
                return true;
            }
        }
        return false;
    }

    public a2() {
        i2 i2Var = i2.f20149c;
        a2 a2Var = new a2(n1.f20189b, f20081b);
        Charset charset = u1.f20233a;
        this.f20082a = a2Var;
    }

    public a2(h1 h1Var) {
        Charset charset = u1.f20233a;
        this.f20082a = h1Var;
        h1Var.f20138b = this;
    }
}
