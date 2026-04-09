package com.yandex.mobile.ads.impl;

import android.util.Pair;
import com.yandex.mobile.ads.impl.jw0;
import com.yandex.mobile.ads.impl.o62;
import com.yandex.mobile.ads.impl.xj0;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class qt0 extends s52 {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f32335a;

        /* renamed from: b, reason: collision with root package name */
        private final int[] f32336b;

        /* renamed from: c, reason: collision with root package name */
        private final m52[] f32337c;

        /* renamed from: d, reason: collision with root package name */
        private final int[] f32338d;

        /* renamed from: e, reason: collision with root package name */
        private final int[][][] f32339e;

        /* renamed from: f, reason: collision with root package name */
        private final m52 f32340f;

        public a(int[] iArr, m52[] m52VarArr, int[] iArr2, int[][][] iArr3, m52 m52Var) {
            this.f32336b = iArr;
            this.f32337c = m52VarArr;
            this.f32339e = iArr3;
            this.f32338d = iArr2;
            this.f32340f = m52Var;
            this.f32335a = iArr.length;
        }

        public final int a(int i, int i10) {
            int i11 = this.f32337c[i].a(i10).f29890b;
            int[] iArr = new int[i11];
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < i11; i14++) {
                if (a(i, i10, i14) == 4) {
                    iArr[i13] = i14;
                    i13++;
                }
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i13);
            int iMin = 16;
            int i15 = 0;
            String str = null;
            boolean z10 = false;
            while (i12 < iArrCopyOf.length) {
                String str2 = this.f32337c[i].a(i10).a(iArrCopyOf[i12]).f26083m;
                int i16 = i15 + 1;
                if (i15 == 0) {
                    str = str2;
                } else {
                    z10 |= !s82.a(str, str2);
                }
                iMin = Math.min(iMin, this.f32339e[i][i10][i12] & 24);
                i12++;
                i15 = i16;
            }
            return z10 ? Math.min(iMin, this.f32338d[i]) : iMin;
        }

        public final m52 b(int i) {
            return this.f32337c[i];
        }

        public final m52 b() {
            return this.f32340f;
        }

        public final int a() {
            return this.f32335a;
        }

        public final int a(int i) {
            return this.f32336b[i];
        }

        public final int a(int i, int i10, int i11) {
            return this.f32339e[i][i10][i11] & 7;
        }
    }

    public abstract Pair<uo1[], c70[]> a(a aVar, int[][][] iArr, int[] iArr2, jw0.b bVar, v42 v42Var) throws h60;

    @Override // com.yandex.mobile.ads.impl.s52
    public final void a(Object obj) {
    }

    @Override // com.yandex.mobile.ads.impl.s52
    public final t52 a(to1[] to1VarArr, m52 m52Var, jw0.b bVar, v42 v42Var) throws h60 {
        boolean z10;
        int[] iArr;
        m52 m52Var2 = m52Var;
        boolean z11 = true;
        int[] iArr2 = new int[to1VarArr.length + 1];
        int length = to1VarArr.length + 1;
        l52[][] l52VarArr = new l52[length][];
        int[][][] iArr3 = new int[to1VarArr.length + 1][][];
        for (int i = 0; i < length; i++) {
            int i10 = m52Var2.f30221b;
            l52VarArr[i] = new l52[i10];
            iArr3[i] = new int[i10][];
        }
        int length2 = to1VarArr.length;
        int[] iArr4 = new int[length2];
        for (int i11 = 0; i11 < length2; i11++) {
            iArr4[i11] = to1VarArr[i11].f();
        }
        int i12 = 0;
        while (i12 < m52Var2.f30221b) {
            l52 l52VarA = m52Var2.a(i12);
            boolean z12 = l52VarA.f29892d == 5 ? z11 : false;
            int length3 = to1VarArr.length;
            boolean z13 = z11;
            int i13 = 0;
            int i14 = 0;
            while (i13 < to1VarArr.length) {
                to1 to1Var = to1VarArr[i13];
                boolean z14 = z11;
                int iMax = 0;
                for (int i15 = 0; i15 < l52VarA.f29890b; i15++) {
                    iMax = Math.max(iMax, to1Var.a(l52VarA.a(i15)) & 7);
                }
                boolean z15 = iArr2[i13] == 0 ? z14 : false;
                if (iMax > i14 || (iMax == i14 && z12 && !z13 && z15)) {
                    z13 = z15;
                    i14 = iMax;
                    length3 = i13;
                }
                i13++;
                z11 = z14;
            }
            boolean z16 = z11;
            if (length3 == to1VarArr.length) {
                iArr = new int[l52VarA.f29890b];
            } else {
                to1 to1Var2 = to1VarArr[length3];
                int[] iArr5 = new int[l52VarA.f29890b];
                for (int i16 = 0; i16 < l52VarA.f29890b; i16++) {
                    iArr5[i16] = to1Var2.a(l52VarA.a(i16));
                }
                iArr = iArr5;
            }
            int i17 = iArr2[length3];
            l52VarArr[length3][i17] = l52VarA;
            iArr3[length3][i17] = iArr;
            iArr2[length3] = i17 + 1;
            i12++;
            m52Var2 = m52Var;
            z11 = z16;
        }
        boolean z17 = z11;
        m52[] m52VarArr = new m52[to1VarArr.length];
        String[] strArr = new String[to1VarArr.length];
        int[] iArr6 = new int[to1VarArr.length];
        for (int i18 = 0; i18 < to1VarArr.length; i18++) {
            int i19 = iArr2[i18];
            m52VarArr[i18] = new m52((l52[]) s82.a(i19, l52VarArr[i18]));
            iArr3[i18] = (int[][]) s82.a(i19, iArr3[i18]);
            strArr[i18] = to1VarArr[i18].getName();
            iArr6[i18] = ((mk) to1VarArr[i18]).m();
        }
        a aVar = new a(iArr6, m52VarArr, iArr4, iArr3, new m52((l52[]) s82.a(iArr2[to1VarArr.length], l52VarArr[to1VarArr.length])));
        Pair<uo1[], c70[]> pairA = a(aVar, iArr3, iArr4, bVar, v42Var);
        p52[] p52VarArr = (p52[]) pairA.second;
        List[] listArr = new List[p52VarArr.length];
        for (int i20 = 0; i20 < p52VarArr.length; i20++) {
            p52 p52Var = p52VarArr[i20];
            listArr[i20] = p52Var != null ? xj0.a(p52Var) : xj0.h();
        }
        xj0.a aVar2 = new xj0.a();
        for (int i21 = 0; i21 < aVar.f32335a; i21++) {
            m52 m52Var3 = aVar.f32337c[i21];
            List list = listArr[i21];
            for (int i22 = 0; i22 < m52Var3.f30221b; i22++) {
                l52 l52VarA2 = m52Var3.a(i22);
                boolean z18 = aVar.a(i21, i22) != 0 ? z17 : false;
                int i23 = l52VarA2.f29890b;
                int[] iArr7 = new int[i23];
                boolean[] zArr = new boolean[i23];
                for (int i24 = 0; i24 < l52VarA2.f29890b; i24++) {
                    iArr7[i24] = aVar.a(i21, i22, i24);
                    int i25 = 0;
                    while (true) {
                        if (i25 >= list.size()) {
                            z10 = false;
                            break;
                        }
                        p52 p52Var2 = (p52) list.get(i25);
                        if (p52Var2.a().equals(l52VarA2) && p52Var2.c(i24) != -1) {
                            z10 = z17;
                            break;
                        }
                        i25++;
                    }
                    zArr[i24] = z10;
                }
                aVar2.b(new o62.a(l52VarA2, z18, iArr7, zArr));
            }
        }
        m52 m52Var4 = aVar.f32340f;
        for (int i26 = 0; i26 < m52Var4.f30221b; i26++) {
            l52 l52VarA3 = m52Var4.a(i26);
            int[] iArr8 = new int[l52VarA3.f29890b];
            Arrays.fill(iArr8, 0);
            aVar2.b(new o62.a(l52VarA3, false, iArr8, new boolean[l52VarA3.f29890b]));
        }
        return new t52((uo1[]) pairA.first, (c70[]) pairA.second, new o62(aVar2.a()), aVar);
    }
}
