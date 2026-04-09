package io.sentry;

import java.io.IOException;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class i6 implements c2 {
    public h6 B;
    public Long D;
    public Double E;
    public final String F;
    public String G;
    public final String H;
    public final String I;
    public String J;
    public final io.sentry.util.a K = new io.sentry.util.a();
    public ConcurrentHashMap L;

    /* renamed from: a, reason: collision with root package name */
    public final Date f12324a;

    /* renamed from: d, reason: collision with root package name */
    public Date f12325d;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicInteger f12326g;

    /* renamed from: r, reason: collision with root package name */
    public final String f12327r;

    /* renamed from: x, reason: collision with root package name */
    public final String f12328x;

    /* renamed from: y, reason: collision with root package name */
    public Boolean f12329y;

    public i6(h6 h6Var, Date date, Date date2, int i10, String str, String str2, Boolean bool, Long l10, Double d6, String str3, String str4, String str5, String str6, String str7) {
        this.B = h6Var;
        this.f12324a = date;
        this.f12325d = date2;
        this.f12326g = new AtomicInteger(i10);
        this.f12327r = str;
        this.f12328x = str2;
        this.f12329y = bool;
        this.D = l10;
        this.E = d6;
        this.F = str3;
        this.G = str4;
        this.H = str5;
        this.I = str6;
        this.J = str7;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final i6 clone() {
        return new i6(this.B, this.f12324a, this.f12325d, this.f12326g.get(), this.f12327r, this.f12328x, this.f12329y, this.D, this.E, this.F, this.G, this.H, this.I, this.J);
    }

    public final void b(Date date) {
        q qVarA = this.K.a();
        try {
            this.f12329y = null;
            if (this.B == h6.Ok) {
                this.B = h6.Exited;
            }
            if (date != null) {
                this.f12325d = date;
            } else {
                this.f12325d = dr.a.q();
            }
            if (this.f12325d != null) {
                this.E = Double.valueOf(Math.abs(r6.getTime() - this.f12324a.getTime()) / 1000.0d);
                long time = this.f12325d.getTime();
                if (time < 0) {
                    time = Math.abs(time);
                }
                this.D = Long.valueOf(time);
            }
            qVarA.close();
        } catch (Throwable th2) {
            try {
                qVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final boolean c(h6 h6Var, String str, boolean z10, String str2) {
        boolean z11;
        q qVarA = this.K.a();
        boolean z12 = true;
        if (h6Var != null) {
            try {
                this.B = h6Var;
                z11 = true;
            } catch (Throwable th2) {
                try {
                    qVarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } else {
            z11 = false;
        }
        if (str != null) {
            this.G = str;
            z11 = true;
        }
        if (z10) {
            this.f12326g.addAndGet(1);
            z11 = true;
        }
        if (str2 != null) {
            this.J = str2;
        } else {
            z12 = z11;
        }
        if (z12) {
            this.f12329y = null;
            Date dateQ = dr.a.q();
            this.f12325d = dateQ;
            if (dateQ != null) {
                long time = dateQ.getTime();
                if (time < 0) {
                    time = Math.abs(time);
                }
                this.D = Long.valueOf(time);
            }
        }
        qVarA.close();
        return z12;
    }

    @Override // io.sentry.c2
    public final void serialize(y2 y2Var, u0 u0Var) throws IOException {
        i4.b bVar = (i4.b) y2Var;
        bVar.C();
        String str = this.f12328x;
        if (str != null) {
            bVar.I("sid");
            bVar.V(str);
        }
        String str2 = this.f12327r;
        if (str2 != null) {
            bVar.I("did");
            bVar.V(str2);
        }
        if (this.f12329y != null) {
            bVar.I("init");
            bVar.T(this.f12329y);
        }
        bVar.I("started");
        bVar.S(u0Var, this.f12324a);
        bVar.I("status");
        bVar.S(u0Var, this.B.name().toLowerCase(Locale.ROOT));
        if (this.D != null) {
            bVar.I("seq");
            bVar.U(this.D);
        }
        bVar.I("errors");
        bVar.R(this.f12326g.intValue());
        if (this.E != null) {
            bVar.I("duration");
            bVar.U(this.E);
        }
        if (this.f12325d != null) {
            bVar.I("timestamp");
            bVar.S(u0Var, this.f12325d);
        }
        if (this.J != null) {
            bVar.I("abnormal_mechanism");
            bVar.S(u0Var, this.J);
        }
        bVar.I("attrs");
        bVar.C();
        bVar.I("release");
        bVar.S(u0Var, this.I);
        String str3 = this.H;
        if (str3 != null) {
            bVar.I("environment");
            bVar.S(u0Var, str3);
        }
        String str4 = this.F;
        if (str4 != null) {
            bVar.I("ip_address");
            bVar.S(u0Var, str4);
        }
        if (this.G != null) {
            bVar.I("user_agent");
            bVar.S(u0Var, this.G);
        }
        bVar.F();
        ConcurrentHashMap concurrentHashMap = this.L;
        if (concurrentHashMap != null) {
            for (String str5 : concurrentHashMap.keySet()) {
                h0.b.D(this.L, str5, bVar, str5, u0Var);
            }
        }
        bVar.F();
    }
}
