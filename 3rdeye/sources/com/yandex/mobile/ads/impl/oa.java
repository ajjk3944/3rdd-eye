package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.c70;
import com.yandex.mobile.ads.impl.xj0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/* loaded from: classes3.dex */
public final class oa extends ok {

    /* renamed from: f, reason: collision with root package name */
    private final pi f31318f;

    /* renamed from: g, reason: collision with root package name */
    private final dp f31319g;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f31320a;

        /* renamed from: b, reason: collision with root package name */
        public final long f31321b;

        public a(long j4, long j10) {
            this.f31320a = j4;
            this.f31321b = j10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f31320a == aVar.f31320a && this.f31321b == aVar.f31321b;
        }

        public final int hashCode() {
            return (((int) this.f31320a) * 31) + ((int) this.f31321b);
        }
    }

    public static class b implements c70.b {
        public b(int i) {
            this((Object) null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final c70[] a(c70.a[] aVarArr, pi piVar) {
            xj0 xj0VarA = oa.a(aVarArr);
            c70[] c70VarArr = new c70[aVarArr.length];
            for (int i = 0; i < aVarArr.length; i++) {
                c70.a aVar = aVarArr[i];
                if (aVar != null) {
                    int[] iArr = aVar.f25552b;
                    if (iArr.length != 0) {
                        c70VarArr[i] = iArr.length == 1 ? new nb0(iArr[0], aVar.f25553c, aVar.f25551a) : new oa(aVar.f25551a, iArr, aVar.f25553c, piVar, 10000, 25000, (xj0) xj0VarA.get(i), dp.f26283a);
                    }
                }
            }
            return c70VarArr;
        }

        public b(Object obj) {
        }
    }

    public oa(l52 l52Var, int[] iArr, int i, pi piVar, long j4, long j10, xj0 xj0Var, dp dpVar) {
        super(l52Var, iArr);
        if (j10 < j4) {
            rs0.d("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
        }
        this.f31318f = piVar;
        xj0.a((Collection) xj0Var);
        this.f31319g = dpVar;
    }

    @Override // com.yandex.mobile.ads.impl.ok, com.yandex.mobile.ads.impl.c70
    public final void a(float f10) {
    }

    private static void a(ArrayList arrayList, long[] jArr) {
        long j4 = 0;
        for (long j10 : jArr) {
            j4 += j10;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            xj0.a aVar = (xj0.a) arrayList.get(i);
            if (aVar != null) {
                aVar.b(new a(j4, jArr[i]));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static xj0<xj0<a>> a(c70.a[] aVarArr) {
        int i;
        int i10;
        int i11;
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            i = 1;
            if (i13 >= aVarArr.length) {
                break;
            }
            c70.a aVar = aVarArr[i13];
            if (aVar != null && aVar.f25552b.length > 1) {
                xj0.a aVarG = xj0.g();
                aVarG.b(new a(0L, 0L));
                arrayList.add(aVarG);
            } else {
                arrayList.add(null);
            }
            i13++;
        }
        int length = aVarArr.length;
        long[][] jArr = new long[length][];
        for (int i14 = 0; i14 < aVarArr.length; i14++) {
            c70.a aVar2 = aVarArr[i14];
            if (aVar2 == null) {
                jArr[i14] = new long[0];
            } else {
                jArr[i14] = new long[aVar2.f25552b.length];
                int i15 = 0;
                while (true) {
                    if (i15 >= aVar2.f25552b.length) {
                        break;
                    }
                    jArr[i14][i15] = aVar2.f25551a.a(r11[i15]).i;
                    i15++;
                }
                Arrays.sort(jArr[i14]);
            }
        }
        int[] iArr = new int[length];
        long[] jArr2 = new long[length];
        for (int i16 = 0; i16 < length; i16++) {
            long[] jArr3 = jArr[i16];
            jArr2[i16] = jArr3.length == 0 ? 0L : jArr3[0];
        }
        a(arrayList, jArr2);
        j31 j31VarB = l31.a().a().b();
        int i17 = 0;
        while (i17 < length) {
            long[] jArr4 = jArr[i17];
            if (jArr4.length <= i) {
                i10 = i12;
                i11 = length;
            } else {
                int length2 = jArr4.length;
                double[] dArr = new double[length2];
                int i18 = i12;
                while (true) {
                    long[] jArr5 = jArr[i17];
                    double dLog = 0.0d;
                    if (i18 >= jArr5.length) {
                        break;
                    }
                    int i19 = i12;
                    int i20 = length;
                    long j4 = jArr5[i18];
                    if (j4 != -1) {
                        dLog = Math.log(j4);
                    }
                    dArr[i18] = dLog;
                    i18++;
                    i12 = i19;
                    length = i20;
                }
                i10 = i12;
                i11 = length;
                int i21 = length2 - 1;
                double d10 = dArr[i21] - dArr[i10];
                int i22 = i10;
                while (i22 < i21) {
                    double d11 = dArr[i22];
                    i22++;
                    j31VarB.put(Double.valueOf(d10 == 0.0d ? 1.0d : (((d11 + dArr[i22]) * 0.5d) - dArr[i10]) / d10), Integer.valueOf(i17));
                    i = i;
                }
            }
            i17++;
            i12 = i10;
            length = i11;
            i = i;
        }
        int i23 = i12;
        xj0 xj0VarA = xj0.a(j31VarB.values());
        for (int i24 = i23; i24 < xj0VarA.size(); i24++) {
            int iIntValue = ((Integer) xj0VarA.get(i24)).intValue();
            int i25 = iArr[iIntValue] + 1;
            iArr[iIntValue] = i25;
            jArr2[iIntValue] = jArr[iIntValue][i25];
            a(arrayList, jArr2);
        }
        for (int i26 = i23; i26 < aVarArr.length; i26++) {
            if (arrayList.get(i26) != null) {
                jArr2[i26] = jArr2[i26] * 2;
            }
        }
        a(arrayList, jArr2);
        xj0.a aVarG2 = xj0.g();
        for (int i27 = i23; i27 < arrayList.size(); i27++) {
            xj0.a aVar3 = (xj0.a) arrayList.get(i27);
            aVarG2.b((Object) (aVar3 == null ? xj0.h() : aVar3.a()));
        }
        return aVarG2.a();
    }

    @Override // com.yandex.mobile.ads.impl.ok, com.yandex.mobile.ads.impl.c70
    public final void c() {
    }

    @Override // com.yandex.mobile.ads.impl.ok, com.yandex.mobile.ads.impl.c70
    public final void d() {
    }
}
