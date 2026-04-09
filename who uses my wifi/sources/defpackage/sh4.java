package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class sh4 implements nj4 {
    public final nj4 a;
    public final d02 b;

    public sh4(nj4 nj4Var, d02 d02Var) {
        this.a = nj4Var;
        this.b = d02Var;
    }

    @Override // defpackage.nj4
    public final d02 a() {
        return this.b;
    }

    @Override // defpackage.nj4
    public final int b() {
        return this.a.b();
    }

    @Override // defpackage.nj4
    public final ph4 c(int i) {
        return this.b.d[this.a.t(i)];
    }

    public final boolean d(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sh4) {
            return this.a.equals(((sh4) obj).a);
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (d(obj) && (obj instanceof sh4)) {
            return this.b.equals(((sh4) obj).b);
        }
        return false;
    }

    @Override // defpackage.nj4
    public final int f() {
        return this.a.f();
    }

    @Override // defpackage.nj4
    public final ph4 h() {
        return this.b.d[this.a.f()];
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.nj4
    public final int m0(int i) {
        return this.a.m0(i);
    }

    @Override // defpackage.nj4
    public final int t(int i) {
        return this.a.t(i);
    }
}
