package y9;

import f5.g0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* loaded from: classes.dex */
public final class y implements g {

    /* renamed from: b, reason: collision with root package name */
    public int f26017b;

    /* renamed from: c, reason: collision with root package name */
    public float f26018c;

    /* renamed from: d, reason: collision with root package name */
    public float f26019d;

    /* renamed from: e, reason: collision with root package name */
    public e f26020e;

    /* renamed from: f, reason: collision with root package name */
    public e f26021f;

    /* renamed from: g, reason: collision with root package name */
    public e f26022g;

    /* renamed from: h, reason: collision with root package name */
    public e f26023h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f26024i;
    public g0 j;
    public ByteBuffer k;

    /* renamed from: l, reason: collision with root package name */
    public ShortBuffer f26025l;

    /* renamed from: m, reason: collision with root package name */
    public ByteBuffer f26026m;

    /* renamed from: n, reason: collision with root package name */
    public long f26027n;

    /* renamed from: o, reason: collision with root package name */
    public long f26028o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f26029p;

    @Override // y9.g
    public final ByteBuffer a() {
        g0 g0Var = this.j;
        if (g0Var != null) {
            int i10 = g0Var.f8491c;
            int i11 = g0Var.f8500n * i10 * 2;
            if (i11 > 0) {
                if (this.k.capacity() < i11) {
                    ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i11).order(ByteOrder.nativeOrder());
                    this.k = byteBufferOrder;
                    this.f26025l = byteBufferOrder.asShortBuffer();
                } else {
                    this.k.clear();
                    this.f26025l.clear();
                }
                ShortBuffer shortBuffer = this.f26025l;
                int iMin = Math.min(shortBuffer.remaining() / i10, g0Var.f8500n);
                int i12 = iMin * i10;
                shortBuffer.put(g0Var.f8499m, 0, i12);
                int i13 = g0Var.f8500n - iMin;
                g0Var.f8500n = i13;
                short[] sArr = g0Var.f8499m;
                System.arraycopy(sArr, i12, sArr, 0, i13 * i10);
                this.f26028o += i11;
                this.k.limit(i11);
                this.f26026m = this.k;
            }
        }
        ByteBuffer byteBuffer = this.f26026m;
        this.f26026m = g.f25922a;
        return byteBuffer;
    }

    @Override // y9.g
    public final boolean b() {
        if (this.f26021f.f25918a != -1) {
            return Math.abs(this.f26018c - 1.0f) >= 1.0E-4f || Math.abs(this.f26019d - 1.0f) >= 1.0E-4f || this.f26021f.f25918a != this.f26020e.f25918a;
        }
        return false;
    }

    @Override // y9.g
    public final boolean c() {
        if (!this.f26029p) {
            return false;
        }
        g0 g0Var = this.j;
        return g0Var == null || (g0Var.f8500n * g0Var.f8491c) * 2 == 0;
    }

    @Override // y9.g
    public final void d(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            g0 g0Var = this.j;
            g0Var.getClass();
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f26027n += iRemaining;
            int iRemaining2 = shortBufferAsShortBuffer.remaining();
            int i10 = g0Var.f8491c;
            int i11 = iRemaining2 / i10;
            short[] sArrC = g0Var.c(g0Var.k, g0Var.f8498l, i11);
            g0Var.k = sArrC;
            shortBufferAsShortBuffer.get(sArrC, g0Var.f8498l * i10, ((i11 * i10) * 2) / 2);
            g0Var.f8498l += i11;
            g0Var.g();
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // y9.g
    public final void e() {
        g0 g0Var = this.j;
        if (g0Var != null) {
            int i10 = g0Var.f8498l;
            float f10 = g0Var.f8492d;
            float f11 = g0Var.f8493e;
            int i11 = g0Var.f8500n + ((int) ((((i10 / (f10 / f11)) + g0Var.f8502p) / (g0Var.f8494f * f11)) + 0.5f));
            short[] sArr = g0Var.k;
            int i12 = g0Var.f8497i * 2;
            g0Var.k = g0Var.c(sArr, i10, i12 + i10);
            int i13 = 0;
            while (true) {
                int i14 = g0Var.f8491c;
                if (i13 >= i12 * i14) {
                    break;
                }
                g0Var.k[(i14 * i10) + i13] = 0;
                i13++;
            }
            g0Var.f8498l = i12 + g0Var.f8498l;
            g0Var.g();
            if (g0Var.f8500n > i11) {
                g0Var.f8500n = i11;
            }
            g0Var.f8498l = 0;
            g0Var.f8505s = 0;
            g0Var.f8502p = 0;
        }
        this.f26029p = true;
    }

    @Override // y9.g
    public final e f(e eVar) throws f {
        if (eVar.f25920c != 2) {
            throw new f(eVar);
        }
        int i10 = this.f26017b;
        if (i10 == -1) {
            i10 = eVar.f25918a;
        }
        this.f26020e = eVar;
        e eVar2 = new e(i10, eVar.f25919b, 2);
        this.f26021f = eVar2;
        this.f26024i = true;
        return eVar2;
    }

    @Override // y9.g
    public final void flush() {
        if (b()) {
            e eVar = this.f26020e;
            this.f26022g = eVar;
            e eVar2 = this.f26021f;
            this.f26023h = eVar2;
            if (this.f26024i) {
                this.j = new g0(eVar.f25918a, eVar.f25919b, this.f26018c, this.f26019d, eVar2.f25918a, 1);
            } else {
                g0 g0Var = this.j;
                if (g0Var != null) {
                    g0Var.f8498l = 0;
                    g0Var.f8500n = 0;
                    g0Var.f8502p = 0;
                    g0Var.f8503q = 0;
                    g0Var.f8504r = 0;
                    g0Var.f8505s = 0;
                    g0Var.f8506t = 0;
                    g0Var.f8507u = 0;
                    g0Var.f8508v = 0;
                    g0Var.f8509w = 0;
                }
            }
        }
        this.f26026m = g.f25922a;
        this.f26027n = 0L;
        this.f26028o = 0L;
        this.f26029p = false;
    }

    @Override // y9.g
    public final void reset() {
        this.f26018c = 1.0f;
        this.f26019d = 1.0f;
        e eVar = e.f25917e;
        this.f26020e = eVar;
        this.f26021f = eVar;
        this.f26022g = eVar;
        this.f26023h = eVar;
        ByteBuffer byteBuffer = g.f25922a;
        this.k = byteBuffer;
        this.f26025l = byteBuffer.asShortBuffer();
        this.f26026m = byteBuffer;
        this.f26017b = -1;
        this.f26024i = false;
        this.j = null;
        this.f26027n = 0L;
        this.f26028o = 0L;
        this.f26029p = false;
    }
}
