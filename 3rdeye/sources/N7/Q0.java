package N7;

import com.applovin.sdk.AppLovinEventTypes;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivActionCopyToClipboardJsonParser.kt */
/* loaded from: classes.dex */
public final class Q0 implements D7.h, D7.i {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f6033a;

    public Q0(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f6033a = component;
    }

    @Override // D7.b
    public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
        return B4.h.c(this, fVar, jSONObject);
    }

    @Override // D7.i
    public final /* bridge */ /* synthetic */ Z6.b c(D7.f fVar, Object obj) {
        return d(fVar, null, (JSONObject) obj);
    }

    public final S0 d(D7.f fVar, S0 s02, JSONObject jSONObject) throws z7.d {
        return new S0(l7.c.b(T1.B.w(fVar), jSONObject, AppLovinEventTypes.USER_VIEWED_CONTENT, B4.g.p(fVar, "context", jSONObject, "data"), s02 != null ? s02.f6179a : null, this.f6033a.f6718d0));
    }

    @Override // D7.h
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, S0 value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        l7.c.u(context, jSONObject, AppLovinEventTypes.USER_VIEWED_CONTENT, value.f6179a, this.f6033a.f6718d0);
        k8.F.y(context, jSONObject, "type", "copy_to_clipboard");
        return jSONObject;
    }
}
