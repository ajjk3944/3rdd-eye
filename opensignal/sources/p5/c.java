package p5;

import a5.d0;
import a5.v;
import androidx.media3.common.r;
import u5.a0;
import u5.z;

/* loaded from: classes.dex */
public final class c implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f20252a;

    /* renamed from: b, reason: collision with root package name */
    public final r f20253b;

    /* renamed from: c, reason: collision with root package name */
    public final u5.j f20254c = new u5.j();

    /* renamed from: d, reason: collision with root package name */
    public r f20255d;

    /* renamed from: e, reason: collision with root package name */
    public a0 f20256e;

    /* renamed from: f, reason: collision with root package name */
    public long f20257f;

    public c(int i10, int i11, r rVar) {
        this.f20252a = i11;
        this.f20253b = rVar;
    }

    @Override // u5.a0
    public final void a(long j, int i10, int i11, int i12, z zVar) {
        long j7 = this.f20257f;
        if (j7 != -9223372036854775807L && j >= j7) {
            this.f20256e = this.f20254c;
        }
        a0 a0Var = this.f20256e;
        int i13 = d0.f105a;
        a0Var.a(j, i10, i11, i12, zVar);
    }

    @Override // u5.a0
    public final int b(androidx.media3.common.l lVar, int i10, boolean z10) {
        a0 a0Var = this.f20256e;
        int i11 = d0.f105a;
        return a0Var.b(lVar, i10, z10);
    }

    @Override // u5.a0
    public final void c(r rVar) {
        r rVar2 = this.f20253b;
        if (rVar2 != null) {
            rVar = rVar.d(rVar2);
        }
        this.f20255d = rVar;
        a0 a0Var = this.f20256e;
        int i10 = d0.f105a;
        a0Var.c(rVar);
    }

    @Override // u5.a0
    public final void d(int i10, v vVar) {
        a0 a0Var = this.f20256e;
        int i11 = d0.f105a;
        a0Var.d(i10, vVar);
    }
}
