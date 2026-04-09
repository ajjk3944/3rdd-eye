package N7;

import N7.C1169f9;
import N7.C1225j6;
import N7.C1231jc;
import N7.C1270m9;
import N7.C1335r5;
import N7.C1377u5;
import N7.C1419x5;
import N7.C1445z3;
import N7.C1452za;
import N7.D5;
import N7.Fa;
import N7.I7;
import N7.Ja;
import N7.M5;
import N7.M9;
import N7.S3;
import N7.Wa;
import N7.Y9;
import N7.Z;
import org.json.JSONObject;

/* compiled from: DivJsonParser.kt */
/* loaded from: classes.dex */
public final class K6 implements D7.j<JSONObject, Ja, Z> {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f5619a;

    public K6(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f5619a = component;
    }

    @Override // D7.j
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Z a(D7.f context, Ja template, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        boolean z10 = template instanceof Ja.f;
        Uc uc = this.f5619a;
        if (z10) {
            return new Z.f(((D5.j) uc.f6642W3.getValue()).a(context, ((Ja.f) template).f5595a, data));
        }
        if (template instanceof Ja.d) {
            return new Z.d(((C1377u5.i) uc.f6546N3.getValue()).a(context, ((Ja.d) template).f5593a, data));
        }
        if (template instanceof Ja.p) {
            return new Z.p(((Wa.m) uc.f6870q8.getValue()).a(context, ((Ja.p) template).f5605a, data));
        }
        if (template instanceof Ja.k) {
            return new Z.k(((C1270m9.f) uc.f6466F6.getValue()).a(context, ((Ja.k) template).f5600a, data));
        }
        if (template instanceof Ja.a) {
            return new Z.a(((C1445z3.j) uc.f6811l2.getValue()).a(context, ((Ja.a) template).f5590a, data));
        }
        if (template instanceof Ja.e) {
            return new Z.e(((C1419x5.h) uc.f6578Q3.getValue()).a(context, ((Ja.e) template).f5594a, data));
        }
        if (template instanceof Ja.c) {
            return new Z.c(((C1335r5.j) uc.f6516K3.getValue()).a(context, ((Ja.c) template).f5592a, data));
        }
        if (template instanceof Ja.i) {
            return new Z.i(((I7.i) uc.f6953y5.getValue()).a(context, ((Ja.i) template).f5598a, data));
        }
        if (template instanceof Ja.o) {
            return new Z.o(((Fa.f) uc.f6520K7.getValue()).a(context, ((Ja.o) template).f5604a, data));
        }
        if (template instanceof Ja.m) {
            return new Z.m(((Y9.g) uc.f6826m7.getValue()).a(context, ((Ja.m) template).f5602a, data));
        }
        if (template instanceof Ja.b) {
            return new Z.b(((S3.f) uc.f6408A2.getValue()).a(context, ((Ja.b) template).f5591a, data));
        }
        if (template instanceof Ja.g) {
            return new Z.g(((M5.g) uc.f6710c4.getValue()).a(context, ((Ja.g) template).f5596a, data));
        }
        if (template instanceof Ja.l) {
            return new Z.l(((M9.f) uc.f6689a7.getValue()).a(context, ((Ja.l) template).f5601a, data));
        }
        if (template instanceof Ja.n) {
            return new Z.n(((C1452za.f) uc.f6487H7.getValue()).a(context, ((Ja.n) template).f5603a, data));
        }
        if (template instanceof Ja.h) {
            return new Z.h(((C1225j6.m) uc.f6464F4.getValue()).a(context, ((Ja.h) template).f5597a, data));
        }
        if (template instanceof Ja.j) {
            return new Z.j(((C1169f9.h) uc.f6965z6.getValue()).a(context, ((Ja.j) template).f5599a, data));
        }
        if (template instanceof Ja.q) {
            return new Z.q(((C1231jc.g) uc.f6828m9.getValue()).a(context, ((Ja.q) template).f5606a, data));
        }
        throw new b9.j();
    }
}
