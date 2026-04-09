package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class wm3 extends xm3 {
    public final transient int h;
    public final transient int i;
    public final /* synthetic */ xm3 j;

    public wm3(xm3 xm3Var, int i, int i2) {
        this.j = xm3Var;
        this.h = i;
        this.i = i2;
    }

    @Override // defpackage.tm3
    public final Object[] b() {
        return this.j.b();
    }

    @Override // defpackage.tm3
    public final int c() {
        return this.j.c() + this.h;
    }

    @Override // defpackage.tm3
    public final int d() {
        return this.j.c() + this.h + this.i;
    }

    @Override // defpackage.tm3
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zt0.e0(i, this.i);
        return this.j.get(i + this.h);
    }

    @Override // defpackage.xm3, java.util.List
    /* renamed from: h */
    public final xm3 subList(int i, int i2) {
        zt0.g0(i, i2, this.i);
        int i3 = this.h;
        return this.j.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.i;
    }
}
