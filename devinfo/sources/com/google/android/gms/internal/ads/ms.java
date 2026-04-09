package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ms extends mg implements is {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f13999f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final RtbAdapter f14000a;

    /* renamed from: b, reason: collision with root package name */
    public bb.p f14001b;

    /* renamed from: c, reason: collision with root package name */
    public bb.w f14002c;

    /* renamed from: d, reason: collision with root package name */
    public bb.h f14003d;

    /* renamed from: e, reason: collision with root package name */
    public String f14004e;

    public ms(RtbAdapter rtbAdapter) {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        this.f14004e = "";
        this.f14000a = rtbAdapter;
    }

    public static final Bundle i4(String str) throws RemoteException {
        za.i.h("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str == null) {
                return bundle;
            }
            JSONObject jSONObject = new JSONObject(str);
            Bundle bundle2 = new Bundle();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                bundle2.putString(next, jSONObject.getString(next));
            }
            return bundle2;
        } catch (JSONException e2) {
            za.i.f("", e2);
            throw new RemoteException();
        }
    }

    public static final boolean j4(va.z2 z2Var) {
        if (z2Var.f36193f) {
            return true;
        }
        za.d dVar = va.r.g.f36157a;
        return za.d.o();
    }

    public static final String k4(String str, va.z2 z2Var) {
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return z2Var.f36206u;
        }
    }

    @Override // com.google.android.gms.internal.ads.is
    public final void B0(String str, String str2, va.z2 z2Var, vb.a aVar, gs gsVar, fr frVar) throws RemoteException {
        try {
            pq0 pq0Var = new pq0(this, gsVar, frVar, 11);
            RtbAdapter rtbAdapter = this.f14000a;
            Context context = (Context) vb.b.U0(aVar);
            Bundle bundleI4 = i4(str2);
            Bundle bundleH4 = h4(z2Var);
            j4(z2Var);
            int i4 = z2Var.g;
            k4(str2, z2Var);
            rtbAdapter.loadRtbRewardedAd(new bb.y(context, str, bundleI4, bundleH4, i4, this.f14004e), pq0Var);
        } catch (Throwable th2) {
            za.i.f("Adapter failed to render rewarded ad.", th2);
            ls.h(aVar, th2, "adapter.loadRtbRewardedAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.is
    public final boolean F3(vb.a aVar) {
        bb.w wVar = this.f14002c;
        if (wVar == null) {
            return false;
        }
        try {
            wVar.showAd((Context) vb.b.U0(aVar));
            return true;
        } catch (Throwable th2) {
            za.i.f("", th2);
            ls.h(aVar, th2, "adapter.showRtbRewardedAd");
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.is
    public final void K0(String str, String str2, va.z2 z2Var, vb.a aVar, cs csVar, fr frVar) throws RemoteException {
        try {
            pq0 pq0Var = new pq0(this, csVar, frVar, 9);
            RtbAdapter rtbAdapter = this.f14000a;
            Context context = (Context) vb.b.U0(aVar);
            Bundle bundleI4 = i4(str2);
            Bundle bundleH4 = h4(z2Var);
            j4(z2Var);
            int i4 = z2Var.g;
            k4(str2, z2Var);
            rtbAdapter.loadRtbInterstitialAd(new bb.r(context, str, bundleI4, bundleH4, i4, this.f14004e), pq0Var);
        } catch (Throwable th2) {
            za.i.f("Adapter failed to render interstitial ad.", th2);
            ls.h(aVar, th2, "adapter.loadRtbInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.is
    public final boolean O2(vb.a aVar) {
        bb.p pVar = this.f14001b;
        if (pVar == null) {
            return false;
        }
        try {
            pVar.showAd((Context) vb.b.U0(aVar));
            return true;
        } catch (Throwable th2) {
            za.i.f("", th2);
            ls.h(aVar, th2, "adapter.showRtbInterstitialAd");
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.is
    public final void U2(String str) {
        this.f14004e = str;
    }

    @Override // com.google.android.gms.internal.ads.is
    public final boolean V(vb.a aVar) {
        bb.h hVar = this.f14003d;
        if (hVar == null) {
            return false;
        }
        try {
            hVar.showAd((Context) vb.b.U0(aVar));
            return true;
        } catch (Throwable th2) {
            za.i.f("", th2);
            ls.h(aVar, th2, "adapter.showRtbAppOpenAd");
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.is
    public final void W2(String str, String str2, va.z2 z2Var, vb.a aVar, as asVar, fr frVar, va.c3 c3Var) throws RemoteException {
        try {
            l90 l90Var = new l90(this, asVar, frVar, 5);
            RtbAdapter rtbAdapter = this.f14000a;
            Context context = (Context) vb.b.U0(aVar);
            Bundle bundleI4 = i4(str2);
            Bundle bundleH4 = h4(z2Var);
            j4(z2Var);
            int i4 = z2Var.g;
            k4(str2, z2Var);
            rtbAdapter.loadRtbBannerAd(new bb.m(context, str, bundleI4, bundleH4, i4, new pa.h(c3Var.f36042e, c3Var.f36039b, c3Var.f36038a), this.f14004e), l90Var);
        } catch (Throwable th2) {
            za.i.f("Adapter failed to render banner ad.", th2);
            ls.h(aVar, th2, "adapter.loadRtbBannerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.is
    public final os d() {
        pa.r versionInfo = this.f14000a.getVersionInfo();
        return new os(versionInfo.f31546a, versionInfo.f31547b, versionInfo.f31548c);
    }

    @Override // com.google.android.gms.internal.ads.is
    public final os e() {
        pa.r sDKVersionInfo = this.f14000a.getSDKVersionInfo();
        return new os(sDKVersionInfo.f31546a, sDKVersionInfo.f31547b, sDKVersionInfo.f31548c);
    }

    @Override // com.google.android.gms.internal.ads.mg
    public final boolean g4(int i4, Parcel parcel, Parcel parcel2) throws RemoteException {
        ks jsVar = null;
        yr xrVar = null;
        es dsVar = null;
        as zrVar = null;
        gs fsVar = null;
        es dsVar2 = null;
        gs fsVar2 = null;
        cs bsVar = null;
        as zrVar2 = null;
        if (i4 == 1) {
            vb.a aVarR0 = vb.b.r0(parcel.readStrongBinder());
            String string = parcel.readString();
            Parcelable.Creator creator = Bundle.CREATOR;
            Bundle bundle = (Bundle) ng.b(parcel, creator);
            Bundle bundle2 = (Bundle) ng.b(parcel, creator);
            va.c3 c3Var = (va.c3) ng.b(parcel, va.c3.CREATOR);
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                jsVar = iInterfaceQueryLocalInterface instanceof ks ? (ks) iInterfaceQueryLocalInterface : new js(strongBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback", 1);
            }
            ng.f(parcel);
            x0(aVarR0, string, bundle, bundle2, c3Var, jsVar);
            parcel2.writeNoException();
            return true;
        }
        if (i4 == 2) {
            os osVarD = d();
            parcel2.writeNoException();
            ng.d(parcel2, osVarD);
            return true;
        }
        if (i4 == 3) {
            os osVarE = e();
            parcel2.writeNoException();
            ng.d(parcel2, osVarE);
            return true;
        }
        if (i4 == 5) {
            va.a2 a2VarZ1 = z1();
            parcel2.writeNoException();
            ng.e(parcel2, a2VarZ1);
            return true;
        }
        if (i4 == 10) {
            vb.b.r0(parcel.readStrongBinder());
            ng.f(parcel);
            parcel2.writeNoException();
            return true;
        }
        if (i4 == 11) {
            parcel.createStringArray();
            ng.f(parcel);
            parcel2.writeNoException();
            return true;
        }
        switch (i4) {
            case 13:
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                va.z2 z2Var = (va.z2) ng.b(parcel, va.z2.CREATOR);
                vb.a aVarR02 = vb.b.r0(parcel.readStrongBinder());
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                    zrVar2 = iInterfaceQueryLocalInterface2 instanceof as ? (as) iInterfaceQueryLocalInterface2 : new zr(strongBinder2);
                }
                as asVar = zrVar2;
                fr frVarH4 = er.h4(parcel.readStrongBinder());
                va.c3 c3Var2 = (va.c3) ng.b(parcel, va.c3.CREATOR);
                ng.f(parcel);
                W2(string2, string3, z2Var, aVarR02, asVar, frVarH4, c3Var2);
                parcel2.writeNoException();
                break;
            case 14:
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                va.z2 z2Var2 = (va.z2) ng.b(parcel, va.z2.CREATOR);
                vb.a aVarR03 = vb.b.r0(parcel.readStrongBinder());
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                    bsVar = iInterfaceQueryLocalInterface3 instanceof cs ? (cs) iInterfaceQueryLocalInterface3 : new bs(strongBinder3, "com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback", 1);
                }
                fr frVarH42 = er.h4(parcel.readStrongBinder());
                ng.f(parcel);
                K0(string4, string5, z2Var2, aVarR03, bsVar, frVarH42);
                parcel2.writeNoException();
                break;
            case 15:
                vb.a aVarR04 = vb.b.r0(parcel.readStrongBinder());
                ng.f(parcel);
                boolean zO2 = O2(aVarR04);
                parcel2.writeNoException();
                parcel2.writeInt(zO2 ? 1 : 0);
                break;
            case 16:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                va.z2 z2Var3 = (va.z2) ng.b(parcel, va.z2.CREATOR);
                vb.a aVarR05 = vb.b.r0(parcel.readStrongBinder());
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                    fsVar2 = iInterfaceQueryLocalInterface4 instanceof gs ? (gs) iInterfaceQueryLocalInterface4 : new fs(strongBinder4);
                }
                fr frVarH43 = er.h4(parcel.readStrongBinder());
                ng.f(parcel);
                B0(string6, string7, z2Var3, aVarR05, fsVar2, frVarH43);
                parcel2.writeNoException();
                break;
            case 17:
                vb.a aVarR06 = vb.b.r0(parcel.readStrongBinder());
                ng.f(parcel);
                boolean zF3 = F3(aVarR06);
                parcel2.writeNoException();
                parcel2.writeInt(zF3 ? 1 : 0);
                break;
            case 18:
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                va.z2 z2Var4 = (va.z2) ng.b(parcel, va.z2.CREATOR);
                vb.a aVarR07 = vb.b.r0(parcel.readStrongBinder());
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                    dsVar2 = iInterfaceQueryLocalInterface5 instanceof es ? (es) iInterfaceQueryLocalInterface5 : new ds(strongBinder5);
                }
                fr frVarH44 = er.h4(parcel.readStrongBinder());
                ng.f(parcel);
                l0(string8, string9, z2Var4, aVarR07, dsVar2, frVarH44, null);
                parcel2.writeNoException();
                break;
            case 19:
                String string10 = parcel.readString();
                ng.f(parcel);
                this.f14004e = string10;
                parcel2.writeNoException();
                break;
            case 20:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                va.z2 z2Var5 = (va.z2) ng.b(parcel, va.z2.CREATOR);
                vb.a aVarR08 = vb.b.r0(parcel.readStrongBinder());
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                    fsVar = iInterfaceQueryLocalInterface6 instanceof gs ? (gs) iInterfaceQueryLocalInterface6 : new fs(strongBinder6);
                }
                fr frVarH45 = er.h4(parcel.readStrongBinder());
                ng.f(parcel);
                q3(string11, string12, z2Var5, aVarR08, fsVar, frVarH45);
                parcel2.writeNoException();
                break;
            case 21:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                va.z2 z2Var6 = (va.z2) ng.b(parcel, va.z2.CREATOR);
                vb.a aVarR09 = vb.b.r0(parcel.readStrongBinder());
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                    zrVar = iInterfaceQueryLocalInterface7 instanceof as ? (as) iInterfaceQueryLocalInterface7 : new zr(strongBinder7);
                }
                as asVar2 = zrVar;
                fr frVarH46 = er.h4(parcel.readStrongBinder());
                va.c3 c3Var3 = (va.c3) ng.b(parcel, va.c3.CREATOR);
                ng.f(parcel);
                k3(string13, string14, z2Var6, aVarR09, asVar2, frVarH46, c3Var3);
                parcel2.writeNoException();
                break;
            case 22:
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                va.z2 z2Var7 = (va.z2) ng.b(parcel, va.z2.CREATOR);
                vb.a aVarR010 = vb.b.r0(parcel.readStrongBinder());
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                    dsVar = iInterfaceQueryLocalInterface8 instanceof es ? (es) iInterfaceQueryLocalInterface8 : new ds(strongBinder8);
                }
                fr frVarH47 = er.h4(parcel.readStrongBinder());
                qm qmVar = (qm) ng.b(parcel, qm.CREATOR);
                ng.f(parcel);
                l0(string15, string16, z2Var7, aVarR010, dsVar, frVarH47, qmVar);
                parcel2.writeNoException();
                break;
            case 23:
                String string17 = parcel.readString();
                String string18 = parcel.readString();
                va.z2 z2Var8 = (va.z2) ng.b(parcel, va.z2.CREATOR);
                vb.a aVarR011 = vb.b.r0(parcel.readStrongBinder());
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
                    xrVar = iInterfaceQueryLocalInterface9 instanceof yr ? (yr) iInterfaceQueryLocalInterface9 : new xr(strongBinder9, "com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback", 1);
                }
                fr frVarH48 = er.h4(parcel.readStrongBinder());
                ng.f(parcel);
                l2(string17, string18, z2Var8, aVarR011, xrVar, frVarH48);
                parcel2.writeNoException();
                break;
            case 24:
                vb.a aVarR012 = vb.b.r0(parcel.readStrongBinder());
                ng.f(parcel);
                boolean zV = V(aVarR012);
                parcel2.writeNoException();
                parcel2.writeInt(zV ? 1 : 0);
                break;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.is
    public final void h1(String str, String str2, va.z2 z2Var, vb.b bVar, dj0 dj0Var, fr frVar) throws RemoteException {
        l0(str, str2, z2Var, bVar, dj0Var, frVar, null);
    }

    public final Bundle h4(va.z2 z2Var) {
        Bundle bundle;
        Bundle bundle2 = z2Var.f36198m;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.f14000a.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    @Override // com.google.android.gms.internal.ads.is
    public final void k3(String str, String str2, va.z2 z2Var, vb.a aVar, as asVar, fr frVar, va.c3 c3Var) throws RemoteException {
        try {
            RtbAdapter rtbAdapter = this.f14000a;
            i4(str2);
            h4(z2Var);
            j4(z2Var);
            k4(str2, z2Var);
            new pa.h(c3Var.f36042e, c3Var.f36039b, c3Var.f36038a);
            try {
                asVar.b(new va.w1(7, rtbAdapter.getClass().getSimpleName().concat(" does not support interscroller ads."), "com.google.android.gms.ads", null, null));
            } catch (RemoteException e2) {
                za.i.f("", e2);
            }
        } catch (Throwable th2) {
            za.i.f("Adapter failed to render interscroller ad.", th2);
            ls.h(aVar, th2, "adapter.loadRtbInterscrollerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.is
    public final void l0(String str, String str2, va.z2 z2Var, vb.a aVar, es esVar, fr frVar, qm qmVar) throws RemoteException {
        RtbAdapter rtbAdapter = this.f14000a;
        try {
            ix0 ix0Var = new ix0(this, esVar, frVar);
            Context context = (Context) vb.b.U0(aVar);
            Bundle bundleI4 = i4(str2);
            Bundle bundleH4 = h4(z2Var);
            j4(z2Var);
            int i4 = z2Var.g;
            k4(str2, z2Var);
            rtbAdapter.loadRtbNativeAdMapper(new bb.u(context, str, bundleI4, bundleH4, i4, this.f14004e), ix0Var);
        } catch (Throwable th2) {
            za.i.f("Adapter failed to render native ad.", th2);
            ls.h(aVar, th2, "adapter.loadRtbNativeAdMapper");
            String message = th2.getMessage();
            if (TextUtils.isEmpty(message) || !message.equals("Method is not found")) {
                throw new RemoteException();
            }
            try {
                ce1 ce1Var = new ce1(this, esVar, frVar);
                Context context2 = (Context) vb.b.U0(aVar);
                Bundle bundleI42 = i4(str2);
                Bundle bundleH42 = h4(z2Var);
                j4(z2Var);
                int i10 = z2Var.g;
                k4(str2, z2Var);
                rtbAdapter.loadRtbNativeAd(new bb.u(context2, str, bundleI42, bundleH42, i10, this.f14004e), ce1Var);
            } catch (Throwable th3) {
                za.i.f("Adapter failed to render native ad.", th3);
                ls.h(aVar, th3, "adapter.loadRtbNativeAd");
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.is
    public final void l2(String str, String str2, va.z2 z2Var, vb.a aVar, yr yrVar, fr frVar) throws RemoteException {
        try {
            pq0 pq0Var = new pq0(this, yrVar, frVar, 10);
            RtbAdapter rtbAdapter = this.f14000a;
            Context context = (Context) vb.b.U0(aVar);
            Bundle bundleI4 = i4(str2);
            Bundle bundleH4 = h4(z2Var);
            j4(z2Var);
            int i4 = z2Var.g;
            k4(str2, z2Var);
            rtbAdapter.loadRtbAppOpenAd(new bb.j(context, str, bundleI4, bundleH4, i4, this.f14004e), pq0Var);
        } catch (Throwable th2) {
            za.i.f("Adapter failed to render app open ad.", th2);
            ls.h(aVar, th2, "adapter.loadRtbAppOpenAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.is
    public final void q3(String str, String str2, va.z2 z2Var, vb.a aVar, gs gsVar, fr frVar) throws RemoteException {
        try {
            pq0 pq0Var = new pq0(this, gsVar, frVar, 11);
            RtbAdapter rtbAdapter = this.f14000a;
            Context context = (Context) vb.b.U0(aVar);
            Bundle bundleI4 = i4(str2);
            Bundle bundleH4 = h4(z2Var);
            j4(z2Var);
            int i4 = z2Var.g;
            k4(str2, z2Var);
            rtbAdapter.loadRtbRewardedInterstitialAd(new bb.y(context, str, bundleI4, bundleH4, i4, this.f14004e), pq0Var);
        } catch (Throwable th2) {
            za.i.f("Adapter failed to render rewarded interstitial ad.", th2);
            ls.h(aVar, th2, "adapter.loadRtbRewardedInterstitialAd");
            throw new RemoteException();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (((java.lang.Boolean) va.s.f36163e.f36166c.a(com.google.android.gms.internal.ads.sk.f16096dd)).booleanValue() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
    
        if (r7.equals("app_open") != false) goto L35;
     */
    @Override // com.google.android.gms.internal.ads.is
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x0(vb.a r6, java.lang.String r7, android.os.Bundle r8, android.os.Bundle r9, va.c3 r10, com.google.android.gms.internal.ads.ks r11) throws android.os.RemoteException {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.mx0 r0 = new com.google.android.gms.internal.ads.mx0     // Catch: java.lang.Throwable -> L1f
            r0.<init>(r5, r11)     // Catch: java.lang.Throwable -> L1f
            com.google.android.gms.ads.mediation.rtb.RtbAdapter r11 = r5.f14000a     // Catch: java.lang.Throwable -> L1f
            bb.o r1 = new bb.o     // Catch: java.lang.Throwable -> L1f
            int r2 = r7.hashCode()     // Catch: java.lang.Throwable -> L1f
            pa.b r3 = pa.b.APP_OPEN_AD
            switch(r2) {
                case -1396342996: goto L67;
                case -1052618729: goto L5c;
                case -239580146: goto L51;
                case 604727084: goto L46;
                case 1167692200: goto L3d;
                case 1778294298: goto L22;
                case 1911491517: goto L14;
                default: goto L12;
            }
        L12:
            goto L96
        L14:
            java.lang.String r2 = "rewarded_interstitial"
            boolean r7 = r7.equals(r2)
            if (r7 == 0) goto L96
            pa.b r3 = pa.b.REWARDED_INTERSTITIAL     // Catch: java.lang.Throwable -> L1f
            goto L71
        L1f:
            r7 = move-exception
            goto L9e
        L22:
            java.lang.String r2 = "app_open_ad"
            boolean r7 = r7.equals(r2)
            if (r7 == 0) goto L96
            com.google.android.gms.internal.ads.pk r7 = com.google.android.gms.internal.ads.sk.f16096dd     // Catch: java.lang.Throwable -> L1f
            va.s r2 = va.s.f36163e     // Catch: java.lang.Throwable -> L1f
            com.google.android.gms.internal.ads.rk r2 = r2.f36166c     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r7 = r2.a(r7)     // Catch: java.lang.Throwable -> L1f
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L1f
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L1f
            if (r7 == 0) goto L96
            goto L71
        L3d:
            java.lang.String r2 = "app_open"
            boolean r7 = r7.equals(r2)
            if (r7 == 0) goto L96
            goto L71
        L46:
            java.lang.String r2 = "interstitial"
            boolean r7 = r7.equals(r2)
            if (r7 == 0) goto L96
            pa.b r3 = pa.b.INTERSTITIAL     // Catch: java.lang.Throwable -> L1f
            goto L71
        L51:
            java.lang.String r2 = "rewarded"
            boolean r7 = r7.equals(r2)
            if (r7 == 0) goto L96
            pa.b r3 = pa.b.REWARDED     // Catch: java.lang.Throwable -> L1f
            goto L71
        L5c:
            java.lang.String r2 = "native"
            boolean r7 = r7.equals(r2)
            if (r7 == 0) goto L96
            pa.b r3 = pa.b.NATIVE     // Catch: java.lang.Throwable -> L1f
            goto L71
        L67:
            java.lang.String r2 = "banner"
            boolean r7 = r7.equals(r2)
            if (r7 == 0) goto L96
            pa.b r3 = pa.b.BANNER     // Catch: java.lang.Throwable -> L1f
        L71:
            r1.<init>(r3, r9)     // Catch: java.lang.Throwable -> L1f
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1f
            r7.<init>()     // Catch: java.lang.Throwable -> L1f
            r7.add(r1)     // Catch: java.lang.Throwable -> L1f
            db.a r9 = new db.a     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r1 = vb.b.U0(r6)     // Catch: java.lang.Throwable -> L1f
            android.content.Context r1 = (android.content.Context) r1     // Catch: java.lang.Throwable -> L1f
            int r2 = r10.f36042e     // Catch: java.lang.Throwable -> L1f
            int r3 = r10.f36039b     // Catch: java.lang.Throwable -> L1f
            java.lang.String r10 = r10.f36038a     // Catch: java.lang.Throwable -> L1f
            pa.h r4 = new pa.h     // Catch: java.lang.Throwable -> L1f
            r4.<init>(r2, r3, r10)     // Catch: java.lang.Throwable -> L1f
            r9.<init>(r1, r7, r8)     // Catch: java.lang.Throwable -> L1f
            r11.collectSignals(r9, r0)     // Catch: java.lang.Throwable -> L1f
            return
        L96:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L1f
            java.lang.String r8 = "Internal Error"
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L1f
            throw r7     // Catch: java.lang.Throwable -> L1f
        L9e:
            java.lang.String r8 = "Error generating signals for RTB"
            za.i.f(r8, r7)
            java.lang.String r8 = "adapter.collectSignals"
            com.google.android.gms.internal.ads.ls.h(r6, r7, r8)
            android.os.RemoteException r6 = new android.os.RemoteException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ms.x0(vb.a, java.lang.String, android.os.Bundle, android.os.Bundle, va.c3, com.google.android.gms.internal.ads.ks):void");
    }

    @Override // com.google.android.gms.internal.ads.is
    public final va.a2 z1() {
        return null;
    }
}
