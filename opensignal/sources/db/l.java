package db;

import com.google.android.exoplayer2.drm.DrmInitData;
import java.util.List;
import java.util.Map;
import oe.h0;
import oe.z0;

/* loaded from: classes.dex */
public final class l extends m {

    /* renamed from: d, reason: collision with root package name */
    public final int f7240d;

    /* renamed from: e, reason: collision with root package name */
    public final long f7241e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f7242f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f7243g;

    /* renamed from: h, reason: collision with root package name */
    public final long f7244h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f7245i;
    public final int j;
    public final long k;

    /* renamed from: l, reason: collision with root package name */
    public final int f7246l;

    /* renamed from: m, reason: collision with root package name */
    public final long f7247m;

    /* renamed from: n, reason: collision with root package name */
    public final long f7248n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f7249o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f7250p;

    /* renamed from: q, reason: collision with root package name */
    public final DrmInitData f7251q;

    /* renamed from: r, reason: collision with root package name */
    public final h0 f7252r;

    /* renamed from: s, reason: collision with root package name */
    public final h0 f7253s;

    /* renamed from: t, reason: collision with root package name */
    public final z0 f7254t;

    /* renamed from: u, reason: collision with root package name */
    public final long f7255u;

    /* renamed from: v, reason: collision with root package name */
    public final k f7256v;

    public l(int i10, String str, List list, long j, boolean z10, long j7, boolean z11, int i11, long j10, int i12, long j11, long j12, boolean z12, boolean z13, boolean z14, DrmInitData drmInitData, List list2, List list3, k kVar, Map map) {
        super(str, list, z12);
        this.f7240d = i10;
        this.f7244h = j7;
        this.f7243g = z10;
        this.f7245i = z11;
        this.j = i11;
        this.k = j10;
        this.f7246l = i12;
        this.f7247m = j11;
        this.f7248n = j12;
        this.f7249o = z13;
        this.f7250p = z14;
        this.f7251q = drmInitData;
        this.f7252r = h0.l(list2);
        this.f7253s = h0.l(list3);
        this.f7254t = z0.a(map);
        if (!list3.isEmpty()) {
            g gVar = (g) oe.s.i(list3);
            this.f7255u = gVar.f7233x + gVar.f7231g;
        } else if (list2.isEmpty()) {
            this.f7255u = 0L;
        } else {
            i iVar = (i) oe.s.i(list2);
            this.f7255u = iVar.f7233x + iVar.f7231g;
        }
        this.f7241e = j != -9223372036854775807L ? j >= 0 ? Math.min(this.f7255u, j) : Math.max(0L, this.f7255u + j) : -9223372036854775807L;
        this.f7242f = j >= 0;
        this.f7256v = kVar;
    }

    @Override // xa.a
    public final Object a(List list) {
        return this;
    }
}
