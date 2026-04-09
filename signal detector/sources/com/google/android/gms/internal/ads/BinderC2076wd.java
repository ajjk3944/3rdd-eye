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
import j2.C2552h;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import q2.C2852x0;

/* renamed from: com.google.android.gms.internal.ads.wd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC2076wd extends B7 implements InterfaceC1860sd {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f17450f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final RtbAdapter f17451a;

    /* renamed from: b, reason: collision with root package name */
    public i2.h f17452b;

    /* renamed from: c, reason: collision with root package name */
    public i2.m f17453c;

    /* renamed from: d, reason: collision with root package name */
    public i2.c f17454d;

    /* renamed from: e, reason: collision with root package name */
    public String f17455e;

    public BinderC2076wd(RtbAdapter rtbAdapter) {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        this.f17455e = "";
        this.f17451a = rtbAdapter;
    }

    public static final Bundle L3(String str) throws RemoteException {
        u2.k.h("Server parameters: ".concat(String.valueOf(str)));
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
        } catch (JSONException e6) {
            u2.k.f("", e6);
            throw new RemoteException();
        }
    }

    public static final boolean M3(q2.a1 a1Var) {
        if (a1Var.f23170f) {
            return true;
        }
        u2.f fVar = q2.r.f23260g.f23261a;
        return u2.f.o();
    }

    public static final String N3(String str, q2.a1 a1Var) {
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return a1Var.f23158I;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1860sd
    public final void A2(String str, String str2, q2.a1 a1Var, S2.a aVar, InterfaceC1429kd interfaceC1429kd, InterfaceC0688Qc interfaceC0688Qc, q2.d1 d1Var) throws RemoteException {
        try {
            RtbAdapter rtbAdapter = this.f17451a;
            L3(str2);
            K3(a1Var);
            M3(a1Var);
            N3(str2, a1Var);
            new C2552h(d1Var.f23192e, d1Var.f23189b, d1Var.f23188a);
            try {
                interfaceC1429kd.a(new C2852x0(7, rtbAdapter.getClass().getSimpleName().concat(" does not support interscroller ads."), "com.google.android.gms.ads", null, null));
            } catch (RemoteException e6) {
                u2.k.f("", e6);
            }
        } catch (Throwable th) {
            u2.k.f("Adapter failed to render interscroller ad.", th);
            AbstractC0709Rg.f(aVar, th, "adapter.loadRtbInterscrollerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1860sd
    public final boolean A3(S2.a aVar) {
        i2.m mVar = this.f17453c;
        if (mVar == null) {
            return false;
        }
        try {
            mVar.a((Context) S2.b.n1(aVar));
            return true;
        } catch (Throwable th) {
            u2.k.f("", th);
            AbstractC0709Rg.f(aVar, th, "adapter.showRtbRewardedAd");
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1860sd
    public final boolean E2(S2.a aVar) {
        i2.c cVar = this.f17454d;
        if (cVar == null) {
            return false;
        }
        try {
            cVar.a((Context) S2.b.n1(aVar));
            return true;
        } catch (Throwable th) {
            u2.k.f("", th);
            AbstractC0709Rg.f(aVar, th, "adapter.showRtbAppOpenAd");
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1860sd
    public final void E3(String str, String str2, q2.a1 a1Var, S2.a aVar, InterfaceC1645od interfaceC1645od, InterfaceC0688Qc interfaceC0688Qc, C0499Fa c0499Fa) throws RemoteException {
        RtbAdapter rtbAdapter = this.f17451a;
        try {
            L6 l6 = new L6(this, interfaceC1645od, interfaceC0688Qc);
            Context context = (Context) S2.b.n1(aVar);
            Bundle bundleL3 = L3(str2);
            K3(a1Var);
            M3(a1Var);
            N3(str2, a1Var);
            rtbAdapter.loadRtbNativeAdMapper(new w2.r(context, bundleL3, str, this.f17455e), l6);
        } catch (Throwable th) {
            u2.k.f("Adapter failed to render native ad.", th);
            AbstractC0709Rg.f(aVar, th, "adapter.loadRtbNativeAdMapper");
            String message = th.getMessage();
            if (TextUtils.isEmpty(message) || !message.equals("Method is not found")) {
                throw new RemoteException();
            }
            try {
                C0889ae c0889ae = new C0889ae(this, interfaceC1645od, interfaceC0688Qc, 10);
                Context context2 = (Context) S2.b.n1(aVar);
                Bundle bundleL32 = L3(str2);
                K3(a1Var);
                M3(a1Var);
                N3(str2, a1Var);
                rtbAdapter.loadRtbNativeAd(new w2.r(context2, bundleL32, str, this.f17455e), c0889ae);
            } catch (Throwable th2) {
                u2.k.f("Adapter failed to render native ad.", th2);
                AbstractC0709Rg.f(aVar, th2, "adapter.loadRtbNativeAd");
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.B7
    public final boolean J3(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        InterfaceC1968ud c1914td = null;
        InterfaceC1323id c1269hd = null;
        InterfaceC1645od c1591nd = null;
        InterfaceC1429kd c1375jd = null;
        InterfaceC1753qd c1699pd = null;
        InterfaceC1645od c1591nd2 = null;
        InterfaceC1753qd c1699pd2 = null;
        InterfaceC1537md c1483ld = null;
        InterfaceC1429kd c1375jd2 = null;
        if (i == 1) {
            S2.a aVarD1 = S2.b.d1(parcel.readStrongBinder());
            String string = parcel.readString();
            Parcelable.Creator creator = Bundle.CREATOR;
            Bundle bundle = (Bundle) C7.b(parcel, creator);
            Bundle bundle2 = (Bundle) C7.b(parcel, creator);
            q2.d1 d1Var = (q2.d1) C7.b(parcel, q2.d1.CREATOR);
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                c1914td = iInterfaceQueryLocalInterface instanceof InterfaceC1968ud ? (InterfaceC1968ud) iInterfaceQueryLocalInterface : new C1914td(strongBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback", 2);
            }
            C7.f(parcel);
            e3(aVarD1, string, bundle, bundle2, d1Var, c1914td);
            parcel2.writeNoException();
            return true;
        }
        if (i == 2) {
            C2184yd c2184ydD = d();
            parcel2.writeNoException();
            C7.d(parcel2, c2184ydD);
            return true;
        }
        if (i == 3) {
            C2184yd c2184ydE = e();
            parcel2.writeNoException();
            C7.d(parcel2, c2184ydE);
            return true;
        }
        if (i == 5) {
            q2.B0 b0G = g();
            parcel2.writeNoException();
            C7.e(parcel2, b0G);
            return true;
        }
        if (i == 10) {
            S2.b.d1(parcel.readStrongBinder());
            C7.f(parcel);
            parcel2.writeNoException();
            return true;
        }
        if (i == 11) {
            parcel.createStringArray();
            C7.f(parcel);
            parcel2.writeNoException();
            return true;
        }
        switch (i) {
            case 13:
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                q2.a1 a1Var = (q2.a1) C7.b(parcel, q2.a1.CREATOR);
                S2.a aVarD12 = S2.b.d1(parcel.readStrongBinder());
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                    c1375jd2 = iInterfaceQueryLocalInterface2 instanceof InterfaceC1429kd ? (InterfaceC1429kd) iInterfaceQueryLocalInterface2 : new C1375jd(strongBinder2);
                }
                InterfaceC1429kd interfaceC1429kd = c1375jd2;
                InterfaceC0688Qc interfaceC0688QcK3 = AbstractBinderC0671Pc.K3(parcel.readStrongBinder());
                q2.d1 d1Var2 = (q2.d1) C7.b(parcel, q2.d1.CREATOR);
                C7.f(parcel);
                Q2(string2, string3, a1Var, aVarD12, interfaceC1429kd, interfaceC0688QcK3, d1Var2);
                parcel2.writeNoException();
                break;
            case 14:
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                q2.a1 a1Var2 = (q2.a1) C7.b(parcel, q2.a1.CREATOR);
                S2.a aVarD13 = S2.b.d1(parcel.readStrongBinder());
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                    c1483ld = iInterfaceQueryLocalInterface3 instanceof InterfaceC1537md ? (InterfaceC1537md) iInterfaceQueryLocalInterface3 : new C1483ld(strongBinder3, "com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback", 2);
                }
                InterfaceC0688Qc interfaceC0688QcK32 = AbstractBinderC0671Pc.K3(parcel.readStrongBinder());
                C7.f(parcel);
                c1(string4, string5, a1Var2, aVarD13, c1483ld, interfaceC0688QcK32);
                parcel2.writeNoException();
                break;
            case 15:
                S2.a aVarD14 = S2.b.d1(parcel.readStrongBinder());
                C7.f(parcel);
                boolean zO2 = O2(aVarD14);
                parcel2.writeNoException();
                parcel2.writeInt(zO2 ? 1 : 0);
                break;
            case 16:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                q2.a1 a1Var3 = (q2.a1) C7.b(parcel, q2.a1.CREATOR);
                S2.a aVarD15 = S2.b.d1(parcel.readStrongBinder());
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                    c1699pd2 = iInterfaceQueryLocalInterface4 instanceof InterfaceC1753qd ? (InterfaceC1753qd) iInterfaceQueryLocalInterface4 : new C1699pd(strongBinder4);
                }
                InterfaceC0688Qc interfaceC0688QcK33 = AbstractBinderC0671Pc.K3(parcel.readStrongBinder());
                C7.f(parcel);
                t0(string6, string7, a1Var3, aVarD15, c1699pd2, interfaceC0688QcK33);
                parcel2.writeNoException();
                break;
            case 17:
                S2.a aVarD16 = S2.b.d1(parcel.readStrongBinder());
                C7.f(parcel);
                boolean zA3 = A3(aVarD16);
                parcel2.writeNoException();
                parcel2.writeInt(zA3 ? 1 : 0);
                break;
            case 18:
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                q2.a1 a1Var4 = (q2.a1) C7.b(parcel, q2.a1.CREATOR);
                S2.a aVarD17 = S2.b.d1(parcel.readStrongBinder());
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                    c1591nd2 = iInterfaceQueryLocalInterface5 instanceof InterfaceC1645od ? (InterfaceC1645od) iInterfaceQueryLocalInterface5 : new C1591nd(strongBinder5);
                }
                InterfaceC0688Qc interfaceC0688QcK34 = AbstractBinderC0671Pc.K3(parcel.readStrongBinder());
                C7.f(parcel);
                E3(string8, string9, a1Var4, aVarD17, c1591nd2, interfaceC0688QcK34, null);
                parcel2.writeNoException();
                break;
            case 19:
                String string10 = parcel.readString();
                C7.f(parcel);
                this.f17455e = string10;
                parcel2.writeNoException();
                break;
            case 20:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                q2.a1 a1Var5 = (q2.a1) C7.b(parcel, q2.a1.CREATOR);
                S2.a aVarD18 = S2.b.d1(parcel.readStrongBinder());
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                    c1699pd = iInterfaceQueryLocalInterface6 instanceof InterfaceC1753qd ? (InterfaceC1753qd) iInterfaceQueryLocalInterface6 : new C1699pd(strongBinder6);
                }
                InterfaceC0688Qc interfaceC0688QcK35 = AbstractBinderC0671Pc.K3(parcel.readStrongBinder());
                C7.f(parcel);
                h2(string11, string12, a1Var5, aVarD18, c1699pd, interfaceC0688QcK35);
                parcel2.writeNoException();
                break;
            case 21:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                q2.a1 a1Var6 = (q2.a1) C7.b(parcel, q2.a1.CREATOR);
                S2.a aVarD19 = S2.b.d1(parcel.readStrongBinder());
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                    c1375jd = iInterfaceQueryLocalInterface7 instanceof InterfaceC1429kd ? (InterfaceC1429kd) iInterfaceQueryLocalInterface7 : new C1375jd(strongBinder7);
                }
                InterfaceC1429kd interfaceC1429kd2 = c1375jd;
                InterfaceC0688Qc interfaceC0688QcK36 = AbstractBinderC0671Pc.K3(parcel.readStrongBinder());
                q2.d1 d1Var3 = (q2.d1) C7.b(parcel, q2.d1.CREATOR);
                C7.f(parcel);
                A2(string13, string14, a1Var6, aVarD19, interfaceC1429kd2, interfaceC0688QcK36, d1Var3);
                parcel2.writeNoException();
                break;
            case 22:
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                q2.a1 a1Var7 = (q2.a1) C7.b(parcel, q2.a1.CREATOR);
                S2.a aVarD110 = S2.b.d1(parcel.readStrongBinder());
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                    c1591nd = iInterfaceQueryLocalInterface8 instanceof InterfaceC1645od ? (InterfaceC1645od) iInterfaceQueryLocalInterface8 : new C1591nd(strongBinder8);
                }
                InterfaceC0688Qc interfaceC0688QcK37 = AbstractBinderC0671Pc.K3(parcel.readStrongBinder());
                C0499Fa c0499Fa = (C0499Fa) C7.b(parcel, C0499Fa.CREATOR);
                C7.f(parcel);
                E3(string15, string16, a1Var7, aVarD110, c1591nd, interfaceC0688QcK37, c0499Fa);
                parcel2.writeNoException();
                break;
            case 23:
                String string17 = parcel.readString();
                String string18 = parcel.readString();
                q2.a1 a1Var8 = (q2.a1) C7.b(parcel, q2.a1.CREATOR);
                S2.a aVarD111 = S2.b.d1(parcel.readStrongBinder());
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
                    c1269hd = iInterfaceQueryLocalInterface9 instanceof InterfaceC1323id ? (InterfaceC1323id) iInterfaceQueryLocalInterface9 : new C1269hd(strongBinder9, "com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback", 2);
                }
                InterfaceC0688Qc interfaceC0688QcK38 = AbstractBinderC0671Pc.K3(parcel.readStrongBinder());
                C7.f(parcel);
                y3(string17, string18, a1Var8, aVarD111, c1269hd, interfaceC0688QcK38);
                parcel2.writeNoException();
                break;
            case 24:
                S2.a aVarD112 = S2.b.d1(parcel.readStrongBinder());
                C7.f(parcel);
                boolean zE2 = E2(aVarD112);
                parcel2.writeNoException();
                parcel2.writeInt(zE2 ? 1 : 0);
                break;
        }
        return true;
    }

    public final Bundle K3(q2.a1 a1Var) {
        Bundle bundle;
        Bundle bundle2 = a1Var.f23176m;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.f17451a.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1860sd
    public final boolean O2(S2.a aVar) {
        i2.h hVar = this.f17452b;
        if (hVar == null) {
            return false;
        }
        try {
            hVar.a((Context) S2.b.n1(aVar));
            return true;
        } catch (Throwable th) {
            u2.k.f("", th);
            AbstractC0709Rg.f(aVar, th, "adapter.showRtbInterstitialAd");
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1860sd
    public final void Q2(String str, String str2, q2.a1 a1Var, S2.a aVar, InterfaceC1429kd interfaceC1429kd, InterfaceC0688Qc interfaceC0688Qc, q2.d1 d1Var) throws RemoteException {
        try {
            C0697Ql c0697Ql = new C0697Ql(this, interfaceC1429kd, interfaceC0688Qc, 8);
            RtbAdapter rtbAdapter = this.f17451a;
            Context context = (Context) S2.b.n1(aVar);
            Bundle bundleL3 = L3(str2);
            K3(a1Var);
            M3(a1Var);
            N3(str2, a1Var);
            rtbAdapter.loadRtbBannerAd(new w2.k(context, str, bundleL3, new C2552h(d1Var.f23192e, d1Var.f23189b, d1Var.f23188a), this.f17455e), c0697Ql);
        } catch (Throwable th) {
            u2.k.f("Adapter failed to render banner ad.", th);
            AbstractC0709Rg.f(aVar, th, "adapter.loadRtbBannerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1860sd
    public final void c1(String str, String str2, q2.a1 a1Var, S2.a aVar, InterfaceC1537md interfaceC1537md, InterfaceC0688Qc interfaceC0688Qc) throws RemoteException {
        try {
            C1338iu c1338iu = new C1338iu(this, interfaceC1537md, interfaceC0688Qc, 9);
            RtbAdapter rtbAdapter = this.f17451a;
            Context context = (Context) S2.b.n1(aVar);
            Bundle bundleL3 = L3(str2);
            K3(a1Var);
            M3(a1Var);
            N3(str2, a1Var);
            rtbAdapter.loadRtbInterstitialAd(new w2.o(context, bundleL3, str, this.f17455e), c1338iu);
        } catch (Throwable th) {
            u2.k.f("Adapter failed to render interstitial ad.", th);
            AbstractC0709Rg.f(aVar, th, "adapter.loadRtbInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1860sd
    public final C2184yd d() {
        j2.r versionInfo = this.f17451a.getVersionInfo();
        return new C2184yd(versionInfo.f21357a, versionInfo.f21358b, versionInfo.f21359c);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1860sd
    public final C2184yd e() {
        j2.r sDKVersionInfo = this.f17451a.getSDKVersionInfo();
        return new C2184yd(sDKVersionInfo.f21357a, sDKVersionInfo.f21358b, sDKVersionInfo.f21359c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    @Override // com.google.android.gms.internal.ads.InterfaceC1860sd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e3(S2.a r5, java.lang.String r6, android.os.Bundle r7, android.os.Bundle r8, q2.d1 r9, com.google.android.gms.internal.ads.InterfaceC1968ud r10) throws android.os.RemoteException {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.hr r0 = new com.google.android.gms.internal.ads.hr     // Catch: java.lang.Throwable -> L79
            r1 = 9
            r0.<init>(r4, r1, r10)     // Catch: java.lang.Throwable -> L79
            com.google.android.gms.ads.mediation.rtb.RtbAdapter r10 = r4.f17451a     // Catch: java.lang.Throwable -> L79
            w2.m r1 = new w2.m     // Catch: java.lang.Throwable -> L79
            int r2 = r6.hashCode()     // Catch: java.lang.Throwable -> L79
            switch(r2) {
                case -1396342996: goto L4f;
                case -1052618729: goto L45;
                case -239580146: goto L3b;
                case 604727084: goto L31;
                case 1167692200: goto L27;
                case 1778294298: goto L1d;
                case 1911491517: goto L13;
                default: goto L12;
            }
        L12:
            goto L59
        L13:
            java.lang.String r2 = "rewarded_interstitial"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L59
            r6 = 3
            goto L5a
        L1d:
            java.lang.String r2 = "app_open_ad"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L59
            r6 = 6
            goto L5a
        L27:
            java.lang.String r2 = "app_open"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L59
            r6 = 5
            goto L5a
        L31:
            java.lang.String r2 = "interstitial"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L59
            r6 = 1
            goto L5a
        L3b:
            java.lang.String r2 = "rewarded"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L59
            r6 = 2
            goto L5a
        L45:
            java.lang.String r2 = "native"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L59
            r6 = 4
            goto L5a
        L4f:
            java.lang.String r2 = "banner"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L59
            r6 = 0
            goto L5a
        L59:
            r6 = -1
        L5a:
            switch(r6) {
                case 0: goto L7b;
                case 1: goto L7b;
                case 2: goto L7b;
                case 3: goto L7b;
                case 4: goto L7b;
                case 5: goto L7b;
                case 6: goto L5e;
                default: goto L5d;
            }
        L5d:
            goto L71
        L5e:
            com.google.android.gms.internal.ads.E9 r6 = com.google.android.gms.internal.ads.H9.bd     // Catch: java.lang.Throwable -> L79
            q2.s r2 = q2.C2841s.f23267e     // Catch: java.lang.Throwable -> L79
            com.google.android.gms.internal.ads.G9 r2 = r2.f23270c     // Catch: java.lang.Throwable -> L79
            java.lang.Object r6 = r2.a(r6)     // Catch: java.lang.Throwable -> L79
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L79
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L79
            if (r6 == 0) goto L71
            goto L7b
        L71:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L79
            java.lang.String r7 = "Internal Error"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L79
            throw r6     // Catch: java.lang.Throwable -> L79
        L79:
            r6 = move-exception
            goto La0
        L7b:
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L79
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L79
            r6.<init>()     // Catch: java.lang.Throwable -> L79
            r6.add(r1)     // Catch: java.lang.Throwable -> L79
            y2.a r6 = new y2.a     // Catch: java.lang.Throwable -> L79
            java.lang.Object r8 = S2.b.n1(r5)     // Catch: java.lang.Throwable -> L79
            android.content.Context r8 = (android.content.Context) r8     // Catch: java.lang.Throwable -> L79
            int r1 = r9.f23192e     // Catch: java.lang.Throwable -> L79
            int r2 = r9.f23189b     // Catch: java.lang.Throwable -> L79
            java.lang.String r9 = r9.f23188a     // Catch: java.lang.Throwable -> L79
            j2.h r3 = new j2.h     // Catch: java.lang.Throwable -> L79
            r3.<init>(r1, r2, r9)     // Catch: java.lang.Throwable -> L79
            r6.<init>(r8, r7)     // Catch: java.lang.Throwable -> L79
            r10.collectSignals(r6, r0)     // Catch: java.lang.Throwable -> L79
            return
        La0:
            java.lang.String r7 = "Error generating signals for RTB"
            u2.k.f(r7, r6)
            java.lang.String r7 = "adapter.collectSignals"
            com.google.android.gms.internal.ads.AbstractC0709Rg.f(r5, r6, r7)
            android.os.RemoteException r5 = new android.os.RemoteException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.BinderC2076wd.e3(S2.a, java.lang.String, android.os.Bundle, android.os.Bundle, q2.d1, com.google.android.gms.internal.ads.ud):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1860sd
    public final void f1(String str, String str2, q2.a1 a1Var, S2.b bVar, BinderC0549Hq binderC0549Hq, InterfaceC0688Qc interfaceC0688Qc) throws RemoteException {
        E3(str, str2, a1Var, bVar, binderC0549Hq, interfaceC0688Qc, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1860sd
    public final q2.B0 g() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1860sd
    public final void h2(String str, String str2, q2.a1 a1Var, S2.a aVar, InterfaceC1753qd interfaceC1753qd, InterfaceC0688Qc interfaceC0688Qc) throws RemoteException {
        try {
            C1338iu c1338iu = new C1338iu(this, interfaceC1753qd, interfaceC0688Qc, 11);
            RtbAdapter rtbAdapter = this.f17451a;
            Context context = (Context) S2.b.n1(aVar);
            Bundle bundleL3 = L3(str2);
            K3(a1Var);
            M3(a1Var);
            N3(str2, a1Var);
            rtbAdapter.loadRtbRewardedInterstitialAd(new w2.u(context, bundleL3, str, this.f17455e), c1338iu);
        } catch (Throwable th) {
            u2.k.f("Adapter failed to render rewarded interstitial ad.", th);
            AbstractC0709Rg.f(aVar, th, "adapter.loadRtbRewardedInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1860sd
    public final void t0(String str, String str2, q2.a1 a1Var, S2.a aVar, InterfaceC1753qd interfaceC1753qd, InterfaceC0688Qc interfaceC0688Qc) throws RemoteException {
        try {
            C1338iu c1338iu = new C1338iu(this, interfaceC1753qd, interfaceC0688Qc, 11);
            RtbAdapter rtbAdapter = this.f17451a;
            Context context = (Context) S2.b.n1(aVar);
            Bundle bundleL3 = L3(str2);
            K3(a1Var);
            M3(a1Var);
            N3(str2, a1Var);
            rtbAdapter.loadRtbRewardedAd(new w2.u(context, bundleL3, str, this.f17455e), c1338iu);
        } catch (Throwable th) {
            u2.k.f("Adapter failed to render rewarded ad.", th);
            AbstractC0709Rg.f(aVar, th, "adapter.loadRtbRewardedAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1860sd
    public final void y3(String str, String str2, q2.a1 a1Var, S2.a aVar, InterfaceC1323id interfaceC1323id, InterfaceC0688Qc interfaceC0688Qc) throws RemoteException {
        try {
            C1338iu c1338iu = new C1338iu(this, interfaceC1323id, interfaceC0688Qc, 10);
            RtbAdapter rtbAdapter = this.f17451a;
            Context context = (Context) S2.b.n1(aVar);
            Bundle bundleL3 = L3(str2);
            K3(a1Var);
            M3(a1Var);
            N3(str2, a1Var);
            rtbAdapter.loadRtbAppOpenAd(new w2.i(context, bundleL3, str, this.f17455e), c1338iu);
        } catch (Throwable th) {
            u2.k.f("Adapter failed to render app open ad.", th);
            AbstractC0709Rg.f(aVar, th, "adapter.loadRtbAppOpenAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1860sd
    public final void z2(String str) {
        this.f17455e = str;
    }
}
