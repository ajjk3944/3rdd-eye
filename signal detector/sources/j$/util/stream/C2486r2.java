package j$.util.stream;

/* renamed from: j$.util.stream.r2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2486r2 extends AbstractC2442i2 {

    /* renamed from: b, reason: collision with root package name */
    public long f21153b;

    /* renamed from: c, reason: collision with root package name */
    public long f21154c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2491s2 f21155d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2486r2(C2491s2 c2491s2, InterfaceC2472o2 interfaceC2472o2) {
        super(interfaceC2472o2);
        this.f21155d = c2491s2;
        this.f21153b = c2491s2.f21159s;
        long j6 = c2491s2.f21160t;
        this.f21154c = j6 < 0 ? Long.MAX_VALUE : j6;
    }

    @Override // j$.util.stream.AbstractC2442i2, j$.util.stream.InterfaceC2472o2
    public final void c(long j6) {
        this.f21088a.c(AbstractC2526z2.a(j6, this.f21155d.f21159s, this.f21154c));
    }

    @Override // j$.util.stream.InterfaceC2462m2, j$.util.stream.InterfaceC2472o2
    public final void accept(int i) {
        long j6 = this.f21153b;
        if (j6 == 0) {
            long j7 = this.f21154c;
            if (j7 > 0) {
                this.f21154c = j7 - 1;
                this.f21088a.accept(i);
                return;
            }
            return;
        }
        this.f21153b = j6 - 1;
    }

    @Override // j$.util.stream.AbstractC2442i2, j$.util.stream.InterfaceC2472o2
    public final boolean e() {
        return this.f21154c == 0 || this.f21088a.e();
    }
}
