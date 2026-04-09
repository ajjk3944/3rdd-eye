package N7;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivNeighbourPageSizeJsonParser.kt */
/* renamed from: N7.a7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1092a7 implements D7.h, D7.i {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f7898a;

    public C1092a7(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f7898a = component;
    }

    @Override // D7.b
    public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
        return B4.h.c(this, fVar, jSONObject);
    }

    @Override // D7.i
    public final /* bridge */ /* synthetic */ Z6.b c(D7.f fVar, Object obj) {
        return d(fVar, null, (JSONObject) obj);
    }

    public final C1122c7 d(D7.f fVar, C1122c7 c1122c7, JSONObject jSONObject) throws z7.d {
        return new C1122c7(l7.c.b(T1.B.w(fVar), jSONObject, "neighbour_page_width", B4.g.p(fVar, "context", jSONObject, "data"), c1122c7 != null ? c1122c7.f7973a : null, this.f7898a.f6908u3));
    }

    @Override // D7.h
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, C1122c7 value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        l7.c.u(context, jSONObject, "neighbour_page_width", value.f7973a, this.f7898a.f6908u3);
        k8.F.y(context, jSONObject, "type", "fixed");
        return jSONObject;
    }
}
