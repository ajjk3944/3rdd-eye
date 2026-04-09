package z0;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6492s;
import y0.C8603x;

/* renamed from: z0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8704b {

    /* renamed from: a, reason: collision with root package name */
    private int f67035a;

    /* renamed from: b, reason: collision with root package name */
    private long[] f67036b = new long[2];

    public final boolean a(long j10) {
        if (d(j10)) {
            return false;
        }
        k(this.f67035a, j10);
        return true;
    }

    public final boolean b(long j10) {
        return a(j10);
    }

    public final void c() {
        this.f67035a = 0;
    }

    public final boolean d(long j10) {
        int i10 = this.f67035a;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f67036b[i11] == j10) {
                return true;
            }
        }
        return false;
    }

    public final long e(int i10) {
        return C8603x.b(this.f67036b[i10]);
    }

    public final int f() {
        return this.f67035a;
    }

    public final boolean g() {
        return this.f67035a == 0;
    }

    public final boolean h(long j10) {
        int i10 = this.f67035a;
        for (int i11 = 0; i11 < i10; i11++) {
            if (j10 == e(i11)) {
                j(i11);
                return true;
            }
        }
        return false;
    }

    public final boolean i(long j10) {
        return h(j10);
    }

    public final boolean j(int i10) {
        int i11 = this.f67035a;
        if (i10 >= i11) {
            return false;
        }
        int i12 = i11 - 1;
        while (i10 < i12) {
            long[] jArr = this.f67036b;
            int i13 = i10 + 1;
            jArr[i10] = jArr[i13];
            i10 = i13;
        }
        this.f67035a--;
        return true;
    }

    public final void k(int i10, long j10) {
        long[] jArr = this.f67036b;
        if (i10 >= jArr.length) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, Math.max(i10 + 1, jArr.length * 2));
            AbstractC6492s.h(jArrCopyOf, "copyOf(this, newSize)");
            this.f67036b = jArrCopyOf;
        }
        this.f67036b[i10] = j10;
        if (i10 >= this.f67035a) {
            this.f67035a = i10 + 1;
        }
    }
}
