package N7;

import N7.Ba;
import N7.Ia;
import com.github.appintro.AppIntroBaseFragmentKt;
import org.json.JSONObject;

/* compiled from: DivTabsJsonParser.kt */
/* loaded from: classes.dex */
public final class Ea implements D7.j<JSONObject, Ia.a, Ba.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f5155a;

    public Ea(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f5155a = component;
    }

    @Override // D7.j
    public final Object a(D7.f context, Z6.b bVar, JSONObject data) {
        Ia.a template = (Ia.a) bVar;
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        Uc uc = this.f5155a;
        Z z10 = (Z) l7.d.a(context, template.f5531a, data, "div", uc.f6957y9, uc.f6935w9);
        A7.b bVarC = l7.d.c(context, template.f5532b, data, AppIntroBaseFragmentKt.ARG_TITLE, l7.k.f43898c);
        kotlin.jvm.internal.l.e(bVarC, "resolveExpression(contex…tle\", TYPE_HELPER_STRING)");
        return new Ba.a(z10, bVarC, (C1175g0) l7.d.h(context, template.f5533c, data, "title_click_action", uc.f6789j1, uc.f6766h1));
    }
}
