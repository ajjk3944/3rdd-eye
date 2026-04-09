package d5;

import java.util.ArrayList;
import java.util.List;

/* renamed from: d5.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2283k extends a4.p {
    public static ArrayList K(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new C2279g(objArr, true));
    }

    public static int L(List list) {
        q5.i.e(list, "<this>");
        return list.size() - 1;
    }

    public static List M(Object... objArr) {
        return objArr.length > 0 ? AbstractC2281i.Q(objArr) : s.f19824a;
    }

    public static final List N(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? list : a4.p.l(list.get(0)) : s.f19824a;
    }

    public static void O() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
