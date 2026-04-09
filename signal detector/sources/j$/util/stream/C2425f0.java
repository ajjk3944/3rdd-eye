package j$.util.stream;

import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.f0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2425f0 extends AbstractC2440i0 {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f21074s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f21075t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2425f0(AbstractC2404b abstractC2404b, int i, Object obj, int i3) {
        super(abstractC2404b, i);
        this.f21074s = i3;
        this.f21075t = obj;
    }

    @Override // j$.util.stream.AbstractC2404b
    public final InterfaceC2472o2 H0(int i, InterfaceC2472o2 interfaceC2472o2) {
        switch (this.f21074s) {
            case 0:
                return new C2420e0(this, interfaceC2472o2);
            case 1:
                return new C2410c0(this, interfaceC2472o2, 5);
            case 2:
                return new C2402a2(this, interfaceC2472o2);
            default:
                return new C2459m(this, interfaceC2472o2, 5);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2425f0(AbstractC2445j0 abstractC2445j0, LongConsumer longConsumer) {
        super(abstractC2445j0, 0);
        this.f21074s = 1;
        this.f21075t = longConsumer;
    }
}
