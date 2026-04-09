package org.tensorflow.lite;

import com.google.android.gms.ads.AdRequest;
import g0.C4356c;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;

/* loaded from: classes3.dex */
final class NativeInterpreterWrapper implements AutoCloseable {

    /* renamed from: b, reason: collision with root package name */
    public long f44948b;

    /* renamed from: c, reason: collision with root package name */
    public long f44949c;

    /* renamed from: d, reason: collision with root package name */
    public long f44950d;

    /* renamed from: e, reason: collision with root package name */
    public MappedByteBuffer f44951e;

    /* renamed from: f, reason: collision with root package name */
    public final Tensor[] f44952f;

    /* renamed from: g, reason: collision with root package name */
    public final Tensor[] f44953g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f44954h;

    static {
        TensorFlowLite.a();
    }

    public NativeInterpreterWrapper(MappedByteBuffer mappedByteBuffer) {
        this.f44954h = false;
        if (mappedByteBuffer == null) {
            throw new IllegalArgumentException("Model ByteBuffer should be either a MappedByteBuffer of the model file, or a direct ByteBuffer using ByteOrder.nativeOrder() which contains bytes of model content.");
        }
        this.f44951e = mappedByteBuffer;
        long jCreateErrorReporter = createErrorReporter(AdRequest.MAX_CONTENT_URL_LENGTH);
        this.f44948b = jCreateErrorReporter;
        long jCreateModelWithBuffer = createModelWithBuffer(this.f44951e, jCreateErrorReporter);
        this.f44950d = jCreateModelWithBuffer;
        long jCreateInterpreter = createInterpreter(jCreateModelWithBuffer, this.f44948b, -1);
        this.f44949c = jCreateInterpreter;
        this.f44954h = true;
        this.f44952f = new Tensor[getInputCount(jCreateInterpreter)];
        this.f44953g = new Tensor[getOutputCount(this.f44949c)];
    }

    private static native long allocateTensors(long j4, long j10);

    private static native long createErrorReporter(int i);

    private static native long createInterpreter(long j4, long j10, int i);

    private static native long createModelWithBuffer(ByteBuffer byteBuffer, long j4);

    private static native void delete(long j4, long j10, long j11);

    private static native int getInputCount(long j4);

    private static native int getInputTensorIndex(long j4, int i);

    private static native int getOutputCount(long j4);

    private static native int getOutputTensorIndex(long j4, int i);

    private static native void numThreads(long j4, int i);

    private static native boolean resizeInput(long j4, long j10, int i, int[] iArr);

    private static native boolean run(long j4, long j10);

    public final Tensor a(int i) {
        if (i >= 0) {
            Tensor[] tensorArr = this.f44952f;
            if (i < tensorArr.length) {
                Tensor tensor = tensorArr[i];
                if (tensor != null) {
                    return tensor;
                }
                long j4 = this.f44949c;
                Tensor tensorE = Tensor.e(getInputTensorIndex(j4, i), j4);
                tensorArr[i] = tensorE;
                return tensorE;
            }
        }
        throw new IllegalArgumentException(C4356c.h(i, "Invalid input Tensor index: "));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(java.lang.Object[] r8, java.util.HashMap r9) {
        /*
            r7 = this;
            int r0 = r8.length
            if (r0 == 0) goto Ld4
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto Lcc
            r0 = 0
            r5 = r0
        Lb:
            int r1 = r8.length
            if (r5 >= r1) goto L48
            org.tensorflow.lite.Tensor r1 = r7.a(r5)
            r2 = r8[r5]
            boolean r3 = r2 instanceof java.nio.ByteBuffer
            r4 = 0
            if (r3 == 0) goto L1b
        L19:
            r6 = r4
            goto L2e
        L1b:
            int r3 = org.tensorflow.lite.Tensor.b(r2)
            int[] r3 = new int[r3]
            org.tensorflow.lite.Tensor.d(r2, r0, r3)
            int[] r1 = r1.f44957c
            boolean r1 = java.util.Arrays.equals(r1, r3)
            if (r1 == 0) goto L2d
            goto L19
        L2d:
            r6 = r3
        L2e:
            if (r6 == 0) goto L45
            long r1 = r7.f44949c
            long r3 = r7.f44948b
            boolean r1 = resizeInput(r1, r3, r5, r6)
            if (r1 == 0) goto L45
            r7.f44954h = r0
            org.tensorflow.lite.Tensor[] r1 = r7.f44952f
            r1 = r1[r5]
            if (r1 == 0) goto L45
            r1.f()
        L45:
            int r5 = r5 + 1
            goto Lb
        L48:
            boolean r1 = r7.f44954h
            if (r1 != 0) goto L56
            long r2 = r7.f44949c
            long r4 = r7.f44948b
            allocateTensors(r2, r4)
            r2 = 1
            r7.f44954h = r2
        L56:
            r2 = r0
        L57:
            int r3 = r8.length
            if (r2 >= r3) goto L66
            org.tensorflow.lite.Tensor r3 = r7.a(r2)
            r4 = r8[r2]
            r3.g(r4)
            int r2 = r2 + 1
            goto L57
        L66:
            java.lang.System.nanoTime()
            long r2 = r7.f44949c
            long r4 = r7.f44948b
            run(r2, r4)
            java.lang.System.nanoTime()
            org.tensorflow.lite.Tensor[] r8 = r7.f44953g
            if (r1 != 0) goto L84
        L77:
            int r1 = r8.length
            if (r0 >= r1) goto L84
            r1 = r8[r0]
            if (r1 == 0) goto L81
            r1.f()
        L81:
            int r0 = r0 + 1
            goto L77
        L84:
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
        L8c:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto Lcb
            java.lang.Object r0 = r9.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 < 0) goto Lbf
            int r2 = r8.length
            if (r1 >= r2) goto Lbf
            r2 = r8[r1]
            if (r2 != 0) goto Lb7
            long r2 = r7.f44949c
            int r4 = getOutputTensorIndex(r2, r1)
            org.tensorflow.lite.Tensor r2 = org.tensorflow.lite.Tensor.e(r4, r2)
            r8[r1] = r2
        Lb7:
            java.lang.Object r0 = r0.getValue()
            r2.c(r0)
            goto L8c
        Lbf:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Invalid output Tensor index: "
            java.lang.String r9 = g0.C4356c.h(r1, r9)
            r8.<init>(r9)
            throw r8
        Lcb:
            return
        Lcc:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Input error: Outputs should not be null or empty."
            r8.<init>(r9)
            throw r8
        Ld4:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Input error: Inputs should not be null or empty."
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: org.tensorflow.lite.NativeInterpreterWrapper.c(java.lang.Object[], java.util.HashMap):void");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        int i = 0;
        while (true) {
            Tensor[] tensorArr = this.f44952f;
            if (i >= tensorArr.length) {
                break;
            }
            Tensor tensor = tensorArr[i];
            if (tensor != null) {
                tensor.a();
                tensorArr[i] = null;
            }
            i++;
        }
        int i10 = 0;
        while (true) {
            Tensor[] tensorArr2 = this.f44953g;
            if (i10 >= tensorArr2.length) {
                delete(this.f44948b, this.f44950d, this.f44949c);
                this.f44948b = 0L;
                this.f44950d = 0L;
                this.f44949c = 0L;
                this.f44951e = null;
                this.f44954h = false;
                return;
            }
            Tensor tensor2 = tensorArr2[i10];
            if (tensor2 != null) {
                tensor2.a();
                tensorArr2[i10] = null;
            }
            i10++;
        }
    }

    public final void d(int i) {
        numThreads(this.f44949c, i);
    }
}
