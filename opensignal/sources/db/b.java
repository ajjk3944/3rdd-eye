package db;

import android.net.Uri;
import android.os.SystemClock;
import com.google.android.exoplayer2.y0;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import pb.b0;
import pb.e0;
import pb.f0;
import pb.g0;
import pb.h0;
import pb.j0;
import pb.n0;
import pb.q0;
import pb.t0;
import qb.v;
import ya.a0;

/* loaded from: classes.dex */
public final class b implements g0 {
    public long B;
    public long D;
    public boolean E;
    public IOException F;
    public final /* synthetic */ c G;

    /* renamed from: a, reason: collision with root package name */
    public final Uri f7199a;

    /* renamed from: d, reason: collision with root package name */
    public final n0 f7200d = new n0("DefaultHlsPlaylistTracker:MediaPlaylist");

    /* renamed from: g, reason: collision with root package name */
    public final pb.n f7201g;

    /* renamed from: r, reason: collision with root package name */
    public l f7202r;

    /* renamed from: x, reason: collision with root package name */
    public long f7203x;

    /* renamed from: y, reason: collision with root package name */
    public long f7204y;

    public b(c cVar, Uri uri) {
        this.G = cVar;
        this.f7199a = uri;
        this.f7201g = ((pb.m) ((b9.e) cVar.f7205a).f2481d).a();
    }

    public static boolean a(b bVar, long j) {
        bVar.D = SystemClock.elapsedRealtime() + j;
        Uri uri = bVar.f7199a;
        c cVar = bVar.G;
        if (!uri.equals(cVar.G)) {
            return false;
        }
        List list = cVar.F.f7222e;
        int size = list.size();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar2 = (b) cVar.f7208r.get(((e) list.get(i10)).f7214a);
            bVar2.getClass();
            if (jElapsedRealtime > bVar2.D) {
                Uri uri2 = bVar2.f7199a;
                cVar.G = uri2;
                bVar2.c(cVar.b(uri2));
                return false;
            }
        }
        return true;
    }

    @Override // pb.g0
    public final void K(j0 j0Var, long j, long j7) {
        q0 q0Var = (q0) j0Var;
        m mVar = (m) q0Var.f20410y;
        na.c cVar = q0Var.f20406d;
        t0 t0Var = q0Var.f20408r;
        Uri uri = t0Var.f20432g;
        ya.m mVar2 = new ya.m(cVar, j, j7, t0Var.f20431d);
        if (mVar instanceof l) {
            d((l) mVar);
            this.G.f7210y.f(mVar2, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else {
            y0 y0VarB = y0.b(null, "Loaded playlist has unexpected type.");
            this.F = y0VarB;
            this.G.f7210y.i(mVar2, 4, y0VarB, true);
        }
        this.G.f7207g.getClass();
    }

    public final void b(Uri uri) {
        c cVar = this.G;
        q0 q0Var = new q0(this.f7201g, uri, 4, cVar.f7206d.r(cVar.F, this.f7202r));
        sm.m mVar = (sm.m) cVar.f7207g;
        int i10 = q0Var.f20407g;
        cVar.f7210y.k(new ya.m(q0Var.f20406d, this.f7200d.f(q0Var, this, mVar.q(i10))), i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void c(Uri uri) {
        this.D = 0L;
        if (this.E) {
            return;
        }
        n0 n0Var = this.f7200d;
        if (n0Var.d() || n0Var.c()) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.B;
        if (jElapsedRealtime >= j) {
            b(uri);
        } else {
            this.E = true;
            this.G.D.postDelayed(new a5.o(this, 12, uri), j - jElapsedRealtime);
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
    public final void d(db.l r71) {
        /*
            Method dump skipped, instructions count: 744
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: db.b.d(db.l):void");
    }

    @Override // pb.g0
    public final h0 q(j0 j0Var, long j, long j7, IOException iOException, int i10) {
        q0 q0Var = (q0) j0Var;
        long j10 = q0Var.f20405a;
        int i11 = q0Var.f20407g;
        na.c cVar = q0Var.f20406d;
        t0 t0Var = q0Var.f20408r;
        Uri uri = t0Var.f20432g;
        ya.m mVar = new ya.m(cVar, j, j7, t0Var.f20431d);
        boolean z10 = uri.getQueryParameter("_HLS_msn") != null;
        boolean z11 = iOException instanceof n;
        h0 h0Var = n0.f20391x;
        Uri uri2 = this.f7199a;
        c cVar2 = this.G;
        if (z10 || z11) {
            int i12 = iOException instanceof b0 ? ((b0) iOException).f20355d : Integer.MAX_VALUE;
            if (z11 || i12 == 400 || i12 == 503) {
                this.B = SystemClock.elapsedRealtime();
                c(uri2);
                a0 a0Var = cVar2.f7210y;
                int i13 = v.f20828a;
                a0Var.i(mVar, i11, iOException, true);
                return h0Var;
            }
        }
        e0 e0Var = new e0(iOException, i10);
        Iterator it = cVar2.f7209x.iterator();
        boolean z12 = false;
        while (it.hasNext()) {
            z12 |= !((s) it.next()).h(uri2, e0Var, false);
        }
        f0 f0Var = cVar2.f7207g;
        if (z12) {
            long jS = ((sm.m) f0Var).s(e0Var);
            h0Var = jS != -9223372036854775807L ? new h0(0, jS) : n0.f20392y;
        }
        boolean zA = h0Var.a();
        cVar2.f7210y.i(mVar, i11, iOException, !zA);
        if (!zA) {
            f0Var.getClass();
        }
        return h0Var;
    }

    @Override // pb.g0
    public final void x(j0 j0Var, long j, long j7, boolean z10) {
        q0 q0Var = (q0) j0Var;
        long j10 = q0Var.f20405a;
        na.c cVar = q0Var.f20406d;
        t0 t0Var = q0Var.f20408r;
        Uri uri = t0Var.f20432g;
        ya.m mVar = new ya.m(cVar, j, j7, t0Var.f20431d);
        c cVar2 = this.G;
        cVar2.f7207g.getClass();
        cVar2.f7210y.d(mVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
