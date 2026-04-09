package N7;

import N7.O0;
import com.google.android.gms.common.internal.ImagesContract;
import org.json.JSONObject;

/* compiled from: DivActionCopyToClipboardContentJsonParser.kt */
/* loaded from: classes.dex */
public final class M0 implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f5827a;

    public M0(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f5827a = component;
    }

    @Override // D7.b
    public final Object a(D7.f fVar, JSONObject jSONObject) {
        Object bVar;
        Object obj;
        Object obj2;
        String strI = B4.i.i(fVar, "context", jSONObject, "data", jSONObject);
        Z6.b bVar2 = fVar.c().get(strI);
        Object obj3 = null;
        O0 o02 = bVar2 instanceof O0 ? (O0) bVar2 : null;
        if (o02 != null) {
            if (o02 instanceof O0.a) {
                strI = "text";
            } else {
                if (!(o02 instanceof O0.b)) {
                    throw new b9.j();
                }
                strI = ImagesContract.URL;
            }
        }
        boolean zEquals = strI.equals("text");
        Uc uc = this.f5827a;
        if (zEquals) {
            G g10 = (G) uc.f6893t.getValue();
            if (o02 != null) {
                if (o02 instanceof O0.a) {
                    obj2 = ((O0.a) o02).f5944a;
                } else {
                    if (!(o02 instanceof O0.b)) {
                        throw new b9.j();
                    }
                    obj2 = ((O0.b) o02).f5945a;
                }
                obj3 = obj2;
            }
            g10.getClass();
            bVar = new O0.a(G.d(fVar, (I) obj3, jSONObject));
        } else {
            if (!strI.equals(ImagesContract.URL)) {
                throw z7.e.l(jSONObject, "type", strI);
            }
            L l5 = (L) uc.f6925w.getValue();
            if (o02 != null) {
                if (o02 instanceof O0.a) {
                    obj = ((O0.a) o02).f5944a;
                } else {
                    if (!(o02 instanceof O0.b)) {
                        throw new b9.j();
                    }
                    obj = ((O0.b) o02).f5945a;
                }
                obj3 = obj;
            }
            l5.getClass();
            bVar = new O0.b(L.d(fVar, (N) obj3, jSONObject));
        }
        return bVar;
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, O0 value) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        boolean z10 = value instanceof O0.a;
        Uc uc = this.f5827a;
        if (z10) {
            ((G) uc.f6893t.getValue()).getClass();
            return G.e(context, ((O0.a) value).f5944a);
        }
        if (!(value instanceof O0.b)) {
            throw new b9.j();
        }
        ((L) uc.f6925w.getValue()).getClass();
        return L.e(context, ((O0.b) value).f5945a);
    }
}
