package k5;

import androidx.media3.common.DrmInitData;
import java.util.List;
import java.util.Map;
import oe.h0;
import oe.z0;

/* loaded from: classes.dex */
public final class i extends m {

    /* renamed from: d, reason: collision with root package name */
    public final int f14063d;

    /* renamed from: e, reason: collision with root package name */
    public final long f14064e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f14065f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f14066g;

    /* renamed from: h, reason: collision with root package name */
    public final long f14067h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f14068i;
    public final int j;
    public final long k;

    /* renamed from: l, reason: collision with root package name */
    public final int f14069l;

    /* renamed from: m, reason: collision with root package name */
    public final long f14070m;

    /* renamed from: n, reason: collision with root package name */
    public final long f14071n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f14072o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f14073p;

    /* renamed from: q, reason: collision with root package name */
    public final DrmInitData f14074q;

    /* renamed from: r, reason: collision with root package name */
    public final h0 f14075r;

    /* renamed from: s, reason: collision with root package name */
    public final h0 f14076s;

    /* renamed from: t, reason: collision with root package name */
    public final z0 f14077t;

    /* renamed from: u, reason: collision with root package name */
    public final long f14078u;

    /* renamed from: v, reason: collision with root package name */
    public final db.k f14079v;

    public i(int i10, String str, List list, long j, boolean z10, long j7, boolean z11, int i11, long j10, int i12, long j11, long j12, boolean z12, boolean z13, boolean z14, DrmInitData drmInitData, List list2, List list3, db.k kVar, Map map) {
        super(str, list, z12);
        this.f14063d = i10;
        this.f14067h = j7;
        this.f14066g = z10;
        this.f14068i = z11;
        this.j = i11;
        this.k = j10;
        this.f14069l = i12;
        this.f14070m = j11;
        this.f14071n = j12;
        this.f14072o = z13;
        this.f14073p = z14;
        this.f14074q = drmInitData;
        this.f14075r = h0.l(list2);
        this.f14076s = h0.l(list3);
        this.f14077t = z0.a(map);
        if (!list3.isEmpty()) {
            e eVar = (e) oe.s.i(list3);
            this.f14078u = eVar.f14061x + eVar.f14059g;
        } else if (list2.isEmpty()) {
            this.f14078u = 0L;
        } else {
            g gVar = (g) oe.s.i(list2);
            this.f14078u = gVar.f14061x + gVar.f14059g;
        }
        this.f14064e = j != -9223372036854775807L ? j >= 0 ? Math.min(this.f14078u, j) : Math.max(0L, this.f14078u + j) : -9223372036854775807L;
        this.f14065f = j >= 0;
        this.f14079v = kVar;
    }

    @Override // n5.a
    public final Object a(List list) {
        return this;
    }
}
