package org.tensorflow.lite;

import io.appmetrica.analytics.impl.Oo;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class Tensor {

    /* renamed from: a, reason: collision with root package name */
    public long f44955a;

    /* renamed from: b, reason: collision with root package name */
    public final la.a f44956b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f44957c;

    static {
        TensorFlowLite.a();
    }

    public Tensor(long j4) {
        this.f44955a = j4;
        this.f44956b = la.a.fromC(dtype(j4));
        this.f44957c = shape(j4);
    }

    public static int b(Object obj) {
        if (obj == null || !obj.getClass().isArray()) {
            return 0;
        }
        if (Array.getLength(obj) != 0) {
            return b(Array.get(obj, 0)) + 1;
        }
        throw new IllegalArgumentException("Array lengths cannot be 0.");
    }

    private static native ByteBuffer buffer(long j4);

    private static native long create(long j4, int i);

    public static void d(Object obj, int i, int[] iArr) {
        if (i == iArr.length) {
            return;
        }
        int length = Array.getLength(obj);
        int i10 = iArr[i];
        if (i10 == 0) {
            iArr[i] = length;
        } else if (i10 != length) {
            throw new IllegalArgumentException(String.format("Mismatched lengths (%d and %d) in dimension %d", Integer.valueOf(iArr[i]), Integer.valueOf(length), Integer.valueOf(i)));
        }
        for (int i11 = 0; i11 < length; i11++) {
            d(Array.get(obj, i11), i + 1, iArr);
        }
    }

    private static native void delete(long j4);

    private static native int dtype(long j4);

    public static Tensor e(int i, long j4) {
        return new Tensor(create(j4, i));
    }

    private static native int numBytes(long j4);

    private static native void readMultiDimensionalArray(long j4, Object obj);

    private static native int[] shape(long j4);

    private static native void writeDirectBuffer(long j4, ByteBuffer byteBuffer);

    private static native void writeMultiDimensionalArray(long j4, Object obj);

    public final void a() {
        delete(this.f44955a);
        this.f44955a = 0L;
    }

    public final void c(Object obj) {
        h(obj);
        if (obj instanceof ByteBuffer) {
            ((ByteBuffer) obj).put(buffer(this.f44955a).order(ByteOrder.nativeOrder()));
        } else {
            readMultiDimensionalArray(this.f44955a, obj);
        }
    }

    public final void f() {
        this.f44957c = shape(this.f44955a);
    }

    public final void g(Object obj) {
        h(obj);
        if (!(obj instanceof ByteBuffer)) {
            writeMultiDimensionalArray(this.f44955a, obj);
            return;
        }
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        if (byteBuffer.isDirect() && byteBuffer.order() == ByteOrder.nativeOrder()) {
            writeDirectBuffer(this.f44955a, byteBuffer);
        } else {
            buffer(this.f44955a).order(ByteOrder.nativeOrder()).put(byteBuffer);
        }
    }

    public final void h(Object obj) {
        la.a aVar;
        if (obj instanceof ByteBuffer) {
            ByteBuffer byteBuffer = (ByteBuffer) obj;
            if (byteBuffer.capacity() != numBytes(this.f44955a)) {
                throw new IllegalArgumentException(String.format("Cannot convert between a TensorFlowLite buffer with %d bytes and a ByteBuffer with %d bytes.", Integer.valueOf(numBytes(this.f44955a)), Integer.valueOf(byteBuffer.capacity())));
            }
            return;
        }
        if (obj != null) {
            Class<?> componentType = obj.getClass();
            while (componentType.isArray()) {
                componentType = componentType.getComponentType();
            }
            if (Float.TYPE.equals(componentType)) {
                aVar = la.a.FLOAT32;
            } else if (Integer.TYPE.equals(componentType)) {
                aVar = la.a.INT32;
            } else if (Byte.TYPE.equals(componentType)) {
                aVar = la.a.UINT8;
            } else if (Long.TYPE.equals(componentType)) {
                aVar = la.a.INT64;
            }
            la.a aVar2 = this.f44956b;
            if (aVar == aVar2) {
                int[] iArr = new int[b(obj)];
                d(obj, 0, iArr);
                if (!Arrays.equals(iArr, this.f44957c)) {
                    throw new IllegalArgumentException(Oo.h("Cannot copy between a TensorFlowLite tensor with shape ", Arrays.toString(this.f44957c), " and a Java object with shape ", Arrays.toString(iArr), "."));
                }
                return;
            }
            throw new IllegalArgumentException("Cannot convert between a TensorFlowLite tensor with type " + aVar2 + " and a Java object of type " + obj.getClass().getName() + " (which is compatible with the TensorFlowLite type " + aVar + ").");
        }
        throw new IllegalArgumentException("DataType error: cannot resolve DataType of ".concat(obj.getClass().getName()));
    }
}
