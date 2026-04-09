package a7;

import a7.EnumC1667d;
import c7.e;
import c9.C2097r;
import d7.C4278a;
import d7.C4279b;
import d7.C4280c;
import io.appmetrica.analytics.impl.Oo;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: EvaluableException.kt */
/* renamed from: a7.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1666c {

    /* compiled from: EvaluableException.kt */
    /* renamed from: a7.c$a */
    public static final class a extends kotlin.jvm.internal.m implements p9.l<Object, CharSequence> {

        /* renamed from: g, reason: collision with root package name */
        public static final a f14209g = new a(1);

        @Override // p9.l
        public final CharSequence invoke(Object it) {
            kotlin.jvm.internal.l.f(it, "it");
            return C1666c.e(it);
        }
    }

    /* compiled from: EvaluableException.kt */
    /* renamed from: a7.c$b */
    public static final class b extends kotlin.jvm.internal.m implements p9.l<Object, CharSequence> {

        /* renamed from: g, reason: collision with root package name */
        public static final b f14210g = new b(1);

        @Override // p9.l
        public final CharSequence invoke(Object it) {
            kotlin.jvm.internal.l.f(it, "it");
            return C1666c.e(it);
        }
    }

    public static final String a(String name, List<? extends Object> args) {
        kotlin.jvm.internal.l.f(name, "name");
        kotlin.jvm.internal.l.f(args, "args");
        return C2097r.u0(args, null, name.concat("("), ")", a.f14209g, 25);
    }

    public static final void b(e.c.a operator, Object left, Object right) {
        EnumC1667d enumC1667d;
        String string;
        EnumC1667d enumC1667d2;
        EnumC1667d enumC1667d3;
        kotlin.jvm.internal.l.f(operator, "operator");
        kotlin.jvm.internal.l.f(left, "left");
        kotlin.jvm.internal.l.f(right, "right");
        String str = e(left) + ' ' + operator + ' ' + e(right);
        if (left.getClass().equals(right.getClass())) {
            StringBuilder sb = new StringBuilder();
            EnumC1667d.a aVar = EnumC1667d.Companion;
            if (left instanceof Long) {
                enumC1667d = EnumC1667d.INTEGER;
            } else if (left instanceof Double) {
                enumC1667d = EnumC1667d.NUMBER;
            } else if (left instanceof Boolean) {
                enumC1667d = EnumC1667d.BOOLEAN;
            } else if (left instanceof String) {
                enumC1667d = EnumC1667d.STRING;
            } else if (left instanceof C4279b) {
                enumC1667d = EnumC1667d.DATETIME;
            } else if (left instanceof C4278a) {
                enumC1667d = EnumC1667d.COLOR;
            } else if (left instanceof C4280c) {
                enumC1667d = EnumC1667d.URL;
            } else if (left instanceof JSONObject) {
                enumC1667d = EnumC1667d.DICT;
            } else {
                if (!(left instanceof JSONArray)) {
                    throw new C1665b(null, "Unable to find type for ".concat(left.getClass().getName()));
                }
                enumC1667d = EnumC1667d.ARRAY;
            }
            sb.append(enumC1667d.getTypeName$div_evaluable());
            sb.append(" type");
            string = sb.toString();
        } else {
            StringBuilder sb2 = new StringBuilder("different types: ");
            EnumC1667d.a aVar2 = EnumC1667d.Companion;
            if (left instanceof Long) {
                enumC1667d2 = EnumC1667d.INTEGER;
            } else if (left instanceof Double) {
                enumC1667d2 = EnumC1667d.NUMBER;
            } else if (left instanceof Boolean) {
                enumC1667d2 = EnumC1667d.BOOLEAN;
            } else if (left instanceof String) {
                enumC1667d2 = EnumC1667d.STRING;
            } else if (left instanceof C4279b) {
                enumC1667d2 = EnumC1667d.DATETIME;
            } else if (left instanceof C4278a) {
                enumC1667d2 = EnumC1667d.COLOR;
            } else if (left instanceof C4280c) {
                enumC1667d2 = EnumC1667d.URL;
            } else if (left instanceof JSONObject) {
                enumC1667d2 = EnumC1667d.DICT;
            } else {
                if (!(left instanceof JSONArray)) {
                    throw new C1665b(null, "Unable to find type for ".concat(left.getClass().getName()));
                }
                enumC1667d2 = EnumC1667d.ARRAY;
            }
            sb2.append(enumC1667d2.getTypeName$div_evaluable());
            sb2.append(" and ");
            if (right instanceof Long) {
                enumC1667d3 = EnumC1667d.INTEGER;
            } else if (right instanceof Double) {
                enumC1667d3 = EnumC1667d.NUMBER;
            } else if (right instanceof Boolean) {
                enumC1667d3 = EnumC1667d.BOOLEAN;
            } else if (right instanceof String) {
                enumC1667d3 = EnumC1667d.STRING;
            } else if (right instanceof C4279b) {
                enumC1667d3 = EnumC1667d.DATETIME;
            } else if (right instanceof C4278a) {
                enumC1667d3 = EnumC1667d.COLOR;
            } else if (right instanceof C4280c) {
                enumC1667d3 = EnumC1667d.URL;
            } else if (right instanceof JSONObject) {
                enumC1667d3 = EnumC1667d.DICT;
            } else {
                if (!(right instanceof JSONArray)) {
                    throw new C1665b(null, "Unable to find type for ".concat(right.getClass().getName()));
                }
                enumC1667d3 = EnumC1667d.ARRAY;
            }
            sb2.append(enumC1667d3.getTypeName$div_evaluable());
            string = sb2.toString();
        }
        c(str, "Operator '" + operator + "' cannot be applied to " + string + '.', null);
        throw null;
    }

    public static final void c(String expression, String reason, RuntimeException runtimeException) {
        kotlin.jvm.internal.l.f(expression, "expression");
        kotlin.jvm.internal.l.f(reason, "reason");
        throw new C1665b(runtimeException, Oo.f("Failed to evaluate [", expression, "]. ", reason));
    }

    public static final void d(String name, List args, String reason, IllegalArgumentException illegalArgumentException) {
        kotlin.jvm.internal.l.f(name, "name");
        kotlin.jvm.internal.l.f(args, "args");
        kotlin.jvm.internal.l.f(reason, "reason");
        c(a(name, args), reason, illegalArgumentException);
        throw null;
    }

    public static final String e(Object obj) {
        kotlin.jvm.internal.l.f(obj, "<this>");
        if (obj instanceof JSONArray) {
            return "<array>";
        }
        if (obj instanceof JSONObject) {
            return "<dict>";
        }
        if (!(obj instanceof String)) {
            return obj.toString();
        }
        return "'" + obj + '\'';
    }

    public static final String f(List<? extends Object> list) {
        kotlin.jvm.internal.l.f(list, "<this>");
        return C2097r.u0(list, ", ", null, null, b.f14210g, 30);
    }
}
