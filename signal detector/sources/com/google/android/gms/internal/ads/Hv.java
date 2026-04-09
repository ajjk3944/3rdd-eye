package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import j2.EnumC2546b;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import q2.C2841s;

/* loaded from: classes.dex */
public final class Hv extends B7 implements q2.T {

    /* renamed from: a, reason: collision with root package name */
    public final Iv f9020a;

    /* renamed from: b, reason: collision with root package name */
    public final Cv f9021b;

    public Hv(Iv iv, Cv cv) {
        super("com.google.android.gms.ads.internal.client.IAdPreloader");
        this.f9020a = iv;
        this.f9021b = cv;
    }

    @Override // com.google.android.gms.internal.ads.B7
    public final boolean J3(int i, Parcel parcel, Parcel parcel2) {
        Ev ev;
        q2.P p6 = null;
        q2.Q q3 = null;
        int i3 = 0;
        switch (i) {
            case 1:
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(q2.U0.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloadCallback");
                    p6 = iInterfaceQueryLocalInterface instanceof q2.P ? (q2.P) iInterfaceQueryLocalInterface : new q2.P(strongBinder, "com.google.android.gms.ads.internal.client.IAdPreloadCallback", 2);
                }
                C7.f(parcel);
                K3(arrayListCreateTypedArrayList, p6);
                parcel2.writeNoException();
                return true;
            case 2:
                String string = parcel.readString();
                C7.f(parcel);
                boolean zL3 = L3(string);
                parcel2.writeNoException();
                parcel2.writeInt(zL3 ? 1 : 0);
                return true;
            case 3:
                String string2 = parcel.readString();
                C7.f(parcel);
                InterfaceC0605Le interfaceC0605LeM3 = M3(string2);
                parcel2.writeNoException();
                C7.e(parcel2, interfaceC0605LeM3);
                return true;
            case 4:
                String string3 = parcel.readString();
                C7.f(parcel);
                boolean zN3 = N3(string3);
                parcel2.writeNoException();
                parcel2.writeInt(zN3 ? 1 : 0);
                return true;
            case 5:
                String string4 = parcel.readString();
                C7.f(parcel);
                InterfaceC1193g8 interfaceC1193g8O3 = O3(string4);
                parcel2.writeNoException();
                C7.e(parcel2, interfaceC1193g8O3);
                return true;
            case 6:
                String string5 = parcel.readString();
                C7.f(parcel);
                boolean zP3 = P3(string5);
                parcel2.writeNoException();
                parcel2.writeInt(zP3 ? 1 : 0);
                return true;
            case 7:
                String string6 = parcel.readString();
                C7.f(parcel);
                q2.L lQ3 = Q3(string6);
                parcel2.writeNoException();
                C7.e(parcel2, lQ3);
                return true;
            case 8:
                BinderC0569Jc.K3(parcel.readStrongBinder());
                C7.f(parcel);
                parcel2.writeNoException();
                return true;
            case 9:
                String string7 = parcel.readString();
                q2.U0 u02 = (q2.U0) C7.b(parcel, q2.U0.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloadCallbackV2");
                    q3 = iInterfaceQueryLocalInterface2 instanceof q2.Q ? (q2.Q) iInterfaceQueryLocalInterface2 : new q2.Q(strongBinder2, "com.google.android.gms.ads.internal.client.IAdPreloadCallbackV2", 2);
                }
                C7.f(parcel);
                boolean zR3 = R3(string7, u02, q3);
                parcel2.writeNoException();
                parcel2.writeInt(zR3 ? 1 : 0);
                return true;
            case 10:
                int i6 = parcel.readInt();
                String string8 = parcel.readString();
                C7.f(parcel);
                boolean zS3 = S3(i6, string8);
                parcel2.writeNoException();
                parcel2.writeInt(zS3 ? 1 : 0);
                return true;
            case 11:
                String string9 = parcel.readString();
                C7.f(parcel);
                q2.L lT3 = T3(string9);
                parcel2.writeNoException();
                C7.e(parcel2, lT3);
                return true;
            case 12:
                String string10 = parcel.readString();
                C7.f(parcel);
                InterfaceC1193g8 interfaceC1193g8U3 = U3(string10);
                parcel2.writeNoException();
                C7.e(parcel2, interfaceC1193g8U3);
                return true;
            case 13:
                String string11 = parcel.readString();
                C7.f(parcel);
                InterfaceC0605Le interfaceC0605LeV3 = V3(string11);
                parcel2.writeNoException();
                C7.e(parcel2, interfaceC0605LeV3);
                return true;
            case 14:
                int i7 = parcel.readInt();
                String string12 = parcel.readString();
                C7.f(parcel);
                q2.U0 u0W3 = W3(i7, string12);
                parcel2.writeNoException();
                C7.d(parcel2, u0W3);
                return true;
            case 15:
                int i8 = parcel.readInt();
                C7.f(parcel);
                Bundle bundleX3 = X3(i8);
                parcel2.writeNoException();
                C7.d(parcel2, bundleX3);
                return true;
            case 16:
                int i9 = parcel.readInt();
                String string13 = parcel.readString();
                C7.f(parcel);
                int iY3 = Y3(i9, string13);
                parcel2.writeNoException();
                parcel2.writeInt(iY3);
                return true;
            case 17:
                int i10 = parcel.readInt();
                String string14 = parcel.readString();
                C7.f(parcel);
                EnumC2546b enumC2546bA = EnumC2546b.a(i10);
                if (enumC2546bA != null) {
                    Cv cv = this.f9021b;
                    synchronized (cv) {
                        try {
                            HashMap map = cv.f7689a;
                            if (map.containsKey(enumC2546bA) && (ev = (Ev) ((Map) map.get(enumC2546bA)).get(string14)) != null) {
                                ((Map) map.get(enumC2546bA)).remove(string14);
                                ev.f8029g.set(false);
                                ev.f8037p.set(false);
                                Av av = cv.i;
                                if (av != null) {
                                    av.e(string14, enumC2546bA);
                                }
                                ev.t();
                                C1014cu c1014cu = cv.f7691c;
                                cv.f7695g.getClass();
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                q2.U0 u03 = ev.f8027e;
                                c1014cu.m("pd", jCurrentTimeMillis, string14, u03.f23139a, enumC2546bA, u03.f23142d, ev.r(), 1);
                                i3 = 1;
                            }
                        } finally {
                        }
                    }
                }
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            case 18:
                int i11 = parcel.readInt();
                C7.f(parcel);
                P(i11);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }

    public final void K3(ArrayList arrayList, q2.P p6) {
        Iv iv = this.f9020a;
        synchronized (iv) {
            try {
                if (!iv.f9194g.getAndSet(true)) {
                    if (iv.f9193f == null) {
                        synchronized (iv) {
                            if (iv.f9193f == null) {
                                try {
                                    iv.f9193f = (ConnectivityManager) iv.f9192e.getSystemService("connectivity");
                                } catch (ClassCastException e6) {
                                    u2.k.i("Failed to get connectivity manager", e6);
                                }
                            }
                        }
                    }
                    if (!Q2.b.e() || iv.f9193f == null) {
                        iv.i = new AtomicInteger(((Integer) C2841s.f23267e.f23270c.a(H9.f8607I)).intValue());
                    } else {
                        try {
                            iv.f9193f.registerDefaultNetworkCallback(new A1.r(iv));
                        } catch (RuntimeException e7) {
                            u2.k.i("Failed to register network callback", e7);
                            iv.i = new AtomicInteger(((Integer) C2841s.f23267e.f23270c.a(H9.f8607I)).intValue());
                        }
                    }
                    p2.j.f22785C.f22794g.l(new C1623o8(iv));
                }
                ArrayList arrayListD = iv.d(arrayList);
                EnumMap enumMap = new EnumMap(EnumC2546b.class);
                int size = arrayListD.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayListD.get(i);
                    i++;
                    q2.U0 u02 = (q2.U0) obj;
                    String str = u02.f23139a;
                    EnumC2546b enumC2546bA = EnumC2546b.a(u02.f23140b);
                    Ev evA = iv.f9190c.a(u02, p6);
                    if (enumC2546bA != null && evA != null) {
                        AtomicInteger atomicInteger = iv.i;
                        if (atomicInteger != null) {
                            evA.p(atomicInteger.get());
                        }
                        C1014cu c1014cu = iv.f9191d;
                        evA.f8039r = c1014cu;
                        iv.e(Iv.a(str, enumC2546bA), evA);
                        W2.e eVar = u2.f.f23795b;
                        enumMap.put((EnumMap) enumC2546bA, (EnumC2546b) Integer.valueOf(((Integer) (enumMap.containsKey(enumC2546bA) ? enumMap.get(enumC2546bA) : 0)).intValue() + 1));
                        Jv jv = new Jv(new C1338iu(str, 29, enumC2546bA));
                        int i3 = u02.f23142d;
                        iv.f9195h.getClass();
                        c1014cu.e(i3, System.currentTimeMillis(), jv, "1");
                    }
                }
                C1014cu c1014cu2 = iv.f9191d;
                iv.f9195h.getClass();
                c1014cu2.g(enumMap, System.currentTimeMillis());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean L3(String str) {
        boolean zF;
        Iv iv = this.f9020a;
        synchronized (iv) {
            zF = iv.f(str, EnumC2546b.REWARDED);
        }
        return zF;
    }

    public final InterfaceC0605Le M3(String str) {
        InterfaceC0605Le interfaceC0605Le;
        Iv iv = this.f9020a;
        synchronized (iv) {
            interfaceC0605Le = (InterfaceC0605Le) iv.g(EnumC2546b.REWARDED, InterfaceC0605Le.class, str);
        }
        return interfaceC0605Le;
    }

    public final boolean N3(String str) {
        boolean zF;
        Iv iv = this.f9020a;
        synchronized (iv) {
            zF = iv.f(str, EnumC2546b.APP_OPEN_AD);
        }
        return zF;
    }

    public final InterfaceC1193g8 O3(String str) {
        InterfaceC1193g8 interfaceC1193g8;
        Iv iv = this.f9020a;
        synchronized (iv) {
            interfaceC1193g8 = (InterfaceC1193g8) iv.g(EnumC2546b.APP_OPEN_AD, InterfaceC1193g8.class, str);
        }
        return interfaceC1193g8;
    }

    @Override // q2.T
    public final void P(int i) {
        Cv cv = this.f9021b;
        synchronized (cv) {
            try {
                EnumC2546b enumC2546bA = EnumC2546b.a(i);
                if (enumC2546bA != null) {
                    HashMap map = cv.f7689a;
                    if (map.containsKey(enumC2546bA)) {
                        Map map2 = (Map) map.get(enumC2546bA);
                        int size = map2.size();
                        for (String str : map2.keySet()) {
                            Ev ev = (Ev) map2.get(str);
                            if (ev != null) {
                                ev.f8029g.set(false);
                                ev.f8037p.set(false);
                                Av av = cv.i;
                                if (av != null) {
                                    av.e(str, enumC2546bA);
                                }
                                ev.t();
                                u2.k.g("Destroyed ad preloader for preloadId: ".concat(String.valueOf(str)));
                            }
                        }
                        map2.clear();
                        u2.k.g("Destroyed all ad preloaders for ad format: ".concat(enumC2546bA.toString()));
                        C1014cu c1014cu = cv.f7691c;
                        cv.f7695g.getClass();
                        c1014cu.m("pda", System.currentTimeMillis(), null, null, enumC2546bA, -1, -1, size);
                    }
                }
            } finally {
            }
        }
    }

    public final boolean P3(String str) {
        boolean zF;
        Iv iv = this.f9020a;
        synchronized (iv) {
            zF = iv.f(str, EnumC2546b.INTERSTITIAL);
        }
        return zF;
    }

    public final q2.L Q3(String str) {
        q2.L l2;
        Iv iv = this.f9020a;
        synchronized (iv) {
            l2 = (q2.L) iv.g(EnumC2546b.INTERSTITIAL, q2.L.class, str);
        }
        return l2;
    }

    public final boolean R3(String str, q2.U0 u02, q2.Q q3) {
        Ev evB;
        Cv cv = this.f9021b;
        synchronized (cv) {
            try {
                if (!cv.f7694f.getAndSet(true)) {
                    if (cv.f7693e == null) {
                        synchronized (cv) {
                            if (cv.f7693e == null) {
                                try {
                                    cv.f7693e = (ConnectivityManager) cv.f7692d.getSystemService("connectivity");
                                } catch (ClassCastException e6) {
                                    u2.k.i("Failed to get connectivity manager", e6);
                                }
                            }
                        }
                    }
                    if (!Q2.b.e() || cv.f7693e == null) {
                        cv.f7696h = new AtomicInteger(((Integer) C2841s.f23267e.f23270c.a(H9.f8607I)).intValue());
                    } else {
                        try {
                            cv.f7693e.registerDefaultNetworkCallback(new A1.r(cv));
                        } catch (RuntimeException e7) {
                            u2.k.i("Failed to register network callback", e7);
                            cv.f7696h = new AtomicInteger(((Integer) C2841s.f23267e.f23270c.a(H9.f8607I)).intValue());
                        }
                    }
                    p2.j.f22785C.f22794g.l(new C1623o8(cv));
                }
                EnumC2546b enumC2546bA = EnumC2546b.a(u02.f23140b);
                if (enumC2546bA != null) {
                    HashMap map = cv.f7689a;
                    if (map.containsKey(enumC2546bA) && !((Map) map.get(enumC2546bA)).containsKey(str) && cv.d(enumC2546bA) && (evB = cv.f7690b.b(str, u02, q3)) != null) {
                        AtomicInteger atomicInteger = cv.f7696h;
                        if (atomicInteger != null) {
                            evB.p(atomicInteger.get());
                        }
                        C1014cu c1014cu = cv.f7691c;
                        evB.f8039r = c1014cu;
                        Av av = cv.i;
                        if (av != null) {
                            av.d(str, enumC2546bA, evB);
                        } else {
                            evB.j();
                        }
                        ((Map) map.get(enumC2546bA)).put(str, evB);
                        C1338iu c1338iu = new C1338iu(u02.f23139a, 29, enumC2546bA);
                        c1338iu.f14824d = str;
                        Jv jv = new Jv(c1338iu);
                        int i = u02.f23142d;
                        cv.f7695g.getClass();
                        c1014cu.e(i, System.currentTimeMillis(), jv, "2");
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean S3(int i, String str) {
        Jv jv;
        EnumC2546b enumC2546bA = EnumC2546b.a(i);
        if (enumC2546bA == null) {
            return false;
        }
        Cv cv = this.f9021b;
        synchronized (cv) {
            try {
                cv.f7695g.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                HashMap map = cv.f7689a;
                if (!map.containsKey(enumC2546bA)) {
                    return false;
                }
                Ev ev = (Ev) ((Map) map.get(enumC2546bA)).get(str);
                String strO = ev == null ? null : ev.o();
                boolean z6 = strO != null && enumC2546bA.equals(ev.q());
                Long lValueOf = z6 ? Long.valueOf(System.currentTimeMillis()) : null;
                if (ev == null) {
                    jv = null;
                } else {
                    C1338iu c1338iu = new C1338iu(ev.f8027e.f23139a, 29, enumC2546bA);
                    c1338iu.f14824d = str;
                    jv = new Jv(c1338iu);
                }
                cv.f7691c.i(ev == null ? 0 : ev.f8027e.f23142d, ev != null ? ev.r() : 0, jCurrentTimeMillis, lValueOf, strO, jv, "2");
                return z6;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final q2.L T3(String str) {
        q2.L l2;
        Cv cv = this.f9021b;
        synchronized (cv) {
            l2 = (q2.L) cv.c(EnumC2546b.INTERSTITIAL, q2.L.class, str);
        }
        return l2;
    }

    public final InterfaceC1193g8 U3(String str) {
        InterfaceC1193g8 interfaceC1193g8;
        Cv cv = this.f9021b;
        synchronized (cv) {
            interfaceC1193g8 = (InterfaceC1193g8) cv.c(EnumC2546b.APP_OPEN_AD, InterfaceC1193g8.class, str);
        }
        return interfaceC1193g8;
    }

    public final InterfaceC0605Le V3(String str) {
        InterfaceC0605Le interfaceC0605Le;
        Cv cv = this.f9021b;
        synchronized (cv) {
            interfaceC0605Le = (InterfaceC0605Le) cv.c(EnumC2546b.REWARDED, InterfaceC0605Le.class, str);
        }
        return interfaceC0605Le;
    }

    public final q2.U0 W3(int i, String str) {
        EnumC2546b enumC2546bA = EnumC2546b.a(i);
        if (enumC2546bA == null) {
            return null;
        }
        Cv cv = this.f9021b;
        synchronized (cv) {
            HashMap map = cv.f7689a;
            if (map.containsKey(enumC2546bA)) {
                Ev ev = (Ev) ((Map) map.get(enumC2546bA)).get(str);
                C1014cu c1014cu = cv.f7691c;
                cv.f7695g.getClass();
                c1014cu.m("pgc", System.currentTimeMillis(), str, ev == null ? null : ev.f8027e.f23139a, enumC2546bA, ev == null ? -1 : ev.f8027e.f23142d, ev != null ? ev.r() : -1, 1);
                if (ev != null) {
                    return ev.f8027e;
                }
            }
            return null;
        }
    }

    public final Bundle X3(int i) {
        HashMap map;
        Cv cv = this.f9021b;
        synchronized (cv) {
            try {
                map = new HashMap();
                EnumC2546b enumC2546bA = EnumC2546b.a(i);
                if (enumC2546bA != null) {
                    HashMap map2 = cv.f7689a;
                    if (map2.containsKey(enumC2546bA)) {
                        for (Ev ev : ((Map) map2.get(enumC2546bA)).values()) {
                            map.put(ev.f8033l, ev.f8027e);
                        }
                        C1014cu c1014cu = cv.f7691c;
                        cv.f7695g.getClass();
                        c1014cu.m("pgcs", System.currentTimeMillis(), null, null, enumC2546bA, -1, -1, map.size());
                    }
                }
            } finally {
            }
        }
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            q2.U0 u02 = (q2.U0) entry.getValue();
            Parcel parcelObtain = Parcel.obtain();
            u02.writeToParcel(parcelObtain, 0);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            bundle.putByteArray(str, bArrMarshall);
        }
        return bundle;
    }

    public final int Y3(int i, String str) {
        EnumC2546b enumC2546bA = EnumC2546b.a(i);
        if (enumC2546bA == null) {
            return 0;
        }
        Cv cv = this.f9021b;
        synchronized (cv) {
            HashMap map = cv.f7689a;
            if (!map.containsKey(enumC2546bA)) {
                return 0;
            }
            Ev ev = (Ev) ((Map) map.get(enumC2546bA)).get(str);
            int iR = ev != null ? ev.r() : 0;
            C1014cu c1014cu = cv.f7691c;
            cv.f7695g.getClass();
            c1014cu.m("pnav", System.currentTimeMillis(), str, ev == null ? null : ev.f8027e.f23139a, enumC2546bA, ev == null ? -1 : ev.f8027e.f23142d, iR, 1);
            return iR;
        }
    }

    @Override // q2.T
    public final void i2(BinderC0569Jc binderC0569Jc) {
    }
}
