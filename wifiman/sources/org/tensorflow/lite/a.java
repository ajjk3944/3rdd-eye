package org.tensorflow.lite;

/* loaded from: classes2.dex */
public enum a {
    FLOAT32(1),
    INT32(2),
    UINT8(3),
    INT64(4),
    STRING(5),
    BOOL(6),
    INT8(9);

    private static final a[] values = values();
    private final int value;

    /* renamed from: org.tensorflow.lite.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C2022a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f57151a;

        static {
            int[] iArr = new int[a.values().length];
            f57151a = iArr;
            try {
                iArr[a.FLOAT32.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57151a[a.INT32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f57151a[a.INT8.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f57151a[a.UINT8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f57151a[a.INT64.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f57151a[a.BOOL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f57151a[a.STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    a(int i10) {
        this.value = i10;
    }

    static a fromC(int i10) {
        for (a aVar : values) {
            if (aVar.value == i10) {
                return aVar;
            }
        }
        throw new IllegalArgumentException("DataType error: DataType " + i10 + " is not recognized in Java (version " + TensorFlowLite.b() + ")");
    }

    public int byteSize() {
        switch (C2022a.f57151a[ordinal()]) {
            case 1:
            case 2:
                return 4;
            case 3:
            case 4:
                return 1;
            case 5:
                return 8;
            case 6:
            case 7:
                return -1;
            default:
                throw new IllegalArgumentException("DataType error: DataType " + this + " is not supported yet");
        }
    }

    int c() {
        return this.value;
    }

    String toStringName() {
        switch (C2022a.f57151a[ordinal()]) {
            case 1:
                return "float";
            case 2:
                return "int";
            case 3:
            case 4:
                return "byte";
            case 5:
                return "long";
            case 6:
                return "bool";
            case 7:
                return "string";
            default:
                throw new IllegalArgumentException("DataType error: DataType " + this + " is not supported yet");
        }
    }
}
