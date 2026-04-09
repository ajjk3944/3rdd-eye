package Jj;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    protected ByteBuffer f10233a;

    /* renamed from: b, reason: collision with root package name */
    protected int[] f10234b;

    /* renamed from: c, reason: collision with root package name */
    protected int f10235c = -1;

    /* renamed from: d, reason: collision with root package name */
    protected final boolean f10236d = true;

    /* renamed from: Jj.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0417a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f10237a;

        static {
            int[] iArr = new int[org.tensorflow.lite.a.values().length];
            f10237a = iArr;
            try {
                iArr[org.tensorflow.lite.a.FLOAT32.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10237a[org.tensorflow.lite.a.UINT8.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    protected a(int[] iArr) {
        a(iArr);
    }

    private void a(int[] iArr) {
        Ij.a.c(iArr, "TensorBuffer shape cannot be null.");
        Ij.a.b(n(iArr), "Values in TensorBuffer shape should be non-negative.");
        int iC = c(iArr);
        this.f10234b = (int[]) iArr.clone();
        if (this.f10235c == iC) {
            return;
        }
        this.f10235c = iC;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(iC * l());
        this.f10233a = byteBufferAllocateDirect;
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
    }

    private void b() {
        Ij.a.d(this.f10233a.limit() == l() * c(this.f10234b), String.format("The size of underlying ByteBuffer (%d) and the shape (%s) do not match. The ByteBuffer may have been changed.", Integer.valueOf(this.f10233a.limit()), Arrays.toString(this.f10234b)));
    }

    protected static int c(int[] iArr) {
        Ij.a.c(iArr, "Shape cannot be null.");
        int i10 = 1;
        for (int i11 : iArr) {
            i10 *= i11;
        }
        return i10;
    }

    public static a d(org.tensorflow.lite.a aVar) {
        int i10 = C0417a.f10237a[aVar.ordinal()];
        if (i10 == 1) {
            return new b();
        }
        if (i10 == 2) {
            return new c();
        }
        throw new AssertionError("TensorBuffer does not support data type: " + aVar);
    }

    public static a e(int[] iArr, org.tensorflow.lite.a aVar) {
        int i10 = C0417a.f10237a[aVar.ordinal()];
        if (i10 == 1) {
            return new b(iArr);
        }
        if (i10 == 2) {
            return new c(iArr);
        }
        throw new AssertionError("TensorBuffer does not support data type: " + aVar);
    }

    public static a f(a aVar, org.tensorflow.lite.a aVar2) {
        Ij.a.c(aVar, "Cannot create a buffer from null");
        a aVarD = aVar.m() ? d(aVar2) : e(aVar.f10234b, aVar2);
        org.tensorflow.lite.a aVarH = aVar.h();
        org.tensorflow.lite.a aVar3 = org.tensorflow.lite.a.FLOAT32;
        if (aVarH == aVar3 && aVar2 == aVar3) {
            aVarD.o(aVar.i(), aVar.f10234b);
        } else {
            aVarD.p(aVar.j(), aVar.f10234b);
        }
        return aVarD;
    }

    private static boolean n(int[] iArr) {
        if (iArr.length == 0) {
            return true;
        }
        for (int i10 : iArr) {
            if (i10 < 0) {
                return false;
            }
        }
        return true;
    }

    public ByteBuffer g() {
        return this.f10233a;
    }

    public abstract org.tensorflow.lite.a h();

    public abstract float[] i();

    public abstract int[] j();

    public int[] k() {
        b();
        int[] iArr = this.f10234b;
        return Arrays.copyOf(iArr, iArr.length);
    }

    public abstract int l();

    public boolean m() {
        return this.f10236d;
    }

    public abstract void o(float[] fArr, int[] iArr);

    public abstract void p(int[] iArr, int[] iArr2);

    public void q(ByteBuffer byteBuffer, int[] iArr) {
        Ij.a.c(byteBuffer, "Byte buffer cannot be null.");
        Ij.a.b(byteBuffer.limit() == l() * c(iArr), "The size of byte buffer and the shape do not match.");
        r(iArr);
        byteBuffer.rewind();
        this.f10233a = byteBuffer;
    }

    protected void r(int[] iArr) {
        if (this.f10236d) {
            a(iArr);
        } else {
            Ij.a.a(Arrays.equals(iArr, this.f10234b));
            this.f10234b = (int[]) iArr.clone();
        }
    }

    protected a() {
        a(new int[]{0});
    }
}
