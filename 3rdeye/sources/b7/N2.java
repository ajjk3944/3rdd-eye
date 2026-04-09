package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import c9.C2092m;
import java.util.List;
import org.json.JSONException;

/* compiled from: StoredValueFunctions.kt */
/* loaded from: classes.dex */
public final class N2 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final N2 f17433a = new N2();

    /* renamed from: b, reason: collision with root package name */
    public static final String f17434b = "getStoredIntegerValue";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f17435c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f17436d;

    static {
        a7.j jVar = new a7.j(EnumC1667d.STRING, false);
        EnumC1667d enumC1667d = EnumC1667d.INTEGER;
        f17435c = C2092m.W(jVar, new a7.j(enumC1667d, false));
        f17436d = enumC1667d;
    }

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) throws JSONException {
        Object obj = list.get(0);
        kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type kotlin.String");
        Object obj2 = list.get(1);
        kotlin.jvm.internal.l.d(obj2, "null cannot be cast to non-null type kotlin.Long");
        Long l5 = (Long) obj2;
        Object objD = ((C.e0) nVar.f13449b).d((String) obj);
        Long l10 = objD instanceof Long ? (Long) objD : null;
        return l10 == null ? l5 : l10;
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f17435c;
    }

    @Override // a7.g
    public final String c() {
        return f17434b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f17436d;
    }

    @Override // a7.g
    public final boolean f() {
        return false;
    }
}
