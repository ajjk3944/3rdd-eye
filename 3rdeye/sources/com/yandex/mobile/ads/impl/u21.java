package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import c9.C2092m;
import com.yandex.mobile.ads.impl.a92;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class u21 implements id1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f33881a;

    /* renamed from: b, reason: collision with root package name */
    private final ed1 f33882b;

    /* renamed from: c, reason: collision with root package name */
    private final w52 f33883c;

    /* renamed from: d, reason: collision with root package name */
    private final String f33884d;

    /* renamed from: e, reason: collision with root package name */
    private final e9 f33885e;

    /* renamed from: f, reason: collision with root package name */
    private final a f33886f;

    /* renamed from: g, reason: collision with root package name */
    private final h9 f33887g;

    /* renamed from: h, reason: collision with root package name */
    private final ew1 f33888h;
    private final e62 i;

    /* renamed from: j, reason: collision with root package name */
    private final ArrayList f33889j;

    /* renamed from: k, reason: collision with root package name */
    private hk0 f33890k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f33891l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f33892m;

    public static final class a extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private final ed1 f33893a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Looper looper, ed1 noticeReportController) {
            super(looper);
            kotlin.jvm.internal.l.f(looper, "looper");
            kotlin.jvm.internal.l.f(noticeReportController, "noticeReportController");
            this.f33893a = noticeReportController;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(Message msg) {
            long jElapsedRealtime;
            kotlin.jvm.internal.l.f(msg, "msg");
            int i = msg.what;
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                Object obj = msg.obj;
                kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type java.lang.ref.WeakReference<com.monetization.ads.base.impression.tracking.MrcNoticeTrackingManager?>");
                u21 u21Var = (u21) ((WeakReference) obj).get();
                if (u21Var != null) {
                    fp0.d(Integer.valueOf(u21Var.f33889j.size()), u21Var.f33884d);
                    Iterator it = u21Var.f33889j.iterator();
                    while (it.hasNext()) {
                        d62 d62Var = (d62) it.next();
                        a92 a92VarA = u21.a(u21Var, d62Var);
                        if (u21.a(a92VarA)) {
                            Long lB = d62Var.b();
                            if (lB != null) {
                                jElapsedRealtime = lB.longValue();
                            } else {
                                jElapsedRealtime = SystemClock.elapsedRealtime();
                                d62Var.a(Long.valueOf(jElapsedRealtime));
                            }
                            if (SystemClock.elapsedRealtime() - jElapsedRealtime >= d62Var.a()) {
                                u21Var.f33886f.sendMessage(Message.obtain(u21Var.f33886f, 1, new b9.l(new WeakReference(u21Var), d62Var)));
                            }
                            u21Var.f();
                            this.f33893a.a(d62Var.c());
                        } else {
                            d62Var.a(null);
                            this.f33893a.a(d62Var.c(), a92VarA);
                        }
                    }
                    if (u21Var.d()) {
                        u21Var.f33886f.sendMessageDelayed(Message.obtain(u21Var.f33886f, 2, new WeakReference(u21Var)), 200L);
                        return;
                    }
                    return;
                }
                return;
            }
            Object obj2 = msg.obj;
            kotlin.jvm.internal.l.d(obj2, "null cannot be cast to non-null type kotlin.Pair<java.lang.ref.WeakReference<com.monetization.ads.base.impression.tracking.MrcNoticeTrackingManager>, com.monetization.ads.base.impression.tracking.model.TrackingNotice>");
            b9.l lVar = (b9.l) obj2;
            u21 u21Var2 = (u21) ((WeakReference) lVar.f18083b).get();
            if (u21Var2 != null) {
                d62 d62Var2 = (d62) lVar.f18084c;
                fp0.d(u21Var2.f33884d);
                du1 du1VarA = u21Var2.f33888h.a(u21Var2.f33881a);
                if (du1VarA != null && du1VarA.U()) {
                    u21Var2.f33887g.a(d62Var2.d(), m62.f30287h);
                    u21Var2.f33889j.remove(d62Var2);
                    u21Var2.e();
                    ed1 ed1Var = this.f33893a;
                    ux1 ux1VarC = d62Var2.c();
                    ArrayList arrayList = u21Var2.f33889j;
                    ArrayList arrayList2 = new ArrayList(C2092m.T(arrayList, 10));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((d62) it2.next()).c());
                    }
                    ed1Var.a(ux1VarC, arrayList2);
                    return;
                }
                a92 a92VarA2 = u21.a(u21Var2, d62Var2);
                u21Var2.a(d62Var2, a92VarA2);
                if (!u21.a(a92VarA2)) {
                    d62Var2.a(null);
                    u21Var2.b();
                    return;
                }
                u21Var2.f33889j.remove(d62Var2);
                u21Var2.e();
                ed1 ed1Var2 = this.f33893a;
                ux1 ux1VarC2 = d62Var2.c();
                ArrayList arrayList3 = u21Var2.f33889j;
                ArrayList arrayList4 = new ArrayList(C2092m.T(arrayList3, 10));
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(((d62) it3.next()).c());
                }
                ed1Var2.a(ux1VarC2, arrayList4);
            }
        }
    }

    public u21(Context context, C4072a3 adConfiguration, ed1 noticeReportController, w52 trackingChecker, String viewControllerDescription, e9 adStructureType, a handler, h9 adTracker, ew1 sdkSettings, e62 trackingNoticeBuilder) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(noticeReportController, "noticeReportController");
        kotlin.jvm.internal.l.f(trackingChecker, "trackingChecker");
        kotlin.jvm.internal.l.f(viewControllerDescription, "viewControllerDescription");
        kotlin.jvm.internal.l.f(adStructureType, "adStructureType");
        kotlin.jvm.internal.l.f(handler, "handler");
        kotlin.jvm.internal.l.f(adTracker, "adTracker");
        kotlin.jvm.internal.l.f(sdkSettings, "sdkSettings");
        kotlin.jvm.internal.l.f(trackingNoticeBuilder, "trackingNoticeBuilder");
        this.f33881a = context;
        this.f33882b = noticeReportController;
        this.f33883c = trackingChecker;
        this.f33884d = viewControllerDescription;
        this.f33885e = adStructureType;
        this.f33886f = handler;
        this.f33887g = adTracker;
        this.f33888h = sdkSettings;
        this.i = trackingNoticeBuilder;
        this.f33889j = new ArrayList();
    }

    public static final boolean a(a92 a92Var) {
        return a92Var.b() == a92.a.f24561c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized boolean d() {
        return !this.f33889j.isEmpty();
    }

    @Override // com.yandex.mobile.ads.impl.id1
    public final synchronized void b() {
        fp0.d(new Object[0]);
        if (ah1.f24667h.a(this.f33881a).b() && d() && !this.f33886f.hasMessages(2)) {
            a aVar = this.f33886f;
            aVar.sendMessage(Message.obtain(aVar, 2, new WeakReference(this)));
        }
    }

    @Override // com.yandex.mobile.ads.impl.id1
    public final synchronized void c() {
        try {
            fp0.d(Integer.valueOf(this.f33889j.size()), this.f33884d);
            a();
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f33889j.iterator();
            while (it.hasNext()) {
                d62 d62Var = (d62) it.next();
                du1 du1VarA = this.f33888h.a(this.f33881a);
                a92 a92VarB = du1VarA != null ? du1VarA.m0() : false ? this.f33883c.b(d62Var.e()) : du1VarA != null ? du1VarA.b0() : false ? new a92(a92.a.f24561c, null) : this.f33883c.a(d62Var.e());
                fp0.d(a92VarB.b().a());
                a(d62Var, a92VarB);
                if (a92VarB.b() == a92.a.f24561c) {
                    it.remove();
                    f();
                    e();
                    this.f33882b.a(d62Var.c());
                    ed1 ed1Var = this.f33882b;
                    ux1 ux1VarC = d62Var.c();
                    ArrayList arrayList2 = this.f33889j;
                    ArrayList arrayList3 = new ArrayList(C2092m.T(arrayList2, 10));
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(((d62) it2.next()).c());
                    }
                    ed1Var.a(ux1VarC, arrayList3);
                } else {
                    arrayList.add(new kd1(d62Var, a92VarB));
                }
            }
            this.f33882b.a(arrayList);
            b();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void e() {
        if (this.f33892m || !this.f33889j.isEmpty()) {
            return;
        }
        this.f33892m = true;
        hk0 hk0Var = this.f33890k;
        if (hk0Var != null) {
            hk0Var.g();
        }
    }

    public final void f() {
        if (this.f33891l) {
            return;
        }
        this.f33891l = true;
        hk0 hk0Var = this.f33890k;
        if (hk0Var != null) {
            hk0Var.c();
        }
    }

    public static final a92 a(u21 u21Var, d62 d62Var) {
        a92 a92VarB = u21Var.f33883c.b(d62Var.e());
        fp0.d(a92VarB.b().a());
        return a92VarB;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void a(java.util.List<com.yandex.mobile.ads.impl.tx1> r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            java.lang.String r0 = "showNotices"
            kotlin.jvm.internal.l.f(r10, r0)     // Catch: java.lang.Throwable -> L3a
            java.util.ArrayList r0 = r9.f33889j     // Catch: java.lang.Throwable -> L3a
            r0.clear()     // Catch: java.lang.Throwable -> L3a
            com.yandex.mobile.ads.impl.e62 r0 = r9.i     // Catch: java.lang.Throwable -> L3a
            com.yandex.mobile.ads.impl.e9 r1 = r9.f33885e     // Catch: java.lang.Throwable -> L3a
            r0.getClass()     // Catch: java.lang.Throwable -> L3a
            java.lang.String r0 = "adStructureType"
            kotlin.jvm.internal.l.f(r1, r0)     // Catch: java.lang.Throwable -> L3a
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3a
            r2 = 10
            int r2 = c9.C2092m.T(r10, r2)     // Catch: java.lang.Throwable -> L3a
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L3a
            java.util.Iterator r2 = r10.iterator()     // Catch: java.lang.Throwable -> L3a
        L26:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L3a
            if (r3 == 0) goto L3e
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L3a
            com.yandex.mobile.ads.impl.tx1 r3 = (com.yandex.mobile.ads.impl.tx1) r3     // Catch: java.lang.Throwable -> L3a
            com.yandex.mobile.ads.impl.ux1 r3 = r3.b()     // Catch: java.lang.Throwable -> L3a
            r0.add(r3)     // Catch: java.lang.Throwable -> L3a
            goto L26
        L3a:
            r0 = move-exception
            r10 = r0
            goto Le7
        L3e:
            java.util.Set r0 = c9.C2097r.L0(r0)     // Catch: java.lang.Throwable -> L3a
            int r1 = r1.ordinal()     // Catch: java.lang.Throwable -> L3a
            if (r1 == 0) goto L5a
            r0 = 1
            if (r1 == r0) goto L57
            r0 = 2
            if (r1 != r0) goto L51
            com.yandex.mobile.ads.impl.ux1 r0 = com.yandex.mobile.ads.impl.ux1.f34241b     // Catch: java.lang.Throwable -> L3a
            goto L7d
        L51:
            b9.j r10 = new b9.j     // Catch: java.lang.Throwable -> L3a
            r10.<init>()     // Catch: java.lang.Throwable -> L3a
            throw r10     // Catch: java.lang.Throwable -> L3a
        L57:
            com.yandex.mobile.ads.impl.ux1 r0 = com.yandex.mobile.ads.impl.ux1.f34242c     // Catch: java.lang.Throwable -> L3a
            goto L7d
        L5a:
            boolean r1 = r0 instanceof java.util.Collection     // Catch: java.lang.Throwable -> L3a
            if (r1 == 0) goto L65
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L3a
            if (r1 == 0) goto L65
            goto L7b
        L65:
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L3a
        L69:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L3a
            if (r1 == 0) goto L7b
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L3a
            com.yandex.mobile.ads.impl.ux1 r1 = (com.yandex.mobile.ads.impl.ux1) r1     // Catch: java.lang.Throwable -> L3a
            com.yandex.mobile.ads.impl.ux1 r2 = com.yandex.mobile.ads.impl.ux1.f34242c     // Catch: java.lang.Throwable -> L3a
            if (r1 != r2) goto L69
            r0 = 0
            goto L7d
        L7b:
            com.yandex.mobile.ads.impl.ux1 r0 = com.yandex.mobile.ads.impl.ux1.f34241b     // Catch: java.lang.Throwable -> L3a
        L7d:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3a
            r1.<init>()     // Catch: java.lang.Throwable -> L3a
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3a
            r2.<init>()     // Catch: java.lang.Throwable -> L3a
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Throwable -> L3a
        L8b:
            boolean r3 = r10.hasNext()     // Catch: java.lang.Throwable -> L3a
            if (r3 == 0) goto La2
            java.lang.Object r3 = r10.next()     // Catch: java.lang.Throwable -> L3a
            r4 = r3
            com.yandex.mobile.ads.impl.tx1 r4 = (com.yandex.mobile.ads.impl.tx1) r4     // Catch: java.lang.Throwable -> L3a
            java.lang.String r4 = r4.c()     // Catch: java.lang.Throwable -> L3a
            if (r4 == 0) goto L8b
            r2.add(r3)     // Catch: java.lang.Throwable -> L3a
            goto L8b
        La2:
            java.util.Iterator r10 = r2.iterator()     // Catch: java.lang.Throwable -> L3a
        La6:
            boolean r2 = r10.hasNext()     // Catch: java.lang.Throwable -> L3a
            if (r2 == 0) goto Le0
            java.lang.Object r2 = r10.next()     // Catch: java.lang.Throwable -> L3a
            com.yandex.mobile.ads.impl.tx1 r2 = (com.yandex.mobile.ads.impl.tx1) r2     // Catch: java.lang.Throwable -> L3a
            java.lang.String r8 = r2.c()     // Catch: java.lang.Throwable -> L3a
            long r5 = r2.a()     // Catch: java.lang.Throwable -> L3a
            int r4 = r2.d()     // Catch: java.lang.Throwable -> L3a
            com.yandex.mobile.ads.impl.ux1 r3 = r2.b()     // Catch: java.lang.Throwable -> L3a
            com.yandex.mobile.ads.impl.ux1 r7 = com.yandex.mobile.ads.impl.ux1.f34243d     // Catch: java.lang.Throwable -> L3a
            if (r3 != r7) goto Ld0
            if (r0 != 0) goto Lce
            com.yandex.mobile.ads.impl.ux1 r2 = r2.b()     // Catch: java.lang.Throwable -> L3a
        Lcc:
            r7 = r2
            goto Ld5
        Lce:
            r7 = r0
            goto Ld5
        Ld0:
            com.yandex.mobile.ads.impl.ux1 r2 = r2.b()     // Catch: java.lang.Throwable -> L3a
            goto Lcc
        Ld5:
            if (r8 == 0) goto La6
            com.yandex.mobile.ads.impl.d62 r3 = new com.yandex.mobile.ads.impl.d62     // Catch: java.lang.Throwable -> L3a
            r3.<init>(r4, r5, r7, r8)     // Catch: java.lang.Throwable -> L3a
            r1.add(r3)     // Catch: java.lang.Throwable -> L3a
            goto La6
        Le0:
            java.util.ArrayList r10 = r9.f33889j     // Catch: java.lang.Throwable -> L3a
            r10.addAll(r1)     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r9)
            return
        Le7:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L3a
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.u21.a(java.util.List):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void a(com.yandex.mobile.ads.impl.xg1 r2, boolean r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "phoneState"
            kotlin.jvm.internal.l.f(r2, r0)     // Catch: java.lang.Throwable -> L20
            r2.toString()     // Catch: java.lang.Throwable -> L20
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L20
            com.yandex.mobile.ads.impl.fp0.d(r0)     // Catch: java.lang.Throwable -> L20
            int r2 = r2.ordinal()     // Catch: java.lang.Throwable -> L20
            if (r2 == 0) goto L22
            r0 = 1
            if (r2 == r0) goto L1c
            r0 = 2
            if (r2 == r0) goto L22
            goto L27
        L1c:
            r1.a()     // Catch: java.lang.Throwable -> L20
            goto L27
        L20:
            r2 = move-exception
            goto L29
        L22:
            if (r3 == 0) goto L27
            r1.b()     // Catch: java.lang.Throwable -> L20
        L27:
            monitor-exit(r1)
            return
        L29:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L20
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.u21.a(com.yandex.mobile.ads.impl.xg1, boolean):void");
    }

    @Override // com.yandex.mobile.ads.impl.id1
    public final void a(hk0 impressionTrackingListener) {
        kotlin.jvm.internal.l.f(impressionTrackingListener, "impressionTrackingListener");
        this.f33890k = impressionTrackingListener;
    }

    @Override // com.yandex.mobile.ads.impl.id1
    public final synchronized void a() {
        fp0.d(new Object[0]);
        this.f33886f.removeMessages(2);
        this.f33886f.removeMessages(1);
        Iterator it = this.f33889j.iterator();
        while (it.hasNext()) {
            ((d62) it.next()).a(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void a(d62 d62Var, a92 a92Var) {
        try {
            if (a92Var.b() == a92.a.f24561c) {
                this.f33887g.a(d62Var.d(), m62.f30287h);
            } else {
                this.f33882b.a(d62Var.c(), a92Var);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.yandex.mobile.ads.impl.id1
    public final synchronized void a(a8<?> adResponse, List<tx1> showNotices) {
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(showNotices, "showNotices");
        fp0.d(new Object[0]);
        this.f33882b.a(adResponse);
        this.f33889j.clear();
        this.f33882b.invalidate();
        this.f33892m = false;
        a();
        a(showNotices);
    }
}
