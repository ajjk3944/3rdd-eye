package Zi;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6492s;
import sh.AbstractC7978m;

/* loaded from: classes4.dex */
public final class A extends K0 {

    /* renamed from: a, reason: collision with root package name */
    private double[] f25529a;

    /* renamed from: b, reason: collision with root package name */
    private int f25530b;

    public A(double[] bufferWithData) {
        AbstractC6492s.i(bufferWithData, "bufferWithData");
        this.f25529a = bufferWithData;
        this.f25530b = bufferWithData.length;
        b(10);
    }

    @Override // Zi.K0
    public void b(int i10) {
        double[] dArr = this.f25529a;
        if (dArr.length < i10) {
            double[] dArrCopyOf = Arrays.copyOf(dArr, AbstractC7978m.d(i10, dArr.length * 2));
            AbstractC6492s.h(dArrCopyOf, "copyOf(...)");
            this.f25529a = dArrCopyOf;
        }
    }

    @Override // Zi.K0
    public int d() {
        return this.f25530b;
    }

    public final void e(double d10) {
        K0.c(this, 0, 1, null);
        double[] dArr = this.f25529a;
        int iD = d();
        this.f25530b = iD + 1;
        dArr[iD] = d10;
    }

    @Override // Zi.K0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public double[] a() {
        double[] dArrCopyOf = Arrays.copyOf(this.f25529a, d());
        AbstractC6492s.h(dArrCopyOf, "copyOf(...)");
        return dArrCopyOf;
    }
}
