package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class vy0 implements oy0, my0, bz0 {

    /* renamed from: t, reason: collision with root package name */
    public static final pp1 f17760t;

    /* renamed from: a, reason: collision with root package name */
    public final Context f17761a;

    /* renamed from: b, reason: collision with root package name */
    public final dy0 f17762b;

    /* renamed from: c, reason: collision with root package name */
    public final ExecutorService f17763c;

    /* renamed from: d, reason: collision with root package name */
    public final cy0 f17764d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f17765e;

    /* renamed from: f, reason: collision with root package name */
    public final String f17766f;
    public final long g;

    /* renamed from: h, reason: collision with root package name */
    public final long f17767h;

    /* renamed from: i, reason: collision with root package name */
    public final double f17768i;
    public final String j;

    /* renamed from: k, reason: collision with root package name */
    public final long f17769k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicBoolean f17770l = new AtomicBoolean(false);

    /* renamed from: m, reason: collision with root package name */
    public final Object f17771m = new Object();

    /* renamed from: n, reason: collision with root package name */
    public final Object f17772n = new Object();

    /* renamed from: o, reason: collision with root package name */
    public final Object f17773o = new Object();

    /* renamed from: p, reason: collision with root package name */
    public final oc f17774p = pc.A();

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f17775q = new ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public boolean f17776r = false;

    /* renamed from: s, reason: collision with root package name */
    public final HashMap f17777s = new HashMap();

    static {
        op1 op1VarA = pp1.A();
        op1VarA.b();
        ((pp1) op1VarA.f14755b).B(17);
        f17760t = (pp1) op1VarA.e();
    }

    public vy0(Context context, dy0 dy0Var, ExecutorService executorService, cy0 cy0Var, Random random, String str, long j, long j8, double d10, String str2, long j9) {
        this.f17761a = context;
        this.f17762b = dy0Var;
        this.f17763c = executorService;
        this.f17764d = cy0Var;
        this.f17766f = str;
        this.g = j;
        this.f17767h = j8;
        this.f17768i = d10;
        this.j = str2;
        this.f17769k = j9;
        this.f17765e = random.nextDouble() < d10;
    }

    public final void a(int i4, long j, Throwable th2, String str) {
        long jLongValue;
        if (this.f17765e) {
            synchronized (this.f17772n) {
                try {
                    ArrayList arrayList = this.f17775q;
                    synchronized (this.f17773o) {
                        try {
                            HashMap map = this.f17777s;
                            Integer numValueOf = Integer.valueOf(i4);
                            Long l10 = (Long) map.get(numValueOf);
                            if (l10 == null) {
                                l10 = 0L;
                            }
                            jLongValue = 1 + l10.longValue();
                            map.put(numValueOf, Long.valueOf(jLongValue));
                        } finally {
                        }
                    }
                    arrayList.add(new ty0(i4, j, th2, str, jLongValue));
                    if (!this.f17776r) {
                        this.f17776r = true;
                        this.f17762b.b(new uy0(this, 1), this.f17767h);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.my0
    public final vd.b b() {
        h91 h91Var = new h91(Executors.callable(new uy0(this, 0), null));
        this.f17763c.execute(h91Var);
        return h91Var;
    }

    public final void c(pc pcVar) {
        try {
            ry0 ry0VarA = sy0.A();
            pp1 pp1Var = f17760t;
            ry0VarA.b();
            ((sy0) ry0VarA.f14755b).C(pp1Var);
            py0 py0VarA = qy0.A();
            py0VarA.b();
            ((qy0) py0VarA.f14755b).B(pcVar);
            qy0 qy0Var = (qy0) py0VarA.e();
            ry0VarA.b();
            ((sy0) ry0VarA.f14755b).B(qy0Var);
            sy0 sy0Var = (sy0) ry0VarA.e();
            cy0 cy0Var = this.f17764d;
            String str = this.f17766f;
            byte[] bArrB = sy0Var.b();
            cy0Var.getClass();
            jm.a.n(new aw0(cy0Var, str, true, "application/x-protobuf", bArrB));
        } catch (RuntimeException unused) {
        }
    }
}
