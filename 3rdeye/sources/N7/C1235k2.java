package N7;

import N7.A1;
import N7.AbstractC1192h2;
import N7.AbstractC1249l2;
import N7.C1162f2;
import N7.C1205i0;
import N7.C1277n2;
import N7.C1345s1;
import N7.D1;
import org.json.JSONObject;

/* compiled from: DivActionTypedJsonParser.kt */
/* renamed from: N7.k2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1235k2 implements D7.j<JSONObject, AbstractC1249l2, AbstractC1192h2> {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f8627a;

    public C1235k2(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f8627a = component;
    }

    @Override // D7.j
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final AbstractC1192h2 a(D7.f context, AbstractC1249l2 template, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        boolean z10 = template instanceof AbstractC1249l2.a;
        Uc uc = this.f8627a;
        if (z10) {
            return new AbstractC1192h2.a(((C1205i0.e) uc.f6532M.getValue()).a(context, ((AbstractC1249l2.a) template).f8706a, data));
        }
        if (template instanceof AbstractC1249l2.b) {
            ((C1275n0) uc.f6563P.getValue()).getClass();
            return new AbstractC1192h2.b(C1275n0.b(context, ((AbstractC1249l2.b) template).f8707a, data));
        }
        if (template instanceof AbstractC1249l2.c) {
            return new AbstractC1192h2.c(((C1344s0) uc.f6595S.getValue()).a(context, ((AbstractC1249l2.c) template).f8708a, data));
        }
        if (template instanceof AbstractC1249l2.d) {
            ((C1414x0) uc.f6627V.getValue()).getClass();
            return new AbstractC1192h2.d(C1414x0.b(context, ((AbstractC1249l2.d) template).f8709a, data));
        }
        if (template instanceof AbstractC1249l2.e) {
            return new AbstractC1192h2.e(((C0) uc.f6659Y.getValue()).a(context, ((AbstractC1249l2.e) template).f8710a, data));
        }
        if (template instanceof AbstractC1249l2.f) {
            ((H0) uc.f6694b0.getValue()).getClass();
            kotlin.jvm.internal.l.f(((AbstractC1249l2.f) template).f8711a, "template");
            return new AbstractC1192h2.f(new E0());
        }
        if (template instanceof AbstractC1249l2.g) {
            return new AbstractC1192h2.g(((R0) uc.f6765h0.getValue()).a(context, ((AbstractC1249l2.g) template).f8712a, data));
        }
        if (template instanceof AbstractC1249l2.h) {
            return new AbstractC1192h2.h(((W0) uc.f6798k0.getValue()).a(context, ((AbstractC1249l2.h) template).f8713a, data));
        }
        if (template instanceof AbstractC1249l2.i) {
            return new AbstractC1192h2.i(((C1101b1) uc.f6830n0.getValue()).a(context, ((AbstractC1249l2.i) template).f8714a, data));
        }
        if (template instanceof AbstractC1249l2.j) {
            ((C1176g1) uc.f6862q0.getValue()).getClass();
            return new AbstractC1192h2.j(C1176g1.b(context, ((AbstractC1249l2.j) template).f8715a, data));
        }
        if (template instanceof AbstractC1249l2.k) {
            ((C1248l1) uc.f6894t0.getValue()).getClass();
            return new AbstractC1192h2.k(C1248l1.b(context, ((AbstractC1249l2.k) template).f8716a, data));
        }
        if (template instanceof AbstractC1249l2.l) {
            ((C1345s1.d) uc.f6926w0.getValue()).getClass();
            return new AbstractC1192h2.l(C1345s1.d.b(context, ((AbstractC1249l2.l) template).f8717a, data));
        }
        if (template instanceof AbstractC1249l2.m) {
            return new AbstractC1192h2.m(((A1.c) uc.f6428C0.getValue()).a(context, ((AbstractC1249l2.m) template).f8718a, data));
        }
        if (template instanceof AbstractC1249l2.n) {
            ((D1.c) uc.F0.getValue()).getClass();
            return new AbstractC1192h2.n(D1.c.b(context, ((AbstractC1249l2.n) template).f8719a, data));
        }
        if (template instanceof AbstractC1249l2.o) {
            return new AbstractC1192h2.o(((I1) uc.f6491I0.getValue()).a(context, ((AbstractC1249l2.o) template).f8720a, data));
        }
        if (template instanceof AbstractC1249l2.p) {
            return new AbstractC1192h2.p(((N1) uc.f6524L0.getValue()).a(context, ((AbstractC1249l2.p) template).f8721a, data));
        }
        if (template instanceof AbstractC1249l2.q) {
            ((S1) uc.f6553O0.getValue()).getClass();
            return new AbstractC1192h2.q(S1.b(context, ((AbstractC1249l2.q) template).f8722a, data));
        }
        if (template instanceof AbstractC1249l2.r) {
            return new AbstractC1192h2.r(((X1) uc.f6585R0.getValue()).a(context, ((AbstractC1249l2.r) template).f8723a, data));
        }
        if (template instanceof AbstractC1249l2.s) {
            ((C1162f2.d) uc.f6683a1.getValue()).getClass();
            return new AbstractC1192h2.s(C1162f2.d.b(context, ((AbstractC1249l2.s) template).f8724a, data));
        }
        if (!(template instanceof AbstractC1249l2.t)) {
            throw new b9.j();
        }
        ((C1277n2.d) uc.f6754g1.getValue()).getClass();
        return new AbstractC1192h2.t(C1277n2.d.b(context, ((AbstractC1249l2.t) template).f8725a, data));
    }
}
