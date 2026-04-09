package Oh;

import Bh.l0;
import Zg.d0;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pi.AbstractC7346d0;
import pi.G;
import pi.I0;

/* loaded from: classes4.dex */
public final class a extends G {

    /* renamed from: d, reason: collision with root package name */
    private final I0 f17834d;

    /* renamed from: e, reason: collision with root package name */
    private final c f17835e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f17836f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f17837g;

    /* renamed from: h, reason: collision with root package name */
    private final Set f17838h;

    /* renamed from: i, reason: collision with root package name */
    private final AbstractC7346d0 f17839i;

    public /* synthetic */ a(I0 i02, c cVar, boolean z10, boolean z11, Set set, AbstractC7346d0 abstractC7346d0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i02, (i10 & 2) != 0 ? c.INFLEXIBLE : cVar, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? false : z11, (i10 & 16) != 0 ? null : set, (i10 & 32) != 0 ? null : abstractC7346d0);
    }

    public static /* synthetic */ a f(a aVar, I0 i02, c cVar, boolean z10, boolean z11, Set set, AbstractC7346d0 abstractC7346d0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i02 = aVar.f17834d;
        }
        if ((i10 & 2) != 0) {
            cVar = aVar.f17835e;
        }
        c cVar2 = cVar;
        if ((i10 & 4) != 0) {
            z10 = aVar.f17836f;
        }
        boolean z12 = z10;
        if ((i10 & 8) != 0) {
            z11 = aVar.f17837g;
        }
        boolean z13 = z11;
        if ((i10 & 16) != 0) {
            set = aVar.f17838h;
        }
        Set set2 = set;
        if ((i10 & 32) != 0) {
            abstractC7346d0 = aVar.f17839i;
        }
        return aVar.e(i02, cVar2, z12, z13, set2, abstractC7346d0);
    }

    @Override // pi.G
    public AbstractC7346d0 a() {
        return this.f17839i;
    }

    @Override // pi.G
    public I0 b() {
        return this.f17834d;
    }

    @Override // pi.G
    public Set c() {
        return this.f17838h;
    }

    public final a e(I0 howThisTypeIsUsed, c flexibility, boolean z10, boolean z11, Set set, AbstractC7346d0 abstractC7346d0) {
        AbstractC6492s.i(howThisTypeIsUsed, "howThisTypeIsUsed");
        AbstractC6492s.i(flexibility, "flexibility");
        return new a(howThisTypeIsUsed, flexibility, z10, z11, set, abstractC7346d0);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return AbstractC6492s.d(aVar.a(), a()) && aVar.b() == b() && aVar.f17835e == this.f17835e && aVar.f17836f == this.f17836f && aVar.f17837g == this.f17837g;
    }

    public final c g() {
        return this.f17835e;
    }

    public final boolean h() {
        return this.f17837g;
    }

    @Override // pi.G
    public int hashCode() {
        AbstractC7346d0 abstractC7346d0A = a();
        int iHashCode = abstractC7346d0A != null ? abstractC7346d0A.hashCode() : 0;
        int iHashCode2 = iHashCode + (iHashCode * 31) + b().hashCode();
        int iHashCode3 = iHashCode2 + (iHashCode2 * 31) + this.f17835e.hashCode();
        int i10 = iHashCode3 + (iHashCode3 * 31) + (this.f17836f ? 1 : 0);
        return i10 + (i10 * 31) + (this.f17837g ? 1 : 0);
    }

    public final boolean i() {
        return this.f17836f;
    }

    public final a j(boolean z10) {
        return f(this, null, null, z10, false, null, null, 59, null);
    }

    public a k(AbstractC7346d0 abstractC7346d0) {
        return f(this, null, null, false, false, null, abstractC7346d0, 31, null);
    }

    public final a l(c flexibility) {
        AbstractC6492s.i(flexibility, "flexibility");
        return f(this, null, flexibility, false, false, null, null, 61, null);
    }

    @Override // pi.G
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public a d(l0 typeParameter) {
        AbstractC6492s.i(typeParameter, "typeParameter");
        return f(this, null, null, false, false, c() != null ? d0.m(c(), typeParameter) : d0.c(typeParameter), null, 47, null);
    }

    public String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + this.f17834d + ", flexibility=" + this.f17835e + ", isRaw=" + this.f17836f + ", isForAnnotationParameter=" + this.f17837g + ", visitedTypeParameters=" + this.f17838h + ", defaultType=" + this.f17839i + ')';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(I0 howThisTypeIsUsed, c flexibility, boolean z10, boolean z11, Set set, AbstractC7346d0 abstractC7346d0) {
        super(howThisTypeIsUsed, set, abstractC7346d0);
        AbstractC6492s.i(howThisTypeIsUsed, "howThisTypeIsUsed");
        AbstractC6492s.i(flexibility, "flexibility");
        this.f17834d = howThisTypeIsUsed;
        this.f17835e = flexibility;
        this.f17836f = z10;
        this.f17837g = z11;
        this.f17838h = set;
        this.f17839i = abstractC7346d0;
    }
}
