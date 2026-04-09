package com.google.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;

/* compiled from: UnsafeUtil.java */
/* loaded from: classes2.dex */
public final class y0 {
    private static final long BOOLEAN_ARRAY_BASE_OFFSET;
    private static final long BOOLEAN_ARRAY_INDEX_SCALE;
    private static final long BUFFER_ADDRESS_OFFSET;
    private static final int BYTE_ARRAY_ALIGNMENT;
    static final long BYTE_ARRAY_BASE_OFFSET;
    private static final long DOUBLE_ARRAY_BASE_OFFSET;
    private static final long DOUBLE_ARRAY_INDEX_SCALE;
    private static final long FLOAT_ARRAY_BASE_OFFSET;
    private static final long FLOAT_ARRAY_INDEX_SCALE;
    private static final long INT_ARRAY_BASE_OFFSET;
    private static final long INT_ARRAY_INDEX_SCALE;
    static final boolean IS_BIG_ENDIAN;
    private static final long LONG_ARRAY_BASE_OFFSET;
    private static final long LONG_ARRAY_INDEX_SCALE;
    private static final long OBJECT_ARRAY_BASE_OFFSET;
    private static final long OBJECT_ARRAY_INDEX_SCALE;
    private static final int STRIDE = 8;
    private static final int STRIDE_ALIGNMENT_MASK = 7;
    private static final Unsafe UNSAFE = getUnsafe();
    private static final Class<?> MEMORY_CLASS = C4021d.getMemoryClass();
    private static final boolean IS_ANDROID_64 = determineAndroidSupportByAddressSize(Long.TYPE);
    private static final boolean IS_ANDROID_32 = determineAndroidSupportByAddressSize(Integer.TYPE);
    private static final e MEMORY_ACCESSOR = getMemoryAccessor();
    private static final boolean HAS_UNSAFE_BYTEBUFFER_OPERATIONS = supportsUnsafeByteBufferOperations();
    private static final boolean HAS_UNSAFE_ARRAY_OPERATIONS = supportsUnsafeArrayOperations();

    /* compiled from: UnsafeUtil.java */
    public class a implements PrivilegedExceptionAction<Unsafe> {
        @Override // java.security.PrivilegedExceptionAction
        public Unsafe run() throws Exception {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }
    }

    /* compiled from: UnsafeUtil.java */
    public static final class b extends e {
        private static final long SMALL_ADDRESS_MASK = -1;

        public b(Unsafe unsafe) {
            super(unsafe);
        }

        private static int smallAddress(long j4) {
            return (int) j4;
        }

        @Override // com.google.protobuf.y0.e
        public void copyMemory(long j4, byte[] bArr, long j10, long j11) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.y0.e
        public boolean getBoolean(Object obj, long j4) {
            return y0.IS_BIG_ENDIAN ? y0.getBooleanBigEndian(obj, j4) : y0.getBooleanLittleEndian(obj, j4);
        }

        @Override // com.google.protobuf.y0.e
        public byte getByte(Object obj, long j4) {
            return y0.IS_BIG_ENDIAN ? y0.getByteBigEndian(obj, j4) : y0.getByteLittleEndian(obj, j4);
        }

        @Override // com.google.protobuf.y0.e
        public double getDouble(Object obj, long j4) {
            return Double.longBitsToDouble(getLong(obj, j4));
        }

        @Override // com.google.protobuf.y0.e
        public float getFloat(Object obj, long j4) {
            return Float.intBitsToFloat(getInt(obj, j4));
        }

        @Override // com.google.protobuf.y0.e
        public int getInt(long j4) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.y0.e
        public long getLong(long j4) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.y0.e
        public Object getStaticObject(Field field) {
            try {
                return field.get(null);
            } catch (IllegalAccessException unused) {
                return null;
            }
        }

        @Override // com.google.protobuf.y0.e
        public void putBoolean(Object obj, long j4, boolean z10) {
            if (y0.IS_BIG_ENDIAN) {
                y0.putBooleanBigEndian(obj, j4, z10);
            } else {
                y0.putBooleanLittleEndian(obj, j4, z10);
            }
        }

        @Override // com.google.protobuf.y0.e
        public void putByte(Object obj, long j4, byte b10) {
            if (y0.IS_BIG_ENDIAN) {
                y0.putByteBigEndian(obj, j4, b10);
            } else {
                y0.putByteLittleEndian(obj, j4, b10);
            }
        }

        @Override // com.google.protobuf.y0.e
        public void putDouble(Object obj, long j4, double d10) {
            putLong(obj, j4, Double.doubleToLongBits(d10));
        }

        @Override // com.google.protobuf.y0.e
        public void putFloat(Object obj, long j4, float f10) {
            putInt(obj, j4, Float.floatToIntBits(f10));
        }

        @Override // com.google.protobuf.y0.e
        public void putInt(long j4, int i) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.y0.e
        public void putLong(long j4, long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.y0.e
        public boolean supportsUnsafeByteBufferOperations() {
            return false;
        }

        @Override // com.google.protobuf.y0.e
        public void copyMemory(byte[] bArr, long j4, long j10, long j11) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.y0.e
        public byte getByte(long j4) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.y0.e
        public void putByte(long j4, byte b10) {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: UnsafeUtil.java */
    public static final class c extends e {
        public c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.protobuf.y0.e
        public void copyMemory(long j4, byte[] bArr, long j10, long j11) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.y0.e
        public boolean getBoolean(Object obj, long j4) {
            return y0.IS_BIG_ENDIAN ? y0.getBooleanBigEndian(obj, j4) : y0.getBooleanLittleEndian(obj, j4);
        }

        @Override // com.google.protobuf.y0.e
        public byte getByte(Object obj, long j4) {
            return y0.IS_BIG_ENDIAN ? y0.getByteBigEndian(obj, j4) : y0.getByteLittleEndian(obj, j4);
        }

        @Override // com.google.protobuf.y0.e
        public double getDouble(Object obj, long j4) {
            return Double.longBitsToDouble(getLong(obj, j4));
        }

        @Override // com.google.protobuf.y0.e
        public float getFloat(Object obj, long j4) {
            return Float.intBitsToFloat(getInt(obj, j4));
        }

        @Override // com.google.protobuf.y0.e
        public int getInt(long j4) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.y0.e
        public long getLong(long j4) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.y0.e
        public Object getStaticObject(Field field) {
            try {
                return field.get(null);
            } catch (IllegalAccessException unused) {
                return null;
            }
        }

        @Override // com.google.protobuf.y0.e
        public void putBoolean(Object obj, long j4, boolean z10) {
            if (y0.IS_BIG_ENDIAN) {
                y0.putBooleanBigEndian(obj, j4, z10);
            } else {
                y0.putBooleanLittleEndian(obj, j4, z10);
            }
        }

        @Override // com.google.protobuf.y0.e
        public void putByte(Object obj, long j4, byte b10) {
            if (y0.IS_BIG_ENDIAN) {
                y0.putByteBigEndian(obj, j4, b10);
            } else {
                y0.putByteLittleEndian(obj, j4, b10);
            }
        }

        @Override // com.google.protobuf.y0.e
        public void putDouble(Object obj, long j4, double d10) {
            putLong(obj, j4, Double.doubleToLongBits(d10));
        }

        @Override // com.google.protobuf.y0.e
        public void putFloat(Object obj, long j4, float f10) {
            putInt(obj, j4, Float.floatToIntBits(f10));
        }

        @Override // com.google.protobuf.y0.e
        public void putInt(long j4, int i) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.y0.e
        public void putLong(long j4, long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.y0.e
        public boolean supportsUnsafeByteBufferOperations() {
            return false;
        }

        @Override // com.google.protobuf.y0.e
        public void copyMemory(byte[] bArr, long j4, long j10, long j11) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.y0.e
        public byte getByte(long j4) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.y0.e
        public void putByte(long j4, byte b10) {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: UnsafeUtil.java */
    public static final class d extends e {
        public d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.protobuf.y0.e
        public void copyMemory(long j4, byte[] bArr, long j10, long j11) {
            this.unsafe.copyMemory((Object) null, j4, bArr, y0.BYTE_ARRAY_BASE_OFFSET + j10, j11);
        }

        @Override // com.google.protobuf.y0.e
        public boolean getBoolean(Object obj, long j4) {
            return this.unsafe.getBoolean(obj, j4);
        }

        @Override // com.google.protobuf.y0.e
        public byte getByte(Object obj, long j4) {
            return this.unsafe.getByte(obj, j4);
        }

        @Override // com.google.protobuf.y0.e
        public double getDouble(Object obj, long j4) {
            return this.unsafe.getDouble(obj, j4);
        }

        @Override // com.google.protobuf.y0.e
        public float getFloat(Object obj, long j4) {
            return this.unsafe.getFloat(obj, j4);
        }

        @Override // com.google.protobuf.y0.e
        public int getInt(long j4) {
            return this.unsafe.getInt(j4);
        }

        @Override // com.google.protobuf.y0.e
        public long getLong(long j4) {
            return this.unsafe.getLong(j4);
        }

        @Override // com.google.protobuf.y0.e
        public Object getStaticObject(Field field) {
            return getObject(this.unsafe.staticFieldBase(field), this.unsafe.staticFieldOffset(field));
        }

        @Override // com.google.protobuf.y0.e
        public void putBoolean(Object obj, long j4, boolean z10) {
            this.unsafe.putBoolean(obj, j4, z10);
        }

        @Override // com.google.protobuf.y0.e
        public void putByte(Object obj, long j4, byte b10) {
            this.unsafe.putByte(obj, j4, b10);
        }

        @Override // com.google.protobuf.y0.e
        public void putDouble(Object obj, long j4, double d10) {
            this.unsafe.putDouble(obj, j4, d10);
        }

        @Override // com.google.protobuf.y0.e
        public void putFloat(Object obj, long j4, float f10) {
            this.unsafe.putFloat(obj, j4, f10);
        }

        @Override // com.google.protobuf.y0.e
        public void putInt(long j4, int i) {
            this.unsafe.putInt(j4, i);
        }

        @Override // com.google.protobuf.y0.e
        public void putLong(long j4, long j10) {
            this.unsafe.putLong(j4, j10);
        }

        @Override // com.google.protobuf.y0.e
        public boolean supportsUnsafeArrayOperations() {
            if (!super.supportsUnsafeArrayOperations()) {
                return false;
            }
            try {
                Class<?> cls = this.unsafe.getClass();
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getByte", Object.class, cls2);
                cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                cls.getMethod("getBoolean", Object.class, cls2);
                cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                cls.getMethod("getFloat", Object.class, cls2);
                cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                cls.getMethod("getDouble", Object.class, cls2);
                cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                return true;
            } catch (Throwable th) {
                y0.logMissingMethod(th);
                return false;
            }
        }

        @Override // com.google.protobuf.y0.e
        public boolean supportsUnsafeByteBufferOperations() {
            if (!super.supportsUnsafeByteBufferOperations()) {
                return false;
            }
            try {
                Class<?> cls = this.unsafe.getClass();
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getByte", cls2);
                cls.getMethod("putByte", cls2, Byte.TYPE);
                cls.getMethod("getInt", cls2);
                cls.getMethod("putInt", cls2, Integer.TYPE);
                cls.getMethod("getLong", cls2);
                cls.getMethod("putLong", cls2, cls2);
                cls.getMethod("copyMemory", cls2, cls2, cls2);
                cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                return true;
            } catch (Throwable th) {
                y0.logMissingMethod(th);
                return false;
            }
        }

        @Override // com.google.protobuf.y0.e
        public void copyMemory(byte[] bArr, long j4, long j10, long j11) {
            this.unsafe.copyMemory(bArr, y0.BYTE_ARRAY_BASE_OFFSET + j4, (Object) null, j10, j11);
        }

        @Override // com.google.protobuf.y0.e
        public byte getByte(long j4) {
            return this.unsafe.getByte(j4);
        }

        @Override // com.google.protobuf.y0.e
        public void putByte(long j4, byte b10) {
            this.unsafe.putByte(j4, b10);
        }
    }

    /* compiled from: UnsafeUtil.java */
    public static abstract class e {
        Unsafe unsafe;

        public e(Unsafe unsafe) {
            this.unsafe = unsafe;
        }

        public final int arrayBaseOffset(Class<?> cls) {
            return this.unsafe.arrayBaseOffset(cls);
        }

        public final int arrayIndexScale(Class<?> cls) {
            return this.unsafe.arrayIndexScale(cls);
        }

        public abstract void copyMemory(long j4, byte[] bArr, long j10, long j11);

        public abstract void copyMemory(byte[] bArr, long j4, long j10, long j11);

        public abstract boolean getBoolean(Object obj, long j4);

        public abstract byte getByte(long j4);

        public abstract byte getByte(Object obj, long j4);

        public abstract double getDouble(Object obj, long j4);

        public abstract float getFloat(Object obj, long j4);

        public abstract int getInt(long j4);

        public final int getInt(Object obj, long j4) {
            return this.unsafe.getInt(obj, j4);
        }

        public abstract long getLong(long j4);

        public final long getLong(Object obj, long j4) {
            return this.unsafe.getLong(obj, j4);
        }

        public final Object getObject(Object obj, long j4) {
            return this.unsafe.getObject(obj, j4);
        }

        public abstract Object getStaticObject(Field field);

        public final long objectFieldOffset(Field field) {
            return this.unsafe.objectFieldOffset(field);
        }

        public abstract void putBoolean(Object obj, long j4, boolean z10);

        public abstract void putByte(long j4, byte b10);

        public abstract void putByte(Object obj, long j4, byte b10);

        public abstract void putDouble(Object obj, long j4, double d10);

        public abstract void putFloat(Object obj, long j4, float f10);

        public abstract void putInt(long j4, int i);

        public final void putInt(Object obj, long j4, int i) {
            this.unsafe.putInt(obj, j4, i);
        }

        public abstract void putLong(long j4, long j10);

        public final void putLong(Object obj, long j4, long j10) {
            this.unsafe.putLong(obj, j4, j10);
        }

        public final void putObject(Object obj, long j4, Object obj2) {
            this.unsafe.putObject(obj, j4, obj2);
        }

        public boolean supportsUnsafeArrayOperations() {
            Unsafe unsafe = this.unsafe;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th) {
                y0.logMissingMethod(th);
                return false;
            }
        }

        public boolean supportsUnsafeByteBufferOperations() {
            Unsafe unsafe = this.unsafe;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return y0.bufferAddressField() != null;
            } catch (Throwable th) {
                y0.logMissingMethod(th);
                return false;
            }
        }
    }

    static {
        long jArrayBaseOffset = arrayBaseOffset(byte[].class);
        BYTE_ARRAY_BASE_OFFSET = jArrayBaseOffset;
        BOOLEAN_ARRAY_BASE_OFFSET = arrayBaseOffset(boolean[].class);
        BOOLEAN_ARRAY_INDEX_SCALE = arrayIndexScale(boolean[].class);
        INT_ARRAY_BASE_OFFSET = arrayBaseOffset(int[].class);
        INT_ARRAY_INDEX_SCALE = arrayIndexScale(int[].class);
        LONG_ARRAY_BASE_OFFSET = arrayBaseOffset(long[].class);
        LONG_ARRAY_INDEX_SCALE = arrayIndexScale(long[].class);
        FLOAT_ARRAY_BASE_OFFSET = arrayBaseOffset(float[].class);
        FLOAT_ARRAY_INDEX_SCALE = arrayIndexScale(float[].class);
        DOUBLE_ARRAY_BASE_OFFSET = arrayBaseOffset(double[].class);
        DOUBLE_ARRAY_INDEX_SCALE = arrayIndexScale(double[].class);
        OBJECT_ARRAY_BASE_OFFSET = arrayBaseOffset(Object[].class);
        OBJECT_ARRAY_INDEX_SCALE = arrayIndexScale(Object[].class);
        BUFFER_ADDRESS_OFFSET = fieldOffset(bufferAddressField());
        BYTE_ARRAY_ALIGNMENT = (int) (jArrayBaseOffset & 7);
        IS_BIG_ENDIAN = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private y0() {
    }

    public static long addressOffset(ByteBuffer byteBuffer) {
        return MEMORY_ACCESSOR.getLong(byteBuffer, BUFFER_ADDRESS_OFFSET);
    }

    public static <T> T allocateInstance(Class<T> cls) {
        try {
            return (T) UNSAFE.allocateInstance(cls);
        } catch (InstantiationException e4) {
            throw new IllegalStateException(e4);
        }
    }

    private static int arrayBaseOffset(Class<?> cls) {
        if (HAS_UNSAFE_ARRAY_OPERATIONS) {
            return MEMORY_ACCESSOR.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int arrayIndexScale(Class<?> cls) {
        if (HAS_UNSAFE_ARRAY_OPERATIONS) {
            return MEMORY_ACCESSOR.arrayIndexScale(cls);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Field bufferAddressField() {
        Field field;
        if (C4021d.isOnAndroidDevice() && (field = field(Buffer.class, "effectiveDirectAddress")) != null) {
            return field;
        }
        Field field2 = field(Buffer.class, "address");
        if (field2 == null || field2.getType() != Long.TYPE) {
            return null;
        }
        return field2;
    }

    public static void copyMemory(byte[] bArr, long j4, long j10, long j11) {
        MEMORY_ACCESSOR.copyMemory(bArr, j4, j10, j11);
    }

    public static boolean determineAndroidSupportByAddressSize(Class<?> cls) {
        if (!C4021d.isOnAndroidDevice()) {
            return false;
        }
        try {
            Class<?> cls2 = MEMORY_CLASS;
            Class<?> cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class<?> cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static Field field(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static long fieldOffset(Field field) {
        e eVar;
        if (field == null || (eVar = MEMORY_ACCESSOR) == null) {
            return -1L;
        }
        return eVar.objectFieldOffset(field);
    }

    private static int firstDifferingByteIndexNativeEndian(long j4, long j10) {
        return (IS_BIG_ENDIAN ? Long.numberOfLeadingZeros(j4 ^ j10) : Long.numberOfTrailingZeros(j4 ^ j10)) >> 3;
    }

    public static boolean getBoolean(Object obj, long j4) {
        return MEMORY_ACCESSOR.getBoolean(obj, j4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean getBooleanBigEndian(Object obj, long j4) {
        return getByteBigEndian(obj, j4) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean getBooleanLittleEndian(Object obj, long j4) {
        return getByteLittleEndian(obj, j4) != 0;
    }

    public static byte getByte(Object obj, long j4) {
        return MEMORY_ACCESSOR.getByte(obj, j4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte getByteBigEndian(Object obj, long j4) {
        return (byte) ((getInt(obj, (-4) & j4) >>> ((int) (((~j4) & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte getByteLittleEndian(Object obj, long j4) {
        return (byte) ((getInt(obj, (-4) & j4) >>> ((int) ((j4 & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public static double getDouble(Object obj, long j4) {
        return MEMORY_ACCESSOR.getDouble(obj, j4);
    }

    public static float getFloat(Object obj, long j4) {
        return MEMORY_ACCESSOR.getFloat(obj, j4);
    }

    public static int getInt(Object obj, long j4) {
        return MEMORY_ACCESSOR.getInt(obj, j4);
    }

    public static long getLong(Object obj, long j4) {
        return MEMORY_ACCESSOR.getLong(obj, j4);
    }

    private static e getMemoryAccessor() {
        Unsafe unsafe = UNSAFE;
        if (unsafe == null) {
            return null;
        }
        if (!C4021d.isOnAndroidDevice()) {
            return new d(unsafe);
        }
        if (IS_ANDROID_64) {
            return new c(unsafe);
        }
        if (IS_ANDROID_32) {
            return new b(unsafe);
        }
        return null;
    }

    public static Object getObject(Object obj, long j4) {
        return MEMORY_ACCESSOR.getObject(obj, j4);
    }

    public static Object getStaticObject(Field field) {
        return MEMORY_ACCESSOR.getStaticObject(field);
    }

    public static Unsafe getUnsafe() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean hasUnsafeArrayOperations() {
        return HAS_UNSAFE_ARRAY_OPERATIONS;
    }

    public static boolean hasUnsafeByteBufferOperations() {
        return HAS_UNSAFE_BYTEBUFFER_OPERATIONS;
    }

    public static boolean isAndroid64() {
        return IS_ANDROID_64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void logMissingMethod(Throwable th) {
        Logger.getLogger(y0.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static int mismatch(byte[] bArr, int i, byte[] bArr2, int i10, int i11) {
        if (i < 0 || i10 < 0 || i11 < 0 || i + i11 > bArr.length || i10 + i11 > bArr2.length) {
            throw new IndexOutOfBoundsException();
        }
        int i12 = 0;
        if (HAS_UNSAFE_ARRAY_OPERATIONS) {
            for (int i13 = (BYTE_ARRAY_ALIGNMENT + i) & 7; i12 < i11 && (i13 & 7) != 0; i13++) {
                if (bArr[i + i12] != bArr2[i10 + i12]) {
                    return i12;
                }
                i12++;
            }
            int i14 = ((i11 - i12) & (-8)) + i12;
            while (i12 < i14) {
                long j4 = BYTE_ARRAY_BASE_OFFSET;
                long j10 = i12;
                long j11 = getLong((Object) bArr, i + j4 + j10);
                long j12 = getLong((Object) bArr2, j4 + i10 + j10);
                if (j11 != j12) {
                    return i12 + firstDifferingByteIndexNativeEndian(j11, j12);
                }
                i12 += 8;
            }
        }
        while (i12 < i11) {
            if (bArr[i + i12] != bArr2[i10 + i12]) {
                return i12;
            }
            i12++;
        }
        return -1;
    }

    public static long objectFieldOffset(Field field) {
        return MEMORY_ACCESSOR.objectFieldOffset(field);
    }

    public static void putBoolean(Object obj, long j4, boolean z10) {
        MEMORY_ACCESSOR.putBoolean(obj, j4, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void putBooleanBigEndian(Object obj, long j4, boolean z10) {
        putByteBigEndian(obj, j4, z10 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void putBooleanLittleEndian(Object obj, long j4, boolean z10) {
        putByteLittleEndian(obj, j4, z10 ? (byte) 1 : (byte) 0);
    }

    public static void putByte(Object obj, long j4, byte b10) {
        MEMORY_ACCESSOR.putByte(obj, j4, b10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void putByteBigEndian(Object obj, long j4, byte b10) {
        long j10 = (-4) & j4;
        int i = getInt(obj, j10);
        int i10 = ((~((int) j4)) & 3) << 3;
        putInt(obj, j10, ((255 & b10) << i10) | (i & (~(KotlinVersion.MAX_COMPONENT_VALUE << i10))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void putByteLittleEndian(Object obj, long j4, byte b10) {
        long j10 = (-4) & j4;
        int i = (((int) j4) & 3) << 3;
        putInt(obj, j10, ((255 & b10) << i) | (getInt(obj, j10) & (~(KotlinVersion.MAX_COMPONENT_VALUE << i))));
    }

    public static void putDouble(Object obj, long j4, double d10) {
        MEMORY_ACCESSOR.putDouble(obj, j4, d10);
    }

    public static void putFloat(Object obj, long j4, float f10) {
        MEMORY_ACCESSOR.putFloat(obj, j4, f10);
    }

    public static void putInt(Object obj, long j4, int i) {
        MEMORY_ACCESSOR.putInt(obj, j4, i);
    }

    public static void putLong(Object obj, long j4, long j10) {
        MEMORY_ACCESSOR.putLong(obj, j4, j10);
    }

    public static void putObject(Object obj, long j4, Object obj2) {
        MEMORY_ACCESSOR.putObject(obj, j4, obj2);
    }

    private static boolean supportsUnsafeArrayOperations() {
        e eVar = MEMORY_ACCESSOR;
        if (eVar == null) {
            return false;
        }
        return eVar.supportsUnsafeArrayOperations();
    }

    private static boolean supportsUnsafeByteBufferOperations() {
        e eVar = MEMORY_ACCESSOR;
        if (eVar == null) {
            return false;
        }
        return eVar.supportsUnsafeByteBufferOperations();
    }

    public static void copyMemory(long j4, byte[] bArr, long j10, long j11) {
        MEMORY_ACCESSOR.copyMemory(j4, bArr, j10, j11);
    }

    public static boolean getBoolean(boolean[] zArr, long j4) {
        return MEMORY_ACCESSOR.getBoolean(zArr, (j4 * BOOLEAN_ARRAY_INDEX_SCALE) + BOOLEAN_ARRAY_BASE_OFFSET);
    }

    public static byte getByte(byte[] bArr, long j4) {
        return MEMORY_ACCESSOR.getByte(bArr, BYTE_ARRAY_BASE_OFFSET + j4);
    }

    public static double getDouble(double[] dArr, long j4) {
        return MEMORY_ACCESSOR.getDouble(dArr, (j4 * DOUBLE_ARRAY_INDEX_SCALE) + DOUBLE_ARRAY_BASE_OFFSET);
    }

    public static float getFloat(float[] fArr, long j4) {
        return MEMORY_ACCESSOR.getFloat(fArr, (j4 * FLOAT_ARRAY_INDEX_SCALE) + FLOAT_ARRAY_BASE_OFFSET);
    }

    public static int getInt(int[] iArr, long j4) {
        return MEMORY_ACCESSOR.getInt(iArr, (j4 * INT_ARRAY_INDEX_SCALE) + INT_ARRAY_BASE_OFFSET);
    }

    public static long getLong(long[] jArr, long j4) {
        return MEMORY_ACCESSOR.getLong(jArr, (j4 * LONG_ARRAY_INDEX_SCALE) + LONG_ARRAY_BASE_OFFSET);
    }

    public static Object getObject(Object[] objArr, long j4) {
        return MEMORY_ACCESSOR.getObject(objArr, (j4 * OBJECT_ARRAY_INDEX_SCALE) + OBJECT_ARRAY_BASE_OFFSET);
    }

    public static void putBoolean(boolean[] zArr, long j4, boolean z10) {
        MEMORY_ACCESSOR.putBoolean(zArr, (j4 * BOOLEAN_ARRAY_INDEX_SCALE) + BOOLEAN_ARRAY_BASE_OFFSET, z10);
    }

    public static void putByte(byte[] bArr, long j4, byte b10) {
        MEMORY_ACCESSOR.putByte(bArr, BYTE_ARRAY_BASE_OFFSET + j4, b10);
    }

    public static void putDouble(double[] dArr, long j4, double d10) {
        MEMORY_ACCESSOR.putDouble(dArr, (j4 * DOUBLE_ARRAY_INDEX_SCALE) + DOUBLE_ARRAY_BASE_OFFSET, d10);
    }

    public static void putFloat(float[] fArr, long j4, float f10) {
        MEMORY_ACCESSOR.putFloat(fArr, (j4 * FLOAT_ARRAY_INDEX_SCALE) + FLOAT_ARRAY_BASE_OFFSET, f10);
    }

    public static void putInt(int[] iArr, long j4, int i) {
        MEMORY_ACCESSOR.putInt(iArr, (j4 * INT_ARRAY_INDEX_SCALE) + INT_ARRAY_BASE_OFFSET, i);
    }

    public static void putLong(long[] jArr, long j4, long j10) {
        MEMORY_ACCESSOR.putLong(jArr, (j4 * LONG_ARRAY_INDEX_SCALE) + LONG_ARRAY_BASE_OFFSET, j10);
    }

    public static void putObject(Object[] objArr, long j4, Object obj) {
        MEMORY_ACCESSOR.putObject(objArr, (j4 * OBJECT_ARRAY_INDEX_SCALE) + OBJECT_ARRAY_BASE_OFFSET, obj);
    }

    public static void copyMemory(byte[] bArr, long j4, byte[] bArr2, long j10, long j11) {
        System.arraycopy(bArr, (int) j4, bArr2, (int) j10, (int) j11);
    }

    public static byte getByte(long j4) {
        return MEMORY_ACCESSOR.getByte(j4);
    }

    public static int getInt(long j4) {
        return MEMORY_ACCESSOR.getInt(j4);
    }

    public static long getLong(long j4) {
        return MEMORY_ACCESSOR.getLong(j4);
    }

    public static void putByte(long j4, byte b10) {
        MEMORY_ACCESSOR.putByte(j4, b10);
    }

    public static void putInt(long j4, int i) {
        MEMORY_ACCESSOR.putInt(j4, i);
    }

    public static void putLong(long j4, long j10) {
        MEMORY_ACCESSOR.putLong(j4, j10);
    }
}
