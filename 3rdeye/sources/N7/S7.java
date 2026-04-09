package N7;

import N7.P7;
import N7.U7;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import org.json.JSONObject;

/* compiled from: DivPatchJsonParser.kt */
/* loaded from: classes.dex */
public final class S7 implements D7.j<JSONObject, U7.a, P7.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f6206a;

    public S7(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f6206a = component;
    }

    @Override // D7.j
    public final Object a(D7.f context, Z6.b bVar, JSONObject data) {
        U7.a template = (U7.a) bVar;
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        Object objB = l7.d.b(template.f6399a, data, FacebookMediationAdapter.KEY_ID, l7.e.f43878b, l7.e.f43877a);
        kotlin.jvm.internal.l.e(objB, "resolve(context, template.id, data, \"id\")");
        Uc uc = this.f6206a;
        return new P7.a((String) objB, l7.d.q(context, template.f6400b, data, "items", uc.f6957y9, uc.f6935w9));
    }
}
