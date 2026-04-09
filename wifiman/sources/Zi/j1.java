package Zi;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sh.AbstractC7978m;

/* loaded from: classes4.dex */
public final class j1 extends K0 {

    /* renamed from: a, reason: collision with root package name */
    private long[] f25650a;

    /* renamed from: b, reason: collision with root package name */
    private int f25651b;

    public /* synthetic */ j1(long[] jArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(jArr);
    }

    @Override // Zi.K0
    public /* bridge */ /* synthetic */ Object a() {
        return Yg.F.b(f());
    }

    @Override // Zi.K0
    public void b(int i10) {
        if (Yg.F.u(this.f25650a) < i10) {
            long[] jArr = this.f25650a;
            long[] jArrCopyOf = Arrays.copyOf(jArr, AbstractC7978m.d(i10, Yg.F.u(jArr) * 2));
            AbstractC6492s.h(jArrCopyOf, "copyOf(...)");
            this.f25650a = Yg.F.f(jArrCopyOf);
        }
    }

    @Override // Zi.K0
    public int d() {
        return this.f25651b;
    }

    public final void e(long j10) {
        K0.c(this, 0, 1, null);
        long[] jArr = this.f25650a;
        int iD = d();
        this.f25651b = iD + 1;
        Yg.F.y(jArr, iD, j10);
    }

    public long[] f() {
        long[] jArrCopyOf = Arrays.copyOf(this.f25650a, d());
        AbstractC6492s.h(jArrCopyOf, "copyOf(...)");
        return Yg.F.f(jArrCopyOf);
    }

    private j1(long[] bufferWithData) {
        AbstractC6492s.i(bufferWithData, "bufferWithData");
        this.f25650a = bufferWithData;
        this.f25651b = Yg.F.u(bufferWithData);
        b(10);
    }
}
