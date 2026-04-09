package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;

/* renamed from: com.google.android.gms.internal.ads.ys, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2199ys {

    /* renamed from: a, reason: collision with root package name */
    public final int f17780a;

    /* renamed from: b, reason: collision with root package name */
    public int f17781b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f17782c;

    /* renamed from: d, reason: collision with root package name */
    public long f17783d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ K4.c f17784e;

    public C2199ys(K4.c cVar, int i) {
        this.f17784e = cVar;
        this.f17780a = i;
    }

    public final void a() {
        K4.c cVar = this.f17784e;
        UN un = (UN) cVar.f2209b;
        C1231gt c1231gt = (C1231gt) cVar.f2214g;
        int iS1 = un.s1();
        UN un2 = (UN) cVar.f2209b;
        if (!un2.t1() || un2.r1() == 1 || un2.r1() == 4 || iS1 == 0 || iS1 == 1) {
            if (this.f17782c) {
                c1231gt.d(4);
            }
            this.f17782c = false;
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z6 = this.f17782c;
        int i = this.f17780a;
        if (z6 && this.f17781b == iS1) {
            if (jElapsedRealtime - this.f17783d >= i) {
                ((NN) cVar.f2210c).f9997a.N1(new HN(2, new Os(4, i), BackupConstant.SCENE_CLOSED_WITHOUT_SHOW));
                return;
            }
            return;
        }
        this.f17782c = true;
        this.f17783d = jElapsedRealtime;
        this.f17781b = iS1;
        c1231gt.d(4);
        c1231gt.f14397a.sendEmptyMessageDelayed(4, i);
    }
}
