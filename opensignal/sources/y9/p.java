package y9;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public abstract class p implements g {

    /* renamed from: b, reason: collision with root package name */
    public e f25958b;

    /* renamed from: c, reason: collision with root package name */
    public e f25959c;

    /* renamed from: d, reason: collision with root package name */
    public e f25960d;

    /* renamed from: e, reason: collision with root package name */
    public e f25961e;

    /* renamed from: f, reason: collision with root package name */
    public ByteBuffer f25962f;

    /* renamed from: g, reason: collision with root package name */
    public ByteBuffer f25963g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f25964h;

    public p() {
        ByteBuffer byteBuffer = g.f25922a;
        this.f25962f = byteBuffer;
        this.f25963g = byteBuffer;
        e eVar = e.f25917e;
        this.f25960d = eVar;
        this.f25961e = eVar;
        this.f25958b = eVar;
        this.f25959c = eVar;
    }

    @Override // y9.g
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.f25963g;
        this.f25963g = g.f25922a;
        return byteBuffer;
    }

    @Override // y9.g
    public boolean b() {
        return this.f25961e != e.f25917e;
    }

    @Override // y9.g
    public boolean c() {
        return this.f25964h && this.f25963g == g.f25922a;
    }

    @Override // y9.g
    public final void e() {
        this.f25964h = true;
        i();
    }

    @Override // y9.g
    public final e f(e eVar) {
        this.f25960d = eVar;
        this.f25961e = g(eVar);
        return b() ? this.f25961e : e.f25917e;
    }

    @Override // y9.g
    public final void flush() {
        this.f25963g = g.f25922a;
        this.f25964h = false;
        this.f25958b = this.f25960d;
        this.f25959c = this.f25961e;
        h();
    }

    public abstract e g(e eVar);

    public final ByteBuffer k(int i10) {
        if (this.f25962f.capacity() < i10) {
            this.f25962f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f25962f.clear();
        }
        ByteBuffer byteBuffer = this.f25962f;
        this.f25963g = byteBuffer;
        return byteBuffer;
    }

    @Override // y9.g
    public final void reset() {
        flush();
        this.f25962f = g.f25922a;
        e eVar = e.f25917e;
        this.f25960d = eVar;
        this.f25961e = eVar;
        this.f25958b = eVar;
        this.f25959c = eVar;
        j();
    }

    public void h() {
    }

    public void i() {
    }

    public void j() {
    }
}
