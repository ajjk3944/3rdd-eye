package Q4;

import Q4.f0;
import java.util.List;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application.java */
/* loaded from: classes2.dex */
public final class L extends f0.e.d.a {

    /* renamed from: a, reason: collision with root package name */
    public final f0.e.d.a.b f11057a;

    /* renamed from: b, reason: collision with root package name */
    public final List<f0.c> f11058b;

    /* renamed from: c, reason: collision with root package name */
    public final List<f0.c> f11059c;

    /* renamed from: d, reason: collision with root package name */
    public final Boolean f11060d;

    /* renamed from: e, reason: collision with root package name */
    public final f0.e.d.a.c f11061e;

    /* renamed from: f, reason: collision with root package name */
    public final List<f0.e.d.a.c> f11062f;

    /* renamed from: g, reason: collision with root package name */
    public final int f11063g;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application.java */
    public static final class a extends f0.e.d.a.AbstractC0137a {

        /* renamed from: a, reason: collision with root package name */
        public f0.e.d.a.b f11064a;

        /* renamed from: b, reason: collision with root package name */
        public List<f0.c> f11065b;

        /* renamed from: c, reason: collision with root package name */
        public List<f0.c> f11066c;

        /* renamed from: d, reason: collision with root package name */
        public Boolean f11067d;

        /* renamed from: e, reason: collision with root package name */
        public f0.e.d.a.c f11068e;

        /* renamed from: f, reason: collision with root package name */
        public List<f0.e.d.a.c> f11069f;

        /* renamed from: g, reason: collision with root package name */
        public int f11070g;

        /* renamed from: h, reason: collision with root package name */
        public byte f11071h;
    }

    public L() {
        throw null;
    }

    public L(f0.e.d.a.b bVar, List list, List list2, Boolean bool, f0.e.d.a.c cVar, List list3, int i) {
        this.f11057a = bVar;
        this.f11058b = list;
        this.f11059c = list2;
        this.f11060d = bool;
        this.f11061e = cVar;
        this.f11062f = list3;
        this.f11063g = i;
    }

    @Override // Q4.f0.e.d.a
    public final List<f0.e.d.a.c> a() {
        return this.f11062f;
    }

    @Override // Q4.f0.e.d.a
    public final Boolean b() {
        return this.f11060d;
    }

    @Override // Q4.f0.e.d.a
    public final f0.e.d.a.c c() {
        return this.f11061e;
    }

    @Override // Q4.f0.e.d.a
    public final List<f0.c> d() {
        return this.f11058b;
    }

    @Override // Q4.f0.e.d.a
    public final f0.e.d.a.b e() {
        return this.f11057a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e.d.a)) {
            return false;
        }
        f0.e.d.a aVar = (f0.e.d.a) obj;
        if (!this.f11057a.equals(aVar.e())) {
            return false;
        }
        List<f0.c> list = this.f11058b;
        if (list == null) {
            if (aVar.d() != null) {
                return false;
            }
        } else if (!list.equals(aVar.d())) {
            return false;
        }
        List<f0.c> list2 = this.f11059c;
        if (list2 == null) {
            if (aVar.f() != null) {
                return false;
            }
        } else if (!list2.equals(aVar.f())) {
            return false;
        }
        Boolean bool = this.f11060d;
        if (bool == null) {
            if (aVar.b() != null) {
                return false;
            }
        } else if (!bool.equals(aVar.b())) {
            return false;
        }
        f0.e.d.a.c cVar = this.f11061e;
        if (cVar == null) {
            if (aVar.c() != null) {
                return false;
            }
        } else if (!cVar.equals(aVar.c())) {
            return false;
        }
        List<f0.e.d.a.c> list3 = this.f11062f;
        if (list3 == null) {
            if (aVar.a() != null) {
                return false;
            }
        } else if (!list3.equals(aVar.a())) {
            return false;
        }
        return this.f11063g == aVar.g();
    }

    @Override // Q4.f0.e.d.a
    public final List<f0.c> f() {
        return this.f11059c;
    }

    @Override // Q4.f0.e.d.a
    public final int g() {
        return this.f11063g;
    }

    @Override // Q4.f0.e.d.a
    public final a h() {
        a aVar = new a();
        aVar.f11064a = this.f11057a;
        aVar.f11065b = this.f11058b;
        aVar.f11066c = this.f11059c;
        aVar.f11067d = this.f11060d;
        aVar.f11068e = this.f11061e;
        aVar.f11069f = this.f11062f;
        aVar.f11070g = this.f11063g;
        aVar.f11071h = (byte) 1;
        return aVar;
    }

    public final int hashCode() {
        int iHashCode = (this.f11057a.hashCode() ^ 1000003) * 1000003;
        List<f0.c> list = this.f11058b;
        int iHashCode2 = (iHashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List<f0.c> list2 = this.f11059c;
        int iHashCode3 = (iHashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.f11060d;
        int iHashCode4 = (iHashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        f0.e.d.a.c cVar = this.f11061e;
        int iHashCode5 = (iHashCode4 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        List<f0.e.d.a.c> list3 = this.f11062f;
        return ((iHashCode5 ^ (list3 != null ? list3.hashCode() : 0)) * 1000003) ^ this.f11063g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{execution=");
        sb.append(this.f11057a);
        sb.append(", customAttributes=");
        sb.append(this.f11058b);
        sb.append(", internalKeys=");
        sb.append(this.f11059c);
        sb.append(", background=");
        sb.append(this.f11060d);
        sb.append(", currentProcessDetails=");
        sb.append(this.f11061e);
        sb.append(", appProcessDetails=");
        sb.append(this.f11062f);
        sb.append(", uiOrientation=");
        return B4.i.j(sb, this.f11063g, "}");
    }
}
