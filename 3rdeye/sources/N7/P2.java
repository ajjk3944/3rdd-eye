package N7;

import N7.B5;
import N7.H8;
import N7.R2;
import N7.T6;
import org.json.JSONObject;

/* compiled from: DivBackgroundJsonParser.kt */
/* loaded from: classes.dex */
public final class P2 implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f6003a;

    public P2(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f6003a = component;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // D7.b
    public final Object a(D7.f fVar, JSONObject jSONObject) {
        Object cVar;
        String strI = B4.i.i(fVar, "context", jSONObject, "data", jSONObject);
        Z6.b bVar = fVar.c().get(strI);
        R2 r22 = bVar instanceof R2 ? (R2) bVar : null;
        if (r22 != null) {
            if (r22 instanceof R2.b) {
                strI = "gradient";
            } else if (r22 instanceof R2.d) {
                strI = "radial_gradient";
            } else if (r22 instanceof R2.a) {
                strI = "image";
            } else if (r22 instanceof R2.e) {
                strI = "solid";
            } else {
                if (!(r22 instanceof R2.c)) {
                    throw new b9.j();
                }
                strI = "nine_patch_image";
            }
        }
        int iHashCode = strI.hashCode();
        Uc uc = this.f6003a;
        switch (iHashCode) {
            case -30518633:
                if (strI.equals("nine_patch_image")) {
                    cVar = new R2.c(((C1167f7) uc.f6675Z4.getValue()).d(fVar, (C1197h7) (r22 != null ? r22.a() : null), jSONObject));
                    return cVar;
                }
                throw z7.e.l(jSONObject, "type", strI);
            case 89650992:
                if (strI.equals("gradient")) {
                    cVar = new R2.b(((T6.b) uc.f6547N4.getValue()).d(fVar, (U6) (r22 != null ? r22.a() : null), jSONObject));
                    return cVar;
                }
                throw z7.e.l(jSONObject, "type", strI);
            case 100313435:
                if (strI.equals("image")) {
                    cVar = new R2.a(((B5.e) uc.f6599S3.getValue()).d(fVar, (C5) (r22 != null ? r22.a() : null), jSONObject));
                    return cVar;
                }
                throw z7.e.l(jSONObject, "type", strI);
            case 109618859:
                if (strI.equals("solid")) {
                    U9 u92 = (U9) uc.f6783i7.getValue();
                    Object objA = r22 != null ? r22.a() : null;
                    u92.getClass();
                    cVar = new R2.e(U9.d(fVar, (W9) objA, jSONObject));
                    return cVar;
                }
                throw z7.e.l(jSONObject, "type", strI);
            case 1881846096:
                if (strI.equals("radial_gradient")) {
                    cVar = new R2.d(((H8.b) uc.f6825m6.getValue()).d(fVar, (V8) (r22 != null ? r22.a() : null), jSONObject));
                    return cVar;
                }
                throw z7.e.l(jSONObject, "type", strI);
            default:
                throw z7.e.l(jSONObject, "type", strI);
        }
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, R2 value) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        boolean z10 = value instanceof R2.b;
        Uc uc = this.f6003a;
        if (z10) {
            return ((T6.b) uc.f6547N4.getValue()).b(context, ((R2.b) value).f6109a);
        }
        if (value instanceof R2.d) {
            return ((H8.b) uc.f6825m6.getValue()).b(context, ((R2.d) value).f6111a);
        }
        if (value instanceof R2.a) {
            return ((B5.e) uc.f6599S3.getValue()).b(context, ((R2.a) value).f6108a);
        }
        if (value instanceof R2.e) {
            ((U9) uc.f6783i7.getValue()).getClass();
            return U9.e(context, ((R2.e) value).f6112a);
        }
        if (value instanceof R2.c) {
            return ((C1167f7) uc.f6675Z4.getValue()).b(context, ((R2.c) value).f6110a);
        }
        throw new b9.j();
    }
}
