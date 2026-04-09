package Zi;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6492s;
import sh.AbstractC7978m;

/* loaded from: classes4.dex */
public final class T0 extends K0 {

    /* renamed from: a, reason: collision with root package name */
    private short[] f25589a;

    /* renamed from: b, reason: collision with root package name */
    private int f25590b;

    public T0(short[] bufferWithData) {
        AbstractC6492s.i(bufferWithData, "bufferWithData");
        this.f25589a = bufferWithData;
        this.f25590b = bufferWithData.length;
        b(10);
    }

    @Override // Zi.K0
    public void b(int i10) {
        short[] sArr = this.f25589a;
        if (sArr.length < i10) {
            short[] sArrCopyOf = Arrays.copyOf(sArr, AbstractC7978m.d(i10, sArr.length * 2));
            AbstractC6492s.h(sArrCopyOf, "copyOf(...)");
            this.f25589a = sArrCopyOf;
        }
    }

    @Override // Zi.K0
    public int d() {
        return this.f25590b;
    }

    public final void e(short s10) {
        K0.c(this, 0, 1, null);
        short[] sArr = this.f25589a;
        int iD = d();
        this.f25590b = iD + 1;
        sArr[iD] = s10;
    }

    @Override // Zi.K0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public short[] a() {
        short[] sArrCopyOf = Arrays.copyOf(this.f25589a, d());
        AbstractC6492s.h(sArrCopyOf, "copyOf(...)");
        return sArrCopyOf;
    }
}
