package kotlin.jvm.internal;

import java.util.Iterator;

/* loaded from: classes4.dex */
public abstract class b {
    public static final Iterator a(Object[] array) {
        p.e(array, "array");
        return new a(array);
    }
}
