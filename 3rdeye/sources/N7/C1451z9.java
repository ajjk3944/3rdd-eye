package N7;

import N7.A9;
import N7.AbstractC1339r9;
import N7.C1264m3;
import N7.X8;
import org.json.JSONObject;

/* compiled from: DivShapeJsonParser.kt */
/* renamed from: N7.z9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1451z9 implements D7.j<JSONObject, A9, AbstractC1339r9> {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f10103a;

    public C1451z9(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f10103a = component;
    }

    @Override // D7.j
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final AbstractC1339r9 a(D7.f context, A9 template, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        boolean z10 = template instanceof A9.b;
        Uc uc = this.f10103a;
        if (z10) {
            return new AbstractC1339r9.b(((X8.c) uc.f6900t6.getValue()).a(context, ((A9.b) template).f4790a, data));
        }
        if (template instanceof A9.a) {
            return new AbstractC1339r9.a(((C1264m3.c) uc.f6640W1.getValue()).a(context, ((A9.a) template).f4789a, data));
        }
        throw new b9.j();
    }
}
