package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import c9.C2097r;
import java.util.List;
import org.json.JSONArray;

/* compiled from: ToString.kt */
/* renamed from: b7.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1860E extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final C1860E f17255a = new C1860E();

    /* renamed from: b, reason: collision with root package name */
    public static final String f17256b = "toString";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f17257c = E.u.G(new a7.j(EnumC1667d.ARRAY, false));

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f17258d = EnumC1667d.STRING;

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        Object objP0 = C2097r.p0(list);
        kotlin.jvm.internal.l.d(objP0, "null cannot be cast to non-null type org.json.JSONArray");
        String string = ((JSONArray) objP0).toString();
        kotlin.jvm.internal.l.e(string, "args.first() as JSONArray).toString()");
        return string;
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f17257c;
    }

    @Override // a7.g
    public final String c() {
        return f17256b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f17258d;
    }

    @Override // a7.g
    public final boolean f() {
        return false;
    }
}
