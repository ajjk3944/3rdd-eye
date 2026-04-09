package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import java.util.List;
import org.json.JSONArray;

/* compiled from: ArrayFunctions.kt */
/* renamed from: b7.e1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1884e1 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final C1884e1 f17744a = new C1884e1();

    /* renamed from: b, reason: collision with root package name */
    public static final String f17745b = "len";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f17746c = E.u.G(new a7.j(EnumC1667d.ARRAY, false));

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f17747d = EnumC1667d.INTEGER;

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        kotlin.jvm.internal.l.d(list.get(0), "null cannot be cast to non-null type org.json.JSONArray");
        return Long.valueOf(((JSONArray) r1).length());
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f17746c;
    }

    @Override // a7.g
    public final String c() {
        return f17745b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f17747d;
    }

    @Override // a7.g
    public final boolean f() {
        return false;
    }
}
