package k5;

import a5.d0;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import androidx.media3.common.k0;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import b5.a0;
import io.sentry.android.core.u0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import o5.e0;

/* loaded from: classes.dex */
public final class c implements t, r5.i {
    public static final u0 K = new u0(9);
    public r5.n B;
    public Handler D;
    public HlsMediaSource E;
    public l F;
    public Uri G;
    public i H;
    public boolean I;

    /* renamed from: a, reason: collision with root package name */
    public final j5.h f14048a;

    /* renamed from: d, reason: collision with root package name */
    public final p f14049d;

    /* renamed from: g, reason: collision with root package name */
    public final r5.h f14050g;

    /* renamed from: y, reason: collision with root package name */
    public e0 f14053y;

    /* renamed from: x, reason: collision with root package name */
    public final CopyOnWriteArrayList f14052x = new CopyOnWriteArrayList();

    /* renamed from: r, reason: collision with root package name */
    public final HashMap f14051r = new HashMap();
    public long J = -9223372036854775807L;

    public c(j5.h hVar, r5.h hVar2, p pVar) {
        this.f14048a = hVar;
        this.f14049d = pVar;
        this.f14050g = hVar2;
    }

    public final i a(boolean z10, Uri uri) {
        HashMap map = this.f14051r;
        i iVar = ((b) map.get(uri)).f14045r;
        if (iVar != null && z10 && !uri.equals(this.G)) {
            List list = this.F.f14091e;
            int i10 = 0;
            while (true) {
                if (i10 >= list.size()) {
                    break;
                }
                if (uri.equals(((k) list.get(i10)).f14083a)) {
                    i iVar2 = this.H;
                    if (iVar2 == null || !iVar2.f14072o) {
                        this.G = uri;
                        b bVar = (b) map.get(uri);
                        i iVar3 = bVar.f14045r;
                        if (iVar3 == null || !iVar3.f14072o) {
                            bVar.c(b(uri));
                            return iVar;
                        }
                        this.H = iVar3;
                        this.E.onPrimaryPlaylistRefreshed(iVar3);
                        return iVar;
                    }
                } else {
                    i10++;
                }
            }
        }
        return iVar;
    }

    public final Uri b(Uri uri) {
        f fVar;
        i iVar = this.H;
        if (iVar == null || !iVar.f14079v.f7239e || (fVar = (f) iVar.f14077t.get(uri)) == null) {
            return uri;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(fVar.f14055b));
        int i10 = fVar.f14056c;
        if (i10 != -1) {
            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(i10));
        }
        return builderBuildUpon.build();
    }

    public final boolean c(Uri uri) {
        int i10;
        b bVar = (b) this.f14051r.get(uri);
        if (bVar.f14045r == null) {
            return false;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jMax = Math.max(30000L, d0.P(bVar.f14045r.f14078u));
        i iVar = bVar.f14045r;
        return iVar.f14072o || (i10 = iVar.f14063d) == 2 || i10 == 1 || bVar.f14046x + jMax > jElapsedRealtime;
    }

    @Override // r5.i
    public final r5.j q(r5.k kVar, long j, long j7, IOException iOException, int i10) {
        long jMin;
        r5.q qVar = (r5.q) kVar;
        long j10 = qVar.f21253a;
        b5.k kVar2 = qVar.f21254d;
        a0 a0Var = qVar.f21256r;
        Uri uri = a0Var.f2421g;
        o5.q qVar2 = new o5.q(kVar2, j, j7, a0Var.f2420d);
        int i11 = qVar.f21255g;
        r5.h hVar = this.f14050g;
        ((df.c) hVar).getClass();
        if ((iOException instanceof k0) || (iOException instanceof FileNotFoundException) || (iOException instanceof b5.t) || (iOException instanceof r5.m)) {
            jMin = -9223372036854775807L;
            break;
        }
        int i12 = b5.i.f2434d;
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof b5.i) && ((b5.i) cause).f2435a == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
        }
        jMin = Math.min((i10 - 1) * 1000, 5000);
        boolean z10 = jMin == -9223372036854775807L;
        this.f14053y.i(qVar2, i11, iOException, z10);
        if (z10) {
            hVar.getClass();
        }
        return z10 ? r5.n.f21249y : new r5.j(0, jMin);
    }

    @Override // r5.i
    public final void r(r5.k kVar, long j, long j7) {
        l lVar;
        r5.q qVar = (r5.q) kVar;
        m mVar = (m) qVar.f21258y;
        boolean z10 = mVar instanceof i;
        if (z10) {
            String str = mVar.f14098a;
            l lVar2 = l.f14089n;
            Uri uri = Uri.parse(str);
            androidx.media3.common.q qVar2 = new androidx.media3.common.q();
            qVar2.f1734a = "0";
            qVar2.j = "application/x-mpegURL";
            List listSingletonList = Collections.singletonList(new k(uri, new androidx.media3.common.r(qVar2), null, null, null, null));
            List list = Collections.EMPTY_LIST;
            lVar = new l("", list, listSingletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
        } else {
            lVar = (l) mVar;
        }
        this.F = lVar;
        this.G = ((k) lVar.f14091e.get(0)).f14083a;
        this.f14052x.add(new a(this));
        List list2 = lVar.f14090d;
        int size = list2.size();
        for (int i10 = 0; i10 < size; i10++) {
            Uri uri2 = (Uri) list2.get(i10);
            this.f14051r.put(uri2, new b(this, uri2));
        }
        b5.k kVar2 = qVar.f21254d;
        a0 a0Var = qVar.f21256r;
        Uri uri3 = a0Var.f2421g;
        o5.q qVar3 = new o5.q(kVar2, j, j7, a0Var.f2420d);
        b bVar = (b) this.f14051r.get(this.G);
        if (z10) {
            bVar.d((i) mVar);
        } else {
            bVar.c(bVar.f14042a);
        }
        this.f14050g.getClass();
        this.f14053y.f(qVar3, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // r5.i
    public final void s(r5.k kVar, long j, long j7, boolean z10) {
        r5.q qVar = (r5.q) kVar;
        long j10 = qVar.f21253a;
        b5.k kVar2 = qVar.f21254d;
        a0 a0Var = qVar.f21256r;
        Uri uri = a0Var.f2421g;
        o5.q qVar2 = new o5.q(kVar2, j, j7, a0Var.f2420d);
        this.f14050g.getClass();
        this.f14053y.d(qVar2, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
