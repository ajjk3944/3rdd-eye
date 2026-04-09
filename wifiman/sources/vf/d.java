package Vf;

import Yg.J;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.AbstractC6532h;
import l0.AbstractC6538n;
import l0.C6531g;
import l0.C6533i;
import m0.AbstractC6682S;
import m0.AbstractC6697d0;
import m0.InterfaceC6717n0;
import m0.O0;
import m0.S0;
import m0.T0;
import m0.f1;
import o0.InterfaceC7036c;
import r.AbstractC7519b;
import r.C7517a;
import r.InterfaceC7533i;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC7533i f23402a;

    /* renamed from: b, reason: collision with root package name */
    private final int f23403b;

    /* renamed from: c, reason: collision with root package name */
    private final float f23404c;

    /* renamed from: d, reason: collision with root package name */
    private final List f23405d;

    /* renamed from: e, reason: collision with root package name */
    private final List f23406e;

    /* renamed from: f, reason: collision with root package name */
    private final float f23407f;

    /* renamed from: g, reason: collision with root package name */
    private final C7517a f23408g;

    /* renamed from: h, reason: collision with root package name */
    private final float[] f23409h;

    /* renamed from: i, reason: collision with root package name */
    private final long f23410i;

    /* renamed from: j, reason: collision with root package name */
    private final long f23411j;

    /* renamed from: k, reason: collision with root package name */
    private final S0 f23412k;

    /* renamed from: l, reason: collision with root package name */
    private final S0 f23413l;

    public /* synthetic */ d(InterfaceC7533i interfaceC7533i, int i10, float f10, List list, List list2, float f11, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC7533i, i10, f10, list, list2, f11);
    }

    public final void a(InterfaceC7036c interfaceC7036c, c shimmerArea) {
        AbstractC6492s.i(interfaceC7036c, "<this>");
        AbstractC6492s.i(shimmerArea, "shimmerArea");
        if (shimmerArea.d().u() || shimmerArea.f().u()) {
            return;
        }
        float fE = ((-shimmerArea.e()) / 2) + (shimmerArea.e() * ((Number) this.f23408g.m()).floatValue()) + C6531g.m(shimmerArea.c());
        float[] fArr = this.f23409h;
        O0.h(fArr);
        O0.p(fArr, C6531g.m(shimmerArea.c()), C6531g.n(shimmerArea.c()), 0.0f);
        O0.k(fArr, this.f23404c);
        O0.p(fArr, -C6531g.m(shimmerArea.c()), -C6531g.n(shimmerArea.c()), 0.0f);
        O0.p(fArr, fE, 0.0f, 0.0f);
        this.f23412k.y(f1.b(O0.f(this.f23409h, this.f23410i), O0.f(this.f23409h, this.f23411j), this.f23405d, this.f23406e, 0, 16, null));
        C6533i c6533iC = AbstractC6538n.c(interfaceC7036c.c());
        InterfaceC6717n0 interfaceC6717n0D = interfaceC7036c.k1().d();
        try {
            interfaceC6717n0D.l(c6533iC, this.f23413l);
            interfaceC7036c.X1();
            interfaceC6717n0D.v(c6533iC, this.f23412k);
        } finally {
            interfaceC6717n0D.r();
        }
    }

    public final Object b(InterfaceC5380e interfaceC5380e) {
        Object objF = C7517a.f(this.f23408g, kotlin.coroutines.jvm.internal.b.c(1.0f), this.f23402a, null, null, interfaceC5380e, 12, null);
        return objF == AbstractC5467b.g() ? objF : J.f24997a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (AbstractC6492s.d(this.f23402a, dVar.f23402a) && AbstractC6697d0.E(this.f23403b, dVar.f23403b) && this.f23404c == dVar.f23404c && AbstractC6492s.d(this.f23405d, dVar.f23405d) && AbstractC6492s.d(this.f23406e, dVar.f23406e) && this.f23407f == dVar.f23407f) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = ((((((this.f23402a.hashCode() * 31) + AbstractC6697d0.F(this.f23403b)) * 31) + Float.hashCode(this.f23404c)) * 31) + this.f23405d.hashCode()) * 31;
        List list = this.f23406e;
        return ((iHashCode + (list != null ? list.hashCode() : 0)) * 31) + Float.hashCode(this.f23407f);
    }

    private d(InterfaceC7533i animationSpec, int i10, float f10, List shaderColors, List list, float f11) {
        AbstractC6492s.i(animationSpec, "animationSpec");
        AbstractC6492s.i(shaderColors, "shaderColors");
        this.f23402a = animationSpec;
        this.f23403b = i10;
        this.f23404c = f10;
        this.f23405d = shaderColors;
        this.f23406e = list;
        this.f23407f = f11;
        this.f23408g = AbstractC7519b.b(0.0f, 0.0f, 2, null);
        this.f23409h = O0.c(null, 1, null);
        long jA = AbstractC6532h.a((-f11) / 2, 0.0f);
        this.f23410i = jA;
        this.f23411j = C6531g.u(jA);
        S0 s0A = AbstractC6682S.a();
        s0A.t(true);
        s0A.H(T0.f52853a.a());
        s0A.v(i10);
        this.f23412k = s0A;
        this.f23413l = AbstractC6682S.a();
    }
}
