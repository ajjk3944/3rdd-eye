package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import java.util.List;
import org.json.JSONObject;

/* compiled from: DictFunctions.kt */
/* renamed from: b7.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1943q0 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final C1943q0 f17940a = new C1943q0();

    /* renamed from: b, reason: collision with root package name */
    public static final String f17941b = "isEmpty";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f17942c = E.u.G(new a7.j(EnumC1667d.DICT, false));

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f17943d = EnumC1667d.BOOLEAN;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f17944e = true;

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        Object obj = list.get(0);
        kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type org.json.JSONObject");
        return Boolean.valueOf(((JSONObject) obj).length() == 0);
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f17942c;
    }

    @Override // a7.g
    public final String c() {
        return f17941b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f17943d;
    }

    @Override // a7.g
    public final boolean f() {
        return f17944e;
    }
}
