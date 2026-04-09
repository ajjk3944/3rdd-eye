package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import j$.util.Objects;
import j2.C2545a;
import j2.C2552h;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import w2.AbstractC2969a;

/* renamed from: com.google.android.gms.internal.ads.cd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0997cd extends B7 implements InterfaceC0637Nc {

    /* renamed from: a, reason: collision with root package name */
    public final Object f13576a;

    /* renamed from: b, reason: collision with root package name */
    public C1338iu f13577b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC0503Fe f13578c;

    /* renamed from: d, reason: collision with root package name */
    public S2.a f13579d;

    /* renamed from: e, reason: collision with root package name */
    public FrameLayout f13580e;

    /* renamed from: f, reason: collision with root package name */
    public i2.h f13581f;

    /* renamed from: g, reason: collision with root package name */
    public w2.w f13582g;

    /* renamed from: h, reason: collision with root package name */
    public i2.m f13583h;
    public i2.c i;

    /* renamed from: j, reason: collision with root package name */
    public final String f13584j;

    public BinderC0997cd() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
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

    @Override // com.google.android.gms.internal.ads.InterfaceC0637Nc
    public final boolean G() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0637Nc
    public final q2.B0 H() {
        Object obj = this.f13576a;
        if (obj instanceof AbstractAdViewAdapter) {
            try {
                return ((AbstractAdViewAdapter) obj).getVideoController();
            } catch (Throwable th) {
                u2.k.f("", th);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0637Nc
    public final void I() throws RemoteException {
        Object obj = this.f13576a;
        if (obj instanceof AbstractC2969a) {
            i2.m mVar = this.f13583h;
            if (mVar == null) {
                u2.k.e("Can not show null mediated rewarded ad.");
                throw new RemoteException();
            }
            try {
                mVar.a((Context) S2.b.n1(this.f13579d));
                return;
            } catch (RuntimeException e6) {
                AbstractC0709Rg.f(this.f13579d, e6, "adapter.showVideo");
                throw e6;
            }
        }
        String canonicalName = AbstractC2969a.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        u2.k.h(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0637Nc
    public final InterfaceC0790Wc J() {
        w2.w wVar;
        com.google.ads.mediation.a aVar;
        Object obj = this.f13576a;
        if (!(obj instanceof MediationNativeAdapter)) {
            if (!(obj instanceof AbstractC2969a) || (wVar = this.f13582g) == null) {
                return null;
            }
            return new BinderC1215gd(wVar);
        }
        C1338iu c1338iu = this.f13577b;
        if (c1338iu == null || (aVar = (com.google.ads.mediation.a) c1338iu.f14823c) == null) {
            return null;
        }
        return new BinderC1215gd(aVar);
    }

    @Override // com.google.android.gms.internal.ads.B7
    public final boolean J3(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        InterfaceC0503Fe c0469De;
        Rx rx;
        InterfaceC0688Qc c0654Oc = null;
        InterfaceC0688Qc c0654Oc2 = null;
        InterfaceC0688Qc c0654Oc3 = null;
        InterfaceC0688Qc c0654Oc4 = null;
        InterfaceC0806Xb c0789Wb = null;
        InterfaceC0688Qc c0654Oc5 = null;
        interfaceC0839Za = null;
        InterfaceC0839Za interfaceC0839Za = null;
        InterfaceC0688Qc c0654Oc6 = null;
        InterfaceC0503Fe c0469De2 = null;
        InterfaceC0688Qc c0654Oc7 = null;
        InterfaceC0688Qc c0654Oc8 = null;
        InterfaceC0688Qc c0654Oc9 = null;
        switch (i) {
            case 1:
                S2.a aVarD1 = S2.b.d1(parcel.readStrongBinder());
                q2.d1 d1Var = (q2.d1) C7.b(parcel, q2.d1.CREATOR);
                q2.a1 a1Var = (q2.a1) C7.b(parcel, q2.a1.CREATOR);
                String string = parcel.readString();
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c0654Oc = iInterfaceQueryLocalInterface instanceof InterfaceC0688Qc ? (InterfaceC0688Qc) iInterfaceQueryLocalInterface : new C0654Oc(strongBinder);
                }
                C7.f(parcel);
                Z1(aVarD1, d1Var, a1Var, string, null, c0654Oc);
                parcel2.writeNoException();
                return true;
            case 2:
                S2.a aVarD = d();
                parcel2.writeNoException();
                C7.e(parcel2, aVarD);
                return true;
            case 3:
                S2.a aVarD12 = S2.b.d1(parcel.readStrongBinder());
                q2.a1 a1Var2 = (q2.a1) C7.b(parcel, q2.a1.CREATOR);
                String string2 = parcel.readString();
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c0654Oc9 = iInterfaceQueryLocalInterface2 instanceof InterfaceC0688Qc ? (InterfaceC0688Qc) iInterfaceQueryLocalInterface2 : new C0654Oc(strongBinder2);
                }
                InterfaceC0688Qc interfaceC0688Qc = c0654Oc9;
                C7.f(parcel);
                b2(aVarD12, a1Var2, string2, null, interfaceC0688Qc);
                parcel2.writeNoException();
                return true;
            case 4:
                g();
                parcel2.writeNoException();
                return true;
            case 5:
                j();
                parcel2.writeNoException();
                return true;
            case 6:
                S2.a aVarD13 = S2.b.d1(parcel.readStrongBinder());
                q2.d1 d1Var2 = (q2.d1) C7.b(parcel, q2.d1.CREATOR);
                q2.a1 a1Var3 = (q2.a1) C7.b(parcel, q2.a1.CREATOR);
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c0654Oc8 = iInterfaceQueryLocalInterface3 instanceof InterfaceC0688Qc ? (InterfaceC0688Qc) iInterfaceQueryLocalInterface3 : new C0654Oc(strongBinder3);
                }
                C7.f(parcel);
                Z1(aVarD13, d1Var2, a1Var3, string3, string4, c0654Oc8);
                parcel2.writeNoException();
                return true;
            case 7:
                S2.a aVarD14 = S2.b.d1(parcel.readStrongBinder());
                q2.a1 a1Var4 = (q2.a1) C7.b(parcel, q2.a1.CREATOR);
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c0654Oc7 = iInterfaceQueryLocalInterface4 instanceof InterfaceC0688Qc ? (InterfaceC0688Qc) iInterfaceQueryLocalInterface4 : new C0654Oc(strongBinder4);
                }
                InterfaceC0688Qc interfaceC0688Qc2 = c0654Oc7;
                C7.f(parcel);
                b2(aVarD14, a1Var4, string5, string6, interfaceC0688Qc2);
                parcel2.writeNoException();
                return true;
            case 8:
                i();
                parcel2.writeNoException();
                return true;
            case 9:
                n();
                parcel2.writeNoException();
                return true;
            case 10:
                S2.a aVarD15 = S2.b.d1(parcel.readStrongBinder());
                q2.a1 a1Var5 = (q2.a1) C7.b(parcel, q2.a1.CREATOR);
                parcel.readString();
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                    c0469De2 = iInterfaceQueryLocalInterface5 instanceof InterfaceC0503Fe ? (InterfaceC0503Fe) iInterfaceQueryLocalInterface5 : new C0469De(strongBinder5, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener", 2);
                }
                String string7 = parcel.readString();
                C7.f(parcel);
                e1(aVarD15, a1Var5, c0469De2, string7);
                parcel2.writeNoException();
                return true;
            case 11:
                q2.a1 a1Var6 = (q2.a1) C7.b(parcel, q2.a1.CREATOR);
                String string8 = parcel.readString();
                C7.f(parcel);
                O3(string8, a1Var6);
                parcel2.writeNoException();
                return true;
            case 12:
                I();
                parcel2.writeNoException();
                return true;
            case 13:
                boolean zL = l();
                parcel2.writeNoException();
                ClassLoader classLoader = C7.f7544a;
                parcel2.writeInt(zL ? 1 : 0);
                return true;
            case 14:
                S2.a aVarD16 = S2.b.d1(parcel.readStrongBinder());
                q2.a1 a1Var7 = (q2.a1) C7.b(parcel, q2.a1.CREATOR);
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c0654Oc6 = iInterfaceQueryLocalInterface6 instanceof InterfaceC0688Qc ? (InterfaceC0688Qc) iInterfaceQueryLocalInterface6 : new C0654Oc(strongBinder6);
                }
                InterfaceC0688Qc interfaceC0688Qc3 = c0654Oc6;
                C0499Fa c0499Fa = (C0499Fa) C7.b(parcel, C0499Fa.CREATOR);
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                C7.f(parcel);
                k3(aVarD16, a1Var7, string9, string10, interfaceC0688Qc3, c0499Fa, arrayListCreateStringArrayList);
                parcel2.writeNoException();
                return true;
            case 15:
                parcel2.writeNoException();
                ClassLoader classLoader2 = C7.f7544a;
                parcel2.writeStrongBinder(null);
                return true;
            case 16:
                parcel2.writeNoException();
                ClassLoader classLoader3 = C7.f7544a;
                parcel2.writeStrongBinder(null);
                return true;
            case 17:
                Bundle bundle = new Bundle();
                parcel2.writeNoException();
                C7.d(parcel2, bundle);
                return true;
            case 18:
                Bundle bundle2 = new Bundle();
                parcel2.writeNoException();
                C7.d(parcel2, bundle2);
                return true;
            case 19:
                Bundle bundle3 = new Bundle();
                parcel2.writeNoException();
                C7.d(parcel2, bundle3);
                return true;
            case 20:
                q2.a1 a1Var8 = (q2.a1) C7.b(parcel, q2.a1.CREATOR);
                String string11 = parcel.readString();
                parcel.readString();
                C7.f(parcel);
                O3(string11, a1Var8);
                parcel2.writeNoException();
                return true;
            case 21:
                S2.a aVarD17 = S2.b.d1(parcel.readStrongBinder());
                C7.f(parcel);
                m0(aVarD17);
                parcel2.writeNoException();
                return true;
            case 22:
                parcel2.writeNoException();
                ClassLoader classLoader4 = C7.f7544a;
                parcel2.writeInt(0);
                return true;
            case 23:
                S2.a aVarD18 = S2.b.d1(parcel.readStrongBinder());
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                    c0469De = iInterfaceQueryLocalInterface7 instanceof InterfaceC0503Fe ? (InterfaceC0503Fe) iInterfaceQueryLocalInterface7 : new C0469De(strongBinder7, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener", 2);
                } else {
                    c0469De = null;
                }
                ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
                C7.f(parcel);
                g3(aVarD18, c0469De, arrayListCreateStringArrayList2);
                throw null;
            case 24:
                C1338iu c1338iu = this.f13577b;
                if (c1338iu != null && (rx = (Rx) c1338iu.f14824d) != null) {
                    interfaceC0839Za = (InterfaceC0839Za) rx.f11090b;
                }
                parcel2.writeNoException();
                C7.e(parcel2, interfaceC0839Za);
                return true;
            case 25:
                boolean zA = C7.a(parcel);
                C7.f(parcel);
                O1(zA);
                parcel2.writeNoException();
                return true;
            case 26:
                q2.B0 b0H = H();
                parcel2.writeNoException();
                C7.e(parcel2, b0H);
                return true;
            case 27:
                InterfaceC0790Wc interfaceC0790WcJ = J();
                parcel2.writeNoException();
                C7.e(parcel2, interfaceC0790WcJ);
                return true;
            case 28:
                S2.a aVarD19 = S2.b.d1(parcel.readStrongBinder());
                q2.a1 a1Var9 = (q2.a1) C7.b(parcel, q2.a1.CREATOR);
                String string12 = parcel.readString();
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c0654Oc5 = iInterfaceQueryLocalInterface8 instanceof InterfaceC0688Qc ? (InterfaceC0688Qc) iInterfaceQueryLocalInterface8 : new C0654Oc(strongBinder8);
                }
                C7.f(parcel);
                y0(aVarD19, a1Var9, string12, c0654Oc5);
                parcel2.writeNoException();
                return true;
            case 29:
            default:
                return false;
            case 30:
                S2.a aVarD110 = S2.b.d1(parcel.readStrongBinder());
                C7.f(parcel);
                Q0(aVarD110);
                parcel2.writeNoException();
                return true;
            case 31:
                S2.a aVarD111 = S2.b.d1(parcel.readStrongBinder());
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
                    c0789Wb = iInterfaceQueryLocalInterface9 instanceof InterfaceC0806Xb ? (InterfaceC0806Xb) iInterfaceQueryLocalInterface9 : new C0789Wb(strongBinder9, "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback", 2);
                }
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(C0887ac.CREATOR);
                C7.f(parcel);
                e2(aVarD111, c0789Wb, arrayListCreateTypedArrayList);
                parcel2.writeNoException();
                return true;
            case 32:
                S2.a aVarD112 = S2.b.d1(parcel.readStrongBinder());
                q2.a1 a1Var10 = (q2.a1) C7.b(parcel, q2.a1.CREATOR);
                String string13 = parcel.readString();
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c0654Oc4 = iInterfaceQueryLocalInterface10 instanceof InterfaceC0688Qc ? (InterfaceC0688Qc) iInterfaceQueryLocalInterface10 : new C0654Oc(strongBinder10);
                }
                C7.f(parcel);
                P1(aVarD112, a1Var10, string13, c0654Oc4);
                parcel2.writeNoException();
                return true;
            case 33:
                C2184yd c2184ydK = K();
                parcel2.writeNoException();
                C7.d(parcel2, c2184ydK);
                return true;
            case 34:
                C2184yd c2184ydS3 = s3();
                parcel2.writeNoException();
                C7.d(parcel2, c2184ydS3);
                return true;
            case 35:
                S2.a aVarD113 = S2.b.d1(parcel.readStrongBinder());
                q2.d1 d1Var3 = (q2.d1) C7.b(parcel, q2.d1.CREATOR);
                q2.a1 a1Var11 = (q2.a1) C7.b(parcel, q2.a1.CREATOR);
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c0654Oc3 = iInterfaceQueryLocalInterface11 instanceof InterfaceC0688Qc ? (InterfaceC0688Qc) iInterfaceQueryLocalInterface11 : new C0654Oc(strongBinder11);
                }
                C7.f(parcel);
                U2(aVarD113, d1Var3, a1Var11, string14, string15, c0654Oc3);
                parcel2.writeNoException();
                return true;
            case TTAdConstant.CONVERSION_LINK_AUTO_OPEN_INSTANT_PANEL_WHEN_VIDEO_FINISHED /* 36 */:
                parcel2.writeNoException();
                ClassLoader classLoader5 = C7.f7544a;
                parcel2.writeStrongBinder(null);
                return true;
            case 37:
                S2.a aVarD114 = S2.b.d1(parcel.readStrongBinder());
                C7.f(parcel);
                h3(aVarD114);
                parcel2.writeNoException();
                return true;
            case TTAdConstant.CONVERSION_LINK_LANDING_PAGE_CEILING /* 38 */:
                S2.a aVarD115 = S2.b.d1(parcel.readStrongBinder());
                q2.a1 a1Var12 = (q2.a1) C7.b(parcel, q2.a1.CREATOR);
                String string16 = parcel.readString();
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c0654Oc2 = iInterfaceQueryLocalInterface12 instanceof InterfaceC0688Qc ? (InterfaceC0688Qc) iInterfaceQueryLocalInterface12 : new C0654Oc(strongBinder12);
                }
                C7.f(parcel);
                w0(aVarD115, a1Var12, string16, c0654Oc2);
                parcel2.writeNoException();
                return true;
            case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_NEW /* 39 */:
                S2.a aVarD116 = S2.b.d1(parcel.readStrongBinder());
                C7.f(parcel);
                V0(aVarD116);
                parcel2.writeNoException();
                return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0637Nc
    public final C2184yd K() {
        Object obj = this.f13576a;
        if (!(obj instanceof AbstractC2969a)) {
            return null;
        }
        j2.r versionInfo = ((AbstractC2969a) obj).getVersionInfo();
        return new C2184yd(versionInfo.f21357a, versionInfo.f21358b, versionInfo.f21359c);
    }

    public final Bundle K3(String str, q2.a1 a1Var, String str2) throws RemoteException {
        u2.k.c("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                bundle = bundle2;
            }
            if (this.f13576a instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (a1Var != null) {
                    bundle.putInt("tagForChildDirectedTreatment", a1Var.f23171g);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th) {
            u2.k.f("", th);
            throw new RemoteException();
        }
    }

    public final Bundle L3(q2.a1 a1Var) {
        Bundle bundle;
        Bundle bundle2 = a1Var.f23176m;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.f13576a.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0637Nc
    public final void M2(String str, q2.a1 a1Var) throws RemoteException {
        O3(str, a1Var);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0637Nc
    public final void O1(boolean z6) {
        Object obj = this.f13576a;
        if (obj instanceof AbstractAdViewAdapter) {
            try {
                ((AbstractAdViewAdapter) obj).onImmersiveModeUpdated(z6);
                return;
            } catch (Throwable th) {
                u2.k.f("", th);
                return;
            }
        }
        String canonicalName = AbstractAdViewAdapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        u2.k.c(sb.toString());
    }

    public final void O3(String str, q2.a1 a1Var) throws RemoteException {
        Object obj = this.f13576a;
        if (obj instanceof AbstractC2969a) {
            y0(this.f13579d, a1Var, str, new BinderC1052dd((AbstractC2969a) obj, this.f13578c));
            return;
        }
        String canonicalName = AbstractC2969a.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        u2.k.h(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0637Nc
    public final void P1(S2.a aVar, q2.a1 a1Var, String str, InterfaceC0688Qc interfaceC0688Qc) throws RemoteException {
        Object obj = this.f13576a;
        if (!(obj instanceof AbstractC2969a)) {
            String canonicalName = AbstractC2969a.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            u2.k.h(sb.toString());
            throw new RemoteException();
        }
        u2.k.c("Requesting rewarded interstitial ad from adapter.");
        try {
            C0888ad c0888ad = new C0888ad(this, interfaceC0688Qc, 2);
            Context context = (Context) S2.b.n1(aVar);
            Bundle bundleK3 = K3(str, a1Var, null);
            L3(a1Var);
            M3(a1Var);
            N3(str, a1Var);
            ((AbstractC2969a) obj).loadRewardedInterstitialAd(new w2.u(context, bundleK3, "", ""), c0888ad);
        } catch (Exception e6) {
            AbstractC0709Rg.f(aVar, e6, "adapter.loadRewardedInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0637Nc
    public final void Q0(S2.a aVar) throws RemoteException {
        Object obj = this.f13576a;
        if (!(obj instanceof AbstractC2969a)) {
            String canonicalName = AbstractC2969a.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            u2.k.h(sb.toString());
            throw new RemoteException();
        }
        u2.k.c("Show rewarded ad from adapter.");
        i2.m mVar = this.f13583h;
        if (mVar == null) {
            u2.k.e("Can not show null mediation rewarded ad.");
            throw new RemoteException();
        }
        try {
            mVar.a((Context) S2.b.n1(aVar));
        } catch (RuntimeException e6) {
            AbstractC0709Rg.f(aVar, e6, "adapter.rewarded.showAd");
            throw e6;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0637Nc
    public final C0739Tc R() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0637Nc
    public final void U2(S2.a aVar, q2.d1 d1Var, q2.a1 a1Var, String str, String str2, InterfaceC0688Qc interfaceC0688Qc) throws RemoteException {
        Object obj = this.f13576a;
        if (!(obj instanceof AbstractC2969a)) {
            String canonicalName = AbstractC2969a.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            u2.k.h(sb.toString());
            throw new RemoteException();
        }
        u2.k.c("Requesting interscroller ad from adapter.");
        try {
            AbstractC2969a abstractC2969a = (AbstractC2969a) obj;
            C0889ae c0889ae = new C0889ae(this, interfaceC0688Qc, abstractC2969a, 9);
            K3(str, a1Var, str2);
            L3(a1Var);
            M3(a1Var);
            N3(str, a1Var);
            int i = d1Var.f23192e;
            int i3 = d1Var.f23189b;
            C2552h c2552h = new C2552h(i, i3);
            c2552h.f21346g = true;
            c2552h.f21347h = i3;
            c0889ae.k(new C2545a(7, abstractC2969a.getClass().getSimpleName().concat(" does not support interscroller ads."), "com.google.android.gms.ads", null));
        } catch (Exception e6) {
            u2.k.f("", e6);
            AbstractC0709Rg.f(aVar, e6, "adapter.loadInterscrollerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0637Nc
    public final void V0(S2.a aVar) throws RemoteException {
        Object obj = this.f13576a;
        if (!(obj instanceof AbstractC2969a)) {
            String canonicalName = AbstractC2969a.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            u2.k.h(sb.toString());
            throw new RemoteException();
        }
        u2.k.c("Show app open ad from adapter.");
        i2.c cVar = this.i;
        if (cVar == null) {
            u2.k.e("Can not show null mediation app open ad.");
            throw new RemoteException();
        }
        try {
            cVar.a((Context) S2.b.n1(aVar));
        } catch (RuntimeException e6) {
            AbstractC0709Rg.f(aVar, e6, "adapter.appOpen.showAd");
            throw e6;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0637Nc
    public final void Z1(S2.a aVar, q2.d1 d1Var, q2.a1 a1Var, String str, String str2, InterfaceC0688Qc interfaceC0688Qc) throws RemoteException {
        C2552h c2552h;
        Object obj = this.f13576a;
        boolean z6 = obj instanceof MediationBannerAdapter;
        if (!z6 && !(obj instanceof AbstractC2969a)) {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = AbstractC2969a.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
            A.f.w(sb, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
            sb.append(canonicalName3);
            u2.k.h(sb.toString());
            throw new RemoteException();
        }
        u2.k.c("Requesting banner ad from adapter.");
        boolean z7 = d1Var.f23200n;
        int i = d1Var.f23189b;
        int i3 = d1Var.f23192e;
        if (z7) {
            C2552h c2552h2 = new C2552h(i3, i);
            c2552h2.f21344e = true;
            c2552h2.f21345f = i;
            c2552h = c2552h2;
        } else {
            c2552h = new C2552h(i3, i, d1Var.f23188a);
        }
        if (!z6) {
            if (obj instanceof AbstractC2969a) {
                try {
                    C0888ad c0888ad = new C0888ad(this, interfaceC0688Qc, 0);
                    Context context = (Context) S2.b.n1(aVar);
                    Bundle bundleK3 = K3(str, a1Var, str2);
                    L3(a1Var);
                    M3(a1Var);
                    N3(str, a1Var);
                    ((AbstractC2969a) obj).loadBannerAd(new w2.k(context, "", bundleK3, c2552h, this.f13584j), c0888ad);
                    return;
                } catch (Throwable th) {
                    u2.k.f("", th);
                    AbstractC0709Rg.f(aVar, th, "adapter.loadBannerAd");
                    throw new RemoteException();
                }
            }
            return;
        }
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) obj;
            List list = a1Var.f23169e;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j6 = a1Var.f23166b;
            if (j6 != -1) {
                new Date(j6);
            }
            boolean zM3 = M3(a1Var);
            int i6 = a1Var.f23171g;
            boolean z8 = a1Var.f23155F;
            N3(str, a1Var);
            C0841Zc c0841Zc = new C0841Zc(hashSet, zM3, i6, z8);
            Bundle bundle = a1Var.f23176m;
            mediationBannerAdapter.requestBannerAd((Context) S2.b.n1(aVar), new C1338iu(interfaceC0688Qc), K3(str, a1Var, str2), c2552h, c0841Zc, bundle != null ? bundle.getBundle(mediationBannerAdapter.getClass().getName()) : null);
        } catch (Throwable th2) {
            u2.k.f("", th2);
            AbstractC0709Rg.f(aVar, th2, "adapter.requestBannerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0637Nc
    public final void b2(S2.a aVar, q2.a1 a1Var, String str, String str2, InterfaceC0688Qc interfaceC0688Qc) throws RemoteException {
        Object obj = this.f13576a;
        boolean z6 = obj instanceof MediationInterstitialAdapter;
        if (!z6 && !(obj instanceof AbstractC2969a)) {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = AbstractC2969a.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
            A.f.w(sb, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
            sb.append(canonicalName3);
            u2.k.h(sb.toString());
            throw new RemoteException();
        }
        u2.k.c("Requesting interstitial ad from adapter.");
        if (!z6) {
            if (obj instanceof AbstractC2969a) {
                try {
                    C0943bd c0943bd = new C0943bd(this, interfaceC0688Qc, 0);
                    Context context = (Context) S2.b.n1(aVar);
                    Bundle bundleK3 = K3(str, a1Var, str2);
                    L3(a1Var);
                    M3(a1Var);
                    N3(str, a1Var);
                    ((AbstractC2969a) obj).loadInterstitialAd(new w2.o(context, bundleK3, "", this.f13584j), c0943bd);
                    return;
                } catch (Throwable th) {
                    u2.k.f("", th);
                    AbstractC0709Rg.f(aVar, th, "adapter.loadInterstitialAd");
                    throw new RemoteException();
                }
            }
            return;
        }
        try {
            MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) obj;
            List list = a1Var.f23169e;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j6 = a1Var.f23166b;
            if (j6 != -1) {
                new Date(j6);
            }
            boolean zM3 = M3(a1Var);
            int i = a1Var.f23171g;
            boolean z7 = a1Var.f23155F;
            N3(str, a1Var);
            C0841Zc c0841Zc = new C0841Zc(hashSet, zM3, i, z7);
            Bundle bundle = a1Var.f23176m;
            mediationInterstitialAdapter.requestInterstitialAd((Context) S2.b.n1(aVar), new C1338iu(interfaceC0688Qc), K3(str, a1Var, str2), c0841Zc, bundle != null ? bundle.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
        } catch (Throwable th2) {
            u2.k.f("", th2);
            AbstractC0709Rg.f(aVar, th2, "adapter.requestInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0637Nc
    public final S2.a d() throws RemoteException {
        Object obj = this.f13576a;
        if (obj instanceof MediationBannerAdapter) {
            try {
                return new S2.b(((MediationBannerAdapter) obj).getBannerView());
            } catch (Throwable th) {
                u2.k.f("", th);
                throw new RemoteException();
            }
        }
        if (obj instanceof AbstractC2969a) {
            return new S2.b(this.f13580e);
        }
        String canonicalName = MediationBannerAdapter.class.getCanonicalName();
        String canonicalName2 = AbstractC2969a.class.getCanonicalName();
        String canonicalName3 = obj.getClass().getCanonicalName();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb = new StringBuilder(length + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
        A.f.w(sb, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
        sb.append(canonicalName3);
        u2.k.h(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0637Nc
    public final void e1(S2.a aVar, q2.a1 a1Var, InterfaceC0503Fe interfaceC0503Fe, String str) throws RemoteException {
        Object obj = this.f13576a;
        if ((obj instanceof AbstractC2969a) || Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            this.f13579d = aVar;
            this.f13578c = interfaceC0503Fe;
            interfaceC0503Fe.p0(new S2.b(obj));
            return;
        }
        String canonicalName = AbstractC2969a.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        u2.k.h(sb.toString());
        throw new RemoteException();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
    @Override // com.google.android.gms.internal.ads.InterfaceC0637Nc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e2(S2.a r11, com.google.android.gms.internal.ads.InterfaceC0806Xb r12, java.util.ArrayList r13) throws android.os.RemoteException {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f13576a
            boolean r1 = r0 instanceof w2.AbstractC2969a
            if (r1 == 0) goto Lb6
            com.google.android.gms.internal.ads.Rx r1 = new com.google.android.gms.internal.ads.Rx
            r2 = 9
            r1.<init>(r10, r2, r12)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            int r2 = r13.size()
            r3 = 0
            r4 = r3
        L18:
            if (r4 >= r2) goto Laa
            java.lang.Object r5 = r13.get(r4)
            int r4 = r4 + 1
            com.google.android.gms.internal.ads.ac r5 = (com.google.android.gms.internal.ads.C0887ac) r5
            java.lang.String r6 = r5.f13143a
            int r7 = r6.hashCode()
            switch(r7) {
                case -1396342996: goto L68;
                case -1052618729: goto L5e;
                case -239580146: goto L54;
                case 604727084: goto L4a;
                case 1167692200: goto L40;
                case 1778294298: goto L36;
                case 1911491517: goto L2c;
                default: goto L2b;
            }
        L2b:
            goto L72
        L2c:
            java.lang.String r7 = "rewarded_interstitial"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L72
            r6 = 3
            goto L73
        L36:
            java.lang.String r7 = "app_open_ad"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L72
            r6 = 6
            goto L73
        L40:
            java.lang.String r7 = "app_open"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L72
            r6 = 5
            goto L73
        L4a:
            java.lang.String r7 = "interstitial"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L72
            r6 = 1
            goto L73
        L54:
            java.lang.String r7 = "rewarded"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L72
            r6 = 2
            goto L73
        L5e:
            java.lang.String r7 = "native"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L72
            r6 = 4
            goto L73
        L68:
            java.lang.String r7 = "banner"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L72
            r6 = r3
            goto L73
        L72:
            r6 = -1
        L73:
            j2.b r7 = j2.EnumC2546b.APP_OPEN_AD
            r8 = 0
            switch(r6) {
                case 0: goto L9a;
                case 1: goto L97;
                case 2: goto L94;
                case 3: goto L91;
                case 4: goto L8e;
                case 5: goto L9c;
                case 6: goto L7b;
                default: goto L79;
            }
        L79:
            r7 = r8
            goto L9c
        L7b:
            com.google.android.gms.internal.ads.E9 r6 = com.google.android.gms.internal.ads.H9.bd
            q2.s r9 = q2.C2841s.f23267e
            com.google.android.gms.internal.ads.G9 r9 = r9.f23270c
            java.lang.Object r6 = r9.a(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L79
            goto L9c
        L8e:
            j2.b r7 = j2.EnumC2546b.NATIVE
            goto L9c
        L91:
            j2.b r7 = j2.EnumC2546b.REWARDED_INTERSTITIAL
            goto L9c
        L94:
            j2.b r7 = j2.EnumC2546b.REWARDED
            goto L9c
        L97:
            j2.b r7 = j2.EnumC2546b.INTERSTITIAL
            goto L9c
        L9a:
            j2.b r7 = j2.EnumC2546b.BANNER
        L9c:
            if (r7 == 0) goto L18
            w2.m r6 = new w2.m
            android.os.Bundle r5 = r5.f13144b
            r6.<init>(r5)
            r12.add(r6)
            goto L18
        Laa:
            w2.a r0 = (w2.AbstractC2969a) r0
            java.lang.Object r11 = S2.b.n1(r11)
            android.content.Context r11 = (android.content.Context) r11
            r0.initialize(r11, r1, r12)
            return
        Lb6:
            android.os.RemoteException r11 = new android.os.RemoteException
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.BinderC0997cd.e2(S2.a, com.google.android.gms.internal.ads.Xb, java.util.ArrayList):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0637Nc
    public final void g() throws RemoteException {
        Object obj = this.f13576a;
        if (obj instanceof MediationInterstitialAdapter) {
            u2.k.c("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) obj).showInterstitial();
                return;
            } catch (Throwable th) {
                u2.k.f("", th);
                throw new RemoteException();
            }
        }
        String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        u2.k.h(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0637Nc
    public final void g3(S2.a aVar, InterfaceC0503Fe interfaceC0503Fe, List list) throws RemoteException {
        u2.k.h("Could not initialize rewarded video adapter.");
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0637Nc
    public final void h3(S2.a aVar) throws RemoteException {
        Object obj = this.f13576a;
        if (!(obj instanceof AbstractC2969a) && !(obj instanceof MediationInterstitialAdapter)) {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = AbstractC2969a.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            int length = String.valueOf(canonicalName).length();
            StringBuilder sb = new StringBuilder(length + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
            A.f.w(sb, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
            sb.append(canonicalName3);
            u2.k.h(sb.toString());
            throw new RemoteException();
        }
        if (obj instanceof MediationInterstitialAdapter) {
            g();
            return;
        }
        u2.k.c("Show interstitial ad from adapter.");
        i2.h hVar = this.f13581f;
        if (hVar == null) {
            u2.k.e("Can not show null mediation interstitial ad.");
            throw new RemoteException();
        }
        try {
            hVar.a((Context) S2.b.n1(aVar));
        } catch (RuntimeException e6) {
            AbstractC0709Rg.f(aVar, e6, "adapter.interstitial.showAd");
            throw e6;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0637Nc
    public final void i() throws RemoteException {
        Object obj = this.f13576a;
        if (obj instanceof w2.g) {
            try {
                ((w2.g) obj).onPause();
            } catch (Throwable th) {
                u2.k.f("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0637Nc
    public final C0705Rc i0() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0637Nc
    public final void j() throws RemoteException {
        Object obj = this.f13576a;
        if (obj instanceof w2.g) {
            try {
                ((w2.g) obj).onDestroy();
            } catch (Throwable th) {
                u2.k.f("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0637Nc
    public final void k3(S2.a aVar, q2.a1 a1Var, String str, String str2, InterfaceC0688Qc interfaceC0688Qc, C0499Fa c0499Fa, ArrayList arrayList) throws RemoteException {
        String str3 = this.f13584j;
        Object obj = this.f13576a;
        boolean z6 = obj instanceof MediationNativeAdapter;
        if (!z6 && !(obj instanceof AbstractC2969a)) {
            String canonicalName = MediationNativeAdapter.class.getCanonicalName();
            String canonicalName2 = AbstractC2969a.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
            A.f.w(sb, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
            sb.append(canonicalName3);
            u2.k.h(sb.toString());
            throw new RemoteException();
        }
        u2.k.c("Requesting native ad from adapter.");
        if (z6) {
            try {
                MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) obj;
                List list = a1Var.f23169e;
                HashSet hashSet = list != null ? new HashSet(list) : null;
                long j6 = a1Var.f23166b;
                if (j6 != -1) {
                    new Date(j6);
                }
                boolean zM3 = M3(a1Var);
                int i = a1Var.f23171g;
                boolean z7 = a1Var.f23155F;
                N3(str, a1Var);
                C1106ed c1106ed = new C1106ed(hashSet, zM3, i, c0499Fa, arrayList, z7);
                Bundle bundle = a1Var.f23176m;
                Bundle bundle2 = bundle != null ? bundle.getBundle(mediationNativeAdapter.getClass().getName()) : null;
                this.f13577b = new C1338iu(interfaceC0688Qc);
                mediationNativeAdapter.requestNativeAd((Context) S2.b.n1(aVar), this.f13577b, K3(str, a1Var, str2), c1106ed, bundle2);
                return;
            } catch (Throwable th) {
                u2.k.f("", th);
                AbstractC0709Rg.f(aVar, th, "adapter.requestNativeAd");
                throw new RemoteException();
            }
        }
        if (obj instanceof AbstractC2969a) {
            try {
                C0943bd c0943bd = new C0943bd(this, interfaceC0688Qc, 1);
                Context context = (Context) S2.b.n1(aVar);
                Bundle bundleK3 = K3(str, a1Var, str2);
                L3(a1Var);
                M3(a1Var);
                N3(str, a1Var);
                ((AbstractC2969a) obj).loadNativeAdMapper(new w2.r(context, bundleK3, "", str3), c0943bd);
            } catch (Throwable th2) {
                u2.k.f("", th2);
                AbstractC0709Rg.f(aVar, th2, "adapter.loadNativeAdMapper");
                String message = th2.getMessage();
                if (TextUtils.isEmpty(message) || !message.equals("Method is not found")) {
                    throw new RemoteException();
                }
                try {
                    C0888ad c0888ad = new C0888ad(this, interfaceC0688Qc, 1);
                    Context context2 = (Context) S2.b.n1(aVar);
                    Bundle bundleK32 = K3(str, a1Var, str2);
                    L3(a1Var);
                    M3(a1Var);
                    N3(str, a1Var);
                    ((AbstractC2969a) obj).loadNativeAd(new w2.r(context2, bundleK32, "", str3), c0888ad);
                } catch (Throwable th3) {
                    u2.k.f("", th3);
                    AbstractC0709Rg.f(aVar, th3, "adapter.loadNativeAd");
                    throw new RemoteException();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0637Nc
    public final boolean l() throws RemoteException {
        Object obj = this.f13576a;
        if ((obj instanceof AbstractC2969a) || Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            return this.f13578c != null;
        }
        String canonicalName = AbstractC2969a.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        u2.k.h(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0637Nc
    public final C0756Uc l0() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0637Nc
    public final void m0(S2.a aVar) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0637Nc
    public final void n() throws RemoteException {
        Object obj = this.f13576a;
        if (obj instanceof w2.g) {
            try {
                ((w2.g) obj).onResume();
            } catch (Throwable th) {
                u2.k.f("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0637Nc
    public final C2184yd s3() {
        Object obj = this.f13576a;
        if (!(obj instanceof AbstractC2969a)) {
            return null;
        }
        j2.r sDKVersionInfo = ((AbstractC2969a) obj).getSDKVersionInfo();
        return new C2184yd(sDKVersionInfo.f21357a, sDKVersionInfo.f21358b, sDKVersionInfo.f21359c);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0637Nc
    public final void w0(S2.a aVar, q2.a1 a1Var, String str, InterfaceC0688Qc interfaceC0688Qc) throws RemoteException {
        Object obj = this.f13576a;
        if (!(obj instanceof AbstractC2969a)) {
            String canonicalName = AbstractC2969a.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            u2.k.h(sb.toString());
            throw new RemoteException();
        }
        u2.k.c("Requesting app open ad from adapter.");
        try {
            C0943bd c0943bd = new C0943bd(this, interfaceC0688Qc, 2);
            Context context = (Context) S2.b.n1(aVar);
            Bundle bundleK3 = K3(str, a1Var, null);
            L3(a1Var);
            M3(a1Var);
            N3(str, a1Var);
            ((AbstractC2969a) obj).loadAppOpenAd(new w2.i(context, bundleK3, "", ""), c0943bd);
        } catch (Exception e6) {
            u2.k.f("", e6);
            AbstractC0709Rg.f(aVar, e6, "adapter.loadAppOpenAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0637Nc
    public final void y0(S2.a aVar, q2.a1 a1Var, String str, InterfaceC0688Qc interfaceC0688Qc) throws RemoteException {
        Object obj = this.f13576a;
        if (!(obj instanceof AbstractC2969a)) {
            String canonicalName = AbstractC2969a.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            u2.k.h(sb.toString());
            throw new RemoteException();
        }
        u2.k.c("Requesting rewarded ad from adapter.");
        try {
            C0888ad c0888ad = new C0888ad(this, interfaceC0688Qc, 2);
            Context context = (Context) S2.b.n1(aVar);
            Bundle bundleK3 = K3(str, a1Var, null);
            L3(a1Var);
            M3(a1Var);
            N3(str, a1Var);
            ((AbstractC2969a) obj).loadRewardedAd(new w2.u(context, bundleK3, "", ""), c0888ad);
        } catch (Exception e6) {
            u2.k.f("", e6);
            AbstractC0709Rg.f(aVar, e6, "adapter.loadRewardedAd");
            throw new RemoteException();
        }
    }

    public BinderC0997cd(AbstractC2969a abstractC2969a) {
        this();
        this.f13584j = "";
        this.f13576a = abstractC2969a;
    }

    public BinderC0997cd(w2.g gVar) {
        this();
        this.f13584j = "";
        this.f13576a = gVar;
    }
}
