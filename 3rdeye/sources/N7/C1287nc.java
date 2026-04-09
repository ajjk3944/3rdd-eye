package N7;

import com.google.android.gms.common.internal.ImagesContract;
import l7.h;
import l7.k;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivVideoSourceJsonParser.kt */
/* renamed from: N7.nc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1287nc implements D7.h, D7.i {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f8844a;

    public C1287nc(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f8844a = component;
    }

    @Override // D7.b
    public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
        return B4.h.c(this, fVar, jSONObject);
    }

    @Override // D7.i
    public final Z6.b c(D7.f fVar, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
        D7.f fVarW = T1.B.w(fVar);
        k.e eVar = l7.k.f43897b;
        h.e eVar2 = l7.h.f43886g;
        j6.l lVar = l7.e.f43877a;
        return new C1329qc(l7.c.j(fVarW, jSONObject, "bitrate", eVar, zP, null, eVar2, lVar), l7.c.d(fVarW, jSONObject, "mime_type", l7.k.f43898c, zP, null), l7.c.h(fVarW, jSONObject, "resolution", zP, null, this.f8844a.f6785i9), l7.c.e(fVarW, jSONObject, ImagesContract.URL, l7.k.f43900e, zP, null, l7.h.f43883d, lVar));
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, C1329qc value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        l7.c.q(context, jSONObject, "bitrate", value.f9003a);
        l7.c.q(context, jSONObject, "mime_type", value.f9004b);
        l7.c.u(context, jSONObject, "resolution", value.f9005c, this.f8844a.f6785i9);
        k8.F.y(context, jSONObject, "type", "video_source");
        l7.c.p(context, ImagesContract.URL, value.f9006d, jSONObject, l7.h.f43882c);
        return jSONObject;
    }
}
