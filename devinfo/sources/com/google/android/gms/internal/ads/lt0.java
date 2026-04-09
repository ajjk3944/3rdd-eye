package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class lt0 extends mg implements va.s0 {

    /* renamed from: a, reason: collision with root package name */
    public final mt0 f13613a;

    /* renamed from: b, reason: collision with root package name */
    public final gt0 f13614b;

    public lt0(mt0 mt0Var, gt0 gt0Var) {
        super("com.google.android.gms.ads.internal.client.IAdPreloader");
        this.f13613a = mt0Var;
        this.f13614b = gt0Var;
    }

    @Override // va.s0
    public final void A(int i4) {
        gt0 gt0Var = this.f13614b;
        synchronized (gt0Var) {
            try {
                pa.b bVarA = pa.b.a(i4);
                if (bVarA != null) {
                    HashMap map = gt0Var.f11601a;
                    if (map.containsKey(bVarA)) {
                        Map map2 = (Map) map.get(bVarA);
                        int size = map2.size();
                        for (String str : map2.keySet()) {
                            it0 it0Var = (it0) map2.get(str);
                            if (it0Var != null) {
                                it0Var.g.set(false);
                                it0Var.f12440p.set(false);
                                et0 et0Var = gt0Var.f11608i;
                                if (et0Var != null) {
                                    et0Var.e(str, bVarA);
                                }
                                it0Var.t();
                                za.i.g("Destroyed ad preloader for preloadId: ".concat(String.valueOf(str)));
                            }
                        }
                        map2.clear();
                        za.i.g("Destroyed all ad preloaders for ad format: ".concat(bVarA.toString()));
                        kh0 kh0Var = gt0Var.f11603c;
                        gt0Var.g.getClass();
                        kh0Var.C("pda", System.currentTimeMillis(), null, null, bVarA, -1, -1, size);
                    }
                }
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.mg
    public final boolean g4(int i4, Parcel parcel, Parcel parcel2) {
        it0 it0Var;
        va.p0 p0Var = null;
        va.q0 q0Var = null;
        int i10 = 0;
        switch (i4) {
            case 1:
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(va.t2.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloadCallback");
                    p0Var = iInterfaceQueryLocalInterface instanceof va.p0 ? (va.p0) iInterfaceQueryLocalInterface : new va.p0(strongBinder, "com.google.android.gms.ads.internal.client.IAdPreloadCallback", 1);
                }
                ng.f(parcel);
                this.f13613a.a(arrayListCreateTypedArrayList, p0Var);
                parcel2.writeNoException();
                return true;
            case 2:
                String string = parcel.readString();
                ng.f(parcel);
                boolean zH4 = h4(string);
                parcel2.writeNoException();
                parcel2.writeInt(zH4 ? 1 : 0);
                return true;
            case 3:
                String string2 = parcel.readString();
                ng.f(parcel);
                cv cvVarI4 = i4(string2);
                parcel2.writeNoException();
                ng.e(parcel2, cvVarI4);
                return true;
            case 4:
                String string3 = parcel.readString();
                ng.f(parcel);
                boolean zJ4 = j4(string3);
                parcel2.writeNoException();
                parcel2.writeInt(zJ4 ? 1 : 0);
                return true;
            case 5:
                String string4 = parcel.readString();
                ng.f(parcel);
                rh rhVarK4 = k4(string4);
                parcel2.writeNoException();
                ng.e(parcel2, rhVarK4);
                return true;
            case 6:
                String string5 = parcel.readString();
                ng.f(parcel);
                boolean zL4 = l4(string5);
                parcel2.writeNoException();
                parcel2.writeInt(zL4 ? 1 : 0);
                return true;
            case 7:
                String string6 = parcel.readString();
                ng.f(parcel);
                va.l0 l0VarM4 = m4(string6);
                parcel2.writeNoException();
                ng.e(parcel2, l0VarM4);
                return true;
            case 8:
                yq.h4(parcel.readStrongBinder());
                ng.f(parcel);
                parcel2.writeNoException();
                return true;
            case 9:
                String string7 = parcel.readString();
                va.t2 t2Var = (va.t2) ng.b(parcel, va.t2.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloadCallbackV2");
                    q0Var = iInterfaceQueryLocalInterface2 instanceof va.q0 ? (va.q0) iInterfaceQueryLocalInterface2 : new va.q0(strongBinder2, "com.google.android.gms.ads.internal.client.IAdPreloadCallbackV2", 1);
                }
                ng.f(parcel);
                boolean zA = this.f13614b.a(string7, t2Var, q0Var);
                parcel2.writeNoException();
                parcel2.writeInt(zA ? 1 : 0);
                return true;
            case 10:
                int i11 = parcel.readInt();
                String string8 = parcel.readString();
                ng.f(parcel);
                boolean zN4 = n4(i11, string8);
                parcel2.writeNoException();
                parcel2.writeInt(zN4 ? 1 : 0);
                return true;
            case 11:
                String string9 = parcel.readString();
                ng.f(parcel);
                va.l0 l0VarO4 = o4(string9);
                parcel2.writeNoException();
                ng.e(parcel2, l0VarO4);
                return true;
            case 12:
                String string10 = parcel.readString();
                ng.f(parcel);
                rh rhVarP4 = p4(string10);
                parcel2.writeNoException();
                ng.e(parcel2, rhVarP4);
                return true;
            case 13:
                String string11 = parcel.readString();
                ng.f(parcel);
                cv cvVarQ4 = q4(string11);
                parcel2.writeNoException();
                ng.e(parcel2, cvVarQ4);
                return true;
            case 14:
                int i12 = parcel.readInt();
                String string12 = parcel.readString();
                ng.f(parcel);
                va.t2 t2VarR4 = r4(i12, string12);
                parcel2.writeNoException();
                ng.d(parcel2, t2VarR4);
                return true;
            case 15:
                int i13 = parcel.readInt();
                ng.f(parcel);
                Bundle bundleS4 = s4(i13);
                parcel2.writeNoException();
                ng.d(parcel2, bundleS4);
                return true;
            case 16:
                int i14 = parcel.readInt();
                String string13 = parcel.readString();
                ng.f(parcel);
                int iT4 = t4(i14, string13);
                parcel2.writeNoException();
                parcel2.writeInt(iT4);
                return true;
            case 17:
                int i15 = parcel.readInt();
                String string14 = parcel.readString();
                ng.f(parcel);
                pa.b bVarA = pa.b.a(i15);
                if (bVarA != null) {
                    gt0 gt0Var = this.f13614b;
                    synchronized (gt0Var) {
                        try {
                            HashMap map = gt0Var.f11601a;
                            if (map.containsKey(bVarA) && (it0Var = (it0) ((Map) map.get(bVarA)).get(string14)) != null) {
                                ((Map) map.get(bVarA)).remove(string14);
                                it0Var.g.set(false);
                                it0Var.f12440p.set(false);
                                et0 et0Var = gt0Var.f11608i;
                                if (et0Var != null) {
                                    et0Var.e(string14, bVarA);
                                }
                                it0Var.t();
                                kh0 kh0Var = gt0Var.f11603c;
                                gt0Var.g.getClass();
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                va.t2 t2Var2 = it0Var.f12431e;
                                kh0Var.C("pd", jCurrentTimeMillis, string14, t2Var2.f36170a, bVarA, t2Var2.f36173d, it0Var.r(), 1);
                                i10 = 1;
                            }
                        } finally {
                        }
                    }
                }
                parcel2.writeNoException();
                parcel2.writeInt(i10);
                return true;
            case 18:
                int i16 = parcel.readInt();
                ng.f(parcel);
                A(i16);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }

    public final boolean h4(String str) {
        boolean zG;
        mt0 mt0Var = this.f13613a;
        synchronized (mt0Var) {
            zG = mt0Var.g(str, pa.b.REWARDED);
        }
        return zG;
    }

    public final cv i4(String str) {
        cv cvVar;
        mt0 mt0Var = this.f13613a;
        synchronized (mt0Var) {
            cvVar = (cv) mt0Var.h(cv.class, str, pa.b.REWARDED);
        }
        return cvVar;
    }

    public final boolean j4(String str) {
        boolean zG;
        mt0 mt0Var = this.f13613a;
        synchronized (mt0Var) {
            zG = mt0Var.g(str, pa.b.APP_OPEN_AD);
        }
        return zG;
    }

    public final rh k4(String str) {
        rh rhVar;
        mt0 mt0Var = this.f13613a;
        synchronized (mt0Var) {
            rhVar = (rh) mt0Var.h(rh.class, str, pa.b.APP_OPEN_AD);
        }
        return rhVar;
    }

    public final boolean l4(String str) {
        boolean zG;
        mt0 mt0Var = this.f13613a;
        synchronized (mt0Var) {
            zG = mt0Var.g(str, pa.b.INTERSTITIAL);
        }
        return zG;
    }

    public final va.l0 m4(String str) {
        va.l0 l0Var;
        mt0 mt0Var = this.f13613a;
        synchronized (mt0Var) {
            l0Var = (va.l0) mt0Var.h(va.l0.class, str, pa.b.INTERSTITIAL);
        }
        return l0Var;
    }

    public final boolean n4(int i4, String str) {
        nt0 nt0Var;
        pa.b bVarA = pa.b.a(i4);
        if (bVarA == null) {
            return false;
        }
        gt0 gt0Var = this.f13614b;
        synchronized (gt0Var) {
            try {
                gt0Var.g.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                HashMap map = gt0Var.f11601a;
                if (!map.containsKey(bVarA)) {
                    return false;
                }
                it0 it0Var = (it0) ((Map) map.get(bVarA)).get(str);
                String strO = it0Var == null ? null : it0Var.o();
                boolean z3 = strO != null && bVarA.equals(it0Var.q());
                Long lValueOf = z3 ? Long.valueOf(System.currentTimeMillis()) : null;
                if (it0Var == null) {
                    nt0Var = null;
                } else {
                    pq0 pq0Var = new pq0(29, it0Var.f12431e.f36170a, bVarA);
                    pq0Var.f15075d = str;
                    nt0Var = new nt0(pq0Var);
                }
                gt0Var.f11603c.z(it0Var == null ? 0 : it0Var.f12431e.f36173d, it0Var != null ? it0Var.r() : 0, jCurrentTimeMillis, lValueOf, strO, nt0Var, "2");
                return z3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final va.l0 o4(String str) {
        va.l0 l0Var;
        gt0 gt0Var = this.f13614b;
        synchronized (gt0Var) {
            l0Var = (va.l0) gt0Var.d(va.l0.class, str, pa.b.INTERSTITIAL);
        }
        return l0Var;
    }

    public final rh p4(String str) {
        rh rhVar;
        gt0 gt0Var = this.f13614b;
        synchronized (gt0Var) {
            rhVar = (rh) gt0Var.d(rh.class, str, pa.b.APP_OPEN_AD);
        }
        return rhVar;
    }

    public final cv q4(String str) {
        cv cvVar;
        gt0 gt0Var = this.f13614b;
        synchronized (gt0Var) {
            cvVar = (cv) gt0Var.d(cv.class, str, pa.b.REWARDED);
        }
        return cvVar;
    }

    public final va.t2 r4(int i4, String str) {
        pa.b bVarA = pa.b.a(i4);
        if (bVarA == null) {
            return null;
        }
        gt0 gt0Var = this.f13614b;
        synchronized (gt0Var) {
            HashMap map = gt0Var.f11601a;
            if (map.containsKey(bVarA)) {
                it0 it0Var = (it0) ((Map) map.get(bVarA)).get(str);
                kh0 kh0Var = gt0Var.f11603c;
                gt0Var.g.getClass();
                kh0Var.C("pgc", System.currentTimeMillis(), str, it0Var == null ? null : it0Var.f12431e.f36170a, bVarA, it0Var == null ? -1 : it0Var.f12431e.f36173d, it0Var != null ? it0Var.r() : -1, 1);
                if (it0Var != null) {
                    return it0Var.f12431e;
                }
            }
            return null;
        }
    }

    public final Bundle s4(int i4) {
        HashMap map;
        gt0 gt0Var = this.f13614b;
        synchronized (gt0Var) {
            try {
                map = new HashMap();
                pa.b bVarA = pa.b.a(i4);
                if (bVarA != null) {
                    HashMap map2 = gt0Var.f11601a;
                    if (map2.containsKey(bVarA)) {
                        for (it0 it0Var : ((Map) map2.get(bVarA)).values()) {
                            map.put(it0Var.f12436l, it0Var.f12431e);
                        }
                        kh0 kh0Var = gt0Var.f11603c;
                        gt0Var.g.getClass();
                        kh0Var.C("pgcs", System.currentTimeMillis(), null, null, bVarA, -1, -1, map.size());
                    }
                }
            } finally {
            }
        }
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            va.t2 t2Var = (va.t2) entry.getValue();
            Parcel parcelObtain = Parcel.obtain();
            t2Var.writeToParcel(parcelObtain, 0);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            bundle.putByteArray(str, bArrMarshall);
        }
        return bundle;
    }

    public final int t4(int i4, String str) {
        pa.b bVarA = pa.b.a(i4);
        if (bVarA == null) {
            return 0;
        }
        gt0 gt0Var = this.f13614b;
        synchronized (gt0Var) {
            HashMap map = gt0Var.f11601a;
            if (!map.containsKey(bVarA)) {
                return 0;
            }
            it0 it0Var = (it0) ((Map) map.get(bVarA)).get(str);
            int iR = it0Var != null ? it0Var.r() : 0;
            kh0 kh0Var = gt0Var.f11603c;
            gt0Var.g.getClass();
            kh0Var.C("pnav", System.currentTimeMillis(), str, it0Var == null ? null : it0Var.f12431e.f36170a, bVarA, it0Var == null ? -1 : it0Var.f12431e.f36173d, iR, 1);
            return iR;
        }
    }

    @Override // va.s0
    public final void C2(yq yqVar) {
    }
}
