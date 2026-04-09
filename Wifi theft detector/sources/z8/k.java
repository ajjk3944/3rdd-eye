package z8;

import java.lang.reflect.Array;

/* loaded from: classes4.dex */
public abstract class k {
    public static final Object[] a(Object[] reference, int i10) throws NegativeArraySizeException {
        kotlin.jvm.internal.p.e(reference, "reference");
        Object objNewInstance = Array.newInstance(reference.getClass().getComponentType(), i10);
        kotlin.jvm.internal.p.c(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (Object[]) objNewInstance;
    }

    public static final void b(int i10, int i11) {
        if (i10 <= i11) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i10 + ") is greater than size (" + i11 + ").");
    }
}
