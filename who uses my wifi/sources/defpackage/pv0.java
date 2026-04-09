package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class pv0 implements ej {
    public final int a;
    public final c4 b;
    public final c4 c;
    public final c4 d;
    public final boolean e;

    public pv0(String str, int i, c4 c4Var, c4 c4Var2, c4 c4Var3, boolean z) {
        this.a = i;
        this.b = c4Var;
        this.c = c4Var2;
        this.d = c4Var3;
        this.e = z;
    }

    @Override // defpackage.ej
    public final vi a(i90 i90Var, u80 u80Var, da daVar) {
        return new e31(daVar, this);
    }

    public final String toString() {
        return "Trim Path: {start: " + this.b + ", end: " + this.c + ", offset: " + this.d + "}";
    }
}
