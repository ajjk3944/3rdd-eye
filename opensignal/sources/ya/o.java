package ya;

import com.google.android.exoplayer2.u1;
import com.google.android.exoplayer2.v1;
import com.google.android.exoplayer2.w1;

/* loaded from: classes.dex */
public final class o extends k {

    /* renamed from: e, reason: collision with root package name */
    public static final Object f26123e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Object f26124c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f26125d;

    public o(w1 w1Var, Object obj, Object obj2) {
        super(w1Var);
        this.f26124c = obj;
        this.f26125d = obj2;
    }

    @Override // ya.k, com.google.android.exoplayer2.w1
    public final int b(Object obj) {
        Object obj2;
        if (f26123e.equals(obj) && (obj2 = this.f26125d) != null) {
            obj = obj2;
        }
        return this.f26084b.b(obj);
    }

    @Override // ya.k, com.google.android.exoplayer2.w1
    public final u1 f(int i10, u1 u1Var, boolean z10) {
        this.f26084b.f(i10, u1Var, z10);
        if (qb.v.a(u1Var.f4595b, this.f26125d) && z10) {
            u1Var.f4595b = f26123e;
        }
        return u1Var;
    }

    @Override // ya.k, com.google.android.exoplayer2.w1
    public final Object l(int i10) {
        Object objL = this.f26084b.l(i10);
        return qb.v.a(objL, this.f26125d) ? f26123e : objL;
    }

    @Override // ya.k, com.google.android.exoplayer2.w1
    public final v1 m(int i10, v1 v1Var, long j) {
        this.f26084b.m(i10, v1Var, j);
        if (qb.v.a(v1Var.f4740a, this.f26124c)) {
            v1Var.f4740a = v1.f4738r;
        }
        return v1Var;
    }
}
