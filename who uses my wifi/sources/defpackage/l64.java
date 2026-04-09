package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class l64 implements v64 {
    public final s44 a;
    public final pz b;

    public l64(pz pzVar, s44 s44Var) {
        t24 t24Var = j54.a;
        this.b = pzVar;
        this.a = s44Var;
    }

    @Override // defpackage.v64
    public final p54 a() {
        s44 s44Var = this.a;
        return s44Var instanceof p54 ? ((p54) s44Var).p() : ((n54) ((p54) s44Var).w(5, null)).c();
    }

    @Override // defpackage.v64
    public final int b(p54 p54Var) {
        return p54Var.zzt.hashCode();
    }

    @Override // defpackage.v64
    public final void c(Object obj, o9 o9Var, h54 h54Var) {
        this.b.getClass();
        pz.q(obj);
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.v64
    public final void d(Object obj, Object obj2) {
        w64.d(obj, obj2);
    }

    @Override // defpackage.v64
    public final void e(Object obj, it3 it3Var) {
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.v64
    public final boolean f(Object obj) {
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.v64
    public final int g(p54 p54Var) {
        b74 b74Var = p54Var.zzt;
        int i = b74Var.d;
        if (i != -1) {
            return i;
        }
        int iG = 0;
        for (int i2 = 0; i2 < b74Var.a; i2++) {
            int i3 = b74Var.b[i2] >>> 3;
            a54 a54Var = (a54) b74Var.c[i2];
            int iD = g54.D(8);
            int iD2 = g54.D(i3) + g54.D(16);
            int iD3 = g54.D(24);
            int iD4 = a54Var.d();
            iG += iD + iD + iD2 + ga1.g(iD4, iD4, iD3);
        }
        b74Var.d = iG;
        return iG;
    }

    @Override // defpackage.v64
    public final void h(Object obj) {
        this.b.getClass();
        b74 b74Var = ((p54) obj).zzt;
        if (b74Var.e) {
            b74Var.e = false;
        }
        t24 t24Var = j54.a;
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.v64
    public final void i(Object obj, byte[] bArr, int i, int i2, v44 v44Var) {
        p54 p54Var = (p54) obj;
        if (p54Var.zzt == b74.f) {
            p54Var.zzt = b74.a();
        }
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.v64
    public final boolean j(p54 p54Var, p54 p54Var2) {
        return p54Var.zzt.equals(p54Var2.zzt);
    }
}
