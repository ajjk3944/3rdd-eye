package N7;

import N7.L9;
import N7.Q9;
import l7.h;
import l7.k;
import n7.AbstractC5371a;
import org.json.JSONObject;

/* compiled from: DivSliderJsonParser.kt */
/* loaded from: classes.dex */
public final class P9 implements D7.j<JSONObject, Q9.a, L9.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f6016a;

    public P9(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f6016a = component;
    }

    @Override // D7.j
    public final Object a(D7.f context, Z6.b bVar, JSONObject data) {
        Q9.a template = (Q9.a) bVar;
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        k.e eVar = l7.k.f43897b;
        h.e eVar2 = l7.h.f43886g;
        A7.b bVarK = l7.d.k(context, template.f6087a, data, "end", eVar, eVar2);
        Uc uc = this.f6016a;
        C1362t4 c1362t4 = (C1362t4) l7.d.h(context, template.f6088b, data, "margins", uc.f6652X2, uc.f6630V2);
        A7.b bVarK2 = l7.d.k(context, template.f6089c, data, "start", eVar, eVar2);
        AbstractC5371a<AbstractC1348s4> abstractC5371a = template.f6090d;
        b9.p pVar = uc.f6620U2;
        b9.p pVar2 = uc.f6598S2;
        return new L9.a(bVarK, c1362t4, bVarK2, (AbstractC1293o4) l7.d.h(context, abstractC5371a, data, "track_active_style", pVar, pVar2), (AbstractC1293o4) l7.d.h(context, template.f6091e, data, "track_inactive_style", pVar, pVar2));
    }
}
