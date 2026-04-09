package j$.util.stream;

/* renamed from: j$.util.stream.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2493t extends AbstractC2440i0 {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f21161s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2493t(AbstractC2404b abstractC2404b, int i, int i3) {
        super(abstractC2404b, i);
        this.f21161s = i3;
    }

    @Override // j$.util.stream.AbstractC2404b
    public final InterfaceC2472o2 H0(int i, InterfaceC2472o2 interfaceC2472o2) {
        switch (this.f21161s) {
            case 0:
                return new C2474p(this, interfaceC2472o2, 3);
            case 1:
                return new W(0, interfaceC2472o2);
            case 2:
                return new U(this, interfaceC2472o2, 3);
            case 3:
                return new C2410c0(this, interfaceC2472o2, 1);
            case 4:
                return interfaceC2472o2;
            default:
                return new C2410c0(this, interfaceC2472o2, 4);
        }
    }
}
