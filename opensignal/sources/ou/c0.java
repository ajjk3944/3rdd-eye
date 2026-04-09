package ou;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class c0 implements Closeable {
    public final e0 B;
    public final c0 D;
    public final c0 E;
    public final c0 F;
    public final long G;
    public final long H;
    public final bc.p I;
    public h J;

    /* renamed from: a, reason: collision with root package name */
    public final a0 f19884a;

    /* renamed from: d, reason: collision with root package name */
    public final z f19885d;

    /* renamed from: g, reason: collision with root package name */
    public final String f19886g;

    /* renamed from: r, reason: collision with root package name */
    public final int f19887r;

    /* renamed from: x, reason: collision with root package name */
    public final r f19888x;

    /* renamed from: y, reason: collision with root package name */
    public final s f19889y;

    public c0(a0 a0Var, z zVar, String str, int i10, r rVar, s sVar, e0 e0Var, c0 c0Var, c0 c0Var2, c0 c0Var3, long j, long j7, bc.p pVar) {
        br.l.e(a0Var, "request");
        br.l.e(zVar, "protocol");
        br.l.e(str, "message");
        this.f19884a = a0Var;
        this.f19885d = zVar;
        this.f19886g = str;
        this.f19887r = i10;
        this.f19888x = rVar;
        this.f19889y = sVar;
        this.B = e0Var;
        this.D = c0Var;
        this.E = c0Var2;
        this.F = c0Var3;
        this.G = j;
        this.H = j7;
        this.I = pVar;
    }

    public static String f(String str, c0 c0Var) {
        c0Var.getClass();
        String strA = c0Var.f19889y.a(str);
        if (strA == null) {
            return null;
        }
        return strA;
    }

    public final h b() {
        h hVar = this.J;
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = h.f19908n;
        h hVarH = d.h(this.f19889y);
        this.J = hVarH;
        return hVarH;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        e0 e0Var = this.B;
        if (e0Var == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        e0Var.close();
    }

    public final b0 h() {
        b0 b0Var = new b0();
        b0Var.f19869a = this.f19884a;
        b0Var.f19870b = this.f19885d;
        b0Var.f19871c = this.f19887r;
        b0Var.f19872d = this.f19886g;
        b0Var.f19873e = this.f19888x;
        b0Var.f19874f = this.f19889y.c();
        b0Var.f19875g = this.B;
        b0Var.f19876h = this.D;
        b0Var.f19877i = this.E;
        b0Var.j = this.F;
        b0Var.k = this.G;
        b0Var.f19878l = this.H;
        b0Var.f19879m = this.I;
        return b0Var;
    }

    public final String toString() {
        return "Response{protocol=" + this.f19885d + ", code=" + this.f19887r + ", message=" + this.f19886g + ", url=" + this.f19884a.f19860a + '}';
    }
}
