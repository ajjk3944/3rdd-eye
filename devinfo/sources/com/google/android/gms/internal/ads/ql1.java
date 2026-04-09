package com.google.android.gms.internal.ads;

import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ql1 implements r91 {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f15360e = {0};

    /* renamed from: a, reason: collision with root package name */
    public final hf1 f15361a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15362b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f15363c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f15364d;

    public ql1(ke1 ke1Var) {
        this.f15361a = yr1.r(ff1.Z(gf1.b(ke1Var.f13145c.f13881a), ke1Var.f13146d));
        me1 me1Var = ke1Var.f13145c;
        this.f15362b = me1Var.f13882b;
        this.f15363c = ke1Var.f13147e.b();
        if (me1Var.f13883c.equals(m91.f13818p)) {
            this.f15364d = Arrays.copyOf(f15360e, 1);
        } else {
            this.f15364d = new byte[0];
        }
    }

    public ql1(qe1 qe1Var) {
        String strValueOf = String.valueOf(qe1Var.f15328c.f17195d);
        this.f15361a = new wb("HMAC".concat(strValueOf), new SecretKeySpec(((vl1) qe1Var.f15329d.f13160b).b(), "HMAC"));
        ue1 ue1Var = qe1Var.f15328c;
        this.f15362b = ue1Var.f17193b;
        this.f15363c = qe1Var.f15330e.b();
        if (ue1Var.f17194c.equals(te1.f16800d)) {
            this.f15364d = Arrays.copyOf(f15360e, 1);
        } else {
            this.f15364d = new byte[0];
        }
    }

    public ql1(wb wbVar, int i4) throws IllegalStateException, InvalidAlgorithmParameterException {
        this.f15361a = wbVar;
        this.f15362b = i4;
        this.f15363c = new byte[0];
        this.f15364d = new byte[0];
        wbVar.g(i4, new byte[0]);
    }
}
