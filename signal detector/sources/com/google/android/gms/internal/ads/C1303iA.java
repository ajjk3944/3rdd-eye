package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.iA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1303iA implements InterfaceC1195gA {

    /* renamed from: a, reason: collision with root package name */
    public final C1948uA f14674a;

    /* renamed from: b, reason: collision with root package name */
    public final long f14675b;

    public C1303iA(C1948uA c1948uA, long j6) {
        this.f14674a = c1948uA;
        this.f14675b = j6;
    }

    public static boolean c(Ly ly) {
        int iA = ly.B().A().A();
        int iB = ly.B().A().B();
        byte[] bArrJ = AbstractC1114el.j();
        q5.i.e(bArrJ, "versionArray");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(6);
        q5.i.d(byteBufferAllocate, "allocate(...)");
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putShort((short) iA);
        byteBufferAllocate.putInt(iB);
        byte[] bArrArray = byteBufferAllocate.array();
        q5.i.d(bArrArray, "array(...)");
        return Arrays.equals(bArrArray, bArrJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1195gA
    public final boolean a(Ly ly) {
        C1948uA c1948uA = this.f14674a;
        if (ly == null || ly.equals(Ly.F())) {
            c1948uA.b(20204);
            return false;
        }
        if (c(ly)) {
            return true;
        }
        c1948uA.b(20206);
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1195gA
    public final boolean b(Ly ly) {
        C1948uA c1948uA = this.f14674a;
        if (ly == null || ly.equals(Ly.F())) {
            c1948uA.b(20202);
            return true;
        }
        if (!c(ly)) {
            c1948uA.b(20205);
            return true;
        }
        boolean z6 = ly.B().C() - System.currentTimeMillis() <= this.f14675b;
        if (z6) {
            c1948uA.b(20203);
        }
        return z6;
    }
}
