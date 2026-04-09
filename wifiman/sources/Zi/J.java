package Zi;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6492s;
import sh.AbstractC7978m;

/* loaded from: classes4.dex */
public final class J extends K0 {

    /* renamed from: a, reason: collision with root package name */
    private float[] f25569a;

    /* renamed from: b, reason: collision with root package name */
    private int f25570b;

    public J(float[] bufferWithData) {
        AbstractC6492s.i(bufferWithData, "bufferWithData");
        this.f25569a = bufferWithData;
        this.f25570b = bufferWithData.length;
        b(10);
    }

    @Override // Zi.K0
    public void b(int i10) {
        float[] fArr = this.f25569a;
        if (fArr.length < i10) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, AbstractC7978m.d(i10, fArr.length * 2));
            AbstractC6492s.h(fArrCopyOf, "copyOf(...)");
            this.f25569a = fArrCopyOf;
        }
    }

    @Override // Zi.K0
    public int d() {
        return this.f25570b;
    }

    public final void e(float f10) {
        K0.c(this, 0, 1, null);
        float[] fArr = this.f25569a;
        int iD = d();
        this.f25570b = iD + 1;
        fArr[iD] = f10;
    }

    @Override // Zi.K0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public float[] a() {
        float[] fArrCopyOf = Arrays.copyOf(this.f25569a, d());
        AbstractC6492s.h(fArrCopyOf, "copyOf(...)");
        return fArrCopyOf;
    }
}
