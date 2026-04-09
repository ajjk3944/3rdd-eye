package j$.util.stream;

import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2503v extends AbstractC2518y {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f21174s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f21175t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2503v(AbstractC2404b abstractC2404b, int i, Object obj, int i3) {
        super(abstractC2404b, i);
        this.f21174s = i3;
        this.f21175t = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2503v(AbstractC2523z abstractC2523z, DoubleConsumer doubleConsumer) {
        super(abstractC2523z, 0);
        this.f21174s = 1;
        this.f21175t = doubleConsumer;
    }

    @Override // j$.util.stream.AbstractC2404b
    public final InterfaceC2472o2 H0(int i, InterfaceC2472o2 interfaceC2472o2) {
        switch (this.f21174s) {
            case 0:
                return new C2498u(this, interfaceC2472o2);
            case 1:
                return new C2474p(this, interfaceC2472o2, 5);
            case 2:
                return new C2459m(this, interfaceC2472o2, 6);
            default:
                return new C2402a2(this, interfaceC2472o2);
        }
    }
}
