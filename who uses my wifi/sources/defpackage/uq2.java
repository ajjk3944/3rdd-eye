package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class uq2 implements gl2 {
    public final Map a;
    public final Map b;
    public final Map c;
    public final ba4 d;
    public final yr2 e;

    public uq2(Map map, Map map2, Map map3, ba4 ba4Var, yr2 yr2Var) {
        this.a = map;
        this.b = map2;
        this.c = map3;
        this.d = ba4Var;
        this.e = yr2Var;
    }

    @Override // defpackage.gl2
    public final zz2 a(String str, int i) {
        zz2 zz2VarA;
        zz2 zz2Var = (zz2) this.a.get(str);
        if (zz2Var != null) {
            return zz2Var;
        }
        if (i != 1) {
            if (i != 4) {
                return null;
            }
            c13 c13Var = (c13) this.c.get(str);
            if (c13Var != null) {
                return new a03(c13Var, gj1.j);
            }
            zz2VarA = (zz2) this.b.get(str);
            if (zz2VarA == null) {
                return null;
            }
        } else if (this.e.d == null || (zz2VarA = ((gl2) this.d.d()).a(str, i)) == null) {
            return null;
        }
        return new a03(zz2VarA, gj1.i);
    }
}
