package N7;

import N7.J7;
import N7.N7;
import org.json.JSONObject;

/* compiled from: DivPagerLayoutModeJsonParser.kt */
/* loaded from: classes.dex */
public final class M7 implements D7.j<JSONObject, N7, J7> {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f5860a;

    public M7(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f5860a = component;
    }

    @Override // D7.j
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final J7 a(D7.f context, N7 template, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        boolean z10 = template instanceof N7.c;
        Uc uc = this.f5860a;
        if (z10) {
            return new J7.c(((C1365t7) uc.f6792j5.getValue()).a(context, ((N7.c) template).f5937a, data));
        }
        if (template instanceof N7.a) {
            return new J7.a(((C1107b7) uc.f6653X4.getValue()).a(context, ((N7.a) template).f5935a, data));
        }
        if (!(template instanceof N7.b)) {
            throw new b9.j();
        }
        ((C1296o7) uc.f6758g5.getValue()).getClass();
        kotlin.jvm.internal.l.f(((N7.b) template).f5936a, "template");
        return new J7.b(new C1254l7());
    }
}
