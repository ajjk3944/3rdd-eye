package Ah;

import Sh.F;
import Zg.AbstractC3689v;
import Zg.d0;
import gi.EnumC5923e;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.reflect.jvm.internal.impl.builtins.o;

/* loaded from: classes4.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final x f841a;

    /* renamed from: b, reason: collision with root package name */
    private static final Set f842b;

    /* renamed from: c, reason: collision with root package name */
    private static final Set f843c;

    /* renamed from: d, reason: collision with root package name */
    private static final Set f844d;

    /* renamed from: e, reason: collision with root package name */
    private static final Set f845e;

    /* renamed from: f, reason: collision with root package name */
    private static final Set f846f;

    /* renamed from: g, reason: collision with root package name */
    private static final Set f847g;

    /* renamed from: h, reason: collision with root package name */
    private static final Set f848h;

    static {
        x xVar = new x();
        f841a = xVar;
        F f10 = F.f20704a;
        f842b = d0.m(f10.f("Collection", "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");
        f843c = d0.l(d0.l(d0.l(d0.l(d0.l(d0.l(xVar.b(), f10.f("List", "sort(Ljava/util/Comparator;)V", "reversed()Ljava/util/List;")), f10.e("String", "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;")), f10.e("Double", "isInfinite()Z", "isNaN()Z")), f10.e("Float", "isInfinite()Z", "isNaN()Z")), f10.e("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V")), f10.e("CharSequence", "isEmpty()Z"));
        f844d = f10.f("List", "getFirst()Ljava/lang/Object;", "getLast()Ljava/lang/Object;");
        f845e = d0.l(d0.l(d0.l(d0.l(d0.l(d0.l(f10.e("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), f10.f("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V")), f10.e("Iterable", "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;")), f10.e("Throwable", "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V")), f10.f("Collection", "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z")), f10.f("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), f10.f("Map", "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));
        f846f = d0.l(d0.l(f10.f("Collection", "removeIf(Ljava/util/function/Predicate;)Z"), f10.f("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), f10.f("Map", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));
        Set setA = xVar.a();
        String[] strArrB = f10.b("D");
        Set setL = d0.l(setA, f10.e("Float", (String[]) Arrays.copyOf(strArrB, strArrB.length)));
        String[] strArrB2 = f10.b("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        f847g = d0.l(setL, f10.e("String", (String[]) Arrays.copyOf(strArrB2, strArrB2.length)));
        String[] strArrB3 = f10.b("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        f848h = f10.e("Throwable", (String[]) Arrays.copyOf(strArrB3, strArrB3.length));
    }

    private x() {
    }

    private final Set a() {
        F f10 = F.f20704a;
        EnumC5923e enumC5923e = EnumC5923e.BOOLEAN;
        EnumC5923e enumC5923e2 = EnumC5923e.BYTE;
        List listO = AbstractC3689v.o(enumC5923e, enumC5923e2, EnumC5923e.DOUBLE, EnumC5923e.FLOAT, enumC5923e2, EnumC5923e.INT, EnumC5923e.LONG, EnumC5923e.SHORT);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listO.iterator();
        while (it.hasNext()) {
            String strB = ((EnumC5923e) it.next()).getWrapperFqName().g().b();
            AbstractC6492s.h(strB, "asString(...)");
            String[] strArrB = f10.b("Ljava/lang/String;");
            AbstractC3689v.C(linkedHashSet, f10.e(strB, (String[]) Arrays.copyOf(strArrB, strArrB.length)));
        }
        return linkedHashSet;
    }

    private final Set b() {
        F f10 = F.f20704a;
        List<EnumC5923e> listO = AbstractC3689v.o(EnumC5923e.BOOLEAN, EnumC5923e.CHAR);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (EnumC5923e enumC5923e : listO) {
            String strB = enumC5923e.getWrapperFqName().g().b();
            AbstractC6492s.h(strB, "asString(...)");
            AbstractC3689v.C(linkedHashSet, f10.e(strB, enumC5923e.getJavaKeywordName() + "Value()" + enumC5923e.getDesc()));
        }
        return linkedHashSet;
    }

    public final Set c() {
        return f844d;
    }

    public final Set d() {
        return f842b;
    }

    public final Set e() {
        return f847g;
    }

    public final Set f() {
        return f843c;
    }

    public final Set g() {
        return f846f;
    }

    public final Set h() {
        return f848h;
    }

    public final Set i() {
        return f845e;
    }

    public final boolean j(Zh.d fqName) {
        AbstractC6492s.i(fqName, "fqName");
        return AbstractC6492s.d(fqName, o.a.f51860i) || kotlin.reflect.jvm.internal.impl.builtins.o.e(fqName);
    }

    public final boolean k(Zh.d fqName) {
        AbstractC6492s.i(fqName, "fqName");
        if (j(fqName)) {
            return true;
        }
        Zh.b bVarN = c.f771a.n(fqName);
        if (bVarN == null) {
            return false;
        }
        try {
            return Serializable.class.isAssignableFrom(Class.forName(bVarN.a().b()));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
