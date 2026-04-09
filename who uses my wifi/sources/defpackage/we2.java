package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class we2 extends f74 {
    public final ag2 i;
    public final ff2 j;
    public final String k;
    public final String[] l;

    public we2(ag2 ag2Var, ff2 ff2Var, String str, String[] strArr) {
        super(6);
        this.i = ag2Var;
        this.j = ff2Var;
        this.k = str;
        this.l = strArr;
        hg4.C.A.f.add(this);
    }

    @Override // defpackage.f74
    public final void p1() {
        try {
            this.j.d(this.k, this.l);
        } finally {
            lf4.l.post(new fu1(14, this));
        }
    }

    @Override // defpackage.f74
    public final n70 r1() {
        return (((Boolean) tw1.e.c.a(mz1.e2)).booleanValue() && (this.j instanceof jf2)) ? md2.f.c(new xs1(3, this)) : super.r1();
    }
}
