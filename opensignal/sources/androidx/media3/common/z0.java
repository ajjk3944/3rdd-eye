package androidx.media3.common;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class z0 implements i {
    public static final Object N = new Object();
    public static final Object O = new Object();
    public static final e0 P;
    public static final String Q;
    public static final String R;
    public static final String S;
    public static final String T;
    public static final String U;
    public static final String V;
    public static final String W;
    public static final String X;
    public static final String Y;
    public static final String Z;

    /* renamed from: a0, reason: collision with root package name */
    public static final String f1839a0;

    /* renamed from: b0, reason: collision with root package name */
    public static final String f1840b0;

    /* renamed from: c0, reason: collision with root package name */
    public static final String f1841c0;
    public long B;
    public boolean D;
    public boolean E;
    public boolean F;
    public z G;
    public boolean H;
    public long I;
    public long J;
    public int K;
    public int L;
    public long M;

    /* renamed from: d, reason: collision with root package name */
    public Object f1843d;

    /* renamed from: r, reason: collision with root package name */
    public Object f1845r;

    /* renamed from: x, reason: collision with root package name */
    public long f1846x;

    /* renamed from: y, reason: collision with root package name */
    public long f1847y;

    /* renamed from: a, reason: collision with root package name */
    public Object f1842a = N;

    /* renamed from: g, reason: collision with root package name */
    public e0 f1844g = P;

    static {
        v vVar = new v();
        oe.f0 f0Var = oe.h0.f19336d;
        oe.u0 u0Var = oe.u0.f19383x;
        List list = Collections.EMPTY_LIST;
        oe.u0 u0Var2 = oe.u0.f19383x;
        c0 c0Var = c0.f1577g;
        Uri uri = Uri.EMPTY;
        P = new e0("androidx.media3.common.Timeline", new x(vVar), uri != null ? new b0(uri, null, null, list, u0Var2) : null, new z(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), g0.f1655e0, c0Var);
        int i10 = a5.d0.f105a;
        Q = Integer.toString(1, 36);
        R = Integer.toString(2, 36);
        S = Integer.toString(3, 36);
        T = Integer.toString(4, 36);
        U = Integer.toString(5, 36);
        V = Integer.toString(6, 36);
        W = Integer.toString(7, 36);
        X = Integer.toString(8, 36);
        Y = Integer.toString(9, 36);
        Z = Integer.toString(10, 36);
        f1839a0 = Integer.toString(11, 36);
        f1840b0 = Integer.toString(12, 36);
        f1841c0 = Integer.toString(13, 36);
    }

    public final boolean a() {
        a5.a.i(this.F == (this.G != null));
        return this.G != null;
    }

    public final void b(Object obj, e0 e0Var, Object obj2, long j, long j7, long j10, boolean z10, boolean z11, z zVar, long j11, long j12, int i10, int i11, long j13) {
        this.f1842a = obj;
        this.f1844g = e0Var != null ? e0Var : P;
        if (e0Var != null) {
            b0 b0Var = e0Var.f1608d;
        }
        this.f1843d = null;
        this.f1845r = obj2;
        this.f1846x = j;
        this.f1847y = j7;
        this.B = j10;
        this.D = z10;
        this.E = z11;
        this.F = zVar != null;
        this.G = zVar;
        this.I = j11;
        this.J = j12;
        this.K = i10;
        this.L = i11;
        this.M = j13;
        this.H = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z0.class.equals(obj.getClass())) {
            z0 z0Var = (z0) obj;
            if (a5.d0.a(this.f1842a, z0Var.f1842a) && a5.d0.a(this.f1844g, z0Var.f1844g) && a5.d0.a(this.f1845r, z0Var.f1845r) && a5.d0.a(this.G, z0Var.G) && this.f1846x == z0Var.f1846x && this.f1847y == z0Var.f1847y && this.B == z0Var.B && this.D == z0Var.D && this.E == z0Var.E && this.H == z0Var.H && this.I == z0Var.I && this.J == z0Var.J && this.K == z0Var.K && this.L == z0Var.L && this.M == z0Var.M) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f1844g.hashCode() + ((this.f1842a.hashCode() + 217) * 31)) * 31;
        Object obj = this.f1845r;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        z zVar = this.G;
        int iHashCode3 = (iHashCode2 + (zVar != null ? zVar.hashCode() : 0)) * 31;
        long j = this.f1846x;
        int i10 = (iHashCode3 + ((int) (j ^ (j >>> 32)))) * 31;
        long j7 = this.f1847y;
        int i11 = (i10 + ((int) (j7 ^ (j7 >>> 32)))) * 31;
        long j10 = this.B;
        int i12 = (((((((i11 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + (this.D ? 1 : 0)) * 31) + (this.E ? 1 : 0)) * 31) + (this.H ? 1 : 0)) * 31;
        long j11 = this.I;
        int i13 = (i12 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.J;
        int i14 = (((((i13 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + this.K) * 31) + this.L) * 31;
        long j13 = this.M;
        return i14 + ((int) (j13 ^ (j13 >>> 32)));
    }
}
