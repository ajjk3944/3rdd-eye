package Te;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class E0 {

    /* renamed from: a, reason: collision with root package name */
    private final N f21621a;

    /* renamed from: b, reason: collision with root package name */
    private final S8.c f21622b;

    /* renamed from: c, reason: collision with root package name */
    private final De.g f21623c;

    /* renamed from: d, reason: collision with root package name */
    private final S8.l f21624d;

    public E0(N color, S8.c band, De.g gVar, S8.l lVar) {
        AbstractC6492s.i(color, "color");
        AbstractC6492s.i(band, "band");
        this.f21621a = color;
        this.f21622b = band;
        this.f21623c = gVar;
        this.f21624d = lVar;
    }

    public final De.g a() {
        return this.f21623c;
    }

    public final S8.c b() {
        return this.f21622b;
    }

    public final N c() {
        return this.f21621a;
    }

    public final S8.l d() {
        return this.f21624d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E0)) {
            return false;
        }
        E0 e02 = (E0) obj;
        return this.f21621a == e02.f21621a && this.f21622b == e02.f21622b && AbstractC6492s.d(this.f21623c, e02.f21623c) && AbstractC6492s.d(this.f21624d, e02.f21624d);
    }

    public int hashCode() {
        int iHashCode = ((this.f21621a.hashCode() * 31) + this.f21622b.hashCode()) * 31;
        De.g gVar = this.f21623c;
        int iHashCode2 = (iHashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
        S8.l lVar = this.f21624d;
        return iHashCode2 + (lVar != null ? lVar.hashCode() : 0);
    }

    public String toString() {
        return "Link(color=" + this.f21621a + ", band=" + this.f21622b + ", badge=" + this.f21623c + ", signal=" + this.f21624d + ")";
    }
}
