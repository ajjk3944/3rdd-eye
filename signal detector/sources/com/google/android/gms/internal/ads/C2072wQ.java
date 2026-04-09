package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import o4.AbstractC2763b;

/* renamed from: com.google.android.gms.internal.ads.wQ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2072wQ implements InterfaceC1695pQ, InterfaceC1641oQ {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1695pQ[] f17438a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f17439b;

    /* renamed from: c, reason: collision with root package name */
    public final IdentityHashMap f17440c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f17441d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f17442e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC1641oQ f17443f;

    /* renamed from: g, reason: collision with root package name */
    public SQ f17444g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC1695pQ[] f17445h;
    public C1156fQ i;

    public C2072wQ(long[] jArr, InterfaceC1695pQ... interfaceC1695pQArr) {
        this.f17438a = interfaceC1695pQArr;
        JB jb = LB.f9635b;
        C1197gC c1197gC = C1197gC.f14227e;
        this.i = new C1156fQ(c1197gC, c1197gC);
        this.f17440c = new IdentityHashMap();
        this.f17445h = new InterfaceC1695pQ[0];
        this.f17439b = new boolean[interfaceC1695pQArr.length];
        for (int i = 0; i < interfaceC1695pQArr.length; i++) {
            long j6 = jArr[i];
            if (j6 != 0) {
                this.f17439b[i] = true;
                this.f17438a[i] = new RQ(interfaceC1695pQArr[i], j6);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1695pQ
    public final void a(long j6) {
        for (InterfaceC1695pQ interfaceC1695pQ : this.f17445h) {
            interfaceC1695pQ.a(j6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1695pQ
    public final long b(InterfaceC1020d[] interfaceC1020dArr, boolean[] zArr, MQ[] mqArr, boolean[] zArr2, long j6) {
        int length;
        IdentityHashMap identityHashMap;
        int[] iArr;
        int[] iArr2;
        int length2 = interfaceC1020dArr.length;
        int[] iArr3 = new int[length2];
        int[] iArr4 = new int[length2];
        int i = 0;
        int i3 = 0;
        while (true) {
            length = interfaceC1020dArr.length;
            identityHashMap = this.f17440c;
            if (i3 >= length) {
                break;
            }
            MQ mq = mqArr[i3];
            Integer num = mq == null ? null : (Integer) identityHashMap.get(mq);
            iArr3[i3] = num == null ? -1 : num.intValue();
            InterfaceC1020d interfaceC1020d = interfaceC1020dArr[i3];
            if (interfaceC1020d != null) {
                String str = interfaceC1020d.a().f17547b;
                iArr4[i3] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr4[i3] = -1;
            }
            i3++;
        }
        identityHashMap.clear();
        MQ[] mqArr2 = new MQ[length];
        MQ[] mqArr3 = new MQ[length];
        InterfaceC1020d[] interfaceC1020dArr2 = new InterfaceC1020d[length];
        InterfaceC1695pQ[] interfaceC1695pQArr = this.f17438a;
        ArrayList arrayList = new ArrayList(interfaceC1695pQArr.length);
        long j7 = j6;
        int i6 = 0;
        while (i6 < interfaceC1695pQArr.length) {
            int i7 = i;
            while (i7 < interfaceC1020dArr.length) {
                mqArr3[i7] = iArr3[i7] == i6 ? mqArr[i7] : null;
                if (iArr4[i7] == i6) {
                    InterfaceC1020d interfaceC1020d2 = interfaceC1020dArr[i7];
                    interfaceC1020d2.getClass();
                    iArr = iArr4;
                    iArr2 = iArr3;
                    C2108x8 c2108x8 = (C2108x8) this.f17442e.get(interfaceC1020d2.a());
                    c2108x8.getClass();
                    interfaceC1020dArr2[i7] = new C2018vQ(interfaceC1020d2, c2108x8);
                } else {
                    iArr = iArr4;
                    iArr2 = iArr3;
                    interfaceC1020dArr2[i7] = null;
                }
                i7++;
                iArr4 = iArr;
                iArr3 = iArr2;
            }
            int[] iArr5 = iArr4;
            int[] iArr6 = iArr3;
            ArrayList arrayList2 = arrayList;
            InterfaceC1695pQ[] interfaceC1695pQArr2 = interfaceC1695pQArr;
            int i8 = i6;
            long jB = interfaceC1695pQArr[i6].b(interfaceC1020dArr2, zArr, mqArr3, zArr2, j7);
            if (i8 == 0) {
                j7 = jB;
            } else if (jB != j7) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z6 = false;
            for (int i9 = 0; i9 < interfaceC1020dArr.length; i9++) {
                if (iArr5[i9] == i8) {
                    MQ mq2 = mqArr3[i9];
                    mq2.getClass();
                    mqArr2[i9] = mq2;
                    identityHashMap.put(mq2, Integer.valueOf(i8));
                    z6 = true;
                } else if (iArr6[i9] == i8) {
                    AbstractC0582Jp.h0(mqArr3[i9] == null);
                }
            }
            if (z6) {
                arrayList2.add(interfaceC1695pQArr2[i8]);
            }
            i6 = i8 + 1;
            arrayList = arrayList2;
            interfaceC1695pQArr = interfaceC1695pQArr2;
            iArr4 = iArr5;
            iArr3 = iArr6;
            i = 0;
        }
        int i10 = i;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(mqArr2, i10, mqArr, i10, length);
        this.f17445h = (InterfaceC1695pQ[]) arrayList3.toArray(new InterfaceC1695pQ[i10]);
        this.i = new C1156fQ(arrayList3, AbstractC0582Jp.G(arrayList3, Oz.f10291f));
        return j7;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1695pQ
    public final long c(long j6, C2178yO c2178yO) {
        InterfaceC1695pQ[] interfaceC1695pQArr = this.f17445h;
        return (interfaceC1695pQArr.length > 0 ? interfaceC1695pQArr[0] : this.f17438a[0]).c(j6, c2178yO);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1641oQ
    public final /* bridge */ /* synthetic */ void d(NQ nq) {
        InterfaceC1641oQ interfaceC1641oQ = this.f17443f;
        interfaceC1641oQ.getClass();
        interfaceC1641oQ.d(this);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1641oQ
    public final void e(InterfaceC1695pQ interfaceC1695pQ) {
        InterfaceC1695pQ[] interfaceC1695pQArr;
        ArrayList arrayList = this.f17441d;
        arrayList.remove(interfaceC1695pQ);
        if (arrayList.isEmpty()) {
            int i = 0;
            int i3 = 0;
            while (true) {
                interfaceC1695pQArr = this.f17438a;
                if (i >= interfaceC1695pQArr.length) {
                    break;
                }
                i3 += interfaceC1695pQArr[i].m().f11184a;
                i++;
            }
            C2108x8[] c2108x8Arr = new C2108x8[i3];
            int i6 = 0;
            for (int i7 = 0; i7 < interfaceC1695pQArr.length; i7++) {
                SQ sqM = interfaceC1695pQArr[i7].m();
                int i8 = sqM.f11184a;
                int i9 = 0;
                while (i9 < i8) {
                    C2108x8 c2108x8A = sqM.a(i9);
                    int i10 = c2108x8A.f17546a;
                    TP[] tpArr = new TP[i10];
                    int i11 = 0;
                    while (i11 < i10) {
                        TP tp = c2108x8A.f17549d[i11];
                        tp.getClass();
                        C1855sP c1855sP = new C1855sP(tp);
                        String str = tp.f11386a;
                        if (str == null) {
                            str = "";
                        }
                        InterfaceC1695pQ[] interfaceC1695pQArr2 = interfaceC1695pQArr;
                        StringBuilder sb = new StringBuilder(str.length() + AbstractC2763b.a(i7, 1));
                        sb.append(i7);
                        sb.append(":");
                        sb.append(str);
                        c1855sP.f16722a = sb.toString();
                        tpArr[i11] = new TP(c1855sP);
                        i11++;
                        interfaceC1695pQArr = interfaceC1695pQArr2;
                    }
                    InterfaceC1695pQ[] interfaceC1695pQArr3 = interfaceC1695pQArr;
                    String str2 = c2108x8A.f17547b;
                    StringBuilder sb2 = new StringBuilder(AbstractC2763b.a(i7, 1) + String.valueOf(str2).length());
                    sb2.append(i7);
                    sb2.append(":");
                    sb2.append(str2);
                    C2108x8 c2108x8 = new C2108x8(sb2.toString(), tpArr);
                    this.f17442e.put(c2108x8, c2108x8A);
                    c2108x8Arr[i6] = c2108x8;
                    i9++;
                    i6++;
                    interfaceC1695pQArr = interfaceC1695pQArr3;
                }
            }
            this.f17444g = new SQ(c2108x8Arr);
            InterfaceC1641oQ interfaceC1641oQ = this.f17443f;
            interfaceC1641oQ.getClass();
            interfaceC1641oQ.e(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.NQ
    public final boolean f(C1045dO c1045dO) {
        ArrayList arrayList = this.f17441d;
        if (arrayList.isEmpty()) {
            return this.i.f(c1045dO);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC1695pQ) arrayList.get(i)).f(c1045dO);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1695pQ
    public final long g() {
        long j6 = -9223372036854775807L;
        for (InterfaceC1695pQ interfaceC1695pQ : this.f17445h) {
            long jG = interfaceC1695pQ.g();
            if (jG == -9223372036854775807L) {
                if (j6 != -9223372036854775807L && interfaceC1695pQ.h(j6) != j6) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j6 == -9223372036854775807L) {
                for (InterfaceC1695pQ interfaceC1695pQ2 : this.f17445h) {
                    if (interfaceC1695pQ2 == interfaceC1695pQ) {
                        break;
                    }
                    if (interfaceC1695pQ2.h(jG) != jG) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j6 = jG;
            } else if (jG != j6) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1695pQ
    public final long h(long j6) {
        long jH = this.f17445h[0].h(j6);
        int i = 1;
        while (true) {
            InterfaceC1695pQ[] interfaceC1695pQArr = this.f17445h;
            if (i >= interfaceC1695pQArr.length) {
                return jH;
            }
            if (interfaceC1695pQArr[i].h(jH) != jH) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.NQ
    public final long i() {
        return this.i.i();
    }

    @Override // com.google.android.gms.internal.ads.NQ
    public final long j() {
        return this.i.j();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1695pQ
    public final void k(InterfaceC1641oQ interfaceC1641oQ, long j6) {
        this.f17443f = interfaceC1641oQ;
        ArrayList arrayList = this.f17441d;
        InterfaceC1695pQ[] interfaceC1695pQArr = this.f17438a;
        Collections.addAll(arrayList, interfaceC1695pQArr);
        for (InterfaceC1695pQ interfaceC1695pQ : interfaceC1695pQArr) {
            interfaceC1695pQ.k(this, j6);
        }
    }

    @Override // com.google.android.gms.internal.ads.NQ
    public final void l(long j6) {
        this.i.l(j6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1695pQ
    public final SQ m() {
        SQ sq = this.f17444g;
        sq.getClass();
        return sq;
    }

    @Override // com.google.android.gms.internal.ads.NQ
    public final boolean o() {
        return this.i.o();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1695pQ
    public final void s() {
        int i = 0;
        while (true) {
            InterfaceC1695pQ[] interfaceC1695pQArr = this.f17438a;
            if (i >= interfaceC1695pQArr.length) {
                return;
            }
            interfaceC1695pQArr[i].s();
            i++;
        }
    }
}
