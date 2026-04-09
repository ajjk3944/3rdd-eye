package N7;

import N7.L9;
import l7.h;
import l7.k;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivSliderJsonParser.kt */
/* loaded from: classes.dex */
public final class N9 implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f5940a;

    public N9(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f5940a = component;
    }

    @Override // D7.b
    public final Object a(D7.f context, JSONObject data) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(data, "data");
        k.e eVar = l7.k.f43897b;
        h.e eVar2 = l7.h.f43886g;
        j6.l lVar = l7.e.f43877a;
        A7.b bVarB = l7.b.b(context, data, "end", eVar, eVar2, lVar, null);
        Uc uc = this.f5940a;
        C1362t4 c1362t4 = (C1362t4) k8.F.q(context, data, "margins", uc.f6630V2);
        A7.b bVarB2 = l7.b.b(context, data, "start", eVar, eVar2, lVar, null);
        b9.p pVar = uc.f6598S2;
        return new L9.a(bVarB, c1362t4, bVarB2, (AbstractC1293o4) k8.F.q(context, data, "track_active_style", pVar), (AbstractC1293o4) k8.F.q(context, data, "track_inactive_style", pVar));
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, L9.a value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        l7.b.d(context, jSONObject, "end", value.f5807a);
        Uc uc = this.f5940a;
        k8.F.z(context, jSONObject, "margins", value.f5808b, uc.f6630V2);
        l7.b.d(context, jSONObject, "start", value.f5809c);
        AbstractC1293o4 abstractC1293o4 = value.f5810d;
        b9.p pVar = uc.f6598S2;
        k8.F.z(context, jSONObject, "track_active_style", abstractC1293o4, pVar);
        k8.F.z(context, jSONObject, "track_inactive_style", value.f5811e, pVar);
        return jSONObject;
    }
}
