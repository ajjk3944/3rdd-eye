package N7;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivPageSizeJsonParser.kt */
/* renamed from: N7.s7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1351s7 implements D7.h, D7.i {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f9185a;

    public C1351s7(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f9185a = component;
    }

    @Override // D7.b
    public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
        return B4.h.c(this, fVar, jSONObject);
    }

    @Override // D7.i
    public final /* bridge */ /* synthetic */ Z6.b c(D7.f fVar, Object obj) {
        return d(fVar, null, (JSONObject) obj);
    }

    public final C1379u7 d(D7.f fVar, C1379u7 c1379u7, JSONObject jSONObject) throws z7.d {
        return new C1379u7(l7.c.b(T1.B.w(fVar), jSONObject, "page_width", B4.g.p(fVar, "context", jSONObject, "data"), c1379u7 != null ? c1379u7.f9426a : null, this.f9185a.f6465F5));
    }

    @Override // D7.h
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, C1379u7 value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        l7.c.u(context, jSONObject, "page_width", value.f9426a, this.f9185a.f6465F5);
        k8.F.y(context, jSONObject, "type", "percentage");
        return jSONObject;
    }
}
