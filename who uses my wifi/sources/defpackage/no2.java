package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class no2 extends xo2 {
    public final transient int h;
    public final transient int i;
    public final /* synthetic */ xo2 j;

    public no2(xo2 xo2Var, int i, int i2) {
        this.j = xo2Var;
        this.h = i;
        this.i = i2;
    }

    @Override // defpackage.yn2
    public final int b() {
        return this.j.c() + this.h + this.i;
    }

    @Override // defpackage.yn2
    public final int c() {
        return this.j.c() + this.h;
    }

    @Override // defpackage.yn2
    public final Object[] d() {
        return this.j.d();
    }

    @Override // defpackage.xo2, java.util.List
    /* renamed from: e */
    public final xo2 subList(int i, int i2) {
        qb1.G(i, i2, this.i);
        int i3 = this.h;
        return this.j.subList(i + i3, i2 + i3);
    }

    @Override // java.util.List
    public final Object get(int i) {
        qb1.x(i, this.i);
        return this.j.get(i + this.h);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.i;
    }
}
