package J0;

import mh.InterfaceC6824a;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6824a f9611a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6824a f9612b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f9613c;

    public h(InterfaceC6824a interfaceC6824a, InterfaceC6824a interfaceC6824a2, boolean z10) {
        this.f9611a = interfaceC6824a;
        this.f9612b = interfaceC6824a2;
        this.f9613c = z10;
    }

    public final InterfaceC6824a a() {
        return this.f9612b;
    }

    public final boolean b() {
        return this.f9613c;
    }

    public final InterfaceC6824a c() {
        return this.f9611a;
    }

    public String toString() {
        return "ScrollAxisRange(value=" + ((Number) this.f9611a.invoke()).floatValue() + ", maxValue=" + ((Number) this.f9612b.invoke()).floatValue() + ", reverseScrolling=" + this.f9613c + ')';
    }
}
