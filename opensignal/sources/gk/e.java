package gk;

import br.l;

/* loaded from: classes.dex */
public final class e {
    public static f a(String str) {
        f fVar;
        f[] fVarArrValues = f.values();
        int length = fVarArrValues.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                fVar = null;
                break;
            }
            fVar = fVarArrValues[i10];
            if (l.a(fVar.name(), str)) {
                break;
            }
            i10++;
        }
        return fVar == null ? f.FIXED_WINDOW : fVar;
    }
}
