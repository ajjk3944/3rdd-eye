package N7;

import N7.B5;
import N7.H8;
import N7.N2;
import N7.R2;
import N7.T6;
import org.json.JSONObject;

/* compiled from: DivBackgroundJsonParser.kt */
/* loaded from: classes.dex */
public final class Q2 implements D7.j<JSONObject, R2, N2> {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f6034a;

    public Q2(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f6034a = component;
    }

    @Override // D7.j
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final N2 a(D7.f context, R2 template, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        boolean z10 = template instanceof R2.b;
        Uc uc = this.f6034a;
        if (z10) {
            return new N2.b(((T6.c) uc.f6557O4.getValue()).a(context, ((R2.b) template).f6109a, data));
        }
        if (template instanceof R2.d) {
            return new N2.d(((H8.c) uc.f6836n6.getValue()).a(context, ((R2.d) template).f6111a, data));
        }
        if (template instanceof R2.a) {
            return new N2.a(((B5.f) uc.f6610T3.getValue()).a(context, ((R2.a) template).f6108a, data));
        }
        if (template instanceof R2.e) {
            ((V9) uc.f6794j7.getValue()).getClass();
            return new N2.e(V9.b(context, ((R2.e) template).f6112a, data));
        }
        if (template instanceof R2.c) {
            return new N2.c(((C1182g7) uc.f6687a5.getValue()).a(context, ((R2.c) template).f6110a, data));
        }
        throw new b9.j();
    }
}
