package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import c9.C2092m;
import java.util.List;
import org.json.JSONObject;

/* compiled from: DictFunctions.kt */
/* renamed from: b7.v2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1969v2 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final C1969v2 f18010a = new C1969v2();

    /* renamed from: b, reason: collision with root package name */
    public static final String f18011b = "getOptDictFromDict";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f18012c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f18013d;

    static {
        EnumC1667d enumC1667d = EnumC1667d.DICT;
        f18012c = C2092m.W(new a7.j(enumC1667d, false), new a7.j(EnumC1667d.STRING, true));
        f18013d = enumC1667d;
    }

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        JSONObject jSONObject = new JSONObject();
        Object objS = A9.I.s(list, jSONObject, true);
        JSONObject jSONObject2 = objS instanceof JSONObject ? (JSONObject) objS : null;
        return jSONObject2 == null ? jSONObject : jSONObject2;
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f18012c;
    }

    @Override // a7.g
    public final String c() {
        return f18011b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f18013d;
    }

    @Override // a7.g
    public final boolean f() {
        return false;
    }
}
