package j$.util.stream;

import java.util.function.Consumer;

/* renamed from: j$.util.stream.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2479q extends AbstractC2427f2 {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f21138s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f21139t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2479q(AbstractC2404b abstractC2404b, int i, Object obj, int i3) {
        super(abstractC2404b, i);
        this.f21138s = i3;
        this.f21139t = obj;
    }

    @Override // j$.util.stream.AbstractC2404b
    public final InterfaceC2472o2 H0(int i, InterfaceC2472o2 interfaceC2472o2) {
        switch (this.f21138s) {
            case 0:
                return new C2474p(this, interfaceC2472o2, 0);
            case 1:
                return new U(this, interfaceC2472o2, 0);
            case 2:
                return new C2410c0(this, interfaceC2472o2, 0);
            case 3:
                return new C2459m(this, interfaceC2472o2, 1);
            case 4:
                return new C2459m(this, interfaceC2472o2, 2);
            case 5:
                return new C2459m(this, interfaceC2472o2, 3);
            default:
                return new C2454l(this, interfaceC2472o2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2479q(AbstractC2432g2 abstractC2432g2, Consumer consumer) {
        super(abstractC2432g2, 0);
        this.f21138s = 3;
        this.f21139t = consumer;
    }
}
