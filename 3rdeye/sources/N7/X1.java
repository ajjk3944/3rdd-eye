package N7;

import N7.U1;
import org.json.JSONObject;

/* compiled from: DivActionSubmitJsonParser.kt */
/* loaded from: classes.dex */
public final class X1 implements D7.j<JSONObject, C1117c2, U1> {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f7685a;

    public X1(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f7685a = component;
    }

    @Override // D7.j
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final U1 a(D7.f context, C1117c2 template, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        A7.b bVarC = l7.d.c(context, template.f7958a, data, "container_id", l7.k.f43898c);
        kotlin.jvm.internal.l.e(bVarC, "resolveExpression(contex…_id\", TYPE_HELPER_STRING)");
        Uc uc = this.f7685a;
        return new U1(bVarC, l7.d.q(context, template.f7959b, data, "on_fail_actions", uc.f6789j1, uc.f6766h1), l7.d.q(context, template.f7960c, data, "on_success_actions", uc.f6789j1, uc.f6766h1), (U1.a) l7.d.a(context, template.f7961d, data, com.vungle.ads.internal.ui.a.REQUEST_KEY_EXTRA, uc.f6618U0, uc.f6596S0));
    }
}
