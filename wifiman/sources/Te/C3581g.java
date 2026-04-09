package Te;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.AbstractC6713l0;
import m0.C6733v0;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;

/* renamed from: Te.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C3581g {

    /* renamed from: a, reason: collision with root package name */
    private final long f21838a;

    /* renamed from: b, reason: collision with root package name */
    private final long f21839b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC6839p f21840c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC6835l f21841d;

    /* renamed from: e, reason: collision with root package name */
    private final AbstractC6713l0 f21842e;

    public /* synthetic */ C3581g(long j10, long j11, InterfaceC6839p interfaceC6839p, InterfaceC6835l interfaceC6835l, AbstractC6713l0 abstractC6713l0, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, interfaceC6839p, interfaceC6835l, abstractC6713l0);
    }

    public final long a() {
        return this.f21838a;
    }

    public final InterfaceC6835l b() {
        return this.f21841d;
    }

    public final InterfaceC6839p c() {
        return this.f21840c;
    }

    public final AbstractC6713l0 d() {
        return this.f21842e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3581g)) {
            return false;
        }
        C3581g c3581g = (C3581g) obj;
        return C6733v0.m(this.f21838a, c3581g.f21838a) && C6733v0.m(this.f21839b, c3581g.f21839b) && AbstractC6492s.d(this.f21840c, c3581g.f21840c) && AbstractC6492s.d(this.f21841d, c3581g.f21841d) && AbstractC6492s.d(this.f21842e, c3581g.f21842e);
    }

    public int hashCode() {
        return (((((((C6733v0.s(this.f21838a) * 31) + C6733v0.s(this.f21839b)) * 31) + this.f21840c.hashCode()) * 31) + this.f21841d.hashCode()) * 31) + this.f21842e.hashCode();
    }

    public String toString() {
        return "ChartColors(axisLine=" + C6733v0.t(this.f21838a) + ", axisText=" + C6733v0.t(this.f21839b) + ", lineColor=" + this.f21840c + ", fillBrush=" + this.f21841d + ", outageBrush=" + this.f21842e + ")";
    }

    private C3581g(long j10, long j11, InterfaceC6839p lineColor, InterfaceC6835l fillBrush, AbstractC6713l0 outageBrush) {
        AbstractC6492s.i(lineColor, "lineColor");
        AbstractC6492s.i(fillBrush, "fillBrush");
        AbstractC6492s.i(outageBrush, "outageBrush");
        this.f21838a = j10;
        this.f21839b = j11;
        this.f21840c = lineColor;
        this.f21841d = fillBrush;
        this.f21842e = outageBrush;
    }
}
