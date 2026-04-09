package N7;

import com.applovin.sdk.AppLovinEventTypes;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivActionCopyToClipboardJsonParser.kt */
/* loaded from: classes.dex */
public final class P0 implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f5999a;

    public P0(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f5999a = component;
    }

    @Override // D7.b
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final J0 a(D7.f context, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(data, "data");
        return new J0((K0) k8.F.l(context, data, AppLovinEventTypes.USER_VIEWED_CONTENT, this.f5999a.f6706c0));
    }

    @Override // D7.h
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, J0 value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        k8.F.z(context, jSONObject, AppLovinEventTypes.USER_VIEWED_CONTENT, value.f5559a, this.f5999a.f6706c0);
        k8.F.y(context, jSONObject, "type", "copy_to_clipboard");
        return jSONObject;
    }
}
