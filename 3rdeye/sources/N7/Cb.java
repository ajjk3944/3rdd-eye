package N7;

import N7.Ob;
import org.json.JSONObject;

/* compiled from: DivTooltipModeJsonParser.kt */
/* loaded from: classes.dex */
public final class Cb implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f5047a;

    public Cb(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f5047a = component;
    }

    @Override // D7.b
    public final Object a(D7.f fVar, JSONObject jSONObject) {
        Object aVar;
        Object obj;
        Object obj2;
        String strI = B4.i.i(fVar, "context", jSONObject, "data", jSONObject);
        Z6.b bVar = fVar.c().get(strI);
        Object obj3 = null;
        Ob ob = bVar instanceof Ob ? (Ob) bVar : null;
        if (ob != null) {
            if (ob instanceof Ob.b) {
                strI = "non_modal";
            } else {
                if (!(ob instanceof Ob.a)) {
                    throw new b9.j();
                }
                strI = "modal";
            }
        }
        boolean zEquals = strI.equals("non_modal");
        Uc uc = this.f5047a;
        if (zEquals) {
            Lb lb = (Lb) uc.f6521K8.getValue();
            if (ob != null) {
                if (ob instanceof Ob.b) {
                    obj2 = ((Ob.b) ob).f5997a;
                } else {
                    if (!(ob instanceof Ob.a)) {
                        throw new b9.j();
                    }
                    obj2 = ((Ob.a) ob).f5996a;
                }
                obj3 = obj2;
            }
            lb.getClass();
            aVar = new Ob.b(new Nb());
        } else {
            if (!strI.equals("modal")) {
                throw z7.e.l(jSONObject, "type", strI);
            }
            Gb gb = (Gb) uc.f6488H8.getValue();
            if (ob != null) {
                if (ob instanceof Ob.b) {
                    obj = ((Ob.b) ob).f5997a;
                } else {
                    if (!(ob instanceof Ob.a)) {
                        throw new b9.j();
                    }
                    obj = ((Ob.a) ob).f5996a;
                }
                obj3 = obj;
            }
            gb.getClass();
            aVar = new Ob.a(new Ib());
        }
        return aVar;
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, Ob value) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        boolean z10 = value instanceof Ob.b;
        Uc uc = this.f5047a;
        if (z10) {
            ((Lb) uc.f6521K8.getValue()).getClass();
            return Lb.d(context, ((Ob.b) value).f5997a);
        }
        if (!(value instanceof Ob.a)) {
            throw new b9.j();
        }
        ((Gb) uc.f6488H8.getValue()).getClass();
        return Gb.d(context, ((Ob.a) value).f5996a);
    }
}
