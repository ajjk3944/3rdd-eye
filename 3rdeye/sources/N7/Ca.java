package N7;

import N7.Ba;
import com.github.appintro.AppIntroBaseFragmentKt;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivTabsJsonParser.kt */
/* loaded from: classes.dex */
public final class Ca implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f5046a;

    public Ca(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f5046a = component;
    }

    @Override // D7.b
    public final Object a(D7.f context, JSONObject data) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(data, "data");
        Uc uc = this.f5046a;
        return new Ba.a((Z) k8.F.l(context, data, "div", uc.f6935w9), l7.b.a(context, data, AppIntroBaseFragmentKt.ARG_TITLE, l7.k.f43898c, l7.e.f43878b, l7.e.f43877a), (C1175g0) k8.F.q(context, data, "title_click_action", uc.f6766h1));
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, Ba.a value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        Uc uc = this.f5046a;
        k8.F.z(context, jSONObject, "div", value.f4959a, uc.f6935w9);
        l7.b.d(context, jSONObject, AppIntroBaseFragmentKt.ARG_TITLE, value.f4960b);
        k8.F.z(context, jSONObject, "title_click_action", value.f4961c, uc.f6766h1);
        return jSONObject;
    }
}
