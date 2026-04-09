package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ts {
    public int a;
    public int b;
    public Object c;
    public Object d;

    public ts() {
        this.c = new long[10];
        this.d = new Object[10];
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.pi1 a() throws defpackage.ah3 {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ts.a():pi1");
    }

    public synchronized void b(long j, Object obj) {
        try {
            if (this.b > 0) {
                if (j <= ((long[]) this.c)[((this.a + r0) - 1) % ((Object[]) this.d).length]) {
                    synchronized (this) {
                        this.a = 0;
                        this.b = 0;
                        Arrays.fill((Object[]) this.d, (Object) null);
                    }
                }
            }
            int length = ((Object[]) this.d).length;
            if (this.b >= length) {
                int i = length + length;
                long[] jArr = new long[i];
                Object[] objArr = new Object[i];
                int i2 = this.a;
                int i3 = length - i2;
                System.arraycopy((long[]) this.c, i2, jArr, 0, i3);
                System.arraycopy((Object[]) this.d, this.a, objArr, 0, i3);
                int i4 = this.a;
                if (i4 > 0) {
                    System.arraycopy((long[]) this.c, 0, jArr, i3, i4);
                    System.arraycopy((Object[]) this.d, 0, objArr, i3, this.a);
                }
                this.c = jArr;
                this.d = objArr;
                this.a = 0;
            }
            int i5 = this.a;
            int i6 = this.b;
            Object[] objArr2 = (Object[]) this.d;
            int length2 = (i5 + i6) % objArr2.length;
            ((long[]) this.c)[length2] = j;
            objArr2[length2] = obj;
            this.b = i6 + 1;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized int c() {
        return this.b;
    }

    public synchronized Object d() {
        if (this.b == 0) {
            return null;
        }
        return f();
    }

    public synchronized Object e(long j) {
        Object objF;
        objF = null;
        while (this.b > 0 && j - ((long[]) this.c)[this.a] >= 0) {
            objF = f();
        }
        return objF;
    }

    public Object f() {
        zt0.b0(this.b > 0);
        Object[] objArr = (Object[]) this.d;
        int i = this.a;
        Object obj = objArr[i];
        objArr[i] = null;
        this.a = (i + 1) % objArr.length;
        this.b--;
        return obj;
    }

    public ts(int i, ArrayList arrayList, int i2, xo1 xo1Var) {
        this.a = i;
        this.c = arrayList;
        this.b = i2;
        this.d = xo1Var;
    }
}
