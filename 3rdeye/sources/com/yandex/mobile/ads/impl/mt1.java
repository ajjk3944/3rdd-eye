package com.yandex.mobile.ads.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
final class mt1 extends s32 {

    /* renamed from: b, reason: collision with root package name */
    private long f30513b;

    /* renamed from: c, reason: collision with root package name */
    private long[] f30514c;

    /* renamed from: d, reason: collision with root package name */
    private long[] f30515d;

    public mt1() {
        super(new m40());
        this.f30513b = -9223372036854775807L;
        this.f30514c = new long[0];
        this.f30515d = new long[0];
    }

    public final long a() {
        return this.f30513b;
    }

    public final long[] b() {
        return this.f30515d;
    }

    public final long[] c() {
        return this.f30514c;
    }

    public final boolean a(long j4, uf1 uf1Var) {
        if (uf1Var.t() != 2) {
            return false;
        }
        int iZ = uf1Var.z();
        int iD = uf1Var.d();
        uf1Var.f(iZ);
        if (!"onMetaData".equals(new String(uf1Var.c(), iD, iZ)) || uf1Var.a() == 0 || uf1Var.t() != 8) {
            return false;
        }
        HashMap<String, Object> mapA = a(uf1Var);
        Object obj = mapA.get("duration");
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (dDoubleValue > 0.0d) {
                this.f30513b = (long) (dDoubleValue * 1000000.0d);
            }
        }
        Object obj2 = mapA.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f30514c = new long[size];
                this.f30515d = new long[size];
                for (int i = 0; i < size; i++) {
                    Object obj5 = list.get(i);
                    Object obj6 = list2.get(i);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f30514c = new long[0];
                        this.f30515d = new long[0];
                        break;
                    }
                    this.f30514c[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                    this.f30515d[i] = ((Double) obj5).longValue();
                }
            }
        }
        return false;
    }

    private static Serializable a(int i, uf1 uf1Var) {
        if (i == 8) {
            return a(uf1Var);
        }
        if (i == 10) {
            int iX = uf1Var.x();
            ArrayList arrayList = new ArrayList(iX);
            for (int i10 = 0; i10 < iX; i10++) {
                Serializable serializableA = a(uf1Var.t(), uf1Var);
                if (serializableA != null) {
                    arrayList.add(serializableA);
                }
            }
            return arrayList;
        }
        if (i == 11) {
            Date date = new Date((long) Double.longBitsToDouble(uf1Var.p()));
            uf1Var.f(2);
            return date;
        }
        if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(uf1Var.p()));
        }
        if (i == 1) {
            return Boolean.valueOf(uf1Var.t() == 1);
        }
        if (i == 2) {
            int iZ = uf1Var.z();
            int iD = uf1Var.d();
            uf1Var.f(iZ);
            return new String(uf1Var.c(), iD, iZ);
        }
        if (i != 3) {
            return null;
        }
        HashMap map = new HashMap();
        while (true) {
            int iZ2 = uf1Var.z();
            int iD2 = uf1Var.d();
            uf1Var.f(iZ2);
            String str = new String(uf1Var.c(), iD2, iZ2);
            int iT = uf1Var.t();
            if (iT == 9) {
                return map;
            }
            Serializable serializableA2 = a(iT, uf1Var);
            if (serializableA2 != null) {
                map.put(str, serializableA2);
            }
        }
    }

    private static HashMap<String, Object> a(uf1 uf1Var) {
        int iX = uf1Var.x();
        HashMap<String, Object> map = new HashMap<>(iX);
        for (int i = 0; i < iX; i++) {
            int iZ = uf1Var.z();
            int iD = uf1Var.d();
            uf1Var.f(iZ);
            String str = new String(uf1Var.c(), iD, iZ);
            Serializable serializableA = a(uf1Var.t(), uf1Var);
            if (serializableA != null) {
                map.put(str, serializableA);
            }
        }
        return map;
    }
}
