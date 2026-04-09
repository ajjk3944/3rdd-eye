package j$.util.stream;

/* renamed from: j$.util.stream.p2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2477p2 extends AbstractC2452k2 {

    /* renamed from: b, reason: collision with root package name */
    public long f21135b;

    /* renamed from: c, reason: collision with root package name */
    public long f21136c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2482q2 f21137d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2477p2(C2482q2 c2482q2, InterfaceC2472o2 interfaceC2472o2) {
        super(interfaceC2472o2);
        this.f21137d = c2482q2;
        this.f21135b = c2482q2.f21141s;
        long j6 = c2482q2.f21142t;
        this.f21136c = j6 < 0 ? Long.MAX_VALUE : j6;
    }

    @Override // j$.util.stream.AbstractC2452k2, j$.util.stream.InterfaceC2472o2
    public final void c(long j6) {
        this.f21108a.c(AbstractC2526z2.a(j6, this.f21137d.f21141s, this.f21136c));
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void o(Object obj) {
        long j6 = this.f21135b;
        if (j6 == 0) {
            long j7 = this.f21136c;
            if (j7 > 0) {
                this.f21136c = j7 - 1;
                this.f21108a.o((InterfaceC2472o2) obj);
                return;
            }
            return;
        }
        this.f21135b = j6 - 1;
    }

    @Override // j$.util.stream.AbstractC2452k2, j$.util.stream.InterfaceC2472o2
    public final boolean e() {
        return this.f21136c == 0 || this.f21108a.e();
    }
}
