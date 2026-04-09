package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class wg3 implements pg3, ng3, lh3 {
    public static final p74 t;
    public final Context a;
    public final ScheduledExecutorService b;
    public final ExecutorService c;
    public final hg3 d;
    public final boolean e;
    public final String f;
    public final long g;
    public final long h;
    public final double i;
    public final String j;
    public final long k;
    public final AtomicBoolean l = new AtomicBoolean(false);
    public final Object m = new Object();
    public final Object n = new Object();
    public final Object o = new Object();
    public final rq1 p = sq1.A();
    public final ArrayList q = new ArrayList();
    public boolean r = false;
    public final HashMap s = new HashMap();

    static {
        l74 l74VarA = p74.A();
        l74VarA.b();
        ((p74) l74VarA.g).B(17);
        t = (p74) l74VarA.d();
    }

    public wg3(Context context, ScheduledExecutorService scheduledExecutorService, ExecutorService executorService, hg3 hg3Var, Random random, String str, long j, long j2, double d, String str2, long j3) {
        this.a = context;
        this.b = scheduledExecutorService;
        this.c = executorService;
        this.d = hg3Var;
        this.f = str;
        this.g = j;
        this.h = j2;
        this.i = d;
        this.j = str2;
        this.k = j3;
        this.e = random.nextDouble() < d;
    }

    @Override // defpackage.ng3
    public final n70 a() {
        ar3 ar3Var = new ar3(Executors.callable(new vg3(this, 0), null));
        this.c.execute(ar3Var);
        return ar3Var;
    }

    public final void b(int i, long j, Throwable th, String str) {
        long jLongValue;
        if (this.e) {
            synchronized (this.n) {
                try {
                    ArrayList arrayList = this.q;
                    synchronized (this.o) {
                        try {
                            HashMap map = this.s;
                            Integer numValueOf = Integer.valueOf(i);
                            Long l = (Long) map.get(numValueOf);
                            if (l == null) {
                                l = 0L;
                            }
                            jLongValue = 1 + l.longValue();
                            map.put(numValueOf, Long.valueOf(jLongValue));
                        } finally {
                        }
                    }
                    arrayList.add(new ug3(i, j, th, str, jLongValue));
                    if (!this.r) {
                        this.r = true;
                        this.b.schedule(new vg3(this, 1), this.h, TimeUnit.MILLISECONDS);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void c(sq1 sq1Var) {
        try {
            sg3 sg3VarA = tg3.A();
            p74 p74Var = t;
            sg3VarA.b();
            ((tg3) sg3VarA.g).C(p74Var);
            qg3 qg3VarA = rg3.A();
            qg3VarA.b();
            ((rg3) qg3VarA.g).B(sq1Var);
            rg3 rg3Var = (rg3) qg3VarA.d();
            sg3VarA.b();
            ((tg3) sg3VarA.g).B(rg3Var);
            tg3 tg3Var = (tg3) sg3VarA.d();
            hg3 hg3Var = this.d;
            String str = this.f;
            byte[] bArrB = tg3Var.b();
            hg3Var.getClass();
            wl2.h(new de3(hg3Var, str, true, "application/x-protobuf", bArrB));
        } catch (RuntimeException unused) {
        }
    }
}
