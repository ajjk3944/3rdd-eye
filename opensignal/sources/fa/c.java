package fa;

import androidx.lifecycle.o;
import fb.f;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class c extends o {

    /* renamed from: g, reason: collision with root package name */
    public long f8738g;

    /* renamed from: r, reason: collision with root package name */
    public long[] f8739r;

    /* renamed from: x, reason: collision with root package name */
    public long[] f8740x;

    public static Serializable t1(int i10, f fVar) {
        if (i10 == 0) {
            return Double.valueOf(Double.longBitsToDouble(fVar.j()));
        }
        if (i10 == 1) {
            return Boolean.valueOf(fVar.o() == 1);
        }
        if (i10 == 2) {
            return v1(fVar);
        }
        if (i10 != 3) {
            if (i10 == 8) {
                return u1(fVar);
            }
            if (i10 != 10) {
                if (i10 != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(fVar.j()));
                fVar.z(2);
                return date;
            }
            int iR = fVar.r();
            ArrayList arrayList = new ArrayList(iR);
            for (int i11 = 0; i11 < iR; i11++) {
                Serializable serializableT1 = t1(fVar.o(), fVar);
                if (serializableT1 != null) {
                    arrayList.add(serializableT1);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strV1 = v1(fVar);
            int iO = fVar.o();
            if (iO == 9) {
                return map;
            }
            Serializable serializableT12 = t1(iO, fVar);
            if (serializableT12 != null) {
                map.put(strV1, serializableT12);
            }
        }
    }

    public static HashMap u1(f fVar) {
        int iR = fVar.r();
        HashMap map = new HashMap(iR);
        for (int i10 = 0; i10 < iR; i10++) {
            String strV1 = v1(fVar);
            Serializable serializableT1 = t1(fVar.o(), fVar);
            if (serializableT1 != null) {
                map.put(strV1, serializableT1);
            }
        }
        return map;
    }

    public static String v1(f fVar) {
        int iT = fVar.t();
        int i10 = fVar.f8801b;
        fVar.z(iT);
        return new String(fVar.f8800a, i10, iT);
    }
}
