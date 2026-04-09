package kotlinx.serialization.internal;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class j extends p1 {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f22872a;

    /* renamed from: b, reason: collision with root package name */
    public int f22873b;

    public j(byte[] bufferWithData) {
        kotlin.jvm.internal.p.e(bufferWithData, "bufferWithData");
        this.f22872a = bufferWithData;
        this.f22873b = bufferWithData.length;
        b(10);
    }

    @Override // kotlinx.serialization.internal.p1
    public void b(int i10) {
        byte[] bArr = this.f22872a;
        if (bArr.length < i10) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, q9.e.b(i10, bArr.length * 2));
            kotlin.jvm.internal.p.d(bArrCopyOf, "copyOf(this, newSize)");
            this.f22872a = bArrCopyOf;
        }
    }

    @Override // kotlinx.serialization.internal.p1
    public int d() {
        return this.f22873b;
    }

    public final void e(byte b10) {
        p1.c(this, 0, 1, null);
        byte[] bArr = this.f22872a;
        int iD = d();
        this.f22873b = iD + 1;
        bArr[iD] = b10;
    }

    @Override // kotlinx.serialization.internal.p1
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public byte[] a() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f22872a, d());
        kotlin.jvm.internal.p.d(bArrCopyOf, "copyOf(this, newSize)");
        return bArrCopyOf;
    }
}
