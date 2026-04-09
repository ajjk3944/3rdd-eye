package ya;

import com.google.android.exoplayer2.Format;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f26035a;

    /* renamed from: b, reason: collision with root package name */
    public final v f26036b;

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f26037c;

    /* renamed from: d, reason: collision with root package name */
    public final long f26038d;

    public a0() {
        this(new CopyOnWriteArrayList(), 0, null, 0L);
    }

    public final long a(long j) {
        long jD = com.google.android.exoplayer2.h.d(j);
        if (jD == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.f26038d + jD;
    }

    public final void b(int i10, Format format, int i11, Object obj, long j) {
        c(new r(1, i10, format, i11, obj, a(j), -9223372036854775807L));
    }

    public final void c(r rVar) {
        Iterator it = this.f26037c.iterator();
        while (it.hasNext()) {
            z zVar = (z) it.next();
            qb.v.F(zVar.f26201a, new ch.a(this, zVar.f26202b, rVar, 20));
        }
    }

    public final void d(m mVar, int i10, int i11, Format format, int i12, Object obj, long j, long j7) {
        e(mVar, new r(i10, i11, format, i12, obj, a(j), a(j7)));
    }

    public final void e(m mVar, r rVar) {
        Iterator it = this.f26037c.iterator();
        while (it.hasNext()) {
            z zVar = (z) it.next();
            qb.v.F(zVar.f26201a, new y(this, zVar.f26202b, mVar, rVar, 1));
        }
    }

    public final void f(m mVar, int i10, int i11, Format format, int i12, Object obj, long j, long j7) {
        g(mVar, new r(i10, i11, format, i12, obj, a(j), a(j7)));
    }

    public final void g(m mVar, r rVar) {
        Iterator it = this.f26037c.iterator();
        while (it.hasNext()) {
            z zVar = (z) it.next();
            qb.v.F(zVar.f26201a, new y(this, zVar.f26202b, mVar, rVar, 0));
        }
    }

    public final void h(m mVar, int i10, int i11, Format format, int i12, Object obj, long j, long j7, IOException iOException, boolean z10) {
        j(mVar, new r(i10, i11, format, i12, obj, a(j), a(j7)), iOException, z10);
    }

    public final void i(m mVar, int i10, IOException iOException, boolean z10) {
        h(mVar, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z10);
    }

    public final void j(m mVar, r rVar, IOException iOException, boolean z10) {
        Iterator it = this.f26037c.iterator();
        while (it.hasNext()) {
            z zVar = (z) it.next();
            qb.v.F(zVar.f26201a, new d5.l0(this, zVar.f26202b, mVar, rVar, iOException, z10, 2));
        }
    }

    public final void k(m mVar, int i10, int i11, Format format, int i12, Object obj, long j, long j7) {
        l(mVar, new r(i10, i11, format, i12, obj, a(j), a(j7)));
    }

    public final void l(m mVar, r rVar) {
        Iterator it = this.f26037c.iterator();
        while (it.hasNext()) {
            z zVar = (z) it.next();
            qb.v.F(zVar.f26201a, new y(this, zVar.f26202b, mVar, rVar, 2));
        }
    }

    public final void m(r rVar) {
        v vVar = this.f26036b;
        vVar.getClass();
        Iterator it = this.f26037c.iterator();
        while (it.hasNext()) {
            z zVar = (z) it.next();
            qb.v.F(zVar.f26201a, new io.sentry.android.core.internal.util.h(this, zVar.f26202b, vVar, rVar, 6));
        }
    }

    public a0(CopyOnWriteArrayList copyOnWriteArrayList, int i10, v vVar, long j) {
        this.f26037c = copyOnWriteArrayList;
        this.f26035a = i10;
        this.f26036b = vVar;
        this.f26038d = j;
    }
}
