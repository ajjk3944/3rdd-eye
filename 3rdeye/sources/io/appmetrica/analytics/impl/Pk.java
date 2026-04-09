package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class Pk {

    /* renamed from: a, reason: collision with root package name */
    public final C4940s5 f39988a;

    /* renamed from: b, reason: collision with root package name */
    public final Ok f39989b;

    /* renamed from: c, reason: collision with root package name */
    public final C4914r5 f39990c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC4624g f39991d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC4624g f39992e;

    /* renamed from: f, reason: collision with root package name */
    public Bk f39993f;

    /* renamed from: g, reason: collision with root package name */
    public int f39994g = 0;

    public Pk(C4940s5 c4940s5, Ok ok, C4914r5 c4914r5, Aa aa2, L2 l22) {
        this.f39988a = c4940s5;
        this.f39990c = c4914r5;
        this.f39991d = aa2;
        this.f39992e = l22;
        this.f39989b = ok;
    }

    public final synchronized long a() {
        Bk bk;
        bk = this.f39993f;
        return bk == null ? 10000000000L : bk.f39205d - 1;
    }

    public final void b(Bk bk, C4683i6 c4683i6) {
        if (bk.f39208g && bk.f39205d > 0) {
            C4914r5 c4914r5 = this.f39990c;
            C4683i6 c4683i6A = C4683i6.a(c4683i6, EnumC4997ub.EVENT_TYPE_ALIVE);
            Rk rk = new Rk();
            rk.f40071a = bk.f39205d;
            rk.f40074d = bk.f39204c.f39373a;
            long andIncrement = bk.f39207f.getAndIncrement();
            Sk sk = bk.f39203b;
            sk.a(Sk.f40129g, Long.valueOf(bk.f39207f.get()));
            sk.b();
            rk.f40072b = andIncrement;
            rk.f40073c = TimeUnit.MILLISECONDS.toSeconds(Math.max(bk.i - bk.f39206e, bk.f39210j));
            c4914r5.f41531a.f41611n.a(c4683i6A, rk);
            if (bk.f39208g) {
                bk.f39208g = false;
                Sk sk2 = bk.f39203b;
                sk2.a(Sk.i, Boolean.FALSE);
                sk2.b();
            }
        }
        PublicLogger publicLogger = this.f39988a.f41610m;
        int iOrdinal = bk.f39204c.f39373a.ordinal();
        if (iOrdinal == 0) {
            publicLogger.info("Finish foreground session", new Object[0]);
        } else if (iOrdinal == 1) {
            publicLogger.info("Finish background session", new Object[0]);
        }
        synchronized (bk) {
            Sk sk3 = bk.f39203b;
            sk3.getClass();
            sk3.f40133c = new C5097yb();
            sk3.b();
            bk.f39209h = null;
        }
    }

    public final synchronized void c(C4683i6 c4683i6) {
        try {
            if (this.f39994g == 0) {
                Bk bkB = this.f39991d.b();
                if (a(bkB, c4683i6)) {
                    this.f39993f = bkB;
                    this.f39994g = 3;
                } else {
                    Bk bkB2 = this.f39992e.b();
                    if (a(bkB2, c4683i6)) {
                        this.f39993f = bkB2;
                        this.f39994g = 2;
                    } else {
                        this.f39993f = null;
                        this.f39994g = 1;
                    }
                }
            }
            int iA = AbstractC4504b8.a(this.f39994g);
            if (iA == 0) {
                this.f39993f = a(c4683i6);
            } else if (iA == 1) {
                b(this.f39993f, c4683i6);
                this.f39993f = a(c4683i6);
            } else if (iA == 2) {
                if (a(this.f39993f, c4683i6)) {
                    Bk bk = this.f39993f;
                    long j4 = c4683i6.i;
                    bk.i = j4;
                    Sk sk = bk.f39203b;
                    sk.a(Sk.f40126d, Long.valueOf(j4));
                    sk.b();
                } else {
                    this.f39993f = a(c4683i6);
                }
            }
        } finally {
        }
    }

    public final Bk a(C4683i6 c4683i6) {
        this.f39988a.f41610m.info("Start foreground session", new Object[0]);
        long j4 = c4683i6.i;
        AbstractC4624g abstractC4624g = this.f39991d;
        Ck ck = new Ck(j4, c4683i6.f41052j);
        abstractC4624g.getClass();
        Bk bkA = abstractC4624g.a(ck);
        this.f39994g = 3;
        ((D5) this.f39988a.f41613p).e();
        C4914r5 c4914r5 = this.f39990c;
        c4914r5.f41531a.f41611n.a(C4683i6.a(c4683i6, Ga.f39501F.h()), a(bkA, j4));
        return bkA;
    }

    public static Rk a(Bk bk, long j4) {
        Rk rk = new Rk();
        rk.f40071a = bk.f39205d;
        long andIncrement = bk.f39207f.getAndIncrement();
        Sk sk = bk.f39203b;
        sk.a(Sk.f40129g, Long.valueOf(bk.f39207f.get()));
        sk.b();
        rk.f40072b = andIncrement;
        Sk sk2 = bk.f39203b;
        long j10 = j4 - bk.f39206e;
        bk.f39210j = j10;
        sk2.a(Sk.f40127e, Long.valueOf(j10));
        rk.f40073c = TimeUnit.MILLISECONDS.toSeconds(bk.f39210j);
        rk.f40074d = bk.f39204c.f39373a;
        return rk;
    }

    public final synchronized Bk b(C4683i6 c4683i6) {
        try {
            if (this.f39994g == 0) {
                Bk bkB = this.f39991d.b();
                if (a(bkB, c4683i6)) {
                    this.f39993f = bkB;
                    this.f39994g = 3;
                } else {
                    Bk bkB2 = this.f39992e.b();
                    if (a(bkB2, c4683i6)) {
                        this.f39993f = bkB2;
                        this.f39994g = 2;
                    } else {
                        this.f39993f = null;
                        this.f39994g = 1;
                    }
                }
            }
            if (this.f39994g != 1 && !a(this.f39993f, c4683i6)) {
                this.f39994g = 1;
                this.f39993f = null;
            }
            int iA = AbstractC4504b8.a(this.f39994g);
            if (iA == 1) {
                Bk bk = this.f39993f;
                long j4 = c4683i6.i;
                bk.i = j4;
                Sk sk = bk.f39203b;
                sk.a(Sk.f40126d, Long.valueOf(j4));
                sk.b();
                return this.f39993f;
            }
            if (iA != 2) {
                this.f39988a.f41610m.info("Start background session", new Object[0]);
                this.f39994g = 2;
                long j10 = c4683i6.i;
                AbstractC4624g abstractC4624g = this.f39992e;
                Ck ck = new Ck(j10, c4683i6.f41052j);
                abstractC4624g.getClass();
                Bk bkA = abstractC4624g.a(ck);
                if (this.f39988a.f41617t.c()) {
                    C4914r5 c4914r5 = this.f39990c;
                    c4914r5.f41531a.f41611n.a(C4683i6.a(c4683i6, Ga.f39501F.h()), a(bkA, c4683i6.i));
                } else {
                    int i = c4683i6.f41047d;
                    EnumC4997ub enumC4997ub = EnumC4997ub.EVENT_TYPE_UNDEFINED;
                    if (i == 6145) {
                        C4914r5 c4914r52 = this.f39990c;
                        c4914r52.f41531a.f41611n.a(c4683i6, a(bkA, j10));
                        C4914r5 c4914r53 = this.f39990c;
                        c4914r53.f41531a.f41611n.a(C4683i6.a(c4683i6, Ga.f39501F.h()), a(bkA, j10));
                    }
                }
                this.f39993f = bkA;
                return bkA;
            }
            return this.f39993f;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(io.appmetrica.analytics.impl.Bk r17, io.appmetrica.analytics.impl.C4683i6 r18) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.Pk.a(io.appmetrica.analytics.impl.Bk, io.appmetrica.analytics.impl.i6):boolean");
    }
}
