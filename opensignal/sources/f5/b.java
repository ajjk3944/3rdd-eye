package f5;

import java.util.Arrays;
import oe.z0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final b f8445c = new b(new int[]{2}, 8);

    /* renamed from: d, reason: collision with root package name */
    public static final b f8446d = new b(new int[]{2, 5, 6}, 8);

    /* renamed from: e, reason: collision with root package name */
    public static final z0 f8447e;

    /* renamed from: a, reason: collision with root package name */
    public final int[] f8448a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8449b;

    static {
        bc.f0 f0Var = new bc.f0(4, 8);
        f0Var.r(5, 6);
        f0Var.r(17, 6);
        f0Var.r(7, 6);
        f0Var.r(18, 6);
        f0Var.r(6, 8);
        f0Var.r(8, 8);
        f0Var.r(14, 8);
        f8447e = f0Var.c();
    }

    public b(int[] iArr, int i10) {
        if (iArr != null) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.f8448a = iArrCopyOf;
            Arrays.sort(iArrCopyOf);
        } else {
            this.f8448a = new int[0];
        }
        this.f8449b = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair a(androidx.media3.common.r r10) {
        /*
            r9 = this;
            java.lang.String r0 = r10.H
            r0.getClass()
            java.lang.String r1 = r10.E
            int r0 = androidx.media3.common.j0.b(r0, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            oe.z0 r2 = f5.b.f8447e
            boolean r1 = r2.containsKey(r1)
            r3 = 0
            if (r1 != 0) goto L1a
            goto La2
        L1a:
            int[] r1 = r9.f8448a
            r4 = 7
            r5 = 6
            r6 = 8
            r7 = 18
            if (r0 != r7) goto L2d
            int r8 = java.util.Arrays.binarySearch(r1, r7)
            if (r8 < 0) goto L2b
            goto L2d
        L2b:
            r0 = r5
            goto L37
        L2d:
            if (r0 != r6) goto L37
            int r8 = java.util.Arrays.binarySearch(r1, r6)
            if (r8 < 0) goto L36
            goto L37
        L36:
            r0 = r4
        L37:
            int r1 = java.util.Arrays.binarySearch(r1, r0)
            if (r1 < 0) goto Lb0
            int r1 = r10.U
            r8 = -1
            if (r1 == r8) goto L4a
            if (r0 != r7) goto L45
            goto L4a
        L45:
            int r10 = r9.f8449b
            if (r1 <= r10) goto L75
            goto La2
        L4a:
            int r10 = r10.V
            if (r10 == r8) goto L4f
            goto L52
        L4f:
            r10 = 48000(0xbb80, float:6.7262E-41)
        L52:
            int r1 = a5.d0.f105a
            r7 = 29
            if (r1 < r7) goto L5e
            int r10 = f5.a.b(r0, r10)
        L5c:
            r1 = r10
            goto L75
        L5e:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r10 = r2.get(r10)
            if (r10 == 0) goto L6e
            r1 = r10
        L6e:
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r10 = r1.intValue()
            goto L5c
        L75:
            int r10 = a5.d0.f105a
            r2 = 28
            if (r10 > r2) goto L89
            if (r1 != r4) goto L7f
            r5 = r6
            goto L8a
        L7f:
            r2 = 3
            if (r1 == r2) goto L8a
            r2 = 4
            if (r1 == r2) goto L8a
            r2 = 5
            if (r1 != r2) goto L89
            goto L8a
        L89:
            r5 = r1
        L8a:
            r1 = 26
            if (r10 > r1) goto L9c
            java.lang.String r10 = "fugu"
            java.lang.String r1 = a5.d0.f106b
            boolean r10 = r10.equals(r1)
            if (r10 == 0) goto L9c
            r10 = 1
            if (r5 != r10) goto L9c
            r5 = 2
        L9c:
            int r10 = a5.d0.m(r5)
            if (r10 != 0) goto La3
        La2:
            return r3
        La3:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            android.util.Pair r10 = android.util.Pair.create(r0, r10)
            return r10
        Lb0:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: f5.b.a(androidx.media3.common.r):android.util.Pair");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Arrays.equals(this.f8448a, bVar.f8448a) && this.f8449b == bVar.f8449b;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f8448a) * 31) + this.f8449b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f8449b + ", supportedEncodings=" + Arrays.toString(this.f8448a) + "]";
    }
}
