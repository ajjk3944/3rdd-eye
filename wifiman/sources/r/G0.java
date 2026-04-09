package r;

/* loaded from: classes.dex */
public final class G0 implements z0 {

    /* renamed from: a, reason: collision with root package name */
    private final float f59475a;

    /* renamed from: b, reason: collision with root package name */
    private final float f59476b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ A0 f59477c;

    private G0(float f10, float f11, InterfaceC7543s interfaceC7543s) {
        this.f59475a = f10;
        this.f59476b = f11;
        this.f59477c = new A0(interfaceC7543s);
    }

    @Override // r.z0, r.v0
    public boolean a() {
        return this.f59477c.a();
    }

    @Override // r.v0
    public long b(AbstractC7542q abstractC7542q, AbstractC7542q abstractC7542q2, AbstractC7542q abstractC7542q3) {
        return this.f59477c.b(abstractC7542q, abstractC7542q2, abstractC7542q3);
    }

    @Override // r.v0
    public AbstractC7542q c(long j10, AbstractC7542q abstractC7542q, AbstractC7542q abstractC7542q2, AbstractC7542q abstractC7542q3) {
        return this.f59477c.c(j10, abstractC7542q, abstractC7542q2, abstractC7542q3);
    }

    @Override // r.v0
    public AbstractC7542q d(AbstractC7542q abstractC7542q, AbstractC7542q abstractC7542q2, AbstractC7542q abstractC7542q3) {
        return this.f59477c.d(abstractC7542q, abstractC7542q2, abstractC7542q3);
    }

    @Override // r.v0
    public AbstractC7542q f(long j10, AbstractC7542q abstractC7542q, AbstractC7542q abstractC7542q2, AbstractC7542q abstractC7542q3) {
        return this.f59477c.f(j10, abstractC7542q, abstractC7542q2, abstractC7542q3);
    }

    public G0(float f10, float f11, AbstractC7542q abstractC7542q) {
        this(f10, f11, w0.c(abstractC7542q, f10, f11));
    }
}
