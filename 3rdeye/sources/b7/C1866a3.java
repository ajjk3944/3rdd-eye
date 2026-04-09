package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import c9.C2092m;
import d7.C4280c;
import java.util.List;

/* compiled from: VariableFunctions.kt */
/* renamed from: b7.a3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1866a3 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final C1866a3 f17672a = new C1866a3();

    /* renamed from: b, reason: collision with root package name */
    public static final String f17673b = "getUrlValue";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f17674c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f17675d;

    static {
        a7.j jVar = new a7.j(EnumC1667d.STRING, false);
        EnumC1667d enumC1667d = EnumC1667d.URL;
        f17674c = C2092m.W(jVar, new a7.j(enumC1667d, false));
        f17675d = enumC1667d;
    }

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        Object obj = list.get(0);
        kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type kotlin.String");
        Object objMo0get = ((s6.k) nVar.f13448a).mo0get((String) obj);
        String str = objMo0get instanceof C4280c ? ((C4280c) objMo0get).f37533a : null;
        if (str != null) {
            return new C4280c(str);
        }
        Object obj2 = list.get(1);
        kotlin.jvm.internal.l.d(obj2, "null cannot be cast to non-null type com.yandex.div.evaluable.types.Url");
        return (C4280c) obj2;
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f17674c;
    }

    @Override // a7.g
    public final String c() {
        return f17673b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f17675d;
    }

    @Override // a7.g
    public final boolean f() {
        return false;
    }
}
