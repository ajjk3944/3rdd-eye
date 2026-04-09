package Zi;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sh.AbstractC7978m;

/* loaded from: classes4.dex */
public final class g1 extends K0 {

    /* renamed from: a, reason: collision with root package name */
    private int[] f25633a;

    /* renamed from: b, reason: collision with root package name */
    private int f25634b;

    public /* synthetic */ g1(int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(iArr);
    }

    @Override // Zi.K0
    public /* bridge */ /* synthetic */ Object a() {
        return Yg.D.b(f());
    }

    @Override // Zi.K0
    public void b(int i10) {
        if (Yg.D.u(this.f25633a) < i10) {
            int[] iArr = this.f25633a;
            int[] iArrCopyOf = Arrays.copyOf(iArr, AbstractC7978m.d(i10, Yg.D.u(iArr) * 2));
            AbstractC6492s.h(iArrCopyOf, "copyOf(...)");
            this.f25633a = Yg.D.f(iArrCopyOf);
        }
    }

    @Override // Zi.K0
    public int d() {
        return this.f25634b;
    }

    public final void e(int i10) {
        K0.c(this, 0, 1, null);
        int[] iArr = this.f25633a;
        int iD = d();
        this.f25634b = iD + 1;
        Yg.D.y(iArr, iD, i10);
    }

    public int[] f() {
        int[] iArrCopyOf = Arrays.copyOf(this.f25633a, d());
        AbstractC6492s.h(iArrCopyOf, "copyOf(...)");
        return Yg.D.f(iArrCopyOf);
    }

    private g1(int[] bufferWithData) {
        AbstractC6492s.i(bufferWithData, "bufferWithData");
        this.f25633a = bufferWithData;
        this.f25634b = Yg.D.u(bufferWithData);
        b(10);
    }
}
