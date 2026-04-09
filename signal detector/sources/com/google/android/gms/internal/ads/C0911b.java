package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.Spatializer;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0911b {

    /* renamed from: k, reason: collision with root package name */
    public static final BB f13269k = new BB();

    /* renamed from: a, reason: collision with root package name */
    public ZN f13270a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC1452l f13271b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f13272c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f13273d;

    /* renamed from: e, reason: collision with root package name */
    public C0884aR f13274e;

    /* renamed from: f, reason: collision with root package name */
    public Thread f13275f;

    /* renamed from: g, reason: collision with root package name */
    public A1.s f13276g;

    /* renamed from: h, reason: collision with root package name */
    public C0729Sj f13277h;
    public Boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final EO f13278j;

    public C0911b(Context context) {
        EO eo = new EO(14);
        C0884aR c0884aR = C0884aR.f13125F;
        this.f13272c = new Object();
        this.f13273d = context != null ? context.getApplicationContext() : null;
        this.f13278j = eo;
        if (c0884aR != null) {
            this.f13274e = c0884aR;
        } else {
            ZQ zq = new ZQ(c0884aR);
            zq.a(c0884aR);
            this.f13274e = new C0884aR(zq);
        }
        this.f13277h = C0729Sj.f11224b;
        if (this.f13274e.f13126A && context == null) {
            AbstractC2022vd.v("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static String e(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static int f(TP tp, String str, boolean z6) {
        if (!TextUtils.isEmpty(str) && str.equals(tp.f11389d)) {
            return 4;
        }
        String strE = e(str);
        String strE2 = e(tp.f11389d);
        if (strE2 == null || strE == null) {
            return (z6 && strE2 == null) ? 1 : 0;
        }
        if (strE2.startsWith(strE) || strE.startsWith(strE2)) {
            return 3;
        }
        String str2 = Vt.f12096a;
        return strE2.split("-", 2)[0].equals(strE.split("-", 2)[0]) ? 2 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        r1 = r1 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ int g(com.google.android.gms.internal.ads.TP r5, com.google.android.gms.internal.ads.LB r6) {
        /*
            r0 = 0
            r1 = r0
        L2:
            int r2 = r6.size()
            if (r1 >= r2) goto L2a
            r2 = r0
        L9:
            com.google.android.gms.internal.ads.LB r3 = r5.f11388c
            int r4 = r3.size()
            if (r2 >= r4) goto L27
            java.lang.Object r3 = r3.get(r2)
            com.google.android.gms.internal.ads.xQ r3 = (com.google.android.gms.internal.ads.C2126xQ) r3
            java.lang.String r3 = r3.f17591b
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0911b.g(com.google.android.gms.internal.ads.TP, com.google.android.gms.internal.ads.LB):int");
    }

    public static final Pair i(int i, C1129f c1129f, int[][][] iArr, InterfaceC1048dR interfaceC1048dR, Comparator comparator) {
        RandomAccess randomAccessI;
        C1129f c1129f2 = c1129f;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        while (i3 < 2) {
            if (i == c1129f2.f14002a[i3]) {
                SQ sq = c1129f2.f14003b[i3];
                for (int i6 = 0; i6 < sq.f11184a; i6++) {
                    C2108x8 c2108x8A = sq.a(i6);
                    C1197gC c1197gCC = interfaceC1048dR.c(i3, c2108x8A, iArr[i3][i6]);
                    int i7 = c2108x8A.f17546a;
                    boolean[] zArr = new boolean[i7];
                    int i8 = 0;
                    while (i8 < i7) {
                        int i9 = i8 + 1;
                        AbstractC1102eR abstractC1102eR = (AbstractC1102eR) c1197gCC.get(i8);
                        int iA = abstractC1102eR.a();
                        if (!zArr[i8] && iA != 0) {
                            if (iA == 1) {
                                randomAccessI = LB.i(abstractC1102eR);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(abstractC1102eR);
                                for (int i10 = i9; i10 < i7; i10++) {
                                    AbstractC1102eR abstractC1102eR2 = (AbstractC1102eR) c1197gCC.get(i10);
                                    if (abstractC1102eR2.a() == 2 && abstractC1102eR.b(abstractC1102eR2)) {
                                        arrayList2.add(abstractC1102eR2);
                                        zArr[i10] = true;
                                    }
                                }
                                randomAccessI = arrayList2;
                            }
                            arrayList.add(randomAccessI);
                        }
                        i8 = i9;
                    }
                }
            }
            i3++;
            c1129f2 = c1129f;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i11 = 0; i11 < list.size(); i11++) {
            iArr2[i11] = ((AbstractC1102eR) list.get(i11)).f13904c;
        }
        AbstractC1102eR abstractC1102eR3 = (AbstractC1102eR) list.get(0);
        return Pair.create(new C0965c(abstractC1102eR3.f13903b, iArr2), Integer.valueOf(abstractC1102eR3.f13902a));
    }

    public final void a() {
        synchronized (this.f13272c) {
            this.f13274e.getClass();
        }
    }

    public final void b() {
        A1.s sVar;
        C0939bR c0939bR;
        Handler handler;
        synchronized (this.f13272c) {
            try {
                Thread thread = this.f13275f;
                if (thread != null) {
                    AbstractC0582Jp.i0("DefaultTrackSelector is accessed on the wrong thread.", thread == Thread.currentThread());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (sVar = this.f13276g) != null) {
            Spatializer spatializer = (Spatializer) sVar.f123b;
            if (spatializer != null && (c0939bR = (C0939bR) sVar.f125d) != null && (handler = (Handler) sVar.f124c) != null) {
                spatializer.removeOnSpatializerStateChangedListener(c0939bR);
                handler.removeCallbacksAndMessages(null);
            }
            this.f13276g = null;
        }
        this.f13270a = null;
        this.f13271b = null;
    }

    public final void c(C0729Sj c0729Sj) {
        if (this.f13277h.equals(c0729Sj)) {
            return;
        }
        this.f13277h = c0729Sj;
        h();
    }

    public final void d(ZQ zq) {
        boolean zEquals;
        C0884aR c0884aR = new C0884aR(zq);
        synchronized (this.f13272c) {
            zEquals = this.f13274e.equals(c0884aR);
            this.f13274e = c0884aR;
        }
        if (zEquals) {
            return;
        }
        if (c0884aR.f13126A && this.f13273d == null) {
            AbstractC2022vd.v("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        ZN zn = this.f13270a;
        if (zn != null) {
            zn.f12866h.c(10);
        }
    }

    public final void h() {
        boolean z6;
        ZN zn;
        A1.s sVar;
        synchronized (this.f13272c) {
            try {
                z6 = false;
                if (this.f13274e.f13126A && Build.VERSION.SDK_INT >= 32 && (sVar = this.f13276g) != null && sVar.f122a) {
                    z6 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z6 || (zn = this.f13270a) == null) {
            return;
        }
        zn.f12866h.c(10);
    }
}
