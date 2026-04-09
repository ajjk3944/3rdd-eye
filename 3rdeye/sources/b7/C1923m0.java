package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import c9.C2092m;
import java.util.List;
import org.json.JSONObject;

/* compiled from: DictFunctions.kt */
/* renamed from: b7.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1923m0 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final C1923m0 f17880a = new C1923m0();

    /* renamed from: b, reason: collision with root package name */
    public static final String f17881b = "containsKey";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f17882c = C2092m.W(new a7.j(EnumC1667d.DICT, false), new a7.j(EnumC1667d.STRING, false));

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f17883d = EnumC1667d.BOOLEAN;

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        Object obj = list.get(0);
        kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type org.json.JSONObject");
        Object obj2 = list.get(1);
        kotlin.jvm.internal.l.d(obj2, "null cannot be cast to non-null type kotlin.String");
        return Boolean.valueOf(((JSONObject) obj).has((String) obj2));
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f17882c;
    }

    @Override // a7.g
    public final String c() {
        return f17881b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f17883d;
    }

    @Override // a7.g
    public final boolean f() {
        return false;
    }
}
