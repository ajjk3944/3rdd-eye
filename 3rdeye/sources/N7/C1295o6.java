package N7;

import N7.AbstractC1239k6;
import N7.AbstractC1309p6;
import N7.T4;
import org.json.JSONObject;

/* compiled from: DivInputMaskJsonParser.kt */
/* renamed from: N7.o6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1295o6 implements D7.j<JSONObject, AbstractC1309p6, AbstractC1239k6> {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f8860a;

    public C1295o6(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f8860a = component;
    }

    @Override // D7.j
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final AbstractC1239k6 a(D7.f context, AbstractC1309p6 template, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        boolean z10 = template instanceof AbstractC1309p6.b;
        Uc uc = this.f8860a;
        if (z10) {
            return new AbstractC1239k6.b(((T4.c) uc.f6854p3.getValue()).a(context, ((AbstractC1309p6.b) template).f8899a, data));
        }
        if (template instanceof AbstractC1309p6.a) {
            ((P3) uc.f6939x2.getValue()).getClass();
            return new AbstractC1239k6.a(P3.b(context, ((AbstractC1309p6.a) template).f8898a, data));
        }
        if (!(template instanceof AbstractC1309p6.c)) {
            throw new b9.j();
        }
        ((C1108b8) uc.f6507J5.getValue()).getClass();
        return new AbstractC1239k6.c(C1108b8.b(context, ((AbstractC1309p6.c) template).f8900a, data));
    }
}
