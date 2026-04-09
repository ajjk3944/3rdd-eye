package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import j$.util.Objects;
import java.io.IOException;
import java.util.List;
import org.json.JSONException;
import q2.AbstractBinderC2821h0;
import q2.C2841s;
import q2.InterfaceC2837p0;
import r.C2867j;
import t2.C2909E;
import t2.C2911G;
import t2.C2925i;
import u2.C2951a;

/* renamed from: com.google.android.gms.internal.ads.ii, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1327ii extends AbstractBinderC2821h0 {

    /* renamed from: C, reason: collision with root package name */
    public final C0802Wo f14751C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f14752D = false;

    /* renamed from: E, reason: collision with root package name */
    public final Long f14753E;

    /* renamed from: a, reason: collision with root package name */
    public final Context f14754a;

    /* renamed from: b, reason: collision with root package name */
    public final C2951a f14755b;

    /* renamed from: c, reason: collision with root package name */
    public final C0563In f14756c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1064dq f14757d;

    /* renamed from: e, reason: collision with root package name */
    public final C1605nr f14758e;

    /* renamed from: f, reason: collision with root package name */
    public final C2087wo f14759f;

    /* renamed from: g, reason: collision with root package name */
    public final C1593nf f14760g;

    /* renamed from: h, reason: collision with root package name */
    public final C0597Kn f14761h;
    public final C0581Jo i;

    /* renamed from: j, reason: collision with root package name */
    public final C2181ya f14762j;

    /* renamed from: k, reason: collision with root package name */
    public final Yu f14763k;

    /* renamed from: l, reason: collision with root package name */
    public final C1338iu f14764l;

    /* renamed from: m, reason: collision with root package name */
    public final C0593Kj f14765m;

    /* renamed from: n, reason: collision with root package name */
    public final C0784Vn f14766n;

    public BinderC1327ii(Context context, C2951a c2951a, C0563In c0563In, InterfaceC1064dq interfaceC1064dq, C1605nr c1605nr, C2087wo c2087wo, C1593nf c1593nf, C0597Kn c0597Kn, C0581Jo c0581Jo, C2181ya c2181ya, Yu yu, C1338iu c1338iu, C0593Kj c0593Kj, C0784Vn c0784Vn, C0802Wo c0802Wo) {
        this.f14754a = context;
        this.f14755b = c2951a;
        this.f14756c = c0563In;
        this.f14757d = interfaceC1064dq;
        this.f14758e = c1605nr;
        this.f14759f = c2087wo;
        this.f14760g = c1593nf;
        this.f14761h = c0597Kn;
        this.i = c0581Jo;
        this.f14762j = c2181ya;
        this.f14763k = yu;
        this.f14764l = c1338iu;
        this.f14765m = c0593Kj;
        this.f14766n = c0784Vn;
        this.f14751C = c0802Wo;
        p2.j.f22785C.f22797k.getClass();
        this.f14753E = Long.valueOf(SystemClock.elapsedRealtime());
    }

    @Override // q2.InterfaceC2823i0
    public final void A0(boolean z6) throws IOException, RemoteException {
        try {
            Context context = this.f14754a;
            Nx.f(context).D(z6);
            if (z6) {
                return;
            }
            try {
                if (context.getSharedPreferences("query_info_shared_prefs", 0).edit().clear().commit()) {
                } else {
                    throw new IOException("Failed to remove query_info_shared_prefs");
                }
            } catch (IOException e6) {
                p2.j.f22785C.f22795h.f("clearStorageOnGpidPubDisable_scar", e6);
            }
        } catch (IOException e7) {
            throw new RemoteException(e7.getMessage());
        }
    }

    @Override // q2.InterfaceC2823i0
    public final void B1(S2.a aVar, String str) {
        if (aVar == null) {
            u2.k.e("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) S2.b.n1(aVar);
        if (context == null) {
            u2.k.e("Context is null. Failed to open debug menu.");
            return;
        }
        C2925i c2925i = new C2925i(context);
        c2925i.f23617d = str;
        c2925i.f23618e = this.f14755b.f23784a;
        c2925i.b();
    }

    @Override // q2.InterfaceC2823i0
    public final void F1(InterfaceC0840Zb interfaceC0840Zb) {
        C2087wo c2087wo = this.f14759f;
        c2087wo.getClass();
        c2087wo.f17477e.f10212a.a(new CD(c2087wo, 28, interfaceC0840Zb), c2087wo.f17481j);
    }

    @Override // q2.InterfaceC2823i0
    public final void G1(String str) {
        this.f14758e.d(str);
    }

    @Override // q2.InterfaceC2823i0
    public final synchronized void P2(String str) {
        Context context = this.f14754a;
        H9.a(context);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8619J4)).booleanValue()) {
                p2.j.f22785C.f22798l.D(context, this.f14755b, true, null, str, null, null, this.f14763k, null, null, this.i.g());
            }
        }
    }

    @Override // q2.InterfaceC2823i0
    public final void V1(S2.a aVar, String str) throws JSONException {
        String strO;
        RunnableC1274hi runnableC1274hi;
        Context context = this.f14754a;
        H9.a(context);
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8658Q4)).booleanValue()) {
            try {
                C2911G c2911g = p2.j.f22785C.f22790c;
                strO = C2911G.O(context);
            } catch (RemoteException | RuntimeException e6) {
                p2.j.f22785C.f22795h.f("NonagonMobileAdsSettingManager_AppId", e6);
            }
        } else {
            strO = "";
        }
        boolean z6 = true;
        String str2 = true == TextUtils.isEmpty(strO) ? str : strO;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        E9 e9 = H9.f8619J4;
        C2841s c2841s = C2841s.f23267e;
        G9 g9 = c2841s.f23270c;
        G9 g92 = c2841s.f23270c;
        boolean zBooleanValue = ((Boolean) g9.a(e9)).booleanValue();
        E9 e92 = H9.f8804p1;
        boolean zBooleanValue2 = zBooleanValue | ((Boolean) g92.a(e92)).booleanValue();
        if (((Boolean) g92.a(e92)).booleanValue()) {
            runnableC1274hi = new RunnableC1274hi(this, (Runnable) S2.b.n1(aVar), 0);
        } else {
            runnableC1274hi = null;
            z6 = zBooleanValue2;
        }
        RunnableC1274hi runnableC1274hi2 = runnableC1274hi;
        if (z6) {
            p2.j.f22785C.f22798l.D(this.f14754a, this.f14755b, true, null, str2, null, runnableC1274hi2, this.f14763k, this.f14766n, this.f14753E, this.i.g());
        }
    }

    @Override // q2.InterfaceC2823i0
    public final void X(String str) {
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.Ga)).booleanValue()) {
            p2.j.f22785C.f22795h.f8974g = str;
        }
    }

    @Override // q2.InterfaceC2823i0
    public final synchronized void Y() {
        E9 e9 = H9.f8651P2;
        C2841s c2841s = C2841s.f23267e;
        if (((Boolean) c2841s.f23270c.a(e9)).booleanValue()) {
            p2.j.f22785C.f22804r.s();
            if (((Boolean) c2841s.f23270c.a(H9.f8656Q2)).booleanValue()) {
                q2.r.f23260g.f23263c = true;
            }
        }
    }

    @Override // q2.InterfaceC2823i0
    public final synchronized void b() {
        if (this.f14752D) {
            u2.k.h("Mobile ads is initialized already.");
            return;
        }
        E9 e9 = H9.f8656Q2;
        C2841s c2841s = C2841s.f23267e;
        if (((Boolean) c2841s.f23270c.a(e9)).booleanValue()) {
            q2.r.a();
        }
        Context context = this.f14754a;
        H9.a(context);
        C2951a c2951a = this.f14755b;
        C0784Vn c0784Vn = this.f14766n;
        p2.j jVar = p2.j.f22785C;
        jVar.f22795h.d(context, c2951a, c0784Vn);
        this.f14765m.b();
        jVar.f22796j.d(context);
        this.f14752D = true;
        this.f14759f.a();
        C1605nr c1605nr = this.f14758e;
        c1605nr.getClass();
        C2909E c2909eI = jVar.f22795h.i();
        c2909eI.f23550c.add(new RunnableC1551mr(c1605nr, 2));
        c1605nr.f15828f.execute(new RunnableC1551mr(c1605nr, 0));
        if (((Boolean) c2841s.f23270c.a(H9.f8631L4)).booleanValue()) {
            C0597Kn c0597Kn = this.f14761h;
            if (!c0597Kn.f9536f.getAndSet(true)) {
                C2909E c2909eI2 = jVar.f22795h.i();
                c2909eI2.f23550c.add(new RunnableC0580Jn(c0597Kn, 0));
            }
            c0597Kn.f9533c.execute(new RunnableC0580Jn(c0597Kn, 2));
        }
        this.i.a();
        if (((Boolean) c2841s.f23270c.a(H9.ua)).booleanValue()) {
            final int i = 3;
            AbstractC0640Nf.f10005a.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.gi

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ BinderC1327ii f14365b;

                {
                    this.f14365b = this;
                }

                @Override // java.lang.Runnable
                public final void run() throws u2.l {
                    String strA;
                    C2235za c2235za;
                    String str;
                    switch (i) {
                        case 0:
                            AbstractC0709Rg.g(this.f14365b.f14754a, true);
                            return;
                        case 1:
                            BinderC1327ii binderC1327ii = this.f14365b;
                            P9 p9 = p2.j.f22785C.f22800n;
                            Context context2 = binderC1327ii.f14754a;
                            C0784Vn c0784Vn2 = binderC1327ii.f14766n;
                            if (p9.f10326b.getAndSet(true)) {
                                return;
                            }
                            p9.f10327c = context2;
                            p9.f10328d = c0784Vn2;
                            if (p9.f10330f != null || context2 == null || (strA = C2867j.a(context2)) == null || strA.equals(context2.getPackageName())) {
                                return;
                            }
                            p9.f23319a = context2.getApplicationContext();
                            Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
                            if (!TextUtils.isEmpty(strA)) {
                                intent.setPackage(strA);
                            }
                            context2.bindService(intent, p9, 33);
                            return;
                        case 2:
                            BinderC1327ii binderC1327ii2 = this.f14365b;
                            binderC1327ii2.getClass();
                            BinderC1162fe binderC1162fe = new BinderC1162fe("com.google.android.gms.ads.internal.report.IDynamiteErrorEventListener");
                            C2181ya c2181ya = binderC1327ii2.f14762j;
                            c2181ya.getClass();
                            try {
                                try {
                                    IBinder iBinderB = u2.k.b(c2181ya.f17723a).b("com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy");
                                    if (iBinderB == null) {
                                        c2235za = null;
                                    } else {
                                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                                        c2235za = iInterfaceQueryLocalInterface instanceof C2235za ? (C2235za) iInterfaceQueryLocalInterface : new C2235za(iBinderB, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy", 2);
                                    }
                                    Parcel parcelH0 = c2235za.h0();
                                    C7.e(parcelH0, binderC1162fe);
                                    c2235za.I0(parcelH0, 1);
                                    return;
                                } catch (Exception e6) {
                                    throw new u2.l(e6);
                                }
                            } catch (RemoteException e7) {
                                u2.k.h("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e7.getMessage())));
                                return;
                            } catch (u2.l e8) {
                                u2.k.h("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e8.getMessage())));
                                return;
                            }
                        default:
                            BinderC1327ii binderC1327ii3 = this.f14365b;
                            binderC1327ii3.getClass();
                            p2.j jVar2 = p2.j.f22785C;
                            if (jVar2.f22795h.i().g()) {
                                C2909E c2909eI3 = jVar2.f22795h.i();
                                c2909eI3.m();
                                synchronized (c2909eI3.f23548a) {
                                    str = c2909eI3.f23572z;
                                }
                                if (jVar2.f22801o.b(binderC1327ii3.f14754a, str, binderC1327ii3.f14755b.f23784a)) {
                                    return;
                                }
                                jVar2.f22795h.i().h(false);
                                jVar2.f22795h.i().i("");
                                return;
                            }
                            return;
                    }
                }
            });
        }
        if (((Boolean) c2841s.f23270c.a(H9.hc)).booleanValue()) {
            final int i3 = 2;
            AbstractC0640Nf.f10005a.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.gi

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ BinderC1327ii f14365b;

                {
                    this.f14365b = this;
                }

                @Override // java.lang.Runnable
                public final void run() throws u2.l {
                    String strA;
                    C2235za c2235za;
                    String str;
                    switch (i3) {
                        case 0:
                            AbstractC0709Rg.g(this.f14365b.f14754a, true);
                            return;
                        case 1:
                            BinderC1327ii binderC1327ii = this.f14365b;
                            P9 p9 = p2.j.f22785C.f22800n;
                            Context context2 = binderC1327ii.f14754a;
                            C0784Vn c0784Vn2 = binderC1327ii.f14766n;
                            if (p9.f10326b.getAndSet(true)) {
                                return;
                            }
                            p9.f10327c = context2;
                            p9.f10328d = c0784Vn2;
                            if (p9.f10330f != null || context2 == null || (strA = C2867j.a(context2)) == null || strA.equals(context2.getPackageName())) {
                                return;
                            }
                            p9.f23319a = context2.getApplicationContext();
                            Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
                            if (!TextUtils.isEmpty(strA)) {
                                intent.setPackage(strA);
                            }
                            context2.bindService(intent, p9, 33);
                            return;
                        case 2:
                            BinderC1327ii binderC1327ii2 = this.f14365b;
                            binderC1327ii2.getClass();
                            BinderC1162fe binderC1162fe = new BinderC1162fe("com.google.android.gms.ads.internal.report.IDynamiteErrorEventListener");
                            C2181ya c2181ya = binderC1327ii2.f14762j;
                            c2181ya.getClass();
                            try {
                                try {
                                    IBinder iBinderB = u2.k.b(c2181ya.f17723a).b("com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy");
                                    if (iBinderB == null) {
                                        c2235za = null;
                                    } else {
                                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                                        c2235za = iInterfaceQueryLocalInterface instanceof C2235za ? (C2235za) iInterfaceQueryLocalInterface : new C2235za(iBinderB, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy", 2);
                                    }
                                    Parcel parcelH0 = c2235za.h0();
                                    C7.e(parcelH0, binderC1162fe);
                                    c2235za.I0(parcelH0, 1);
                                    return;
                                } catch (Exception e6) {
                                    throw new u2.l(e6);
                                }
                            } catch (RemoteException e7) {
                                u2.k.h("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e7.getMessage())));
                                return;
                            } catch (u2.l e8) {
                                u2.k.h("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e8.getMessage())));
                                return;
                            }
                        default:
                            BinderC1327ii binderC1327ii3 = this.f14365b;
                            binderC1327ii3.getClass();
                            p2.j jVar2 = p2.j.f22785C;
                            if (jVar2.f22795h.i().g()) {
                                C2909E c2909eI3 = jVar2.f22795h.i();
                                c2909eI3.m();
                                synchronized (c2909eI3.f23548a) {
                                    str = c2909eI3.f23572z;
                                }
                                if (jVar2.f22801o.b(binderC1327ii3.f14754a, str, binderC1327ii3.f14755b.f23784a)) {
                                    return;
                                }
                                jVar2.f22795h.i().h(false);
                                jVar2.f22795h.i().i("");
                                return;
                            }
                            return;
                    }
                }
            });
        }
        if (((Boolean) c2841s.f23270c.a(H9.f8592F3)).booleanValue()) {
            final int i6 = 0;
            AbstractC0640Nf.f10005a.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.gi

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ BinderC1327ii f14365b;

                {
                    this.f14365b = this;
                }

                @Override // java.lang.Runnable
                public final void run() throws u2.l {
                    String strA;
                    C2235za c2235za;
                    String str;
                    switch (i6) {
                        case 0:
                            AbstractC0709Rg.g(this.f14365b.f14754a, true);
                            return;
                        case 1:
                            BinderC1327ii binderC1327ii = this.f14365b;
                            P9 p9 = p2.j.f22785C.f22800n;
                            Context context2 = binderC1327ii.f14754a;
                            C0784Vn c0784Vn2 = binderC1327ii.f14766n;
                            if (p9.f10326b.getAndSet(true)) {
                                return;
                            }
                            p9.f10327c = context2;
                            p9.f10328d = c0784Vn2;
                            if (p9.f10330f != null || context2 == null || (strA = C2867j.a(context2)) == null || strA.equals(context2.getPackageName())) {
                                return;
                            }
                            p9.f23319a = context2.getApplicationContext();
                            Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
                            if (!TextUtils.isEmpty(strA)) {
                                intent.setPackage(strA);
                            }
                            context2.bindService(intent, p9, 33);
                            return;
                        case 2:
                            BinderC1327ii binderC1327ii2 = this.f14365b;
                            binderC1327ii2.getClass();
                            BinderC1162fe binderC1162fe = new BinderC1162fe("com.google.android.gms.ads.internal.report.IDynamiteErrorEventListener");
                            C2181ya c2181ya = binderC1327ii2.f14762j;
                            c2181ya.getClass();
                            try {
                                try {
                                    IBinder iBinderB = u2.k.b(c2181ya.f17723a).b("com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy");
                                    if (iBinderB == null) {
                                        c2235za = null;
                                    } else {
                                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                                        c2235za = iInterfaceQueryLocalInterface instanceof C2235za ? (C2235za) iInterfaceQueryLocalInterface : new C2235za(iBinderB, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy", 2);
                                    }
                                    Parcel parcelH0 = c2235za.h0();
                                    C7.e(parcelH0, binderC1162fe);
                                    c2235za.I0(parcelH0, 1);
                                    return;
                                } catch (Exception e6) {
                                    throw new u2.l(e6);
                                }
                            } catch (RemoteException e7) {
                                u2.k.h("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e7.getMessage())));
                                return;
                            } catch (u2.l e8) {
                                u2.k.h("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e8.getMessage())));
                                return;
                            }
                        default:
                            BinderC1327ii binderC1327ii3 = this.f14365b;
                            binderC1327ii3.getClass();
                            p2.j jVar2 = p2.j.f22785C;
                            if (jVar2.f22795h.i().g()) {
                                C2909E c2909eI3 = jVar2.f22795h.i();
                                c2909eI3.m();
                                synchronized (c2909eI3.f23548a) {
                                    str = c2909eI3.f23572z;
                                }
                                if (jVar2.f22801o.b(binderC1327ii3.f14754a, str, binderC1327ii3.f14755b.f23784a)) {
                                    return;
                                }
                                jVar2.f22795h.i().h(false);
                                jVar2.f22795h.i().i("");
                                return;
                            }
                            return;
                    }
                }
            });
        }
        if (((Boolean) c2841s.f23270c.a(H9.f8814q5)).booleanValue()) {
            if (((Boolean) c2841s.f23270c.a(H9.f8821r5)).booleanValue()) {
                final int i7 = 1;
                AbstractC0640Nf.f10005a.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.gi

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ BinderC1327ii f14365b;

                    {
                        this.f14365b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() throws u2.l {
                        String strA;
                        C2235za c2235za;
                        String str;
                        switch (i7) {
                            case 0:
                                AbstractC0709Rg.g(this.f14365b.f14754a, true);
                                return;
                            case 1:
                                BinderC1327ii binderC1327ii = this.f14365b;
                                P9 p9 = p2.j.f22785C.f22800n;
                                Context context2 = binderC1327ii.f14754a;
                                C0784Vn c0784Vn2 = binderC1327ii.f14766n;
                                if (p9.f10326b.getAndSet(true)) {
                                    return;
                                }
                                p9.f10327c = context2;
                                p9.f10328d = c0784Vn2;
                                if (p9.f10330f != null || context2 == null || (strA = C2867j.a(context2)) == null || strA.equals(context2.getPackageName())) {
                                    return;
                                }
                                p9.f23319a = context2.getApplicationContext();
                                Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
                                if (!TextUtils.isEmpty(strA)) {
                                    intent.setPackage(strA);
                                }
                                context2.bindService(intent, p9, 33);
                                return;
                            case 2:
                                BinderC1327ii binderC1327ii2 = this.f14365b;
                                binderC1327ii2.getClass();
                                BinderC1162fe binderC1162fe = new BinderC1162fe("com.google.android.gms.ads.internal.report.IDynamiteErrorEventListener");
                                C2181ya c2181ya = binderC1327ii2.f14762j;
                                c2181ya.getClass();
                                try {
                                    try {
                                        IBinder iBinderB = u2.k.b(c2181ya.f17723a).b("com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy");
                                        if (iBinderB == null) {
                                            c2235za = null;
                                        } else {
                                            IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                                            c2235za = iInterfaceQueryLocalInterface instanceof C2235za ? (C2235za) iInterfaceQueryLocalInterface : new C2235za(iBinderB, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy", 2);
                                        }
                                        Parcel parcelH0 = c2235za.h0();
                                        C7.e(parcelH0, binderC1162fe);
                                        c2235za.I0(parcelH0, 1);
                                        return;
                                    } catch (Exception e6) {
                                        throw new u2.l(e6);
                                    }
                                } catch (RemoteException e7) {
                                    u2.k.h("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e7.getMessage())));
                                    return;
                                } catch (u2.l e8) {
                                    u2.k.h("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e8.getMessage())));
                                    return;
                                }
                            default:
                                BinderC1327ii binderC1327ii3 = this.f14365b;
                                binderC1327ii3.getClass();
                                p2.j jVar2 = p2.j.f22785C;
                                if (jVar2.f22795h.i().g()) {
                                    C2909E c2909eI3 = jVar2.f22795h.i();
                                    c2909eI3.m();
                                    synchronized (c2909eI3.f23548a) {
                                        str = c2909eI3.f23572z;
                                    }
                                    if (jVar2.f22801o.b(binderC1327ii3.f14754a, str, binderC1327ii3.f14755b.f23784a)) {
                                        return;
                                    }
                                    jVar2.f22795h.i().h(false);
                                    jVar2.f22795h.i().i("");
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
        }
        if (((Boolean) c2841s.f23270c.a(H9.f8588E5)).booleanValue()) {
            C0802Wo c0802Wo = this.f14751C;
            C0623Mf c0623Mf = AbstractC0640Nf.f10010f;
            Objects.requireNonNull(c0802Wo);
            c0623Mf.execute(new RunnableC1883t(28, c0802Wo));
        }
    }

    @Override // q2.InterfaceC2823i0
    public final synchronized void d0(boolean z6) {
        p2.j.f22785C.i.c(z6);
    }

    @Override // q2.InterfaceC2823i0
    public final synchronized boolean i() {
        return p2.j.f22785C.i.d();
    }

    @Override // q2.InterfaceC2823i0
    public final synchronized void i1(float f2) {
        p2.j.f22785C.i.a(f2);
    }

    @Override // q2.InterfaceC2823i0
    public final void j1(q2.V0 v0) {
        C1593nf c1593nf = this.f14760g;
        Context context = this.f14754a;
        c1593nf.getClass();
        C1431kf c1431kfN = C1431kf.n(context);
        C1217gf c1217gf = (C1217gf) ((C1799rN) c1431kfN.f15175d).c();
        ((Q2.a) c1431kfN.f15173b).getClass();
        c1217gf.a(-1, System.currentTimeMillis());
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8649P0)).booleanValue() && c1593nf.a(context) && C1593nf.g(context)) {
            synchronized (c1593nf.i) {
            }
        }
    }

    @Override // q2.InterfaceC2823i0
    public final synchronized float k() {
        return p2.j.f22785C.i.b();
    }

    @Override // q2.InterfaceC2823i0
    public final List l() {
        return this.f14759f.b();
    }

    @Override // q2.InterfaceC2823i0
    public final void l3(InterfaceC0603Lc interfaceC0603Lc) {
        this.f14764l.y(interfaceC0603Lc);
    }

    @Override // q2.InterfaceC2823i0
    public final String n() {
        return this.f14755b.f23784a;
    }

    @Override // q2.InterfaceC2823i0
    public final void r() {
        this.f14759f.f17488q = false;
    }

    @Override // q2.InterfaceC2823i0
    public final void x0(InterfaceC2837p0 interfaceC2837p0) {
        this.i.f(interfaceC2837p0, EnumC0564Io.f9166b);
    }
}
