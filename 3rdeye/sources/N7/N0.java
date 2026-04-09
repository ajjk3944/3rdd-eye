package N7;

import N7.K0;
import N7.O0;
import org.json.JSONObject;

/* compiled from: DivActionCopyToClipboardContentJsonParser.kt */
/* loaded from: classes.dex */
public final class N0 implements D7.j<JSONObject, O0, K0> {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f5884a;

    public N0(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f5884a = component;
    }

    @Override // D7.j
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final K0 a(D7.f context, O0 template, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        boolean z10 = template instanceof O0.a;
        Uc uc = this.f5884a;
        if (z10) {
            ((H) uc.f6904u.getValue()).getClass();
            return new K0.a(H.b(context, ((O0.a) template).f5944a, data));
        }
        if (!(template instanceof O0.b)) {
            throw new b9.j();
        }
        ((M) uc.f6936x.getValue()).getClass();
        return new K0.b(M.b(context, ((O0.b) template).f5945a, data));
    }
}
