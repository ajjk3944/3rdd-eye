package N7;

import N7.A7;
import N7.AbstractC1393v7;
import N7.D7;
import N7.F7;
import org.json.JSONObject;

/* compiled from: DivPageTransformationJsonParser.kt */
/* renamed from: N7.y7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1435y7 implements D7.j<JSONObject, F7, AbstractC1393v7> {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f9937a;

    public C1435y7(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f9937a = component;
    }

    @Override // D7.j
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final AbstractC1393v7 a(D7.f context, F7 template, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        boolean z10 = template instanceof F7.b;
        Uc uc = this.f9937a;
        if (z10) {
            ((D7.d) uc.f6856p5.getValue()).getClass();
            return new AbstractC1393v7.b(D7.d.b(context, ((F7.b) template).f5229a, data));
        }
        if (!(template instanceof F7.a)) {
            throw new b9.j();
        }
        ((A7.d) uc.f6824m5.getValue()).getClass();
        return new AbstractC1393v7.a(A7.d.b(context, ((F7.a) template).f5228a, data));
    }
}
