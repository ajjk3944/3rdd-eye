package N7;

import N7.C1259lc;
import com.google.android.gms.common.internal.ImagesContract;
import l7.h;
import l7.k;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivVideoSourceJsonParser.kt */
/* renamed from: N7.mc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1273mc implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f8777a;

    public C1273mc(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f8777a = component;
    }

    @Override // D7.b
    public final Object a(D7.f context, JSONObject data) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(data, "data");
        k.e eVar = l7.k.f43897b;
        h.e eVar2 = l7.h.f43886g;
        j6.l lVar = l7.e.f43877a;
        return new C1259lc(l7.b.b(context, data, "bitrate", eVar, eVar2, lVar, null), l7.b.a(context, data, "mime_type", l7.k.f43898c, l7.e.f43878b, lVar), (C1259lc.a) k8.F.q(context, data, "resolution", this.f8777a.f6774h9), l7.b.a(context, data, ImagesContract.URL, l7.k.f43900e, l7.h.f43883d, lVar));
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, C1259lc value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        l7.b.d(context, jSONObject, "bitrate", value.f8738a);
        l7.b.d(context, jSONObject, "mime_type", value.f8739b);
        k8.F.z(context, jSONObject, "resolution", value.f8740c, this.f8777a.f6774h9);
        k8.F.y(context, jSONObject, "type", "video_source");
        l7.b.e(context, jSONObject, ImagesContract.URL, value.f8741d, l7.h.f43882c);
        return jSONObject;
    }
}
