package io.sentry;

import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class e implements c2, Comparable {
    public String B;
    public String D;
    public b5 E;
    public ConcurrentHashMap F;

    /* renamed from: a, reason: collision with root package name */
    public final Long f12200a;

    /* renamed from: d, reason: collision with root package name */
    public Date f12201d;

    /* renamed from: g, reason: collision with root package name */
    public final Long f12202g;

    /* renamed from: r, reason: collision with root package name */
    public String f12203r;

    /* renamed from: x, reason: collision with root package name */
    public String f12204x;

    /* renamed from: y, reason: collision with root package name */
    public ConcurrentHashMap f12205y;

    public e(Date date) {
        this.f12205y = new ConcurrentHashMap();
        this.f12202g = Long.valueOf(System.nanoTime());
        this.f12201d = date;
        this.f12200a = null;
    }

    public final Date a() {
        Date date = this.f12201d;
        if (date != null) {
            return (Date) date.clone();
        }
        Long l10 = this.f12200a;
        if (l10 == null) {
            throw new IllegalStateException("No timestamp set for breadcrumb");
        }
        Date dateR = dr.a.r(l10.longValue());
        this.f12201d = dateR;
        return dateR;
    }

    public final void b(Object obj, String str) {
        if (obj == null) {
            this.f12205y.remove(str);
        } else {
            this.f12205y.put(str, obj);
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f12202g.compareTo(((e) obj).f12202g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (a().getTime() == eVar.a().getTime() && ir.f0.s(this.f12203r, eVar.f12203r) && ir.f0.s(this.f12204x, eVar.f12204x) && ir.f0.s(this.B, eVar.B) && ir.f0.s(this.D, eVar.D) && this.E == eVar.E) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12201d, this.f12203r, this.f12204x, this.B, this.D, this.E});
    }

    @Override // io.sentry.c2
    public final void serialize(y2 y2Var, u0 u0Var) throws IOException {
        i4.b bVar = (i4.b) y2Var;
        bVar.C();
        bVar.I("timestamp");
        bVar.S(u0Var, a());
        if (this.f12203r != null) {
            bVar.I("message");
            bVar.V(this.f12203r);
        }
        if (this.f12204x != null) {
            bVar.I("type");
            bVar.V(this.f12204x);
        }
        bVar.I("data");
        bVar.S(u0Var, this.f12205y);
        if (this.B != null) {
            bVar.I("category");
            bVar.V(this.B);
        }
        if (this.D != null) {
            bVar.I("origin");
            bVar.V(this.D);
        }
        if (this.E != null) {
            bVar.I("level");
            bVar.S(u0Var, this.E);
        }
        ConcurrentHashMap concurrentHashMap = this.F;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                h0.b.D(this.F, str, bVar, str, u0Var);
            }
        }
        bVar.F();
    }

    public e(long j) {
        this.f12205y = new ConcurrentHashMap();
        this.f12202g = Long.valueOf(System.nanoTime());
        this.f12200a = Long.valueOf(j);
        this.f12201d = null;
    }

    public e(e eVar) {
        this.f12205y = new ConcurrentHashMap();
        this.f12202g = Long.valueOf(System.nanoTime());
        this.f12201d = eVar.f12201d;
        this.f12200a = eVar.f12200a;
        this.f12203r = eVar.f12203r;
        this.f12204x = eVar.f12204x;
        this.B = eVar.B;
        this.D = eVar.D;
        ConcurrentHashMap concurrentHashMapO = com.google.android.gms.internal.measurement.b4.O(eVar.f12205y);
        if (concurrentHashMapO != null) {
            this.f12205y = concurrentHashMapO;
        }
        this.F = com.google.android.gms.internal.measurement.b4.O(eVar.F);
        this.E = eVar.E;
    }

    public e() {
        this(System.currentTimeMillis());
    }
}
