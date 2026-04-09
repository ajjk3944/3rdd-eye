package defpackage;

import android.net.ConnectivityManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class mb3 extends hv1 implements kh2 {
    public final nb3 f;
    public final gb3 g;

    public mb3(nb3 nb3Var, gb3 gb3Var) {
        super("com.google.android.gms.ads.internal.client.IAdPreloader");
        this.f = nb3Var;
        this.g = gb3Var;
    }

    @Override // defpackage.hv1
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        HashMap map;
        jb3 jb3Var;
        od2 od2Var = null;
        bf2 bf2Var = null;
        switch (i) {
            case 1:
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(ae3.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloadCallback");
                    od2Var = iInterfaceQueryLocalInterface instanceof od2 ? (od2) iInterfaceQueryLocalInterface : new od2(strongBinder, "com.google.android.gms.ads.internal.client.IAdPreloadCallback", 2);
                }
                iv1.f(parcel);
                B3(arrayListCreateTypedArrayList, od2Var);
                parcel2.writeNoException();
                return true;
            case 2:
                String string = parcel.readString();
                iv1.f(parcel);
                boolean zC3 = C3(string);
                parcel2.writeNoException();
                parcel2.writeInt(zC3 ? 1 : 0);
                return true;
            case 3:
                String string2 = parcel.readString();
                iv1.f(parcel);
                ya2 ya2VarD3 = D3(string2);
                parcel2.writeNoException();
                iv1.e(parcel2, ya2VarD3);
                return true;
            case 4:
                String string3 = parcel.readString();
                iv1.f(parcel);
                boolean zE3 = E3(string3);
                parcel2.writeNoException();
                parcel2.writeInt(zE3 ? 1 : 0);
                return true;
            case 5:
                String string4 = parcel.readString();
                iv1.f(parcel);
                kw1 kw1VarF3 = F3(string4);
                parcel2.writeNoException();
                iv1.e(parcel2, kw1VarF3);
                return true;
            case 6:
                String string5 = parcel.readString();
                iv1.f(parcel);
                boolean zG3 = G3(string5);
                parcel2.writeNoException();
                parcel2.writeInt(zG3 ? 1 : 0);
                return true;
            case 7:
                String string6 = parcel.readString();
                iv1.f(parcel);
                ba2 ba2VarH3 = H3(string6);
                parcel2.writeNoException();
                iv1.e(parcel2, ba2VarH3);
                return true;
            case 8:
                s62.B3(parcel.readStrongBinder());
                iv1.f(parcel);
                parcel2.writeNoException();
                return true;
            case 9:
                String string7 = parcel.readString();
                ae3 ae3Var = (ae3) iv1.b(parcel, ae3.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloadCallbackV2");
                    bf2Var = iInterfaceQueryLocalInterface2 instanceof bf2 ? (bf2) iInterfaceQueryLocalInterface2 : new bf2(strongBinder2, "com.google.android.gms.ads.internal.client.IAdPreloadCallbackV2", 2);
                }
                iv1.f(parcel);
                boolean zI3 = I3(string7, ae3Var, bf2Var);
                parcel2.writeNoException();
                parcel2.writeInt(zI3 ? 1 : 0);
                return true;
            case 10:
                int i2 = parcel.readInt();
                String string8 = parcel.readString();
                iv1.f(parcel);
                boolean zJ3 = J3(string8, i2);
                parcel2.writeNoException();
                parcel2.writeInt(zJ3 ? 1 : 0);
                return true;
            case 11:
                String string9 = parcel.readString();
                iv1.f(parcel);
                ba2 ba2VarK3 = K3(string9);
                parcel2.writeNoException();
                iv1.e(parcel2, ba2VarK3);
                return true;
            case 12:
                String string10 = parcel.readString();
                iv1.f(parcel);
                kw1 kw1VarL3 = L3(string10);
                parcel2.writeNoException();
                iv1.e(parcel2, kw1VarL3);
                return true;
            case 13:
                String string11 = parcel.readString();
                iv1.f(parcel);
                ya2 ya2VarM3 = M3(string11);
                parcel2.writeNoException();
                iv1.e(parcel2, ya2VarM3);
                return true;
            case 14:
                int i3 = parcel.readInt();
                String string12 = parcel.readString();
                iv1.f(parcel);
                ae3 ae3VarN3 = N3(string12, i3);
                parcel2.writeNoException();
                iv1.d(parcel2, ae3VarN3);
                return true;
            case 15:
                int i4 = parcel.readInt();
                iv1.f(parcel);
                gb3 gb3Var = this.g;
                synchronized (gb3Var) {
                    try {
                        map = new HashMap();
                        s2 s2VarA = s2.a(i4);
                        if (s2VarA != null) {
                            HashMap map2 = gb3Var.a;
                            if (map2.containsKey(s2VarA)) {
                                for (jb3 jb3Var2 : ((Map) map2.get(s2VarA)).values()) {
                                    map.put(jb3Var2.k, jb3Var2.e);
                                }
                                sq0 sq0Var = gb3Var.c;
                                gb3Var.g.getClass();
                                sq0Var.y("pgcs", System.currentTimeMillis(), null, null, s2VarA, -1, -1, map.size());
                            }
                        }
                    } finally {
                    }
                }
                Bundle bundle = new Bundle();
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    ae3 ae3Var2 = (ae3) entry.getValue();
                    Parcel parcelObtain = Parcel.obtain();
                    ae3Var2.writeToParcel(parcelObtain, 0);
                    byte[] bArrMarshall = parcelObtain.marshall();
                    parcelObtain.recycle();
                    bundle.putByteArray(str, bArrMarshall);
                }
                parcel2.writeNoException();
                iv1.d(parcel2, bundle);
                return true;
            case 16:
                int i5 = parcel.readInt();
                String string13 = parcel.readString();
                iv1.f(parcel);
                s2 s2VarA2 = s2.a(i5);
                if (s2VarA2 != null) {
                    gb3 gb3Var2 = this.g;
                    synchronized (gb3Var2) {
                        HashMap map3 = gb3Var2.a;
                        if (map3.containsKey(s2VarA2)) {
                            jb3 jb3Var3 = (jb3) ((Map) map3.get(s2VarA2)).get(string13);
                            int iM = jb3Var3 != null ? jb3Var3.m() : 0;
                            sq0 sq0Var2 = gb3Var2.c;
                            gb3Var2.g.getClass();
                            sq0Var2.y("pnav", System.currentTimeMillis(), string13, jb3Var3 != null ? jb3Var3.e.f : null, s2VarA2, jb3Var3 == null ? -1 : jb3Var3.e.i, iM, 1);
                            i = iM;
                        }
                    }
                }
                parcel2.writeNoException();
                parcel2.writeInt(i);
                return true;
            case 17:
                int i6 = parcel.readInt();
                String string14 = parcel.readString();
                iv1.f(parcel);
                s2 s2VarA3 = s2.a(i6);
                if (s2VarA3 != null) {
                    gb3 gb3Var3 = this.g;
                    synchronized (gb3Var3) {
                        HashMap map4 = gb3Var3.a;
                        if (map4.containsKey(s2VarA3) && (jb3Var = (jb3) ((Map) map4.get(s2VarA3)).get(string14)) != null) {
                            ((Map) map4.get(s2VarA3)).remove(string14);
                            jb3Var.f.set(false);
                            jb3Var.n.set(false);
                            jb3Var.i.clear();
                            sq0 sq0Var3 = gb3Var3.c;
                            gb3Var3.g.getClass();
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            ae3 ae3Var3 = jb3Var.e;
                            sq0Var3.y("pd", jCurrentTimeMillis, string14, ae3Var3.f, s2VarA3, ae3Var3.i, jb3Var.m(), 1);
                            i = 1;
                        }
                    }
                }
                parcel2.writeNoException();
                parcel2.writeInt(i);
                return true;
            case 18:
                int i7 = parcel.readInt();
                iv1.f(parcel);
                gb3 gb3Var4 = this.g;
                synchronized (gb3Var4) {
                    try {
                        s2 s2VarA4 = s2.a(i7);
                        if (s2VarA4 != null) {
                            HashMap map5 = gb3Var4.a;
                            if (map5.containsKey(s2VarA4)) {
                                Map map6 = (Map) map5.get(s2VarA4);
                                int size = map6.size();
                                for (String str2 : map6.keySet()) {
                                    jb3 jb3Var4 = (jb3) map6.get(str2);
                                    if (jb3Var4 != null) {
                                        jb3Var4.f.set(false);
                                        jb3Var4.n.set(false);
                                        jb3Var4.i.clear();
                                        gi2.f0("Destroyed ad preloader for preloadId: ".concat(String.valueOf(str2)));
                                    }
                                }
                                map6.clear();
                                gi2.f0("Destroyed all ad preloaders for ad format: ".concat(s2VarA4.toString()));
                                sq0 sq0Var4 = gb3Var4.c;
                                gb3Var4.g.getClass();
                                sq0Var4.y("pda", System.currentTimeMillis(), null, null, s2VarA4, -1, -1, size);
                            }
                        }
                    } finally {
                    }
                }
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00da, code lost:
    
        r3 = 0;
        r11 = defpackage.j63.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e4, code lost:
    
        if (r4.containsKey(r10) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e6, code lost:
    
        r3 = r4.get(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ea, code lost:
    
        r4.put((java.util.EnumMap) r10, (defpackage.s2) java.lang.Integer.valueOf(((java.lang.Integer) r3).intValue() + 1));
        r9 = new defpackage.qb3(new defpackage.pb3(r9, r10));
        r14 = r8.i;
        r2.h.getClass();
        r13.q(r14, java.lang.System.currentTimeMillis(), r9, "1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0115, code lost:
    
        r3 = r19;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0039 A[Catch: all -> 0x0032, TRY_LEAVE, TryCatch #0 {all -> 0x0032, blocks: (B:4:0x0005, B:31:0x0083, B:33:0x0096, B:36:0x00b2, B:38:0x00b6, B:39:0x00bd, B:40:0x00c5, B:45:0x00d9, B:46:0x00da, B:48:0x00e6, B:49:0x00ea, B:57:0x011f, B:58:0x0120, B:7:0x0012, B:9:0x0017, B:20:0x0031, B:23:0x0035, B:25:0x0039, B:30:0x0076, B:27:0x0051, B:29:0x005c, B:10:0x0018, B:12:0x001c, B:17:0x002e, B:16:0x002b, B:41:0x00c6, B:43:0x00d3, B:44:0x00d4, B:55:0x011d), top: B:63:0x0005, inners: #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0096 A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:4:0x0005, B:31:0x0083, B:33:0x0096, B:36:0x00b2, B:38:0x00b6, B:39:0x00bd, B:40:0x00c5, B:45:0x00d9, B:46:0x00da, B:48:0x00e6, B:49:0x00ea, B:57:0x011f, B:58:0x0120, B:7:0x0012, B:9:0x0017, B:20:0x0031, B:23:0x0035, B:25:0x0039, B:30:0x0076, B:27:0x0051, B:29:0x005c, B:10:0x0018, B:12:0x001c, B:17:0x002e, B:16:0x002b, B:41:0x00c6, B:43:0x00d3, B:44:0x00d4, B:55:0x011d), top: B:63:0x0005, inners: #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0051 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B3(java.util.ArrayList r21, defpackage.od2 r22) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mb3.B3(java.util.ArrayList, od2):void");
    }

    public final boolean C3(String str) {
        boolean zE;
        nb3 nb3Var = this.f;
        synchronized (nb3Var) {
            zE = nb3Var.e(str, s2.REWARDED);
        }
        return zE;
    }

    public final ya2 D3(String str) {
        ya2 ya2Var;
        nb3 nb3Var = this.f;
        synchronized (nb3Var) {
            ya2Var = (ya2) nb3Var.f(s2.REWARDED, ya2.class, str);
        }
        return ya2Var;
    }

    public final boolean E3(String str) {
        boolean zE;
        nb3 nb3Var = this.f;
        synchronized (nb3Var) {
            zE = nb3Var.e(str, s2.APP_OPEN_AD);
        }
        return zE;
    }

    public final kw1 F3(String str) {
        kw1 kw1Var;
        nb3 nb3Var = this.f;
        synchronized (nb3Var) {
            kw1Var = (kw1) nb3Var.f(s2.APP_OPEN_AD, kw1.class, str);
        }
        return kw1Var;
    }

    public final boolean G3(String str) {
        boolean zE;
        nb3 nb3Var = this.f;
        synchronized (nb3Var) {
            zE = nb3Var.e(str, s2.INTERSTITIAL);
        }
        return zE;
    }

    public final ba2 H3(String str) {
        ba2 ba2Var;
        nb3 nb3Var = this.f;
        synchronized (nb3Var) {
            ba2Var = (ba2) nb3Var.f(s2.INTERSTITIAL, ba2.class, str);
        }
        return ba2Var;
    }

    public final boolean I3(String str, ae3 ae3Var, bf2 bf2Var) {
        jb3 jb3VarB;
        gb3 gb3Var = this.g;
        synchronized (gb3Var) {
            try {
                if (!gb3Var.f.getAndSet(true)) {
                    if (gb3Var.e == null) {
                        synchronized (gb3Var) {
                            if (gb3Var.e == null) {
                                try {
                                    gb3Var.e = (ConnectivityManager) gb3Var.d.getSystemService("connectivity");
                                } catch (ClassCastException unused) {
                                    gi2.q0(5);
                                }
                            }
                        }
                    }
                    if (gb3Var.e == null) {
                        gb3Var.h = new AtomicInteger(((Integer) tw1.e.c.a(mz1.F)).intValue());
                    } else {
                        try {
                            gb3Var.e.registerDefaultNetworkCallback(new ra0(gb3Var));
                        } catch (RuntimeException unused2) {
                            gi2.q0(5);
                            gb3Var.h = new AtomicInteger(((Integer) tw1.e.c.a(mz1.F)).intValue());
                        }
                    }
                    hg4.C.g.f(new qw1(gb3Var));
                }
                s2 s2VarA = s2.a(ae3Var.g);
                if (s2VarA != null) {
                    HashMap map = gb3Var.a;
                    if (map.containsKey(s2VarA) && !((Map) map.get(s2VarA)).containsKey(str) && gb3Var.d(s2VarA) && (jb3VarB = gb3Var.b.b(str, ae3Var, bf2Var)) != null) {
                        AtomicInteger atomicInteger = gb3Var.h;
                        if (atomicInteger != null) {
                            jb3VarB.l(atomicInteger.get());
                        }
                        sq0 sq0Var = gb3Var.c;
                        jb3VarB.p = sq0Var;
                        synchronized (jb3VarB) {
                            jb3VarB.m.submit(new tb3(jb3VarB, 0));
                        }
                        ((Map) map.get(s2VarA)).put(str, jb3VarB);
                        pb3 pb3Var = new pb3(ae3Var.f, s2VarA);
                        pb3Var.h = str;
                        qb3 qb3Var = new qb3(pb3Var);
                        int i = ae3Var.i;
                        gb3Var.g.getClass();
                        sq0Var.q(i, System.currentTimeMillis(), qb3Var, "2");
                        return true;
                    }
                }
                return false;
            } finally {
            }
        }
    }

    public final boolean J3(String str, int i) {
        qb3 qb3Var;
        s2 s2VarA = s2.a(i);
        if (s2VarA == null) {
            return false;
        }
        gb3 gb3Var = this.g;
        synchronized (gb3Var) {
            try {
                gb3Var.g.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                HashMap map = gb3Var.a;
                if (!map.containsKey(s2VarA)) {
                    return false;
                }
                jb3 jb3Var = (jb3) ((Map) map.get(s2VarA)).get(str);
                String strK = jb3Var == null ? null : jb3Var.k();
                boolean z = strK != null && s2VarA.equals(s2.a(jb3Var.e.g));
                Long lValueOf = z ? Long.valueOf(System.currentTimeMillis()) : null;
                if (jb3Var == null) {
                    qb3Var = null;
                } else {
                    pb3 pb3Var = new pb3(jb3Var.e.f, s2VarA);
                    pb3Var.h = str;
                    qb3Var = new qb3(pb3Var);
                }
                gb3Var.c.u(jb3Var == null ? 0 : jb3Var.e.i, jb3Var != null ? jb3Var.m() : 0, jCurrentTimeMillis, lValueOf, strK, qb3Var, "2");
                return z;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ba2 K3(String str) {
        ba2 ba2Var;
        gb3 gb3Var = this.g;
        synchronized (gb3Var) {
            ba2Var = (ba2) gb3Var.c(s2.INTERSTITIAL, ba2.class, str);
        }
        return ba2Var;
    }

    public final kw1 L3(String str) {
        kw1 kw1Var;
        gb3 gb3Var = this.g;
        synchronized (gb3Var) {
            kw1Var = (kw1) gb3Var.c(s2.APP_OPEN_AD, kw1.class, str);
        }
        return kw1Var;
    }

    public final ya2 M3(String str) {
        ya2 ya2Var;
        gb3 gb3Var = this.g;
        synchronized (gb3Var) {
            ya2Var = (ya2) gb3Var.c(s2.REWARDED, ya2.class, str);
        }
        return ya2Var;
    }

    public final ae3 N3(String str, int i) {
        s2 s2VarA = s2.a(i);
        if (s2VarA == null) {
            return null;
        }
        gb3 gb3Var = this.g;
        synchronized (gb3Var) {
            HashMap map = gb3Var.a;
            if (map.containsKey(s2VarA)) {
                jb3 jb3Var = (jb3) ((Map) map.get(s2VarA)).get(str);
                sq0 sq0Var = gb3Var.c;
                gb3Var.g.getClass();
                sq0Var.y("pgc", System.currentTimeMillis(), str, jb3Var == null ? null : jb3Var.e.f, s2VarA, jb3Var == null ? -1 : jb3Var.e.i, jb3Var != null ? jb3Var.m() : -1, 1);
                if (jb3Var != null) {
                    return jb3Var.e;
                }
            }
            return null;
        }
    }

    @Override // defpackage.kh2
    public final void f1(s62 s62Var) {
    }
}
