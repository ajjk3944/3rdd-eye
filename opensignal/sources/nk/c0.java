package nk;

import java.io.Closeable;
import java.io.Flushable;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class c0 implements Closeable, Flushable {
    public boolean B;
    public boolean D;

    /* renamed from: x, reason: collision with root package name */
    public String f18357x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f18358y;

    /* renamed from: a, reason: collision with root package name */
    public int f18353a = 0;

    /* renamed from: d, reason: collision with root package name */
    public int[] f18354d = new int[32];

    /* renamed from: g, reason: collision with root package name */
    public String[] f18355g = new String[32];

    /* renamed from: r, reason: collision with root package name */
    public int[] f18356r = new int[32];
    public int E = -1;

    public abstract c0 G();

    public final int L() {
        int i10 = this.f18353a;
        if (i10 != 0) {
            return this.f18354d[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void R(int i10) {
        int[] iArr = this.f18354d;
        int i11 = this.f18353a;
        this.f18353a = i11 + 1;
        iArr[i11] = i10;
    }

    public void V(String str) {
        if (str.isEmpty()) {
            str = null;
        }
        this.f18357x = str;
    }

    public abstract c0 Y(double d6);

    public abstract c0 Z(long j);

    public abstract c0 b();

    public abstract c0 f();

    public abstract c0 f0(Float f10);

    public final void h() {
        int i10 = this.f18353a;
        int[] iArr = this.f18354d;
        if (i10 != iArr.length) {
            return;
        }
        if (i10 == 256) {
            throw new bf.n("Nesting too deep at " + w() + ": circular reference?");
        }
        this.f18354d = Arrays.copyOf(iArr, iArr.length * 2);
        String[] strArr = this.f18355g;
        this.f18355g = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        int[] iArr2 = this.f18356r;
        this.f18356r = Arrays.copyOf(iArr2, iArr2.length * 2);
        if (this instanceof b0) {
            b0 b0Var = (b0) this;
            Object[] objArr = b0Var.F;
            b0Var.F = Arrays.copyOf(objArr, objArr.length * 2);
        }
    }

    public abstract c0 i();

    public abstract c0 i0(String str);

    public abstract c0 n0(boolean z10);

    public abstract c0 q();

    public final String w() {
        return p0.c(this.f18353a, this.f18354d, this.f18355g, this.f18356r);
    }

    public abstract c0 y(String str);
}
