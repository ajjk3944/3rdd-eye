package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import c9.C2092m;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ArrayFunctions.kt */
/* renamed from: b7.u2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1964u2 extends AbstractC1892g {

    /* renamed from: c, reason: collision with root package name */
    public static final C1964u2 f17998c = new C1964u2(EnumC1667d.DICT);

    /* renamed from: d, reason: collision with root package name */
    public static final String f17999d = "getOptDictFromArray";

    /* renamed from: e, reason: collision with root package name */
    public static final List<a7.j> f18000e = C2092m.W(new a7.j(EnumC1667d.ARRAY, false), new a7.j(EnumC1667d.INTEGER, false));

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) throws JSONException {
        Object objB = C1902i.b(f17999d, list, false);
        JSONObject jSONObject = objB instanceof JSONObject ? (JSONObject) objB : null;
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    @Override // b7.AbstractC1892g, a7.g
    public final List<a7.j> b() {
        return f18000e;
    }

    @Override // a7.g
    public final String c() {
        return f17999d;
    }
}
