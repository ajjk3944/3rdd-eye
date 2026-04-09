package j$.util.stream;

import java.util.function.Supplier;

/* renamed from: j$.util.stream.n0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2465n0 implements Supplier {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21122a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EnumC2494t0 f21123b;

    public /* synthetic */ C2465n0(EnumC2494t0 enumC2494t0, int i) {
        this.f21122a = i;
        this.f21123b = enumC2494t0;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f21122a) {
            case 0:
                return new C2480q0(this.f21123b);
            case 1:
                return new C2475p0(this.f21123b);
            default:
                return new C2484r0(this.f21123b);
        }
    }
}
