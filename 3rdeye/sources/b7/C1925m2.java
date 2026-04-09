package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import c9.C2092m;
import java.util.List;
import org.json.JSONArray;

/* compiled from: ArrayFunctions.kt */
/* renamed from: b7.m2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1925m2 extends AbstractC1976x {

    /* renamed from: c, reason: collision with root package name */
    public static final C1925m2 f17886c = new C1925m2(EnumC1667d.ARRAY);

    /* renamed from: d, reason: collision with root package name */
    public static final String f17887d = "getOptArrayFromArray";

    /* renamed from: e, reason: collision with root package name */
    public static final List<a7.j> f17888e = C2092m.W(new a7.j(EnumC1667d.ARRAY, false), new a7.j(EnumC1667d.INTEGER, false));

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        Object objC = C1902i.c(f17887d, list);
        JSONArray jSONArray = objC instanceof JSONArray ? (JSONArray) objC : null;
        return jSONArray == null ? new JSONArray() : jSONArray;
    }

    @Override // b7.AbstractC1976x, a7.g
    public final List<a7.j> b() {
        return f17888e;
    }

    @Override // a7.g
    public final String c() {
        return f17887d;
    }
}
