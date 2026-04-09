package b7;

import a7.AbstractC1664a;
import a7.C1666c;
import a7.EnumC1667d;
import c9.C2092m;
import d7.C4280c;
import java.util.List;
import org.json.JSONException;

/* compiled from: StoredValueFunctions.kt */
/* loaded from: classes.dex */
public final class Q2 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final Q2 f17492a = new Q2();

    /* renamed from: b, reason: collision with root package name */
    public static final String f17493b = "getStoredUrlValue";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f17494c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f17495d;

    static {
        EnumC1667d enumC1667d = EnumC1667d.STRING;
        f17494c = C2092m.W(new a7.j(enumC1667d, false), new a7.j(enumC1667d, false));
        f17495d = EnumC1667d.URL;
    }

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) throws JSONException {
        Object obj = list.get(0);
        kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type kotlin.String");
        Object obj2 = list.get(1);
        kotlin.jvm.internal.l.d(obj2, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj2;
        Object objD = ((C.e0) nVar.f13449b).d((String) obj);
        String str2 = objD instanceof C4280c ? ((C4280c) objD).f37533a : null;
        if (str2 != null) {
            return new C4280c(str2);
        }
        String strE = C1902i.e(str);
        if (strE != null) {
            return new C4280c(strE);
        }
        C1666c.d(f17493b, list, "Unable to convert value to Url.", null);
        throw null;
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f17494c;
    }

    @Override // a7.g
    public final String c() {
        return f17493b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f17495d;
    }

    @Override // a7.g
    public final boolean f() {
        return false;
    }
}
