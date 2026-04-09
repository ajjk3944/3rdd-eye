package nj;

import br.l;

/* loaded from: classes.dex */
public final class a {
    public static b a(String str) {
        b bVar;
        b[] bVarArrValues = b.values();
        int length = bVarArrValues.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                bVar = null;
                break;
            }
            bVar = bVarArrValues[i10];
            if (l.a(bVar.name(), str)) {
                break;
            }
            i10++;
        }
        return bVar == null ? b.UNKNOWN : bVar;
    }
}
