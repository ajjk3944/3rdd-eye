package o;

import java.lang.reflect.Array;

/* renamed from: o.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC7012c {
    static Object[] a(Object[] objArr, int i10) {
        if (objArr.length < i10) {
            return (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i10);
        }
        if (objArr.length > i10) {
            objArr[i10] = null;
        }
        return objArr;
    }
}
