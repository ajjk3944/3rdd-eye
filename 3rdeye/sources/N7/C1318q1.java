package N7;

import N7.C1132d2;
import N7.C1175g0;
import java.util.List;
import n7.AbstractC5371a;
import org.json.JSONObject;

/* compiled from: DivActionJsonParser.kt */
/* renamed from: N7.q1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1318q1 implements D7.j<JSONObject, C1132d2.a, C1175g0.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f8920a;

    public C1318q1(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f8920a = component;
    }

    @Override // D7.j
    public final Object a(D7.f context, Z6.b bVar, JSONObject data) {
        C1132d2.a template = (C1132d2.a) bVar;
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        Uc uc = this.f8920a;
        b9.p pVar = uc.f6789j1;
        AbstractC5371a<C1132d2> abstractC5371a = template.f8060a;
        b9.p pVar2 = uc.f6766h1;
        C1175g0 c1175g0 = (C1175g0) l7.d.h(context, abstractC5371a, data, "action", pVar, pVar2);
        List listQ = l7.d.q(context, template.f8061b, data, "actions", uc.f6789j1, pVar2);
        A7.b bVarC = l7.d.c(context, template.f8062c, data, "text", l7.k.f43898c);
        kotlin.jvm.internal.l.e(bVarC, "resolveExpression(contex…ext\", TYPE_HELPER_STRING)");
        return new C1175g0.a(c1175g0, listQ, bVarC);
    }
}
