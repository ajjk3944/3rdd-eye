package z8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.collections.builders.ListBuilder;

/* loaded from: classes4.dex */
public abstract class q {
    public static List a(List builder) {
        kotlin.jvm.internal.p.e(builder, "builder");
        return ((ListBuilder) builder).z();
    }

    public static final Object[] b(Object[] objArr, boolean z10) {
        kotlin.jvm.internal.p.e(objArr, "<this>");
        if (z10 && kotlin.jvm.internal.p.a(objArr.getClass(), Object[].class)) {
            return objArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        kotlin.jvm.internal.p.d(objArrCopyOf, "copyOf(...)");
        return objArrCopyOf;
    }

    public static List c() {
        return new ListBuilder(0, 1, null);
    }

    public static List d(int i10) {
        return new ListBuilder(i10);
    }

    public static List e(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        kotlin.jvm.internal.p.d(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    public static Object[] f(int i10, Object[] array) {
        kotlin.jvm.internal.p.e(array, "array");
        if (i10 < array.length) {
            array[i10] = null;
        }
        return array;
    }
}
