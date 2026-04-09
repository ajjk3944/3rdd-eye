package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import c9.C2092m;
import d7.C4280c;
import java.util.List;
import org.json.JSONException;

/* compiled from: StoredValueFunctions.kt */
/* loaded from: classes.dex */
public final class R2 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final R2 f17509a = new R2();

    /* renamed from: b, reason: collision with root package name */
    public static final String f17510b = "getStoredUrlValue";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f17511c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f17512d;

    static {
        a7.j jVar = new a7.j(EnumC1667d.STRING, false);
        EnumC1667d enumC1667d = EnumC1667d.URL;
        f17511c = C2092m.W(jVar, new a7.j(enumC1667d, false));
        f17512d = enumC1667d;
    }

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) throws JSONException {
        Object obj = list.get(0);
        kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type kotlin.String");
        Object objD = ((C.e0) nVar.f13449b).d((String) obj);
        String str = objD instanceof C4280c ? ((C4280c) objD).f37533a : null;
        if (str != null) {
            return new C4280c(str);
        }
        Object obj2 = list.get(1);
        kotlin.jvm.internal.l.d(obj2, "null cannot be cast to non-null type com.yandex.div.evaluable.types.Url");
        return (C4280c) obj2;
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f17511c;
    }

    @Override // a7.g
    public final String c() {
        return f17510b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f17512d;
    }

    @Override // a7.g
    public final boolean f() {
        return false;
    }
}
