package defpackage;

import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class f50 {
    public final List a;
    public final u80 b;
    public final String c;
    public final long d;
    public final int e;
    public final long f;
    public final String g;
    public final List h;
    public final h4 i;
    public final int j;
    public final int k;
    public final int l;
    public final float m;
    public final float n;
    public final float o;
    public final float p;
    public final b4 q;
    public final gw3 r;
    public final c4 s;
    public final List t;
    public final int u;
    public final boolean v;
    public final kf3 w;
    public final g4 x;
    public final int y;

    public f50(List list, u80 u80Var, String str, long j, int i, long j2, String str2, List list2, h4 h4Var, int i2, int i3, int i4, float f, float f2, float f3, float f4, b4 b4Var, gw3 gw3Var, List list3, int i5, c4 c4Var, boolean z, kf3 kf3Var, g4 g4Var, int i6) {
        this.a = list;
        this.b = u80Var;
        this.c = str;
        this.d = j;
        this.e = i;
        this.f = j2;
        this.g = str2;
        this.h = list2;
        this.i = h4Var;
        this.j = i2;
        this.k = i3;
        this.l = i4;
        this.m = f;
        this.n = f2;
        this.o = f3;
        this.p = f4;
        this.q = b4Var;
        this.r = gw3Var;
        this.t = list3;
        this.u = i5;
        this.s = c4Var;
        this.v = z;
        this.w = kf3Var;
        this.x = g4Var;
        this.y = i6;
    }

    public final String a(String str) {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(this.c);
        sb.append("\n");
        long j = this.f;
        u80 u80Var = this.b;
        f50 f50Var = (f50) u80Var.i.b(j);
        if (f50Var != null) {
            sb.append("\t\tParents: ");
            sb.append(f50Var.c);
            for (f50 f50Var2 = (f50) u80Var.i.b(f50Var.f); f50Var2 != null; f50Var2 = (f50) u80Var.i.b(f50Var2.f)) {
                sb.append("->");
                sb.append(f50Var2.c);
            }
            sb.append(str);
            sb.append("\n");
        }
        List list = this.h;
        if (!list.isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(list.size());
            sb.append("\n");
        }
        int i2 = this.j;
        if (i2 != 0 && (i = this.k) != 0) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(this.l)));
        }
        List list2 = this.a;
        if (!list2.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (Object obj : list2) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(obj);
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public final String toString() {
        return a("");
    }
}
