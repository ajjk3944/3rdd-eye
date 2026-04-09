package kotlinx.serialization.json.internal;

/* loaded from: classes4.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f23030a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f23031b;

    public j(d0 writer) {
        kotlin.jvm.internal.p.e(writer, "writer");
        this.f23030a = writer;
        this.f23031b = true;
    }

    public final boolean a() {
        return this.f23031b;
    }

    public void b() {
        this.f23031b = true;
    }

    public void c() {
        this.f23031b = false;
    }

    public void d(byte b10) {
        this.f23030a.writeLong(b10);
    }

    public final void e(char c10) {
        this.f23030a.a(c10);
    }

    public void f(double d10) {
        this.f23030a.c(String.valueOf(d10));
    }

    public void g(float f10) {
        this.f23030a.c(String.valueOf(f10));
    }

    public void h(int i10) {
        this.f23030a.writeLong(i10);
    }

    public void i(long j10) {
        this.f23030a.writeLong(j10);
    }

    public final void j(String v10) {
        kotlin.jvm.internal.p.e(v10, "v");
        this.f23030a.c(v10);
    }

    public void k(short s10) {
        this.f23030a.writeLong(s10);
    }

    public void l(boolean z10) {
        this.f23030a.c(String.valueOf(z10));
    }

    public final void m(String value) {
        kotlin.jvm.internal.p.e(value, "value");
        this.f23030a.b(value);
    }

    public final void n(boolean z10) {
        this.f23031b = z10;
    }

    public void o() {
    }

    public void p() {
    }
}
