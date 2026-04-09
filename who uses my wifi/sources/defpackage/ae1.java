package defpackage;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ae1 {
    public final Context a;
    public final yd1 b;
    public final SparseArray c;
    public final boolean d;
    public final md1 e;
    public final pz f;
    public final CopyOnWriteArraySet g;
    public final long h;
    public final ee1 i;
    public ts j = new ts();
    public d13 k;
    public Pair l;
    public int m;
    public int n;
    public long o;
    public int p;

    public ae1(vd1 vd1Var) {
        this.a = vd1Var.a;
        yd1 yd1Var = vd1Var.c;
        yd1Var.getClass();
        this.b = yd1Var;
        this.c = new SparseArray();
        vm3 vm3Var = xm3.g;
        sn3 sn3Var = sn3.j;
        this.d = vd1Var.d;
        pz pzVar = vd1Var.e;
        this.f = pzVar;
        long j = vd1Var.g;
        this.h = j != -9223372036854775807L ? -j : -9223372036854775807L;
        ee1 ee1Var = vd1Var.h;
        this.i = ee1Var;
        this.e = new md1(vd1Var.b, ee1Var, pzVar);
        this.g = new CopyOnWriteArraySet();
        new ph4(new gg4());
        this.o = -9223372036854775807L;
        this.p = -1;
        this.n = 0;
    }
}
