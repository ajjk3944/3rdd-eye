package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import c9.C2092m;
import d7.C4278a;
import java.util.List;
import org.json.JSONException;

/* compiled from: StoredValueFunctions.kt */
/* loaded from: classes.dex */
public final class K2 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final K2 f17378a = new K2();

    /* renamed from: b, reason: collision with root package name */
    public static final String f17379b = "getStoredColorValue";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f17380c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f17381d;

    static {
        EnumC1667d enumC1667d = EnumC1667d.STRING;
        f17380c = C2092m.W(new a7.j(enumC1667d, false), new a7.j(enumC1667d, false));
        f17381d = EnumC1667d.COLOR;
    }

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) throws JSONException, IllegalArgumentException {
        Object obj = list.get(0);
        kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type kotlin.String");
        Object obj2 = list.get(1);
        kotlin.jvm.internal.l.d(obj2, "null cannot be cast to non-null type kotlin.String");
        int iA = C4278a.C0440a.a((String) obj2);
        Object objD = ((C.e0) nVar.f13449b).d((String) obj);
        C4278a c4278a = objD instanceof C4278a ? (C4278a) objD : null;
        return c4278a == null ? new C4278a(iA) : c4278a;
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f17380c;
    }

    @Override // a7.g
    public final String c() {
        return f17379b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f17381d;
    }

    @Override // a7.g
    public final boolean f() {
        return false;
    }
}
