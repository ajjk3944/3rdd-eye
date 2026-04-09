package N7;

import N7.U3;
import N7.Z3;
import org.json.JSONObject;

/* compiled from: DivDataJsonParser.kt */
/* loaded from: classes.dex */
public final class Y3 implements D7.j<JSONObject, Z3.a, U3.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f7768a;

    public Y3(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f7768a = component;
    }

    @Override // D7.j
    public final Object a(D7.f context, Z6.b bVar, JSONObject data) {
        Z3.a template = (Z3.a) bVar;
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        Uc uc = this.f7768a;
        Z z10 = (Z) l7.d.a(context, template.f7843a, data, "div", uc.f6957y9, uc.f6935w9);
        Object objB = l7.d.b(template.f7844b, data, "state_id", l7.h.f43886g, l7.e.f43877a);
        kotlin.jvm.internal.l.e(objB, "resolve(context, templat…state_id\", NUMBER_TO_INT)");
        return new U3.a(z10, ((Number) objB).longValue());
    }
}
