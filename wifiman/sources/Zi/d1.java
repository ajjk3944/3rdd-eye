package Zi;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sh.AbstractC7978m;

/* loaded from: classes4.dex */
public final class d1 extends K0 {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f25620a;

    /* renamed from: b, reason: collision with root package name */
    private int f25621b;

    public /* synthetic */ d1(byte[] bArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr);
    }

    @Override // Zi.K0
    public /* bridge */ /* synthetic */ Object a() {
        return Yg.B.b(f());
    }

    @Override // Zi.K0
    public void b(int i10) {
        if (Yg.B.u(this.f25620a) < i10) {
            byte[] bArr = this.f25620a;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, AbstractC7978m.d(i10, Yg.B.u(bArr) * 2));
            AbstractC6492s.h(bArrCopyOf, "copyOf(...)");
            this.f25620a = Yg.B.f(bArrCopyOf);
        }
    }

    @Override // Zi.K0
    public int d() {
        return this.f25621b;
    }

    public final void e(byte b10) {
        K0.c(this, 0, 1, null);
        byte[] bArr = this.f25620a;
        int iD = d();
        this.f25621b = iD + 1;
        Yg.B.y(bArr, iD, b10);
    }

    public byte[] f() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f25620a, d());
        AbstractC6492s.h(bArrCopyOf, "copyOf(...)");
        return Yg.B.f(bArrCopyOf);
    }

    private d1(byte[] bufferWithData) {
        AbstractC6492s.i(bufferWithData, "bufferWithData");
        this.f25620a = bufferWithData;
        this.f25621b = Yg.B.u(bufferWithData);
        b(10);
    }
}
