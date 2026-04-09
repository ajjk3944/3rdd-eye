package o5;

import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f18922a;

    /* renamed from: b, reason: collision with root package name */
    public final z f18923b;

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f18924c;

    /* renamed from: d, reason: collision with root package name */
    public final long f18925d;

    public e0(CopyOnWriteArrayList copyOnWriteArrayList, int i10, z zVar, long j) {
        this.f18924c = copyOnWriteArrayList;
        this.f18922a = i10;
        this.f18923b = zVar;
        this.f18925d = j;
    }

    public final long a(long j) {
        long jP = a5.d0.P(j);
        if (jP == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.f18925d + jP;
    }

    public final void b(int i10, androidx.media3.common.r rVar, int i11, Object obj, long j) {
        c(new v(1, i10, rVar, i11, obj, a(j), -9223372036854775807L));
    }

    public final void c(v vVar) {
        Iterator it = this.f18924c.iterator();
        while (it.hasNext()) {
            d0 d0Var = (d0) it.next();
            a5.d0.K(d0Var.f18913a, new ch.a(this, d0Var.f18914b, vVar, 14));
        }
    }

    public final void d(q qVar, int i10, int i11, androidx.media3.common.r rVar, int i12, Object obj, long j, long j7) {
        e(qVar, new v(i10, i11, rVar, i12, obj, a(j), a(j7)));
    }

    public final void e(q qVar, v vVar) {
        Iterator it = this.f18924c.iterator();
        while (it.hasNext()) {
            d0 d0Var = (d0) it.next();
            a5.d0.K(d0Var.f18913a, new c0(this, d0Var.f18914b, qVar, vVar, 2));
        }
    }

    public final void f(q qVar, int i10, int i11, androidx.media3.common.r rVar, int i12, Object obj, long j, long j7) {
        g(qVar, new v(i10, i11, rVar, i12, obj, a(j), a(j7)));
    }

    public final void g(q qVar, v vVar) {
        Iterator it = this.f18924c.iterator();
        while (it.hasNext()) {
            d0 d0Var = (d0) it.next();
            a5.d0.K(d0Var.f18913a, new c0(this, d0Var.f18914b, qVar, vVar, 1));
        }
    }

    public final void h(q qVar, int i10, int i11, androidx.media3.common.r rVar, int i12, Object obj, long j, long j7, IOException iOException, boolean z10) {
        j(qVar, new v(i10, i11, rVar, i12, obj, a(j), a(j7)), iOException, z10);
    }

    public final void i(q qVar, int i10, IOException iOException, boolean z10) {
        h(qVar, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z10);
    }

    public final void j(q qVar, v vVar, IOException iOException, boolean z10) {
        Iterator it = this.f18924c.iterator();
        while (it.hasNext()) {
            d0 d0Var = (d0) it.next();
            a5.d0.K(d0Var.f18913a, new d5.l0(this, d0Var.f18914b, qVar, vVar, iOException, z10, 1));
        }
    }

    public final void k(q qVar, int i10, int i11, androidx.media3.common.r rVar, int i12, Object obj, long j, long j7) {
        l(qVar, new v(i10, i11, rVar, i12, obj, a(j), a(j7)));
    }

    public final void l(q qVar, v vVar) {
        Iterator it = this.f18924c.iterator();
        while (it.hasNext()) {
            d0 d0Var = (d0) it.next();
            a5.d0.K(d0Var.f18913a, new c0(this, d0Var.f18914b, qVar, vVar, 0));
        }
    }

    public final void m(v vVar) {
        z zVar = this.f18923b;
        zVar.getClass();
        Iterator it = this.f18924c.iterator();
        while (it.hasNext()) {
            d0 d0Var = (d0) it.next();
            a5.d0.K(d0Var.f18913a, new io.sentry.android.core.internal.util.h(this, d0Var.f18914b, zVar, vVar, 3));
        }
    }
}
