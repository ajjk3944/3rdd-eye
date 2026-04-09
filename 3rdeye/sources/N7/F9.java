package N7;

import N7.C9;
import N7.G9;
import N7.W6;
import N7.X4;
import org.json.JSONObject;

/* compiled from: DivSizeJsonParser.kt */
/* loaded from: classes.dex */
public final class F9 implements D7.j<JSONObject, G9, C9> {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f5232a;

    public F9(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f5232a = component;
    }

    @Override // D7.j
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C9 a(D7.f context, G9 template, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        boolean z10 = template instanceof G9.a;
        Uc uc = this.f5232a;
        if (z10) {
            ((X4.d) uc.f6918v3.getValue()).getClass();
            return new C9.a(X4.d.b(context, ((G9.a) template).f5376a, data));
        }
        if (template instanceof G9.b) {
            ((W6.c) uc.f6622U4.getValue()).getClass();
            return new C9.b(W6.c.b(context, ((G9.b) template).f5377a, data));
        }
        if (template instanceof G9.c) {
            return new C9.c(((Ac) uc.f6892s9.getValue()).a(context, ((G9.c) template).f5378a, data));
        }
        throw new b9.j();
    }
}
