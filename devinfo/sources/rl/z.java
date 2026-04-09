package rl;

import b5.i0;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import java.io.Closeable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class z implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final va.o f33204a;

    /* renamed from: b, reason: collision with root package name */
    public final u f33205b;

    /* renamed from: c, reason: collision with root package name */
    public final String f33206c;

    /* renamed from: d, reason: collision with root package name */
    public final int f33207d;

    /* renamed from: e, reason: collision with root package name */
    public final l f33208e;

    /* renamed from: f, reason: collision with root package name */
    public final m f33209f;
    public final c0 g;

    /* renamed from: h, reason: collision with root package name */
    public final hm.v f33210h;

    /* renamed from: i, reason: collision with root package name */
    public final z f33211i;
    public final z j;

    /* renamed from: k, reason: collision with root package name */
    public final z f33212k;

    /* renamed from: l, reason: collision with root package name */
    public final long f33213l;

    /* renamed from: m, reason: collision with root package name */
    public final long f33214m;

    /* renamed from: n, reason: collision with root package name */
    public final i0 f33215n;

    /* renamed from: o, reason: collision with root package name */
    public final f0 f33216o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f33217p;

    public z(va.o oVar, u uVar, String str, int i4, l lVar, m mVar, c0 c0Var, hm.v vVar, z zVar, z zVar2, z zVar3, long j, long j8, i0 i0Var, f0 f0Var) {
        nk.k.e(oVar, "request");
        nk.k.e(uVar, "protocol");
        nk.k.e(str, PglCryptUtils.KEY_MESSAGE);
        nk.k.e(c0Var, "body");
        nk.k.e(f0Var, "trailersSource");
        this.f33204a = oVar;
        this.f33205b = uVar;
        this.f33206c = str;
        this.f33207d = i4;
        this.f33208e = lVar;
        this.f33209f = mVar;
        this.g = c0Var;
        this.f33210h = vVar;
        this.f33211i = zVar;
        this.j = zVar2;
        this.f33212k = zVar3;
        this.f33213l = j;
        this.f33214m = j8;
        this.f33215n = i0Var;
        this.f33216o = f0Var;
        boolean z3 = false;
        if (200 <= i4 && i4 < 300) {
            z3 = true;
        }
        this.f33217p = z3;
    }

    public final y c() {
        y yVar = new y();
        yVar.f33193c = -1;
        yVar.g = c0.f33050b;
        yVar.f33203o = f0.f33065a;
        yVar.f33191a = this.f33204a;
        yVar.f33192b = this.f33205b;
        yVar.f33193c = this.f33207d;
        yVar.f33194d = this.f33206c;
        yVar.f33195e = this.f33208e;
        yVar.f33196f = this.f33209f.d();
        yVar.g = this.g;
        yVar.f33197h = this.f33210h;
        yVar.f33198i = this.f33211i;
        yVar.j = this.j;
        yVar.f33199k = this.f33212k;
        yVar.f33200l = this.f33213l;
        yVar.f33201m = this.f33214m;
        yVar.f33202n = this.f33215n;
        yVar.f33203o = this.f33216o;
        return yVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.g.close();
    }

    public final String toString() {
        return "Response{protocol=" + this.f33205b + ", code=" + this.f33207d + ", message=" + this.f33206c + ", url=" + ((n) this.f33204a.f36146b) + '}';
    }
}
