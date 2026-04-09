package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class m3 extends hp1 {

    /* renamed from: c, reason: collision with root package name */
    public long f13738c;

    /* renamed from: d, reason: collision with root package name */
    public long[] f13739d;

    /* renamed from: e, reason: collision with root package name */
    public long[] f13740e;

    public static String v1(sk0 sk0Var) {
        int iL = sk0Var.L();
        int i4 = sk0Var.f16447b;
        sk0Var.G(iL);
        return new String(sk0Var.f16446a, i4, iL);
    }

    public static HashMap w1(sk0 sk0Var) {
        int iH = sk0Var.h();
        HashMap map = new HashMap(iH);
        for (int i4 = 0; i4 < iH; i4++) {
            String strV1 = v1(sk0Var);
            Serializable serializableX1 = x1(sk0Var.K(), sk0Var);
            if (serializableX1 != null) {
                map.put(strV1, serializableX1);
            }
        }
        return map;
    }

    public static Serializable x1(int i4, sk0 sk0Var) {
        if (i4 == 0) {
            return Double.valueOf(Double.longBitsToDouble(sk0Var.d()));
        }
        if (i4 == 1) {
            return Boolean.valueOf(sk0Var.K() == 1);
        }
        if (i4 == 2) {
            return v1(sk0Var);
        }
        if (i4 != 3) {
            if (i4 == 8) {
                return w1(sk0Var);
            }
            if (i4 != 10) {
                if (i4 != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(sk0Var.d()));
                sk0Var.G(2);
                return date;
            }
            int iH = sk0Var.h();
            ArrayList arrayList = new ArrayList(iH);
            for (int i10 = 0; i10 < iH; i10++) {
                Serializable serializableX1 = x1(sk0Var.K(), sk0Var);
                if (serializableX1 != null) {
                    arrayList.add(serializableX1);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strV1 = v1(sk0Var);
            int iK = sk0Var.K();
            if (iK == 9) {
                return map;
            }
            Serializable serializableX12 = x1(iK, sk0Var);
            if (serializableX12 != null) {
                map.put(strV1, serializableX12);
            }
        }
    }
}
