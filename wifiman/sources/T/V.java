package T;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    private int[] f20987a = new int[10];

    /* renamed from: b, reason: collision with root package name */
    private int f20988b;

    public final void a() {
        this.f20988b = 0;
    }

    public final int b() {
        return this.f20988b;
    }

    public final int c(int i10) {
        int i11 = this.f20988b;
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.f20987a[i12] == i10) {
                return i12;
            }
        }
        return -1;
    }

    public final boolean d() {
        return this.f20988b == 0;
    }

    public final int e() {
        return this.f20987a[this.f20988b - 1];
    }

    public final int f(int i10) {
        return this.f20987a[i10];
    }

    public final int g() {
        return this.f20987a[this.f20988b - 2];
    }

    public final int h(int i10) {
        return this.f20988b > 0 ? e() : i10;
    }

    public final int i() {
        int[] iArr = this.f20987a;
        int i10 = this.f20988b - 1;
        this.f20988b = i10;
        return iArr[i10];
    }

    public final void j(int i10) {
        int i11 = this.f20988b;
        int[] iArr = this.f20987a;
        if (i11 >= iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            AbstractC6492s.h(iArrCopyOf, "copyOf(this, newSize)");
            this.f20987a = iArrCopyOf;
        }
        int[] iArr2 = this.f20987a;
        int i12 = this.f20988b;
        this.f20988b = i12 + 1;
        iArr2[i12] = i10;
    }
}
