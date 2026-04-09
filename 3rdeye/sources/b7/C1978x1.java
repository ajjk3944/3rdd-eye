package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import c9.C2092m;
import d7.C4278a;
import java.util.List;

/* compiled from: VariableFunctions.kt */
/* renamed from: b7.x1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1978x1 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final C1978x1 f18035a = new C1978x1();

    /* renamed from: b, reason: collision with root package name */
    public static final String f18036b = "getColorValue";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f18037c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f18038d;

    static {
        a7.j jVar = new a7.j(EnumC1667d.STRING, false);
        EnumC1667d enumC1667d = EnumC1667d.COLOR;
        f18037c = C2092m.W(jVar, new a7.j(enumC1667d, false));
        f18038d = enumC1667d;
    }

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        Object obj = list.get(0);
        kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type kotlin.String");
        Object obj2 = list.get(1);
        kotlin.jvm.internal.l.d(obj2, "null cannot be cast to non-null type com.yandex.div.evaluable.types.Color");
        C4278a c4278a = (C4278a) obj2;
        Object objMo0get = ((s6.k) nVar.f13448a).mo0get((String) obj);
        C4278a c4278a2 = objMo0get instanceof C4278a ? (C4278a) objMo0get : null;
        return c4278a2 == null ? new C4278a(c4278a.f37526a) : c4278a2;
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f18037c;
    }

    @Override // a7.g
    public final String c() {
        return f18036b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f18038d;
    }

    @Override // a7.g
    public final boolean f() {
        return false;
    }
}
