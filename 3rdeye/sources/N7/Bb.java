package N7;

import N7.Ab;
import org.json.JSONObject;

/* compiled from: DivTooltipModeJsonParser.kt */
/* loaded from: classes.dex */
public final class Bb implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f5000a;

    public Bb(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f5000a = component;
    }

    @Override // D7.b
    public final Object a(D7.f fVar, JSONObject jSONObject) throws z7.d {
        String strI = B4.i.i(fVar, "context", jSONObject, "data", jSONObject);
        boolean zEquals = strI.equals("non_modal");
        Uc uc = this.f5000a;
        if (zEquals) {
            ((Kb) uc.f6510J8.getValue()).getClass();
            return new Ab.b(new Jb());
        }
        if (strI.equals("modal")) {
            ((Fb) uc.f6478G8.getValue()).getClass();
            return new Ab.a(new Eb());
        }
        Z6.b bVarF = fVar.c().f(strI, jSONObject);
        Ob ob = bVarF instanceof Ob ? (Ob) bVarF : null;
        if (ob != null) {
            return ((Db) uc.f6561O8.getValue()).a(fVar, ob, jSONObject);
        }
        throw z7.e.l(jSONObject, "type", strI);
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, Ab value) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        boolean z10 = value instanceof Ab.b;
        Uc uc = this.f5000a;
        if (z10) {
            ((Kb) uc.f6510J8.getValue()).getClass();
            return Kb.d(context, ((Ab.b) value).f4827b);
        }
        if (!(value instanceof Ab.a)) {
            throw new b9.j();
        }
        ((Fb) uc.f6478G8.getValue()).getClass();
        return Fb.d(context, ((Ab.a) value).f4826b);
    }
}
