package f5;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public abstract class p implements y4.c {

    /* renamed from: b, reason: collision with root package name */
    public y4.a f8573b;

    /* renamed from: c, reason: collision with root package name */
    public y4.a f8574c;

    /* renamed from: d, reason: collision with root package name */
    public y4.a f8575d;

    /* renamed from: e, reason: collision with root package name */
    public y4.a f8576e;

    /* renamed from: f, reason: collision with root package name */
    public ByteBuffer f8577f;

    /* renamed from: g, reason: collision with root package name */
    public ByteBuffer f8578g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f8579h;

    public p() {
        ByteBuffer byteBuffer = y4.c.f25844a;
        this.f8577f = byteBuffer;
        this.f8578g = byteBuffer;
        y4.a aVar = y4.a.f25839e;
        this.f8575d = aVar;
        this.f8576e = aVar;
        this.f8573b = aVar;
        this.f8574c = aVar;
    }

    @Override // y4.c
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.f8578g;
        this.f8578g = y4.c.f25844a;
        return byteBuffer;
    }

    @Override // y4.c
    public boolean b() {
        return this.f8576e != y4.a.f25839e;
    }

    @Override // y4.c
    public boolean c() {
        return this.f8579h && this.f8578g == y4.c.f25844a;
    }

    @Override // y4.c
    public final void e() {
        this.f8579h = true;
        i();
    }

    @Override // y4.c
    public final y4.a f(y4.a aVar) {
        this.f8575d = aVar;
        this.f8576e = g(aVar);
        return b() ? this.f8576e : y4.a.f25839e;
    }

    @Override // y4.c
    public final void flush() {
        this.f8578g = y4.c.f25844a;
        this.f8579h = false;
        this.f8573b = this.f8575d;
        this.f8574c = this.f8576e;
        h();
    }

    public abstract y4.a g(y4.a aVar);

    public final ByteBuffer k(int i10) {
        if (this.f8577f.capacity() < i10) {
            this.f8577f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f8577f.clear();
        }
        ByteBuffer byteBuffer = this.f8577f;
        this.f8578g = byteBuffer;
        return byteBuffer;
    }

    @Override // y4.c
    public final void reset() {
        flush();
        this.f8577f = y4.c.f25844a;
        y4.a aVar = y4.a.f25839e;
        this.f8575d = aVar;
        this.f8576e = aVar;
        this.f8573b = aVar;
        this.f8574c = aVar;
        j();
    }

    public void h() {
    }

    public void i() {
    }

    public void j() {
    }
}
