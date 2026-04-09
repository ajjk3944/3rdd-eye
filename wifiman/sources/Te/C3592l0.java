package Te;

import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: Te.l0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3592l0 {

    /* renamed from: a, reason: collision with root package name */
    private final Ci.d f21874a;

    /* renamed from: Te.l0$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final S8.c f21875a;

        /* renamed from: b, reason: collision with root package name */
        private final S8.l f21876b;

        /* renamed from: c, reason: collision with root package name */
        private final S8.d f21877c;

        /* renamed from: d, reason: collision with root package name */
        private final W7.b f21878d;

        public a(S8.c band, S8.l lVar, S8.d dVar, W7.b bVar) {
            AbstractC6492s.i(band, "band");
            this.f21875a = band;
            this.f21876b = lVar;
            this.f21877c = dVar;
            this.f21878d = bVar;
        }

        public final S8.c a() {
            return this.f21875a;
        }

        public final S8.d b() {
            return this.f21877c;
        }

        public final W7.b c() {
            return this.f21878d;
        }

        public final S8.l d() {
            return this.f21876b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f21875a == aVar.f21875a && AbstractC6492s.d(this.f21876b, aVar.f21876b) && this.f21877c == aVar.f21877c && AbstractC6492s.d(this.f21878d, aVar.f21878d);
        }

        public int hashCode() {
            int iHashCode = this.f21875a.hashCode() * 31;
            S8.l lVar = this.f21876b;
            int iHashCode2 = (iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31;
            S8.d dVar = this.f21877c;
            int iHashCode3 = (iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
            W7.b bVar = this.f21878d;
            return iHashCode3 + (bVar != null ? bVar.hashCode() : 0);
        }

        public String toString() {
            return "Link(band=" + this.f21875a + ", signal=" + this.f21876b + ", bandwidth=" + this.f21877c + ", phySpeed=" + this.f21878d + ")";
        }
    }

    public C3592l0(Ci.d links) {
        AbstractC6492s.i(links, "links");
        this.f21874a = links;
    }

    public final Ci.d a() {
        return this.f21874a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3592l0) && AbstractC6492s.d(this.f21874a, ((C3592l0) obj).f21874a);
    }

    public int hashCode() {
        return this.f21874a.hashCode();
    }

    public String toString() {
        return "Model(links=" + this.f21874a + ")";
    }
}
