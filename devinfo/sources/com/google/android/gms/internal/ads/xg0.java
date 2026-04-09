package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
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

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class xg0 extends mg implements bu {

    /* renamed from: a, reason: collision with root package name */
    public final Context f18384a;

    /* renamed from: b, reason: collision with root package name */
    public final w81 f18385b;

    /* renamed from: c, reason: collision with root package name */
    public final ix0 f18386c;

    /* renamed from: d, reason: collision with root package name */
    public final k10 f18387d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayDeque f18388e;

    /* renamed from: f, reason: collision with root package name */
    public final cs0 f18389f;

    public xg0(Context context, w81 w81Var, hl hlVar, k10 k10Var, ix0 ix0Var, ArrayDeque arrayDeque, cs0 cs0Var) {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
        sk.a(context);
        this.f18384a = context;
        this.f18385b = w81Var;
        this.f18386c = ix0Var;
        this.f18387d = k10Var;
        this.f18388e = arrayDeque;
        this.f18389f = cs0Var;
    }

    public static pr0 l4(pr0 pr0Var, sr0 sr0Var, oq oqVar, bs0 bs0Var, yr0 yr0Var) {
        qq qqVarA = oqVar.a("AFMA_getAdDictionary", jz.f12889l, h80.f11763u);
        yr1.w(pr0Var, yr0Var);
        pr0 pr0VarT = sr0Var.a(qr0.BUILD_URL, pr0Var).i(qqVarA).t();
        if (!((Boolean) ol.f14724c.u()).booleanValue()) {
            return pr0VarT;
        }
        n81 n81VarS = n81.s(pr0VarT);
        l90 l90Var = new l90(18, bs0Var, yr0Var);
        n81VarS.a(new q81(0, n81VarS, l90Var), fx.g);
        return pr0VarT;
    }

    @Override // com.google.android.gms.internal.ads.bu
    public final void T3(String str, fu fuVar) {
        m4(j4(str), fuVar, null);
    }

    @Override // com.google.android.gms.internal.ads.bu
    public final void c0(String str) {
        zg0 zg0VarS;
        Binder.getCallingUid();
        pk pkVar = sk.f16297qf;
        va.s sVar = va.s.f36163e;
        if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue()) {
            String str2 = (String) sVar.f36166c.a(sk.f16312rf);
            if (str2.isEmpty()) {
                return;
            }
            rg0 rg0VarK = rg0.k(new y21(','));
            ya.a0.m("AdRequestServiceImpl: Preconnecting");
            Iterator itM = ((k31) rg0VarK.f15651b).m(rg0VarK, str2);
            do {
                j31 j31Var = (j31) itM;
                if (!j31Var.hasNext()) {
                    return;
                }
                String str3 = (String) j31Var.next();
                Context context = this.f18384a;
                String str4 = "HEAD";
                pq0 pq0Var = new pq0(context, str, str4, false, 19);
                HashMap map = new HashMap();
                map.put("User-Agent", ua.j.C.f35261c.F(context, str));
                try {
                    zg0VarS = pq0Var.s(new yg0(str3, 30000, map, new byte[0], ""));
                } catch (Exception e2) {
                    throw new RemoteException(e2.getMessage());
                }
            } while (zg0VarS.f19081a == 200);
            int i4 = zg0VarS.f19081a;
            StringBuilder sb2 = new StringBuilder(String.valueOf(i4).length() + 32);
            sb2.append("Unexpected preconnect response: ");
            sb2.append(i4);
            throw new RemoteException(sb2.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.bu
    public final void c2(iu iuVar, fu fuVar) {
        Bundle bundle;
        if (((Boolean) va.s.f36163e.f36166c.a(sk.B2)).booleanValue() && (bundle = iuVar.f12483m) != null) {
            d.h.D(ua.j.C.f35267k, bundle, "service-connected");
        }
        m4(k4(iuVar, Binder.getCallingUid()), fuVar, iuVar);
    }

    @Override // com.google.android.gms.internal.ads.mg
    public final boolean g4(int i4, Parcel parcel, Parcel parcel2) {
        fu duVar = null;
        gu guVar = null;
        fu duVar2 = null;
        fu duVar3 = null;
        fu duVar4 = null;
        switch (i4) {
            case 1:
                ng.f(parcel);
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                    if (iInterfaceQueryLocalInterface instanceof cu) {
                    }
                }
                ng.f(parcel);
                parcel2.writeNoException();
                return true;
            case 3:
            default:
                return false;
            case 4:
                iu iuVar = (iu) ng.b(parcel, iu.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    duVar = iInterfaceQueryLocalInterface2 instanceof fu ? (fu) iInterfaceQueryLocalInterface2 : new du(strongBinder2);
                }
                ng.f(parcel);
                j0(iuVar, duVar);
                parcel2.writeNoException();
                return true;
            case 5:
                iu iuVar2 = (iu) ng.b(parcel, iu.CREATOR);
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    duVar4 = iInterfaceQueryLocalInterface3 instanceof fu ? (fu) iInterfaceQueryLocalInterface3 : new du(strongBinder3);
                }
                ng.f(parcel);
                c2(iuVar2, duVar4);
                parcel2.writeNoException();
                return true;
            case 6:
                iu iuVar3 = (iu) ng.b(parcel, iu.CREATOR);
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    duVar3 = iInterfaceQueryLocalInterface4 instanceof fu ? (fu) iInterfaceQueryLocalInterface4 : new du(strongBinder4);
                }
                ng.f(parcel);
                o1(iuVar3, duVar3);
                parcel2.writeNoException();
                return true;
            case 7:
                String string = parcel.readString();
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    duVar2 = iInterfaceQueryLocalInterface5 instanceof fu ? (fu) iInterfaceQueryLocalInterface5 : new du(strongBinder5);
                }
                ng.f(parcel);
                T3(string, duVar2);
                parcel2.writeNoException();
                return true;
            case 8:
                zt ztVar = (zt) ng.b(parcel, zt.CREATOR);
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
                    guVar = iInterfaceQueryLocalInterface6 instanceof gu ? (gu) iInterfaceQueryLocalInterface6 : new gu(strongBinder6, "com.google.android.gms.ads.internal.request.ITrustlessTokenListener", 1);
                }
                ng.f(parcel);
                if (((Boolean) hm.f11916a.u()).booleanValue()) {
                    this.f18387d.getClass();
                    String str = ztVar.f19174a;
                    s81 s81Var = s81.f15906b;
                    s81Var.a(new q81(0, s81Var, new ce1(this, guVar, ztVar)), fx.g);
                } else {
                    try {
                        Parcel parcelT = guVar.T();
                        parcelT.writeString("");
                        ng.c(parcelT, ztVar);
                        guVar.g1(parcelT, 1);
                    } catch (RemoteException e2) {
                        ya.a0.n("Service can't call client", e2);
                    }
                }
                parcel2.writeNoException();
                return true;
            case 9:
                String string2 = parcel.readString();
                ng.f(parcel);
                c0(string2);
                parcel2.writeNoException();
                return true;
        }
    }

    public final pr0 h4(iu iuVar, int i4) {
        ug0 ug0VarO4;
        boolean z3;
        pr0 pr0VarT;
        mk mkVar = mk.f13919e;
        aw awVar = ua.j.C.f35274r;
        za.a aVarA = za.a.a();
        cs0 cs0Var = this.f18389f;
        Context context = this.f18384a;
        oq oqVarB = awVar.b(context, aVarA, cs0Var);
        k10 k10Var = this.f18387d;
        k10Var.getClass();
        int i10 = 8;
        aw awVar2 = new aw(k10Var.f12924b, new t7.m(iuVar, i4, i10));
        qq qqVarA = oqVarB.a("google.afma.response.normalize", vg0.f17619d, hl.f11905c);
        Object obj = null;
        if (((Boolean) bm.f9713a.u()).booleanValue()) {
            ug0VarO4 = o4(iuVar.f12479h);
            if (ug0VarO4 == null) {
                ya.a0.m("Request contained a PoolKey but no matching parameters were found.");
            }
        } else {
            String str = iuVar.j;
            if (str != null && !str.isEmpty()) {
                ya.a0.m("Request contained a PoolKey but split request is disabled.");
            }
            ug0VarO4 = null;
        }
        yr0 yr0VarC = ug0VarO4 == null ? d7.C(9, context) : ug0VarO4.f17202d;
        bs0 bs0Var = (bs0) ((es1) awVar2.f9452c).a();
        bs0Var.b(iuVar.f12473a.getStringArrayList("ad_types"));
        bh0 bh0Var = new bh0(iuVar.g, bs0Var, yr0VarC);
        pq0 pq0Var = new pq0(context, iuVar.f12474b.f38129a, obj, false, 19);
        sr0 sr0Var = (sr0) ((es1) awVar2.f9453d).a();
        yr0 yr0VarC2 = d7.C(11, context);
        qr0 qr0Var = qr0.PRE_PROCESS;
        qr0 qr0Var2 = qr0.HTTP;
        if (ug0VarO4 == null) {
            sq sqVar = new sq(i10, awVar2, iuVar);
            h80 h80Var = h80.f11762t;
            ai aiVarA = sr0Var.a(qr0.GMS_SIGNALS, yo0.e(iuVar.f12473a));
            w81 w81Var = sr0Var.f16525a;
            pr0 pr0VarT2 = aiVarA.i(sqVar).g(h80Var).t();
            pr0 pr0VarL4 = l4(pr0VarT2, sr0Var, oqVarB, bs0Var, yr0VarC);
            yr0 yr0VarC3 = d7.C(10, context);
            List listAsList = Arrays.asList(pr0VarL4, pr0VarT2);
            u50 u50Var = new u50(pr0VarL4, iuVar, pr0VarT2);
            v41 v41Var = x41.f18307b;
            listAsList.getClass();
            x41 x41VarQ = x41.q(listAsList);
            ex exVar = fx.g;
            j81 j81Var = new j81(x41VarQ, true, false);
            j81Var.f12674p = new i81(j81Var, mkVar, exVar);
            j81Var.w();
            j81 j81Var2 = new j81(x41VarQ, true, false);
            j81Var2.f12674p = new i81(j81Var2, u50Var, w81Var);
            j81Var2.w();
            pr0 pr0VarT3 = new ai(sr0Var, qr0Var2, null, j81Var, listAsList, j81Var2).g(bh0Var).g(new rg0(11, yr0VarC3)).g(pq0Var).t();
            yr1.H(pr0VarT3, bs0Var, yr0VarC3, false);
            yr1.w(pr0VarT3, yr0VarC2);
            List listAsList2 = Arrays.asList(pr0VarT2, pr0VarL4, pr0VarT3);
            ib0 ib0Var = new ib0(iuVar, pr0VarT3, pr0VarT2, pr0VarL4, 1);
            v41 v41Var2 = x41.f18307b;
            listAsList2.getClass();
            x41 x41VarQ2 = x41.q(listAsList2);
            ex exVar2 = fx.g;
            j81 j81Var3 = new j81(x41VarQ2, true, false);
            j81Var3.f12674p = new i81(j81Var3, mkVar, exVar2);
            j81Var3.w();
            j81 j81Var4 = new j81(x41VarQ2, true, false);
            j81Var4.f12674p = new i81(j81Var4, ib0Var, w81Var);
            j81Var4.w();
            pr0VarT = new ai(sr0Var, qr0Var, null, j81Var3, listAsList2, j81Var4).i(qqVarA).t();
            z3 = false;
        } else {
            ah0 ah0Var = new ah0(ug0VarO4.f17200b, ug0VarO4.f17199a);
            yr0 yr0VarC4 = d7.C(10, context);
            pr0 pr0VarT4 = sr0Var.a(qr0Var2, yo0.e(ah0Var)).g(bh0Var).g(new rg0(11, yr0VarC4)).g(pq0Var).t();
            z3 = false;
            yr1.H(pr0VarT4, bs0Var, yr0VarC4, false);
            s81 s81VarE = yo0.e(ug0VarO4);
            yr1.w(pr0VarT4, yr0VarC2);
            List listAsList3 = Arrays.asList(pr0VarT4, s81VarE);
            ae aeVar = new ae(i10, pr0VarT4, s81VarE);
            v41 v41Var3 = x41.f18307b;
            listAsList3.getClass();
            x41 x41VarQ3 = x41.q(listAsList3);
            ex exVar3 = fx.g;
            j81 j81Var5 = new j81(x41VarQ3, true, false);
            j81Var5.f12674p = new i81(j81Var5, mkVar, exVar3);
            j81Var5.w();
            w81 w81Var2 = sr0Var.f16525a;
            j81 j81Var6 = new j81(x41VarQ3, true, false);
            j81Var6.f12674p = new i81(j81Var6, aeVar, w81Var2);
            j81Var6.w();
            pr0VarT = new ai(sr0Var, qr0Var, null, j81Var5, listAsList3, j81Var6).i(qqVarA).t();
        }
        yr1.H(pr0VarT, bs0Var, yr0VarC2, z3);
        return pr0VarT;
    }

    public final vd.b i4(final iu iuVar, int i4) {
        if (!((Boolean) bm.f9713a.u()).booleanValue()) {
            return yo0.w(new Exception("Split request is disabled."));
        }
        zq0 zq0Var = iuVar.f12480i;
        if (zq0Var == null) {
            return yo0.w(new Exception("Pool configuration missing from request."));
        }
        if (zq0Var.f19146d == 0 || zq0Var.f19147e == 0) {
            return yo0.w(new Exception("Caching is disabled."));
        }
        aw awVar = ua.j.C.f35274r;
        za.a aVarA = za.a.a();
        Context context = this.f18384a;
        oq oqVarB = awVar.b(context, aVarA, this.f18389f);
        k10 k10Var = this.f18387d;
        k10Var.getClass();
        int i10 = 8;
        aw awVar2 = new aw(k10Var.f12924b, new t7.m(iuVar, i4, i10));
        sr0 sr0Var = (sr0) ((es1) awVar2.f9453d).a();
        final pr0 pr0VarT = sr0Var.a(qr0.GMS_SIGNALS, yo0.e(iuVar.f12473a)).i(new sq(i10, awVar2, iuVar)).g(h80.f11762t).t();
        bs0 bs0Var = (bs0) ((es1) awVar2.f9452c).a();
        final yr0 yr0VarC = d7.C(9, context);
        final pr0 pr0VarL4 = l4(pr0VarT, sr0Var, oqVarB, bs0Var, yr0VarC);
        List listAsList = Arrays.asList(pr0VarT, pr0VarL4);
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.tg0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                xg0 xg0Var = this.f16815a;
                pr0 pr0Var = pr0VarL4;
                pr0 pr0Var2 = pr0VarT;
                iu iuVar2 = iuVar;
                yr0 yr0Var = yr0VarC;
                String str = ((ju) pr0Var.f15081c.get()).f12830i;
                ug0 ug0Var = new ug0((ju) pr0Var.f15081c.get(), (JSONObject) pr0Var2.f15081c.get(), iuVar2.f12479h, yr0Var);
                synchronized (xg0Var) {
                    xg0Var.n4();
                    xg0Var.f18388e.addLast(ug0Var);
                }
                return new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8));
            }
        };
        v41 v41Var = x41.f18307b;
        listAsList.getClass();
        x41 x41VarQ = x41.q(listAsList);
        mk mkVar = mk.f13919e;
        ex exVar = fx.g;
        j81 j81Var = new j81(x41VarQ, true, false);
        j81Var.f12674p = new i81(j81Var, mkVar, exVar);
        j81Var.w();
        w81 w81Var = sr0Var.f16525a;
        j81 j81Var2 = new j81(x41VarQ, true, false);
        j81Var2.f12674p = new i81(j81Var2, callable, w81Var);
        j81Var2.w();
        return new ai(sr0Var, qr0.GET_URL_AND_CACHE_KEY, null, j81Var, listAsList, j81Var2).t();
    }

    @Override // com.google.android.gms.internal.ads.bu
    public final void j0(iu iuVar, fu fuVar) {
        Bundle bundle;
        if (((Boolean) va.s.f36163e.f36166c.a(sk.B2)).booleanValue() && (bundle = iuVar.f12483m) != null) {
            d.h.D(ua.j.C.f35267k, bundle, "service-connected");
        }
        pr0 pr0VarH4 = h4(iuVar, Binder.getCallingUid());
        m4(pr0VarH4, fuVar, iuVar);
        if (((Boolean) ul.f17248i.u()).booleanValue()) {
            ix0 ix0Var = this.f18386c;
            Objects.requireNonNull(ix0Var);
            pr0VarH4.a(new wg0(ix0Var, 1), this.f18385b);
        }
    }

    public final vd.b j4(String str) {
        if (((Boolean) bm.f9713a.u()).booleanValue()) {
            return o4(str) == null ? yo0.w(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str)))) : yo0.e(new sg0());
        }
        return yo0.w(new Exception("Split request is disabled."));
    }

    public final vd.b k4(iu iuVar, int i4) {
        aw awVar = ua.j.C.f35274r;
        za.a aVarA = za.a.a();
        cs0 cs0Var = this.f18389f;
        Context context = this.f18384a;
        oq oqVarB = awVar.b(context, aVarA, cs0Var);
        if (!((Boolean) fm.f11208a.u()).booleanValue()) {
            return yo0.w(new Exception("Signal collection disabled."));
        }
        k10 k10Var = this.f18387d;
        k10Var.getClass();
        t7.m mVar = new t7.m(iuVar, i4, 8);
        k10 k10Var2 = k10Var.f12924b;
        es1 es1VarB = es1.b(new zm0(k10Var2.f12958t, 9));
        jo0 jo0Var = new jo0(mVar, 1);
        jo0 jo0Var2 = new jo0(mVar, 2);
        jo0 jo0Var3 = new jo0(mVar, 3);
        a10 a10Var = k10Var2.g;
        es1 es1Var = k10Var2.f12928d;
        g40 g40Var = new g40((js1) a10Var, (js1) es1Var, (fs1) jo0Var, (js1) jo0Var2, (js1) jo0Var3, 16);
        zm0 zm0Var = new zm0(a10Var, 5);
        jo0 jo0Var4 = new jo0(mVar, 0);
        m20 m20Var = new m20(21, jo0Var4);
        a40 a40Var = new a40(es1Var, a10Var, 10);
        lo0 lo0Var = new lo0(0);
        jo0 jo0Var5 = new jo0(mVar, 5);
        jo0 jo0Var6 = new jo0(mVar, 6);
        es1 es1Var2 = k10Var2.B;
        j90 j90Var = new j90((js1) es1Var2, (fs1) jo0Var3, (fs1) jo0Var4, (js1) es1Var, (js1) jo0Var5, (js1) jo0Var6, 7);
        yv yvVar = new yv(jo0Var4, es1Var2, es1Var, 29);
        jo0 jo0Var7 = new jo0(mVar, 4);
        es1 es1VarB2 = es1.b(ls.f13600r);
        es1 es1VarB3 = es1.b(nn1.f14353r);
        es1 es1VarB4 = es1.b(jz.f12895r);
        es1 es1VarB5 = es1.b(a80.E);
        int i10 = hs1.f11964b;
        LinkedHashMap linkedHashMapG = mq0.G(4);
        linkedHashMapG.put(qr0.GMS_SIGNALS, es1VarB2);
        linkedHashMapG.put(qr0.BUILD_URL, es1VarB3);
        linkedHashMapG.put(qr0.HTTP, es1VarB4);
        linkedHashMapG.put(qr0.PRE_PROCESS, es1VarB5);
        es1 es1VarB6 = es1.b(new yv(jo0Var7, k10Var2.g, new hs1(linkedHashMapG), 11));
        int i11 = ks1.f13231c;
        List list = Collections.EMPTY_LIST;
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(es1VarB6);
        es1 es1VarB7 = es1.b(new qm0(k10Var2.f12928d, new f60(new ks1(list, arrayList), 25)));
        es1 es1Var3 = k10Var2.O0;
        Context context2 = k10Var2.f12922a.f17809b;
        al0.z(context2);
        Object objA = es1Var3.a();
        ex exVar = fx.f11274a;
        al0.z(exVar);
        String string = ((iu) mVar.f34474c).f12473a.getString("ms");
        if (string == null) {
            string = "";
        }
        xl0 xl0Var = new xl0(6, exVar, string);
        ex exVar2 = fx.f11274a;
        al0.z(exVar2);
        List list2 = iuVar.f12477e;
        al0.z(list2);
        xl0 xl0Var2 = new xl0(7, exVar2, list2);
        cs1 cs1VarC = es1.c(g40Var);
        cs1 cs1VarC2 = es1.c(zm0Var);
        es1.c(m20Var);
        cs1 cs1VarC3 = es1.c(a40Var);
        cs1 cs1VarC4 = es1.c(lo0Var);
        es1.c(j90Var);
        cs1 cs1VarC5 = es1.c(yvVar);
        al0.z(exVar2);
        bs0 bs0Var = (bs0) es1VarB.a();
        qd0 qd0Var = (qd0) k10Var2.j.a();
        HashSet hashSet = new HashSet();
        hashSet.add((fo0) objA);
        hashSet.add(xl0Var);
        hashSet.add(xl0Var2);
        pk pkVar = sk.C6;
        rk rkVar = va.s.f36163e.f36166c;
        if (((Boolean) rkVar.a(pkVar)).booleanValue()) {
            hashSet.add((qn0) cs1VarC.a());
        }
        if (((Boolean) rkVar.a(sk.D6)).booleanValue()) {
            hashSet.add((qn0) cs1VarC2.a());
        }
        if (((Boolean) rkVar.a(sk.F6)).booleanValue()) {
            hashSet.add((qn0) cs1VarC3.a());
        }
        if (((Boolean) rkVar.a(sk.G6)).booleanValue()) {
            hashSet.add((qn0) cs1VarC4.a());
        }
        if (((Boolean) rkVar.a(sk.H3)).booleanValue()) {
            hashSet.add((qn0) cs1VarC5.a());
        }
        tn0 tn0Var = new tn0(context2, exVar2, hashSet, bs0Var, qd0Var);
        qq qqVarA = oqVarB.a("google.afma.request.getSignals", jz.f12889l, hl.f11905c);
        yr0 yr0VarC = d7.C(22, context);
        sr0 sr0Var = (sr0) es1VarB7.a();
        Bundle bundle = iuVar.f12473a;
        ai aiVarI = sr0Var.a(qr0.GET_SIGNALS, yo0.e(bundle)).g(new rg0(11, yr0VarC)).i(new sq(9, tn0Var, iuVar));
        pr0 pr0VarT = ((sr0) aiVarI.f9335f).a(qr0.JS_SIGNALS, aiVarI.t()).i(qqVarA).t();
        bs0 bs0Var2 = (bs0) es1VarB.a();
        bs0Var2.b(bundle.getStringArrayList("ad_types"));
        bs0Var2.d(bundle.getBundle("extras"));
        yr1.H(pr0VarT, bs0Var2, yr0VarC, true);
        if (((Boolean) ul.j.u()).booleanValue()) {
            ix0 ix0Var = this.f18386c;
            Objects.requireNonNull(ix0Var);
            pr0VarT.a(new wg0(ix0Var, 0), this.f18385b);
        }
        return pr0VarT;
    }

    public final void m4(vd.b bVar, fu fuVar, iu iuVar) {
        w71 w71VarF = yo0.F(bVar, new k20(7), fx.f11274a);
        rt rtVar = new rt(this, iuVar, fuVar, 16);
        w71VarF.a(new q81(0, w71VarF, rtVar), fx.g);
    }

    public final synchronized void n4() {
        int iIntValue = ((Long) bm.f9714b.u()).intValue();
        while (true) {
            ArrayDeque arrayDeque = this.f18388e;
            if (arrayDeque.size() >= iIntValue) {
                arrayDeque.removeFirst();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.bu
    public final void o1(iu iuVar, fu fuVar) {
        m4(i4(iuVar, Binder.getCallingUid()), fuVar, iuVar);
    }

    public final synchronized ug0 o4(String str) {
        Iterator it = this.f18388e.iterator();
        while (it.hasNext()) {
            ug0 ug0Var = (ug0) it.next();
            if (ug0Var.f17201c.equals(str)) {
                it.remove();
                return ug0Var;
            }
        }
        return null;
    }
}
