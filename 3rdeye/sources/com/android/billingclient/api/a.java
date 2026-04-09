package com.android.billingclient.api;

import Q9.C1553s;
import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.View;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.android.billingclient.ktx.BuildConfig;
import com.google.android.gms.internal.play_billing.zzfz;
import com.google.android.gms.internal.play_billing.zzga;
import com.google.android.gms.internal.play_billing.zzgd;
import com.google.android.gms.internal.play_billing.zzge;
import com.google.android.gms.internal.play_billing.zzgg;
import com.google.android.gms.internal.play_billing.zzgk;
import com.google.android.gms.internal.play_billing.zzgt;
import com.google.android.gms.internal.play_billing.zzgu;
import com.google.android.gms.internal.play_billing.zzgz;
import com.google.android.gms.internal.play_billing.zzhb;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.json.JSONException;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes.dex */
public final class a extends BillingClient {

    /* renamed from: A, reason: collision with root package name */
    public final boolean f18612A;

    /* renamed from: B, reason: collision with root package name */
    public ExecutorService f18613B;

    /* renamed from: a, reason: collision with root package name */
    public volatile int f18614a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18615b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f18616c;

    /* renamed from: d, reason: collision with root package name */
    public volatile w f18617d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f18618e;

    /* renamed from: f, reason: collision with root package name */
    public final C1553s f18619f;

    /* renamed from: g, reason: collision with root package name */
    public volatile com.google.android.gms.internal.play_billing.zzs f18620g;

    /* renamed from: h, reason: collision with root package name */
    public volatile h f18621h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f18622j;

    /* renamed from: k, reason: collision with root package name */
    public int f18623k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f18624l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f18625m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f18626n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f18627o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f18628p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f18629q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f18630r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f18631s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f18632t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f18633u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f18634v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f18635w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f18636x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f18637y;

    /* renamed from: z, reason: collision with root package name */
    public final PendingPurchasesParams f18638z;

    public a(Context context) {
        this.f18614a = 0;
        this.f18616c = new Handler(Looper.getMainLooper());
        this.f18623k = 0;
        String strD = d();
        this.f18615b = strD;
        this.f18618e = context.getApplicationContext();
        zzgt zzgtVarZzy = zzgu.zzy();
        zzgtVarZzy.zzn(strD);
        zzgtVarZzy.zzm(this.f18618e.getPackageName());
        this.f18619f = new C1553s(this.f18618e, (zzgu) zzgtVarZzy.zzf());
        this.f18618e.getPackageName();
    }

    @SuppressLint({"PrivateApi"})
    public static String d() {
        try {
            return (String) BuildConfig.class.getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return com.android.billingclient.BuildConfig.VERSION_NAME;
        }
    }

    public final Handler a() {
        return Looper.myLooper() == null ? this.f18616c : new Handler(Looper.myLooper());
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void acknowledgePurchase(final AcknowledgePurchaseParams acknowledgePurchaseParams, final AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) {
        if (!isReady()) {
            BillingResult billingResult = r.f18693l;
            f(zzcb.zza(2, 3, billingResult));
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult);
            return;
        }
        if (TextUtils.isEmpty(acknowledgePurchaseParams.getPurchaseToken())) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Please provide a valid purchase token.");
            BillingResult billingResult2 = r.i;
            f(zzcb.zza(26, 3, billingResult2));
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult2);
            return;
        }
        if (!this.f18626n) {
            BillingResult billingResult3 = r.f18684b;
            f(zzcb.zza(27, 3, billingResult3));
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult3);
        } else if (e(new Callable() { // from class: com.android.billingclient.api.zzu
            @Override // java.util.concurrent.Callable
            public final Object call() {
                a aVar = this.zza;
                AcknowledgePurchaseParams acknowledgePurchaseParams2 = acknowledgePurchaseParams;
                AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener2 = acknowledgePurchaseResponseListener;
                aVar.getClass();
                try {
                    com.google.android.gms.internal.play_billing.zzs zzsVar = aVar.f18620g;
                    String packageName = aVar.f18618e.getPackageName();
                    String purchaseToken = acknowledgePurchaseParams2.getPurchaseToken();
                    String str = aVar.f18615b;
                    Bundle bundle = new Bundle();
                    bundle.putString("playBillingLibraryVersion", str);
                    Bundle bundleZzd = zzsVar.zzd(9, packageName, purchaseToken, bundle);
                    acknowledgePurchaseResponseListener2.onAcknowledgePurchaseResponse(r.a(com.google.android.gms.internal.play_billing.zzb.zzb(bundleZzd, "BillingClient"), com.google.android.gms.internal.play_billing.zzb.zzg(bundleZzd, "BillingClient")));
                    return null;
                } catch (Exception e4) {
                    com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Error acknowledge purchase!", e4);
                    BillingResult billingResult4 = r.f18693l;
                    aVar.f(zzcb.zza(28, 3, billingResult4));
                    acknowledgePurchaseResponseListener2.onAcknowledgePurchaseResponse(billingResult4);
                    return null;
                }
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzv
            @Override // java.lang.Runnable
            public final void run() {
                a aVar = this.zza;
                AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener2 = acknowledgePurchaseResponseListener;
                aVar.getClass();
                BillingResult billingResult4 = r.f18694m;
                aVar.f(zzcb.zza(24, 3, billingResult4));
                acknowledgePurchaseResponseListener2.onAcknowledgePurchaseResponse(billingResult4);
            }
        }, a()) == null) {
            BillingResult billingResultC = c();
            f(zzcb.zza(25, 3, billingResultC));
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResultC);
        }
    }

    public final void b(final BillingResult billingResult) {
        if (Thread.interrupted()) {
            return;
        }
        this.f18616c.post(new Runnable() { // from class: com.android.billingclient.api.zzq
            @Override // java.lang.Runnable
            public final void run() {
                a aVar = this.zza;
                BillingResult billingResult2 = billingResult;
                if (aVar.f18617d.f18716b != null) {
                    aVar.f18617d.f18716b.onPurchasesUpdated(billingResult2, null);
                } else {
                    com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "No valid listener is set in BroadcastManager");
                }
            }
        });
    }

    public final BillingResult c() {
        return (this.f18614a == 0 || this.f18614a == 3) ? r.f18693l : r.f18691j;
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void consumeAsync(final ConsumeParams consumeParams, final ConsumeResponseListener consumeResponseListener) {
        if (!isReady()) {
            BillingResult billingResult = r.f18693l;
            f(zzcb.zza(2, 4, billingResult));
            consumeResponseListener.onConsumeResponse(billingResult, consumeParams.getPurchaseToken());
        } else if (e(new Callable() { // from class: com.android.billingclient.api.zzah
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int iZza;
                String strZzg;
                a aVar = this.zza;
                ConsumeParams consumeParams2 = consumeParams;
                ConsumeResponseListener consumeResponseListener2 = consumeResponseListener;
                aVar.getClass();
                String purchaseToken = consumeParams2.getPurchaseToken();
                try {
                    com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Consuming purchase with token: " + purchaseToken);
                    if (aVar.f18626n) {
                        com.google.android.gms.internal.play_billing.zzs zzsVar = aVar.f18620g;
                        String packageName = aVar.f18618e.getPackageName();
                        boolean z10 = aVar.f18626n;
                        String str = aVar.f18615b;
                        Bundle bundle = new Bundle();
                        if (z10) {
                            bundle.putString("playBillingLibraryVersion", str);
                        }
                        Bundle bundleZze = zzsVar.zze(9, packageName, purchaseToken, bundle);
                        iZza = bundleZze.getInt("RESPONSE_CODE");
                        strZzg = com.google.android.gms.internal.play_billing.zzb.zzg(bundleZze, "BillingClient");
                    } else {
                        iZza = aVar.f18620g.zza(3, aVar.f18618e.getPackageName(), purchaseToken);
                        strZzg = "";
                    }
                    BillingResult billingResultA = r.a(iZza, strZzg);
                    if (iZza == 0) {
                        com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Successfully consumed purchase.");
                        consumeResponseListener2.onConsumeResponse(billingResultA, purchaseToken);
                        return null;
                    }
                    com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Error consuming purchase with token. Response code: " + iZza);
                    aVar.f(zzcb.zza(23, 4, billingResultA));
                    consumeResponseListener2.onConsumeResponse(billingResultA, purchaseToken);
                    return null;
                } catch (Exception e4) {
                    com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Error consuming purchase!", e4);
                    BillingResult billingResult2 = r.f18693l;
                    aVar.f(zzcb.zza(29, 4, billingResult2));
                    consumeResponseListener2.onConsumeResponse(billingResult2, purchaseToken);
                    return null;
                }
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzai
            @Override // java.lang.Runnable
            public final void run() {
                a aVar = this.zza;
                ConsumeResponseListener consumeResponseListener2 = consumeResponseListener;
                ConsumeParams consumeParams2 = consumeParams;
                aVar.getClass();
                BillingResult billingResult2 = r.f18694m;
                aVar.f(zzcb.zza(24, 4, billingResult2));
                consumeResponseListener2.onConsumeResponse(billingResult2, consumeParams2.getPurchaseToken());
            }
        }, a()) == null) {
            BillingResult billingResultC = c();
            f(zzcb.zza(25, 4, billingResultC));
            consumeResponseListener.onConsumeResponse(billingResultC, consumeParams.getPurchaseToken());
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    @zzg
    public final void createAlternativeBillingOnlyReportingDetailsAsync(final AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener) {
        if (!isReady()) {
            BillingResult billingResult = r.f18693l;
            f(zzcb.zza(2, 15, billingResult));
            alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(billingResult, null);
        } else {
            if (!this.f18636x) {
                com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Current client doesn't support alternative billing only.");
                BillingResult billingResult2 = r.f18681C;
                f(zzcb.zza(66, 15, billingResult2));
                alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(billingResult2, null);
                return;
            }
            if (e(new Callable() { // from class: com.android.billingclient.api.zzz
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    a aVar = this.zza;
                    AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener2 = alternativeBillingOnlyReportingDetailsListener;
                    aVar.getClass();
                    try {
                        aVar.f18620g.zzm(21, aVar.f18618e.getPackageName(), com.google.android.gms.internal.play_billing.zzb.zzd(aVar.f18615b), new i(alternativeBillingOnlyReportingDetailsListener2, aVar.f18619f, aVar.f18623k));
                        return null;
                    } catch (Exception unused) {
                        BillingResult billingResult3 = r.f18691j;
                        aVar.f(zzcb.zza(70, 15, billingResult3));
                        alternativeBillingOnlyReportingDetailsListener2.onAlternativeBillingOnlyTokenResponse(billingResult3, null);
                        return null;
                    }
                }
            }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzaa
                @Override // java.lang.Runnable
                public final void run() {
                    a aVar = this.zza;
                    AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener2 = alternativeBillingOnlyReportingDetailsListener;
                    aVar.getClass();
                    BillingResult billingResult3 = r.f18694m;
                    aVar.f(zzcb.zza(24, 15, billingResult3));
                    alternativeBillingOnlyReportingDetailsListener2.onAlternativeBillingOnlyTokenResponse(billingResult3, null);
                }
            }, a()) == null) {
                BillingResult billingResultC = c();
                f(zzcb.zza(25, 15, billingResultC));
                alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(billingResultC, null);
            }
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    @zzh
    public final void createExternalOfferReportingDetailsAsync(final ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener) {
        if (!isReady()) {
            BillingResult billingResult = r.f18693l;
            f(zzcb.zza(2, 24, billingResult));
            externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(billingResult, null);
        } else {
            if (!this.f18637y) {
                com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Current client doesn't support external offer.");
                BillingResult billingResult2 = r.f18704w;
                f(zzcb.zza(103, 24, billingResult2));
                externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(billingResult2, null);
                return;
            }
            if (e(new Callable() { // from class: com.android.billingclient.api.zzab
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    a aVar = this.zza;
                    ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener2 = externalOfferReportingDetailsListener;
                    aVar.getClass();
                    try {
                        aVar.f18620g.zzn(22, aVar.f18618e.getPackageName(), com.google.android.gms.internal.play_billing.zzb.zzd(aVar.f18615b), new j(externalOfferReportingDetailsListener2, aVar.f18619f, aVar.f18623k));
                        return null;
                    } catch (Exception e4) {
                        BillingResult billingResult3 = r.f18691j;
                        aVar.f(zzcb.zzb(94, 24, billingResult3, B4.g.o(e4.getClass().getName(), ": ", com.google.android.gms.internal.play_billing.zzab.zzb(e4.getMessage()))));
                        externalOfferReportingDetailsListener2.onExternalOfferReportingDetailsResponse(billingResult3, null);
                        return null;
                    }
                }
            }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzak
                @Override // java.lang.Runnable
                public final void run() {
                    a aVar = this.zza;
                    ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener2 = externalOfferReportingDetailsListener;
                    aVar.getClass();
                    BillingResult billingResult3 = r.f18694m;
                    aVar.f(zzcb.zza(24, 24, billingResult3));
                    externalOfferReportingDetailsListener2.onExternalOfferReportingDetailsResponse(billingResult3, null);
                }
            }, a()) == null) {
                BillingResult billingResultC = c();
                f(zzcb.zza(25, 24, billingResultC));
                externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(billingResultC, null);
            }
        }
    }

    public final Future e(Callable callable, long j4, final Runnable runnable, Handler handler) {
        if (this.f18613B == null) {
            this.f18613B = Executors.newFixedThreadPool(com.google.android.gms.internal.play_billing.zzb.zza, new b());
        }
        try {
            final Future futureSubmit = this.f18613B.submit(callable);
            handler.postDelayed(new Runnable() { // from class: com.android.billingclient.api.zzy
                @Override // java.lang.Runnable
                public final void run() {
                    Future future = futureSubmit;
                    if (future.isDone() || future.isCancelled()) {
                        return;
                    }
                    Runnable runnable2 = runnable;
                    future.cancel(true);
                    com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Async task is taking too long, cancel it!");
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            }, (long) (j4 * 0.95d));
            return futureSubmit;
        } catch (Exception e4) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Async task throws exception!", e4);
            return null;
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void endConnection() {
        g(zzcb.zzc(12));
        try {
            try {
                if (this.f18617d != null) {
                    w wVar = this.f18617d;
                    v vVar = wVar.f18719e;
                    Context context = wVar.f18715a;
                    vVar.b(context);
                    wVar.f18720f.b(context);
                }
                if (this.f18621h != null) {
                    h hVar = this.f18621h;
                    synchronized (hVar.f18653a) {
                        hVar.f18655c = null;
                        hVar.f18654b = true;
                    }
                }
                if (this.f18621h != null && this.f18620g != null) {
                    com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Unbinding from service.");
                    this.f18618e.unbindService(this.f18621h);
                    this.f18621h = null;
                }
                this.f18620g = null;
                ExecutorService executorService = this.f18613B;
                if (executorService != null) {
                    executorService.shutdownNow();
                    this.f18613B = null;
                }
            } catch (Exception e4) {
                com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "There was an exception while ending connection!", e4);
            }
            this.f18614a = 3;
        } catch (Throwable th) {
            this.f18614a = 3;
            throw th;
        }
    }

    public final void f(zzga zzgaVar) {
        this.f18619f.g(zzgaVar, this.f18623k);
    }

    public final void g(zzge zzgeVar) {
        C1553s c1553s = this.f18619f;
        int i = this.f18623k;
        c1553s.getClass();
        try {
            zzgt zzgtVar = (zzgt) ((zzgu) c1553s.f11527b).zzi();
            zzgtVar.zzl(i);
            c1553s.f11527b = (zzgu) zzgtVar.zzf();
            c1553s.h(zzgeVar);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    @zzi
    public final void getBillingConfigAsync(GetBillingConfigParams getBillingConfigParams, final BillingConfigResponseListener billingConfigResponseListener) {
        if (!isReady()) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Service disconnected.");
            BillingResult billingResult = r.f18693l;
            f(zzcb.zza(2, 13, billingResult));
            billingConfigResponseListener.onBillingConfigResponse(billingResult, null);
            return;
        }
        if (!this.f18633u) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Current client doesn't support get billing config.");
            BillingResult billingResult2 = r.f18706y;
            f(zzcb.zza(32, 13, billingResult2));
            billingConfigResponseListener.onBillingConfigResponse(billingResult2, null);
            return;
        }
        final Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", this.f18615b);
        if (e(new Callable() { // from class: com.android.billingclient.api.zzw
            @Override // java.util.concurrent.Callable
            public final Object call() {
                a aVar = this.zza;
                Bundle bundle2 = bundle;
                BillingConfigResponseListener billingConfigResponseListener2 = billingConfigResponseListener;
                aVar.getClass();
                try {
                    aVar.f18620g.zzp(18, aVar.f18618e.getPackageName(), bundle2, new l(billingConfigResponseListener2, aVar.f18619f, aVar.f18623k));
                    return null;
                } catch (DeadObjectException e4) {
                    com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "getBillingConfig got a dead object exception (try to reconnect).", e4);
                    BillingResult billingResult3 = r.f18693l;
                    aVar.f(zzcb.zza(62, 13, billingResult3));
                    billingConfigResponseListener2.onBillingConfigResponse(billingResult3, null);
                    return null;
                } catch (Exception e10) {
                    com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "getBillingConfig got an exception.", e10);
                    BillingResult billingResult4 = r.f18691j;
                    aVar.f(zzcb.zza(62, 13, billingResult4));
                    billingConfigResponseListener2.onBillingConfigResponse(billingResult4, null);
                    return null;
                }
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzx
            @Override // java.lang.Runnable
            public final void run() {
                a aVar = this.zza;
                BillingConfigResponseListener billingConfigResponseListener2 = billingConfigResponseListener;
                aVar.getClass();
                BillingResult billingResult3 = r.f18694m;
                aVar.f(zzcb.zza(24, 13, billingResult3));
                billingConfigResponseListener2.onBillingConfigResponse(billingResult3, null);
            }
        }, a()) == null) {
            BillingResult billingResultC = c();
            f(zzcb.zza(25, 13, billingResultC));
            billingConfigResponseListener.onBillingConfigResponse(billingResultC, null);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final int getConnectionState() {
        return this.f18614a;
    }

    public final void h(String str, final PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        if (!isReady()) {
            BillingResult billingResult = r.f18693l;
            f(zzcb.zza(2, 11, billingResult));
            purchaseHistoryResponseListener.onPurchaseHistoryResponse(billingResult, null);
        } else if (e(new d(this, str, purchaseHistoryResponseListener), 30000L, new Runnable() { // from class: com.android.billingclient.api.zzam
            @Override // java.lang.Runnable
            public final void run() {
                a aVar = this.zza;
                PurchaseHistoryResponseListener purchaseHistoryResponseListener2 = purchaseHistoryResponseListener;
                aVar.getClass();
                BillingResult billingResult2 = r.f18694m;
                aVar.f(zzcb.zza(24, 11, billingResult2));
                purchaseHistoryResponseListener2.onPurchaseHistoryResponse(billingResult2, null);
            }
        }, a()) == null) {
            BillingResult billingResultC = c();
            f(zzcb.zza(25, 11, billingResultC));
            purchaseHistoryResponseListener.onPurchaseHistoryResponse(billingResultC, null);
        }
    }

    public final void i(String str, final PurchasesResponseListener purchasesResponseListener) {
        if (!isReady()) {
            BillingResult billingResult = r.f18693l;
            f(zzcb.zza(2, 9, billingResult));
            purchasesResponseListener.onQueryPurchasesResponse(billingResult, com.google.android.gms.internal.play_billing.zzai.zzk());
        } else {
            if (TextUtils.isEmpty(str)) {
                com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Please provide a valid product type.");
                BillingResult billingResult2 = r.f18689g;
                f(zzcb.zza(50, 9, billingResult2));
                purchasesResponseListener.onQueryPurchasesResponse(billingResult2, com.google.android.gms.internal.play_billing.zzai.zzk());
                return;
            }
            if (e(new c(this, str, purchasesResponseListener), 30000L, new Runnable() { // from class: com.android.billingclient.api.zzae
                @Override // java.lang.Runnable
                public final void run() {
                    a aVar = this.zza;
                    PurchasesResponseListener purchasesResponseListener2 = purchasesResponseListener;
                    aVar.getClass();
                    BillingResult billingResult3 = r.f18694m;
                    aVar.f(zzcb.zza(24, 9, billingResult3));
                    purchasesResponseListener2.onQueryPurchasesResponse(billingResult3, com.google.android.gms.internal.play_billing.zzai.zzk());
                }
            }, a()) == null) {
                BillingResult billingResultC = c();
                f(zzcb.zza(25, 9, billingResultC));
                purchasesResponseListener.onQueryPurchasesResponse(billingResultC, com.google.android.gms.internal.play_billing.zzai.zzk());
            }
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    @zzg
    public final void isAlternativeBillingOnlyAvailableAsync(final AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener) {
        if (!isReady()) {
            BillingResult billingResult = r.f18693l;
            f(zzcb.zza(2, 14, billingResult));
            alternativeBillingOnlyAvailabilityListener.onAlternativeBillingOnlyAvailabilityResponse(billingResult);
        } else {
            if (!this.f18636x) {
                com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Current client doesn't support alternative billing only.");
                BillingResult billingResult2 = r.f18681C;
                f(zzcb.zza(66, 14, billingResult2));
                alternativeBillingOnlyAvailabilityListener.onAlternativeBillingOnlyAvailabilityResponse(billingResult2);
                return;
            }
            if (e(new Callable() { // from class: com.android.billingclient.api.zzaf
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    a aVar = this.zza;
                    AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener2 = alternativeBillingOnlyAvailabilityListener;
                    aVar.getClass();
                    try {
                        aVar.f18620g.zzr(21, aVar.f18618e.getPackageName(), com.google.android.gms.internal.play_billing.zzb.zzd(aVar.f18615b), new n(alternativeBillingOnlyAvailabilityListener2, aVar.f18619f, aVar.f18623k));
                        return null;
                    } catch (Exception unused) {
                        BillingResult billingResult3 = r.f18691j;
                        aVar.f(zzcb.zza(69, 14, billingResult3));
                        alternativeBillingOnlyAvailabilityListener2.onAlternativeBillingOnlyAvailabilityResponse(billingResult3);
                        return null;
                    }
                }
            }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzag
                @Override // java.lang.Runnable
                public final void run() {
                    a aVar = this.zza;
                    AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener2 = alternativeBillingOnlyAvailabilityListener;
                    aVar.getClass();
                    BillingResult billingResult3 = r.f18694m;
                    aVar.f(zzcb.zza(24, 14, billingResult3));
                    alternativeBillingOnlyAvailabilityListener2.onAlternativeBillingOnlyAvailabilityResponse(billingResult3);
                }
            }, a()) == null) {
                BillingResult billingResultC = c();
                f(zzcb.zza(25, 14, billingResultC));
                alternativeBillingOnlyAvailabilityListener.onAlternativeBillingOnlyAvailabilityResponse(billingResultC);
            }
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    @zzh
    public final void isExternalOfferAvailableAsync(final ExternalOfferAvailabilityListener externalOfferAvailabilityListener) {
        if (!isReady()) {
            BillingResult billingResult = r.f18693l;
            f(zzcb.zza(2, 23, billingResult));
            externalOfferAvailabilityListener.onExternalOfferAvailabilityResponse(billingResult);
        } else {
            if (!this.f18637y) {
                com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Current client doesn't support external offer.");
                BillingResult billingResult2 = r.f18704w;
                f(zzcb.zza(103, 23, billingResult2));
                externalOfferAvailabilityListener.onExternalOfferAvailabilityResponse(billingResult2);
                return;
            }
            if (e(new Callable() { // from class: com.android.billingclient.api.zzaq
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    a aVar = this.zza;
                    ExternalOfferAvailabilityListener externalOfferAvailabilityListener2 = externalOfferAvailabilityListener;
                    aVar.getClass();
                    try {
                        aVar.f18620g.zzs(22, aVar.f18618e.getPackageName(), com.google.android.gms.internal.play_billing.zzb.zzd(aVar.f18615b), new o(externalOfferAvailabilityListener2, aVar.f18619f, aVar.f18623k));
                        return null;
                    } catch (Exception e4) {
                        BillingResult billingResult3 = r.f18691j;
                        aVar.f(zzcb.zzb(91, 23, billingResult3, B4.g.o(e4.getClass().getName(), ": ", com.google.android.gms.internal.play_billing.zzab.zzb(e4.getMessage()))));
                        externalOfferAvailabilityListener2.onExternalOfferAvailabilityResponse(billingResult3);
                        return null;
                    }
                }
            }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzar
                @Override // java.lang.Runnable
                public final void run() {
                    a aVar = this.zza;
                    ExternalOfferAvailabilityListener externalOfferAvailabilityListener2 = externalOfferAvailabilityListener;
                    aVar.getClass();
                    BillingResult billingResult3 = r.f18694m;
                    aVar.f(zzcb.zza(24, 23, billingResult3));
                    externalOfferAvailabilityListener2.onExternalOfferAvailabilityResponse(billingResult3);
                }
            }, a()) == null) {
                BillingResult billingResultC = c();
                f(zzcb.zza(25, 23, billingResultC));
                externalOfferAvailabilityListener.onExternalOfferAvailabilityResponse(billingResultC);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cd  */
    @Override // com.android.billingclient.api.BillingClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.android.billingclient.api.BillingResult isFeatureSupported(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 528
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.a.isFeatureSupported(java.lang.String):com.android.billingclient.api.BillingResult");
    }

    @Override // com.android.billingclient.api.BillingClient
    public final boolean isReady() {
        return (this.f18614a != 2 || this.f18620g == null || this.f18621h == null) ? false : true;
    }

    public final void j(int i, int i10, BillingResult billingResult) {
        zzge zzgeVar = null;
        zzga zzgaVar = null;
        if (billingResult.getResponseCode() == 0) {
            int i11 = zzcb.zza;
            try {
                zzgd zzgdVarZzy = zzge.zzy();
                zzgdVarZzy.zzm(5);
                zzgz zzgzVarZzy = zzhb.zzy();
                zzgzVarZzy.zzl(i10);
                zzgdVarZzy.zzl((zzhb) zzgzVarZzy.zzf());
                zzgeVar = (zzge) zzgdVarZzy.zzf();
            } catch (Exception e4) {
                com.google.android.gms.internal.play_billing.zzb.zzl("BillingLogger", "Unable to create logging payload", e4);
            }
            g(zzgeVar);
            return;
        }
        int i12 = zzcb.zza;
        try {
            zzfz zzfzVarZzy = zzga.zzy();
            zzgg zzggVarZzy = zzgk.zzy();
            zzggVarZzy.zzn(billingResult.getResponseCode());
            zzggVarZzy.zzm(billingResult.getDebugMessage());
            zzggVarZzy.zzo(i);
            zzfzVarZzy.zzl(zzggVarZzy);
            zzfzVarZzy.zzn(5);
            zzgz zzgzVarZzy2 = zzhb.zzy();
            zzgzVarZzy2.zzl(i10);
            zzfzVarZzy.zzm((zzhb) zzgzVarZzy2.zzf());
            zzgaVar = (zzga) zzfzVarZzy.zzf();
        } catch (Exception e10) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingLogger", "Unable to create logging payload", e10);
        }
        f(zzgaVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0473 A[Catch: Exception -> 0x0483, CancellationException -> 0x0485, TimeoutException -> 0x0487, TRY_ENTER, TryCatch #4 {CancellationException -> 0x0485, TimeoutException -> 0x0487, Exception -> 0x0483, blocks: (B:185:0x0473, B:193:0x0489, B:195:0x049d, B:198:0x04b9, B:200:0x04c5), top: B:214:0x0471 }] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0489 A[Catch: Exception -> 0x0483, CancellationException -> 0x0485, TimeoutException -> 0x0487, TryCatch #4 {CancellationException -> 0x0485, TimeoutException -> 0x0487, Exception -> 0x0483, blocks: (B:185:0x0473, B:193:0x0489, B:195:0x049d, B:198:0x04b9, B:200:0x04c5), top: B:214:0x0471 }] */
    @Override // com.android.billingclient.api.BillingClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.android.billingclient.api.BillingResult launchBillingFlow(android.app.Activity r34, final com.android.billingclient.api.BillingFlowParams r35) {
        /*
            Method dump skipped, instructions count: 1300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.a.launchBillingFlow(android.app.Activity, com.android.billingclient.api.BillingFlowParams):com.android.billingclient.api.BillingResult");
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void queryProductDetailsAsync(final QueryProductDetailsParams queryProductDetailsParams, final ProductDetailsResponseListener productDetailsResponseListener) {
        if (!isReady()) {
            BillingResult billingResult = r.f18693l;
            f(zzcb.zza(2, 7, billingResult));
            productDetailsResponseListener.onProductDetailsResponse(billingResult, new ArrayList());
        } else {
            if (!this.f18632t) {
                com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Querying product details is not supported.");
                BillingResult billingResult2 = r.f18702u;
                f(zzcb.zza(20, 7, billingResult2));
                productDetailsResponseListener.onProductDetailsResponse(billingResult2, new ArrayList());
                return;
            }
            if (e(new Callable() { // from class: com.android.billingclient.api.zzan
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    String strZzg;
                    int i;
                    int i10;
                    int i11;
                    com.google.android.gms.internal.play_billing.zzai zzaiVar;
                    Bundle bundleZzl;
                    int iZzb;
                    a aVar = this.zza;
                    QueryProductDetailsParams queryProductDetailsParams2 = queryProductDetailsParams;
                    ProductDetailsResponseListener productDetailsResponseListener2 = productDetailsResponseListener;
                    aVar.getClass();
                    ArrayList arrayList = new ArrayList();
                    String strZzb = queryProductDetailsParams2.zzb();
                    com.google.android.gms.internal.play_billing.zzai zzaiVarZza = queryProductDetailsParams2.zza();
                    int size = zzaiVarZza.size();
                    int i12 = 0;
                    while (i12 < size) {
                        int i13 = i12 + 20;
                        ArrayList arrayList2 = new ArrayList(zzaiVarZza.subList(i12, i13 > size ? size : i13));
                        ArrayList<String> arrayList3 = new ArrayList<>();
                        int size2 = arrayList2.size();
                        for (int i14 = 0; i14 < size2; i14++) {
                            arrayList3.add(((QueryProductDetailsParams.Product) arrayList2.get(i14)).zza());
                        }
                        Bundle bundle = new Bundle();
                        bundle.putStringArrayList("ITEM_ID_LIST", arrayList3);
                        bundle.putString("playBillingLibraryVersion", aVar.f18615b);
                        try {
                            com.google.android.gms.internal.play_billing.zzs zzsVar = aVar.f18620g;
                            int i15 = true != aVar.f18635w ? 17 : 20;
                            String str = null;
                            String packageName = aVar.f18618e.getPackageName();
                            boolean z10 = aVar.f18634v && aVar.f18638z.isEnabledForPrepaidPlans();
                            zzaiVar = zzaiVarZza;
                            String str2 = aVar.f18615b;
                            if (TextUtils.isEmpty(null)) {
                                aVar.f18618e.getPackageName();
                            }
                            if (TextUtils.isEmpty(null)) {
                                aVar.f18618e.getPackageName();
                            }
                            if (TextUtils.isEmpty(null)) {
                                aVar.f18618e.getPackageName();
                            }
                            int i16 = i15;
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("playBillingLibraryVersion", str2);
                            bundle2.putBoolean("enablePendingPurchases", true);
                            bundle2.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
                            if (z10) {
                                bundle2.putBoolean("enablePendingPurchaseForSubscriptions", true);
                            }
                            ArrayList<String> arrayList4 = new ArrayList<>();
                            ArrayList<String> arrayList5 = new ArrayList<>();
                            int size3 = arrayList2.size();
                            int i17 = 0;
                            boolean z11 = false;
                            boolean z12 = false;
                            while (i17 < size3) {
                                QueryProductDetailsParams.Product product = (QueryProductDetailsParams.Product) arrayList2.get(i17);
                                int i18 = i17;
                                arrayList4.add(str);
                                z12 |= !TextUtils.isEmpty(r1);
                                String strZzb2 = product.zzb();
                                com.google.android.gms.internal.play_billing.zzs zzsVar2 = zzsVar;
                                if (strZzb2.equals("first_party")) {
                                    com.google.android.gms.internal.play_billing.zzaa.zzc(null, "Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
                                    arrayList5.add(null);
                                    z11 = true;
                                }
                                i17 = i18 + 1;
                                zzsVar = zzsVar2;
                                str = null;
                            }
                            com.google.android.gms.internal.play_billing.zzs zzsVar3 = zzsVar;
                            if (z12) {
                                bundle2.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList4);
                            }
                            if (!arrayList5.isEmpty()) {
                                bundle2.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList5);
                            }
                            if (z11 && !TextUtils.isEmpty(null)) {
                                bundle2.putString("accountName", null);
                            }
                            i10 = 6;
                            i11 = 7;
                            try {
                                bundleZzl = zzsVar3.zzl(i16, packageName, strZzb, bundle, bundle2);
                                iZzb = 4;
                                strZzg = "Item is unavailable for purchase.";
                            } catch (Exception e4) {
                                e = e4;
                                com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "queryProductDetailsAsync got a remote exception (try to reconnect).", e);
                                aVar.f(zzcb.zza(43, i11, r.f18691j));
                                strZzg = "An internal error occurred.";
                                i = i10;
                                productDetailsResponseListener2.onProductDetailsResponse(r.a(i, strZzg), arrayList);
                                return null;
                            }
                        } catch (Exception e10) {
                            e = e10;
                            i10 = 6;
                            i11 = 7;
                        }
                        if (bundleZzl == null) {
                            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "queryProductDetailsAsync got empty product details response.");
                            aVar.f(zzcb.zza(44, 7, r.f18679A));
                        } else if (bundleZzl.containsKey("DETAILS_LIST")) {
                            ArrayList<String> stringArrayList = bundleZzl.getStringArrayList("DETAILS_LIST");
                            if (stringArrayList == null) {
                                com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "queryProductDetailsAsync got null response list");
                                aVar.f(zzcb.zza(46, 7, r.f18679A));
                            } else {
                                for (int i19 = 0; i19 < stringArrayList.size(); i19++) {
                                    try {
                                        ProductDetails productDetails = new ProductDetails(stringArrayList.get(i19));
                                        com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Got product details: ".concat(productDetails.toString()));
                                        arrayList.add(productDetails);
                                    } catch (JSONException e11) {
                                        com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e11);
                                        strZzg = "Error trying to decode SkuDetails.";
                                        aVar.f(zzcb.zza(47, 7, r.a(6, "Error trying to decode SkuDetails.")));
                                    }
                                }
                                i12 = i13;
                                zzaiVarZza = zzaiVar;
                            }
                        } else {
                            iZzb = com.google.android.gms.internal.play_billing.zzb.zzb(bundleZzl, "BillingClient");
                            strZzg = com.google.android.gms.internal.play_billing.zzb.zzg(bundleZzl, "BillingClient");
                            if (iZzb != 0) {
                                com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "getSkuDetails() failed for queryProductDetailsAsync. Response code: " + iZzb);
                                aVar.f(zzcb.zza(23, 7, r.a(iZzb, strZzg)));
                            } else {
                                com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.");
                                aVar.f(zzcb.zza(45, 7, r.a(6, strZzg)));
                                i = i10;
                            }
                        }
                        i = iZzb;
                        break;
                    }
                    strZzg = "";
                    i = 0;
                    productDetailsResponseListener2.onProductDetailsResponse(r.a(i, strZzg), arrayList);
                    return null;
                }
            }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzao
                @Override // java.lang.Runnable
                public final void run() {
                    a aVar = this.zza;
                    ProductDetailsResponseListener productDetailsResponseListener2 = productDetailsResponseListener;
                    aVar.getClass();
                    BillingResult billingResult3 = r.f18694m;
                    aVar.f(zzcb.zza(24, 7, billingResult3));
                    productDetailsResponseListener2.onProductDetailsResponse(billingResult3, new ArrayList());
                }
            }, a()) == null) {
                BillingResult billingResultC = c();
                f(zzcb.zza(25, 7, billingResultC));
                productDetailsResponseListener.onProductDetailsResponse(billingResultC, new ArrayList());
            }
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void queryPurchaseHistoryAsync(QueryPurchaseHistoryParams queryPurchaseHistoryParams, PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        h(queryPurchaseHistoryParams.zza(), purchaseHistoryResponseListener);
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void queryPurchasesAsync(QueryPurchasesParams queryPurchasesParams, PurchasesResponseListener purchasesResponseListener) {
        i(queryPurchasesParams.zza(), purchasesResponseListener);
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void querySkuDetailsAsync(SkuDetailsParams skuDetailsParams, final SkuDetailsResponseListener skuDetailsResponseListener) {
        if (!isReady()) {
            BillingResult billingResult = r.f18693l;
            f(zzcb.zza(2, 8, billingResult));
            skuDetailsResponseListener.onSkuDetailsResponse(billingResult, null);
            return;
        }
        final String skuType = skuDetailsParams.getSkuType();
        final List<String> skusList = skuDetailsParams.getSkusList();
        if (TextUtils.isEmpty(skuType)) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Please fix the input params. SKU type can't be empty.");
            BillingResult billingResult2 = r.f18688f;
            f(zzcb.zza(49, 8, billingResult2));
            skuDetailsResponseListener.onSkuDetailsResponse(billingResult2, null);
            return;
        }
        if (skusList == null) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Please fix the input params. The list of SKUs can't be empty.");
            BillingResult billingResult3 = r.f18687e;
            f(zzcb.zza(48, 8, billingResult3));
            skuDetailsResponseListener.onSkuDetailsResponse(billingResult3, null);
            return;
        }
        final String str = null;
        if (e(new Callable(skuType, skusList, str, skuDetailsResponseListener) { // from class: com.android.billingclient.api.zzac
            public final /* synthetic */ String zzb;
            public final /* synthetic */ List zzc;
            public final /* synthetic */ SkuDetailsResponseListener zzd;

            {
                this.zzd = skuDetailsResponseListener;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                ArrayList arrayList;
                String strZzg;
                int iZzb;
                int i;
                List list;
                Bundle bundleZzk;
                com.google.android.gms.internal.play_billing.zzs zzsVar;
                String packageName;
                Bundle bundle;
                a aVar = this.zza;
                String str2 = this.zzb;
                List list2 = this.zzc;
                SkuDetailsResponseListener skuDetailsResponseListener2 = this.zzd;
                aVar.getClass();
                ArrayList arrayList2 = new ArrayList();
                int size = list2.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        arrayList = null;
                        strZzg = "";
                        iZzb = 0;
                        break;
                    }
                    int i11 = i10 + 20;
                    ArrayList<String> arrayList3 = new ArrayList<>(list2.subList(i10, i11 > size ? size : i11));
                    Bundle bundle2 = new Bundle();
                    bundle2.putStringArrayList("ITEM_ID_LIST", arrayList3);
                    bundle2.putString("playBillingLibraryVersion", aVar.f18615b);
                    try {
                        if (aVar.f18627o) {
                            try {
                                zzsVar = aVar.f18620g;
                                packageName = aVar.f18618e.getPackageName();
                            } catch (Exception e4) {
                                e = e4;
                                i = 8;
                            }
                            try {
                                int i12 = aVar.f18623k;
                                boolean zIsEnabledForOneTimeProducts = aVar.f18638z.isEnabledForOneTimeProducts();
                                arrayList = null;
                                try {
                                    list = list2;
                                    boolean z10 = aVar.f18634v && aVar.f18638z.isEnabledForPrepaidPlans();
                                    String str3 = aVar.f18615b;
                                    bundle = new Bundle();
                                    if (i12 >= 9) {
                                        bundle.putString("playBillingLibraryVersion", str3);
                                    }
                                    if (i12 >= 9 && zIsEnabledForOneTimeProducts) {
                                        bundle.putBoolean("enablePendingPurchases", true);
                                    }
                                    if (z10) {
                                        bundle.putBoolean("enablePendingPurchaseForSubscriptions", true);
                                    }
                                    i = 8;
                                } catch (Exception e10) {
                                    e = e10;
                                    i = 8;
                                }
                                try {
                                    bundleZzk = zzsVar.zzl(10, packageName, str2, bundle2, bundle);
                                } catch (Exception e11) {
                                    e = e11;
                                    com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "querySkuDetailsAsync got a remote exception (try to reconnect).", e);
                                    aVar.f(zzcb.zza(43, i, r.f18693l));
                                    strZzg = "Service connection is disconnected.";
                                    iZzb = -1;
                                    arrayList2 = arrayList;
                                    skuDetailsResponseListener2.onSkuDetailsResponse(r.a(iZzb, strZzg), arrayList2);
                                    return arrayList;
                                }
                            } catch (Exception e12) {
                                e = e12;
                                i = 8;
                                arrayList = null;
                                com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "querySkuDetailsAsync got a remote exception (try to reconnect).", e);
                                aVar.f(zzcb.zza(43, i, r.f18693l));
                                strZzg = "Service connection is disconnected.";
                                iZzb = -1;
                                arrayList2 = arrayList;
                                skuDetailsResponseListener2.onSkuDetailsResponse(r.a(iZzb, strZzg), arrayList2);
                                return arrayList;
                            }
                        } else {
                            list = list2;
                            i = 8;
                            arrayList = null;
                            bundleZzk = aVar.f18620g.zzk(3, aVar.f18618e.getPackageName(), str2, bundle2);
                        }
                        strZzg = "Item is unavailable for purchase.";
                        if (bundleZzk == null) {
                            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "querySkuDetailsAsync got null sku details list");
                            aVar.f(zzcb.zza(44, i, r.f18679A));
                            break;
                        }
                        if (bundleZzk.containsKey("DETAILS_LIST")) {
                            ArrayList<String> stringArrayList = bundleZzk.getStringArrayList("DETAILS_LIST");
                            if (stringArrayList == null) {
                                com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "querySkuDetailsAsync got null response list");
                                aVar.f(zzcb.zza(46, i, r.f18679A));
                                break;
                            }
                            for (int i13 = 0; i13 < stringArrayList.size(); i13++) {
                                try {
                                    SkuDetails skuDetails = new SkuDetails(stringArrayList.get(i13));
                                    com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Got sku details: ".concat(skuDetails.toString()));
                                    arrayList2.add(skuDetails);
                                } catch (JSONException e13) {
                                    com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Got a JSON exception trying to decode SkuDetails.", e13);
                                    strZzg = "Error trying to decode SkuDetails.";
                                    aVar.f(zzcb.zza(47, i, r.a(6, "Error trying to decode SkuDetails.")));
                                    iZzb = 6;
                                }
                            }
                            i10 = i11;
                            list2 = list;
                        } else {
                            iZzb = com.google.android.gms.internal.play_billing.zzb.zzb(bundleZzk, "BillingClient");
                            strZzg = com.google.android.gms.internal.play_billing.zzb.zzg(bundleZzk, "BillingClient");
                            if (iZzb != 0) {
                                com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "getSkuDetails() failed. Response code: " + iZzb);
                                aVar.f(zzcb.zza(23, i, r.a(iZzb, strZzg)));
                            } else {
                                com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "getSkuDetails() returned a bundle with neither an error nor a detail list.");
                                aVar.f(zzcb.zza(45, i, r.a(6, strZzg)));
                                iZzb = 6;
                            }
                        }
                    } catch (Exception e14) {
                        e = e14;
                        i = 8;
                    }
                }
                iZzb = 4;
                arrayList2 = arrayList;
                skuDetailsResponseListener2.onSkuDetailsResponse(r.a(iZzb, strZzg), arrayList2);
                return arrayList;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzad
            @Override // java.lang.Runnable
            public final void run() {
                a aVar = this.zza;
                SkuDetailsResponseListener skuDetailsResponseListener2 = skuDetailsResponseListener;
                aVar.getClass();
                BillingResult billingResult4 = r.f18694m;
                aVar.f(zzcb.zza(24, 8, billingResult4));
                skuDetailsResponseListener2.onSkuDetailsResponse(billingResult4, null);
            }
        }, a()) == null) {
            BillingResult billingResultC = c();
            f(zzcb.zza(25, 8, billingResultC));
            skuDetailsResponseListener.onSkuDetailsResponse(billingResultC, null);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    @zzg
    public final BillingResult showAlternativeBillingOnlyInformationDialog(final Activity activity, final AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener) {
        if (activity == null) {
            throw new IllegalArgumentException("Please provide a valid activity.");
        }
        if (!isReady()) {
            BillingResult billingResult = r.f18693l;
            f(zzcb.zza(2, 16, billingResult));
            return billingResult;
        }
        if (!this.f18636x) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Current Play Store version doesn't support alternative billing only.");
            BillingResult billingResult2 = r.f18681C;
            f(zzcb.zza(66, 16, billingResult2));
            return billingResult2;
        }
        Handler handler = this.f18616c;
        final f fVar = new f(this, handler, alternativeBillingOnlyInformationDialogListener);
        if (e(new Callable() { // from class: com.android.billingclient.api.zzs
            @Override // java.util.concurrent.Callable
            public final Object call() {
                a aVar = this.zza;
                Activity activity2 = activity;
                ResultReceiver resultReceiver = fVar;
                AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener2 = alternativeBillingOnlyInformationDialogListener;
                aVar.getClass();
                try {
                    aVar.f18620g.zzo(21, aVar.f18618e.getPackageName(), com.google.android.gms.internal.play_billing.zzb.zzd(aVar.f18615b), new k(new WeakReference(activity2), resultReceiver));
                    return null;
                } catch (Exception unused) {
                    BillingResult billingResult3 = r.f18691j;
                    aVar.f(zzcb.zza(74, 16, billingResult3));
                    alternativeBillingOnlyInformationDialogListener2.onAlternativeBillingOnlyInformationDialogResponse(billingResult3);
                    return null;
                }
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzt
            @Override // java.lang.Runnable
            public final void run() {
                a aVar = this.zza;
                AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener2 = alternativeBillingOnlyInformationDialogListener;
                aVar.getClass();
                BillingResult billingResult3 = r.f18694m;
                aVar.f(zzcb.zza(24, 16, billingResult3));
                alternativeBillingOnlyInformationDialogListener2.onAlternativeBillingOnlyInformationDialogResponse(billingResult3);
            }
        }, handler) != null) {
            return r.f18692k;
        }
        BillingResult billingResultC = c();
        f(zzcb.zza(25, 16, billingResultC));
        return billingResultC;
    }

    @Override // com.android.billingclient.api.BillingClient
    @zzh
    public final BillingResult showExternalOfferInformationDialog(final Activity activity, final ExternalOfferInformationDialogListener externalOfferInformationDialogListener) {
        if (activity == null) {
            throw new IllegalArgumentException("Please provide a valid activity.");
        }
        if (!isReady()) {
            BillingResult billingResult = r.f18693l;
            f(zzcb.zza(2, 25, billingResult));
            return billingResult;
        }
        if (!this.f18637y) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Current Play Store version doesn't support external offer.");
            BillingResult billingResult2 = r.f18704w;
            f(zzcb.zza(103, 25, billingResult2));
            return billingResult2;
        }
        Handler handler = this.f18616c;
        final g gVar = new g(this, handler, externalOfferInformationDialogListener);
        if (e(new Callable() { // from class: com.android.billingclient.api.zzaj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                a aVar = this.zza;
                Activity activity2 = activity;
                ResultReceiver resultReceiver = gVar;
                ExternalOfferInformationDialogListener externalOfferInformationDialogListener2 = externalOfferInformationDialogListener;
                aVar.getClass();
                try {
                    aVar.f18620g.zzq(22, aVar.f18618e.getPackageName(), com.google.android.gms.internal.play_billing.zzb.zzd(aVar.f18615b), new m(new WeakReference(activity2), resultReceiver));
                    return null;
                } catch (Exception e4) {
                    BillingResult billingResult3 = r.f18691j;
                    aVar.f(zzcb.zzb(98, 25, billingResult3, B4.g.o(e4.getClass().getName(), ": ", com.google.android.gms.internal.play_billing.zzab.zzb(e4.getMessage()))));
                    externalOfferInformationDialogListener2.onExternalOfferInformationDialogResponse(billingResult3);
                    return null;
                }
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzal
            @Override // java.lang.Runnable
            public final void run() {
                a aVar = this.zza;
                ExternalOfferInformationDialogListener externalOfferInformationDialogListener2 = externalOfferInformationDialogListener;
                aVar.getClass();
                BillingResult billingResult3 = r.f18694m;
                aVar.f(zzcb.zza(24, 25, billingResult3));
                externalOfferInformationDialogListener2.onExternalOfferInformationDialogResponse(billingResult3);
            }
        }, handler) != null) {
            return r.f18692k;
        }
        BillingResult billingResultC = c();
        f(zzcb.zza(25, 25, billingResultC));
        return billingResultC;
    }

    @Override // com.android.billingclient.api.BillingClient
    public final BillingResult showInAppMessages(final Activity activity, InAppMessageParams inAppMessageParams, InAppMessageResponseListener inAppMessageResponseListener) {
        if (!isReady()) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Service disconnected.");
            return r.f18693l;
        }
        if (!this.f18628p) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Current client doesn't support showing in-app messages.");
            return r.f18703v;
        }
        View viewFindViewById = activity.findViewById(R.id.content);
        IBinder windowToken = viewFindViewById.getWindowToken();
        Rect rect = new Rect();
        viewFindViewById.getGlobalVisibleRect(rect);
        final Bundle bundle = new Bundle();
        bundle.putBinder("KEY_WINDOW_TOKEN", windowToken);
        bundle.putInt("KEY_DIMEN_LEFT", rect.left);
        bundle.putInt("KEY_DIMEN_TOP", rect.top);
        bundle.putInt("KEY_DIMEN_RIGHT", rect.right);
        bundle.putInt("KEY_DIMEN_BOTTOM", rect.bottom);
        bundle.putString("playBillingLibraryVersion", this.f18615b);
        bundle.putIntegerArrayList("KEY_CATEGORY_IDS", inAppMessageParams.zza());
        Handler handler = this.f18616c;
        final e eVar = new e(handler, inAppMessageResponseListener, 0);
        e(new Callable() { // from class: com.android.billingclient.api.zzap
            @Override // java.util.concurrent.Callable
            public final Object call() throws RemoteException {
                a aVar = this.zza;
                Bundle bundle2 = bundle;
                Activity activity2 = activity;
                aVar.f18620g.zzt(12, aVar.f18618e.getPackageName(), bundle2, new p(new WeakReference(activity2), eVar));
                return null;
            }
        }, 5000L, null, handler);
        return r.f18692k;
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void startConnection(BillingClientStateListener billingClientStateListener) {
        if (isReady()) {
            com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Service connection is valid. No need to re-initialize.");
            g(zzcb.zzc(6));
            billingClientStateListener.onBillingSetupFinished(r.f18692k);
            return;
        }
        int i = 1;
        if (this.f18614a == 1) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Client is already in the process of connecting to billing service.");
            BillingResult billingResult = r.f18686d;
            f(zzcb.zza(37, 6, billingResult));
            billingClientStateListener.onBillingSetupFinished(billingResult);
            return;
        }
        if (this.f18614a == 3) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            BillingResult billingResult2 = r.f18693l;
            f(zzcb.zza(38, 6, billingResult2));
            billingClientStateListener.onBillingSetupFinished(billingResult2);
            return;
        }
        this.f18614a = 1;
        com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Starting in-app billing setup.");
        this.f18621h = new h(this, billingClientStateListener);
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        intent.setPackage("com.android.vending");
        List<ResolveInfo> listQueryIntentServices = this.f18618e.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            i = 41;
        } else {
            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
            if (serviceInfo != null) {
                String str = serviceInfo.packageName;
                String str2 = serviceInfo.name;
                if (!"com.android.vending".equals(str) || str2 == null) {
                    com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "The device doesn't have valid Play Store.");
                    i = 40;
                } else {
                    ComponentName componentName = new ComponentName(str, str2);
                    Intent intent2 = new Intent(intent);
                    intent2.setComponent(componentName);
                    intent2.putExtra("playBillingLibraryVersion", this.f18615b);
                    if (this.f18618e.bindService(intent2, this.f18621h, 1)) {
                        com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Service was bonded successfully.");
                        return;
                    } else {
                        com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Connection to Billing service is blocked.");
                        i = 39;
                    }
                }
            }
        }
        this.f18614a = 0;
        com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Billing service unavailable on device.");
        BillingResult billingResult3 = r.f18685c;
        f(zzcb.zza(i, 6, billingResult3));
        billingClientStateListener.onBillingSetupFinished(billingResult3);
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void queryPurchaseHistoryAsync(String str, PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        h(str, purchaseHistoryResponseListener);
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void queryPurchasesAsync(String str, PurchasesResponseListener purchasesResponseListener) {
        i(str, purchasesResponseListener);
    }

    public a(PendingPurchasesParams pendingPurchasesParams, Context context) {
        this.f18614a = 0;
        this.f18616c = new Handler(Looper.getMainLooper());
        this.f18623k = 0;
        this.f18615b = d();
        this.f18618e = context.getApplicationContext();
        zzgt zzgtVarZzy = zzgu.zzy();
        zzgtVarZzy.zzn(d());
        zzgtVarZzy.zzm(this.f18618e.getPackageName());
        this.f18619f = new C1553s(this.f18618e, (zzgu) zzgtVarZzy.zzf());
        com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f18617d = new w(this.f18618e, null, null, this.f18619f);
        this.f18638z = pendingPurchasesParams;
        this.f18618e.getPackageName();
    }

    public a(PendingPurchasesParams pendingPurchasesParams, Context context, PurchasesUpdatedListener purchasesUpdatedListener) {
        String strD = d();
        this.f18614a = 0;
        this.f18616c = new Handler(Looper.getMainLooper());
        this.f18623k = 0;
        this.f18615b = strD;
        this.f18618e = context.getApplicationContext();
        zzgt zzgtVarZzy = zzgu.zzy();
        zzgtVarZzy.zzn(strD);
        zzgtVarZzy.zzm(this.f18618e.getPackageName());
        this.f18619f = new C1553s(this.f18618e, (zzgu) zzgtVarZzy.zzf());
        if (purchasesUpdatedListener == null) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f18617d = new w(this.f18618e, purchasesUpdatedListener, null, this.f18619f);
        this.f18638z = pendingPurchasesParams;
        this.f18612A = false;
        this.f18618e.getPackageName();
    }

    public a(PendingPurchasesParams pendingPurchasesParams, Context context, PurchasesUpdatedListener purchasesUpdatedListener, UserChoiceBillingListener userChoiceBillingListener) {
        String strD = d();
        this.f18614a = 0;
        this.f18616c = new Handler(Looper.getMainLooper());
        this.f18623k = 0;
        this.f18615b = strD;
        this.f18618e = context.getApplicationContext();
        zzgt zzgtVarZzy = zzgu.zzy();
        zzgtVarZzy.zzn(strD);
        zzgtVarZzy.zzm(this.f18618e.getPackageName());
        this.f18619f = new C1553s(this.f18618e, (zzgu) zzgtVarZzy.zzf());
        if (purchasesUpdatedListener == null) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f18617d = new w(this.f18618e, purchasesUpdatedListener, userChoiceBillingListener, this.f18619f);
        this.f18638z = pendingPurchasesParams;
        this.f18612A = userChoiceBillingListener != null;
    }
}
