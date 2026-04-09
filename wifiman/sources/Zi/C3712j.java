package Zi;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6492s;
import sh.AbstractC7978m;

/* renamed from: Zi.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3712j extends K0 {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f25645a;

    /* renamed from: b, reason: collision with root package name */
    private int f25646b;

    public C3712j(byte[] bufferWithData) {
        AbstractC6492s.i(bufferWithData, "bufferWithData");
        this.f25645a = bufferWithData;
        this.f25646b = bufferWithData.length;
        b(10);
    }

    @Override // Zi.K0
    public void b(int i10) {
        byte[] bArr = this.f25645a;
        if (bArr.length < i10) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, AbstractC7978m.d(i10, bArr.length * 2));
            AbstractC6492s.h(bArrCopyOf, "copyOf(...)");
            this.f25645a = bArrCopyOf;
        }
    }

    @Override // Zi.K0
    public int d() {
        return this.f25646b;
    }

    public final void e(byte b10) {
        K0.c(this, 0, 1, null);
        byte[] bArr = this.f25645a;
        int iD = d();
        this.f25646b = iD + 1;
        bArr[iD] = b10;
    }

    @Override // Zi.K0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public byte[] a() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f25645a, d());
        AbstractC6492s.h(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }
}
