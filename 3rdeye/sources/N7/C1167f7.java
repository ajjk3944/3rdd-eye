package N7;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivNinePatchBackgroundJsonParser.kt */
/* renamed from: N7.f7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1167f7 implements D7.h, D7.i {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f8193a;

    public C1167f7(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f8193a = component;
    }

    @Override // D7.b
    public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
        return B4.h.c(this, fVar, jSONObject);
    }

    @Override // D7.i
    public final /* bridge */ /* synthetic */ Z6.b c(D7.f fVar, Object obj) {
        return d(fVar, null, (JSONObject) obj);
    }

    public final C1197h7 d(D7.f fVar, C1197h7 c1197h7, JSONObject jSONObject) throws z7.d {
        boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
        D7.f fVarW = T1.B.w(fVar);
        return new C1197h7(l7.c.e(fVarW, jSONObject, "image_url", l7.k.f43900e, zP, c1197h7 != null ? c1197h7.f8353a : null, l7.h.f43883d, l7.e.f43877a), l7.c.b(fVarW, jSONObject, "insets", zP, c1197h7 != null ? c1197h7.f8354b : null, this.f8193a.f6460F));
    }

    @Override // D7.h
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, C1197h7 value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        l7.c.p(context, "image_url", value.f8353a, jSONObject, l7.h.f43882c);
        l7.c.u(context, jSONObject, "insets", value.f8354b, this.f8193a.f6460F);
        k8.F.y(context, jSONObject, "type", "nine_patch_image");
        return jSONObject;
    }
}
