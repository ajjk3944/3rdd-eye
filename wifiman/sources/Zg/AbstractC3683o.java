package Zg;

import java.lang.reflect.Array;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: Zg.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
abstract class AbstractC3683o {
    public static final Object[] a(Object[] reference, int i10) throws NegativeArraySizeException {
        AbstractC6492s.i(reference, "reference");
        Object objNewInstance = Array.newInstance(reference.getClass().getComponentType(), i10);
        AbstractC6492s.g(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (Object[]) objNewInstance;
    }

    public static final void b(int i10, int i11) {
        if (i10 <= i11) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i10 + ") is greater than size (" + i11 + ").");
    }
}
