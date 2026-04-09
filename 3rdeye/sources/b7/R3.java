package b7;

import a7.AbstractC1664a;
import a7.C1666c;
import a7.EnumC1667d;
import c9.C2092m;
import java.util.List;

/* compiled from: StringFunctions.kt */
/* loaded from: classes.dex */
public final class R3 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final R3 f17513a = new R3();

    /* renamed from: b, reason: collision with root package name */
    public static final String f17514b = "substring";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f17515c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f17516d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f17517e;

    static {
        EnumC1667d enumC1667d = EnumC1667d.STRING;
        a7.j jVar = new a7.j(enumC1667d, false);
        EnumC1667d enumC1667d2 = EnumC1667d.INTEGER;
        f17515c = C2092m.W(jVar, new a7.j(enumC1667d2, false), new a7.j(enumC1667d2, false));
        f17516d = enumC1667d;
        f17517e = true;
    }

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        Object obj = list.get(0);
        kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj;
        Object obj2 = list.get(1);
        kotlin.jvm.internal.l.d(obj2, "null cannot be cast to non-null type kotlin.Long");
        long jLongValue = ((Long) obj2).longValue();
        Object obj3 = list.get(2);
        kotlin.jvm.internal.l.d(obj3, "null cannot be cast to non-null type kotlin.Long");
        long jLongValue2 = ((Long) obj3).longValue();
        String str2 = f17514b;
        if (jLongValue < 0 || jLongValue2 > str.length()) {
            C1666c.d(str2, list, "Indexes are out of bounds.", null);
            throw null;
        }
        if (jLongValue > jLongValue2) {
            C1666c.d(str2, list, "Indexes should be in ascending order.", null);
            throw null;
        }
        String strSubstring = str.substring((int) jLongValue, (int) jLongValue2);
        kotlin.jvm.internal.l.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f17515c;
    }

    @Override // a7.g
    public final String c() {
        return f17514b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f17516d;
    }

    @Override // a7.g
    public final boolean f() {
        return f17517e;
    }
}
