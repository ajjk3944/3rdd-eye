package N7;

import com.google.android.gms.common.internal.ImagesContract;
import java.util.List;
import n7.AbstractC5371a;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivActionDownloadJsonParser.kt */
/* renamed from: N7.a1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1086a1 implements D7.h, D7.i {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f7885a;

    public C1086a1(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f7885a = component;
    }

    @Override // D7.b
    public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
        return B4.h.c(this, fVar, jSONObject);
    }

    @Override // D7.i
    public final /* bridge */ /* synthetic */ Z6.b c(D7.f fVar, Object obj) {
        return d(fVar, null, (JSONObject) obj);
    }

    public final C1116c1 d(D7.f fVar, C1116c1 c1116c1, JSONObject jSONObject) throws z7.d {
        boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
        D7.f fVarW = T1.B.w(fVar);
        AbstractC5371a<List<C1132d2>> abstractC5371a = c1116c1 != null ? c1116c1.f7955a : null;
        Uc uc = this.f7885a;
        return new C1116c1(l7.c.k(fVarW, jSONObject, "on_fail_actions", zP, abstractC5371a, uc.f6777i1), l7.c.k(fVarW, jSONObject, "on_success_actions", zP, c1116c1 != null ? c1116c1.f7956b : null, uc.f6777i1), l7.c.e(fVarW, jSONObject, ImagesContract.URL, l7.k.f43900e, zP, c1116c1 != null ? c1116c1.f7957c : null, l7.h.f43883d, l7.e.f43877a));
    }

    @Override // D7.h
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, C1116c1 value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        Uc uc = this.f7885a;
        l7.c.v(context, jSONObject, "on_fail_actions", value.f7955a, uc.f6777i1);
        l7.c.v(context, jSONObject, "on_success_actions", value.f7956b, uc.f6777i1);
        k8.F.y(context, jSONObject, "type", com.vungle.ads.internal.presenter.h.DOWNLOAD);
        l7.c.p(context, ImagesContract.URL, value.f7957c, jSONObject, l7.h.f43882c);
        return jSONObject;
    }
}
