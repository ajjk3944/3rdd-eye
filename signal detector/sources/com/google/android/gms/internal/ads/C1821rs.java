package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import j$.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.rs, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1821rs {

    /* renamed from: a, reason: collision with root package name */
    public final int f16627a;

    /* renamed from: b, reason: collision with root package name */
    public Object f16628b;

    /* renamed from: c, reason: collision with root package name */
    public int f16629c;

    /* renamed from: d, reason: collision with root package name */
    public int f16630d;

    /* renamed from: e, reason: collision with root package name */
    public long f16631e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f16632f;

    /* renamed from: g, reason: collision with root package name */
    public long f16633g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ K4.c f16634h;

    public C1821rs(K4.c cVar, int i) {
        this.f16634h = cVar;
        this.f16627a = i;
    }

    public final void a() {
        K4.c cVar = this.f16634h;
        UN un = (UN) cVar.f2209b;
        C1231gt c1231gt = (C1231gt) cVar.f2214g;
        if (un.r1() != 3 || !un.t1() || un.s1() != 0) {
            if (this.f16632f) {
                c1231gt.d(2);
            }
            this.f16632f = false;
            return;
        }
        AbstractC1353j8 abstractC1353j8Y1 = un.y1();
        Object objF = abstractC1353j8Y1.g() ? null : abstractC1353j8Y1.f(un.A1());
        int iM = un.m();
        int iG1 = un.G1();
        long jD1 = un.D1();
        if (objF != null && iM == -1) {
            abstractC1353j8Y1.o(objF, (I7) cVar.f2213f);
            jD1 -= Vt.r(0L);
            iM = -1;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z6 = this.f16632f;
        int i = this.f16627a;
        if (z6 && Objects.equals(objF, this.f16628b) && iM == this.f16629c && iG1 == this.f16630d && jD1 == this.f16631e) {
            if (jElapsedRealtime - this.f16633g >= i) {
                ((NN) cVar.f2210c).f9997a.N1(new HN(2, new Os(2, i), BackupConstant.SCENE_CLOSED_WITHOUT_SHOW));
                return;
            }
            return;
        }
        this.f16632f = true;
        this.f16633g = jElapsedRealtime;
        this.f16628b = objF;
        this.f16629c = iM;
        this.f16630d = iG1;
        this.f16631e = jD1;
        c1231gt.d(2);
        c1231gt.f14397a.sendEmptyMessageDelayed(2, i);
    }
}
