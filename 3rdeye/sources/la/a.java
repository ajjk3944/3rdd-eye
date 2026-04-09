package la;

import com.singular.sdk.internal.Constants;
import g0.C4356c;
import org.tensorflow.lite.TensorFlowLite;

/* compiled from: DataType.java */
/* loaded from: classes3.dex */
public enum a {
    FLOAT32(1),
    INT32(2),
    UINT8(3),
    INT64(4);

    private static final a[] values = values();
    private final int value;

    /* compiled from: DataType.java */
    /* renamed from: la.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C0494a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43927a;

        static {
            int[] iArr = new int[a.values().length];
            f43927a = iArr;
            try {
                iArr[a.FLOAT32.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f43927a[a.INT32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f43927a[a.UINT8.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f43927a[a.INT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    a(int i) {
        this.value = i;
    }

    public static a fromC(int i) {
        for (a aVar : values) {
            if (aVar.value == i) {
                return aVar;
            }
        }
        StringBuilder sbJ = C4356c.j(i, "DataType error: DataType ", " is not recognized in Java (version ");
        sbJ.append(TensorFlowLite.version());
        sbJ.append(")");
        throw new IllegalArgumentException(sbJ.toString());
    }

    public int byteSize() {
        int i = C0494a.f43927a[ordinal()];
        if (i == 1 || i == 2) {
            return 4;
        }
        if (i == 3) {
            return 1;
        }
        if (i == 4) {
            return 8;
        }
        throw new IllegalArgumentException("DataType error: DataType " + this + " is not supported yet");
    }

    public int c() {
        return this.value;
    }

    public String toStringName() {
        int i = C0494a.f43927a[ordinal()];
        if (i == 1) {
            return "float";
        }
        if (i == 2) {
            return "int";
        }
        if (i == 3) {
            return "byte";
        }
        if (i == 4) {
            return Constants.LONG;
        }
        throw new IllegalArgumentException("DataType error: DataType " + this + " is not supported yet");
    }
}
