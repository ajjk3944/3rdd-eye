package N7;

import N7.H8;
import N7.Pa;
import N7.T6;
import N7.Ta;
import org.json.JSONObject;

/* compiled from: DivTextGradientJsonParser.kt */
/* loaded from: classes.dex */
public final class Sa implements D7.j<JSONObject, Ta, Pa> {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f6213a;

    public Sa(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f6213a = component;
    }

    @Override // D7.j
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Pa a(D7.f context, Ta template, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        boolean z10 = template instanceof Ta.a;
        Uc uc = this.f6213a;
        if (z10) {
            return new Pa.a(((T6.c) uc.f6557O4.getValue()).a(context, ((Ta.a) template).f6348a, data));
        }
        if (template instanceof Ta.b) {
            return new Pa.b(((H8.c) uc.f6836n6.getValue()).a(context, ((Ta.b) template).f6349a, data));
        }
        throw new b9.j();
    }
}
