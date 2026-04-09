package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.nh;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes3.dex */
public abstract class ck implements nh {

    /* renamed from: b, reason: collision with root package name */
    protected nh.a f25678b;

    /* renamed from: c, reason: collision with root package name */
    protected nh.a f25679c;

    /* renamed from: d, reason: collision with root package name */
    private nh.a f25680d;

    /* renamed from: e, reason: collision with root package name */
    private nh.a f25681e;

    /* renamed from: f, reason: collision with root package name */
    private ByteBuffer f25682f;

    /* renamed from: g, reason: collision with root package name */
    private ByteBuffer f25683g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f25684h;

    public ck() {
        ByteBuffer byteBuffer = nh.f30865a;
        this.f25682f = byteBuffer;
        this.f25683g = byteBuffer;
        nh.a aVar = nh.a.f30866e;
        this.f25680d = aVar;
        this.f25681e = aVar;
        this.f25678b = aVar;
        this.f25679c = aVar;
    }

    @Override // com.yandex.mobile.ads.impl.nh
    public final nh.a a(nh.a aVar) throws nh.b {
        this.f25680d = aVar;
        this.f25681e = b(aVar);
        return isActive() ? this.f25681e : nh.a.f30866e;
    }

    public abstract nh.a b(nh.a aVar) throws nh.b;

    @Override // com.yandex.mobile.ads.impl.nh
    public final void b() {
        flush();
        this.f25682f = nh.f30865a;
        nh.a aVar = nh.a.f30866e;
        this.f25680d = aVar;
        this.f25681e = aVar;
        this.f25678b = aVar;
        this.f25679c = aVar;
        h();
    }

    @Override // com.yandex.mobile.ads.impl.nh
    public ByteBuffer c() {
        ByteBuffer byteBuffer = this.f25683g;
        this.f25683g = nh.f30865a;
        return byteBuffer;
    }

    @Override // com.yandex.mobile.ads.impl.nh
    public final void d() {
        this.f25684h = true;
        g();
    }

    public final boolean e() {
        return this.f25683g.hasRemaining();
    }

    @Override // com.yandex.mobile.ads.impl.nh
    public final void flush() {
        this.f25683g = nh.f30865a;
        this.f25684h = false;
        this.f25678b = this.f25680d;
        this.f25679c = this.f25681e;
        f();
    }

    @Override // com.yandex.mobile.ads.impl.nh
    public boolean isActive() {
        return this.f25681e != nh.a.f30866e;
    }

    @Override // com.yandex.mobile.ads.impl.nh
    public boolean a() {
        return this.f25684h && this.f25683g == nh.f30865a;
    }

    public final ByteBuffer a(int i) {
        if (this.f25682f.capacity() < i) {
            this.f25682f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f25682f.clear();
        }
        ByteBuffer byteBuffer = this.f25682f;
        this.f25683g = byteBuffer;
        return byteBuffer;
    }

    public void f() {
    }

    public void g() {
    }

    public void h() {
    }
}
