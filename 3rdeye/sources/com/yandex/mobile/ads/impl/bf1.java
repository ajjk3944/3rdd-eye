package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.dc0;
import com.yandex.mobile.ads.impl.m22;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes3.dex */
final class bf1 extends m22 {

    /* renamed from: o, reason: collision with root package name */
    private static final byte[] f25256o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: p, reason: collision with root package name */
    private static final byte[] f25257p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* renamed from: n, reason: collision with root package name */
    private boolean f25258n;

    public static boolean b(uf1 uf1Var) {
        byte[] bArr = f25256o;
        if (uf1Var.a() < 8) {
            return false;
        }
        int iD = uf1Var.d();
        byte[] bArr2 = new byte[8];
        uf1Var.a(bArr2, 0, 8);
        uf1Var.e(iD);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.yandex.mobile.ads.impl.m22
    public final long a(uf1 uf1Var) {
        int i;
        byte[] bArrC = uf1Var.c();
        byte b10 = bArrC[0];
        int i10 = b10 & 255;
        int i11 = b10 & 3;
        if (i11 != 0) {
            i = 2;
            if (i11 != 1 && i11 != 2) {
                i = bArrC[1] & 63;
            }
        } else {
            i = 1;
        }
        int i12 = i10 >> 3;
        return b(i * (i12 >= 16 ? 2500 << r0 : i12 >= 12 ? 10000 << (i12 & 1) : (i12 & 3) == 3 ? 60000 : 10000 << r0));
    }

    @Override // com.yandex.mobile.ads.impl.m22
    public final boolean a(uf1 uf1Var, long j4, m22.a aVar) throws yf1 {
        byte[] bArr = f25256o;
        if (uf1Var.a() >= 8) {
            int iD = uf1Var.d();
            byte[] bArr2 = new byte[8];
            uf1Var.a(bArr2, 0, 8);
            uf1Var.e(iD);
            if (Arrays.equals(bArr2, bArr)) {
                byte[] bArrCopyOf = Arrays.copyOf(uf1Var.c(), uf1Var.e());
                int i = bArrCopyOf[9] & 255;
                ArrayList arrayListA = cf1.a(bArrCopyOf);
                if (aVar.f30181a != null) {
                    return true;
                }
                aVar.f30181a = new dc0.a().e("audio/opus").c(i).l(48000).a(arrayListA).a();
                return true;
            }
        }
        byte[] bArr3 = f25257p;
        if (uf1Var.a() >= 8) {
            int iD2 = uf1Var.d();
            byte[] bArr4 = new byte[8];
            uf1Var.a(bArr4, 0, 8);
            uf1Var.e(iD2);
            if (Arrays.equals(bArr4, bArr3)) {
                if (aVar.f30181a != null) {
                    if (this.f25258n) {
                        return true;
                    }
                    this.f25258n = true;
                    uf1Var.f(8);
                    yz0 yz0VarA = ti2.a(xj0.b(ti2.a(uf1Var, false, false).f33626a));
                    if (yz0VarA == null) {
                        return true;
                    }
                    aVar.f30181a = aVar.f30181a.a().a(yz0VarA.a(aVar.f30181a.f26081k)).a();
                    return true;
                }
                throw new IllegalStateException();
            }
        }
        if (aVar.f30181a != null) {
            return false;
        }
        throw new IllegalStateException();
    }

    @Override // com.yandex.mobile.ads.impl.m22
    public final void a(boolean z10) {
        super.a(z10);
        if (z10) {
            this.f25258n = false;
        }
    }
}
