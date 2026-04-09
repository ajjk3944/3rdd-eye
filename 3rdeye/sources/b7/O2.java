package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import c9.C2092m;
import java.util.List;
import org.json.JSONException;

/* compiled from: StoredValueFunctions.kt */
/* loaded from: classes.dex */
public final class O2 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final O2 f17452a = new O2();

    /* renamed from: b, reason: collision with root package name */
    public static final String f17453b = "getStoredNumberValue";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f17454c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f17455d;

    static {
        a7.j jVar = new a7.j(EnumC1667d.STRING, false);
        EnumC1667d enumC1667d = EnumC1667d.NUMBER;
        f17454c = C2092m.W(jVar, new a7.j(enumC1667d, false));
        f17455d = enumC1667d;
    }

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) throws JSONException {
        Object obj = list.get(0);
        kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj;
        Object obj2 = list.get(1);
        kotlin.jvm.internal.l.d(obj2, "null cannot be cast to non-null type kotlin.Number");
        Number number = (Number) obj2;
        C.e0 e0Var = (C.e0) nVar.f13449b;
        Number number2 = null;
        if (!(e0Var.d(str) instanceof Long)) {
            Object objD = e0Var.d(str);
            if (objD instanceof Number) {
                number2 = (Number) objD;
            }
        }
        return number2 == null ? number : number2;
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f17454c;
    }

    @Override // a7.g
    public final String c() {
        return f17453b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f17455d;
    }

    @Override // a7.g
    public final boolean f() {
        return false;
    }
}
