package N7;

import com.google.android.gms.common.internal.ImagesContract;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivActionDownloadJsonParser.kt */
/* loaded from: classes.dex */
public final class Z0 implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f7830a;

    public Z0(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f7830a = component;
    }

    @Override // D7.b
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Y0 a(D7.f context, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(data, "data");
        Uc uc = this.f7830a;
        return new Y0(k8.F.s(context, data, "on_fail_actions", uc.f6766h1), k8.F.s(context, data, "on_success_actions", uc.f6766h1), l7.b.a(context, data, ImagesContract.URL, l7.k.f43900e, l7.h.f43883d, l7.e.f43877a));
    }

    @Override // D7.h
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, Y0 value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        Uc uc = this.f7830a;
        k8.F.B(context, jSONObject, "on_fail_actions", value.f7759a, uc.f6766h1);
        k8.F.B(context, jSONObject, "on_success_actions", value.f7760b, uc.f6766h1);
        k8.F.y(context, jSONObject, "type", com.vungle.ads.internal.presenter.h.DOWNLOAD);
        l7.b.e(context, jSONObject, ImagesContract.URL, value.f7761c, l7.h.f43882c);
        return jSONObject;
    }
}
