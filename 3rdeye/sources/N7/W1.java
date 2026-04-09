package N7;

import java.util.List;
import n7.AbstractC5371a;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivActionSubmitJsonParser.kt */
/* loaded from: classes.dex */
public final class W1 implements D7.h, D7.i {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f7608a;

    public W1(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f7608a = component;
    }

    @Override // D7.b
    public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
        return B4.h.c(this, fVar, jSONObject);
    }

    @Override // D7.i
    public final /* bridge */ /* synthetic */ Z6.b c(D7.f fVar, Object obj) {
        return d(fVar, null, (JSONObject) obj);
    }

    public final C1117c2 d(D7.f fVar, C1117c2 c1117c2, JSONObject jSONObject) throws z7.d {
        boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
        D7.f fVarW = T1.B.w(fVar);
        AbstractC5371a abstractC5371aD = l7.c.d(fVarW, jSONObject, "container_id", l7.k.f43898c, zP, c1117c2 != null ? c1117c2.f7958a : null);
        AbstractC5371a<List<C1132d2>> abstractC5371a = c1117c2 != null ? c1117c2.f7959b : null;
        Uc uc = this.f7608a;
        return new C1117c2(abstractC5371aD, l7.c.k(fVarW, jSONObject, "on_fail_actions", zP, abstractC5371a, uc.f6777i1), l7.c.k(fVarW, jSONObject, "on_success_actions", zP, c1117c2 != null ? c1117c2.f7960c : null, uc.f6777i1), l7.c.b(fVarW, jSONObject, com.vungle.ads.internal.ui.a.REQUEST_KEY_EXTRA, zP, c1117c2 != null ? c1117c2.f7961d : null, uc.f6607T0));
    }

    @Override // D7.h
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, C1117c2 value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        l7.c.q(context, jSONObject, "container_id", value.f7958a);
        Uc uc = this.f7608a;
        l7.c.v(context, jSONObject, "on_fail_actions", value.f7959b, uc.f6777i1);
        l7.c.v(context, jSONObject, "on_success_actions", value.f7960c, uc.f6777i1);
        l7.c.u(context, jSONObject, com.vungle.ads.internal.ui.a.REQUEST_KEY_EXTRA, value.f7961d, uc.f6607T0);
        k8.F.y(context, jSONObject, "type", "submit");
        return jSONObject;
    }
}
