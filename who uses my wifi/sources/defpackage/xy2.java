package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class xy2 extends hv1 implements y92 {
    public final Context f;
    public final pq3 g;
    public final zs1 h;
    public final th2 i;
    public final ArrayDeque j;
    public final ea3 k;

    public xy2(Context context, pq3 pq3Var, ts0 ts0Var, th2 th2Var, zs1 zs1Var, ArrayDeque arrayDeque, ea3 ea3Var) {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
        mz1.a(context);
        this.f = context;
        this.g = pq3Var;
        this.h = zs1Var;
        this.i = th2Var;
        this.j = arrayDeque;
        this.k = ea3Var;
    }

    public static q93 F3(q93 q93Var, u93 u93Var, i62 i62Var, da3 da3Var, aa3 aa3Var) {
        k62 k62VarA = i62Var.a("AFMA_getAdDictionary", h62.b, su2.h);
        qb1.C(q93Var, aa3Var);
        q93 q93VarA = u93Var.a(q93Var, s93.l).s(k62VarA).A();
        if (!((Boolean) n02.c.w()).booleanValue()) {
            return q93VarA;
        }
        gq3 gq3VarR = gq3.r(q93VarA);
        lv2 lv2Var = new lv2(da3Var, aa3Var, 7);
        gq3VarR.c(new jq3(gq3VarR, lv2Var, 0), md2.g);
        return q93VarA;
    }

    @Override // defpackage.hv1
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        da2 z92Var = null;
        ea2 ea2Var = null;
        da2 z92Var2 = null;
        da2 z92Var3 = null;
        da2 z92Var4 = null;
        switch (i) {
            case 1:
                iv1.f(parcel);
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                }
                iv1.f(parcel);
                parcel2.writeNoException();
                return true;
            case 3:
            default:
                return false;
            case 4:
                fa2 fa2Var = (fa2) iv1.b(parcel, fa2.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    z92Var = iInterfaceQueryLocalInterface instanceof da2 ? (da2) iInterfaceQueryLocalInterface : new z92(strongBinder2);
                }
                iv1.f(parcel);
                k1(fa2Var, z92Var);
                parcel2.writeNoException();
                return true;
            case 5:
                fa2 fa2Var2 = (fa2) iv1.b(parcel, fa2.CREATOR);
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    z92Var4 = iInterfaceQueryLocalInterface2 instanceof da2 ? (da2) iInterfaceQueryLocalInterface2 : new z92(strongBinder3);
                }
                iv1.f(parcel);
                x0(fa2Var2, z92Var4);
                parcel2.writeNoException();
                return true;
            case 6:
                fa2 fa2Var3 = (fa2) iv1.b(parcel, fa2.CREATOR);
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    z92Var3 = iInterfaceQueryLocalInterface3 instanceof da2 ? (da2) iInterfaceQueryLocalInterface3 : new z92(strongBinder4);
                }
                iv1.f(parcel);
                Q2(fa2Var3, z92Var3);
                parcel2.writeNoException();
                return true;
            case 7:
                String string = parcel.readString();
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    z92Var2 = iInterfaceQueryLocalInterface4 instanceof da2 ? (da2) iInterfaceQueryLocalInterface4 : new z92(strongBinder5);
                }
                iv1.f(parcel);
                n3(string, z92Var2);
                parcel2.writeNoException();
                return true;
            case 8:
                w92 w92Var = (w92) iv1.b(parcel, w92.CREATOR);
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
                    ea2Var = iInterfaceQueryLocalInterface5 instanceof ea2 ? (ea2) iInterfaceQueryLocalInterface5 : new ea2(strongBinder6, "com.google.android.gms.ads.internal.request.ITrustlessTokenListener", 2);
                }
                iv1.f(parcel);
                if (((Boolean) k12.a.w()).booleanValue()) {
                    this.i.getClass();
                    String str = w92Var.f;
                    lq3 lq3Var = lq3.g;
                    lq3Var.c(new jq3(lq3Var, new mr2(this, ea2Var, w92Var), 0), md2.g);
                } else {
                    try {
                        Parcel parcelU = ea2Var.U();
                        parcelU.writeString("");
                        iv1.c(parcelU, w92Var);
                        ea2Var.M0(parcelU, 1);
                    } catch (RemoteException unused) {
                        gi2.R();
                    }
                }
                parcel2.writeNoException();
                return true;
            case 9:
                String string2 = parcel.readString();
                iv1.f(parcel);
                q0(string2);
                parcel2.writeNoException();
                return true;
        }
    }

    public final q93 B3(fa2 fa2Var, int i) {
        sy2 sy2VarH3;
        boolean z;
        q93 q93VarA;
        gz1 gz1Var = gz1.f;
        p21 p21Var = hg4.C.r;
        e51 e51VarA = e51.a();
        ea3 ea3Var = this.k;
        Context context = this.f;
        i62 i62VarZ = p21Var.z(context, e51VarA, ea3Var);
        th2 th2Var = this.i;
        th2Var.getClass();
        p21 p21Var2 = new p21(th2Var.b, new t3(fa2Var, i, 13));
        k62 k62VarA = i62VarZ.a("google.afma.response.normalize", ty2.d, h62.c);
        Object obj = null;
        if (((Boolean) d12.a.w()).booleanValue()) {
            sy2VarH3 = H3(fa2Var.m);
            if (sy2VarH3 == null) {
                gi2.G("Request contained a PoolKey but no matching parameters were found.");
            }
        } else {
            String str = fa2Var.o;
            if (str != null && !str.isEmpty()) {
                gi2.G("Request contained a PoolKey but split request is disabled.");
            }
            sy2VarH3 = null;
        }
        int i2 = 9;
        aa3 aa3VarL = sy2VarH3 == null ? aa3.l(context, 9) : sy2VarH3.d;
        da3 da3Var = (da3) ((ba4) p21Var2.h).d();
        da3Var.b(fa2Var.f.getStringArrayList("ad_types"));
        bz2 bz2Var = new bz2(fa2Var.l, da3Var, aa3VarL);
        xb4 xb4Var = new xb4(context, fa2Var.g.f, obj, 25);
        u93 u93Var = (u93) ((ba4) p21Var2.i).d();
        aa3 aa3VarL2 = aa3.l(context, 11);
        s93 s93Var = s93.n;
        s93 s93Var2 = s93.m;
        if (sy2VarH3 == null) {
            z02 z02Var = new z02(p21Var2, fa2Var, i2);
            tv2 tv2Var = tv2.h;
            bu1 bu1VarA = u93Var.a(pu1.r(fa2Var.f), s93.k);
            pq3 pq3Var = u93Var.a;
            q93 q93VarA2 = bu1VarA.s(z02Var).q(tv2Var).A();
            q93 q93VarF3 = F3(q93VarA2, u93Var, i62VarZ, da3Var, aa3VarL);
            aa3 aa3VarL3 = aa3.l(context, 10);
            List listAsList = Arrays.asList(q93VarF3, q93VarA2);
            yi1 yi1Var = new yi1(q93VarF3, fa2Var, q93VarA2, 4);
            vm3 vm3Var = xm3.g;
            listAsList.getClass();
            xm3 xm3VarM = xm3.m(listAsList);
            ld2 ld2Var = md2.g;
            cq3 cq3Var = new cq3(xm3VarM, true, false);
            cq3Var.u = new bq3(cq3Var, gz1Var, ld2Var);
            cq3Var.v();
            cq3 cq3Var2 = new cq3(xm3VarM, true, false);
            cq3Var2.u = new bq3(cq3Var2, yi1Var, pq3Var);
            cq3Var2.v();
            q93 q93VarA3 = new bu1(u93Var, s93Var2, null, cq3Var, listAsList, cq3Var2).q(bz2Var).q(new of3(25, aa3VarL3)).q(xb4Var).A();
            qb1.P(q93VarA3, da3Var, aa3VarL3, false);
            qb1.C(q93VarA3, aa3VarL2);
            List listAsList2 = Arrays.asList(q93VarA2, q93VarF3, q93VarA3);
            bt2 bt2Var = new bt2(fa2Var, q93VarA3, q93VarA2, q93VarF3, 1);
            vm3 vm3Var2 = xm3.g;
            listAsList2.getClass();
            xm3 xm3VarM2 = xm3.m(listAsList2);
            ld2 ld2Var2 = md2.g;
            cq3 cq3Var3 = new cq3(xm3VarM2, true, false);
            cq3Var3.u = new bq3(cq3Var3, gz1Var, ld2Var2);
            cq3Var3.v();
            cq3 cq3Var4 = new cq3(xm3VarM2, true, false);
            cq3Var4.u = new bq3(cq3Var4, bt2Var, pq3Var);
            cq3Var4.v();
            q93VarA = new bu1(u93Var, s93Var, null, cq3Var3, listAsList2, cq3Var4).s(k62VarA).A();
            z = false;
        } else {
            az2 az2Var = new az2(sy2VarH3.b, sy2VarH3.a);
            aa3 aa3VarL4 = aa3.l(context, 10);
            q93 q93VarA4 = u93Var.a(pu1.r(az2Var), s93Var2).q(bz2Var).q(new of3(25, aa3VarL4)).q(xb4Var).A();
            z = false;
            qb1.P(q93VarA4, da3Var, aa3VarL4, false);
            lq3 lq3VarR = pu1.r(sy2VarH3);
            qb1.C(q93VarA4, aa3VarL2);
            List listAsList3 = Arrays.asList(q93VarA4, lq3VarR);
            gs1 gs1Var = new gs1(q93VarA4, lq3VarR, 10);
            vm3 vm3Var3 = xm3.g;
            listAsList3.getClass();
            xm3 xm3VarM3 = xm3.m(listAsList3);
            ld2 ld2Var3 = md2.g;
            cq3 cq3Var5 = new cq3(xm3VarM3, true, false);
            cq3Var5.u = new bq3(cq3Var5, gz1Var, ld2Var3);
            cq3Var5.v();
            pq3 pq3Var2 = u93Var.a;
            cq3 cq3Var6 = new cq3(xm3VarM3, true, false);
            cq3Var6.u = new bq3(cq3Var6, gs1Var, pq3Var2);
            cq3Var6.v();
            q93VarA = new bu1(u93Var, s93Var, null, cq3Var5, listAsList3, cq3Var6).s(k62VarA).A();
        }
        qb1.P(q93VarA, da3Var, aa3VarL2, z);
        return q93VarA;
    }

    public final n70 C3(final fa2 fa2Var, int i) {
        if (!((Boolean) d12.a.w()).booleanValue()) {
            return pu1.B(new Exception("Split request is disabled."));
        }
        d93 d93Var = fa2Var.n;
        if (d93Var == null) {
            return pu1.B(new Exception("Pool configuration missing from request."));
        }
        if (d93Var.i == 0 || d93Var.j == 0) {
            return pu1.B(new Exception("Caching is disabled."));
        }
        p21 p21Var = hg4.C.r;
        e51 e51VarA = e51.a();
        Context context = this.f;
        i62 i62VarZ = p21Var.z(context, e51VarA, this.k);
        th2 th2Var = this.i;
        th2Var.getClass();
        p21 p21Var2 = new p21(th2Var.b, new t3(fa2Var, i, 13));
        u93 u93Var = (u93) ((ba4) p21Var2.i).d();
        final q93 q93VarA = u93Var.a(pu1.r(fa2Var.f), s93.k).s(new z02(p21Var2, fa2Var, 9)).q(tv2.h).A();
        da3 da3Var = (da3) ((ba4) p21Var2.h).d();
        final aa3 aa3VarL = aa3.l(context, 9);
        final q93 q93VarF3 = F3(q93VarA, u93Var, i62VarZ, da3Var, aa3VarL);
        List listAsList = Arrays.asList(q93VarA, q93VarF3);
        Callable callable = new Callable() { // from class: ry2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                xy2 xy2Var = this.a;
                q93 q93Var = q93VarF3;
                q93 q93Var2 = q93VarA;
                fa2 fa2Var2 = fa2Var;
                aa3 aa3Var = aa3VarL;
                String str = ((ga2) q93Var.h.get()).i;
                sy2 sy2Var = new sy2((ga2) q93Var.h.get(), (JSONObject) q93Var2.h.get(), fa2Var2.m, aa3Var);
                synchronized (xy2Var) {
                    synchronized (xy2Var) {
                        int iIntValue = ((Long) d12.b.w()).intValue();
                        while (true) {
                            ArrayDeque arrayDeque = xy2Var.j;
                            if (arrayDeque.size() >= iIntValue) {
                                arrayDeque.removeFirst();
                            }
                        }
                    }
                    return new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8));
                }
                xy2Var.j.addLast(sy2Var);
                return new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8));
            }
        };
        vm3 vm3Var = xm3.g;
        listAsList.getClass();
        xm3 xm3VarM = xm3.m(listAsList);
        gz1 gz1Var = gz1.f;
        ld2 ld2Var = md2.g;
        cq3 cq3Var = new cq3(xm3VarM, true, false);
        cq3Var.u = new bq3(cq3Var, gz1Var, ld2Var);
        cq3Var.v();
        pq3 pq3Var = u93Var.a;
        cq3 cq3Var2 = new cq3(xm3VarM, true, false);
        cq3Var2.u = new bq3(cq3Var2, callable, pq3Var);
        cq3Var2.v();
        return new bu1(u93Var, s93.B, null, cq3Var, listAsList, cq3Var2).A();
    }

    public final n70 D3(String str) {
        if (((Boolean) d12.a.w()).booleanValue()) {
            return H3(str) == null ? pu1.B(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str)))) : pu1.r(new qy2());
        }
        return pu1.B(new Exception("Split request is disabled."));
    }

    public final n70 E3(fa2 fa2Var, int i) {
        p21 p21Var = hg4.C.r;
        e51 e51VarA = e51.a();
        ea3 ea3Var = this.k;
        Context context = this.f;
        i62 i62VarZ = p21Var.z(context, e51VarA, ea3Var);
        if (!((Boolean) i12.a.w()).booleanValue()) {
            return pu1.B(new Exception("Signal collection disabled."));
        }
        th2 th2Var = this.i;
        th2Var.getClass();
        t3 t3Var = new t3(fa2Var, i, 13);
        th2 th2Var2 = th2Var.b;
        ba4 ba4VarA = ba4.a(new u43(th2Var2.t, 9));
        n63 n63Var = new n63(t3Var, 1);
        n63 n63Var2 = new n63(t3Var, 2);
        n63 n63Var3 = new n63(t3Var, 3);
        hh2 hh2Var = th2Var2.g;
        ba4 ba4Var = th2Var2.d;
        ic2 ic2Var = new ic2(hh2Var, ba4Var, n63Var, n63Var2, n63Var3, 17);
        u43 u43Var = new u43(hh2Var, 5);
        n63 n63Var4 = new n63(t3Var, 0);
        u12 u12Var = new u12(22, n63Var4);
        qk2 qk2Var = new qk2(ba4Var, hh2Var, 10);
        p63 p63Var = new p63(0);
        n63 n63Var5 = new n63(t3Var, 5);
        n63 n63Var6 = new n63(t3Var, 6);
        ba4 ba4Var2 = th2Var2.U;
        ar2 ar2Var = new ar2(ba4Var2, n63Var3, n63Var4, ba4Var, n63Var5, n63Var6);
        wb2 wb2Var = new wb2(n63Var4, ba4Var2, ba4Var, 28);
        n63 n63Var7 = new n63(t3Var, 4);
        ba4 ba4VarA2 = ba4.a(qb1.s);
        ba4 ba4VarA3 = ba4.a(zt0.l);
        ba4 ba4VarA4 = ba4.a(i41.s);
        ba4 ba4VarA5 = ba4.a(ob1.m);
        int i2 = ea4.b;
        LinkedHashMap linkedHashMapF = qb1.F(4);
        linkedHashMapF.put(s93.k, ba4VarA2);
        linkedHashMapF.put(s93.l, ba4VarA3);
        linkedHashMapF.put(s93.m, ba4VarA4);
        linkedHashMapF.put(s93.n, ba4VarA5);
        ba4 ba4VarA6 = ba4.a(new wb2(n63Var7, th2Var2.g, new ea4(linkedHashMapF), 10));
        int i3 = ha4.c;
        List list = Collections.EMPTY_LIST;
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(ba4VarA6);
        ba4 ba4VarA7 = ba4.a(new k43(th2Var2.d, new tm2(new ha4(list, arrayList), 25)));
        ba4 ba4Var3 = th2Var2.O0;
        Context context2 = th2Var2.a.b;
        i41.M(context2);
        Object objD = ba4Var3.d();
        ld2 ld2Var = md2.a;
        i41.M(ld2Var);
        String string = ((fa2) t3Var.h).f.getString("ms");
        if (string == null) {
            string = "";
        }
        g33 g33Var = new g33(ld2Var, string, 7);
        ld2 ld2Var2 = md2.a;
        i41.M(ld2Var2);
        List list2 = fa2Var.j;
        i41.M(list2);
        g33 g33Var2 = new g33(ld2Var2, list2, 8);
        z94 z94VarB = ba4.b(ic2Var);
        z94 z94VarB2 = ba4.b(u43Var);
        ba4.b(u12Var);
        z94 z94VarB3 = ba4.b(qk2Var);
        z94 z94VarB4 = ba4.b(p63Var);
        ba4.b(ar2Var);
        z94 z94VarB5 = ba4.b(wb2Var);
        i41.M(ld2Var2);
        da3 da3Var = (da3) ba4VarA.d();
        mv2 mv2Var = (mv2) th2Var2.j.d();
        HashSet hashSet = new HashSet();
        hashSet.add((e63) objD);
        hashSet.add(g33Var);
        hashSet.add(g33Var2);
        iz1 iz1Var = mz1.i6;
        kz1 kz1Var = tw1.e.c;
        if (((Boolean) kz1Var.a(iz1Var)).booleanValue()) {
            hashSet.add((q53) z94VarB.d());
        }
        if (((Boolean) kz1Var.a(mz1.j6)).booleanValue()) {
            hashSet.add((q53) z94VarB2.d());
        }
        if (((Boolean) kz1Var.a(mz1.l6)).booleanValue()) {
            hashSet.add((q53) z94VarB3.d());
        }
        if (((Boolean) kz1Var.a(mz1.m6)).booleanValue()) {
            hashSet.add((q53) z94VarB4.d());
        }
        if (((Boolean) kz1Var.a(mz1.q3)).booleanValue()) {
            hashSet.add((q53) z94VarB5.d());
        }
        s53 s53Var = new s53(context2, ld2Var2, hashSet, da3Var, mv2Var);
        k62 k62VarA = i62VarZ.a("google.afma.request.getSignals", h62.b, h62.c);
        aa3 aa3VarL = aa3.l(context, 22);
        u93 u93Var = (u93) ba4VarA7.d();
        Bundle bundle = fa2Var.f;
        bu1 bu1VarS = u93Var.a(pu1.r(bundle), s93.o).q(new of3(25, aa3VarL)).s(new z02(s53Var, fa2Var, 10));
        q93 q93VarA = ((u93) bu1VarS.l).a(bu1VarS.A(), s93.p).s(k62VarA).A();
        da3 da3Var2 = (da3) ba4VarA.d();
        da3Var2.b(bundle.getStringArrayList("ad_types"));
        da3Var2.d(bundle.getBundle("extras"));
        qb1.P(q93VarA, da3Var2, aa3VarL, true);
        if (((Boolean) s02.h.w()).booleanValue()) {
            zs1 zs1Var = this.h;
            Objects.requireNonNull(zs1Var);
            q93VarA.c(new uy2(zs1Var, 0), this.g);
        }
        return q93VarA;
    }

    public final void G3(n70 n70Var, da2 da2Var, fa2 fa2Var) {
        qp3 qp3VarO = pu1.O(n70Var, new fi1(8), md2.a);
        lv2 lv2Var = new lv2(this, fa2Var, da2Var, 1);
        qp3VarO.c(new jq3(qp3VarO, lv2Var, 0), md2.g);
    }

    public final synchronized sy2 H3(String str) {
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            sy2 sy2Var = (sy2) it.next();
            if (sy2Var.c.equals(str)) {
                it.remove();
                return sy2Var;
            }
        }
        return null;
    }

    @Override // defpackage.y92
    public final void Q2(fa2 fa2Var, da2 da2Var) {
        G3(C3(fa2Var, Binder.getCallingUid()), da2Var, fa2Var);
    }

    @Override // defpackage.y92
    public final void k1(fa2 fa2Var, da2 da2Var) {
        Bundle bundle;
        if (((Boolean) tw1.e.c.a(mz1.m2)).booleanValue() && (bundle = fa2Var.r) != null) {
            ga1.n(hg4.C.k, bundle, "service-connected");
        }
        q93 q93VarB3 = B3(fa2Var, Binder.getCallingUid());
        G3(q93VarB3, da2Var, fa2Var);
        if (((Boolean) s02.g.w()).booleanValue()) {
            zs1 zs1Var = this.h;
            Objects.requireNonNull(zs1Var);
            q93VarB3.c(new uy2(zs1Var, 1), this.g);
        }
    }

    @Override // defpackage.y92
    public final void n3(String str, da2 da2Var) {
        G3(D3(str), da2Var, null);
    }

    @Override // defpackage.y92
    public final void q0(String str) throws RemoteException {
        zy2 zy2VarC;
        Binder.getCallingUid();
        iz1 iz1Var = mz1.Ee;
        tw1 tw1Var = tw1.e;
        if (((Boolean) tw1Var.c.a(iz1Var)).booleanValue()) {
            String str2 = (String) tw1Var.c.a(mz1.Fe);
            if (str2.isEmpty()) {
                return;
            }
            sq0 sq0VarP = sq0.p(new yk3(','));
            gi2.G("AdRequestServiceImpl: Preconnecting");
            Iterator itD = ((kl3) sq0VarP.g).d(sq0VarP, str2);
            do {
                jl3 jl3Var = (jl3) itD;
                if (!jl3Var.hasNext()) {
                    return;
                }
                String str3 = (String) jl3Var.next();
                Context context = this.f;
                xb4 xb4Var = new xb4(context, str, "HEAD", 25);
                HashMap map = new HashMap();
                map.put("User-Agent", hg4.C.c.D(context, str));
                try {
                    zy2VarC = xb4Var.C(new yy2(str3, 30000, map, new byte[0], ""));
                } catch (Exception e) {
                    throw new RemoteException(e.getMessage());
                }
            } while (zy2VarC.a == 200);
            int i = zy2VarC.a;
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 32);
            sb.append("Unexpected preconnect response: ");
            sb.append(i);
            throw new RemoteException(sb.toString());
        }
    }

    @Override // defpackage.y92
    public final void x0(fa2 fa2Var, da2 da2Var) {
        Bundle bundle;
        if (((Boolean) tw1.e.c.a(mz1.m2)).booleanValue() && (bundle = fa2Var.r) != null) {
            ga1.n(hg4.C.k, bundle, "service-connected");
        }
        G3(E3(fa2Var, Binder.getCallingUid()), da2Var, fa2Var);
    }
}
