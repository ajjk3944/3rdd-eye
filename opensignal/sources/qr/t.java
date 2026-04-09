package qr;

import com.google.android.gms.internal.measurement.e5;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import mq.f0;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final LinkedHashSet f21013a = f0.O(js.h.g("Collection", "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");

    /* renamed from: b, reason: collision with root package name */
    public static final LinkedHashSet f21014b;

    /* renamed from: c, reason: collision with root package name */
    public static final LinkedHashSet f21015c;

    /* renamed from: d, reason: collision with root package name */
    public static final LinkedHashSet f21016d;

    /* renamed from: e, reason: collision with root package name */
    public static final LinkedHashSet f21017e;

    /* renamed from: f, reason: collision with root package name */
    public static final LinkedHashSet f21018f;

    static {
        List<ys.c> listI = e5.I(ys.c.BOOLEAN, ys.c.CHAR);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (ys.c cVar : listI) {
            String strB = cVar.getWrapperFqName().f().b();
            br.l.d(strB, "it.wrapperFqName.shortName().asString()");
            mq.t.d0(linkedHashSet, js.h.f(strB, cVar.getJavaKeywordName() + "Value()" + cVar.getDesc()));
        }
        f21014b = f0.N(f0.N(f0.N(f0.N(f0.N(f0.N(linkedHashSet, js.h.g("List", "sort(Ljava/util/Comparator;)V")), js.h.f("String", "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;")), js.h.f("Double", "isInfinite()Z", "isNaN()Z")), js.h.f("Float", "isInfinite()Z", "isNaN()Z")), js.h.f("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V")), js.h.f("CharSequence", "isEmpty()Z"));
        f21015c = f0.N(f0.N(f0.N(f0.N(f0.N(f0.N(js.h.f("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), js.h.g("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V")), js.h.f("Iterable", "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;")), js.h.f("Throwable", "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V")), js.h.g("Collection", "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z")), js.h.g("List", "replaceAll(Ljava/util/function/UnaryOperator;)V")), js.h.g("Map", "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));
        f21016d = f0.N(f0.N(js.h.g("Collection", "removeIf(Ljava/util/function/Predicate;)Z"), js.h.g("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V")), js.h.g("Map", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));
        ys.c cVar2 = ys.c.BOOLEAN;
        ys.c cVar3 = ys.c.BYTE;
        List listI2 = e5.I(cVar2, cVar3, ys.c.DOUBLE, ys.c.FLOAT, cVar3, ys.c.INT, ys.c.LONG, ys.c.SHORT);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it = listI2.iterator();
        while (it.hasNext()) {
            String strB2 = ((ys.c) it.next()).getWrapperFqName().f().b();
            br.l.d(strB2, "it.wrapperFqName.shortName().asString()");
            String[] strArrB = js.h.b("Ljava/lang/String;");
            mq.t.d0(linkedHashSet2, js.h.f(strB2, (String[]) Arrays.copyOf(strArrB, strArrB.length)));
        }
        String[] strArrB2 = js.h.b("D");
        LinkedHashSet linkedHashSetN = f0.N(linkedHashSet2, js.h.f("Float", (String[]) Arrays.copyOf(strArrB2, strArrB2.length)));
        String[] strArrB3 = js.h.b("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        f21017e = f0.N(linkedHashSetN, js.h.f("String", (String[]) Arrays.copyOf(strArrB3, strArrB3.length)));
        String[] strArrB4 = js.h.b("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        f21018f = js.h.f("Throwable", (String[]) Arrays.copyOf(strArrB4, strArrB4.length));
    }
}
