package N7;

import n7.AbstractC5371a;
import org.json.JSONObject;

/* compiled from: DivPointJsonParser.kt */
/* renamed from: N7.t8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1366t8 implements D7.j<JSONObject, C1380u8, C1325q8> {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f9335a;

    public C1366t8(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f9335a = component;
    }

    @Override // D7.j
    public final Object a(D7.f context, Z6.b bVar, JSONObject data) {
        C1380u8 template = (C1380u8) bVar;
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        Uc uc = this.f9335a;
        b9.p pVar = uc.f6526L2;
        AbstractC5371a<C1164f4> abstractC5371a = template.f9427a;
        b9.p pVar2 = uc.f6504J2;
        return new C1325q8((C1134d4) l7.d.a(context, abstractC5371a, data, "x", pVar, pVar2), (C1134d4) l7.d.a(context, template.f9428b, data, "y", uc.f6526L2, pVar2));
    }
}
