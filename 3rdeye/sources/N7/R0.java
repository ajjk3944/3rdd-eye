package N7;

import com.applovin.sdk.AppLovinEventTypes;
import org.json.JSONObject;

/* compiled from: DivActionCopyToClipboardJsonParser.kt */
/* loaded from: classes.dex */
public final class R0 implements D7.j<JSONObject, S0, J0> {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f6107a;

    public R0(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f6107a = component;
    }

    @Override // D7.j
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final J0 a(D7.f context, S0 template, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        Uc uc = this.f6107a;
        return new J0((K0) l7.d.a(context, template.f6179a, data, AppLovinEventTypes.USER_VIEWED_CONTENT, uc.f6730e0, uc.f6706c0));
    }
}
