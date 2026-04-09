package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import c9.C2092m;
import java.util.List;
import org.json.JSONArray;

/* compiled from: DictFunctions.kt */
/* renamed from: b7.n2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1930n2 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final C1930n2 f17901a = new C1930n2();

    /* renamed from: b, reason: collision with root package name */
    public static final String f17902b = "getOptArrayFromDict";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f17903c = C2092m.W(new a7.j(EnumC1667d.DICT, false), new a7.j(EnumC1667d.STRING, true));

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f17904d = EnumC1667d.ARRAY;

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        JSONArray jSONArray = new JSONArray();
        Object objS = A9.I.s(list, jSONArray, true);
        JSONArray jSONArray2 = objS instanceof JSONArray ? (JSONArray) objS : null;
        return jSONArray2 == null ? jSONArray : jSONArray2;
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f17903c;
    }

    @Override // a7.g
    public final String c() {
        return f17902b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f17904d;
    }

    @Override // a7.g
    public final boolean f() {
        return false;
    }
}
