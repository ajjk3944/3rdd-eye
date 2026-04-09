package d0;

import T.AbstractC3517c;
import T.G1;
import Zg.AbstractC3682n;

/* renamed from: d0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5278j {

    /* renamed from: a, reason: collision with root package name */
    private int f45710a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f45711b = new int[16];

    /* renamed from: c, reason: collision with root package name */
    private G1[] f45712c = new G1[16];

    private final int b(Object obj, int i10) {
        int i11 = this.f45710a - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            int i14 = this.f45711b[i13];
            if (i14 < i10) {
                i12 = i13 + 1;
            } else {
                if (i14 <= i10) {
                    G1 g12 = this.f45712c[i13];
                    return obj == (g12 != null ? g12.get() : null) ? i13 : c(i13, obj, i10);
                }
                i11 = i13 - 1;
            }
        }
        return -(i12 + 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001d, code lost:
    
        r4 = r4 + 1;
        r0 = r3.f45710a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0021, code lost:
    
        if (r4 >= r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0027, code lost:
    
        if (r3.f45711b[r4] == r6) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002c, code lost:
    
        return -(r4 + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002d, code lost:
    
        r2 = r3.f45712c[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0031, code lost:
    
        if (r2 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0033, code lost:
    
        r2 = r2.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0038, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0039, code lost:
    
        if (r2 != r5) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003b, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003c, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003f, code lost:
    
        r4 = r3.f45710a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int c(int r4, java.lang.Object r5, int r6) {
        /*
            r3 = this;
            int r0 = r4 + (-1)
        L2:
            r1 = 0
            r2 = -1
            if (r2 >= r0) goto L1d
            int[] r2 = r3.f45711b
            r2 = r2[r0]
            if (r2 == r6) goto Ld
            goto L1d
        Ld:
            T.G1[] r2 = r3.f45712c
            r2 = r2[r0]
            if (r2 == 0) goto L17
            java.lang.Object r1 = r2.get()
        L17:
            if (r1 != r5) goto L1a
            return r0
        L1a:
            int r0 = r0 + (-1)
            goto L2
        L1d:
            int r4 = r4 + 1
            int r0 = r3.f45710a
        L21:
            if (r4 >= r0) goto L3f
            int[] r2 = r3.f45711b
            r2 = r2[r4]
            if (r2 == r6) goto L2d
        L29:
            int r4 = r4 + 1
            int r4 = -r4
            return r4
        L2d:
            T.G1[] r2 = r3.f45712c
            r2 = r2[r4]
            if (r2 == 0) goto L38
            java.lang.Object r2 = r2.get()
            goto L39
        L38:
            r2 = r1
        L39:
            if (r2 != r5) goto L3c
            return r4
        L3c:
            int r4 = r4 + 1
            goto L21
        L3f:
            int r4 = r3.f45710a
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.C5278j.c(int, java.lang.Object, int):int");
    }

    public final boolean a(Object obj) {
        int iB;
        int i10 = this.f45710a;
        int iC = AbstractC3517c.c(obj);
        if (i10 > 0) {
            iB = b(obj, iC);
            if (iB >= 0) {
                return false;
            }
        } else {
            iB = -1;
        }
        int i11 = -(iB + 1);
        G1[] g1Arr = this.f45712c;
        int length = g1Arr.length;
        if (i10 == length) {
            int i12 = length * 2;
            G1[] g1Arr2 = new G1[i12];
            int[] iArr = new int[i12];
            int i13 = i11 + 1;
            AbstractC3682n.m(g1Arr, g1Arr2, i13, i11, i10);
            AbstractC3682n.q(this.f45712c, g1Arr2, 0, 0, i11, 6, null);
            AbstractC3682n.k(this.f45711b, iArr, i13, i11, i10);
            AbstractC3682n.p(this.f45711b, iArr, 0, 0, i11, 6, null);
            this.f45712c = g1Arr2;
            this.f45711b = iArr;
        } else {
            int i14 = i11 + 1;
            AbstractC3682n.m(g1Arr, g1Arr, i14, i11, i10);
            int[] iArr2 = this.f45711b;
            AbstractC3682n.k(iArr2, iArr2, i14, i11, i10);
        }
        this.f45712c[i11] = new G1(obj);
        this.f45711b[i11] = iC;
        this.f45710a++;
        return true;
    }

    public final int[] d() {
        return this.f45711b;
    }

    public final int e() {
        return this.f45710a;
    }

    public final G1[] f() {
        return this.f45712c;
    }

    public final void g(int i10) {
        this.f45710a = i10;
    }
}
