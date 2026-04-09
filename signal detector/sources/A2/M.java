package A2;

import android.util.Pair;
import com.google.android.gms.internal.ads.AbstractC1642oa;
import com.google.android.gms.internal.ads.C0852Zn;

/* loaded from: classes.dex */
public final class M extends D2.a {

    /* renamed from: a, reason: collision with root package name */
    public final L f187a;

    /* renamed from: b, reason: collision with root package name */
    public final C0852Zn f188b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f189c;

    /* renamed from: d, reason: collision with root package name */
    public final int f190d;

    /* renamed from: e, reason: collision with root package name */
    public final long f191e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f192f;

    public M(L l2, boolean z6, int i, Boolean bool, C0852Zn c0852Zn) {
        this.f187a = l2;
        this.f189c = z6;
        this.f190d = i;
        this.f192f = bool;
        this.f188b = c0852Zn;
        p2.j.f22785C.f22797k.getClass();
        this.f191e = System.currentTimeMillis();
    }

    @Override // D2.a
    public final void a(String str) {
        Pair pair = new Pair("sgf_reason", str);
        Pair pair2 = new Pair("se", "query_g");
        Pair pair3 = new Pair("ad_format", "BANNER");
        Pair pair4 = new Pair("rtype", Integer.toString(6));
        Pair pair5 = new Pair("scar", "true");
        p2.j jVar = p2.j.f22785C;
        jVar.f22797k.getClass();
        Pair pair6 = new Pair("lat_ms", Long.toString(System.currentTimeMillis() - this.f191e));
        int i = this.f190d;
        Pair pair7 = new Pair("sgpc_rn", Integer.toString(i));
        Pair pair8 = new Pair("sgpc_lsu", String.valueOf(this.f192f));
        boolean z6 = this.f189c;
        I5.b.D(this.f188b, "sgpcf", pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, new Pair("tpc", true != z6 ? "0" : "1"));
        jVar.f22797k.getClass();
        this.f187a.b(z6, new N(null, str, ((Long) AbstractC1642oa.f15962h.v()).longValue() + System.currentTimeMillis(), i));
    }

    @Override // D2.a
    public final void b(C0117e c0117e) {
        Pair pair = new Pair("se", "query_g");
        Pair pair2 = new Pair("ad_format", "BANNER");
        Pair pair3 = new Pair("rtype", Integer.toString(6));
        Pair pair4 = new Pair("scar", "true");
        p2.j jVar = p2.j.f22785C;
        jVar.f22797k.getClass();
        Pair pair5 = new Pair("lat_ms", Long.toString(System.currentTimeMillis() - this.f191e));
        int i = this.f190d;
        Pair pair6 = new Pair("sgpc_rn", Integer.toString(i));
        Pair pair7 = new Pair("sgpc_lsu", String.valueOf(this.f192f));
        boolean z6 = this.f189c;
        I5.b.D(this.f188b, "sgpcs", pair, pair2, pair3, pair4, pair5, pair6, pair7, new Pair("tpc", true != z6 ? "0" : "1"));
        jVar.f22797k.getClass();
        this.f187a.b(z6, new N(c0117e, "", ((Long) AbstractC1642oa.f15962h.v()).longValue() + System.currentTimeMillis(), i));
    }
}
