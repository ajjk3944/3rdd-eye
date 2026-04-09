package j$.util.stream;

import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class V extends AbstractC2400a0 {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f20971s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f20972t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ V(AbstractC2404b abstractC2404b, int i, Object obj, int i3) {
        super(abstractC2404b, i);
        this.f20971s = i3;
        this.f20972t = obj;
    }

    @Override // j$.util.stream.AbstractC2404b
    public final InterfaceC2472o2 H0(int i, InterfaceC2472o2 interfaceC2472o2) {
        switch (this.f20971s) {
            case 0:
                return new U(this, interfaceC2472o2, 1);
            case 1:
                return new X(this, interfaceC2472o2);
            case 2:
                return new C2459m(this, interfaceC2472o2, 4);
            default:
                return new C2412c2(this, interfaceC2472o2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(AbstractC2405b0 abstractC2405b0, IntConsumer intConsumer) {
        super(abstractC2405b0, 0);
        this.f20971s = 0;
        this.f20972t = intConsumer;
    }
}
