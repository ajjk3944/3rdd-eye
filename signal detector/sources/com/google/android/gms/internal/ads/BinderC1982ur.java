package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.widget.FrameLayout;
import java.util.Collections;
import q2.C2841s;
import q2.InterfaceC2803B;
import q2.InterfaceC2809b0;
import q2.InterfaceC2842s0;
import q2.InterfaceC2847v;
import q2.InterfaceC2853y;
import q2.InterfaceC2854y0;
import t2.C2911G;
import u2.C2951a;

/* renamed from: com.google.android.gms.internal.ads.ur, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1982ur extends q2.K implements InterfaceC0645Nk {

    /* renamed from: a, reason: collision with root package name */
    public final Context f17176a;

    /* renamed from: b, reason: collision with root package name */
    public final C1715pt f17177b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17178c;

    /* renamed from: d, reason: collision with root package name */
    public final C2090wr f17179d;

    /* renamed from: e, reason: collision with root package name */
    public q2.d1 f17180e;

    /* renamed from: f, reason: collision with root package name */
    public final C0905au f17181f;

    /* renamed from: g, reason: collision with root package name */
    public final C2951a f17182g;

    /* renamed from: h, reason: collision with root package name */
    public final C0784Vn f17183h;
    public C0830Yi i;

    public BinderC1982ur(Context context, q2.d1 d1Var, String str, C1715pt c1715pt, C2090wr c2090wr, C2951a c2951a, C0784Vn c0784Vn) {
        this.f17176a = context;
        this.f17177b = c1715pt;
        this.f17180e = d1Var;
        this.f17178c = str;
        this.f17179d = c2090wr;
        this.f17181f = c1715pt.f16245k;
        this.f17182g = c2951a;
        this.f17183h = c0784Vn;
        c1715pt.f16243h.z1(this, c1715pt.f16237b);
    }

    @Override // q2.L
    public final synchronized String A() {
        return this.f17178c;
    }

    @Override // q2.L
    public final synchronized q2.B0 C() {
        M2.u.c("getVideoController must be called from the main thread.");
        C0830Yi c0830Yi = this.i;
        q2.B0 b0Mo5a = null;
        if (c0830Yi == null) {
            return null;
        }
        try {
            b0Mo5a = c0830Yi.f12657p.mo5a();
        } catch (C1123eu unused) {
        }
        return b0Mo5a;
    }

    @Override // q2.L
    public final void C3(q2.W w6) {
        if (M3()) {
            M2.u.c("setAppEventListener must be called on the main UI thread.");
        }
        this.f17179d.p(w6);
    }

    @Override // q2.L
    public final synchronized void D1(q2.d1 d1Var) {
        InterfaceC0828Yg interfaceC0828Yg;
        M2.u.c("setAdSize must be called on the main UI thread.");
        this.f17181f.f13242b = d1Var;
        this.f17180e = d1Var;
        C0830Yi c0830Yi = this.i;
        if (c0830Yi != null) {
            FrameLayout frameLayout = this.f17177b.f16241f;
            if (frameLayout != null && (interfaceC0828Yg = c0830Yi.f12655n) != null) {
                interfaceC0828Yg.f1(T2.d.a(d1Var));
                frameLayout.setMinimumHeight(d1Var.f23190c);
                frameLayout.setMinimumWidth(d1Var.f23193f);
                c0830Yi.f12662u = d1Var;
            }
        }
    }

    @Override // q2.L
    public final synchronized boolean H() {
        return this.f17177b.b();
    }

    @Override // q2.L
    public final synchronized void H3(N9 n9) {
        M2.u.c("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f17177b.f16242g = n9;
    }

    public final synchronized void K3(q2.d1 d1Var) {
        C0905au c0905au = this.f17181f;
        c0905au.f13242b = d1Var;
        c0905au.f13256q = this.f17180e.f23200n;
    }

    @Override // q2.L
    public final void L2(String str) {
    }

    public final synchronized boolean L3(q2.a1 a1Var) {
        try {
            if (M3()) {
                M2.u.c("loadAd must be called on the main UI thread.");
            }
            C2911G c2911g = p2.j.f22785C.f22790c;
            Context context = this.f17176a;
            if (!C2911G.i(context) || a1Var.f23156G != null) {
                Cr.t(context, a1Var.f23170f);
                return this.f17177b.a(a1Var, this.f17178c, null, new C1283hr(26, this));
            }
            u2.k.e("Failed to load the ad because app ID is missing.");
            C2090wr c2090wr = this.f17179d;
            if (c2090wr != null) {
                c2090wr.D(AbstractC1984ut.A(4, null, null));
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // q2.L
    public final synchronized boolean M() {
        C0830Yi c0830Yi = this.i;
        if (c0830Yi != null) {
            if (c0830Yi.f16601b.f10788q0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean M3() {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.J4 r0 = com.google.android.gms.internal.ads.AbstractC1266ha.f14504f
            java.lang.Object r0 = r0.v()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L24
            com.google.android.gms.internal.ads.E9 r0 = com.google.android.gms.internal.ads.H9.tc
            q2.s r3 = q2.C2841s.f23267e
            com.google.android.gms.internal.ads.G9 r3 = r3.f23270c
            java.lang.Object r0 = r3.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L24
            r0 = r1
            goto L25
        L24:
            r0 = r2
        L25:
            u2.a r3 = r6.f17182g
            int r3 = r3.f23786c
            com.google.android.gms.internal.ads.E9 r4 = com.google.android.gms.internal.ads.H9.uc
            q2.s r5 = q2.C2841s.f23267e
            com.google.android.gms.internal.ads.G9 r5 = r5.f23270c
            java.lang.Object r4 = r5.a(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r3 < r4) goto L3f
            if (r0 != 0) goto L3e
            goto L3f
        L3e:
            return r2
        L3f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.BinderC1982ur.M3():boolean");
    }

    @Override // q2.L
    public final synchronized InterfaceC2854y0 N() {
        C0830Yi c0830Yi;
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.x7)).booleanValue() && (c0830Yi = this.i) != null) {
            return c0830Yi.f16605f;
        }
        return null;
    }

    @Override // q2.L
    public final synchronized void O0(q2.Y0 y02) {
        try {
            if (M3()) {
                M2.u.c("setVideoOptions must be called on the main UI thread.");
            }
            this.f17181f.f13244d = y02;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // q2.L
    public final synchronized void R0(long j6) {
        C0712Rj c0712Rj;
        this.f17181f.f13260u.set(j6);
        C0830Yi c0830Yi = this.i;
        if (c0830Yi == null || (c0712Rj = c0830Yi.f16608j) == null) {
            return;
        }
        c0712Rj.a(j6);
    }

    @Override // q2.L
    public final void S0(boolean z6) {
    }

    @Override // q2.L
    public final void V2(InterfaceC2842s0 interfaceC2842s0) {
        if (M3()) {
            M2.u.c("setPaidEventListener must be called on the main UI thread.");
        }
        try {
            if (!interfaceC2842s0.d()) {
                this.f17183h.b();
            }
        } catch (RemoteException e6) {
            u2.k.d("Error in making CSI ping for reporting paid event callback", e6);
        }
        this.f17179d.f17501c.set(interfaceC2842s0);
    }

    @Override // q2.L
    public final InterfaceC2853y Y() {
        return this.f17179d.c();
    }

    @Override // q2.L
    public final synchronized long a0() {
        C0712Rj c0712Rj;
        C0830Yi c0830Yi = this.i;
        return (c0830Yi == null || (c0712Rj = c0830Yi.f16608j) == null) ? this.f17181f.f13260u.get() : c0712Rj.f11035a.get();
    }

    @Override // q2.L
    public final S2.a c() {
        if (M3()) {
            M2.u.c("getAdFrame must be called on the main UI thread.");
        }
        return new S2.b(this.f17177b.f16241f);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:13:0x003d, B:15:0x0041, B:12:0x0038), top: B:22:0x0001 }] */
    @Override // q2.L
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void d() {
        /*
            r4 = this;
            monitor-enter(r4)
            com.google.android.gms.internal.ads.J4 r0 = com.google.android.gms.internal.ads.AbstractC1266ha.f14505g     // Catch: java.lang.Throwable -> L36
            java.lang.Object r0 = r0.v()     // Catch: java.lang.Throwable -> L36
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L36
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L38
            com.google.android.gms.internal.ads.E9 r0 = com.google.android.gms.internal.ads.H9.rc     // Catch: java.lang.Throwable -> L36
            q2.s r1 = q2.C2841s.f23267e     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.G9 r2 = r1.f23270c     // Catch: java.lang.Throwable -> L36
            java.lang.Object r0 = r2.a(r0)     // Catch: java.lang.Throwable -> L36
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L36
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L38
            u2.a r0 = r4.f17182g     // Catch: java.lang.Throwable -> L36
            int r0 = r0.f23786c     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.E9 r2 = com.google.android.gms.internal.ads.H9.vc     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.G9 r1 = r1.f23270c     // Catch: java.lang.Throwable -> L36
            java.lang.Object r1 = r1.a(r2)     // Catch: java.lang.Throwable -> L36
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L36
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L36
            if (r0 >= r1) goto L3d
            goto L38
        L36:
            r0 = move-exception
            goto L54
        L38:
            java.lang.String r0 = "pause must be called on the main UI thread."
            M2.u.c(r0)     // Catch: java.lang.Throwable -> L36
        L3d:
            com.google.android.gms.internal.ads.Yi r0 = r4.i     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L52
            com.google.android.gms.internal.ads.xk r0 = r0.f16602c     // Catch: java.lang.Throwable -> L36
            r0.getClass()     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.hw r1 = new com.google.android.gms.internal.ads.hw     // Catch: java.lang.Throwable -> L36
            r2 = 3
            r3 = 0
            r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L36
            r0.C1(r1)     // Catch: java.lang.Throwable -> L36
            monitor-exit(r4)
            return
        L52:
            monitor-exit(r4)
            return
        L54:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L36
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.BinderC1982ur.d():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:13:0x003d, B:15:0x0041, B:12:0x0038), top: B:22:0x0001 }] */
    @Override // q2.L
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void e() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.J4 r0 = com.google.android.gms.internal.ads.AbstractC1266ha.f14506h     // Catch: java.lang.Throwable -> L36
            java.lang.Object r0 = r0.v()     // Catch: java.lang.Throwable -> L36
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L36
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L38
            com.google.android.gms.internal.ads.E9 r0 = com.google.android.gms.internal.ads.H9.pc     // Catch: java.lang.Throwable -> L36
            q2.s r1 = q2.C2841s.f23267e     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.G9 r2 = r1.f23270c     // Catch: java.lang.Throwable -> L36
            java.lang.Object r0 = r2.a(r0)     // Catch: java.lang.Throwable -> L36
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L36
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L38
            u2.a r0 = r3.f17182g     // Catch: java.lang.Throwable -> L36
            int r0 = r0.f23786c     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.E9 r2 = com.google.android.gms.internal.ads.H9.vc     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.G9 r1 = r1.f23270c     // Catch: java.lang.Throwable -> L36
            java.lang.Object r1 = r1.a(r2)     // Catch: java.lang.Throwable -> L36
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L36
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L36
            if (r0 >= r1) goto L3d
            goto L38
        L36:
            r0 = move-exception
            goto L53
        L38:
            java.lang.String r0 = "resume must be called on the main UI thread."
            M2.u.c(r0)     // Catch: java.lang.Throwable -> L36
        L3d:
            com.google.android.gms.internal.ads.Yi r0 = r3.i     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L51
            com.google.android.gms.internal.ads.xk r0 = r0.f16602c     // Catch: java.lang.Throwable -> L36
            r0.getClass()     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.wk r1 = new com.google.android.gms.internal.ads.wk     // Catch: java.lang.Throwable -> L36
            r2 = 0
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L36
            r0.C1(r1)     // Catch: java.lang.Throwable -> L36
            monitor-exit(r3)
            return
        L51:
            monitor-exit(r3)
            return
        L53:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L36
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.BinderC1982ur.e():void");
    }

    @Override // q2.L
    public final synchronized boolean f0(q2.a1 a1Var) {
        K3(this.f17180e);
        return L3(a1Var);
    }

    @Override // q2.L
    public final void i() {
    }

    @Override // q2.L
    public final Bundle k() {
        M2.u.c("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // q2.L
    public final void k1(InterfaceC2853y interfaceC2853y) {
        if (M3()) {
            M2.u.c("setAdListener must be called on the main UI thread.");
        }
        this.f17179d.f17499a.set(interfaceC2853y);
    }

    @Override // q2.L
    public final boolean m() {
        return false;
    }

    @Override // q2.L
    public final synchronized void n() {
        M2.u.c("recordManualImpression must be called on the main UI thread.");
        C0830Yi c0830Yi = this.i;
        if (c0830Yi != null) {
            c0830Yi.e();
        }
    }

    @Override // q2.L
    public final synchronized q2.d1 o() {
        M2.u.c("getAdSize must be called on the main UI thread.");
        C0830Yi c0830Yi = this.i;
        if (c0830Yi != null) {
            return C1476lN.f(this.f17176a, Collections.singletonList(c0830Yi.c()));
        }
        return this.f17181f.f13242b;
    }

    @Override // q2.L
    public final void q2(InterfaceC2847v interfaceC2847v) {
        if (M3()) {
            M2.u.c("setAdListener must be called on the main UI thread.");
        }
        C2198yr c2198yr = this.f17177b.f16240e;
        synchronized (c2198yr) {
            c2198yr.f17779a = interfaceC2847v;
        }
    }

    @Override // q2.L
    public final synchronized String r() {
        BinderC1168fk binderC1168fk;
        C0830Yi c0830Yi = this.i;
        if (c0830Yi == null || (binderC1168fk = c0830Yi.f16605f) == null) {
            return null;
        }
        return binderC1168fk.f14124a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:13:0x003d, B:15:0x0041, B:12:0x0038), top: B:22:0x0001 }] */
    @Override // q2.L
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void s() {
        /*
            r4 = this;
            monitor-enter(r4)
            com.google.android.gms.internal.ads.J4 r0 = com.google.android.gms.internal.ads.AbstractC1266ha.f14503e     // Catch: java.lang.Throwable -> L36
            java.lang.Object r0 = r0.v()     // Catch: java.lang.Throwable -> L36
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L36
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L38
            com.google.android.gms.internal.ads.E9 r0 = com.google.android.gms.internal.ads.H9.qc     // Catch: java.lang.Throwable -> L36
            q2.s r1 = q2.C2841s.f23267e     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.G9 r2 = r1.f23270c     // Catch: java.lang.Throwable -> L36
            java.lang.Object r0 = r2.a(r0)     // Catch: java.lang.Throwable -> L36
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L36
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L38
            u2.a r0 = r4.f17182g     // Catch: java.lang.Throwable -> L36
            int r0 = r0.f23786c     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.E9 r2 = com.google.android.gms.internal.ads.H9.vc     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.G9 r1 = r1.f23270c     // Catch: java.lang.Throwable -> L36
            java.lang.Object r1 = r1.a(r2)     // Catch: java.lang.Throwable -> L36
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L36
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L36
            if (r0 >= r1) goto L3d
            goto L38
        L36:
            r0 = move-exception
            goto L54
        L38:
            java.lang.String r0 = "destroy must be called on the main UI thread."
            M2.u.c(r0)     // Catch: java.lang.Throwable -> L36
        L3d:
            com.google.android.gms.internal.ads.Yi r0 = r4.i     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L52
            com.google.android.gms.internal.ads.xk r0 = r0.f16602c     // Catch: java.lang.Throwable -> L36
            r0.getClass()     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.C9 r1 = new com.google.android.gms.internal.ads.C9     // Catch: java.lang.Throwable -> L36
            r2 = 0
            r3 = 0
            r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L36
            r0.C1(r1)     // Catch: java.lang.Throwable -> L36
            monitor-exit(r4)
            return
        L52:
            monitor-exit(r4)
            return
        L54:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L36
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.BinderC1982ur.s():void");
    }

    @Override // q2.L
    public final void s1() {
        M2.u.c("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // q2.L
    public final q2.W u() {
        q2.W w6;
        C2090wr c2090wr = this.f17179d;
        synchronized (c2090wr) {
            w6 = (q2.W) c2090wr.f17500b.get();
        }
        return w6;
    }

    @Override // q2.L
    public final synchronized void v1(q2.Z z6) {
        M2.u.c("setCorrelationIdProvider must be called on the main UI thread");
        this.f17181f.f13262w = z6;
    }

    @Override // q2.L
    public final synchronized String w() {
        BinderC1168fk binderC1168fk;
        C0830Yi c0830Yi = this.i;
        if (c0830Yi == null || (binderC1168fk = c0830Yi.f16605f) == null) {
            return null;
        }
        return binderC1168fk.f14124a;
    }

    @Override // q2.L
    public final void w1(InterfaceC1407k8 interfaceC1407k8) {
    }

    @Override // q2.L
    public final synchronized void w2(boolean z6) {
        try {
            if (M3()) {
                M2.u.c("setManualImpressionsEnabled must be called from the main thread.");
            }
            this.f17181f.f13245e = z6;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // q2.L
    public final void K() {
    }

    @Override // q2.L
    public final void b0() {
    }

    @Override // q2.L
    public final void l() {
    }

    @Override // q2.L
    public final void q() {
    }

    @Override // q2.L
    public final void B2(S2.a aVar) {
    }

    @Override // q2.L
    public final void I2(InterfaceC2809b0 interfaceC2809b0) {
    }

    @Override // q2.L
    public final void S1(C0435Be c0435Be) {
    }

    @Override // q2.L
    public final void u2(q2.g1 g1Var) {
    }

    @Override // q2.L
    public final void x3(q2.a1 a1Var, InterfaceC2803B interfaceC2803B) {
    }
}
