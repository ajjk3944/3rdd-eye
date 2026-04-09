package vd;

import a0.x0;
import ad.g;
import android.app.Service;
import android.app.job.JobParameters;
import android.content.SharedPreferences;
import android.os.RemoteException;
import android.util.Log;
import android.widget.TextView;
import b7.r;
import c7.l;
import cl.h;
import com.google.android.gms.internal.ads.hc0;
import com.google.android.gms.internal.ads.rq0;
import com.google.android.gms.internal.ads.s81;
import com.google.android.gms.internal.ads.yo0;
import com.google.android.gms.internal.measurement.b0;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.liuzh.deviceinfo.R;
import ec.a2;
import ec.b1;
import ec.c1;
import ec.d0;
import ec.e3;
import ec.g0;
import ec.g4;
import ec.h3;
import ec.i3;
import ec.j3;
import ec.l0;
import ec.m3;
import ec.n4;
import ec.o;
import ec.o1;
import ec.q2;
import ec.s0;
import ec.u1;
import ec.y2;
import i0.f;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import jf.c;
import km.n;
import nk.k;
import pb.y;
import t6.e;
import t6.i0;
import x6.i;
import xk.x;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36213a;

    /* renamed from: b, reason: collision with root package name */
    public Object f36214b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f36215c;

    public /* synthetic */ a(int i4, Object obj, Object obj2) {
        this.f36213a = i4;
        this.f36214b = obj;
        this.f36215c = obj2;
    }

    private final void a() {
        r rVarC = ((a7.b) this.f36215c).f210b.f35179i.c((String) this.f36214b);
        if (rVarC == null || k.a(e.j, rVarC.j)) {
            return;
        }
        synchronized (((a7.b) this.f36215c).f212d) {
            ((a7.b) this.f36215c).g.put(d5.h(rVarC), rVarC);
            a7.b bVar = (a7.b) this.f36215c;
            ((a7.b) this.f36215c).f215h.put(d5.h(rVarC), i.a(bVar.f216i, rVarC, (xk.r) ((x0) bVar.f211c).f145b, bVar));
        }
    }

    private final void b() {
        try {
            ((Runnable) this.f36215c).run();
            synchronized (((l) this.f36214b).f2790e) {
                ((l) this.f36214b).c();
            }
        } catch (Throwable th2) {
            synchronized (((l) this.f36214b).f2790e) {
                ((l) this.f36214b).c();
                throw th2;
            }
        }
    }

    private final void c() {
        int i4 = 0;
        while (true) {
            try {
                ((Runnable) this.f36214b).run();
            } catch (Throwable th2) {
                x.q(ck.i.f2898a, th2);
            }
            Runnable runnableX = ((h) this.f36215c).X();
            if (runnableX == null) {
                return;
            }
            try {
                this.f36214b = runnableX;
                i4++;
                if (i4 >= 16) {
                    h hVar = (h) this.f36215c;
                    if (cl.b.j(hVar.f2919d, hVar)) {
                        h hVar2 = (h) this.f36215c;
                        cl.b.i(hVar2.f2919d, hVar2, this);
                        return;
                    }
                }
            } catch (Throwable th3) {
                h hVar3 = (h) this.f36215c;
                synchronized (hVar3.g) {
                    h.f2917h.decrementAndGet(hVar3);
                    throw th3;
                }
            }
        }
    }

    private final void d() {
        g4 g4Var = ((u1) this.f36215c).f23089a;
        g4Var.B();
        ec.e eVar = (ec.e) this.f36214b;
        if (eVar.f22690c.a() == null) {
            g4Var.getClass();
            String str = eVar.f22688a;
            y.h(str);
            n4 n4VarQ = g4Var.Q(str);
            if (n4VarQ != null) {
                g4Var.a0(eVar, n4VarQ);
                return;
            }
            return;
        }
        g4Var.getClass();
        String str2 = eVar.f22688a;
        y.h(str2);
        n4 n4VarQ2 = g4Var.Q(str2);
        if (n4VarQ2 != null) {
            g4Var.Z(eVar, n4VarQ2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void e() {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f36214b
            com.google.android.gms.internal.measurement.l0 r0 = (com.google.android.gms.internal.measurement.l0) r0
            java.lang.Object r1 = r8.f36215c
            ec.q2 r1 = (ec.q2) r1
            java.lang.Object r2 = r1.f218b
            ec.o1 r2 = (ec.o1) r2
            java.lang.Object r1 = r1.f218b
            ec.o1 r1 = (ec.o1) r1
            ec.r3 r2 = r2.f22955h
            ec.o1.l(r2)
            java.lang.Object r2 = r2.f218b
            ec.o1 r2 = (ec.o1) r2
            ec.b1 r3 = r2.f22953e
            ec.o1.k(r3)
            ec.a2 r4 = r3.I()
            ec.z1 r5 = ec.z1.ANALYTICS_STORAGE
            boolean r4 = r4.i(r5)
            r5 = 0
            if (r4 != 0) goto L39
            ec.s0 r2 = r2.f22954f
            ec.o1.m(r2)
            com.google.android.gms.internal.ads.or r2 = r2.f23057l
            java.lang.String r3 = "Analytics storage consent denied; will not get session id"
            r2.d(r3)
        L37:
            r2 = r5
            goto L60
        L39:
            ec.o1.k(r3)
            ec.a1 r4 = r3.f22569r
            tb.a r2 = r2.f22957k
            r2.getClass()
            long r6 = java.lang.System.currentTimeMillis()
            boolean r2 = r3.L(r6)
            if (r2 != 0) goto L37
            long r2 = r4.a()
            r6 = 0
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 != 0) goto L58
            goto L37
        L58:
            long r2 = r4.a()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
        L60:
            if (r2 == 0) goto L6f
            ec.l4 r1 = r1.f22956i
            ec.o1.k(r1)
            long r2 = r2.longValue()
            r1.l0(r0, r2)
            return
        L6f:
            r0.X2(r5)     // Catch: android.os.RemoteException -> L73
            return
        L73:
            r0 = move-exception
            ec.s0 r1 = r1.f22954f
            ec.o1.m(r1)
            com.google.android.gms.internal.ads.or r1 = r1.g
            java.lang.String r2 = "getSessionId failed with exception"
            r1.e(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vd.a.e():void");
    }

    private final void f() throws NumberFormatException {
        q2 q2Var = (q2) this.f36215c;
        o1 o1Var = (o1) q2Var.f218b;
        b1 b1Var = o1Var.f22953e;
        s0 s0Var = o1Var.f22954f;
        o1.k(b1Var);
        b1Var.B();
        b1Var.B();
        o oVarB = o.b(b1Var.F().getString("dma_consent_settings", null));
        o oVar = (o) this.f36214b;
        int i4 = oVar.f22940a;
        if (!a2.l(i4, oVarB.f22940a)) {
            o1.m(s0Var);
            s0Var.f23058m.e(Integer.valueOf(i4), "Lower precedence consent source ignored, proposed source");
            return;
        }
        SharedPreferences.Editor editorEdit = b1Var.F().edit();
        editorEdit.putString("dma_consent_settings", oVar.f22941b);
        editorEdit.apply();
        o1.m(s0Var);
        s0Var.f23060o.e(oVar, "Setting DMA consent(FE)");
        o1 o1Var2 = (o1) q2Var.f218b;
        if (o1Var2.p().L()) {
            j3 j3VarP = o1Var2.p();
            j3VarP.B();
            j3VarP.C();
            j3VarP.P(new h3(j3VarP, 1));
            return;
        }
        j3 j3VarP2 = o1Var2.p();
        j3VarP2.B();
        j3VarP2.C();
        if (j3VarP2.K()) {
            j3VarP2.P(new e3(j3VarP2, j3VarP2.R(false)));
        }
    }

    private final void g() {
        q2 q2Var = ((AppMeasurementDynamiteService) this.f36215c).f20283a.f22959m;
        o1.l(q2Var);
        yb.i iVar = (yb.i) this.f36214b;
        q2Var.B();
        q2Var.C();
        yb.i iVar2 = q2Var.f23010e;
        if (iVar != iVar2) {
            y.j("EventInterceptor already set.", iVar2 == null);
        }
        q2Var.f23010e = iVar;
    }

    private final void h() {
        o1 o1Var = (o1) ((q2) this.f36214b).f218b;
        l0 l0VarR = o1Var.r();
        String str = (String) this.f36215c;
        String str2 = l0VarR.f22857r;
        boolean z3 = false;
        if (str2 != null && !str2.equals(str)) {
            z3 = true;
        }
        l0VarR.f22857r = str;
        if (z3) {
            o1Var.r().G();
        }
    }

    private final void i() {
        j3 j3Var = (j3) this.f36215c;
        g0 g0Var = j3Var.f22819e;
        o1 o1Var = (o1) j3Var.f218b;
        if (g0Var == null) {
            s0 s0Var = o1Var.f22954f;
            o1.m(s0Var);
            s0Var.g.d("Failed to send current screen to service");
            return;
        }
        try {
            y2 y2Var = (y2) this.f36214b;
            if (y2Var == null) {
                g0Var.M0(0L, null, null, o1Var.f22949a.getPackageName());
            } else {
                g0Var.M0(y2Var.f23206c, y2Var.f23204a, y2Var.f23205b, o1Var.f22949a.getPackageName());
            }
            j3Var.O();
        } catch (RemoteException e2) {
            s0 s0Var2 = o1Var.f22954f;
            o1.m(s0Var2);
            s0Var2.g.e(e2, "Failed to send current screen to the service");
        }
    }

    private final void j() {
        j3 j3Var = ((i3) this.f36215c).f22798c;
        j3Var.f22819e = null;
        if (((nb.b) this.f36214b).f29885b != 7777) {
            j3Var.Q();
            return;
        }
        if (j3Var.f22821h == null) {
            j3Var.f22821h = Executors.newScheduledThreadPool(1);
        }
        j3Var.f22821h.schedule(new b5.o(12, this), ((Long) d0.f22617a0.a(null)).longValue(), TimeUnit.MILLISECONDS);
    }

    private final void k() {
        g4 g4Var = (g4) this.f36214b;
        g4Var.B();
        Runnable runnable = (Runnable) this.f36215c;
        g4Var.b().B();
        if (g4Var.f22744p == null) {
            g4Var.f22744p = new ArrayList();
        }
        g4Var.f22744p.add(runnable);
        g4Var.q();
    }

    private final /* synthetic */ void l() {
        c cVar = (c) this.f36214b;
        JobParameters jobParameters = (JobParameters) this.f36215c;
        Log.v("FA", "[sgtm] AppMeasurementJobService processed last Scion upload request.");
        ((m3) ((Service) cVar.f27642b)).c(jobParameters);
    }

    private final void m() {
        try {
            p();
        } catch (Error e2) {
            synchronized (((ee.k) this.f36215c).f23426b) {
                ((ee.k) this.f36215c).f23427c = 1;
                throw e2;
            }
        }
    }

    private final void n() {
        eg.l lVar = (eg.l) this.f36215c;
        if (i0.l(lVar.n()) || lVar.C || !lVar.y()) {
            return;
        }
        ((TextView) lVar.f23505a0.f36148d).setText(R.string.analyze_success);
        ((TextView) lVar.f23505a0.f36148d).animate().translationY(-a4.a.c(lVar.t(), 100.0f)).start();
        lVar.f23471k0.a();
        lVar.f23471k0.setAnimation("lottie/complete_green.json");
        lVar.f23471k0.setRepeatCount(0);
        lVar.f23471k0.f2979h.f23802b.addListener(new g(1, this));
        lVar.f23471k0.f();
        lVar.f23475o0 = true;
    }

    private final void o() {
        fb.h hVar = (fb.h) this.f36214b;
        hc0 hc0Var = ((hc0[]) this.f36215c)[0];
        if (hc0Var != null) {
            rq0 rq0Var = hVar.f23916f;
            s81 s81VarE = yo0.e(hc0Var);
            synchronized (rq0Var) {
                rq0Var.f15730a.addFirst(s81VarE);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if (r1 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        ((java.lang.Runnable) r10.f36214b).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005c, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005d, code lost:
    
        ee.k.f23424f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.f36214b), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
    
        r10.f36214b = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x003c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void p() {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r10.f36215c     // Catch: java.lang.Throwable -> L58
            ee.k r2 = (ee.k) r2     // Catch: java.lang.Throwable -> L58
            java.util.ArrayDeque r2 = r2.f23426b     // Catch: java.lang.Throwable -> L58
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L58
            r3 = 1
            if (r0 != 0) goto L2c
            java.lang.Object r0 = r10.f36215c     // Catch: java.lang.Throwable -> L20
            ee.k r0 = (ee.k) r0     // Catch: java.lang.Throwable -> L20
            int r4 = r0.f23427c     // Catch: java.lang.Throwable -> L20
            r5 = 4
            if (r4 != r5) goto L22
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L46
        L18:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L46
        L20:
            r0 = move-exception
            goto L7d
        L22:
            long r6 = r0.f23428d     // Catch: java.lang.Throwable -> L20
            r8 = 1
            long r6 = r6 + r8
            r0.f23428d = r6     // Catch: java.lang.Throwable -> L20
            r0.f23427c = r5     // Catch: java.lang.Throwable -> L20
            r0 = r3
        L2c:
            java.lang.Object r4 = r10.f36215c     // Catch: java.lang.Throwable -> L20
            ee.k r4 = (ee.k) r4     // Catch: java.lang.Throwable -> L20
            java.util.ArrayDeque r4 = r4.f23426b     // Catch: java.lang.Throwable -> L20
            java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L20
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L20
            r10.f36214b = r4     // Catch: java.lang.Throwable -> L20
            if (r4 != 0) goto L47
            java.lang.Object r0 = r10.f36215c     // Catch: java.lang.Throwable -> L20
            ee.k r0 = (ee.k) r0     // Catch: java.lang.Throwable -> L20
            r0.f23427c = r3     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L46
            goto L18
        L46:
            return
        L47:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L58
            r1 = r1 | r2
            r2 = 0
            java.lang.Object r3 = r10.f36214b     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
            r3.run()     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
        L55:
            r10.f36214b = r2     // Catch: java.lang.Throwable -> L58
            goto L2
        L58:
            r0 = move-exception
            goto L7f
        L5a:
            r0 = move-exception
            goto L7a
        L5c:
            r3 = move-exception
            java.util.logging.Logger r4 = ee.k.f23424f     // Catch: java.lang.Throwable -> L5a
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L5a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a
            r6.<init>()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r7 = "Exception while executing runnable "
            r6.append(r7)     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r7 = r10.f36214b     // Catch: java.lang.Throwable -> L5a
            java.lang.Runnable r7 = (java.lang.Runnable) r7     // Catch: java.lang.Throwable -> L5a
            r6.append(r7)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5a
            r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L5a
            goto L55
        L7a:
            r10.f36214b = r2     // Catch: java.lang.Throwable -> L58
            throw r0     // Catch: java.lang.Throwable -> L58
        L7d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r0     // Catch: java.lang.Throwable -> L58
        L7f:
            if (r1 == 0) goto L88
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L88:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: vd.a.p():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x038b A[Catch: IllegalStateException -> 0x039b, TRY_LEAVE, TryCatch #8 {IllegalStateException -> 0x039b, blocks: (B:134:0x0379, B:138:0x0387, B:140:0x038b), top: B:480:0x0379 }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0613  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x061b  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0673  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0697  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x06c9  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x06e6  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0704  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0734  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0767  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x07d5  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x087d  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0943  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x09ae  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x03dd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:492:0x06d8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:498:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws org.json.JSONException, android.content.res.Resources.NotFoundException, android.content.pm.PackageManager.NameNotFoundException, java.lang.NumberFormatException, java.lang.ClassNotFoundException {
        /*
            Method dump skipped, instructions count: 3244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: vd.a.run():void");
    }

    public String toString() {
        switch (this.f36213a) {
            case 0:
                f fVar = new f(a.class.getSimpleName());
                yb.i iVar = (yb.i) this.f36215c;
                n nVar = new n((char) 0, 21);
                ((n) fVar.f25418d).f28443c = nVar;
                fVar.f25418d = nVar;
                nVar.f28442b = iVar;
                return fVar.toString();
            case 26:
                Runnable runnable = (Runnable) this.f36214b;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb2 = new StringBuilder("SequentialExecutorWorker{state=");
                int i4 = ((ee.k) this.f36215c).f23427c;
                sb2.append(i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? "null" : "RUNNING" : "QUEUED" : "QUEUING" : "IDLE");
                sb2.append("}");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ a(Object obj, boolean z3, Object obj2, int i4) {
        this.f36213a = i4;
        this.f36215c = obj;
        this.f36214b = obj2;
    }

    public a(c1 c1Var, b0 b0Var, c1 c1Var2) {
        this.f36213a = 13;
        this.f36214b = b0Var;
        this.f36215c = c1Var;
    }

    public a(q2 q2Var, com.google.android.gms.internal.measurement.l0 l0Var) {
        this.f36213a = 16;
        this.f36214b = l0Var;
        Objects.requireNonNull(q2Var);
        this.f36215c = q2Var;
    }

    public a(j3 j3Var, y2 y2Var) {
        this.f36213a = 21;
        this.f36214b = y2Var;
        Objects.requireNonNull(j3Var);
        this.f36215c = j3Var;
    }

    public a(c cVar, g4 g4Var, Runnable runnable) {
        this.f36213a = 24;
        this.f36214b = g4Var;
        this.f36215c = runnable;
    }

    public a(ee.k kVar) {
        this.f36213a = 26;
        this.f36215c = kVar;
    }
}
