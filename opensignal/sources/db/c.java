package db;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.y0;
import d5.v;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import pb.f0;
import pb.g0;
import pb.h0;
import pb.j0;
import pb.m0;
import pb.n0;
import pb.q0;
import pb.t0;
import pb.y;
import ya.a0;

/* loaded from: classes.dex */
public final class c implements u, g0 {
    public static final v K = new v(1);
    public n0 B;
    public Handler D;
    public HlsMediaSource E;
    public f F;
    public Uri G;
    public l H;
    public boolean I;

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.exoplayer2.source.hls.j f7205a;

    /* renamed from: d, reason: collision with root package name */
    public final q f7206d;

    /* renamed from: g, reason: collision with root package name */
    public final f0 f7207g;

    /* renamed from: y, reason: collision with root package name */
    public a0 f7210y;

    /* renamed from: x, reason: collision with root package name */
    public final CopyOnWriteArrayList f7209x = new CopyOnWriteArrayList();

    /* renamed from: r, reason: collision with root package name */
    public final HashMap f7208r = new HashMap();
    public long J = -9223372036854775807L;

    public c(com.google.android.exoplayer2.source.hls.j jVar, f0 f0Var, q qVar) {
        this.f7205a = jVar;
        this.f7206d = qVar;
        this.f7207g = f0Var;
    }

    @Override // pb.g0
    public final void K(j0 j0Var, long j, long j7) {
        f fVar;
        q0 q0Var = (q0) j0Var;
        m mVar = (m) q0Var.f20410y;
        boolean z10 = mVar instanceof l;
        if (z10) {
            String str = mVar.f7257a;
            f fVar2 = f.f7220l;
            Uri uri = Uri.parse(str);
            com.google.android.exoplayer2.g0 g0Var = new com.google.android.exoplayer2.g0();
            g0Var.f4142a = "0";
            g0Var.j = "application/x-mpegURL";
            List listSingletonList = Collections.singletonList(new e(uri, new Format(g0Var), null, null, null, null));
            List list = Collections.EMPTY_LIST;
            fVar = new f("", list, listSingletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
        } else {
            fVar = (f) mVar;
        }
        this.F = fVar;
        this.G = ((e) fVar.f7222e.get(0)).f7214a;
        this.f7209x.add(new a(this));
        List list2 = fVar.f7221d;
        int size = list2.size();
        for (int i10 = 0; i10 < size; i10++) {
            Uri uri2 = (Uri) list2.get(i10);
            this.f7208r.put(uri2, new b(this, uri2));
        }
        na.c cVar = q0Var.f20406d;
        t0 t0Var = q0Var.f20408r;
        Uri uri3 = t0Var.f20432g;
        ya.m mVar2 = new ya.m(cVar, j, j7, t0Var.f20431d);
        b bVar = (b) this.f7208r.get(this.G);
        if (z10) {
            bVar.d((l) mVar);
        } else {
            bVar.c(bVar.f7199a);
        }
        this.f7207g.getClass();
        this.f7210y.f(mVar2, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final l a(boolean z10, Uri uri) {
        HashMap map = this.f7208r;
        l lVar = ((b) map.get(uri)).f7202r;
        if (lVar != null && z10 && !uri.equals(this.G)) {
            List list = this.F.f7222e;
            int i10 = 0;
            while (true) {
                if (i10 >= list.size()) {
                    break;
                }
                if (uri.equals(((e) list.get(i10)).f7214a)) {
                    l lVar2 = this.H;
                    if (lVar2 == null || !lVar2.f7249o) {
                        this.G = uri;
                        b bVar = (b) map.get(uri);
                        l lVar3 = bVar.f7202r;
                        if (lVar3 == null || !lVar3.f7249o) {
                            bVar.c(b(uri));
                            return lVar;
                        }
                        this.H = lVar3;
                        this.E.onPrimaryPlaylistRefreshed(lVar3);
                        return lVar;
                    }
                } else {
                    i10++;
                }
            }
        }
        return lVar;
    }

    public final Uri b(Uri uri) {
        h hVar;
        l lVar = this.H;
        if (lVar == null || !lVar.f7256v.f7239e || (hVar = (h) lVar.f7254t.get(uri)) == null) {
            return uri;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(hVar.f7227a));
        int i10 = hVar.f7228b;
        if (i10 != -1) {
            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(i10));
        }
        return builderBuildUpon.build();
    }

    public final boolean c(Uri uri) {
        int i10;
        b bVar = (b) this.f7208r.get(uri);
        if (bVar.f7202r == null) {
            return false;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jMax = Math.max(30000L, com.google.android.exoplayer2.h.d(bVar.f7202r.f7255u));
        l lVar = bVar.f7202r;
        return lVar.f7249o || (i10 = lVar.f7240d) == 2 || i10 == 1 || bVar.f7203x + jMax > jElapsedRealtime;
    }

    @Override // pb.g0
    public final h0 q(j0 j0Var, long j, long j7, IOException iOException, int i10) {
        q0 q0Var = (q0) j0Var;
        long j10 = q0Var.f20405a;
        na.c cVar = q0Var.f20406d;
        t0 t0Var = q0Var.f20408r;
        Uri uri = t0Var.f20432g;
        ya.m mVar = new ya.m(cVar, j, j7, t0Var.f20431d);
        int i11 = q0Var.f20407g;
        f0 f0Var = this.f7207g;
        ((sm.m) f0Var).getClass();
        long jMin = ((iOException instanceof y0) || (iOException instanceof FileNotFoundException) || (iOException instanceof y) || (iOException instanceof m0)) ? -9223372036854775807L : Math.min((i10 - 1) * 1000, 5000);
        boolean z10 = jMin == -9223372036854775807L;
        this.f7210y.i(mVar, i11, iOException, z10);
        if (z10) {
            f0Var.getClass();
        }
        return z10 ? n0.f20392y : new h0(0, jMin);
    }

    @Override // pb.g0
    public final void x(j0 j0Var, long j, long j7, boolean z10) {
        q0 q0Var = (q0) j0Var;
        long j10 = q0Var.f20405a;
        na.c cVar = q0Var.f20406d;
        t0 t0Var = q0Var.f20408r;
        Uri uri = t0Var.f20432g;
        ya.m mVar = new ya.m(cVar, j, j7, t0Var.f20431d);
        this.f7207g.getClass();
        this.f7210y.d(mVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
