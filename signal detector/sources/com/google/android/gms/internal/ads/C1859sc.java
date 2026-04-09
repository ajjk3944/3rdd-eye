package com.google.android.gms.internal.ads;

import t2.AbstractC2907C;

/* renamed from: com.google.android.gms.internal.ads.sc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1859sc implements InterfaceC0691Qf, InterfaceC0674Pf {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2021vc f16757a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Su f16758b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0895ak f16759c;

    public /* synthetic */ C1859sc(C0895ak c0895ak, C2021vc c2021vc, Su su) {
        this.f16757a = c2021vc;
        this.f16758b = su;
        this.f16759c = c0895ak;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0674Pf, com.google.android.gms.internal.ads.InterfaceC0482Ea, com.google.android.gms.internal.ads.Dr
    /* renamed from: a */
    public void mo6a() {
        Yu yu;
        AbstractC2907C.m("loadNewJavascriptEngine (failure): Trying to acquire lock");
        C0895ak c0895ak = this.f16759c;
        synchronized (c0895ak.f13214b) {
            try {
                AbstractC2907C.m("loadNewJavascriptEngine (failure): Lock acquired");
                c0895ak.f13219g = 1;
                AbstractC2907C.m("Failed loading new engine. Marking new engine destroyable.");
                this.f16757a.F();
                if (((Boolean) AbstractC1049da.f13769d.v()).booleanValue() && (yu = (Yu) c0895ak.f13217e) != null) {
                    Su su = this.f16758b;
                    su.g("Failed loading new engine");
                    su.b(false);
                    yu.b(su.n());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        AbstractC2907C.m("loadNewJavascriptEngine (failure): Lock released");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0691Qf, com.google.android.gms.internal.ads.InterfaceC1223gl, com.google.android.gms.internal.ads.InterfaceC0801Wn
    /* renamed from: b */
    public /* synthetic */ void mo4b(Object obj) {
        Yu yu;
        AbstractC2907C.m("loadNewJavascriptEngine (success): Trying to acquire lock");
        C0895ak c0895ak = this.f16759c;
        synchronized (c0895ak.f13214b) {
            try {
                AbstractC2907C.m("loadNewJavascriptEngine (success): Lock acquired");
                c0895ak.f13219g = 0;
                C2021vc c2021vc = (C2021vc) c0895ak.f13218f;
                if (c2021vc != null && this.f16757a != c2021vc) {
                    AbstractC2907C.m("New JS engine is loaded, marking previous one as destroyable.");
                    ((C2021vc) c0895ak.f13218f).F();
                }
                c0895ak.f13218f = this.f16757a;
                if (((Boolean) AbstractC1049da.f13769d.v()).booleanValue() && (yu = (Yu) c0895ak.f13217e) != null) {
                    Su su = this.f16758b;
                    su.b(true);
                    yu.b(su.n());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        AbstractC2907C.m("loadNewJavascriptEngine (success): Lock released");
    }
}
