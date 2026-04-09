package N7;

import N7.C1104b4;
import N7.C1155ea;
import N7.H5;
import N7.L5;
import org.json.JSONObject;

/* compiled from: DivIndicatorItemPlacementJsonParser.kt */
/* loaded from: classes.dex */
public final class K5 implements D7.j<JSONObject, L5, H5> {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f5618a;

    public K5(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f5618a = component;
    }

    @Override // D7.j
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final H5 a(D7.f context, L5 template, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        boolean z10 = template instanceof L5.a;
        Uc uc = this.f5618a;
        if (z10) {
            return new H5.a(((C1104b4.c) uc.f6493I2.getValue()).a(context, ((L5.a) template).f5753a, data));
        }
        if (template instanceof L5.b) {
            return new H5.b(((C1155ea.c) uc.f6890s7.getValue()).a(context, ((L5.b) template).f5754a, data));
        }
        throw new b9.j();
    }
}
