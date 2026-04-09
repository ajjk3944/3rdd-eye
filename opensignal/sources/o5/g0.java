package o5;

import java.util.List;

/* loaded from: classes.dex */
public final class g0 implements androidx.media3.exoplayer.trackselection.v {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.media3.exoplayer.trackselection.v f18944a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.media3.common.b1 f18945b;

    public g0(androidx.media3.exoplayer.trackselection.v vVar, androidx.media3.common.b1 b1Var) {
        this.f18944a = vVar;
        this.f18945b = b1Var;
    }

    @Override // androidx.media3.exoplayer.trackselection.v
    public final int a() {
        return this.f18944a.a();
    }

    @Override // androidx.media3.exoplayer.trackselection.v
    public final void b() {
        this.f18944a.b();
    }

    @Override // androidx.media3.exoplayer.trackselection.v
    public final int c(long j, List list) {
        return this.f18944a.c(j, list);
    }

    @Override // androidx.media3.exoplayer.trackselection.v
    public final void d() {
        this.f18944a.d();
    }

    @Override // androidx.media3.exoplayer.trackselection.v
    public final int e() {
        return this.f18944a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return this.f18944a.equals(g0Var.f18944a) && this.f18945b.equals(g0Var.f18945b);
    }

    @Override // androidx.media3.exoplayer.trackselection.v
    public final void f(float f10) {
        this.f18944a.f(f10);
    }

    @Override // androidx.media3.exoplayer.trackselection.v
    public final Object g() {
        return this.f18944a.g();
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public final androidx.media3.common.r getFormat(int i10) {
        return this.f18944a.getFormat(i10);
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public final int getIndexInTrackGroup(int i10) {
        return this.f18944a.getIndexInTrackGroup(i10);
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public final androidx.media3.common.b1 getTrackGroup() {
        return this.f18945b;
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public final int getType() {
        return this.f18944a.getType();
    }

    @Override // androidx.media3.exoplayer.trackselection.v
    public final void h(long j, long j7, long j10, List list, p5.m[] mVarArr) {
        this.f18944a.h(j, j7, j10, list, mVarArr);
    }

    public final int hashCode() {
        return this.f18944a.hashCode() + ((this.f18945b.hashCode() + 527) * 31);
    }

    @Override // androidx.media3.exoplayer.trackselection.v
    public final boolean i(long j, p5.e eVar, List list) {
        return this.f18944a.i(j, eVar, list);
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public final int indexOf(androidx.media3.common.r rVar) {
        return this.f18944a.indexOf(rVar);
    }

    @Override // androidx.media3.exoplayer.trackselection.v
    public final boolean j(int i10, long j) {
        return this.f18944a.j(i10, j);
    }

    @Override // androidx.media3.exoplayer.trackselection.v
    public final boolean k(int i10, long j) {
        return this.f18944a.k(i10, j);
    }

    @Override // androidx.media3.exoplayer.trackselection.v
    public final void l(boolean z10) {
        this.f18944a.l(z10);
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public final int length() {
        return this.f18944a.length();
    }

    @Override // androidx.media3.exoplayer.trackselection.v
    public final int m() {
        return this.f18944a.m();
    }

    @Override // androidx.media3.exoplayer.trackselection.v
    public final androidx.media3.common.r n() {
        return this.f18944a.n();
    }

    @Override // androidx.media3.exoplayer.trackselection.v
    public final void o() {
        this.f18944a.o();
    }

    @Override // androidx.media3.exoplayer.trackselection.v
    public final void p() {
        this.f18944a.p();
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public final int indexOf(int i10) {
        return this.f18944a.indexOf(i10);
    }
}
