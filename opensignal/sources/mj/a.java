package mj;

/* loaded from: classes.dex */
public final class a {
    public static b a(int i10) {
        b bVar;
        b[] bVarArrValues = b.values();
        int length = bVarArrValues.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                bVar = null;
                break;
            }
            bVar = bVarArrValues[i11];
            if (bVar.getValue() == i10) {
                break;
            }
            i11++;
        }
        return bVar == null ? c.f16835a : bVar;
    }
}
