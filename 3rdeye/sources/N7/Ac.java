package N7;

import N7.C1412wc;
import org.json.JSONObject;

/* compiled from: DivWrapContentSizeJsonParser.kt */
/* loaded from: classes.dex */
public final class Ac implements D7.j<JSONObject, Bc, C1412wc> {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f4828a;

    public Ac(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f4828a = component;
    }

    @Override // D7.j
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C1412wc a(D7.f context, Bc template, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        A7.b bVarK = l7.d.k(context, template.f5001a, data, "constrained", l7.k.f43896a, l7.h.f43884e);
        Uc uc = this.f4828a;
        return new C1412wc(bVarK, (C1412wc.a) l7.d.h(context, template.f5002b, data, "max_size", uc.f6924v9, uc.f6903t9), (C1412wc.a) l7.d.h(context, template.f5003c, data, "min_size", uc.f6924v9, uc.f6903t9));
    }
}
