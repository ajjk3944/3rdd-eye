package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.u31;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class nf0 {

    /* renamed from: a, reason: collision with root package name */
    public final List<byte[]> f30856a;

    /* renamed from: b, reason: collision with root package name */
    public final int f30857b;

    /* renamed from: c, reason: collision with root package name */
    public final float f30858c;

    /* renamed from: d, reason: collision with root package name */
    public final String f30859d;

    private nf0(List list, int i, float f10, String str) {
        this.f30856a = list;
        this.f30857b = i;
        this.f30858c = f10;
        this.f30859d = str;
    }

    public static nf0 a(uf1 uf1Var) throws yf1 {
        boolean z10;
        int i;
        try {
            uf1Var.f(21);
            int iT = uf1Var.t() & 3;
            int iT2 = uf1Var.t();
            int iD = uf1Var.d();
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                z10 = true;
                if (i11 >= iT2) {
                    break;
                }
                uf1Var.f(1);
                int iZ = uf1Var.z();
                for (int i13 = 0; i13 < iZ; i13++) {
                    int iZ2 = uf1Var.z();
                    i12 += iZ2 + 4;
                    uf1Var.f(iZ2);
                }
                i11++;
            }
            uf1Var.e(iD);
            byte[] bArr = new byte[i12];
            float f10 = 1.0f;
            String strA = null;
            int i14 = 0;
            int i15 = 0;
            while (i14 < iT2) {
                int iT3 = uf1Var.t() & 127;
                int iZ3 = uf1Var.z();
                int i16 = i10;
                while (i16 < iZ3) {
                    int iZ4 = uf1Var.z();
                    boolean z11 = z10;
                    System.arraycopy(u31.f33899a, i10, bArr, i15, 4);
                    int i17 = i15 + 4;
                    System.arraycopy(uf1Var.c(), uf1Var.d(), bArr, i17, iZ4);
                    if (iT3 == 33 && i16 == 0) {
                        u31.a aVarA = u31.a(bArr, i17, i17 + iZ4);
                        float f11 = aVarA.f33909g;
                        i = iT;
                        strA = iq.a(aVarA.f33903a, aVarA.f33904b, aVarA.f33905c, aVarA.f33906d, aVarA.f33907e, aVarA.f33908f);
                        f10 = f11;
                    } else {
                        i = iT;
                    }
                    i15 = i17 + iZ4;
                    uf1Var.f(iZ4);
                    i16++;
                    z10 = z11;
                    iT = i;
                    i10 = 0;
                }
                i14++;
                i10 = 0;
            }
            return new nf0(i12 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iT + 1, f10, strA);
        } catch (ArrayIndexOutOfBoundsException e4) {
            throw yf1.a("Error parsing HEVC config", e4);
        }
    }
}
