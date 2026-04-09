package N7;

import N7.F4;
import N7.O4;
import N7.V2;
import org.json.JSONObject;

/* compiled from: DivFilterJsonParser.kt */
/* loaded from: classes.dex */
public final class I4 implements D7.j<JSONObject, O4, F4> {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f5442a;

    public I4(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f5442a = component;
    }

    @Override // D7.j
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final F4 a(D7.f context, O4 template, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        boolean z10 = template instanceof O4.a;
        Uc uc = this.f5442a;
        if (z10) {
            ((V2.c) uc.f6481H1.getValue()).getClass();
            return new F4.a(V2.c.b(context, ((O4.a) template).f5949a, data));
        }
        if (!(template instanceof O4.b)) {
            throw new b9.j();
        }
        ((M4) uc.f6756g3.getValue()).getClass();
        kotlin.jvm.internal.l.f(((O4.b) template).f5950a, "template");
        return new F4.b(new J4());
    }
}
