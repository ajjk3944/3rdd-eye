package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class u11 implements s11 {

    /* renamed from: a, reason: collision with root package name */
    public final g21 f17032a;

    /* renamed from: b, reason: collision with root package name */
    public final long f17033b;

    public u11(g21 g21Var, long j) {
        this.f17032a = g21Var;
        this.f17033b = j;
    }

    public static boolean c(zy0 zy0Var) {
        int iA = zy0Var.B().A().A();
        int iB = zy0Var.B().A().B();
        byte[] bArrJ = a80.j();
        nk.k.e(bArrJ, "versionArray");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(6);
        nk.k.d(byteBufferAllocate, "allocate(...)");
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putShort((short) iA);
        byteBufferAllocate.putInt(iB);
        byte[] bArrArray = byteBufferAllocate.array();
        nk.k.d(bArrArray, "array(...)");
        return Arrays.equals(bArrArray, bArrJ);
    }

    @Override // com.google.android.gms.internal.ads.s11
    public final boolean a(zy0 zy0Var) {
        g21 g21Var = this.f17032a;
        if (zy0Var == null || zy0Var.equals(zy0.F())) {
            g21Var.b(20204);
            return false;
        }
        if (c(zy0Var)) {
            return true;
        }
        g21Var.b(20206);
        return false;
    }

    @Override // com.google.android.gms.internal.ads.s11
    public final boolean b(zy0 zy0Var) {
        g21 g21Var = this.f17032a;
        if (zy0Var == null || zy0Var.equals(zy0.F())) {
            g21Var.b(20202);
            return true;
        }
        if (!c(zy0Var)) {
            g21Var.b(20205);
            return true;
        }
        boolean z3 = zy0Var.B().C() - System.currentTimeMillis() <= this.f17033b;
        if (z3) {
            g21Var.b(20203);
        }
        return z3;
    }
}
