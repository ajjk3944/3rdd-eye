package j$.util.stream;

/* loaded from: classes2.dex */
public final class W extends AbstractC2442i2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20975b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ W(int i, InterfaceC2472o2 interfaceC2472o2) {
        super(interfaceC2472o2);
        this.f20975b = i;
    }

    @Override // j$.util.stream.InterfaceC2462m2, j$.util.stream.InterfaceC2472o2
    public final void accept(int i) {
        switch (this.f20975b) {
            case 0:
                this.f21088a.accept(i);
                break;
            default:
                this.f21088a.accept(i);
                break;
        }
    }
}
