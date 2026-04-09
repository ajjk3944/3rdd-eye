package com.staircase3.opensignal;

import al.c;
import android.app.ActivityManager;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Process;
import android.os.SystemClock;
import androidx.lifecycle.p;
import ba.l;
import i.a0;
import i.n;
import i.o;
import io.sentry.android.core.performance.g;
import ir.f0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kc.f;
import kn.d;
import kotlin.Metadata;
import lq.j;
import on.c0;
import on.d0;
import on.g0;
import on.i0;
import on.k;
import p.w2;
import qk.a;
import wt.w;
import y6.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/staircase3/opensignal/OpensignalApplication;", "Ly6/b;", "<init>", "()V", "openSignal_externalRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OpensignalApplication extends b {
    public static final AtomicBoolean B = new AtomicBoolean(false);
    public static final AtomicBoolean D = new AtomicBoolean(false);

    /* renamed from: a, reason: collision with root package name */
    public final Object f5991a;

    /* renamed from: d, reason: collision with root package name */
    public final Object f5992d;

    /* renamed from: g, reason: collision with root package name */
    public final Object f5993g;

    /* renamed from: r, reason: collision with root package name */
    public final Object f5994r;

    /* renamed from: x, reason: collision with root package name */
    public final Object f5995x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f5996y;

    public OpensignalApplication() {
        j jVar = j.SYNCHRONIZED;
        this.f5991a = f.E(jVar, new a(this, 0));
        this.f5992d = f.E(jVar, new a(this, 1));
        this.f5993g = f.E(jVar, new a(this, 2));
        this.f5994r = f.E(jVar, new a(this, 3));
        this.f5995x = f.E(jVar, new a(this, 4));
        this.f5996y = f.E(jVar, new a(this, 5));
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, lq.h] */
    @Override // android.app.Application
    public final void onCreate() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        io.sentry.android.core.performance.f fVar = io.sentry.android.core.performance.f.L;
        long jUptimeMillis = SystemClock.uptimeMillis();
        io.sentry.android.core.performance.f fVarB = io.sentry.android.core.performance.f.b();
        g gVar = fVarB.f11730x;
        if (gVar.f11734g == 0) {
            gVar.c(jUptimeMillis);
            fVarB.f(this);
        }
        super.onCreate();
        if (o.f11100d != 1) {
            o.f11100d = 1;
            synchronized (o.D) {
                try {
                    u.f fVar2 = o.B;
                    fVar2.getClass();
                    u.a aVar = new u.a(fVar2);
                    while (aVar.hasNext()) {
                        o oVar = (o) ((WeakReference) aVar.next()).get();
                        if (oVar != null) {
                            ((a0) oVar).k(true, true);
                        }
                    }
                } finally {
                }
            }
        }
        cg.j jVar = new cg.j(12, this);
        synchronized (lv.a.f15966a) {
            jv.b bVarL = f0.L();
            if (lv.a.f15967b != null) {
                throw new l("A Koin Application has already been started");
            }
            lv.a.f15967b = bVarL.f13866a;
            jVar.a(bVarL);
            bVarL.a();
        }
        jn.b bVar = (jn.b) this.f5991a.getValue();
        bVar.getClass();
        ah.f.b(bVar.f13780a, "0mmGbMebBwCK7bCtF6WFU7dcFXUZM1857KDc49fXyRLv3PaX0I1tCIvH9R20rgc/r5cpCmUBpT4IkT15PtQjhVmHWerab101MzRZgZlDE555pS2hdLFHV6xlgWwzItEj/qasUknZrr1yqZj6sSeC+Pvf9vKfVIFoUrE465YiR6czG4PGje5erUWUs+N29Z8kEhnZcjBeFvQyaKy+kJdHkMBvEwzkQ5LYvJ0NR3dULaOWDFGLDpkMTluZbm6d/UEh6C1vYL7/qAHL0Y4xvzh3iYgEBXoBB4w2i1wt7NFp0dbRypDuuquN1aHgBm1LFlqbxEzBQdrNRQwjih8yrdzz0zBOlMcOwP/Xt8SQ+Xos5goY3XrHDEMzdfXZekvA1+poHV0YN8Yw7m1ANzLXXY4TkmWriuq50VNAw5k6AeJhPyMJNCn6n0KkBdIwyoYl4Me5SOgWHBbgE+MULSDsAZi/gF1klvK4Zv9v+uB4e2dMmkQw8sNeTancqivZichTdk+odiSErfVVPfzrKaALxcY9GQNYJ6yZKjecR+O40W78D6r7G1fx9LBA97Eggr9oHjmb+oMEJoE1rJqz8EhjeOlvzR1NG+PdMy5YadpooWAp2FlwzUPZ0JXu+Z4eDLcPLt/rntua3DVzbCeAiCSLFoBvEORvF+nK7QAmJ5OP45zi/VHaLCvQj+8A5R5kOsCC9Ig/79w3R7o50Hg34CHrd9kO2m++J8C4Vf3Pr7Nv1IqZVBLUmdsHqZC0JorNVcrfbMnPWjLvsbXH6kJIh2WllEap4HLrYF2Vavqls+KspbORwE5lvxnfxluA7Ng86j8MwFyirms1qH89cN2ijyECC3yNUMtK0MvgabVdd9fgWdjocVEV7dsncdcg5H9tDDm1J3sO");
        Context context = ((d) this.f5993g.getValue()).f14452a;
        byte b2 = 0;
        if (c.f818l == null) {
            on.a0 a0Var = new on.a0(context.getApplicationContext());
            a0Var.D();
            c cVar = new c(a0Var);
            g0 g0Var = (g0) cVar.f824f;
            g0Var.f19618c.h().b(new cq.l(5, new j1.a(5, g0Var)));
            k kVar = (k) g0Var.f19616a;
            kVar.f19642f.b(new cq.l(6, new c0(g0Var)));
            kVar.f19643g.b(new cq.l(7, new d0(g0Var)));
            ((to.d) cVar.f825g).getClass();
            i0 i0Var = (i0) cVar.f823e;
            w.s(i0Var.f19634g, null, null, new p((Object) i0Var, (pq.c) (b2 == true ? 1 : 0), 4), 3);
            c.f818l = cVar;
        }
        int iMyPid = Process.myPid();
        Object systemService = getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            runningAppProcesses = new ArrayList<>();
        }
        Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ActivityManager.RunningAppProcessInfo next = it.next();
            if (next.pid == iMyPid) {
                String str = next.processName;
                if (str != null && str.equals("com.staircase3.opensignal")) {
                    if (!((vl.a) this.f5994r.getValue()).f23928a.getBoolean("first_use", true)) {
                        ((jn.b) this.f5991a.getValue()).a(((cm.a) this.f5995x.getValue()).a());
                    }
                    n nVar = o.f11099a;
                    int i10 = w2.f20213a;
                    AsyncTask.execute(new j4.o(13, this));
                }
            }
        }
        long jUptimeMillis2 = SystemClock.uptimeMillis();
        g gVar2 = io.sentry.android.core.performance.f.b().f11730x;
        if (gVar2.f11735r == 0) {
            gVar2.f11732a = OpensignalApplication.class.getName().concat(".onCreate");
            gVar2.f11735r = jUptimeMillis2;
        }
    }
}
