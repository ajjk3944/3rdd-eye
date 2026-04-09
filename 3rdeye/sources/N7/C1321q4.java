package N7;

import N7.AbstractC1348s4;
import org.json.JSONObject;

/* compiled from: DivDrawableJsonParser.kt */
/* renamed from: N7.q4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1321q4 implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f8926a;

    public C1321q4(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f8926a = component;
    }

    @Override // D7.b
    public final Object a(D7.f fVar, JSONObject jSONObject) {
        String strI = B4.i.i(fVar, "context", jSONObject, "data", jSONObject);
        Z6.b bVar = fVar.c().get(strI);
        C1409w9 c1409w9 = null;
        AbstractC1348s4 abstractC1348s4 = bVar instanceof AbstractC1348s4 ? (AbstractC1348s4) bVar : null;
        if (abstractC1348s4 != null) {
            if (!(abstractC1348s4 instanceof AbstractC1348s4.a)) {
                throw new b9.j();
            }
            strI = "shape_drawable";
        }
        if (!strI.equals("shape_drawable")) {
            throw z7.e.l(jSONObject, "type", strI);
        }
        C1381u9 c1381u9 = (C1381u9) this.f8926a.f6549N6.getValue();
        if (abstractC1348s4 != null) {
            if (!(abstractC1348s4 instanceof AbstractC1348s4.a)) {
                throw new b9.j();
            }
            c1409w9 = ((AbstractC1348s4.a) abstractC1348s4).f9142a;
        }
        return new AbstractC1348s4.a(c1381u9.d(fVar, c1409w9, jSONObject));
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, AbstractC1348s4 value) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        if (value instanceof AbstractC1348s4.a) {
            return ((C1381u9) this.f8926a.f6549N6.getValue()).b(context, ((AbstractC1348s4.a) value).f9142a);
        }
        throw new b9.j();
    }
}
