package Zi;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6492s;
import sh.AbstractC7978m;

/* loaded from: classes4.dex */
public final class U extends K0 {

    /* renamed from: a, reason: collision with root package name */
    private int[] f25591a;

    /* renamed from: b, reason: collision with root package name */
    private int f25592b;

    public U(int[] bufferWithData) {
        AbstractC6492s.i(bufferWithData, "bufferWithData");
        this.f25591a = bufferWithData;
        this.f25592b = bufferWithData.length;
        b(10);
    }

    @Override // Zi.K0
    public void b(int i10) {
        int[] iArr = this.f25591a;
        if (iArr.length < i10) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, AbstractC7978m.d(i10, iArr.length * 2));
            AbstractC6492s.h(iArrCopyOf, "copyOf(...)");
            this.f25591a = iArrCopyOf;
        }
    }

    @Override // Zi.K0
    public int d() {
        return this.f25592b;
    }

    public final void e(int i10) {
        K0.c(this, 0, 1, null);
        int[] iArr = this.f25591a;
        int iD = d();
        this.f25592b = iD + 1;
        iArr[iD] = i10;
    }

    @Override // Zi.K0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public int[] a() {
        int[] iArrCopyOf = Arrays.copyOf(this.f25591a, d());
        AbstractC6492s.h(iArrCopyOf, "copyOf(...)");
        return iArrCopyOf;
    }
}
