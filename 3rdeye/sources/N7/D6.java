package N7;

import N7.AbstractC1378u6;
import N7.C1448z6;
import N7.F6;
import N7.H6;
import org.json.JSONObject;

/* compiled from: DivInputValidatorJsonParser.kt */
/* loaded from: classes.dex */
public final class D6 implements D7.j<JSONObject, H6, AbstractC1378u6> {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f5104a;

    public D6(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f5104a = component;
    }

    @Override // D7.j
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final AbstractC1378u6 a(D7.f context, H6 template, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        boolean z10 = template instanceof H6.b;
        Uc uc = this.f5104a;
        if (z10) {
            ((F6.c) uc.f6963z4.getValue()).getClass();
            return new AbstractC1378u6.b(F6.c.b(context, ((H6.b) template).f5394a, data));
        }
        if (!(template instanceof H6.a)) {
            throw new b9.j();
        }
        ((C1448z6.c) uc.f6930w4.getValue()).getClass();
        return new AbstractC1378u6.a(C1448z6.c.b(context, ((H6.a) template).f5393a, data));
    }
}
