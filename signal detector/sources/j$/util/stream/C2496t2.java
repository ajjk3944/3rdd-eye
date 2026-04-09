package j$.util.stream;

/* renamed from: j$.util.stream.t2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2496t2 extends AbstractC2447j2 {

    /* renamed from: b, reason: collision with root package name */
    public long f21165b;

    /* renamed from: c, reason: collision with root package name */
    public long f21166c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2501u2 f21167d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2496t2(C2501u2 c2501u2, InterfaceC2472o2 interfaceC2472o2) {
        super(interfaceC2472o2);
        this.f21167d = c2501u2;
        this.f21165b = c2501u2.f21172s;
        long j6 = c2501u2.f21173t;
        this.f21166c = j6 < 0 ? Long.MAX_VALUE : j6;
    }

    @Override // j$.util.stream.AbstractC2447j2, j$.util.stream.InterfaceC2472o2
    public final void c(long j6) {
        this.f21100a.c(AbstractC2526z2.a(j6, this.f21167d.f21172s, this.f21166c));
    }

    @Override // j$.util.stream.InterfaceC2467n2, j$.util.stream.InterfaceC2472o2
    public final void accept(long j6) {
        long j7 = this.f21165b;
        if (j7 == 0) {
            long j8 = this.f21166c;
            if (j8 > 0) {
                this.f21166c = j8 - 1;
                this.f21100a.accept(j6);
                return;
            }
            return;
        }
        this.f21165b = j7 - 1;
    }

    @Override // j$.util.stream.AbstractC2447j2, j$.util.stream.InterfaceC2472o2
    public final boolean e() {
        return this.f21166c == 0 || this.f21100a.e();
    }
}
