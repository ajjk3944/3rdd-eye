package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import f4.InterfaceFutureC2326a;
import j$.util.Objects;
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
import java.util.concurrent.Callable;
import org.json.JSONObject;
import q2.C2841s;
import t2.AbstractC2907C;
import u2.C2951a;

/* renamed from: com.google.android.gms.internal.ads.yp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC2196yp extends B7 implements InterfaceC1430ke {

    /* renamed from: a, reason: collision with root package name */
    public final Context f17767a;

    /* renamed from: b, reason: collision with root package name */
    public final ID f17768b;

    /* renamed from: c, reason: collision with root package name */
    public final Rx f17769c;

    /* renamed from: d, reason: collision with root package name */
    public final C0710Rh f17770d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayDeque f17771e;

    /* renamed from: f, reason: collision with root package name */
    public final Yu f17772f;

    public BinderC2196yp(Context context, ID id, W9 w9, C0710Rh c0710Rh, Rx rx, ArrayDeque arrayDeque, Yu yu) {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
        H9.a(context);
        this.f17767a = context;
        this.f17768b = id;
        this.f17769c = rx;
        this.f17770d = c0710Rh;
        this.f17771e = arrayDeque;
        this.f17772f = yu;
    }

    public static Ju O3(Ju ju, Mu mu, C0416Ac c0416Ac, Xu xu, Su su) {
        C0450Cc c0450CcA = c0416Ac.a("AFMA_getAdDictionary", AbstractC0709Rg.f10928l, C1437kl.f15249J);
        C1476lN.x(ju, su);
        Ju juU = mu.a(ju, Ku.BUILD_URL).i(c0450CcA).u();
        if (!((Boolean) AbstractC1049da.f13768c.v()).booleanValue()) {
            return juU;
        }
        AbstractC2221zD abstractC2221zDR = AbstractC2221zD.r(juU);
        Vu vu = new Vu(xu, su);
        abstractC2221zDR.a(new CD(abstractC2221zDR, 0, vu), AbstractC0640Nf.f10011g);
        return juU;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1430ke
    public final void D0(C1807re c1807re, InterfaceC1646oe interfaceC1646oe) {
        Bundle bundle;
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8565B2)).booleanValue() && (bundle = c1807re.f16587m) != null) {
            A.f.r(p2.j.f22785C.f22797k, bundle, "service-connected");
        }
        Ju juK3 = K3(c1807re, Binder.getCallingUid());
        P3(juK3, interfaceC1646oe, c1807re);
        if (((Boolean) AbstractC1372ja.i.v()).booleanValue()) {
            Rx rx = this.f17769c;
            Objects.requireNonNull(rx);
            juK3.a(new RunnableC2142xp(rx, 1), this.f17768b);
        }
    }

    @Override // com.google.android.gms.internal.ads.B7
    public final boolean J3(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC1646oe c1538me = null;
        C1700pe c1700pe = null;
        InterfaceC1646oe c1538me2 = null;
        InterfaceC1646oe c1538me3 = null;
        InterfaceC1646oe c1538me4 = null;
        switch (i) {
            case 1:
                C7.f(parcel);
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                    if (iInterfaceQueryLocalInterface instanceof InterfaceC1484le) {
                    }
                }
                C7.f(parcel);
                parcel2.writeNoException();
                return true;
            case 3:
            default:
                return false;
            case 4:
                C1807re c1807re = (C1807re) C7.b(parcel, C1807re.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    c1538me = iInterfaceQueryLocalInterface2 instanceof InterfaceC1646oe ? (InterfaceC1646oe) iInterfaceQueryLocalInterface2 : new C1538me(strongBinder2);
                }
                C7.f(parcel);
                D0(c1807re, c1538me);
                parcel2.writeNoException();
                return true;
            case 5:
                C1807re c1807re2 = (C1807re) C7.b(parcel, C1807re.CREATOR);
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    c1538me4 = iInterfaceQueryLocalInterface3 instanceof InterfaceC1646oe ? (InterfaceC1646oe) iInterfaceQueryLocalInterface3 : new C1538me(strongBinder3);
                }
                C7.f(parcel);
                M1(c1807re2, c1538me4);
                parcel2.writeNoException();
                return true;
            case 6:
                C1807re c1807re3 = (C1807re) C7.b(parcel, C1807re.CREATOR);
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    c1538me3 = iInterfaceQueryLocalInterface4 instanceof InterfaceC1646oe ? (InterfaceC1646oe) iInterfaceQueryLocalInterface4 : new C1538me(strongBinder4);
                }
                C7.f(parcel);
                r1(c1807re3, c1538me3);
                parcel2.writeNoException();
                return true;
            case 7:
                String string = parcel.readString();
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    c1538me2 = iInterfaceQueryLocalInterface5 instanceof InterfaceC1646oe ? (InterfaceC1646oe) iInterfaceQueryLocalInterface5 : new C1538me(strongBinder5);
                }
                C7.f(parcel);
                v3(string, c1538me2);
                parcel2.writeNoException();
                return true;
            case 8:
                C1324ie c1324ie = (C1324ie) C7.b(parcel, C1324ie.CREATOR);
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
                    c1700pe = iInterfaceQueryLocalInterface6 instanceof C1700pe ? (C1700pe) iInterfaceQueryLocalInterface6 : new C1700pe(strongBinder6, "com.google.android.gms.ads.internal.request.ITrustlessTokenListener", 2);
                }
                C7.f(parcel);
                if (((Boolean) AbstractC2073wa.f17446a.v()).booleanValue()) {
                    this.f17770d.getClass();
                    String str = c1324ie.f14731a;
                    ED ed = ED.f7928b;
                    ed.a(new CD(ed, 0, new C0697Ql(this, c1700pe, c1324ie)), AbstractC0640Nf.f10011g);
                } else {
                    try {
                        Parcel parcelH0 = c1700pe.h0();
                        parcelH0.writeString("");
                        C7.c(parcelH0, c1324ie);
                        c1700pe.I0(parcelH0, 1);
                    } catch (RemoteException e6) {
                        AbstractC2907C.n("Service can't call client", e6);
                    }
                }
                parcel2.writeNoException();
                return true;
            case 9:
                String string2 = parcel.readString();
                C7.f(parcel);
                s0(string2);
                parcel2.writeNoException();
                return true;
        }
    }

    public final Ju K3(C1807re c1807re, int i) {
        C2034vp c2034vpR3;
        boolean z6;
        Ju juU;
        B9 b9 = B9.f7310f;
        C1431kf c1431kf = p2.j.f22785C.f22804r;
        C2951a c2951aA = C2951a.a();
        Yu yu = this.f17772f;
        Context context = this.f17767a;
        C0416Ac c0416AcA = c1431kf.a(context, c2951aA, yu);
        C0710Rh c0710Rh = this.f17770d;
        c0710Rh.getClass();
        C1431kf c1431kf2 = new C1431kf(c0710Rh.f10986b, new L2.w(i, 9, c1807re));
        C0450Cc c0450CcA = c0416AcA.a("google.afma.response.normalize", C2088wp.f17489d, W9.f12180c);
        Object obj = null;
        if (((Boolean) AbstractC1750qa.f16379a.v()).booleanValue()) {
            c2034vpR3 = R3(c1807re.f16583h);
            if (c2034vpR3 == null) {
                AbstractC2907C.m("Request contained a PoolKey but no matching parameters were found.");
            }
        } else {
            String str = c1807re.f16584j;
            if (str != null && !str.isEmpty()) {
                AbstractC2907C.m("Request contained a PoolKey but split request is disabled.");
            }
            c2034vpR3 = null;
        }
        Su suY = c2034vpR3 == null ? AbstractC1135f5.y(context, 9) : c2034vpR3.f17344d;
        Xu xu = (Xu) ((C1799rN) c1431kf2.f15174c).c();
        xu.b(c1807re.f16576a.getStringArrayList("ad_types"));
        C0463Cp c0463Cp = new C0463Cp(c1807re.f16582g, xu, suY);
        C1338iu c1338iu = new C1338iu(context, c1807re.f16577b.f23784a, obj, 19, false);
        Mu mu = (Mu) ((C1799rN) c1431kf2.f15175d).c();
        Su suY2 = AbstractC1135f5.y(context, 11);
        int i3 = 8;
        Ku ku = Ku.PRE_PROCESS;
        Ku ku2 = Ku.HTTP;
        if (c2034vpR3 == null) {
            C0467Dc c0467Dc = new C0467Dc(c1431kf2, i3, c1807re);
            C1437kl c1437kl = C1437kl.f15248I;
            C1677p8 c1677p8A = mu.a(AbstractC1984ut.e(c1807re.f16576a), Ku.GMS_SIGNALS);
            ID id = mu.f9923a;
            Ju juU2 = c1677p8A.i(c0467Dc).g(c1437kl).u();
            Ju juO3 = O3(juU2, mu, c0416AcA, xu, suY);
            Su suY3 = AbstractC1135f5.y(context, 10);
            List listAsList = Arrays.asList(juO3, juU2);
            CallableC0814Xj callableC0814Xj = new CallableC0814Xj(juO3, c1807re, juU2);
            JB jb = LB.f9635b;
            listAsList.getClass();
            LB lbM = LB.m(listAsList);
            C0623Mf c0623Mf = AbstractC0640Nf.f10011g;
            C2005vD c2005vD = new C2005vD(lbM, true, false);
            c2005vD.f17236D = new C1951uD(c2005vD, b9, c0623Mf);
            c2005vD.v();
            C2005vD c2005vD2 = new C2005vD(lbM, true, false);
            c2005vD2.f17236D = new C1951uD(c2005vD2, callableC0814Xj, id);
            c2005vD2.v();
            Ju juU3 = new C1677p8(mu, ku2, null, c2005vD, listAsList, c2005vD2).g(c0463Cp).g(new Wu(0, suY3)).g(c1338iu).u();
            C1476lN.I(juU3, xu, suY3, false);
            C1476lN.x(juU3, suY2);
            List listAsList2 = Arrays.asList(juU2, juO3, juU3);
            CallableC0647Nm callableC0647Nm = new CallableC0647Nm(c1807re, juU3, juU2, juO3, 1);
            JB jb2 = LB.f9635b;
            listAsList2.getClass();
            LB lbM2 = LB.m(listAsList2);
            C0623Mf c0623Mf2 = AbstractC0640Nf.f10011g;
            C2005vD c2005vD3 = new C2005vD(lbM2, true, false);
            c2005vD3.f17236D = new C1951uD(c2005vD3, b9, c0623Mf2);
            c2005vD3.v();
            C2005vD c2005vD4 = new C2005vD(lbM2, true, false);
            c2005vD4.f17236D = new C1951uD(c2005vD4, callableC0647Nm, id);
            c2005vD4.v();
            juU = new C1677p8(mu, ku, null, c2005vD3, listAsList2, c2005vD4).i(c0450CcA).u();
            z6 = false;
        } else {
            C0446Bp c0446Bp = new C0446Bp(c2034vpR3.f17342b, c2034vpR3.f17341a);
            Su suY4 = AbstractC1135f5.y(context, 10);
            C1677p8 c1677p8G = mu.a(AbstractC1984ut.e(c0446Bp), ku2).g(c0463Cp);
            z6 = false;
            Ju juU4 = c1677p8G.g(new Wu(0, suY4)).g(c1338iu).u();
            C1476lN.I(juU4, xu, suY4, false);
            ED edE = AbstractC1984ut.e(c2034vpR3);
            C1476lN.x(juU4, suY2);
            List listAsList3 = Arrays.asList(juU4, edE);
            CallableC1890t6 callableC1890t6 = new CallableC1890t6(juU4, i3, edE);
            JB jb3 = LB.f9635b;
            listAsList3.getClass();
            LB lbM3 = LB.m(listAsList3);
            C0623Mf c0623Mf3 = AbstractC0640Nf.f10011g;
            C2005vD c2005vD5 = new C2005vD(lbM3, true, false);
            c2005vD5.f17236D = new C1951uD(c2005vD5, b9, c0623Mf3);
            c2005vD5.v();
            ID id2 = mu.f9923a;
            C2005vD c2005vD6 = new C2005vD(lbM3, true, false);
            c2005vD6.f17236D = new C1951uD(c2005vD6, callableC1890t6, id2);
            c2005vD6.v();
            juU = new C1677p8(mu, ku, null, c2005vD5, listAsList3, c2005vD6).i(c0450CcA).u();
        }
        C1476lN.I(juU, xu, suY2, z6);
        return juU;
    }

    public final InterfaceFutureC2326a L3(final C1807re c1807re, int i) {
        if (!((Boolean) AbstractC1750qa.f16379a.v()).booleanValue()) {
            return AbstractC1984ut.w(new Exception("Split request is disabled."));
        }
        C1823ru c1823ru = c1807re.i;
        if (c1823ru == null) {
            return AbstractC1984ut.w(new Exception("Pool configuration missing from request."));
        }
        if (c1823ru.f16639d == 0 || c1823ru.f16640e == 0) {
            return AbstractC1984ut.w(new Exception("Caching is disabled."));
        }
        C1431kf c1431kf = p2.j.f22785C.f22804r;
        C2951a c2951aA = C2951a.a();
        Context context = this.f17767a;
        C0416Ac c0416AcA = c1431kf.a(context, c2951aA, this.f17772f);
        C0710Rh c0710Rh = this.f17770d;
        c0710Rh.getClass();
        C1431kf c1431kf2 = new C1431kf(c0710Rh.f10986b, new L2.w(i, 9, c1807re));
        Mu mu = (Mu) ((C1799rN) c1431kf2.f15175d).c();
        final Ju juU = mu.a(AbstractC1984ut.e(c1807re.f16576a), Ku.GMS_SIGNALS).i(new C0467Dc(c1431kf2, 8, c1807re)).g(C1437kl.f15248I).u();
        Xu xu = (Xu) ((C1799rN) c1431kf2.f15174c).c();
        final Su suY = AbstractC1135f5.y(context, 9);
        final Ju juO3 = O3(juU, mu, c0416AcA, xu, suY);
        List listAsList = Arrays.asList(juU, juO3);
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.up
            @Override // java.util.concurrent.Callable
            public final Object call() {
                BinderC2196yp binderC2196yp = this.f17169a;
                Ju ju = juO3;
                Ju ju2 = juU;
                C1807re c1807re2 = c1807re;
                Su su = suY;
                String str = ((C1861se) ju.f9394c.get()).i;
                C2034vp c2034vp = new C2034vp((C1861se) ju.f9394c.get(), (JSONObject) ju2.f9394c.get(), c1807re2.f16583h, su);
                synchronized (binderC2196yp) {
                    binderC2196yp.Q3();
                    binderC2196yp.f17771e.addLast(c2034vp);
                }
                return new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8));
            }
        };
        JB jb = LB.f9635b;
        listAsList.getClass();
        LB lbM = LB.m(listAsList);
        B9 b9 = B9.f7310f;
        C0623Mf c0623Mf = AbstractC0640Nf.f10011g;
        C2005vD c2005vD = new C2005vD(lbM, true, false);
        c2005vD.f17236D = new C1951uD(c2005vD, b9, c0623Mf);
        c2005vD.v();
        ID id = mu.f9923a;
        C2005vD c2005vD2 = new C2005vD(lbM, true, false);
        c2005vD2.f17236D = new C1951uD(c2005vD2, callable, id);
        c2005vD2.v();
        return new C1677p8(mu, Ku.GET_URL_AND_CACHE_KEY, null, c2005vD, listAsList, c2005vD2).u();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1430ke
    public final void M1(C1807re c1807re, InterfaceC1646oe interfaceC1646oe) {
        Bundle bundle;
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8565B2)).booleanValue() && (bundle = c1807re.f16587m) != null) {
            A.f.r(p2.j.f22785C.f22797k, bundle, "service-connected");
        }
        P3(N3(c1807re, Binder.getCallingUid()), interfaceC1646oe, c1807re);
    }

    public final InterfaceFutureC2326a M3(String str) {
        if (((Boolean) AbstractC1750qa.f16379a.v()).booleanValue()) {
            return R3(str) == null ? AbstractC1984ut.w(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str)))) : AbstractC1984ut.e(new C1926tp());
        }
        return AbstractC1984ut.w(new Exception("Split request is disabled."));
    }

    public final InterfaceFutureC2326a N3(C1807re c1807re, int i) {
        C1431kf c1431kf = p2.j.f22785C.f22804r;
        C2951a c2951aA = C2951a.a();
        Yu yu = this.f17772f;
        Context context = this.f17767a;
        C0416Ac c0416AcA = c1431kf.a(context, c2951aA, yu);
        if (!((Boolean) AbstractC1965ua.f17126a.v()).booleanValue()) {
            return AbstractC1984ut.w(new Exception("Signal collection disabled."));
        }
        C0710Rh c0710Rh = this.f17770d;
        c0710Rh.getClass();
        L2.w wVar = new L2.w(i, 9, c1807re);
        C0710Rh c0710Rh2 = c0710Rh.f10986b;
        C1799rN c1799rNA = C1799rN.a(new C0901aq(c0710Rh2.f11020t, 22));
        C1013ct c1013ct = new C1013ct(wVar, 1);
        C1013ct c1013ct2 = new C1013ct(wVar, 2);
        C1013ct c1013ct3 = new C1013ct(wVar, 3);
        C0540Hh c0540Hh = c0710Rh2.f10995g;
        C1799rN c1799rN = c0710Rh2.f10989d;
        C1381jj c1381jj = new C1381jj(c0540Hh, c1799rN, c1013ct, c1013ct2, c1013ct3, 14);
        C0901aq c0901aq = new C0901aq(c0540Hh, 14);
        C1013ct c1013ct4 = new C1013ct(wVar, 0);
        C1811ri c1811ri = new C1811ri(21, c1013ct4);
        C0902ar c0902ar = new C0902ar(c1799rN, c0540Hh, 8);
        C1122et c1122et = new C1122et(0);
        C1013ct c1013ct5 = new C1013ct(wVar, 5);
        C1013ct c1013ct6 = new C1013ct(wVar, 6);
        C1799rN c1799rN2 = c0710Rh2.f10946B;
        C0663Ol c0663Ol = new C0663Ol(c1799rN2, c1013ct3, c1013ct4, c1799rN, c1013ct5, c1013ct6);
        C1840sA c1840sA = new C1840sA(c1013ct4, c1799rN2, c1799rN, 1);
        C1013ct c1013ct7 = new C1013ct(wVar, 4);
        C1799rN c1799rNA2 = C1799rN.a(AbstractC2022vd.f17302r);
        C1799rN c1799rNA3 = C1799rN.a(AbstractC0933bL.f13367r);
        C1799rN c1799rNA4 = C1799rN.a(AbstractC0709Rg.f10934r);
        C1799rN c1799rNA5 = C1799rN.a(AbstractC1114el.f13936E);
        int i3 = C1961uN.f17115b;
        LinkedHashMap linkedHashMapH = AbstractC0582Jp.H(4);
        Cr.l(c1799rNA2, "provider");
        linkedHashMapH.put(Ku.GMS_SIGNALS, c1799rNA2);
        Cr.l(c1799rNA3, "provider");
        linkedHashMapH.put(Ku.BUILD_URL, c1799rNA3);
        Cr.l(c1799rNA4, "provider");
        linkedHashMapH.put(Ku.HTTP, c1799rNA4);
        Cr.l(c1799rNA5, "provider");
        linkedHashMapH.put(Ku.PRE_PROCESS, c1799rNA5);
        C1799rN c1799rNA6 = C1799rN.a(new C1271hf(c1013ct7, c0710Rh2.f10995g, new C1961uN(linkedHashMapH), 11));
        int i6 = C2123xN.f17584c;
        List list = Collections.EMPTY_LIST;
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(c1799rNA6);
        C1799rN c1799rNA7 = C1799rN.a(new C1768qs(c0710Rh2.f10989d, new C1329ik(new C2123xN(list, arrayList), 25), 10));
        C1799rN c1799rN3 = c0710Rh2.f10972O0;
        Context context2 = c0710Rh2.f10984a.f7822b;
        Cr.v(context2);
        Object objC = c1799rN3.c();
        C0623Mf c0623Mf = AbstractC0640Nf.f10005a;
        Cr.v(c0623Mf);
        String string = ((C1807re) wVar.f2570c).f16576a.getString("ms");
        if (string == null) {
            string = "";
        }
        Yr yr = new Yr(c0623Mf, 6, string);
        C0623Mf c0623Mf2 = AbstractC0640Nf.f10005a;
        Cr.v(c0623Mf2);
        List list2 = c1807re.f16580e;
        Cr.v(list2);
        Yr yr2 = new Yr(c0623Mf2, 7, list2);
        InterfaceC1692pN interfaceC1692pNB = C1799rN.b(c1381jj);
        InterfaceC1692pN interfaceC1692pNB2 = C1799rN.b(c0901aq);
        C1799rN.b(c1811ri);
        InterfaceC1692pN interfaceC1692pNB3 = C1799rN.b(c0902ar);
        InterfaceC1692pN interfaceC1692pNB4 = C1799rN.b(c1122et);
        C1799rN.b(c0663Ol);
        InterfaceC1692pN interfaceC1692pNB5 = C1799rN.b(c1840sA);
        Cr.v(c0623Mf2);
        Xu xu = (Xu) c1799rNA.c();
        C0784Vn c0784Vn = (C0784Vn) c0710Rh2.f11000j.c();
        HashSet hashSet = new HashSet();
        hashSet.add((Ys) objC);
        hashSet.add(yr);
        hashSet.add(yr2);
        E9 e9 = H9.C6;
        G9 g9 = C2841s.f23267e.f23270c;
        if (((Boolean) g9.a(e9)).booleanValue()) {
            hashSet.add((Ms) interfaceC1692pNB.c());
        }
        if (((Boolean) g9.a(H9.D6)).booleanValue()) {
            hashSet.add((Ms) interfaceC1692pNB2.c());
        }
        if (((Boolean) g9.a(H9.F6)).booleanValue()) {
            hashSet.add((Ms) interfaceC1692pNB3.c());
        }
        if (((Boolean) g9.a(H9.G6)).booleanValue()) {
            hashSet.add((Ms) interfaceC1692pNB4.c());
        }
        if (((Boolean) g9.a(H9.f8604H3)).booleanValue()) {
            hashSet.add((Ms) interfaceC1692pNB5.c());
        }
        Ps ps = new Ps(context2, c0623Mf2, hashSet, xu, c0784Vn);
        C0450Cc c0450CcA = c0416AcA.a("google.afma.request.getSignals", AbstractC0709Rg.f10928l, W9.f12180c);
        Su suY = AbstractC1135f5.y(context, 22);
        Mu mu = (Mu) c1799rNA7.c();
        Bundle bundle = c1807re.f16576a;
        C1677p8 c1677p8I = mu.a(AbstractC1984ut.e(bundle), Ku.GET_SIGNALS).g(new Wu(0, suY)).i(new C0467Dc(ps, 9, c1807re));
        Ju juU = ((Mu) c1677p8I.f16142f).a(c1677p8I.u(), Ku.JS_SIGNALS).i(c0450CcA).u();
        Xu xu2 = (Xu) c1799rNA.c();
        xu2.b(bundle.getStringArrayList("ad_types"));
        xu2.d(bundle.getBundle("extras"));
        C1476lN.I(juU, xu2, suY, true);
        if (((Boolean) AbstractC1372ja.f14958j.v()).booleanValue()) {
            Rx rx = this.f17769c;
            Objects.requireNonNull(rx);
            juU.a(new RunnableC2142xp(rx, 0), this.f17768b);
        }
        return juU;
    }

    public final void P3(InterfaceFutureC2326a interfaceFutureC2326a, InterfaceC1646oe interfaceC1646oe, C1807re c1807re) {
        C1306iD c1306iDF = AbstractC1984ut.F(interfaceFutureC2326a, new C1704pi(7), AbstractC0640Nf.f10005a);
        C0889ae c0889ae = new C0889ae(this, c1807re, interfaceC1646oe, 24);
        c1306iDF.a(new CD(c1306iDF, 0, c0889ae), AbstractC0640Nf.f10011g);
    }

    public final synchronized void Q3() {
        int iIntValue = ((Long) AbstractC1750qa.f16380b.v()).intValue();
        while (true) {
            ArrayDeque arrayDeque = this.f17771e;
            if (arrayDeque.size() >= iIntValue) {
                arrayDeque.removeFirst();
            }
        }
    }

    public final synchronized C2034vp R3(String str) {
        Iterator it = this.f17771e.iterator();
        while (it.hasNext()) {
            C2034vp c2034vp = (C2034vp) it.next();
            if (c2034vp.f17343c.equals(str)) {
                it.remove();
                return c2034vp;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1430ke
    public final void r1(C1807re c1807re, InterfaceC1646oe interfaceC1646oe) {
        P3(L3(c1807re, Binder.getCallingUid()), interfaceC1646oe, c1807re);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1430ke
    public final void s0(String str) {
        C0429Ap c0429ApT;
        Binder.getCallingUid();
        E9 e9 = H9.of;
        C2841s c2841s = C2841s.f23267e;
        if (((Boolean) c2841s.f23270c.a(e9)).booleanValue()) {
            String str2 = (String) c2841s.f23270c.a(H9.pf);
            if (str2.isEmpty()) {
                return;
            }
            C1448kw c1448kwF = C1448kw.f(new MA(','));
            AbstractC2907C.m("AdRequestServiceImpl: Preconnecting");
            Iterator itE = ((YA) c1448kwF.f15314b).e(c1448kwF, str2);
            do {
                XA xa = (XA) itE;
                if (!xa.hasNext()) {
                    return;
                }
                String str3 = (String) xa.next();
                Context context = this.f17767a;
                C1338iu c1338iu = new C1338iu(context, str, "HEAD", 19, false);
                HashMap map = new HashMap();
                map.put("User-Agent", p2.j.f22785C.f22790c.F(context, str));
                try {
                    c0429ApT = c1338iu.t(new C2250zp(str3, 30000, map, new byte[0], ""));
                } catch (Exception e6) {
                    throw new RemoteException(e6.getMessage());
                }
            } while (c0429ApT.f7048a == 200);
            int i = c0429ApT.f7048a;
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 32);
            sb.append("Unexpected preconnect response: ");
            sb.append(i);
            throw new RemoteException(sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1430ke
    public final void v3(String str, InterfaceC1646oe interfaceC1646oe) {
        P3(M3(str), interfaceC1646oe, null);
    }
}
