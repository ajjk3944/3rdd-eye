package io.sentry.android.replay.gestures;

import a5.d0;
import android.os.Bundle;
import android.os.SystemClock;
import ca.l;
import ca.o;
import ca.p;
import ca.q;
import d5.y0;
import java.util.LinkedHashMap;
import ka.f;
import m6.d;
import qb.v;
import u5.n;
import u5.x;
import zc.c1;
import zc.d2;
import zc.d3;
import zc.e3;
import zc.j0;
import zc.o2;
import zc.r0;
import zc.s3;
import zc.u;

/* loaded from: classes.dex */
public final class c implements f, d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11920a;

    /* renamed from: d, reason: collision with root package name */
    public long f11921d;

    /* renamed from: g, reason: collision with root package name */
    public long f11922g;

    /* renamed from: r, reason: collision with root package name */
    public Object f11923r;

    /* renamed from: x, reason: collision with root package name */
    public Object f11924x;

    public boolean a(long j, boolean z10, boolean z11) {
        e3 e3Var = (e3) this.f11924x;
        e3Var.s1();
        e3Var.t1();
        c1 c1Var = (c1) e3Var.f1504d;
        boolean zA = c1Var.a();
        j0 j0Var = c1Var.f26889y;
        if (zA) {
            r0 r0Var = c1Var.f26888x;
            c1.e(r0Var);
            y0 y0Var = r0Var.M;
            c1Var.G.getClass();
            y0Var.f(System.currentTimeMillis());
        }
        long j7 = j - this.f11921d;
        if (!z10 && j7 < 1000) {
            c1.g(j0Var);
            j0Var.K.c(Long.valueOf(j7), "Screen exposed for less than 1000 ms. Event not sent. time");
            return false;
        }
        if (!z11) {
            j7 = j - this.f11922g;
            this.f11922g = j;
        }
        c1.g(j0Var);
        j0Var.K.c(Long.valueOf(j7), "Recording user engagement, ms");
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j7);
        boolean z12 = !c1Var.f26887r.G1();
        o2 o2Var = c1Var.H;
        c1.f(o2Var);
        s3.j2(o2Var.y1(z12), bundle, true);
        if (!z11) {
            d2 d2Var = c1Var.I;
            c1.f(d2Var);
            d2Var.z1("auto", "_e", bundle);
        }
        this.f11921d = j;
        d3 d3Var = (d3) this.f11923r;
        d3Var.c();
        d3Var.b(((Long) u.f27203q0.a(null)).longValue());
        return true;
    }

    @Override // ka.f
    public ca.u c() {
        qb.b.j(this.f11921d != -1);
        return new o((q) this.f11923r, this.f11921d);
    }

    @Override // ka.f
    public void d(long j) {
        switch (this.f11920a) {
            case 1:
                long[] jArr = ((p) this.f11924x).f3489a;
                this.f11922g = jArr[v.e(jArr, j, true)];
                break;
            default:
                long[] jArr2 = ((p) this.f11924x).f3489a;
                this.f11922g = jArr2[d0.e(jArr2, j, true)];
                break;
        }
    }

    @Override // ka.f
    public long g(l lVar) {
        long j = this.f11922g;
        if (j < 0) {
            return -1L;
        }
        long j7 = -(j + 2);
        this.f11922g = -1L;
        return j7;
    }

    @Override // m6.d
    public long s(u5.l lVar) {
        long j = this.f11922g;
        if (j < 0) {
            return -1L;
        }
        long j7 = -(j + 2);
        this.f11922g = -1L;
        return j7;
    }

    public c(e3 e3Var) {
        this.f11920a = 5;
        this.f11924x = e3Var;
        c1 c1Var = (c1) e3Var.f1504d;
        this.f11923r = new d3(this, c1Var, 0);
        c1Var.G.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f11921d = jElapsedRealtime;
        this.f11922g = jElapsedRealtime;
    }

    @Override // m6.d
    /* renamed from: c, reason: collision with other method in class */
    public x mo37c() {
        a5.a.i(this.f11921d != -1);
        return new n(0, this.f11921d, (u5.o) this.f11923r);
    }

    public c(io.sentry.transport.f fVar) {
        this.f11920a = 0;
        br.l.e(fVar, "dateProvider");
        this.f11923r = fVar;
        this.f11924x = new LinkedHashMap(10);
    }

    public c(int i10, long j) {
        this.f11920a = 4;
        a5.a.i(((r5.a) this.f11923r) == null);
        this.f11921d = j;
        this.f11922g = j + i10;
    }

    public c(String str, byte[] bArr, long j, long j7) {
        this.f11920a = 2;
        this.f11923r = str;
        this.f11924x = bArr;
        this.f11921d = j;
        this.f11922g = j7;
    }
}
