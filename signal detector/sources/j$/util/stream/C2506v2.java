package j$.util.stream;

/* renamed from: j$.util.stream.v2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2506v2 extends AbstractC2437h2 {

    /* renamed from: b, reason: collision with root package name */
    public long f21180b;

    /* renamed from: c, reason: collision with root package name */
    public long f21181c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2511w2 f21182d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2506v2(C2511w2 c2511w2, InterfaceC2472o2 interfaceC2472o2) {
        super(interfaceC2472o2);
        this.f21182d = c2511w2;
        this.f21180b = c2511w2.f21190s;
        long j6 = c2511w2.f21191t;
        this.f21181c = j6 < 0 ? Long.MAX_VALUE : j6;
    }

    @Override // j$.util.stream.AbstractC2437h2, j$.util.stream.InterfaceC2472o2
    public final void c(long j6) {
        this.f21082a.c(AbstractC2526z2.a(j6, this.f21182d.f21190s, this.f21181c));
    }

    @Override // j$.util.stream.InterfaceC2457l2, java.util.function.DoubleConsumer
    public final void accept(double d6) {
        long j6 = this.f21180b;
        if (j6 == 0) {
            long j7 = this.f21181c;
            if (j7 > 0) {
                this.f21181c = j7 - 1;
                this.f21082a.accept(d6);
                return;
            }
            return;
        }
        this.f21180b = j6 - 1;
    }

    @Override // j$.util.stream.AbstractC2437h2, j$.util.stream.InterfaceC2472o2
    public final boolean e() {
        return this.f21181c == 0 || this.f21082a.e();
    }
}
