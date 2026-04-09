package b7;

import a7.AbstractC1664a;
import a7.C1666c;
import a7.EnumC1667d;
import c9.C2092m;
import d7.C4278a;
import java.util.List;

/* compiled from: ColorFunctions.kt */
/* loaded from: classes.dex */
public final class Y extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final Y f17620a = new Y();

    /* renamed from: b, reason: collision with root package name */
    public static final String f17621b = "rgb";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f17622c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f17623d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f17624e;

    static {
        EnumC1667d enumC1667d = EnumC1667d.NUMBER;
        f17622c = C2092m.W(new a7.j(enumC1667d, false), new a7.j(enumC1667d, false), new a7.j(enumC1667d, false));
        f17623d = EnumC1667d.COLOR;
        f17624e = true;
    }

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        try {
            Object obj = list.get(0);
            kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type kotlin.Double");
            int iA = T.a(((Double) obj).doubleValue());
            Object obj2 = list.get(1);
            kotlin.jvm.internal.l.d(obj2, "null cannot be cast to non-null type kotlin.Double");
            int iA2 = T.a(((Double) obj2).doubleValue());
            Object obj3 = list.get(2);
            kotlin.jvm.internal.l.d(obj3, "null cannot be cast to non-null type kotlin.Double");
            return new C4278a(T.a(((Double) obj3).doubleValue()) | (iA << 16) | (-16777216) | (iA2 << 8));
        } catch (IllegalArgumentException unused) {
            C1666c.d(f17621b, list, "Value out of range 0..1.", null);
            throw null;
        }
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f17622c;
    }

    @Override // a7.g
    public final String c() {
        return f17621b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f17623d;
    }

    @Override // a7.g
    public final boolean f() {
        return f17624e;
    }
}
