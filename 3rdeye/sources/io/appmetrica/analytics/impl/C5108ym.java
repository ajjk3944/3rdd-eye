package io.appmetrica.analytics.impl;

import android.content.Context;
import c9.C2099t;
import io.appmetrica.analytics.coreutils.internal.executors.SynchronizedBlockingExecutor;
import io.appmetrica.analytics.networktasks.internal.AllHostsExponentialBackoffPolicy;
import io.appmetrica.analytics.networktasks.internal.DefaultResponseValidityChecker;
import io.appmetrica.analytics.networktasks.internal.FinalConfigProvider;
import io.appmetrica.analytics.networktasks.internal.FullUrlFormer;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.ym, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5108ym {

    /* renamed from: a, reason: collision with root package name */
    public final C5133zm f42149a;

    /* renamed from: b, reason: collision with root package name */
    public volatile NetworkTask f42150b;

    public C5108ym(C5133zm c5133zm) {
        this.f42149a = c5133zm;
    }

    public final Context b() {
        return this.f42149a.f42201a;
    }

    public final synchronized NetworkTask c() throws Throwable {
        NetworkTask networkTask;
        try {
            try {
                if (g()) {
                    networkTask = this.f42150b;
                    if (networkTask == null || networkTask.isRemoved()) {
                        Yl ylD = d();
                        C4691ie c4691ie = C4691ie.f41065a;
                        Ul ul = new Ul(new C4975te(), Ga.f39501F.o());
                        FinalConfigProvider finalConfigProvider = new FinalConfigProvider(ylD);
                        try {
                            NetworkTask networkTask2 = new NetworkTask(new SynchronizedBlockingExecutor(), new Q9(this.f42149a.f42201a), new AllHostsExponentialBackoffPolicy(C4691ie.f41065a.a(EnumC4639ge.STARTUP)), new C5058wm(this, new Ol(), new FullUrlFormer(ul, finalConfigProvider), new RequestDataHolder(), new ResponseDataHolder(new DefaultResponseValidityChecker()), finalConfigProvider), C2099t.f18581b, C4691ie.f41067c);
                            this.f42150b = networkTask2;
                            networkTask = networkTask2;
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    }
                } else {
                    networkTask = null;
                }
                return networkTask;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final Yl d() {
        return (Yl) this.f42149a.f42211l.a();
    }

    public final C4544cm e() {
        C4544cm c4544cm;
        Fl fl = this.f42149a.f42211l;
        synchronized (fl) {
            c4544cm = fl.f39562c.f40791a;
        }
        return c4544cm;
    }

    public final void f() {
        C4544cm c4544cm;
        Fl fl = this.f42149a.f42211l;
        synchronized (fl) {
            c4544cm = fl.f39562c.f40791a;
        }
        C4647gm c4647gm = c4544cm.f40642c;
        C4621fm c4621fmA = c4647gm.a(c4647gm.f40964m);
        String strA = c4544cm.f40640a;
        String str = c4544cm.f40641b;
        C4726jo c4726jo = this.f42149a.f42213n;
        String str2 = c4544cm.f40643d;
        c4726jo.getClass();
        if (!C4726jo.a(str2)) {
            c4621fmA.f40877a = this.f42149a.f42212m.a().id;
        }
        String str3 = c4544cm.f40640a;
        if (str3 == null || str3.length() == 0) {
            strA = this.f42149a.f42208h.a();
            str = "";
        }
        List<String> list = this.f42149a.f42203c.f40362e;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        c4621fmA.f40883g = list;
        C4544cm c4544cm2 = new C4544cm(strA, str, new C4647gm(c4621fmA));
        b(c4544cm2);
        a(c4544cm2);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005c A[PHI: r2
  0x005c: PHI (r2v4 boolean) = (r2v3 boolean), (r2v7 boolean), (r2v7 boolean) binds: [B:13:0x0025, B:22:0x0057, B:23:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean g() {
        /*
            r8 = this;
            r0 = 1
            monitor-enter(r8)
            io.appmetrica.analytics.impl.cm r1 = r8.e()     // Catch: java.lang.Throwable -> L22
            java.util.Set r2 = io.appmetrica.analytics.impl.Zl.f40487a     // Catch: java.lang.Throwable -> L22
            boolean r2 = r1.f40661w     // Catch: java.lang.Throwable -> L22
            r3 = 0
            if (r2 != 0) goto L24
            long r4 = r1.f40653o     // Catch: java.lang.Throwable -> L22
            io.appmetrica.analytics.impl.Am r2 = r1.f40637A     // Catch: java.lang.Throwable -> L22
            int r2 = r2.f39125a     // Catch: java.lang.Throwable -> L22
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L22
            long r4 = r4 + r6
            io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider r2 = io.appmetrica.analytics.impl.Zl.f40488b     // Catch: java.lang.Throwable -> L22
            long r6 = r2.currentTimeSeconds()     // Catch: java.lang.Throwable -> L22
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r2 <= 0) goto L20
            goto L24
        L20:
            r2 = r3
            goto L25
        L22:
            r0 = move-exception
            goto L5f
        L24:
            r2 = r0
        L25:
            if (r2 != 0) goto L5c
            java.lang.String r2 = r1.f40643d     // Catch: java.lang.Throwable -> L22
            boolean r2 = io.appmetrica.analytics.impl.Zl.a(r2)     // Catch: java.lang.Throwable -> L22
            if (r2 == 0) goto L40
            java.lang.String r2 = r1.f40640a     // Catch: java.lang.Throwable -> L22
            boolean r2 = io.appmetrica.analytics.impl.Zl.a(r2)     // Catch: java.lang.Throwable -> L22
            if (r2 == 0) goto L40
            java.lang.String r2 = r1.f40641b     // Catch: java.lang.Throwable -> L22
            boolean r2 = io.appmetrica.analytics.impl.Zl.a(r2)     // Catch: java.lang.Throwable -> L22
            if (r2 == 0) goto L40
            r3 = r0
        L40:
            r2 = r3 ^ 1
            io.appmetrica.analytics.impl.zm r4 = r8.f42149a     // Catch: java.lang.Throwable -> L22
            io.appmetrica.analytics.impl.Y3 r4 = r4.f42210k     // Catch: java.lang.Throwable -> L22
            io.appmetrica.analytics.impl.Yl r5 = r8.d()     // Catch: java.lang.Throwable -> L22
            java.util.Map r5 = r5.f40439h     // Catch: java.lang.Throwable -> L22
            io.appmetrica.analytics.impl.zm r6 = r8.f42149a     // Catch: java.lang.Throwable -> L22
            io.appmetrica.analytics.impl.V3 r6 = r6.f42209j     // Catch: java.lang.Throwable -> L22
            r4.getClass()     // Catch: java.lang.Throwable -> L22
            boolean r1 = io.appmetrica.analytics.impl.Y3.a(r5, r1, r6)     // Catch: java.lang.Throwable -> L22
            if (r3 == 0) goto L5c
            if (r1 != 0) goto L5c
            goto L5d
        L5c:
            r0 = r2
        L5d:
            monitor-exit(r8)
            return r0
        L5f:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L22
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C5108ym.g():boolean");
    }

    public final synchronized void h() {
        this.f42150b = null;
    }

    public final C4759l5 a() {
        return this.f42149a.f42206f;
    }

    public final synchronized void b(C4544cm c4544cm) {
        this.f42149a.f42211l.a(c4544cm);
        C4518bm c4518bm = this.f42149a.f42207g;
        c4518bm.f40593b.a(c4544cm.f40640a);
        c4518bm.f40593b.b(c4544cm.f40641b);
        c4518bm.f40592a.save(c4544cm.f40642c);
        this.f42149a.f42205e.a(c4544cm);
    }

    public final synchronized boolean a(List<String> list, Map<String, String> map) {
        return !Zl.a(e(), list, map, new C5083xm(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.appmetrica.analytics.impl.C4544cm a(io.appmetrica.analytics.impl.C4492am r9, io.appmetrica.analytics.impl.Yl r10, long r11) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C5108ym.a(io.appmetrica.analytics.impl.am, io.appmetrica.analytics.impl.Yl, long):io.appmetrica.analytics.impl.cm");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037 A[Catch: all -> 0x0032, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0007, B:14:0x0037, B:16:0x003e), top: B:23:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(io.appmetrica.analytics.impl.C4492am r4, io.appmetrica.analytics.impl.Yl r5, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> r6) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = io.appmetrica.analytics.impl.AbstractC4623fo.a(r6)     // Catch: java.lang.Throwable -> L32
            if (r0 != 0) goto L34
            java.lang.String r0 = "Date"
            java.lang.Object r6 = io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils.getFromMapIgnoreCase(r6, r0)     // Catch: java.lang.Throwable -> L32
            java.util.List r6 = (java.util.List) r6     // Catch: java.lang.Throwable -> L32
            boolean r0 = io.appmetrica.analytics.impl.AbstractC4623fo.a(r6)     // Catch: java.lang.Throwable -> L32
            if (r0 != 0) goto L34
            r0 = 0
            java.lang.Object r6 = r6.get(r0)     // Catch: java.lang.Throwable -> L34
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L34
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> L34
            java.lang.String r1 = "E, d MMM yyyy HH:mm:ss z"
            java.util.Locale r2 = java.util.Locale.US     // Catch: java.lang.Throwable -> L34
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L34
            java.util.Date r6 = r0.parse(r6)     // Catch: java.lang.Throwable -> L34
            long r0 = r6.getTime()     // Catch: java.lang.Throwable -> L34
            java.lang.Long r6 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L34
            goto L35
        L32:
            r4 = move-exception
            goto L56
        L34:
            r6 = 0
        L35:
            if (r6 == 0) goto L3c
            long r0 = r6.longValue()     // Catch: java.lang.Throwable -> L32
            goto L3e
        L3c:
            r0 = 0
        L3e:
            java.lang.Long r6 = r4.f40540l     // Catch: java.lang.Throwable -> L32
            io.appmetrica.analytics.impl.ek r2 = io.appmetrica.analytics.impl.AbstractC4568dk.f40755a     // Catch: java.lang.Throwable -> L32
            r2.a(r0, r6)     // Catch: java.lang.Throwable -> L32
            io.appmetrica.analytics.impl.cm r4 = r3.a(r4, r5, r0)     // Catch: java.lang.Throwable -> L32
            r3.h()     // Catch: java.lang.Throwable -> L32
            r3.b(r4)     // Catch: java.lang.Throwable -> L32
            b9.A r5 = b9.C1992A.f18074a     // Catch: java.lang.Throwable -> L32
            monitor-exit(r3)
            r3.a(r4)
            return
        L56:
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C5108ym.a(io.appmetrica.analytics.impl.am, io.appmetrica.analytics.impl.Yl, java.util.Map):void");
    }

    public final void a(C4544cm c4544cm) {
        ArrayList arrayList;
        C5133zm c5133zm = this.f42149a;
        Cl cl = c5133zm.f42204d;
        String str = c5133zm.f42202b;
        synchronized (cl.f39269a.f39382b) {
            try {
                El el = cl.f39269a;
                el.f39383c = c4544cm;
                Collection collection = (Collection) el.f39381a.f39621a.get(str);
                if (collection == null) {
                    arrayList = new ArrayList();
                } else {
                    arrayList = new ArrayList(collection);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Nl) it.next()).a(c4544cm);
        }
    }

    public final void a(Gl gl) {
        synchronized (this) {
            this.f42150b = null;
        }
        C5133zm c5133zm = this.f42149a;
        c5133zm.f42204d.a(c5133zm.f42206f.f41170a, gl, e());
    }

    public final synchronized void a(Wl wl) {
        try {
            this.f42149a.f42211l.a(wl);
            Yl ylD = d();
            if (ylD.f40441k) {
                List list = ylD.f40440j;
                if (list != null && !list.isEmpty()) {
                    if (!AbstractC4623fo.a(list, ylD.f40436e)) {
                        C4544cm c4544cmE = e();
                        C4647gm c4647gm = c4544cmE.f40642c;
                        C4621fm c4621fmA = c4647gm.a(c4647gm.f40964m);
                        String str = c4544cmE.f40640a;
                        String str2 = c4544cmE.f40641b;
                        c4621fmA.f40883g = list;
                        C4544cm c4544cm = new C4544cm(str, str2, new C4647gm(c4621fmA));
                        b(c4544cm);
                        a(c4544cm);
                    }
                } else {
                    if (ylD.f40436e != null && (!r5.isEmpty())) {
                        C4544cm c4544cmE2 = e();
                        C4647gm c4647gm2 = c4544cmE2.f40642c;
                        C4621fm c4621fmA2 = c4647gm2.a(c4647gm2.f40964m);
                        String str3 = c4544cmE2.f40640a;
                        String str4 = c4544cmE2.f40641b;
                        c4621fmA2.f40883g = null;
                        C4544cm c4544cm2 = new C4544cm(str3, str4, new C4647gm(c4621fmA2));
                        b(c4544cm2);
                        a(c4544cm2);
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
