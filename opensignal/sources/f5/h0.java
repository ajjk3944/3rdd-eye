package f5;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* loaded from: classes.dex */
public final class h0 implements y4.c {

    /* renamed from: b, reason: collision with root package name */
    public int f8513b;

    /* renamed from: c, reason: collision with root package name */
    public float f8514c;

    /* renamed from: d, reason: collision with root package name */
    public float f8515d;

    /* renamed from: e, reason: collision with root package name */
    public y4.a f8516e;

    /* renamed from: f, reason: collision with root package name */
    public y4.a f8517f;

    /* renamed from: g, reason: collision with root package name */
    public y4.a f8518g;

    /* renamed from: h, reason: collision with root package name */
    public y4.a f8519h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f8520i;
    public g0 j;
    public ByteBuffer k;

    /* renamed from: l, reason: collision with root package name */
    public ShortBuffer f8521l;

    /* renamed from: m, reason: collision with root package name */
    public ByteBuffer f8522m;

    /* renamed from: n, reason: collision with root package name */
    public long f8523n;

    /* renamed from: o, reason: collision with root package name */
    public long f8524o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f8525p;

    @Override // y4.c
    public final ByteBuffer a() {
        g0 g0Var = this.j;
        if (g0Var != null) {
            int i10 = g0Var.f8491c;
            int i11 = g0Var.f8500n * i10 * 2;
            if (i11 > 0) {
                if (this.k.capacity() < i11) {
                    ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i11).order(ByteOrder.nativeOrder());
                    this.k = byteBufferOrder;
                    this.f8521l = byteBufferOrder.asShortBuffer();
                } else {
                    this.k.clear();
                    this.f8521l.clear();
                }
                ShortBuffer shortBuffer = this.f8521l;
                int iMin = Math.min(shortBuffer.remaining() / i10, g0Var.f8500n);
                int i12 = iMin * i10;
                shortBuffer.put(g0Var.f8499m, 0, i12);
                int i13 = g0Var.f8500n - iMin;
                g0Var.f8500n = i13;
                short[] sArr = g0Var.f8499m;
                System.arraycopy(sArr, i12, sArr, 0, i13 * i10);
                this.f8524o += i11;
                this.k.limit(i11);
                this.f8522m = this.k;
            }
        }
        ByteBuffer byteBuffer = this.f8522m;
        this.f8522m = y4.c.f25844a;
        return byteBuffer;
    }

    @Override // y4.c
    public final boolean b() {
        if (this.f8517f.f25840a != -1) {
            return Math.abs(this.f8514c - 1.0f) >= 1.0E-4f || Math.abs(this.f8515d - 1.0f) >= 1.0E-4f || this.f8517f.f25840a != this.f8516e.f25840a;
        }
        return false;
    }

    @Override // y4.c
    public final boolean c() {
        if (!this.f8525p) {
            return false;
        }
        g0 g0Var = this.j;
        return g0Var == null || (g0Var.f8500n * g0Var.f8491c) * 2 == 0;
    }

    @Override // y4.c
    public final void d(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            g0 g0Var = this.j;
            g0Var.getClass();
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f8523n += iRemaining;
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

    @Override // y4.c
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
        this.f8525p = true;
    }

    @Override // y4.c
    public final y4.a f(y4.a aVar) throws y4.b {
        if (aVar.f25842c != 2) {
            throw new y4.b(aVar);
        }
        int i10 = this.f8513b;
        if (i10 == -1) {
            i10 = aVar.f25840a;
        }
        this.f8516e = aVar;
        y4.a aVar2 = new y4.a(i10, aVar.f25841b, 2);
        this.f8517f = aVar2;
        this.f8520i = true;
        return aVar2;
    }

    @Override // y4.c
    public final void flush() {
        if (b()) {
            y4.a aVar = this.f8516e;
            this.f8518g = aVar;
            y4.a aVar2 = this.f8517f;
            this.f8519h = aVar2;
            if (this.f8520i) {
                this.j = new g0(aVar.f25840a, aVar.f25841b, this.f8514c, this.f8515d, aVar2.f25840a, 0);
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
        this.f8522m = y4.c.f25844a;
        this.f8523n = 0L;
        this.f8524o = 0L;
        this.f8525p = false;
    }

    @Override // y4.c
    public final void reset() {
        this.f8514c = 1.0f;
        this.f8515d = 1.0f;
        y4.a aVar = y4.a.f25839e;
        this.f8516e = aVar;
        this.f8517f = aVar;
        this.f8518g = aVar;
        this.f8519h = aVar;
        ByteBuffer byteBuffer = y4.c.f25844a;
        this.k = byteBuffer;
        this.f8521l = byteBuffer.asShortBuffer();
        this.f8522m = byteBuffer;
        this.f8513b = -1;
        this.f8520i = false;
        this.j = null;
        this.f8523n = 0L;
        this.f8524o = 0L;
        this.f8525p = false;
    }
}
