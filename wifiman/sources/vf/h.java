package Vf;

import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.AbstractC6697d0;
import r.InterfaceC7533i;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: g, reason: collision with root package name */
    public static final int f23416g = 8;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC7533i f23417a;

    /* renamed from: b, reason: collision with root package name */
    private final int f23418b;

    /* renamed from: c, reason: collision with root package name */
    private final float f23419c;

    /* renamed from: d, reason: collision with root package name */
    private final List f23420d;

    /* renamed from: e, reason: collision with root package name */
    private final List f23421e;

    /* renamed from: f, reason: collision with root package name */
    private final float f23422f;

    public /* synthetic */ h(InterfaceC7533i interfaceC7533i, int i10, float f10, List list, List list2, float f11, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC7533i, i10, f10, list, list2, f11);
    }

    public static /* synthetic */ h b(h hVar, InterfaceC7533i interfaceC7533i, int i10, float f10, List list, List list2, float f11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            interfaceC7533i = hVar.f23417a;
        }
        if ((i11 & 2) != 0) {
            i10 = hVar.f23418b;
        }
        int i12 = i10;
        if ((i11 & 4) != 0) {
            f10 = hVar.f23419c;
        }
        float f12 = f10;
        if ((i11 & 8) != 0) {
            list = hVar.f23420d;
        }
        List list3 = list;
        if ((i11 & 16) != 0) {
            list2 = hVar.f23421e;
        }
        List list4 = list2;
        if ((i11 & 32) != 0) {
            f11 = hVar.f23422f;
        }
        return hVar.a(interfaceC7533i, i12, f12, list3, list4, f11);
    }

    public final h a(InterfaceC7533i animationSpec, int i10, float f10, List shaderColors, List list, float f11) {
        AbstractC6492s.i(animationSpec, "animationSpec");
        AbstractC6492s.i(shaderColors, "shaderColors");
        return new h(animationSpec, i10, f10, shaderColors, list, f11, null);
    }

    public final InterfaceC7533i c() {
        return this.f23417a;
    }

    public final int d() {
        return this.f23418b;
    }

    public final float e() {
        return this.f23419c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return AbstractC6492s.d(this.f23417a, hVar.f23417a) && AbstractC6697d0.E(this.f23418b, hVar.f23418b) && Float.compare(this.f23419c, hVar.f23419c) == 0 && AbstractC6492s.d(this.f23420d, hVar.f23420d) && AbstractC6492s.d(this.f23421e, hVar.f23421e) && Y0.h.n(this.f23422f, hVar.f23422f);
    }

    public final List f() {
        return this.f23421e;
    }

    public final List g() {
        return this.f23420d;
    }

    public final float h() {
        return this.f23422f;
    }

    public int hashCode() {
        int iHashCode = ((((((this.f23417a.hashCode() * 31) + AbstractC6697d0.F(this.f23418b)) * 31) + Float.hashCode(this.f23419c)) * 31) + this.f23420d.hashCode()) * 31;
        List list = this.f23421e;
        return ((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + Y0.h.p(this.f23422f);
    }

    public String toString() {
        return "ShimmerTheme(animationSpec=" + this.f23417a + ", blendMode=" + ((Object) AbstractC6697d0.G(this.f23418b)) + ", rotation=" + this.f23419c + ", shaderColors=" + this.f23420d + ", shaderColorStops=" + this.f23421e + ", shimmerWidth=" + ((Object) Y0.h.r(this.f23422f)) + ')';
    }

    private h(InterfaceC7533i animationSpec, int i10, float f10, List shaderColors, List list, float f11) {
        AbstractC6492s.i(animationSpec, "animationSpec");
        AbstractC6492s.i(shaderColors, "shaderColors");
        this.f23417a = animationSpec;
        this.f23418b = i10;
        this.f23419c = f10;
        this.f23420d = shaderColors;
        this.f23421e = list;
        this.f23422f = f11;
    }
}
