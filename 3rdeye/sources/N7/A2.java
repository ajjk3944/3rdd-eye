package N7;

import N7.AbstractC1402w2;
import N7.B2;
import N7.C1226j7;
import N7.C1403w3;
import org.json.JSONObject;

/* compiled from: DivAnimatorJsonParser.kt */
/* loaded from: classes.dex */
public final class A2 implements D7.j<JSONObject, B2, AbstractC1402w2> {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f4757a;

    public A2(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f4757a = component;
    }

    @Override // D7.j
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final AbstractC1402w2 a(D7.f context, B2 template, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        boolean z10 = template instanceof B2.a;
        Uc uc = this.f4757a;
        if (z10) {
            return new AbstractC1402w2.a(((C1403w3.e) uc.f6778i2.getValue()).a(context, ((B2.a) template).f4833a, data));
        }
        if (template instanceof B2.b) {
            return new AbstractC1402w2.b(((C1226j7.e) uc.f6723d5.getValue()).a(context, ((B2.b) template).f4834a, data));
        }
        throw new b9.j();
    }
}
