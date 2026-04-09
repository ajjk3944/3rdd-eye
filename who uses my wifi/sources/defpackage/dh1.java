package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class dh1 extends f74 {
    public long i;
    public long[] j;
    public long[] k;

    public static String U1(kz2 kz2Var) {
        int iL = kz2Var.L();
        int i = kz2Var.b;
        kz2Var.G(iL);
        return new String(kz2Var.a, i, iL);
    }

    public static HashMap V1(kz2 kz2Var) {
        int iH = kz2Var.h();
        HashMap map = new HashMap(iH);
        for (int i = 0; i < iH; i++) {
            String strU1 = U1(kz2Var);
            Serializable serializableW1 = W1(kz2Var.K(), kz2Var);
            if (serializableW1 != null) {
                map.put(strU1, serializableW1);
            }
        }
        return map;
    }

    public static Serializable W1(int i, kz2 kz2Var) {
        if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(kz2Var.d()));
        }
        if (i == 1) {
            return Boolean.valueOf(kz2Var.K() == 1);
        }
        if (i == 2) {
            return U1(kz2Var);
        }
        if (i != 3) {
            if (i == 8) {
                return V1(kz2Var);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(kz2Var.d()));
                kz2Var.G(2);
                return date;
            }
            int iH = kz2Var.h();
            ArrayList arrayList = new ArrayList(iH);
            for (int i2 = 0; i2 < iH; i2++) {
                Serializable serializableW1 = W1(kz2Var.K(), kz2Var);
                if (serializableW1 != null) {
                    arrayList.add(serializableW1);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strU1 = U1(kz2Var);
            int iK = kz2Var.K();
            if (iK == 9) {
                return map;
            }
            Serializable serializableW12 = W1(iK, kz2Var);
            if (serializableW12 != null) {
                map.put(strU1, serializableW12);
            }
        }
    }
}
