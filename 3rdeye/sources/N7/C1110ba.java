package N7;

import N7.C1125ca;
import N7.X9;
import n7.AbstractC5371a;
import org.json.JSONObject;

/* compiled from: DivStateJsonParser.kt */
/* renamed from: N7.ba, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1110ba implements D7.j<JSONObject, C1125ca.a, X9.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f7947a;

    public C1110ba(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f7947a = component;
    }

    @Override // D7.j
    public final Object a(D7.f context, Z6.b bVar, JSONObject data) {
        C1125ca.a template = (C1125ca.a) bVar;
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        Uc uc = this.f7947a;
        b9.p pVar = uc.f6852p1;
        AbstractC5371a<C1388v2> abstractC5371a = template.f8018a;
        b9.p pVar2 = uc.f6831n1;
        C1332r2 c1332r2 = (C1332r2) l7.d.h(context, abstractC5371a, data, "animation_in", pVar, pVar2);
        C1332r2 c1332r22 = (C1332r2) l7.d.h(context, template.f8019b, data, "animation_out", uc.f6852p1, pVar2);
        Z z10 = (Z) l7.d.h(context, template.f8020c, data, "div", uc.f6957y9, uc.f6935w9);
        Object objB = l7.d.b(template.f8021d, data, "state_id", l7.e.f43878b, l7.e.f43877a);
        kotlin.jvm.internal.l.e(objB, "resolve(context, templat…tateId, data, \"state_id\")");
        return new X9.a(c1332r2, c1332r22, z10, (String) objB, l7.d.q(context, template.f8022e, data, "swipe_out_actions", uc.f6789j1, uc.f6766h1));
    }
}
