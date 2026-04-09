package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import java.util.List;
import org.json.JSONArray;

/* compiled from: ArrayFunctions.kt */
/* renamed from: b7.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1951s extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final C1951s f17965a = new C1951s();

    /* renamed from: b, reason: collision with root package name */
    public static final String f17966b = "isEmpty";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f17967c = E.u.G(new a7.j(EnumC1667d.ARRAY, false));

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f17968d = EnumC1667d.BOOLEAN;

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        Object obj = list.get(0);
        kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type org.json.JSONArray");
        return Boolean.valueOf(((JSONArray) obj).length() == 0);
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f17967c;
    }

    @Override // a7.g
    public final String c() {
        return f17966b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f17968d;
    }

    @Override // a7.g
    public final boolean f() {
        return false;
    }
}
