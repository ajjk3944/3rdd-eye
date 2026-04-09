package je;

import h9.C5969a;
import ke.AbstractC6456a;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: je.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6316q {

    /* renamed from: a, reason: collision with root package name */
    private final S8.c f50763a;

    /* renamed from: b, reason: collision with root package name */
    private final C5969a f50764b;

    /* renamed from: c, reason: collision with root package name */
    private final S8.l f50765c;

    /* renamed from: d, reason: collision with root package name */
    private final W7.b f50766d;

    /* renamed from: e, reason: collision with root package name */
    private final Integer f50767e;

    /* renamed from: f, reason: collision with root package name */
    private final S8.d f50768f;

    /* renamed from: g, reason: collision with root package name */
    private final AbstractC6456a f50769g;

    public C6316q(S8.c band, C5969a c5969a, S8.l lVar, W7.b bVar, Integer num, S8.d dVar, AbstractC6456a status) {
        AbstractC6492s.i(band, "band");
        AbstractC6492s.i(status, "status");
        this.f50763a = band;
        this.f50764b = c5969a;
        this.f50765c = lVar;
        this.f50766d = bVar;
        this.f50767e = num;
        this.f50768f = dVar;
        this.f50769g = status;
    }

    public static /* synthetic */ C6316q b(C6316q c6316q, S8.c cVar, C5969a c5969a, S8.l lVar, W7.b bVar, Integer num, S8.d dVar, AbstractC6456a abstractC6456a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cVar = c6316q.f50763a;
        }
        if ((i10 & 2) != 0) {
            c5969a = c6316q.f50764b;
        }
        C5969a c5969a2 = c5969a;
        if ((i10 & 4) != 0) {
            lVar = c6316q.f50765c;
        }
        S8.l lVar2 = lVar;
        if ((i10 & 8) != 0) {
            bVar = c6316q.f50766d;
        }
        W7.b bVar2 = bVar;
        if ((i10 & 16) != 0) {
            num = c6316q.f50767e;
        }
        Integer num2 = num;
        if ((i10 & 32) != 0) {
            dVar = c6316q.f50768f;
        }
        S8.d dVar2 = dVar;
        if ((i10 & 64) != 0) {
            abstractC6456a = c6316q.f50769g;
        }
        return c6316q.a(cVar, c5969a2, lVar2, bVar2, num2, dVar2, abstractC6456a);
    }

    public final C6316q a(S8.c band, C5969a c5969a, S8.l lVar, W7.b bVar, Integer num, S8.d dVar, AbstractC6456a status) {
        AbstractC6492s.i(band, "band");
        AbstractC6492s.i(status, "status");
        return new C6316q(band, c5969a, lVar, bVar, num, dVar, status);
    }

    public final S8.c c() {
        return this.f50763a;
    }

    public final S8.d d() {
        return this.f50768f;
    }

    public final C5969a e() {
        return this.f50764b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6316q)) {
            return false;
        }
        C6316q c6316q = (C6316q) obj;
        return this.f50763a == c6316q.f50763a && AbstractC6492s.d(this.f50764b, c6316q.f50764b) && AbstractC6492s.d(this.f50765c, c6316q.f50765c) && AbstractC6492s.d(this.f50766d, c6316q.f50766d) && AbstractC6492s.d(this.f50767e, c6316q.f50767e) && this.f50768f == c6316q.f50768f && AbstractC6492s.d(this.f50769g, c6316q.f50769g);
    }

    public final Integer f() {
        return this.f50767e;
    }

    public final W7.b g() {
        return this.f50766d;
    }

    public final S8.l h() {
        return this.f50765c;
    }

    public int hashCode() {
        int iHashCode = this.f50763a.hashCode() * 31;
        C5969a c5969a = this.f50764b;
        int iHashCode2 = (iHashCode + (c5969a == null ? 0 : c5969a.hashCode())) * 31;
        S8.l lVar = this.f50765c;
        int iHashCode3 = (iHashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        W7.b bVar = this.f50766d;
        int iHashCode4 = (iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Integer num = this.f50767e;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        S8.d dVar = this.f50768f;
        return ((iHashCode5 + (dVar != null ? dVar.hashCode() : 0)) * 31) + this.f50769g.hashCode();
    }

    public final AbstractC6456a i() {
        return this.f50769g;
    }

    public String toString() {
        return "Link(band=" + this.f50763a + ", bssid=" + this.f50764b + ", signal=" + this.f50765c + ", phyRate=" + this.f50766d + ", channel=" + this.f50767e + ", bandwidth=" + this.f50768f + ", status=" + this.f50769g + ")";
    }
}
