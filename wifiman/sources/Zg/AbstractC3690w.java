package Zg;

import ah.C3852b;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: Zg.w, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3690w {
    public static List a(List builder) {
        AbstractC6492s.i(builder, "builder");
        return ((C3852b) builder).N0();
    }

    public static final Object[] b(Object[] objArr, boolean z10) {
        AbstractC6492s.i(objArr, "<this>");
        if (z10 && AbstractC6492s.d(objArr.getClass(), Object[].class)) {
            return objArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        AbstractC6492s.h(objArrCopyOf, "copyOf(...)");
        return objArrCopyOf;
    }

    public static List c() {
        return new C3852b(0, 1, null);
    }

    public static List d(int i10) {
        return new C3852b(i10);
    }

    public static List e(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        AbstractC6492s.h(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    public static List f(Iterable iterable) {
        AbstractC6492s.i(iterable, "<this>");
        List listK1 = H.k1(iterable);
        Collections.shuffle(listK1);
        return listK1;
    }

    public static Object[] g(int i10, Object[] array) {
        AbstractC6492s.i(array, "array");
        if (i10 < array.length) {
            array[i10] = null;
        }
        return array;
    }
}
