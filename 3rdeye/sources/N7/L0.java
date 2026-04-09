package N7;

import N7.K0;
import com.google.android.gms.common.internal.ImagesContract;
import org.json.JSONObject;

/* compiled from: DivActionCopyToClipboardContentJsonParser.kt */
/* loaded from: classes.dex */
public final class L0 implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f5748a;

    public L0(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f5748a = component;
    }

    @Override // D7.b
    public final Object a(D7.f fVar, JSONObject jSONObject) throws z7.d {
        String strI = B4.i.i(fVar, "context", jSONObject, "data", jSONObject);
        boolean zEquals = strI.equals("text");
        Uc uc = this.f5748a;
        if (zEquals) {
            ((F) uc.f6882s.getValue()).getClass();
            return new K0.a(F.d(fVar, jSONObject));
        }
        if (strI.equals(ImagesContract.URL)) {
            ((K) uc.f6914v.getValue()).getClass();
            return new K0.b(K.d(fVar, jSONObject));
        }
        Z6.b bVarF = fVar.c().f(strI, jSONObject);
        O0 o02 = bVarF instanceof O0 ? (O0) bVarF : null;
        if (o02 != null) {
            return ((N0) uc.f6730e0.getValue()).a(fVar, o02, jSONObject);
        }
        throw z7.e.l(jSONObject, "type", strI);
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, K0 value) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        boolean z10 = value instanceof K0.a;
        Uc uc = this.f5748a;
        if (z10) {
            ((F) uc.f6882s.getValue()).getClass();
            return F.e(context, ((K0.a) value).f5610b);
        }
        if (!(value instanceof K0.b)) {
            throw new b9.j();
        }
        ((K) uc.f6914v.getValue()).getClass();
        return K.e(context, ((K0.b) value).f5611b);
    }
}
