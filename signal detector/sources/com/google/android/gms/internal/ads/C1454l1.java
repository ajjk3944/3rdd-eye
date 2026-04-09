package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.l1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1454l1 extends VL {

    /* renamed from: c, reason: collision with root package name */
    public long f15330c;

    /* renamed from: d, reason: collision with root package name */
    public long[] f15331d;

    /* renamed from: e, reason: collision with root package name */
    public long[] f15332e;

    public static String H1(C2036vr c2036vr) {
        int iL = c2036vr.L();
        int i = c2036vr.f17355b;
        c2036vr.G(iL);
        return new String(c2036vr.f17354a, i, iL);
    }

    public static HashMap I1(C2036vr c2036vr) {
        int iH = c2036vr.h();
        HashMap map = new HashMap(iH);
        for (int i = 0; i < iH; i++) {
            String strH1 = H1(c2036vr);
            Serializable serializableJ1 = J1(c2036vr.K(), c2036vr);
            if (serializableJ1 != null) {
                map.put(strH1, serializableJ1);
            }
        }
        return map;
    }

    public static Serializable J1(int i, C2036vr c2036vr) {
        if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(c2036vr.d()));
        }
        if (i == 1) {
            return Boolean.valueOf(c2036vr.K() == 1);
        }
        if (i == 2) {
            return H1(c2036vr);
        }
        if (i != 3) {
            if (i == 8) {
                return I1(c2036vr);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(c2036vr.d()));
                c2036vr.G(2);
                return date;
            }
            int iH = c2036vr.h();
            ArrayList arrayList = new ArrayList(iH);
            for (int i3 = 0; i3 < iH; i3++) {
                Serializable serializableJ1 = J1(c2036vr.K(), c2036vr);
                if (serializableJ1 != null) {
                    arrayList.add(serializableJ1);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strH1 = H1(c2036vr);
            int iK = c2036vr.K();
            if (iK == 9) {
                return map;
            }
            Serializable serializableJ12 = J1(iK, c2036vr);
            if (serializableJ12 != null) {
                map.put(strH1, serializableJ12);
            }
        }
    }
}
