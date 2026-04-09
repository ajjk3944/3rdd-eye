package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import j$.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.ts, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1929ts {

    /* renamed from: a, reason: collision with root package name */
    public final int f16987a;

    /* renamed from: b, reason: collision with root package name */
    public Object f16988b;

    /* renamed from: c, reason: collision with root package name */
    public int f16989c;

    /* renamed from: d, reason: collision with root package name */
    public int f16990d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f16991e;

    /* renamed from: f, reason: collision with root package name */
    public long f16992f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ K4.c f16993g;

    public C1929ts(K4.c cVar, int i) {
        this.f16993g = cVar;
        this.f16987a = i;
    }

    public final void a() {
        long jB2;
        K4.c cVar = this.f16993g;
        UN un = (UN) cVar.f2209b;
        I7 i7 = (I7) cVar.f2213f;
        C1231gt c1231gt = (C1231gt) cVar.f2214g;
        AbstractC1353j8 abstractC1353j8Y1 = un.y1();
        Object objF = abstractC1353j8Y1.g() ? null : abstractC1353j8Y1.f(un.A1());
        int iM = un.m();
        int iG1 = un.G1();
        long jD1 = un.D1();
        if (objF == null || iM != -1) {
            jB2 = iM != -1 ? un.b2() : -9223372036854775807L;
        } else {
            abstractC1353j8Y1.o(objF, i7);
            jD1 -= Vt.r(0L);
            jB2 = Vt.r(i7.f9073d);
            iM = -1;
        }
        boolean z6 = un.r1() == 3 && un.t1() && un.s1() == 0;
        if (!z6 || jB2 == -9223372036854775807L || jD1 < jB2) {
            c1231gt.d(3);
            if (z6 && jB2 != -9223372036854775807L) {
                un.A0();
                c1231gt.f14397a.sendEmptyMessageDelayed(3, (int) Math.ceil((jB2 - jD1) / un.f11692o0.f16365o.f17679a));
            }
            this.f16991e = false;
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z7 = this.f16991e;
        int i = this.f16987a;
        if (z7 && Objects.equals(objF, this.f16988b) && iM == this.f16989c && iG1 == this.f16990d) {
            if (jElapsedRealtime - this.f16992f >= i) {
                ((NN) cVar.f2210c).f9997a.N1(new HN(2, new Os(3, i), BackupConstant.SCENE_CLOSED_WITHOUT_SHOW));
                return;
            }
            return;
        }
        this.f16991e = true;
        this.f16992f = jElapsedRealtime;
        this.f16988b = objF;
        this.f16989c = iM;
        this.f16990d = iG1;
        c1231gt.d(3);
        c1231gt.f14397a.sendEmptyMessageDelayed(3, i);
    }
}
