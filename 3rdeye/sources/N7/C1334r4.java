package N7;

import N7.AbstractC1293o4;
import N7.AbstractC1348s4;
import org.json.JSONObject;

/* compiled from: DivDrawableJsonParser.kt */
/* renamed from: N7.r4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1334r4 implements D7.j<JSONObject, AbstractC1348s4, AbstractC1293o4> {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f9040a;

    public C1334r4(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f9040a = component;
    }

    @Override // D7.j
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final AbstractC1293o4.a a(D7.f context, AbstractC1348s4 template, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        if (template instanceof AbstractC1348s4.a) {
            return new AbstractC1293o4.a(((C1395v9) this.f9040a.f6559O6.getValue()).a(context, ((AbstractC1348s4.a) template).f9142a, data));
        }
        throw new b9.j();
    }
}
