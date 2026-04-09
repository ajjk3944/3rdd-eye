package kotlinx.serialization.internal;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class e2 extends p1 {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f22848a;

    /* renamed from: b, reason: collision with root package name */
    public int f22849b;

    public /* synthetic */ e2(byte[] bArr, kotlin.jvm.internal.i iVar) {
        this(bArr);
    }

    @Override // kotlinx.serialization.internal.p1
    public /* bridge */ /* synthetic */ Object a() {
        return y8.k.c(f());
    }

    @Override // kotlinx.serialization.internal.p1
    public void b(int i10) {
        if (y8.k.u(this.f22848a) < i10) {
            byte[] bArr = this.f22848a;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, q9.e.b(i10, y8.k.u(bArr) * 2));
            kotlin.jvm.internal.p.d(bArrCopyOf, "copyOf(this, newSize)");
            this.f22848a = y8.k.e(bArrCopyOf);
        }
    }

    @Override // kotlinx.serialization.internal.p1
    public int d() {
        return this.f22849b;
    }

    public final void e(byte b10) {
        p1.c(this, 0, 1, null);
        byte[] bArr = this.f22848a;
        int iD = d();
        this.f22849b = iD + 1;
        y8.k.y(bArr, iD, b10);
    }

    public byte[] f() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f22848a, d());
        kotlin.jvm.internal.p.d(bArrCopyOf, "copyOf(this, newSize)");
        return y8.k.e(bArrCopyOf);
    }

    public e2(byte[] bArr) {
        this.f22848a = bArr;
        this.f22849b = y8.k.u(bArr);
        b(10);
    }
}
