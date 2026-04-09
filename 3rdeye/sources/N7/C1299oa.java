package N7;

import N7.AbstractC1215ia;
import org.json.JSONObject;

/* compiled from: DivStrokeStyleJsonParser.kt */
/* renamed from: N7.oa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1299oa implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f8867a;

    public C1299oa(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f8867a = component;
    }

    @Override // D7.b
    public final Object a(D7.f fVar, JSONObject jSONObject) throws z7.d {
        String strI = B4.i.i(fVar, "context", jSONObject, "data", jSONObject);
        boolean zEquals = strI.equals("solid");
        Uc uc = this.f8867a;
        if (zEquals) {
            ((C1354sa) uc.f6933w7.getValue()).getClass();
            return new AbstractC1215ia.b(new C1340ra());
        }
        if (strI.equals("dashed")) {
            ((C1243ka) uc.f6901t7.getValue()).getClass();
            return new AbstractC1215ia.a(new C1229ja());
        }
        Z6.b bVarF = fVar.c().f(strI, jSONObject);
        AbstractC1410wa abstractC1410wa = bVarF instanceof AbstractC1410wa ? (AbstractC1410wa) bVarF : null;
        if (abstractC1410wa != null) {
            return ((C1327qa) uc.f6424B7.getValue()).a(fVar, abstractC1410wa, jSONObject);
        }
        throw z7.e.l(jSONObject, "type", strI);
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, AbstractC1215ia value) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        boolean z10 = value instanceof AbstractC1215ia.b;
        Uc uc = this.f8867a;
        if (z10) {
            ((C1354sa) uc.f6933w7.getValue()).getClass();
            return C1354sa.d(context, ((AbstractC1215ia.b) value).f8420b);
        }
        if (!(value instanceof AbstractC1215ia.a)) {
            throw new b9.j();
        }
        ((C1243ka) uc.f6901t7.getValue()).getClass();
        return C1243ka.d(context, ((AbstractC1215ia.a) value).f8419b);
    }
}
