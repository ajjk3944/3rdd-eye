package com.google.common.collect;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes3.dex */
abstract class H {
    static Object[] a(Object[] objArr, int i10, int i11, Object[] objArr2) {
        return Arrays.copyOfRange(objArr, i10, i11, objArr2.getClass());
    }

    static Object[] b(Object[] objArr, int i10) {
        return (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i10);
    }

    static Map c() {
        return C5063i.P();
    }
}
