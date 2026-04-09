package com.yandex.mobile.ads.impl;

import android.util.Pair;
import java.io.IOException;

/* loaded from: classes3.dex */
final class aj2 {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f24710a;

        /* renamed from: b, reason: collision with root package name */
        public final long f24711b;

        private a(int i, long j4) {
            this.f24710a = i;
            this.f24711b = j4;
        }

        public static a a(rz rzVar, uf1 uf1Var) throws IOException {
            rzVar.b(uf1Var.c(), 0, 8, false);
            uf1Var.e(0);
            return new a(uf1Var.h(), uf1Var.n());
        }
    }

    public static boolean a(rz rzVar) throws IOException {
        uf1 uf1Var = new uf1(8);
        int i = a.a(rzVar, uf1Var).f24710a;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        rzVar.b(uf1Var.c(), 0, 4, false);
        uf1Var.e(0);
        int iH = uf1Var.h();
        if (iH == 1463899717) {
            return true;
        }
        rs0.b("WavHeaderReader", "Unsupported form type: " + iH);
        return false;
    }

    public static zi2 b(rz rzVar) throws IOException {
        byte[] bArr;
        uf1 uf1Var = new uf1(16);
        a aVarA = a(1718449184, rzVar, uf1Var);
        if (aVarA.f24711b < 16) {
            throw new IllegalStateException();
        }
        rzVar.b(uf1Var.c(), 0, 16, false);
        uf1Var.e(0);
        int iO = uf1Var.o();
        int iO2 = uf1Var.o();
        int iK = uf1Var.k();
        if (iK < 0) {
            throw new IllegalStateException(fe.a("Top bit not zero: ", iK));
        }
        int iK2 = uf1Var.k();
        if (iK2 < 0) {
            throw new IllegalStateException(fe.a("Top bit not zero: ", iK2));
        }
        int iO3 = uf1Var.o();
        int iO4 = uf1Var.o();
        int i = ((int) aVarA.f24711b) - 16;
        if (i > 0) {
            bArr = new byte[i];
            rzVar.b(bArr, 0, i, false);
        } else {
            bArr = s82.f32904f;
        }
        byte[] bArr2 = bArr;
        rzVar.a((int) (rzVar.d() - rzVar.a()));
        return new zi2(iO, iO2, iK, iO3, iO4, bArr2);
    }

    public static Pair c(rz rzVar) throws IOException {
        rzVar.c();
        a aVarA = a(1684108385, rzVar, new uf1(8));
        rzVar.a(8);
        return Pair.create(Long.valueOf(rzVar.a()), Long.valueOf(aVarA.f24711b));
    }

    private static a a(int i, rz rzVar, uf1 uf1Var) throws IOException {
        a aVarA = a.a(rzVar, uf1Var);
        while (aVarA.f24710a != i) {
            rs0.d("WavHeaderReader", "Ignoring unknown WAV chunk: " + aVarA.f24710a);
            long j4 = aVarA.f24711b + 8;
            if (j4 <= 2147483647L) {
                rzVar.a((int) j4);
                aVarA = a.a(rzVar, uf1Var);
            } else {
                throw yf1.a("Chunk is too large (~2GB+) to skip; id: " + aVarA.f24710a);
            }
        }
        return aVarA;
    }
}
