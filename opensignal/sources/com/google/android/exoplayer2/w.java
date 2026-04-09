package com.google.android.exoplayer2;

import com.google.android.exoplayer2.analytics.AnalyticsListener;

/* loaded from: classes.dex */
public final /* synthetic */ class w implements qb.h, a5.j, u9.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4765a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4766d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f4767g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f4768r;

    public /* synthetic */ w(int i10, Object obj, Object obj2, int i11) {
        this.f4765a = i11;
        this.f4766d = i10;
        this.f4767g = obj;
        this.f4768r = obj2;
    }

    @Override // qb.h, a5.j
    public void a(Object obj) {
        switch (this.f4765a) {
            case 0:
                f1 f1Var = (f1) this.f4767g;
                f1 f1Var2 = (f1) this.f4768r;
                d1 d1Var = (d1) obj;
                int i10 = this.f4766d;
                d1Var.onPositionDiscontinuity(i10);
                d1Var.onPositionDiscontinuity(f1Var, f1Var2, i10);
                break;
            case 1:
                androidx.media3.common.r0 r0Var = (androidx.media3.common.r0) this.f4767g;
                androidx.media3.common.r0 r0Var2 = (androidx.media3.common.r0) this.f4768r;
                androidx.media3.common.q0 q0Var = (androidx.media3.common.q0) obj;
                int i11 = this.f4766d;
                q0Var.onPositionDiscontinuity(i11);
                q0Var.onPositionDiscontinuity(r0Var, r0Var2, i11);
                break;
            case 2:
                ((e5.c) obj).onMediaItemTransition((e5.a) this.f4767g, (androidx.media3.common.e0) this.f4768r, this.f4766d);
                break;
            default:
                ((AnalyticsListener) obj).onMediaItemTransition((x9.q) this.f4767g, (n0) this.f4768r, this.f4766d);
                break;
        }
    }

    @Override // u9.b
    public Object g() {
        al.b bVar = (al.b) this.f4767g;
        ((qm.c) bVar.f813e).O((m9.i) this.f4768r, this.f4766d + 1, false);
        return null;
    }

    public /* synthetic */ w(Object obj, Object obj2, int i10, int i11) {
        this.f4765a = i11;
        this.f4767g = obj;
        this.f4768r = obj2;
        this.f4766d = i10;
    }
}
