package j$.util.stream;

/* renamed from: j$.util.stream.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2488s extends AbstractC2400a0 {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f21156s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2488s(AbstractC2404b abstractC2404b, int i, int i3) {
        super(abstractC2404b, i);
        this.f21156s = i3;
    }

    @Override // j$.util.stream.AbstractC2404b
    public final InterfaceC2472o2 H0(int i, InterfaceC2472o2 interfaceC2472o2) {
        switch (this.f21156s) {
            case 0:
                return new C2474p(this, interfaceC2472o2, 2);
            case 1:
                return new U(this, interfaceC2472o2, 2);
            case 2:
                return interfaceC2472o2;
            case 3:
                return new U(this, interfaceC2472o2, 5);
            default:
                return new C2410c0(this, interfaceC2472o2, 2);
        }
    }
}
