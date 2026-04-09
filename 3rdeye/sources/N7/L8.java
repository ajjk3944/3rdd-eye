package N7;

import N7.I8;
import N7.M8;
import N7.T8;
import N7.X4;
import org.json.JSONObject;

/* compiled from: DivRadialGradientRadiusJsonParser.kt */
/* loaded from: classes.dex */
public final class L8 implements D7.j<JSONObject, M8, I8> {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f5759a;

    public L8(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f5759a = component;
    }

    @Override // D7.j
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final I8 a(D7.f context, M8 template, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        boolean z10 = template instanceof M8.a;
        Uc uc = this.f5759a;
        if (z10) {
            ((X4.d) uc.f6918v3.getValue()).getClass();
            return new I8.a(X4.d.b(context, ((M8.a) template).f5861a, data));
        }
        if (!(template instanceof M8.b)) {
            throw new b9.j();
        }
        ((T8.d) uc.f6804k6.getValue()).getClass();
        return new I8.b(T8.d.b(context, ((M8.b) template).f5862a, data));
    }
}
