package N7;

import N7.C1383ub;
import N7.Ka;
import java.util.List;
import org.json.JSONObject;

/* compiled from: DivTextJsonParser.kt */
/* loaded from: classes.dex */
public final class Oa implements D7.j<JSONObject, C1383ub.a, Ka.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f5995a;

    public Oa(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f5995a = component;
    }

    @Override // D7.j
    public final Object a(D7.f context, Z6.b bVar, JSONObject data) {
        C1383ub.a template = (C1383ub.a) bVar;
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        Uc uc = this.f5995a;
        List listQ = l7.d.q(context, template.f9498a, data, "actions", uc.f6789j1, uc.f6766h1);
        List listQ2 = l7.d.q(context, template.f9499b, data, "images", uc.f6934w8, uc.u8);
        List listQ3 = l7.d.q(context, template.f9500c, data, "ranges", uc.f6902t8, uc.f6881r8);
        A7.b bVarC = l7.d.c(context, template.f9501d, data, "text", l7.k.f43898c);
        kotlin.jvm.internal.l.e(bVarC, "resolveExpression(contex…ext\", TYPE_HELPER_STRING)");
        return new Ka.a(bVarC, listQ, listQ2, listQ3);
    }
}
