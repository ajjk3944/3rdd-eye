package N7;

import N7.H3;
import N7.L3;
import N7.Q4;
import org.json.JSONObject;

/* compiled from: DivCountJsonParser.kt */
/* loaded from: classes.dex */
public final class K3 implements D7.j<JSONObject, L3, H3> {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f5617a;

    public K3(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f5617a = component;
    }

    @Override // D7.j
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final H3 a(D7.f context, L3 template, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        boolean z10 = template instanceof L3.b;
        Uc uc = this.f5617a;
        if (z10) {
            ((R5) uc.f6745f4.getValue()).getClass();
            kotlin.jvm.internal.l.f(((L3.b) template).f5752a, "template");
            return new H3.b(new O5());
        }
        if (!(template instanceof L3.a)) {
            throw new b9.j();
        }
        ((Q4.c) uc.f6822m3.getValue()).getClass();
        return new H3.a(Q4.c.b(context, ((L3.a) template).f5751a, data));
    }
}
