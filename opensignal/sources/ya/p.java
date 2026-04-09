package ya;

import com.google.android.exoplayer2.u1;
import com.google.android.exoplayer2.v1;
import com.google.android.exoplayer2.w1;

/* loaded from: classes.dex */
public final class p extends w1 {

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.exoplayer2.n0 f26136b;

    public p(com.google.android.exoplayer2.n0 n0Var) {
        this.f26136b = n0Var;
    }

    @Override // com.google.android.exoplayer2.w1
    public final int b(Object obj) {
        return obj == o.f26123e ? 0 : -1;
    }

    @Override // com.google.android.exoplayer2.w1
    public final u1 f(int i10, u1 u1Var, boolean z10) {
        Integer num = z10 ? 0 : null;
        Object obj = z10 ? o.f26123e : null;
        za.b bVar = za.b.f26804c;
        u1Var.getClass();
        za.b bVar2 = za.b.f26804c;
        u1Var.f4594a = num;
        u1Var.f4595b = obj;
        u1Var.f4596c = 0;
        u1Var.f4597d = -9223372036854775807L;
        u1Var.f4598e = 0L;
        u1Var.f4600g = bVar2;
        u1Var.f4599f = true;
        return u1Var;
    }

    @Override // com.google.android.exoplayer2.w1
    public final int h() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.w1
    public final Object l(int i10) {
        return o.f26123e;
    }

    @Override // com.google.android.exoplayer2.w1
    public final v1 m(int i10, v1 v1Var, long j) {
        Object obj = v1.f4738r;
        v1Var.b(this.f26136b, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0L);
        v1Var.f4749l = true;
        return v1Var;
    }

    @Override // com.google.android.exoplayer2.w1
    public final int o() {
        return 1;
    }
}
