package N7;

import N7.AbstractC1178g3;
import N7.AbstractC1236k3;
import N7.C1103b3;
import N7.C1148e3;
import org.json.JSONObject;

/* compiled from: DivChangeTransitionJsonParser.kt */
/* renamed from: N7.j3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1222j3 implements D7.j<JSONObject, AbstractC1236k3, AbstractC1178g3> {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f8481a;

    public C1222j3(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f8481a = component;
    }

    @Override // D7.j
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final AbstractC1178g3 a(D7.f context, AbstractC1236k3 template, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        boolean z10 = template instanceof AbstractC1236k3.b;
        Uc uc = this.f8481a;
        if (z10) {
            return new AbstractC1178g3.b(((C1148e3.c) uc.f6576Q1.getValue()).a(context, ((AbstractC1236k3.b) template).f8629a, data));
        }
        if (!(template instanceof AbstractC1236k3.a)) {
            throw new b9.j();
        }
        ((C1103b3.d) uc.N1.getValue()).getClass();
        return new AbstractC1178g3.a(C1103b3.d.b(context, ((AbstractC1236k3.a) template).f8628a, data));
    }
}
