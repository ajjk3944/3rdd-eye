package z;

import r1.j;

/* loaded from: classes.dex */
public abstract class e {
    static {
        new d(3, null);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public static boolean a(ag.b bVar, boolean z10) {
        ?? r62 = bVar.f346g;
        int size = r62.size();
        int i10 = 0;
        while (true) {
            boolean zE = true;
            if (i10 >= size) {
                return true;
            }
            j jVar = (j) r62.get(i10);
            if (!z10) {
                zE = dr.a.e(jVar);
            } else if (jVar.b() || jVar.f21173h || !jVar.f21169d) {
                zE = false;
            }
            if (!zE) {
                return false;
            }
            i10++;
        }
    }
}
