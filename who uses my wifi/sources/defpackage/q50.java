package defpackage;

import android.util.StateSet;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class q50 {
    public int a;
    public Object b;
    public Serializable c;
    public Serializable d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;

    public q50(su0 su0Var) {
        b();
        a(StateSet.WILD_CARD, su0Var);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.Serializable, java.lang.Object, su0[]] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int[][], java.io.Serializable, java.lang.Object] */
    public void a(int[] iArr, su0 su0Var) {
        int i = this.a;
        if (i == 0 || iArr.length == 0) {
            this.b = su0Var;
        }
        int[][] iArr2 = (int[][]) this.c;
        if (i >= iArr2.length) {
            int i2 = i + 10;
            ?? r3 = new int[i2][];
            System.arraycopy(iArr2, 0, r3, 0, i);
            this.c = r3;
            ?? r1 = new su0[i2];
            System.arraycopy((su0[]) this.d, 0, r1, 0, i);
            this.d = r1;
        }
        int[][] iArr3 = (int[][]) this.c;
        int i3 = this.a;
        iArr3[i3] = iArr;
        ((su0[]) this.d)[i3] = su0Var;
        this.a = i3 + 1;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Serializable, su0[]] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int[][], java.io.Serializable] */
    public void b() {
        this.b = new su0();
        this.c = new int[10][];
        this.d = new su0[10];
    }

    public void c(n50 n50Var) {
        HashMap map = (HashMap) this.b;
        o50 o50Var = n50Var.c;
        if (!map.containsKey(o50Var)) {
            map.put(o50Var, new ArrayList());
        }
        List list = (List) map.get(o50Var);
        if (list != null) {
            list.add(n50Var);
        }
    }
}
