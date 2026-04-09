package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: k, reason: collision with root package name */
    public static final n41 f9505k = new n41();

    /* renamed from: a, reason: collision with root package name */
    public nt1 f9506a;

    /* renamed from: b, reason: collision with root package name */
    public l f9507b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f9508c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f9509d;

    /* renamed from: e, reason: collision with root package name */
    public wz1 f9510e;

    /* renamed from: f, reason: collision with root package name */
    public Thread f9511f;
    public yz1 g;

    /* renamed from: h, reason: collision with root package name */
    public p50 f9512h;

    /* renamed from: i, reason: collision with root package name */
    public Boolean f9513i;
    public final uu1 j;

    public b(Context context) {
        uu1 uu1Var = new uu1(21);
        wz1 wz1Var = wz1.F;
        this.f9508c = new Object();
        this.f9509d = context != null ? context.getApplicationContext() : null;
        this.j = uu1Var;
        if (wz1Var != null) {
            this.f9510e = wz1Var;
        } else {
            vz1 vz1Var = new vz1(wz1Var);
            vz1Var.a(wz1Var);
            this.f9510e = new wz1(vz1Var);
        }
        this.f9512h = p50.f14899b;
        if (this.f9510e.A && context == null) {
            ls.t("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static String e(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static int f(mx1 mx1Var, String str, boolean z3) {
        if (!TextUtils.isEmpty(str) && str.equals(mx1Var.f14045d)) {
            return 4;
        }
        String strE = e(str);
        String strE2 = e(mx1Var.f14045d);
        if (strE2 == null || strE == null) {
            return (z3 && strE2 == null) ? 1 : 0;
        }
        if (strE2.startsWith(strE) || strE.startsWith(strE2)) {
            return 3;
        }
        String str2 = bq0.f9768a;
        return strE2.split("-", 2)[0].equals(strE.split("-", 2)[0]) ? 2 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        r1 = r1 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ int g(com.google.android.gms.internal.ads.mx1 r5, com.google.android.gms.internal.ads.x41 r6) {
        /*
            r0 = 0
            r1 = r0
        L2:
            int r2 = r6.size()
            if (r1 >= r2) goto L2a
            r2 = r0
        L9:
            com.google.android.gms.internal.ads.x41 r3 = r5.f14044c
            int r4 = r3.size()
            if (r2 >= r4) goto L27
            java.lang.Object r3 = r3.get(r2)
            com.google.android.gms.internal.ads.ry1 r3 = (com.google.android.gms.internal.ads.ry1) r3
            java.lang.String r3 = r3.f15791b
            java.lang.Object r4 = r6.get(r1)
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L24
            return r1
        L24:
            int r2 = r2 + 1
            goto L9
        L27:
            int r1 = r1 + 1
            goto L2
        L2a:
            r5 = 2147483647(0x7fffffff, float:NaN)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.b.g(com.google.android.gms.internal.ads.mx1, com.google.android.gms.internal.ads.x41):int");
    }

    public static final Pair i(int i4, f fVar, int[][][] iArr, a02 a02Var, Comparator comparator) {
        RandomAccess randomAccessL;
        f fVar2 = fVar;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 < 2) {
            if (i4 == fVar2.f10941a[i10]) {
                oz1 oz1Var = fVar2.f10942b[i10];
                for (int i11 = 0; i11 < oz1Var.f14820a; i11++) {
                    ii iiVarA = oz1Var.a(i11);
                    u51 u51VarJ = a02Var.j(i10, iiVarA, iArr[i10][i11]);
                    int i12 = iiVarA.f12337a;
                    boolean[] zArr = new boolean[i12];
                    int i13 = 0;
                    while (i13 < i12) {
                        int i14 = i13 + 1;
                        b02 b02Var = (b02) u51VarJ.get(i13);
                        int iA = b02Var.a();
                        if (!zArr[i13] && iA != 0) {
                            if (iA == 1) {
                                randomAccessL = x41.l(b02Var);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(b02Var);
                                for (int i15 = i14; i15 < i12; i15++) {
                                    b02 b02Var2 = (b02) u51VarJ.get(i15);
                                    if (b02Var2.a() == 2 && b02Var.b(b02Var2)) {
                                        arrayList2.add(b02Var2);
                                        zArr[i15] = true;
                                    }
                                }
                                randomAccessL = arrayList2;
                            }
                            arrayList.add(randomAccessL);
                        }
                        i13 = i14;
                    }
                }
            }
            i10++;
            fVar2 = fVar;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i16 = 0; i16 < list.size(); i16++) {
            iArr2[i16] = ((b02) list.get(i16)).f9531c;
        }
        b02 b02Var3 = (b02) list.get(0);
        return Pair.create(new c(b02Var3.f9530b, iArr2), Integer.valueOf(b02Var3.f9529a));
    }

    public final void a() {
        synchronized (this.f9508c) {
            this.f9510e.getClass();
        }
    }

    public final void b() {
        yz1 yz1Var;
        synchronized (this.f9508c) {
            try {
                Thread thread = this.f9511f;
                if (thread != null) {
                    mq0.d0("DefaultTrackSelector is accessed on the wrong thread.", thread == Thread.currentThread());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (yz1Var = this.g) != null) {
            yz1Var.d();
            this.g = null;
        }
        this.f9506a = null;
        this.f9507b = null;
    }

    public final void c(p50 p50Var) {
        if (this.f9512h.equals(p50Var)) {
            return;
        }
        this.f9512h = p50Var;
        h();
    }

    public final void d(vz1 vz1Var) {
        boolean zEquals;
        wz1 wz1Var = new wz1(vz1Var);
        synchronized (this.f9508c) {
            zEquals = this.f9510e.equals(wz1Var);
            this.f9510e = wz1Var;
        }
        if (zEquals) {
            return;
        }
        if (wz1Var.A && this.f9509d == null) {
            ls.t("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        nt1 nt1Var = this.f9506a;
        if (nt1Var != null) {
            nt1Var.f14419h.c(10);
        }
    }

    public final void h() {
        boolean z3;
        nt1 nt1Var;
        yz1 yz1Var;
        synchronized (this.f9508c) {
            try {
                z3 = false;
                if (this.f9510e.A && Build.VERSION.SDK_INT >= 32 && (yz1Var = this.g) != null && yz1Var.f18944b) {
                    z3 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z3 || (nt1Var = this.f9506a) == null) {
            return;
        }
        nt1Var.f14419h.c(10);
    }
}
