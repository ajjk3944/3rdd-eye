package N7;

import N7.A8;
import N7.AbstractC1408w8;
import N7.E8;
import org.json.JSONObject;

/* compiled from: DivRadialGradientCenterJsonParser.kt */
/* renamed from: N7.z8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1450z8 implements D7.j<JSONObject, A8, AbstractC1408w8> {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f10102a;

    public C1450z8(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f10102a = component;
    }

    @Override // D7.j
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final AbstractC1408w8 a(D7.f context, A8 template, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        boolean z10 = template instanceof A8.a;
        Uc uc = this.f10102a;
        if (z10) {
            ((E8.d) uc.f6700b6.getValue()).getClass();
            return new AbstractC1408w8.a(E8.d.b(context, ((A8.a) template).f4787a, data));
        }
        if (!(template instanceof A8.b)) {
            throw new b9.j();
        }
        ((Q8) uc.f6771h6.getValue()).getClass();
        return new AbstractC1408w8.b(Q8.b(context, ((A8.b) template).f4788a, data));
    }
}
