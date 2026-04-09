package is;

import io.sentry.t;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final d f12960a = new d(g.NULLABLE, false);

    /* renamed from: b, reason: collision with root package name */
    public static final d f12961b;

    /* renamed from: c, reason: collision with root package name */
    public static final d f12962c;

    /* renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f12963d;

    static {
        g gVar = g.NOT_NULL;
        f12961b = new d(gVar, false);
        f12962c = new d(gVar, true);
        String strConcat = "java/lang/".concat("Object");
        String strConcat2 = "java/util/function/".concat("Predicate");
        String strConcat3 = "java/util/function/".concat("Function");
        String strConcat4 = "java/util/function/".concat("Consumer");
        String strConcat5 = "java/util/function/".concat("BiFunction");
        String strConcat6 = "java/util/function/".concat("BiConsumer");
        String strConcat7 = "java/util/function/".concat("UnaryOperator");
        String strConcat8 = "java/util/".concat("stream/Stream");
        String strConcat9 = "java/util/".concat("Optional");
        i7.m mVar = new i7.m(1);
        new t(mVar, "java/util/".concat("Iterator")).C("forEachRemaining", new e2.i(strConcat4, 1));
        new t(mVar, "java/lang/".concat("Iterable")).C("spliterator", new l(1, 4));
        t tVar = new t(mVar, "java/util/".concat("Collection"));
        tVar.C("removeIf", new e2.i(strConcat2, 7));
        tVar.C("stream", new e2.i(strConcat8, 8));
        tVar.C("parallelStream", new e2.i(strConcat8, 9));
        new t(mVar, "java/util/".concat("List")).C("replaceAll", new e2.i(strConcat7, 10));
        t tVar2 = new t(mVar, "java/util/".concat("Map"));
        tVar2.C("forEach", new e2.i(strConcat6, 11));
        tVar2.C("putIfAbsent", new e2.i(strConcat, 12));
        tVar2.C("replace", new e2.i(strConcat, 13));
        tVar2.C("replace", new e2.i(strConcat, 14));
        tVar2.C("replaceAll", new e2.i(strConcat5, 15));
        tVar2.C("compute", new i(strConcat, 0, strConcat5));
        tVar2.C("computeIfAbsent", new i(strConcat, 1, strConcat3));
        tVar2.C("computeIfPresent", new i(strConcat, 2, strConcat5));
        tVar2.C("merge", new i(strConcat, 3, strConcat5));
        t tVar3 = new t(mVar, strConcat9);
        tVar3.C("empty", new e2.i(strConcat9, 16));
        tVar3.C("of", new i(strConcat, 4, strConcat9));
        tVar3.C("ofNullable", new i(strConcat, 5, strConcat9));
        tVar3.C("get", new e2.i(strConcat, 17));
        tVar3.C("ifPresent", new e2.i(strConcat4, 18));
        new t(mVar, "java/lang/".concat("ref/Reference")).C("get", new e2.i(strConcat, 19));
        new t(mVar, strConcat2).C("test", new e2.i(strConcat, 20));
        new t(mVar, "java/util/function/".concat("BiPredicate")).C("test", new e2.i(strConcat, 21));
        new t(mVar, strConcat4).C("accept", new e2.i(strConcat, 2));
        new t(mVar, strConcat6).C("accept", new e2.i(strConcat, 3));
        new t(mVar, strConcat3).C("apply", new e2.i(strConcat, 4));
        new t(mVar, strConcat5).C("apply", new e2.i(strConcat, 5));
        new t(mVar, "java/util/function/".concat("Supplier")).C("get", new e2.i(strConcat, 6));
        f12963d = mVar.f11274a;
    }
}
