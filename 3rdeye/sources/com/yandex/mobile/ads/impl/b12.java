package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.nh;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* loaded from: classes3.dex */
public final class b12 implements nh {

    /* renamed from: b, reason: collision with root package name */
    private int f25047b;

    /* renamed from: c, reason: collision with root package name */
    private float f25048c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    private float f25049d = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    private nh.a f25050e;

    /* renamed from: f, reason: collision with root package name */
    private nh.a f25051f;

    /* renamed from: g, reason: collision with root package name */
    private nh.a f25052g;

    /* renamed from: h, reason: collision with root package name */
    private nh.a f25053h;
    private boolean i;

    /* renamed from: j, reason: collision with root package name */
    private a12 f25054j;

    /* renamed from: k, reason: collision with root package name */
    private ByteBuffer f25055k;

    /* renamed from: l, reason: collision with root package name */
    private ShortBuffer f25056l;

    /* renamed from: m, reason: collision with root package name */
    private ByteBuffer f25057m;

    /* renamed from: n, reason: collision with root package name */
    private long f25058n;

    /* renamed from: o, reason: collision with root package name */
    private long f25059o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f25060p;

    public b12() {
        nh.a aVar = nh.a.f30866e;
        this.f25050e = aVar;
        this.f25051f = aVar;
        this.f25052g = aVar;
        this.f25053h = aVar;
        ByteBuffer byteBuffer = nh.f30865a;
        this.f25055k = byteBuffer;
        this.f25056l = byteBuffer.asShortBuffer();
        this.f25057m = byteBuffer;
        this.f25047b = -1;
    }

    @Override // com.yandex.mobile.ads.impl.nh
    public final nh.a a(nh.a aVar) throws nh.b {
        if (aVar.f30869c != 2) {
            throw new nh.b(aVar);
        }
        int i = this.f25047b;
        if (i == -1) {
            i = aVar.f30867a;
        }
        this.f25050e = aVar;
        nh.a aVar2 = new nh.a(i, aVar.f30868b, 2);
        this.f25051f = aVar2;
        this.i = true;
        return aVar2;
    }

    @Override // com.yandex.mobile.ads.impl.nh
    public final void b() {
        this.f25048c = 1.0f;
        this.f25049d = 1.0f;
        nh.a aVar = nh.a.f30866e;
        this.f25050e = aVar;
        this.f25051f = aVar;
        this.f25052g = aVar;
        this.f25053h = aVar;
        ByteBuffer byteBuffer = nh.f30865a;
        this.f25055k = byteBuffer;
        this.f25056l = byteBuffer.asShortBuffer();
        this.f25057m = byteBuffer;
        this.f25047b = -1;
        this.i = false;
        this.f25054j = null;
        this.f25058n = 0L;
        this.f25059o = 0L;
        this.f25060p = false;
    }

    @Override // com.yandex.mobile.ads.impl.nh
    public final ByteBuffer c() {
        int iB;
        a12 a12Var = this.f25054j;
        if (a12Var != null && (iB = a12Var.b()) > 0) {
            if (this.f25055k.capacity() < iB) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(iB).order(ByteOrder.nativeOrder());
                this.f25055k = byteBufferOrder;
                this.f25056l = byteBufferOrder.asShortBuffer();
            } else {
                this.f25055k.clear();
                this.f25056l.clear();
            }
            a12Var.a(this.f25056l);
            this.f25059o += iB;
            this.f25055k.limit(iB);
            this.f25057m = this.f25055k;
        }
        ByteBuffer byteBuffer = this.f25057m;
        this.f25057m = nh.f30865a;
        return byteBuffer;
    }

    @Override // com.yandex.mobile.ads.impl.nh
    public final void d() {
        a12 a12Var = this.f25054j;
        if (a12Var != null) {
            a12Var.e();
        }
        this.f25060p = true;
    }

    @Override // com.yandex.mobile.ads.impl.nh
    public final void flush() {
        if (isActive()) {
            nh.a aVar = this.f25050e;
            this.f25052g = aVar;
            nh.a aVar2 = this.f25051f;
            this.f25053h = aVar2;
            if (this.i) {
                this.f25054j = new a12(aVar.f30867a, aVar.f30868b, this.f25048c, this.f25049d, aVar2.f30867a);
            } else {
                a12 a12Var = this.f25054j;
                if (a12Var != null) {
                    a12Var.a();
                }
            }
        }
        this.f25057m = nh.f30865a;
        this.f25058n = 0L;
        this.f25059o = 0L;
        this.f25060p = false;
    }

    @Override // com.yandex.mobile.ads.impl.nh
    public final boolean isActive() {
        if (this.f25051f.f30867a != -1) {
            return Math.abs(this.f25048c - 1.0f) >= 1.0E-4f || Math.abs(this.f25049d - 1.0f) >= 1.0E-4f || this.f25051f.f30867a != this.f25050e.f30867a;
        }
        return false;
    }

    public final long a(long j4) {
        if (this.f25059o >= 1024) {
            long j10 = this.f25058n;
            this.f25054j.getClass();
            long jC = j10 - r2.c();
            int i = this.f25053h.f30867a;
            int i10 = this.f25052g.f30867a;
            if (i == i10) {
                return s82.a(j4, jC, this.f25059o);
            }
            return s82.a(j4, jC * i, this.f25059o * i10);
        }
        return (long) (this.f25048c * j4);
    }

    @Override // com.yandex.mobile.ads.impl.nh
    public final boolean a() {
        if (!this.f25060p) {
            return false;
        }
        a12 a12Var = this.f25054j;
        return a12Var == null || a12Var.b() == 0;
    }

    public final void b(float f10) {
        if (this.f25048c != f10) {
            this.f25048c = f10;
            this.i = true;
        }
    }

    @Override // com.yandex.mobile.ads.impl.nh
    public final void a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            a12 a12Var = this.f25054j;
            a12Var.getClass();
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f25058n += iRemaining;
            a12Var.b(shortBufferAsShortBuffer);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    public final void a(float f10) {
        if (this.f25049d != f10) {
            this.f25049d = f10;
            this.i = true;
        }
    }
}
