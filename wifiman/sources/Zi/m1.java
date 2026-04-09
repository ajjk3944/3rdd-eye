package Zi;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sh.AbstractC7978m;

/* loaded from: classes4.dex */
public final class m1 extends K0 {

    /* renamed from: a, reason: collision with root package name */
    private short[] f25666a;

    /* renamed from: b, reason: collision with root package name */
    private int f25667b;

    public /* synthetic */ m1(short[] sArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(sArr);
    }

    @Override // Zi.K0
    public /* bridge */ /* synthetic */ Object a() {
        return Yg.I.b(f());
    }

    @Override // Zi.K0
    public void b(int i10) {
        if (Yg.I.u(this.f25666a) < i10) {
            short[] sArr = this.f25666a;
            short[] sArrCopyOf = Arrays.copyOf(sArr, AbstractC7978m.d(i10, Yg.I.u(sArr) * 2));
            AbstractC6492s.h(sArrCopyOf, "copyOf(...)");
            this.f25666a = Yg.I.f(sArrCopyOf);
        }
    }

    @Override // Zi.K0
    public int d() {
        return this.f25667b;
    }

    public final void e(short s10) {
        K0.c(this, 0, 1, null);
        short[] sArr = this.f25666a;
        int iD = d();
        this.f25667b = iD + 1;
        Yg.I.y(sArr, iD, s10);
    }

    public short[] f() {
        short[] sArrCopyOf = Arrays.copyOf(this.f25666a, d());
        AbstractC6492s.h(sArrCopyOf, "copyOf(...)");
        return Yg.I.f(sArrCopyOf);
    }

    private m1(short[] bufferWithData) {
        AbstractC6492s.i(bufferWithData, "bufferWithData");
        this.f25666a = bufferWithData;
        this.f25667b = Yg.I.u(bufferWithData);
        b(10);
    }
}
