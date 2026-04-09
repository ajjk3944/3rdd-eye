package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import j$.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.is, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1337is {

    /* renamed from: a, reason: collision with root package name */
    public final int f14810a;

    /* renamed from: b, reason: collision with root package name */
    public Object f14811b;

    /* renamed from: c, reason: collision with root package name */
    public int f14812c;

    /* renamed from: d, reason: collision with root package name */
    public int f14813d;

    /* renamed from: e, reason: collision with root package name */
    public long f14814e;

    /* renamed from: f, reason: collision with root package name */
    public long f14815f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f14816g;

    /* renamed from: h, reason: collision with root package name */
    public long f14817h;
    public final /* synthetic */ K4.c i;

    public C1337is(K4.c cVar, int i) {
        this.i = cVar;
        this.f14810a = i;
    }

    public final void a() {
        Object obj;
        K4.c cVar = this.i;
        UN un = (UN) cVar.f2209b;
        C1231gt c1231gt = (C1231gt) cVar.f2214g;
        if (un.r1() != 2 || !un.t1() || un.s1() != 0) {
            if (this.f14816g) {
                c1231gt.d(1);
            }
            this.f14816g = false;
            return;
        }
        AbstractC1353j8 abstractC1353j8Y1 = un.y1();
        Object objF = abstractC1353j8Y1.g() ? null : abstractC1353j8Y1.f(un.A1());
        int iM = un.m();
        int iG1 = un.G1();
        long jC2 = un.c2();
        long jMax = Math.max(0L, un.E1() - Math.max(0L, jC2 - un.D1()));
        if (objF != null && iM == -1) {
            abstractC1353j8Y1.o(objF, (I7) cVar.f2213f);
            jC2 -= Vt.r(0L);
            iM = -1;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z6 = this.f14816g;
        int i = this.f14810a;
        if (z6 && Objects.equals(objF, this.f14811b) && iM == this.f14812c && iG1 == this.f14813d) {
            obj = objF;
            if (jC2 == this.f14814e && jMax == this.f14815f) {
                if (jElapsedRealtime - this.f14817h >= i) {
                    ((NN) cVar.f2210c).f9997a.N1(new HN(2, new Os(1, i), BackupConstant.SCENE_CLOSED_WITHOUT_SHOW));
                    return;
                }
                return;
            }
        } else {
            obj = objF;
        }
        this.f14816g = true;
        this.f14817h = jElapsedRealtime;
        this.f14811b = obj;
        this.f14812c = iM;
        this.f14813d = iG1;
        this.f14814e = jC2;
        this.f14815f = jMax;
        c1231gt.d(1);
        c1231gt.f14397a.sendEmptyMessageDelayed(1, i);
    }
}
