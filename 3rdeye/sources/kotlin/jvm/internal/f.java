package kotlin.jvm.internal;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: CollectionToArray.kt */
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final Object[] f43654a = new Object[0];

    public static final Object[] a(Collection<?> collection) {
        int size = collection.size();
        Object[] objArr = f43654a;
        if (size != 0) {
            Iterator<?> it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArrCopyOf = new Object[size];
                int i = 0;
                while (true) {
                    int i10 = i + 1;
                    objArrCopyOf[i] = it.next();
                    if (i10 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i11 = ((i10 * 3) + 1) >>> 1;
                        if (i11 <= i10) {
                            i11 = 2147483645;
                            if (i10 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i11);
                    } else if (!it.hasNext()) {
                        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i10);
                        l.e(objArrCopyOf2, "copyOf(...)");
                        return objArrCopyOf2;
                    }
                    i = i10;
                }
            }
        }
        return objArr;
    }

    public static final Object[] b(Collection<?> collection, Object[] objArr) throws NegativeArraySizeException {
        Object[] objArrCopyOf;
        int size = collection.size();
        int i = 0;
        if (size != 0) {
            Iterator<?> it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArrCopyOf = objArr;
                } else {
                    Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    l.d(objNewInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                    objArrCopyOf = (Object[]) objNewInstance;
                }
                while (true) {
                    int i10 = i + 1;
                    objArrCopyOf[i] = it.next();
                    if (i10 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i11 = ((i10 * 3) + 1) >>> 1;
                        if (i11 <= i10) {
                            i11 = 2147483645;
                            if (i10 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i11);
                    } else if (!it.hasNext()) {
                        if (objArrCopyOf == objArr) {
                            objArr[i10] = null;
                            return objArr;
                        }
                        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i10);
                        l.e(objArrCopyOf2, "copyOf(...)");
                        return objArrCopyOf2;
                    }
                    i = i10;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }
}
