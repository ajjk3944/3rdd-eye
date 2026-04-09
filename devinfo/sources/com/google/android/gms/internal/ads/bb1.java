package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class bb1 extends z91 {

    /* renamed from: c, reason: collision with root package name */
    public final cb1 f9642c;

    /* renamed from: d, reason: collision with root package name */
    public final vl1 f9643d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f9644e;

    public bb1(cb1 cb1Var, vl1 vl1Var, Integer num) {
        super(12);
        this.f9642c = cb1Var;
        this.f9643d = vl1Var;
        this.f9644e = num;
    }

    public static bb1 a0(cb1 cb1Var, Integer num) throws GeneralSecurityException {
        vl1 vl1VarA;
        ja1 ja1Var = cb1Var.f10074b;
        if (ja1Var == ja1.f12699k) {
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            vl1VarA = vl1.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        } else {
            if (ja1Var != ja1.f12700l) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(ja1Var.f12707b));
            }
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            vl1VarA = vl1.a(new byte[0]);
        }
        return new bb1(cb1Var, vl1VarA, num);
    }

    @Override // com.google.android.gms.internal.ads.z91
    public final vl1 Z() {
        return this.f9643d;
    }

    @Override // com.google.android.gms.internal.ads.al0
    public final /* synthetic */ s91 k() {
        return this.f9642c;
    }

    @Override // com.google.android.gms.internal.ads.al0
    public final Integer u() {
        return this.f9644e;
    }
}
