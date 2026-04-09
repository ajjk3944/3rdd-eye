package k5;

import a5.d0;
import android.net.Uri;
import android.os.SystemClock;
import androidx.media3.common.k0;
import b5.a0;
import b5.w;
import i.g0;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import o5.e0;

/* loaded from: classes.dex */
public final class b implements r5.i {
    public long B;
    public long D;
    public boolean E;
    public IOException F;
    public final /* synthetic */ c G;

    /* renamed from: a, reason: collision with root package name */
    public final Uri f14042a;

    /* renamed from: d, reason: collision with root package name */
    public final r5.n f14043d = new r5.n("DefaultHlsPlaylistTracker:MediaPlaylist");

    /* renamed from: g, reason: collision with root package name */
    public final b5.h f14044g;

    /* renamed from: r, reason: collision with root package name */
    public i f14045r;

    /* renamed from: x, reason: collision with root package name */
    public long f14046x;

    /* renamed from: y, reason: collision with root package name */
    public long f14047y;

    public b(c cVar, Uri uri) {
        this.G = cVar;
        this.f14042a = uri;
        this.f14044g = ((b5.g) ((g0) cVar.f14048a).f11051a).a();
    }

    public static boolean a(b bVar, long j) {
        bVar.D = SystemClock.elapsedRealtime() + j;
        Uri uri = bVar.f14042a;
        c cVar = bVar.G;
        if (!uri.equals(cVar.G)) {
            return false;
        }
        List list = cVar.F.f14091e;
        int size = list.size();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar2 = (b) cVar.f14051r.get(((k) list.get(i10)).f14083a);
            bVar2.getClass();
            if (jElapsedRealtime > bVar2.D) {
                Uri uri2 = bVar2.f14042a;
                cVar.G = uri2;
                bVar2.c(cVar.b(uri2));
                return false;
            }
        }
        return true;
    }

    public final void b(Uri uri) {
        c cVar = this.G;
        r5.q qVar = new r5.q(this.f14044g, uri, 4, cVar.f14049d.u(cVar.F, this.f14045r));
        df.c cVar2 = (df.c) cVar.f14050g;
        int i10 = qVar.f21255g;
        cVar.f14053y.k(new o5.q(qVar.f21254d, this.f14043d.f(qVar, this, cVar2.u(i10))), i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void c(Uri uri) {
        this.D = 0L;
        if (this.E) {
            return;
        }
        r5.n nVar = this.f14043d;
        if (nVar.d() || nVar.c()) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.B;
        if (jElapsedRealtime >= j) {
            b(uri);
        } else {
            this.E = true;
            this.G.D.postDelayed(new io.sentry.cache.e(this, 9, uri), j - jElapsedRealtime);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0248  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(k5.i r71) {
        /*
            Method dump skipped, instructions count: 744
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.b.d(k5.i):void");
    }

    @Override // r5.i
    public final r5.j q(r5.k kVar, long j, long j7, IOException iOException, int i10) {
        r5.q qVar = (r5.q) kVar;
        long j10 = qVar.f21253a;
        int i11 = qVar.f21255g;
        b5.k kVar2 = qVar.f21254d;
        a0 a0Var = qVar.f21256r;
        Uri uri = a0Var.f2421g;
        o5.q qVar2 = new o5.q(kVar2, j, j7, a0Var.f2420d);
        boolean z10 = uri.getQueryParameter("_HLS_msn") != null;
        boolean z11 = iOException instanceof n;
        r5.j jVar = r5.n.f21248x;
        Uri uri2 = this.f14042a;
        c cVar = this.G;
        if (z10 || z11) {
            int i12 = iOException instanceof w ? ((w) iOException).f2468r : Integer.MAX_VALUE;
            if (z11 || i12 == 400 || i12 == 503) {
                this.B = SystemClock.elapsedRealtime();
                c(uri2);
                e0 e0Var = cVar.f14053y;
                int i13 = d0.f105a;
                e0Var.i(qVar2, i11, iOException, true);
                return jVar;
            }
        }
        pb.e0 e0Var2 = new pb.e0(iOException, i10);
        Iterator it = cVar.f14052x.iterator();
        boolean z12 = false;
        while (it.hasNext()) {
            z12 |= !((r) it.next()).b(uri2, e0Var2, false);
        }
        r5.h hVar = cVar.f14050g;
        if (z12) {
            long jX = ((df.c) hVar).x(e0Var2);
            jVar = jX != -9223372036854775807L ? new r5.j(0, jX) : r5.n.f21249y;
        }
        boolean zA = jVar.a();
        cVar.f14053y.i(qVar2, i11, iOException, !zA);
        if (!zA) {
            hVar.getClass();
        }
        return jVar;
    }

    @Override // r5.i
    public final void r(r5.k kVar, long j, long j7) {
        r5.q qVar = (r5.q) kVar;
        m mVar = (m) qVar.f21258y;
        b5.k kVar2 = qVar.f21254d;
        a0 a0Var = qVar.f21256r;
        Uri uri = a0Var.f2421g;
        o5.q qVar2 = new o5.q(kVar2, j, j7, a0Var.f2420d);
        if (mVar instanceof i) {
            d((i) mVar);
            this.G.f14053y.f(qVar2, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else {
            k0 k0VarB = k0.b(null, "Loaded playlist has unexpected type.");
            this.F = k0VarB;
            this.G.f14053y.i(qVar2, 4, k0VarB, true);
        }
        this.G.f14050g.getClass();
    }

    @Override // r5.i
    public final void s(r5.k kVar, long j, long j7, boolean z10) {
        r5.q qVar = (r5.q) kVar;
        long j10 = qVar.f21253a;
        b5.k kVar2 = qVar.f21254d;
        a0 a0Var = qVar.f21256r;
        Uri uri = a0Var.f2421g;
        o5.q qVar2 = new o5.q(kVar2, j, j7, a0Var.f2420d);
        c cVar = this.G;
        cVar.f14050g.getClass();
        cVar.f14053y.d(qVar2, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
