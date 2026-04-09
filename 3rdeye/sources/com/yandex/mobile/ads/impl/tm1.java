package com.yandex.mobile.ads.impl;

import java.util.UUID;
import kotlin.KotlinVersion;

/* loaded from: classes3.dex */
public final class tm1 {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final UUID f33683a;

        /* renamed from: b, reason: collision with root package name */
        private final int f33684b;

        /* renamed from: c, reason: collision with root package name */
        private final byte[] f33685c;

        public a(UUID uuid, int i, byte[] bArr) {
            this.f33683a = uuid;
            this.f33684b = i;
            this.f33685c = bArr;
        }
    }

    public static boolean a(byte[] bArr) {
        return b(bArr) != null;
    }

    private static a b(byte[] bArr) {
        uf1 uf1Var = new uf1(bArr);
        if (uf1Var.e() < 32) {
            return null;
        }
        uf1Var.e(0);
        if (uf1Var.h() != uf1Var.a() + 4 || uf1Var.h() != 1886614376) {
            return null;
        }
        int iH = (uf1Var.h() >> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
        if (iH > 1) {
            kr0.a("Unsupported pssh version: ", iH, "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(uf1Var.p(), uf1Var.p());
        if (iH == 1) {
            uf1Var.f(uf1Var.x() * 16);
        }
        int iX = uf1Var.x();
        if (iX != uf1Var.a()) {
            return null;
        }
        byte[] bArr2 = new byte[iX];
        uf1Var.a(bArr2, 0, iX);
        return new a(uuid, iH, bArr2);
    }

    public static UUID c(byte[] bArr) {
        a aVarB = b(bArr);
        if (aVarB == null) {
            return null;
        }
        return aVarB.f33683a;
    }

    public static int d(byte[] bArr) {
        a aVarB = b(bArr);
        if (aVarB == null) {
            return -1;
        }
        return aVarB.f33684b;
    }

    public static byte[] a(UUID uuid, byte[] bArr) {
        a aVarB = b(bArr);
        if (aVarB == null) {
            return null;
        }
        if (uuid.equals(aVarB.f33683a)) {
            return aVarB.f33685c;
        }
        rs0.d("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + aVarB.f33683a + ".");
        return null;
    }
}
