package L6;

import G6.B;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f11236a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11237b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11238c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f11239d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f11240e;

    /* renamed from: f, reason: collision with root package name */
    public final B.b f11241f;

    public a(int i10, int i11, int i12, boolean z10, boolean z11, B.b bVar) {
        this.f11236a = i10;
        this.f11237b = i11;
        this.f11238c = i12;
        this.f11239d = z10;
        this.f11240e = z11;
        this.f11241f = bVar;
    }

    public a a(B b10) {
        return new a(b10.a() != null ? b10.a().intValue() : this.f11236a, b10.c() != null ? b10.c().intValue() : this.f11237b, b10.f() != null ? b10.f().intValue() : this.f11238c, b10.d() != null ? b10.d().booleanValue() : this.f11239d, b10.e() != null ? b10.e().booleanValue() : this.f11240e, b10.b() != null ? b10.b() : this.f11241f);
    }

    public String toString() {
        return "LoggerSetup{logLevel=" + this.f11236a + ", macAddressLogSetting=" + this.f11237b + ", uuidLogSetting=" + this.f11238c + ", shouldLogAttributeValues=" + this.f11239d + ", shouldLogScannedPeripherals=" + this.f11240e + ", logger=" + this.f11241f + '}';
    }
}
