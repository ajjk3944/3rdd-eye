package N7;

import N7.A9;
import N7.C1264m3;
import N7.X8;
import org.json.JSONObject;

/* compiled from: DivShapeJsonParser.kt */
/* renamed from: N7.y9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1437y9 implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f9939a;

    public C1437y9(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f9939a = component;
    }

    @Override // D7.b
    public final Object a(D7.f fVar, JSONObject jSONObject) {
        Object aVar;
        Object obj;
        Object obj2;
        String strI = B4.i.i(fVar, "context", jSONObject, "data", jSONObject);
        Z6.b bVar = fVar.c().get(strI);
        Object obj3 = null;
        A9 a92 = bVar instanceof A9 ? (A9) bVar : null;
        if (a92 != null) {
            if (a92 instanceof A9.b) {
                strI = "rounded_rectangle";
            } else {
                if (!(a92 instanceof A9.a)) {
                    throw new b9.j();
                }
                strI = "circle";
            }
        }
        boolean zEquals = strI.equals("rounded_rectangle");
        Uc uc = this.f9939a;
        if (zEquals) {
            X8.b bVar2 = (X8.b) uc.f6889s6.getValue();
            if (a92 != null) {
                if (a92 instanceof A9.b) {
                    obj2 = ((A9.b) a92).f4790a;
                } else {
                    if (!(a92 instanceof A9.a)) {
                        throw new b9.j();
                    }
                    obj2 = ((A9.a) a92).f4789a;
                }
                obj3 = obj2;
            }
            aVar = new A9.b(bVar2.d(fVar, (Y8) obj3, jSONObject));
        } else {
            if (!strI.equals("circle")) {
                throw z7.e.l(jSONObject, "type", strI);
            }
            C1264m3.b bVar3 = (C1264m3.b) uc.f6629V1.getValue();
            if (a92 != null) {
                if (a92 instanceof A9.b) {
                    obj = ((A9.b) a92).f4790a;
                } else {
                    if (!(a92 instanceof A9.a)) {
                        throw new b9.j();
                    }
                    obj = ((A9.a) a92).f4789a;
                }
                obj3 = obj;
            }
            aVar = new A9.a(bVar3.d(fVar, (C1278n3) obj3, jSONObject));
        }
        return aVar;
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, A9 value) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        boolean z10 = value instanceof A9.b;
        Uc uc = this.f9939a;
        if (z10) {
            return ((X8.b) uc.f6889s6.getValue()).b(context, ((A9.b) value).f4790a);
        }
        if (value instanceof A9.a) {
            return ((C1264m3.b) uc.f6629V1.getValue()).b(context, ((A9.a) value).f4789a);
        }
        throw new b9.j();
    }
}
