package Zi;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6492s;
import sh.AbstractC7978m;

/* renamed from: Zi.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3706g extends K0 {

    /* renamed from: a, reason: collision with root package name */
    private boolean[] f25630a;

    /* renamed from: b, reason: collision with root package name */
    private int f25631b;

    public C3706g(boolean[] bufferWithData) {
        AbstractC6492s.i(bufferWithData, "bufferWithData");
        this.f25630a = bufferWithData;
        this.f25631b = bufferWithData.length;
        b(10);
    }

    @Override // Zi.K0
    public void b(int i10) {
        boolean[] zArr = this.f25630a;
        if (zArr.length < i10) {
            boolean[] zArrCopyOf = Arrays.copyOf(zArr, AbstractC7978m.d(i10, zArr.length * 2));
            AbstractC6492s.h(zArrCopyOf, "copyOf(...)");
            this.f25630a = zArrCopyOf;
        }
    }

    @Override // Zi.K0
    public int d() {
        return this.f25631b;
    }

    public final void e(boolean z10) {
        K0.c(this, 0, 1, null);
        boolean[] zArr = this.f25630a;
        int iD = d();
        this.f25631b = iD + 1;
        zArr[iD] = z10;
    }

    @Override // Zi.K0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean[] a() {
        boolean[] zArrCopyOf = Arrays.copyOf(this.f25630a, d());
        AbstractC6492s.h(zArrCopyOf, "copyOf(...)");
        return zArrCopyOf;
    }
}
