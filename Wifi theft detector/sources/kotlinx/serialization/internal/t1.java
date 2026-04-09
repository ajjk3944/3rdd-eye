package kotlinx.serialization.internal;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class t1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Map f22918a = kotlin.collections.a.k(y8.i.a(kotlin.jvm.internal.t.b(String.class), x9.a.B(kotlin.jvm.internal.w.f22046a)), y8.i.a(kotlin.jvm.internal.t.b(Character.TYPE), x9.a.v(kotlin.jvm.internal.e.f22028a)), y8.i.a(kotlin.jvm.internal.t.b(char[].class), x9.a.d()), y8.i.a(kotlin.jvm.internal.t.b(Double.TYPE), x9.a.w(kotlin.jvm.internal.j.f22037a)), y8.i.a(kotlin.jvm.internal.t.b(double[].class), x9.a.e()), y8.i.a(kotlin.jvm.internal.t.b(Float.TYPE), x9.a.x(kotlin.jvm.internal.k.f22038a)), y8.i.a(kotlin.jvm.internal.t.b(float[].class), x9.a.f()), y8.i.a(kotlin.jvm.internal.t.b(Long.TYPE), x9.a.z(kotlin.jvm.internal.r.f22040a)), y8.i.a(kotlin.jvm.internal.t.b(long[].class), x9.a.i()), y8.i.a(kotlin.jvm.internal.t.b(y8.n.class), x9.a.F(y8.n.f25188b)), y8.i.a(kotlin.jvm.internal.t.b(y8.o.class), x9.a.q()), y8.i.a(kotlin.jvm.internal.t.b(Integer.TYPE), x9.a.y(kotlin.jvm.internal.o.f22039a)), y8.i.a(kotlin.jvm.internal.t.b(int[].class), x9.a.g()), y8.i.a(kotlin.jvm.internal.t.b(y8.l.class), x9.a.E(y8.l.f25183b)), y8.i.a(kotlin.jvm.internal.t.b(y8.m.class), x9.a.p()), y8.i.a(kotlin.jvm.internal.t.b(Short.TYPE), x9.a.A(kotlin.jvm.internal.v.f22045a)), y8.i.a(kotlin.jvm.internal.t.b(short[].class), x9.a.m()), y8.i.a(kotlin.jvm.internal.t.b(y8.q.class), x9.a.G(y8.q.f25194b)), y8.i.a(kotlin.jvm.internal.t.b(y8.r.class), x9.a.r()), y8.i.a(kotlin.jvm.internal.t.b(Byte.TYPE), x9.a.u(kotlin.jvm.internal.d.f22027a)), y8.i.a(kotlin.jvm.internal.t.b(byte[].class), x9.a.c()), y8.i.a(kotlin.jvm.internal.t.b(y8.j.class), x9.a.D(y8.j.f25178b)), y8.i.a(kotlin.jvm.internal.t.b(y8.k.class), x9.a.o()), y8.i.a(kotlin.jvm.internal.t.b(Boolean.TYPE), x9.a.t(kotlin.jvm.internal.c.f22026a)), y8.i.a(kotlin.jvm.internal.t.b(boolean[].class), x9.a.b()), y8.i.a(kotlin.jvm.internal.t.b(y8.s.class), x9.a.H(y8.s.f25199a)), y8.i.a(kotlin.jvm.internal.t.b(t9.b.class), x9.a.C(t9.b.f24466b)));

    public static final kotlinx.serialization.descriptors.f a(String serialName, kotlinx.serialization.descriptors.e kind) {
        kotlin.jvm.internal.p.e(serialName, "serialName");
        kotlin.jvm.internal.p.e(kind, "kind");
        d(serialName);
        return new s1(serialName, kind);
    }

    public static final kotlinx.serialization.b b(r9.c cVar) {
        kotlin.jvm.internal.p.e(cVar, "<this>");
        return (kotlinx.serialization.b) f22918a.get(cVar);
    }

    public static final String c(String str) {
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char cCharAt = str.charAt(0);
        sb.append((Object) (Character.isLowerCase(cCharAt) ? s9.b.e(cCharAt) : String.valueOf(cCharAt)));
        String strSubstring = str.substring(1);
        kotlin.jvm.internal.p.d(strSubstring, "this as java.lang.String).substring(startIndex)");
        sb.append(strSubstring);
        return sb.toString();
    }

    public static final void d(String str) {
        Iterator it = f22918a.keySet().iterator();
        while (it.hasNext()) {
            String strI = ((r9.c) it.next()).i();
            kotlin.jvm.internal.p.b(strI);
            String strC = c(strI);
            if (s9.r.x(str, "kotlin." + strC, true) || s9.r.x(str, strC, true)) {
                throw new IllegalArgumentException(s9.k.j("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name " + str + " there already exist " + c(strC) + "Serializer.\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
            }
        }
    }
}
