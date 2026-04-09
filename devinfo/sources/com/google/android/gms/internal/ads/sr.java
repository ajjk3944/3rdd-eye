package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class sr extends mg implements cr {

    /* renamed from: a, reason: collision with root package name */
    public final Object f16516a;

    /* renamed from: b, reason: collision with root package name */
    public pq0 f16517b;

    /* renamed from: c, reason: collision with root package name */
    public wu f16518c;

    /* renamed from: d, reason: collision with root package name */
    public vb.a f16519d;

    /* renamed from: e, reason: collision with root package name */
    public View f16520e;

    /* renamed from: f, reason: collision with root package name */
    public bb.p f16521f;
    public bb.a0 g;

    /* renamed from: h, reason: collision with root package name */
    public bb.w f16522h;

    /* renamed from: i, reason: collision with root package name */
    public bb.h f16523i;
    public final String j;

    public sr() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
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

    @Override // com.google.android.gms.internal.ads.cr
    public final ir B() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.cr
    public final void B1() throws RemoteException {
        Object obj = this.f16516a;
        if (obj instanceof bb.g) {
            try {
                ((bb.g) obj).onPause();
            } catch (Throwable th2) {
                za.i.f("", th2);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.cr
    public final void C0(vb.a aVar, va.z2 z2Var, String str, fr frVar) throws RemoteException {
        Object obj = this.f16516a;
        if (!(obj instanceof bb.a)) {
            String canonicalName = bb.a.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb2.append(canonicalName);
            sb2.append(" #009 Class mismatch: ");
            sb2.append(canonicalName2);
            za.i.h(sb2.toString());
            throw new RemoteException();
        }
        za.i.c("Requesting app open ad from adapter.");
        try {
            rr rrVar = new rr(this, frVar, 1);
            Context context = (Context) vb.b.U0(aVar);
            Bundle bundleH4 = h4(str, z2Var, null);
            Bundle bundleI4 = i4(z2Var);
            j4(z2Var);
            int i4 = z2Var.g;
            k4(str, z2Var);
            ((bb.a) obj).loadAppOpenAd(new bb.j(context, "", bundleH4, bundleI4, i4, ""), rrVar);
        } catch (Exception e2) {
            za.i.f("", e2);
            ls.h(aVar, e2, "adapter.loadAppOpenAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.cr
    public final void C1() throws RemoteException {
        Object obj = this.f16516a;
        if (obj instanceof bb.g) {
            try {
                ((bb.g) obj).onDestroy();
            } catch (Throwable th2) {
                za.i.f("", th2);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.cr
    public final boolean E1() throws RemoteException {
        Object obj = this.f16516a;
        if ((obj instanceof bb.a) || Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            return this.f16518c != null;
        }
        String canonicalName = bb.a.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb2.append(canonicalName);
        sb2.append(" #009 Class mismatch: ");
        sb2.append(canonicalName2);
        za.i.h(sb2.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.cr
    public final void F1() throws RemoteException {
        Object obj = this.f16516a;
        if (obj instanceof bb.g) {
            try {
                ((bb.g) obj).onResume();
            } catch (Throwable th2) {
                za.i.f("", th2);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.cr
    public final void F2(vb.a aVar, va.z2 z2Var, String str, fr frVar) throws RemoteException {
        Object obj = this.f16516a;
        if (!(obj instanceof bb.a)) {
            String canonicalName = bb.a.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb2.append(canonicalName);
            sb2.append(" #009 Class mismatch: ");
            sb2.append(canonicalName2);
            za.i.h(sb2.toString());
            throw new RemoteException();
        }
        za.i.c("Requesting rewarded interstitial ad from adapter.");
        try {
            qr qrVar = new qr(this, frVar, 1);
            Context context = (Context) vb.b.U0(aVar);
            Bundle bundleH4 = h4(str, z2Var, null);
            Bundle bundleI4 = i4(z2Var);
            j4(z2Var);
            int i4 = z2Var.g;
            k4(str, z2Var);
            ((bb.a) obj).loadRewardedInterstitialAd(new bb.y(context, "", bundleH4, bundleI4, i4, ""), qrVar);
        } catch (Exception e2) {
            ls.h(aVar, e2, "adapter.loadRewardedInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.cr
    public final void G0(vb.a aVar, va.z2 z2Var, wu wuVar, String str) throws RemoteException {
        Object obj = this.f16516a;
        if ((obj instanceof bb.a) || Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            this.f16519d = aVar;
            this.f16518c = wuVar;
            wuVar.Z(new vb.b(obj));
            return;
        }
        String canonicalName = bb.a.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb2.append(canonicalName);
        sb2.append(" #009 Class mismatch: ");
        sb2.append(canonicalName2);
        za.i.h(sb2.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.cr
    public final void I0(vb.a aVar) throws RemoteException {
        Object obj = this.f16516a;
        if (!(obj instanceof bb.a)) {
            String canonicalName = bb.a.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb2.append(canonicalName);
            sb2.append(" #009 Class mismatch: ");
            sb2.append(canonicalName2);
            za.i.h(sb2.toString());
            throw new RemoteException();
        }
        za.i.c("Show rewarded ad from adapter.");
        bb.w wVar = this.f16522h;
        if (wVar == null) {
            za.i.e("Can not show null mediation rewarded ad.");
            throw new RemoteException();
        }
        try {
            wVar.showAd((Context) vb.b.U0(aVar));
        } catch (RuntimeException e2) {
            ls.h(aVar, e2, "adapter.rewarded.showAd");
            throw e2;
        }
    }

    @Override // com.google.android.gms.internal.ads.cr
    public final boolean O1() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.cr
    public final void Q2(vb.a aVar, va.z2 z2Var, String str, String str2, fr frVar) throws RemoteException {
        Object obj = this.f16516a;
        boolean z3 = obj instanceof MediationInterstitialAdapter;
        if (!z3 && !(obj instanceof bb.a)) {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = bb.a.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
            je.u.B(sb2, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
            sb2.append(canonicalName3);
            za.i.h(sb2.toString());
            throw new RemoteException();
        }
        za.i.c("Requesting interstitial ad from adapter.");
        if (!z3) {
            if (obj instanceof bb.a) {
                try {
                    qr qrVar = new qr(this, frVar, 0);
                    Context context = (Context) vb.b.U0(aVar);
                    Bundle bundleH4 = h4(str, z2Var, str2);
                    Bundle bundleI4 = i4(z2Var);
                    j4(z2Var);
                    int i4 = z2Var.g;
                    k4(str, z2Var);
                    ((bb.a) obj).loadInterstitialAd(new bb.r(context, "", bundleH4, bundleI4, i4, this.j), qrVar);
                    return;
                } catch (Throwable th2) {
                    za.i.f("", th2);
                    ls.h(aVar, th2, "adapter.loadInterstitialAd");
                    throw new RemoteException();
                }
            }
            return;
        }
        try {
            MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) obj;
            List list = z2Var.f36192e;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j = z2Var.f36189b;
            if (j != -1) {
                new Date(j);
            }
            boolean zJ4 = j4(z2Var);
            int i10 = z2Var.g;
            boolean z10 = z2Var.f36203r;
            k4(str, z2Var);
            or orVar = new or(hashSet, zJ4, i10, z10);
            Bundle bundle = z2Var.f36198m;
            mediationInterstitialAdapter.requestInterstitialAd((Context) vb.b.U0(aVar), new pq0(frVar), h4(str, z2Var, str2), orVar, bundle != null ? bundle.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
        } catch (Throwable th3) {
            za.i.f("", th3);
            ls.h(aVar, th3, "adapter.requestInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.cr
    public final void R() throws RemoteException {
        Object obj = this.f16516a;
        if (obj instanceof bb.a) {
            bb.w wVar = this.f16522h;
            if (wVar == null) {
                za.i.e("Can not show null mediated rewarded ad.");
                throw new RemoteException();
            }
            try {
                wVar.showAd((Context) vb.b.U0(this.f16519d));
                return;
            } catch (RuntimeException e2) {
                ls.h(this.f16519d, e2, "adapter.showVideo");
                throw e2;
            }
        }
        String canonicalName = bb.a.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb2.append(canonicalName);
        sb2.append(" #009 Class mismatch: ");
        sb2.append(canonicalName2);
        za.i.h(sb2.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.cr
    public final void R0(vb.a aVar, va.z2 z2Var, String str, fr frVar) throws RemoteException {
        Object obj = this.f16516a;
        if (!(obj instanceof bb.a)) {
            String canonicalName = bb.a.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb2.append(canonicalName);
            sb2.append(" #009 Class mismatch: ");
            sb2.append(canonicalName2);
            za.i.h(sb2.toString());
            throw new RemoteException();
        }
        za.i.c("Requesting rewarded ad from adapter.");
        try {
            qr qrVar = new qr(this, frVar, 1);
            Context context = (Context) vb.b.U0(aVar);
            Bundle bundleH4 = h4(str, z2Var, null);
            Bundle bundleI4 = i4(z2Var);
            j4(z2Var);
            int i4 = z2Var.g;
            k4(str, z2Var);
            ((bb.a) obj).loadRewardedAd(new bb.y(context, "", bundleH4, bundleI4, i4, ""), qrVar);
        } catch (Exception e2) {
            za.i.f("", e2);
            ls.h(aVar, e2, "adapter.loadRewardedAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.cr
    public final void S0(vb.a aVar, va.c3 c3Var, va.z2 z2Var, String str, String str2, fr frVar) throws RemoteException {
        Object obj = this.f16516a;
        if (!(obj instanceof bb.a)) {
            String canonicalName = bb.a.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb2.append(canonicalName);
            sb2.append(" #009 Class mismatch: ");
            sb2.append(canonicalName2);
            za.i.h(sb2.toString());
            throw new RemoteException();
        }
        za.i.c("Requesting interscroller ad from adapter.");
        try {
            bb.a aVar2 = (bb.a) obj;
            pq0 pq0Var = new pq0(this, frVar, aVar2, 7);
            h4(str, z2Var, str2);
            i4(z2Var);
            j4(z2Var);
            k4(str, z2Var);
            int i4 = c3Var.f36042e;
            int i10 = c3Var.f36039b;
            pa.h hVar = new pa.h(i4, i10);
            hVar.g = true;
            hVar.f31536h = i10;
            pq0Var.i(new pa.a(7, aVar2.getClass().getSimpleName().concat(" does not support interscroller ads."), "com.google.android.gms.ads", null));
        } catch (Exception e2) {
            za.i.f("", e2);
            ls.h(aVar, e2, "adapter.loadInterscrollerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.cr
    public final gr U() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.cr
    public final void V0(vb.a aVar) throws RemoteException {
        Object obj = this.f16516a;
        if (!(obj instanceof bb.a)) {
            String canonicalName = bb.a.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb2.append(canonicalName);
            sb2.append(" #009 Class mismatch: ");
            sb2.append(canonicalName2);
            za.i.h(sb2.toString());
            throw new RemoteException();
        }
        za.i.c("Show app open ad from adapter.");
        bb.h hVar = this.f16523i;
        if (hVar == null) {
            za.i.e("Can not show null mediation app open ad.");
            throw new RemoteException();
        }
        try {
            hVar.showAd((Context) vb.b.U0(aVar));
        } catch (RuntimeException e2) {
            ls.h(aVar, e2, "adapter.appOpen.showAd");
            throw e2;
        }
    }

    @Override // com.google.android.gms.internal.ads.cr
    public final jr X() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.cr
    public final void Y3(vb.a aVar, va.c3 c3Var, va.z2 z2Var, String str, String str2, fr frVar) throws RemoteException {
        pa.h hVar;
        Object obj = this.f16516a;
        boolean z3 = obj instanceof MediationBannerAdapter;
        if (!z3 && !(obj instanceof bb.a)) {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = bb.a.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
            je.u.B(sb2, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
            sb2.append(canonicalName3);
            za.i.h(sb2.toString());
            throw new RemoteException();
        }
        za.i.c("Requesting banner ad from adapter.");
        boolean z10 = c3Var.f36049n;
        int i4 = c3Var.f36039b;
        int i10 = c3Var.f36042e;
        if (z10) {
            pa.h hVar2 = new pa.h(i10, i4);
            hVar2.f31534e = true;
            hVar2.f31535f = i4;
            hVar = hVar2;
        } else {
            hVar = new pa.h(i10, i4, c3Var.f36038a);
        }
        if (!z3) {
            if (obj instanceof bb.a) {
                try {
                    pr prVar = new pr(this, frVar, 0);
                    Context context = (Context) vb.b.U0(aVar);
                    Bundle bundleH4 = h4(str, z2Var, str2);
                    pa.h hVar3 = hVar;
                    Bundle bundleI4 = i4(z2Var);
                    j4(z2Var);
                    int i11 = z2Var.g;
                    k4(str, z2Var);
                    ((bb.a) obj).loadBannerAd(new bb.m(context, "", bundleH4, bundleI4, i11, hVar3, this.j), prVar);
                    return;
                } catch (Throwable th2) {
                    za.i.f("", th2);
                    ls.h(aVar, th2, "adapter.loadBannerAd");
                    throw new RemoteException();
                }
            }
            return;
        }
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) obj;
            List list = z2Var.f36192e;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j = z2Var.f36189b;
            if (j != -1) {
                new Date(j);
            }
            boolean zJ4 = j4(z2Var);
            int i12 = z2Var.g;
            boolean z11 = z2Var.f36203r;
            k4(str, z2Var);
            or orVar = new or(hashSet, zJ4, i12, z11);
            Bundle bundle = z2Var.f36198m;
            mediationBannerAdapter.requestBannerAd((Context) vb.b.U0(aVar), new pq0(frVar), h4(str, z2Var, str2), hVar, orVar, bundle != null ? bundle.getBundle(mediationBannerAdapter.getClass().getName()) : null);
        } catch (Throwable th3) {
            za.i.f("", th3);
            ls.h(aVar, th3, "adapter.requestBannerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.cr
    public final os a0() {
        Object obj = this.f16516a;
        if (!(obj instanceof bb.a)) {
            return null;
        }
        pa.r sDKVersionInfo = ((bb.a) obj).getSDKVersionInfo();
        return new os(sDKVersionInfo.f31546a, sDKVersionInfo.f31547b, sDKVersionInfo.f31548c);
    }

    @Override // com.google.android.gms.internal.ads.cr
    public final vb.a d() throws RemoteException {
        Object obj = this.f16516a;
        if (obj instanceof MediationBannerAdapter) {
            try {
                return new vb.b(((MediationBannerAdapter) obj).getBannerView());
            } catch (Throwable th2) {
                za.i.f("", th2);
                throw new RemoteException();
            }
        }
        if (obj instanceof bb.a) {
            return new vb.b(this.f16520e);
        }
        String canonicalName = MediationBannerAdapter.class.getCanonicalName();
        String canonicalName2 = bb.a.class.getCanonicalName();
        String canonicalName3 = obj.getClass().getCanonicalName();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb2 = new StringBuilder(length + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
        je.u.B(sb2, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
        sb2.append(canonicalName3);
        za.i.h(sb2.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.cr
    public final void f0(vb.a aVar, wu wuVar, List list) throws RemoteException {
        za.i.h("Could not initialize rewarded video adapter.");
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.cr
    public final void f4(vb.a aVar) throws RemoteException {
        Object obj = this.f16516a;
        if (!(obj instanceof bb.a) && !(obj instanceof MediationInterstitialAdapter)) {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = bb.a.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            int length = String.valueOf(canonicalName).length();
            StringBuilder sb2 = new StringBuilder(length + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
            je.u.B(sb2, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
            sb2.append(canonicalName3);
            za.i.h(sb2.toString());
            throw new RemoteException();
        }
        if (obj instanceof MediationInterstitialAdapter) {
            z1();
            return;
        }
        za.i.c("Show interstitial ad from adapter.");
        bb.p pVar = this.f16521f;
        if (pVar == null) {
            za.i.e("Can not show null mediation interstitial ad.");
            throw new RemoteException();
        }
        try {
            pVar.showAd((Context) vb.b.U0(aVar));
        } catch (RuntimeException e2) {
            ls.h(aVar, e2, "adapter.interstitial.showAd");
            throw e2;
        }
    }

    @Override // com.google.android.gms.internal.ads.cr
    public final void g2(boolean z3) {
        Object obj = this.f16516a;
        if (obj instanceof AbstractAdViewAdapter) {
            try {
                ((AbstractAdViewAdapter) obj).onImmersiveModeUpdated(z3);
                return;
            } catch (Throwable th2) {
                za.i.f("", th2);
                return;
            }
        }
        String canonicalName = AbstractAdViewAdapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb2.append(canonicalName);
        sb2.append(" #009 Class mismatch: ");
        sb2.append(canonicalName2);
        za.i.c(sb2.toString());
    }

    @Override // com.google.android.gms.internal.ads.mg
    public final boolean g4(int i4, Parcel parcel, Parcel parcel2) throws RemoteException {
        fr drVar;
        fr drVar2;
        fr drVar3;
        fr drVar4;
        wu uuVar;
        fr drVar5;
        wu uuVar2;
        fk0 fk0Var;
        fr drVar6;
        kp jpVar;
        fr drVar7;
        fr drVar8;
        fr drVar9 = null;
        switch (i4) {
            case 1:
                vb.a aVarR0 = vb.b.r0(parcel.readStrongBinder());
                va.c3 c3Var = (va.c3) ng.b(parcel, va.c3.CREATOR);
                va.z2 z2Var = (va.z2) ng.b(parcel, va.z2.CREATOR);
                String string = parcel.readString();
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    drVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    drVar = iInterfaceQueryLocalInterface instanceof fr ? (fr) iInterfaceQueryLocalInterface : new dr(strongBinder);
                }
                ng.f(parcel);
                Y3(aVarR0, c3Var, z2Var, string, null, drVar);
                parcel2.writeNoException();
                return true;
            case 2:
                vb.a aVarD = d();
                parcel2.writeNoException();
                ng.e(parcel2, aVarD);
                return true;
            case 3:
                vb.a aVarR02 = vb.b.r0(parcel.readStrongBinder());
                va.z2 z2Var2 = (va.z2) ng.b(parcel, va.z2.CREATOR);
                String string2 = parcel.readString();
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 == null) {
                    drVar2 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    drVar2 = iInterfaceQueryLocalInterface2 instanceof fr ? (fr) iInterfaceQueryLocalInterface2 : new dr(strongBinder2);
                }
                ng.f(parcel);
                Q2(aVarR02, z2Var2, string2, null, drVar2);
                parcel2.writeNoException();
                return true;
            case 4:
                z1();
                parcel2.writeNoException();
                return true;
            case 5:
                C1();
                parcel2.writeNoException();
                return true;
            case 6:
                vb.a aVarR03 = vb.b.r0(parcel.readStrongBinder());
                va.c3 c3Var2 = (va.c3) ng.b(parcel, va.c3.CREATOR);
                va.z2 z2Var3 = (va.z2) ng.b(parcel, va.z2.CREATOR);
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 == null) {
                    drVar3 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    drVar3 = iInterfaceQueryLocalInterface3 instanceof fr ? (fr) iInterfaceQueryLocalInterface3 : new dr(strongBinder3);
                }
                ng.f(parcel);
                Y3(aVarR03, c3Var2, z2Var3, string3, string4, drVar3);
                parcel2.writeNoException();
                return true;
            case 7:
                vb.a aVarR04 = vb.b.r0(parcel.readStrongBinder());
                va.z2 z2Var4 = (va.z2) ng.b(parcel, va.z2.CREATOR);
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 == null) {
                    drVar4 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    drVar4 = iInterfaceQueryLocalInterface4 instanceof fr ? (fr) iInterfaceQueryLocalInterface4 : new dr(strongBinder4);
                }
                ng.f(parcel);
                Q2(aVarR04, z2Var4, string5, string6, drVar4);
                parcel2.writeNoException();
                return true;
            case 8:
                B1();
                parcel2.writeNoException();
                return true;
            case 9:
                F1();
                parcel2.writeNoException();
                return true;
            case 10:
                vb.a aVarR05 = vb.b.r0(parcel.readStrongBinder());
                va.z2 z2Var5 = (va.z2) ng.b(parcel, va.z2.CREATOR);
                parcel.readString();
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 == null) {
                    uuVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                    uuVar = iInterfaceQueryLocalInterface5 instanceof wu ? (wu) iInterfaceQueryLocalInterface5 : new uu(strongBinder5, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener", 1);
                }
                String string7 = parcel.readString();
                ng.f(parcel);
                G0(aVarR05, z2Var5, uuVar, string7);
                parcel2.writeNoException();
                return true;
            case 11:
                va.z2 z2Var6 = (va.z2) ng.b(parcel, va.z2.CREATOR);
                String string8 = parcel.readString();
                ng.f(parcel);
                l4(string8, z2Var6);
                parcel2.writeNoException();
                return true;
            case 12:
                R();
                parcel2.writeNoException();
                return true;
            case 13:
                boolean zE1 = E1();
                parcel2.writeNoException();
                ClassLoader classLoader = ng.f14287a;
                parcel2.writeInt(zE1 ? 1 : 0);
                return true;
            case 14:
                vb.a aVarR06 = vb.b.r0(parcel.readStrongBinder());
                va.z2 z2Var7 = (va.z2) ng.b(parcel, va.z2.CREATOR);
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 == null) {
                    drVar5 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    drVar5 = iInterfaceQueryLocalInterface6 instanceof fr ? (fr) iInterfaceQueryLocalInterface6 : new dr(strongBinder6);
                }
                qm qmVar = (qm) ng.b(parcel, qm.CREATOR);
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                ng.f(parcel);
                i2(aVarR06, z2Var7, string9, string10, drVar5, qmVar, arrayListCreateStringArrayList);
                parcel2.writeNoException();
                return true;
            case 15:
                parcel2.writeNoException();
                ClassLoader classLoader2 = ng.f14287a;
                parcel2.writeStrongBinder(null);
                return true;
            case 16:
                parcel2.writeNoException();
                ClassLoader classLoader3 = ng.f14287a;
                parcel2.writeStrongBinder(null);
                return true;
            case 17:
                Bundle bundle = new Bundle();
                parcel2.writeNoException();
                ng.d(parcel2, bundle);
                return true;
            case 18:
                Bundle bundle2 = new Bundle();
                parcel2.writeNoException();
                ng.d(parcel2, bundle2);
                return true;
            case 19:
                Bundle bundle3 = new Bundle();
                parcel2.writeNoException();
                ng.d(parcel2, bundle3);
                return true;
            case 20:
                va.z2 z2Var8 = (va.z2) ng.b(parcel, va.z2.CREATOR);
                String string11 = parcel.readString();
                parcel.readString();
                ng.f(parcel);
                l4(string11, z2Var8);
                parcel2.writeNoException();
                return true;
            case 21:
                vb.a aVarR07 = vb.b.r0(parcel.readStrongBinder());
                ng.f(parcel);
                w(aVarR07);
                parcel2.writeNoException();
                return true;
            case 22:
                parcel2.writeNoException();
                ClassLoader classLoader4 = ng.f14287a;
                parcel2.writeInt(0);
                return true;
            case 23:
                vb.a aVarR08 = vb.b.r0(parcel.readStrongBinder());
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                    uuVar2 = iInterfaceQueryLocalInterface7 instanceof wu ? (wu) iInterfaceQueryLocalInterface7 : new uu(strongBinder7, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener", 1);
                } else {
                    uuVar2 = null;
                }
                ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
                ng.f(parcel);
                f0(aVarR08, uuVar2, arrayListCreateStringArrayList2);
                throw null;
            case 24:
                pq0 pq0Var = this.f16517b;
                jn jnVar = (pq0Var == null || (fk0Var = (fk0) pq0Var.f15075d) == null) ? null : (jn) fk0Var.f11194b;
                parcel2.writeNoException();
                ng.e(parcel2, jnVar);
                return true;
            case 25:
                boolean zA = ng.a(parcel);
                ng.f(parcel);
                g2(zA);
                parcel2.writeNoException();
                return true;
            case 26:
                va.a2 a2VarR = r();
                parcel2.writeNoException();
                ng.e(parcel2, a2VarR);
                return true;
            case 27:
                lr lrVarS = s();
                parcel2.writeNoException();
                ng.e(parcel2, lrVarS);
                return true;
            case 28:
                vb.a aVarR09 = vb.b.r0(parcel.readStrongBinder());
                va.z2 z2Var9 = (va.z2) ng.b(parcel, va.z2.CREATOR);
                String string12 = parcel.readString();
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 == null) {
                    drVar6 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    drVar6 = iInterfaceQueryLocalInterface8 instanceof fr ? (fr) iInterfaceQueryLocalInterface8 : new dr(strongBinder8);
                }
                ng.f(parcel);
                R0(aVarR09, z2Var9, string12, drVar6);
                parcel2.writeNoException();
                return true;
            case 29:
            default:
                return false;
            case 30:
                vb.a aVarR010 = vb.b.r0(parcel.readStrongBinder());
                ng.f(parcel);
                I0(aVarR010);
                parcel2.writeNoException();
                return true;
            case 31:
                vb.a aVarR011 = vb.b.r0(parcel.readStrongBinder());
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 == null) {
                    jpVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
                    jpVar = iInterfaceQueryLocalInterface9 instanceof kp ? (kp) iInterfaceQueryLocalInterface9 : new jp(strongBinder9, "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback", 1);
                }
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(np.CREATOR);
                ng.f(parcel);
                p2(aVarR011, jpVar, arrayListCreateTypedArrayList);
                parcel2.writeNoException();
                return true;
            case 32:
                vb.a aVarR012 = vb.b.r0(parcel.readStrongBinder());
                va.z2 z2Var10 = (va.z2) ng.b(parcel, va.z2.CREATOR);
                String string13 = parcel.readString();
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 == null) {
                    drVar7 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    drVar7 = iInterfaceQueryLocalInterface10 instanceof fr ? (fr) iInterfaceQueryLocalInterface10 : new dr(strongBinder10);
                }
                ng.f(parcel);
                F2(aVarR012, z2Var10, string13, drVar7);
                parcel2.writeNoException();
                return true;
            case 33:
                os osVarT = t();
                parcel2.writeNoException();
                ng.d(parcel2, osVarT);
                return true;
            case 34:
                os osVarA0 = a0();
                parcel2.writeNoException();
                ng.d(parcel2, osVarA0);
                return true;
            case 35:
                vb.a aVarR013 = vb.b.r0(parcel.readStrongBinder());
                va.c3 c3Var3 = (va.c3) ng.b(parcel, va.c3.CREATOR);
                va.z2 z2Var11 = (va.z2) ng.b(parcel, va.z2.CREATOR);
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 == null) {
                    drVar8 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    drVar8 = iInterfaceQueryLocalInterface11 instanceof fr ? (fr) iInterfaceQueryLocalInterface11 : new dr(strongBinder11);
                }
                ng.f(parcel);
                S0(aVarR013, c3Var3, z2Var11, string14, string15, drVar8);
                parcel2.writeNoException();
                return true;
            case TTAdConstant.CONVERSION_LINK_AUTO_OPEN_INSTANT_PANEL_WHEN_VIDEO_FINISHED /* 36 */:
                parcel2.writeNoException();
                ClassLoader classLoader5 = ng.f14287a;
                parcel2.writeStrongBinder(null);
                return true;
            case 37:
                vb.a aVarR014 = vb.b.r0(parcel.readStrongBinder());
                ng.f(parcel);
                f4(aVarR014);
                parcel2.writeNoException();
                return true;
            case TTAdConstant.CONVERSION_LINK_LANDING_PAGE_CEILING /* 38 */:
                vb.a aVarR015 = vb.b.r0(parcel.readStrongBinder());
                va.z2 z2Var12 = (va.z2) ng.b(parcel, va.z2.CREATOR);
                String string16 = parcel.readString();
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    drVar9 = iInterfaceQueryLocalInterface12 instanceof fr ? (fr) iInterfaceQueryLocalInterface12 : new dr(strongBinder12);
                }
                ng.f(parcel);
                C0(aVarR015, z2Var12, string16, drVar9);
                parcel2.writeNoException();
                return true;
            case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_NEW /* 39 */:
                vb.a aVarR016 = vb.b.r0(parcel.readStrongBinder());
                ng.f(parcel);
                V0(aVarR016);
                parcel2.writeNoException();
                return true;
        }
    }

    public final Bundle h4(String str, va.z2 z2Var, String str2) throws RemoteException {
        za.i.c("Server parameters: ".concat(String.valueOf(str)));
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
            if (this.f16516a instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (z2Var != null) {
                    bundle.putInt("tagForChildDirectedTreatment", z2Var.g);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th2) {
            za.i.f("", th2);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.cr
    public final void i2(vb.a aVar, va.z2 z2Var, String str, String str2, fr frVar, qm qmVar, ArrayList arrayList) throws RemoteException {
        Object obj;
        bb.a aVar2;
        pr prVar;
        Context context;
        Bundle bundleH4;
        Bundle bundleI4;
        int i4;
        Object obj2 = this.f16516a;
        boolean z3 = obj2 instanceof MediationNativeAdapter;
        if (!z3 && !(obj2 instanceof bb.a)) {
            String canonicalName = MediationNativeAdapter.class.getCanonicalName();
            String canonicalName2 = bb.a.class.getCanonicalName();
            String canonicalName3 = obj2.getClass().getCanonicalName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
            je.u.B(sb2, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
            sb2.append(canonicalName3);
            za.i.h(sb2.toString());
            throw new RemoteException();
        }
        za.i.c("Requesting native ad from adapter.");
        if (z3) {
            try {
                MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) obj2;
                List list = z2Var.f36192e;
                HashSet hashSet = list != null ? new HashSet(list) : null;
                long j = z2Var.f36189b;
                if (j != -1) {
                    new Date(j);
                }
                boolean zJ4 = j4(z2Var);
                int i10 = z2Var.g;
                boolean z10 = z2Var.f36203r;
                k4(str, z2Var);
                ur urVar = new ur(hashSet, zJ4, i10, qmVar, arrayList, z10);
                Bundle bundle = z2Var.f36198m;
                Bundle bundle2 = bundle != null ? bundle.getBundle(mediationNativeAdapter.getClass().getName()) : null;
                this.f16517b = new pq0(frVar);
                mediationNativeAdapter.requestNativeAd((Context) vb.b.U0(aVar), this.f16517b, h4(str, z2Var, str2), urVar, bundle2);
                return;
            } catch (Throwable th2) {
                za.i.f("", th2);
                ls.h(aVar, th2, "adapter.requestNativeAd");
                throw new RemoteException();
            }
        }
        if (obj2 instanceof bb.a) {
            try {
                aVar2 = (bb.a) obj2;
                prVar = new pr(this, frVar, 1);
                context = (Context) vb.b.U0(aVar);
                bundleH4 = h4(str, z2Var, str2);
                bundleI4 = i4(z2Var);
                j4(z2Var);
                i4 = z2Var.g;
                k4(str, z2Var);
                obj = obj2;
            } catch (Throwable th3) {
                th = th3;
                obj = obj2;
            }
            try {
                aVar2.loadNativeAdMapper(new bb.u(context, "", bundleH4, bundleI4, i4, this.j), prVar);
            } catch (Throwable th4) {
                th = th4;
                za.i.f("", th);
                ls.h(aVar, th, "adapter.loadNativeAdMapper");
                String message = th.getMessage();
                if (TextUtils.isEmpty(message) || !message.equals("Method is not found")) {
                    throw new RemoteException();
                }
                try {
                    rr rrVar = new rr(this, frVar, 0);
                    Context context2 = (Context) vb.b.U0(aVar);
                    Bundle bundleH42 = h4(str, z2Var, str2);
                    Bundle bundleI42 = i4(z2Var);
                    j4(z2Var);
                    int i11 = z2Var.g;
                    k4(str, z2Var);
                    ((bb.a) obj).loadNativeAd(new bb.u(context2, "", bundleH42, bundleI42, i11, this.j), rrVar);
                } catch (Throwable th5) {
                    za.i.f("", th5);
                    ls.h(aVar, th5, "adapter.loadNativeAd");
                    throw new RemoteException();
                }
            }
        }
    }

    public final Bundle i4(va.z2 z2Var) {
        Bundle bundle;
        Bundle bundle2 = z2Var.f36198m;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.f16516a.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    public final void l4(String str, va.z2 z2Var) throws RemoteException {
        Object obj = this.f16516a;
        if (obj instanceof bb.a) {
            R0(this.f16519d, z2Var, str, new tr((bb.a) obj, this.f16518c));
            return;
        }
        String canonicalName = bb.a.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb2.append(canonicalName);
        sb2.append(" #009 Class mismatch: ");
        sb2.append(canonicalName2);
        za.i.h(sb2.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.cr
    public final void o3(String str, va.z2 z2Var) throws RemoteException {
        l4(str, z2Var);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    @Override // com.google.android.gms.internal.ads.cr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p2(vb.a r10, com.google.android.gms.internal.ads.kp r11, java.util.ArrayList r12) throws android.os.RemoteException {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f16516a
            boolean r1 = r0 instanceof bb.a
            if (r1 == 0) goto La2
            com.google.android.gms.internal.ads.fk0 r1 = new com.google.android.gms.internal.ads.fk0
            r2 = 13
            r1.<init>(r2, r9, r11)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            int r2 = r12.size()
            r3 = 0
        L17:
            if (r3 >= r2) goto L96
            java.lang.Object r4 = r12.get(r3)
            int r3 = r3 + 1
            com.google.android.gms.internal.ads.np r4 = (com.google.android.gms.internal.ads.np) r4
            java.lang.String r5 = r4.f14388a
            int r6 = r5.hashCode()
            r7 = 0
            pa.b r8 = pa.b.APP_OPEN_AD
            switch(r6) {
                case -1396342996: goto L7f;
                case -1052618729: goto L74;
                case -239580146: goto L69;
                case 604727084: goto L5e;
                case 1167692200: goto L55;
                case 1778294298: goto L39;
                case 1911491517: goto L2e;
                default: goto L2d;
            }
        L2d:
            goto L89
        L2e:
            java.lang.String r6 = "rewarded_interstitial"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L89
            pa.b r7 = pa.b.REWARDED_INTERSTITIAL
            goto L89
        L39:
            java.lang.String r6 = "app_open_ad"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L89
            com.google.android.gms.internal.ads.pk r5 = com.google.android.gms.internal.ads.sk.f16096dd
            va.s r6 = va.s.f36163e
            com.google.android.gms.internal.ads.rk r6 = r6.f36166c
            java.lang.Object r5 = r6.a(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L89
        L53:
            r7 = r8
            goto L89
        L55:
            java.lang.String r6 = "app_open"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L89
            goto L53
        L5e:
            java.lang.String r6 = "interstitial"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L89
            pa.b r7 = pa.b.INTERSTITIAL
            goto L89
        L69:
            java.lang.String r6 = "rewarded"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L89
            pa.b r7 = pa.b.REWARDED
            goto L89
        L74:
            java.lang.String r6 = "native"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L89
            pa.b r7 = pa.b.NATIVE
            goto L89
        L7f:
            java.lang.String r6 = "banner"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L89
            pa.b r7 = pa.b.BANNER
        L89:
            if (r7 == 0) goto L17
            bb.o r5 = new bb.o
            android.os.Bundle r4 = r4.f14389b
            r5.<init>(r7, r4)
            r11.add(r5)
            goto L17
        L96:
            bb.a r0 = (bb.a) r0
            java.lang.Object r10 = vb.b.U0(r10)
            android.content.Context r10 = (android.content.Context) r10
            r0.initialize(r10, r1, r11)
            return
        La2:
            android.os.RemoteException r10 = new android.os.RemoteException
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.sr.p2(vb.a, com.google.android.gms.internal.ads.kp, java.util.ArrayList):void");
    }

    @Override // com.google.android.gms.internal.ads.cr
    public final va.a2 r() {
        Object obj = this.f16516a;
        if (obj instanceof AbstractAdViewAdapter) {
            try {
                return ((AbstractAdViewAdapter) obj).getVideoController();
            } catch (Throwable th2) {
                za.i.f("", th2);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.cr
    public final lr s() {
        bb.a0 a0Var;
        com.google.ads.mediation.a aVar;
        Object obj = this.f16516a;
        if (!(obj instanceof MediationNativeAdapter)) {
            if (!(obj instanceof bb.a) || (a0Var = this.g) == null) {
                return null;
            }
            return new wr(a0Var);
        }
        pq0 pq0Var = this.f16517b;
        if (pq0Var == null || (aVar = (com.google.ads.mediation.a) pq0Var.f15074c) == null) {
            return null;
        }
        return new wr(aVar);
    }

    @Override // com.google.android.gms.internal.ads.cr
    public final os t() {
        Object obj = this.f16516a;
        if (!(obj instanceof bb.a)) {
            return null;
        }
        pa.r versionInfo = ((bb.a) obj).getVersionInfo();
        return new os(versionInfo.f31546a, versionInfo.f31547b, versionInfo.f31548c);
    }

    @Override // com.google.android.gms.internal.ads.cr
    public final void w(vb.a aVar) {
    }

    @Override // com.google.android.gms.internal.ads.cr
    public final void z1() throws RemoteException {
        Object obj = this.f16516a;
        if (obj instanceof MediationInterstitialAdapter) {
            za.i.c("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) obj).showInterstitial();
                return;
            } catch (Throwable th2) {
                za.i.f("", th2);
                throw new RemoteException();
            }
        }
        String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb2.append(canonicalName);
        sb2.append(" #009 Class mismatch: ");
        sb2.append(canonicalName2);
        za.i.h(sb2.toString());
        throw new RemoteException();
    }

    public sr(bb.a aVar) {
        this();
        this.j = "";
        this.f16516a = aVar;
    }

    public sr(bb.g gVar) {
        this();
        this.j = "";
        this.f16516a = gVar;
    }
}
