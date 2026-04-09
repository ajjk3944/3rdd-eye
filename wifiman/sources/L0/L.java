package L0;

import Q0.AbstractC3434k;
import Q0.InterfaceC3433j;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    private final C3174d f11073a;

    /* renamed from: b, reason: collision with root package name */
    private final U f11074b;

    /* renamed from: c, reason: collision with root package name */
    private final List f11075c;

    /* renamed from: d, reason: collision with root package name */
    private final int f11076d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f11077e;

    /* renamed from: f, reason: collision with root package name */
    private final int f11078f;

    /* renamed from: g, reason: collision with root package name */
    private final Y0.d f11079g;

    /* renamed from: h, reason: collision with root package name */
    private final Y0.t f11080h;

    /* renamed from: i, reason: collision with root package name */
    private final AbstractC3434k.b f11081i;

    /* renamed from: j, reason: collision with root package name */
    private final long f11082j;

    /* renamed from: k, reason: collision with root package name */
    private InterfaceC3433j.a f11083k;

    public /* synthetic */ L(C3174d c3174d, U u10, List list, int i10, boolean z10, int i11, Y0.d dVar, Y0.t tVar, AbstractC3434k.b bVar, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(c3174d, u10, list, i10, z10, i11, dVar, tVar, bVar, j10);
    }

    public final long a() {
        return this.f11082j;
    }

    public final Y0.d b() {
        return this.f11079g;
    }

    public final AbstractC3434k.b c() {
        return this.f11081i;
    }

    public final Y0.t d() {
        return this.f11080h;
    }

    public final int e() {
        return this.f11076d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L)) {
            return false;
        }
        L l10 = (L) obj;
        return AbstractC6492s.d(this.f11073a, l10.f11073a) && AbstractC6492s.d(this.f11074b, l10.f11074b) && AbstractC6492s.d(this.f11075c, l10.f11075c) && this.f11076d == l10.f11076d && this.f11077e == l10.f11077e && W0.t.e(this.f11078f, l10.f11078f) && AbstractC6492s.d(this.f11079g, l10.f11079g) && this.f11080h == l10.f11080h && AbstractC6492s.d(this.f11081i, l10.f11081i) && Y0.b.f(this.f11082j, l10.f11082j);
    }

    public final int f() {
        return this.f11078f;
    }

    public final List g() {
        return this.f11075c;
    }

    public final boolean h() {
        return this.f11077e;
    }

    public int hashCode() {
        return (((((((((((((((((this.f11073a.hashCode() * 31) + this.f11074b.hashCode()) * 31) + this.f11075c.hashCode()) * 31) + this.f11076d) * 31) + Boolean.hashCode(this.f11077e)) * 31) + W0.t.f(this.f11078f)) * 31) + this.f11079g.hashCode()) * 31) + this.f11080h.hashCode()) * 31) + this.f11081i.hashCode()) * 31) + Y0.b.o(this.f11082j);
    }

    public final U i() {
        return this.f11074b;
    }

    public final C3174d j() {
        return this.f11073a;
    }

    public String toString() {
        return "TextLayoutInput(text=" + ((Object) this.f11073a) + ", style=" + this.f11074b + ", placeholders=" + this.f11075c + ", maxLines=" + this.f11076d + ", softWrap=" + this.f11077e + ", overflow=" + ((Object) W0.t.g(this.f11078f)) + ", density=" + this.f11079g + ", layoutDirection=" + this.f11080h + ", fontFamilyResolver=" + this.f11081i + ", constraints=" + ((Object) Y0.b.q(this.f11082j)) + ')';
    }

    private L(C3174d c3174d, U u10, List list, int i10, boolean z10, int i11, Y0.d dVar, Y0.t tVar, InterfaceC3433j.a aVar, AbstractC3434k.b bVar, long j10) {
        this.f11073a = c3174d;
        this.f11074b = u10;
        this.f11075c = list;
        this.f11076d = i10;
        this.f11077e = z10;
        this.f11078f = i11;
        this.f11079g = dVar;
        this.f11080h = tVar;
        this.f11081i = bVar;
        this.f11082j = j10;
        this.f11083k = aVar;
    }

    private L(C3174d c3174d, U u10, List list, int i10, boolean z10, int i11, Y0.d dVar, Y0.t tVar, AbstractC3434k.b bVar, long j10) {
        this(c3174d, u10, list, i10, z10, i11, dVar, tVar, (InterfaceC3433j.a) null, bVar, j10);
    }
}
