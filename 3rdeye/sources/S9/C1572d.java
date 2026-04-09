package S9;

/* compiled from: TreeJsonEncoder.kt */
/* renamed from: S9.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1572d extends P9.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC1571c f12077a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f12078b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ O9.e f12079c;

    public C1572d(AbstractC1571c abstractC1571c, String str, O9.e eVar) {
        this.f12077a = abstractC1571c;
        this.f12078b = str;
        this.f12079c = eVar;
    }

    @Override // P9.a, P9.e
    public final void G(String value) {
        kotlin.jvm.internal.l.f(value, "value");
        this.f12077a.X(new R9.u(value, false, this.f12079c), this.f12078b);
    }

    @Override // P9.e
    public final I9.g a() {
        return this.f12077a.f12072b.f11782b;
    }
}
