package c9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: Iterables.kt */
/* renamed from: c9.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2092m extends E.u {
    public static <T> int T(Iterable<? extends T> iterable, int i) {
        kotlin.jvm.internal.l.f(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }

    public static ArrayList U(Iterable iterable) {
        kotlin.jvm.internal.l.f(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            C2095p.b0((Iterable) it.next(), arrayList);
        }
        return arrayList;
    }

    public static int V(List list) {
        kotlin.jvm.internal.l.f(list, "<this>");
        return list.size() - 1;
    }

    public static List W(Object... elements) {
        kotlin.jvm.internal.l.f(elements, "elements");
        return elements.length > 0 ? C2088i.a(elements) : C2099t.f18581b;
    }

    public static ArrayList X(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new C2086g(objArr, true));
    }

    public static final List Y(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? list : E.u.G(list.get(0)) : C2099t.f18581b;
    }

    public static void Z() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void a0() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
