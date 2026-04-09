package com.google.android.gms.internal.ads;

import android.content.Context;
import f4.InterfaceFutureC2326a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class Hy implements InterfaceC2259zy, InterfaceC2151xy, Ny {

    /* renamed from: t, reason: collision with root package name */
    public static final C1043dM f9028t;

    /* renamed from: a, reason: collision with root package name */
    public final Context f9029a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1666oy f9030b;

    /* renamed from: c, reason: collision with root package name */
    public final ExecutorService f9031c;

    /* renamed from: d, reason: collision with root package name */
    public final C1612ny f9032d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f9033e;

    /* renamed from: f, reason: collision with root package name */
    public final String f9034f;

    /* renamed from: g, reason: collision with root package name */
    public final long f9035g;

    /* renamed from: h, reason: collision with root package name */
    public final long f9036h;
    public final double i;

    /* renamed from: j, reason: collision with root package name */
    public final String f9037j;

    /* renamed from: k, reason: collision with root package name */
    public final long f9038k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicBoolean f9039l = new AtomicBoolean(false);

    /* renamed from: m, reason: collision with root package name */
    public final Object f9040m = new Object();

    /* renamed from: n, reason: collision with root package name */
    public final Object f9041n = new Object();

    /* renamed from: o, reason: collision with root package name */
    public final Object f9042o = new Object();

    /* renamed from: p, reason: collision with root package name */
    public final H5 f9043p = I5.A();

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f9044q = new ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public boolean f9045r = false;

    /* renamed from: s, reason: collision with root package name */
    public final HashMap f9046s = new HashMap();

    static {
        C0988cM c0988cMA = C1043dM.A();
        c0988cMA.b();
        ((C1043dM) c0988cMA.f13551b).B(17);
        f9028t = (C1043dM) c0988cMA.d();
    }

    public Hy(Context context, InterfaceC1666oy interfaceC1666oy, ExecutorService executorService, C1612ny c1612ny, Random random, String str, long j6, long j7, double d6, String str2, long j8) {
        this.f9029a = context;
        this.f9030b = interfaceC1666oy;
        this.f9031c = executorService;
        this.f9032d = c1612ny;
        this.f9034f = str;
        this.f9035g = j6;
        this.f9036h = j7;
        this.i = d6;
        this.f9037j = str2;
        this.f9038k = j8;
        this.f9033e = random.nextDouble() < d6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2151xy
    public final InterfaceFutureC2326a a() {
        TD td = new TD(Executors.callable(new Gy(this, 0), null));
        this.f9031c.execute(td);
        return td;
    }

    public final void b(int i, long j6, Throwable th, String str) {
        long jLongValue;
        if (this.f9033e) {
            synchronized (this.f9041n) {
                try {
                    ArrayList arrayList = this.f9044q;
                    synchronized (this.f9042o) {
                        try {
                            HashMap map = this.f9046s;
                            Integer numValueOf = Integer.valueOf(i);
                            Long l2 = (Long) map.get(numValueOf);
                            if (l2 == null) {
                                l2 = 0L;
                            }
                            jLongValue = 1 + l2.longValue();
                            map.put(numValueOf, Long.valueOf(jLongValue));
                        } finally {
                        }
                    }
                    arrayList.add(new Fy(i, j6, th, str, jLongValue));
                    if (!this.f9045r) {
                        this.f9045r = true;
                        this.f9030b.a(new Gy(this, 1), this.f9036h);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void c(I5 i52) {
        try {
            Dy dyA = Ey.A();
            C1043dM c1043dM = f9028t;
            dyA.b();
            ((Ey) dyA.f13551b).C(c1043dM);
            By byA = Cy.A();
            byA.b();
            ((Cy) byA.f13551b).B(i52);
            Cy cy = (Cy) byA.d();
            dyA.b();
            ((Ey) dyA.f13551b).B(cy);
            Ey ey = (Ey) dyA.d();
            C1612ny c1612ny = this.f9032d;
            String str = this.f9034f;
            byte[] bArrB = ey.b();
            c1612ny.getClass();
            R3.b.m(new Ww(c1612ny, str, true, "application/x-protobuf", bArrB));
        } catch (RuntimeException unused) {
        }
    }
}
