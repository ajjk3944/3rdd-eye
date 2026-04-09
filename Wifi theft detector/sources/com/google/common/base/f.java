package com.google.common.base;

import java.util.Arrays;

/* loaded from: classes2.dex */
public abstract class f extends b {
    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }
}
