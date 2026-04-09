package N7;

import N7.AbstractC1142dc;
import N7.AbstractC1202hc;
import org.json.JSONObject;

/* compiled from: DivVariableJsonParser.kt */
/* renamed from: N7.gc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1187gc implements D7.j<JSONObject, AbstractC1202hc, AbstractC1142dc> {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f8307a;

    public C1187gc(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f8307a = component;
    }

    @Override // D7.j
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final AbstractC1142dc a(D7.f context, AbstractC1202hc template, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        boolean z10 = template instanceof AbstractC1202hc.g;
        Uc uc = this.f8307a;
        if (z10) {
            ((wd) uc.f6716ca.getValue()).getClass();
            return new AbstractC1142dc.g(wd.b(context, ((AbstractC1202hc.g) template).f8373a, data));
        }
        if (template instanceof AbstractC1202hc.f) {
            ((C1143dd) uc.f6583Q9.getValue()).getClass();
            return new AbstractC1142dc.f(C1143dd.b(context, ((AbstractC1202hc.f) template).f8372a, data));
        }
        if (template instanceof AbstractC1202hc.e) {
            ((Sc) uc.f6522K9.getValue()).getClass();
            return new AbstractC1142dc.e(Sc.b(context, ((AbstractC1202hc.e) template).f8371a, data));
        }
        if (template instanceof AbstractC1202hc.b) {
            ((C1343s) uc.f6808l.getValue()).getClass();
            return new AbstractC1142dc.b(C1343s.b(context, ((AbstractC1202hc.b) template).f8368a, data));
        }
        if (template instanceof AbstractC1202hc.c) {
            ((C) uc.f6872r.getValue()).getClass();
            return new AbstractC1142dc.c(C.b(context, ((AbstractC1202hc.c) template).f8369a, data));
        }
        if (template instanceof AbstractC1202hc.h) {
            ((Gd) uc.f6786ia.getValue()).getClass();
            return new AbstractC1142dc.h(Gd.b(context, ((AbstractC1202hc.h) template).f8374a, data));
        }
        if (template instanceof AbstractC1202hc.d) {
            ((X) uc.f6438D.getValue()).getClass();
            return new AbstractC1142dc.d(X.b(context, ((AbstractC1202hc.d) template).f8370a, data));
        }
        if (!(template instanceof AbstractC1202hc.a)) {
            throw new b9.j();
        }
        ((C1204i) uc.f6740f.getValue()).getClass();
        return new AbstractC1142dc.a(C1204i.b(context, ((AbstractC1202hc.a) template).f8367a, data));
    }
}
