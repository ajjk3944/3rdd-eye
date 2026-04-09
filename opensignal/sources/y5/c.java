package y5;

import a5.v;
import androidx.lifecycle.o;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class c extends o {

    /* renamed from: g, reason: collision with root package name */
    public long f25863g;

    /* renamed from: r, reason: collision with root package name */
    public long[] f25864r;

    /* renamed from: x, reason: collision with root package name */
    public long[] f25865x;

    public static Serializable t1(int i10, v vVar) {
        if (i10 == 0) {
            return Double.valueOf(Double.longBitsToDouble(vVar.n()));
        }
        if (i10 == 1) {
            return Boolean.valueOf(vVar.t() == 1);
        }
        if (i10 == 2) {
            return v1(vVar);
        }
        if (i10 != 3) {
            if (i10 == 8) {
                return u1(vVar);
            }
            if (i10 != 10) {
                if (i10 != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(vVar.n()));
                vVar.F(2);
                return date;
            }
            int iW = vVar.w();
            ArrayList arrayList = new ArrayList(iW);
            for (int i11 = 0; i11 < iW; i11++) {
                Serializable serializableT1 = t1(vVar.t(), vVar);
                if (serializableT1 != null) {
                    arrayList.add(serializableT1);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strV1 = v1(vVar);
            int iT = vVar.t();
            if (iT == 9) {
                return map;
            }
            Serializable serializableT12 = t1(iT, vVar);
            if (serializableT12 != null) {
                map.put(strV1, serializableT12);
            }
        }
    }

    public static HashMap u1(v vVar) {
        int iW = vVar.w();
        HashMap map = new HashMap(iW);
        for (int i10 = 0; i10 < iW; i10++) {
            String strV1 = v1(vVar);
            Serializable serializableT1 = t1(vVar.t(), vVar);
            if (serializableT1 != null) {
                map.put(strV1, serializableT1);
            }
        }
        return map;
    }

    public static String v1(v vVar) {
        int iY = vVar.y();
        int i10 = vVar.f166b;
        vVar.F(iY);
        return new String(vVar.f165a, i10, iY);
    }
}
