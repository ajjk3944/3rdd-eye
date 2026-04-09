package N7;

import N7.Z4;
import java.util.List;
import n7.AbstractC5371a;
import org.json.JSONObject;

/* compiled from: DivFocusJsonParser.kt */
/* renamed from: N7.c5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1120c5 implements D7.j<JSONObject, C1180g5, Z4> {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f7971a;

    public C1120c5(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f7971a = component;
    }

    @Override // D7.j
    public final Object a(D7.f context, Z6.b bVar, JSONObject data) {
        C1180g5 template = (C1180g5) bVar;
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        Uc uc = this.f7971a;
        List listQ = l7.d.q(context, template.f8286a, data, io.appmetrica.analytics.impl.L2.f39740g, uc.f6451E1, uc.f6429C1);
        X2 x22 = (X2) l7.d.h(context, template.f8287b, data, "border", uc.f6514K1, uc.f6492I1);
        Z4.a aVar = (Z4.a) l7.d.h(context, template.f8288c, data, "next_focus_ids", uc.f6420B3, uc.f6962z3);
        AbstractC5371a<List<C1132d2>> abstractC5371a = template.f8289d;
        b9.p pVar = uc.f6789j1;
        b9.p pVar2 = uc.f6766h1;
        return new Z4(listQ, x22, aVar, l7.d.q(context, abstractC5371a, data, "on_blur", pVar, pVar2), l7.d.q(context, template.f8290e, data, "on_focus", pVar, pVar2));
    }
}
