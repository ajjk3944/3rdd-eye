package N7;

import N7.AbstractC1215ia;
import N7.AbstractC1410wa;
import org.json.JSONObject;

/* compiled from: DivStrokeStyleJsonParser.kt */
/* renamed from: N7.qa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1327qa implements D7.j<JSONObject, AbstractC1410wa, AbstractC1215ia> {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f8999a;

    public C1327qa(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f8999a = component;
    }

    @Override // D7.j
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final AbstractC1215ia a(D7.f context, AbstractC1410wa template, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        boolean z10 = template instanceof AbstractC1410wa.b;
        Uc uc = this.f8999a;
        if (z10) {
            ((C1382ua) uc.f6955y7.getValue()).getClass();
            kotlin.jvm.internal.l.f(((AbstractC1410wa.b) template).f9730a, "template");
            return new AbstractC1215ia.b(new C1340ra());
        }
        if (!(template instanceof AbstractC1410wa.a)) {
            throw new b9.j();
        }
        ((C1271ma) uc.f6922v7.getValue()).getClass();
        kotlin.jvm.internal.l.f(((AbstractC1410wa.a) template).f9729a, "template");
        return new AbstractC1215ia.a(new C1229ja());
    }
}
