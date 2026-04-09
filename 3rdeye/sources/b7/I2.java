package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import c9.C2092m;
import java.util.List;
import org.json.JSONException;

/* compiled from: StoredValueFunctions.kt */
/* loaded from: classes.dex */
public final class I2 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final I2 f17338a = new I2();

    /* renamed from: b, reason: collision with root package name */
    public static final String f17339b = "getStoredBooleanValue";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f17340c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f17341d;

    static {
        a7.j jVar = new a7.j(EnumC1667d.STRING, false);
        EnumC1667d enumC1667d = EnumC1667d.BOOLEAN;
        f17340c = C2092m.W(jVar, new a7.j(enumC1667d, false));
        f17341d = enumC1667d;
    }

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) throws JSONException {
        Object obj = list.get(0);
        kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type kotlin.String");
        Object obj2 = list.get(1);
        kotlin.jvm.internal.l.d(obj2, "null cannot be cast to non-null type kotlin.Boolean");
        Boolean bool = (Boolean) obj2;
        Object objD = ((C.e0) nVar.f13449b).d((String) obj);
        Boolean bool2 = objD instanceof Boolean ? (Boolean) objD : null;
        return bool2 == null ? bool : bool2;
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f17340c;
    }

    @Override // a7.g
    public final String c() {
        return f17339b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f17341d;
    }

    @Override // a7.g
    public final boolean f() {
        return false;
    }
}
