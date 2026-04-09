package com.android.billingclient.api;

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
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.AnyThread;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.android.billingclient.BuildConfig;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.google.android.gms.internal.play_billing.zzev;
import com.google.android.gms.internal.play_billing.zzfb;
import com.google.android.gms.internal.play_billing.zzjx;
import com.google.android.gms.internal.play_billing.zzjz;
import com.google.android.gms.internal.play_billing.zzkb;
import com.google.android.gms.internal.play_billing.zzkd;
import com.google.android.gms.internal.play_billing.zzke;
import com.google.android.gms.internal.play_billing.zzki;
import com.google.android.gms.internal.play_billing.zzks;
import com.google.android.gms.internal.play_billing.zzku;
import com.google.android.gms.internal.play_billing.zzky;
import com.google.android.gms.internal.play_billing.zzlb;
import com.google.android.gms.internal.play_billing.zzlv;
import com.google.android.gms.internal.play_billing.zzlx;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.json.JSONException;

/* loaded from: classes.dex */
class BillingClientImpl extends BillingClient {
    private boolean zzA;

    @Nullable
    private PendingPurchasesParams zzB;
    private boolean zzC;
    private ExecutorService zzD;
    private volatile zzev zzE;
    private final Long zzF;
    private final Object zza;
    private volatile int zzb;
    private final String zzc;
    private final Handler zzd;

    @Nullable
    private volatile zzn zze;
    private Context zzf;
    private zzch zzg;
    private volatile com.google.android.gms.internal.play_billing.zzan zzh;
    private volatile zzba zzi;
    private boolean zzj;
    private boolean zzk;
    private int zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private boolean zzx;
    private boolean zzy;
    private boolean zzz;

    private BillingClientImpl(Activity activity, PendingPurchasesParams pendingPurchasesParams, String str) {
        this(activity.getApplicationContext(), pendingPurchasesParams, new zzbm(), str, null, null, null, null);
    }

    private void initialize(Context context, PurchasesUpdatedListener purchasesUpdatedListener, PendingPurchasesParams pendingPurchasesParams, @Nullable zzb zzbVar, String str, @Nullable zzch zzchVar) {
        this.zzf = context.getApplicationContext();
        zzks zzksVarZzc = zzku.zzc();
        zzksVarZzc.zzo(str);
        zzksVarZzc.zzn(this.zzf.getPackageName());
        zzksVarZzc.zzm(this.zzF.longValue());
        if (zzchVar != null) {
            this.zzg = zzchVar;
        } else {
            this.zzg = new zzcl(this.zzf, (zzku) zzksVarZzc.zzf());
        }
        if (purchasesUpdatedListener == null) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.zze = new zzn(this.zzf, purchasesUpdatedListener, null, zzbVar, null, this.zzg);
        this.zzB = pendingPurchasesParams;
        this.zzC = zzbVar != null;
        this.zzf.getPackageName();
    }

    private int launchBillingFlowCpp(Activity activity, BillingFlowParams billingFlowParams) {
        return launchBillingFlow(activity, billingFlowParams).getResponseCode();
    }

    private void startConnection(long j10) {
        startConnection(new zzbm(j10));
    }

    @Nullable
    public static Future zzE(Callable callable, long j10, @Nullable final Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            final Future futureSubmit = executorService.submit(callable);
            handler.postDelayed(new Runnable() { // from class: com.android.billingclient.api.zzaf
                @Override // java.lang.Runnable
                public final void run() {
                    Future future = futureSubmit;
                    if (future.isDone() || future.isCancelled()) {
                        return;
                    }
                    Runnable runnable2 = runnable;
                    future.cancel(true);
                    com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Async task is taking too long, cancel it!");
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            }, (long) (j10 * 0.95d));
            return futureSubmit;
        } catch (Exception e10) {
            com.google.android.gms.internal.play_billing.zze.zzm("BillingClient", "Async task throws exception!", e10);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BillingResult zzaA() {
        int[] iArr = {0, 3};
        synchronized (this.zza) {
            for (int i10 = 0; i10 < 2; i10++) {
                if (this.zzb == iArr[i10]) {
                    return zzcj.zzm;
                }
            }
            return zzcj.zzk;
        }
    }

    private final String zzaB(QueryProductDetailsParams queryProductDetailsParams) {
        if (TextUtils.isEmpty(null)) {
            return this.zzf.getPackageName();
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    private static String zzaC() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return BuildConfig.VERSION_NAME;
        }
    }

    private final synchronized ExecutorService zzaD() {
        try {
            if (this.zzD == null) {
                this.zzD = Executors.newFixedThreadPool(com.google.android.gms.internal.play_billing.zze.zza, new zzas(this));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.zzD;
    }

    /* JADX WARN: Finally extract failed */
    private final void zzaE(ConsumeParams consumeParams, ConsumeResponseListener consumeResponseListener) throws Throwable {
        com.google.android.gms.internal.play_billing.zzan zzanVar;
        int iZza;
        String strZzh;
        String purchaseToken = consumeParams.getPurchaseToken();
        try {
            com.google.android.gms.internal.play_billing.zze.zzk("BillingClient", "Consuming purchase with token: " + purchaseToken);
            synchronized (this.zza) {
                try {
                    try {
                        zzanVar = this.zzh;
                    } catch (DeadObjectException e10) {
                        e = e10;
                        zzaW(consumeResponseListener, purchaseToken, zzcj.zzm, 29, "Error consuming purchase!", e);
                        return;
                    } catch (Exception e11) {
                        e = e11;
                        zzaW(consumeResponseListener, purchaseToken, zzcj.zzk, 29, "Error consuming purchase!", e);
                        return;
                    }
                } catch (Throwable th) {
                    th = th;
                    while (true) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                }
            }
            if (zzanVar == null) {
                try {
                    zzaW(consumeResponseListener, purchaseToken, zzcj.zzm, 119, "Service has been reset to null.", null);
                    return;
                } catch (DeadObjectException e12) {
                    e = e12;
                    zzaW(consumeResponseListener, purchaseToken, zzcj.zzm, 29, "Error consuming purchase!", e);
                    return;
                } catch (Exception e13) {
                    e = e13;
                    zzaW(consumeResponseListener, purchaseToken, zzcj.zzk, 29, "Error consuming purchase!", e);
                    return;
                }
            }
            if (this.zzo) {
                String packageName = this.zzf.getPackageName();
                boolean z10 = this.zzo;
                String str = this.zzc;
                long jLongValue = this.zzF.longValue();
                Bundle bundle = new Bundle();
                if (z10) {
                    com.google.android.gms.internal.play_billing.zze.zzc(bundle, str, jLongValue);
                }
                Bundle bundleZze = zzanVar.zze(9, packageName, purchaseToken, bundle);
                iZza = bundleZze.getInt("RESPONSE_CODE");
                strZzh = com.google.android.gms.internal.play_billing.zze.zzh(bundleZze, "BillingClient");
            } else {
                iZza = zzanVar.zza(3, this.zzf.getPackageName(), purchaseToken);
                strZzh = "";
            }
            BillingResult billingResultZza = zzcj.zza(iZza, strZzh);
            if (iZza == 0) {
                com.google.android.gms.internal.play_billing.zze.zzk("BillingClient", "Successfully consumed purchase.");
                consumeResponseListener.onConsumeResponse(billingResultZza, purchaseToken);
            } else {
                zzaW(consumeResponseListener, purchaseToken, billingResultZza, 23, "Error consuming purchase with token. Response code: " + iZza, null);
            }
        } catch (DeadObjectException e14) {
            e = e14;
        } catch (Exception e15) {
            e = e15;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaF(zzjz zzjzVar) {
        try {
            this.zzg.zzb(zzjzVar, this.zzl);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zze.zzm("BillingClient", "Unable to log.", th);
        }
    }

    private final void zzaG(zzkd zzkdVar) {
        try {
            this.zzg.zzd(zzkdVar, this.zzl);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zze.zzm("BillingClient", "Unable to log.", th);
        }
    }

    private final void zzaH(String str, final PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        if (!isReady()) {
            BillingResult billingResult = zzcj.zzm;
            zzbe(2, 11, billingResult);
            purchaseHistoryResponseListener.onPurchaseHistoryResponse(billingResult, null);
        } else if (zzE(new zzau(this, str, purchaseHistoryResponseListener), 30000L, new Runnable() { // from class: com.android.billingclient.api.zzal
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzak(purchaseHistoryResponseListener);
            }
        }, zzax(), zzaD()) == null) {
            BillingResult billingResultZzaA = zzaA();
            zzbe(25, 11, billingResultZzaA);
            purchaseHistoryResponseListener.onPurchaseHistoryResponse(billingResultZzaA, null);
        }
    }

    private final void zzaI(String str, final PurchasesResponseListener purchasesResponseListener) {
        if (!isReady()) {
            BillingResult billingResult = zzcj.zzm;
            zzbe(2, 9, billingResult);
            purchasesResponseListener.onQueryPurchasesResponse(billingResult, com.google.android.gms.internal.play_billing.zzco.zzl());
        } else {
            if (TextUtils.isEmpty(str)) {
                com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Please provide a valid product type.");
                BillingResult billingResult2 = zzcj.zzh;
                zzbe(50, 9, billingResult2);
                purchasesResponseListener.onQueryPurchasesResponse(billingResult2, com.google.android.gms.internal.play_billing.zzco.zzl());
                return;
            }
            if (zzE(new zzat(this, str, purchasesResponseListener), 30000L, new Runnable() { // from class: com.android.billingclient.api.zzac
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzal(purchasesResponseListener);
                }
            }, zzax(), zzaD()) == null) {
                BillingResult billingResultZzaA = zzaA();
                zzbe(25, 9, billingResultZzaA);
                purchasesResponseListener.onQueryPurchasesResponse(billingResultZzaA, com.google.android.gms.internal.play_billing.zzco.zzl());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaJ(int i10) {
        synchronized (this.zza) {
            try {
                if (this.zzb == 3) {
                    return;
                }
                com.google.android.gms.internal.play_billing.zze.zzk("BillingClient", "Setting clientState from " + zzaN(this.zzb) + " to " + zzaN(i10));
                this.zzb = i10;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final synchronized void zzaK() {
        ExecutorService executorService = this.zzD;
        if (executorService != null) {
            executorService.shutdownNow();
            this.zzD = null;
            this.zzE = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaL() {
        synchronized (this.zza) {
            if (this.zzi != null) {
                try {
                    this.zzf.unbindService(this.zzi);
                } catch (Throwable th) {
                    try {
                        com.google.android.gms.internal.play_billing.zze.zzm("BillingClient", "There was an exception while unbinding service!", th);
                        this.zzh = null;
                        this.zzi = null;
                    } finally {
                        this.zzh = null;
                        this.zzi = null;
                    }
                }
            }
        }
    }

    private final boolean zzaM() {
        return this.zzw && this.zzB.isEnabledForPrepaidPlans();
    }

    private static final String zzaN(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? "CLOSED" : "CONNECTED" : "CONNECTING" : "DISCONNECTED";
    }

    private final zzbj zzaO(BillingResult billingResult, int i10, String str, @Nullable Exception exc) {
        com.google.android.gms.internal.play_billing.zze.zzm("BillingClient", str, exc);
        zzbf(i10, 7, billingResult, zzcg.zza(exc));
        return new zzbj(billingResult.getResponseCode(), billingResult.getDebugMessage(), new ArrayList());
    }

    private final zzbk zzaP(BillingResult billingResult, int i10, String str, @Nullable Exception exc) {
        com.google.android.gms.internal.play_billing.zze.zzm("BillingClient", str, exc);
        zzbf(i10, 11, billingResult, zzcg.zza(exc));
        return new zzbk(billingResult, null);
    }

    private final zzcv zzaQ(int i10, BillingResult billingResult, int i11, String str, @Nullable Exception exc) {
        zzbf(i11, 9, billingResult, zzcg.zza(exc));
        com.google.android.gms.internal.play_billing.zze.zzm("BillingClient", str, exc);
        return new zzcv(billingResult, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzcv zzaR(String str, int i10) {
        com.google.android.gms.internal.play_billing.zzan zzanVar;
        BillingClientImpl billingClientImpl = this;
        com.google.android.gms.internal.play_billing.zze.zzk("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        Bundle bundleZzd = com.google.android.gms.internal.play_billing.zze.zzd(billingClientImpl.zzo, billingClientImpl.zzw, billingClientImpl.zzB.isEnabledForOneTimeProducts(), billingClientImpl.zzB.isEnabledForPrepaidPlans(), billingClientImpl.zzc, billingClientImpl.zzF.longValue());
        String string = null;
        do {
            try {
                synchronized (billingClientImpl.zza) {
                    zzanVar = billingClientImpl.zzh;
                }
                if (zzanVar == null) {
                    return billingClientImpl.zzaQ(9, zzcj.zzm, 119, "Service has been reset to null", null);
                }
                Bundle bundleZzj = billingClientImpl.zzo ? zzanVar.zzj(true != billingClientImpl.zzw ? 9 : 19, billingClientImpl.zzf.getPackageName(), str, string, bundleZzd) : zzanVar.zzi(3, billingClientImpl.zzf.getPackageName(), str, string);
                zzcx zzcxVarZza = zzcy.zza(bundleZzj, "BillingClient", "getPurchase()");
                BillingResult billingResultZza = zzcxVarZza.zza();
                if (billingResultZza != zzcj.zzl) {
                    return billingClientImpl.zzaQ(9, billingResultZza, zzcxVarZza.zzb(), "Purchase bundle invalid", null);
                }
                ArrayList<String> stringArrayList = bundleZzj.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = bundleZzj.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = bundleZzj.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                boolean z10 = false;
                for (int i11 = 0; i11 < stringArrayList2.size(); i11++) {
                    String str2 = stringArrayList2.get(i11);
                    String str3 = stringArrayList3.get(i11);
                    com.google.android.gms.internal.play_billing.zze.zzk("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList.get(i11))));
                    try {
                        Purchase purchase = new Purchase(str2, str3);
                        if (TextUtils.isEmpty(purchase.getPurchaseToken())) {
                            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "BUG: empty/null token!");
                            z10 = true;
                        }
                        arrayList.add(purchase);
                    } catch (JSONException e10) {
                        return zzaQ(9, zzcj.zzk, 51, "Got an exception trying to decode the purchase!", e10);
                    }
                }
                billingClientImpl = this;
                if (z10) {
                    billingClientImpl.zzbe(26, 9, zzcj.zzk);
                }
                string = bundleZzj.getString("INAPP_CONTINUATION_TOKEN");
                com.google.android.gms.internal.play_billing.zze.zzk("BillingClient", "Continuation token: ".concat(String.valueOf(string)));
            } catch (DeadObjectException e11) {
                return zzaQ(9, zzcj.zzm, 52, "Got exception trying to get purchases try to reconnect", e11);
            } catch (Exception e12) {
                return billingClientImpl.zzaQ(9, zzcj.zzk, 52, "Got exception trying to get purchases try to reconnect", e12);
            }
        } while (!TextUtils.isEmpty(string));
        return new zzcv(zzcj.zzl, arrayList);
    }

    private final zzdc zzaS(BillingResult billingResult, int i10, String str, @Nullable Exception exc) {
        com.google.android.gms.internal.play_billing.zze.zzm("BillingClient", str, exc);
        zzbf(i10, 8, billingResult, zzcg.zza(exc));
        return new zzdc(billingResult.getResponseCode(), billingResult.getDebugMessage(), null);
    }

    private final void zzaT(BillingResult billingResult, int i10, int i11) {
        zzkd zzkdVar = null;
        zzjz zzjzVar = null;
        if (billingResult.getResponseCode() == 0) {
            int i12 = zzcg.zza;
            try {
                zzkb zzkbVarZzc = zzkd.zzc();
                zzkbVarZzc.zzn(5);
                zzky zzkyVarZzc = zzlb.zzc();
                zzkyVarZzc.zza(i11);
                zzkbVarZzc.zza((zzlb) zzkyVarZzc.zzf());
                zzkdVar = (zzkd) zzkbVarZzc.zzf();
            } catch (Exception e10) {
                com.google.android.gms.internal.play_billing.zze.zzm("BillingLogger", "Unable to create logging payload", e10);
            }
            zzaG(zzkdVar);
            return;
        }
        int i13 = zzcg.zza;
        try {
            zzjx zzjxVarZzc = zzjz.zzc();
            zzke zzkeVarZzc = zzki.zzc();
            zzkeVarZzc.zzn(billingResult.getResponseCode());
            zzkeVarZzc.zzm(billingResult.getDebugMessage());
            zzkeVarZzc.zzo(i10);
            zzjxVarZzc.zza(zzkeVarZzc);
            zzjxVarZzc.zzn(5);
            zzky zzkyVarZzc2 = zzlb.zzc();
            zzkyVarZzc2.zza(i11);
            zzjxVarZzc.zzm((zzlb) zzkyVarZzc2.zzf());
            zzjzVar = (zzjz) zzjxVarZzc.zzf();
        } catch (Exception e11) {
            com.google.android.gms.internal.play_billing.zze.zzm("BillingLogger", "Unable to create logging payload", e11);
        }
        zzaF(zzjzVar);
    }

    private final void zzaU(AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener, BillingResult billingResult, int i10, @Nullable Exception exc) {
        com.google.android.gms.internal.play_billing.zze.zzm("BillingClient", "Error in acknowledge purchase!", exc);
        zzbf(i10, 3, billingResult, zzcg.zza(exc));
        acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult);
    }

    private final void zzaV(AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener, BillingResult billingResult, int i10, @Nullable Exception exc) {
        zzbf(i10, 14, billingResult, zzcg.zza(exc));
        alternativeBillingOnlyAvailabilityListener.onAlternativeBillingOnlyAvailabilityResponse(billingResult);
    }

    private final void zzaW(ConsumeResponseListener consumeResponseListener, String str, BillingResult billingResult, int i10, String str2, @Nullable Exception exc) {
        com.google.android.gms.internal.play_billing.zze.zzm("BillingClient", str2, exc);
        zzbf(i10, 4, billingResult, zzcg.zza(exc));
        consumeResponseListener.onConsumeResponse(billingResult, str);
    }

    private final void zzaX(AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener, BillingResult billingResult, int i10, @Nullable Exception exc) {
        zzbf(i10, 15, billingResult, zzcg.zza(exc));
        alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(billingResult, null);
    }

    private final void zzaY(ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener, BillingResult billingResult, int i10, @Nullable Exception exc) {
        zzbf(i10, 24, billingResult, zzcg.zza(exc));
        externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(billingResult, null);
    }

    private final void zzaZ(ExternalOfferAvailabilityListener externalOfferAvailabilityListener, BillingResult billingResult, int i10, @Nullable Exception exc) {
        zzbf(i10, 23, billingResult, zzcg.zza(exc));
        externalOfferAvailabilityListener.onExternalOfferAvailabilityResponse(billingResult);
    }

    public static /* bridge */ /* synthetic */ boolean zzaq(BillingClientImpl billingClientImpl) {
        boolean z10;
        synchronized (billingClientImpl.zza) {
            z10 = true;
            if (billingClientImpl.zzb != 1) {
                z10 = false;
            }
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Handler zzax() {
        return Looper.myLooper() == null ? this.zzd : new Handler(Looper.myLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzbk zzay(String str) {
        com.google.android.gms.internal.play_billing.zzan zzanVar;
        com.google.android.gms.internal.play_billing.zze.zzk("BillingClient", "Querying purchase history, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        Bundle bundleZzd = com.google.android.gms.internal.play_billing.zze.zzd(this.zzo, this.zzw, this.zzB.isEnabledForOneTimeProducts(), this.zzB.isEnabledForPrepaidPlans(), this.zzc, this.zzF.longValue());
        String string = null;
        while (this.zzm) {
            try {
                synchronized (this.zza) {
                    zzanVar = this.zzh;
                }
                if (zzanVar == null) {
                    return zzaP(zzcj.zzm, 119, "Service reset to null", null);
                }
                Bundle bundleZzh = zzanVar.zzh(6, this.zzf.getPackageName(), str, string, bundleZzd);
                zzcx zzcxVarZza = zzcy.zza(bundleZzh, "BillingClient", "getPurchaseHistory()");
                BillingResult billingResultZza = zzcxVarZza.zza();
                if (billingResultZza != zzcj.zzl) {
                    zzbe(zzcxVarZza.zzb(), 11, billingResultZza);
                    return new zzbk(billingResultZza, null);
                }
                ArrayList<String> stringArrayList = bundleZzh.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = bundleZzh.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = bundleZzh.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                boolean z10 = false;
                for (int i10 = 0; i10 < stringArrayList2.size(); i10++) {
                    String str2 = stringArrayList2.get(i10);
                    String str3 = stringArrayList3.get(i10);
                    com.google.android.gms.internal.play_billing.zze.zzk("BillingClient", "Purchase record found for sku : ".concat(String.valueOf(stringArrayList.get(i10))));
                    try {
                        PurchaseHistoryRecord purchaseHistoryRecord = new PurchaseHistoryRecord(str2, str3);
                        if (TextUtils.isEmpty(purchaseHistoryRecord.getPurchaseToken())) {
                            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "BUG: empty/null token!");
                            z10 = true;
                        }
                        arrayList.add(purchaseHistoryRecord);
                    } catch (JSONException e10) {
                        return zzaP(zzcj.zzk, 51, "Got an exception trying to decode the purchase!", e10);
                    }
                }
                if (z10) {
                    zzbe(26, 11, zzcj.zzk);
                }
                string = bundleZzh.getString("INAPP_CONTINUATION_TOKEN");
                com.google.android.gms.internal.play_billing.zze.zzk("BillingClient", "Continuation token: ".concat(String.valueOf(string)));
                if (TextUtils.isEmpty(string)) {
                    return new zzbk(zzcj.zzl, arrayList);
                }
            } catch (DeadObjectException e11) {
                return zzaP(zzcj.zzm, 59, "Got exception trying to get purchase history", e11);
            } catch (Exception e12) {
                return zzaP(zzcj.zzk, 59, "Got exception trying to get purchase history", e12);
            }
        }
        com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "getPurchaseHistory is not supported on current device");
        return new zzbk(zzcj.zzq, null);
    }

    private final BillingResult zzaz() {
        com.google.android.gms.internal.play_billing.zze.zzk("BillingClient", "Service connection is valid. No need to re-initialize.");
        zzkb zzkbVarZzc = zzkd.zzc();
        zzkbVarZzc.zzn(6);
        zzlv zzlvVarZzc = zzlx.zzc();
        zzlvVarZzc.zza(true);
        zzkbVarZzc.zzm(zzlvVarZzc);
        zzaG((zzkd) zzkbVarZzc.zzf());
        return zzcj.zzl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzba(ExternalOfferInformationDialogListener externalOfferInformationDialogListener, BillingResult billingResult, int i10, @Nullable Exception exc) {
        zzbf(i10, 25, billingResult, zzcg.zza(exc));
        externalOfferInformationDialogListener.onExternalOfferInformationDialogResponse(billingResult);
    }

    private final void zzbb(BillingConfigResponseListener billingConfigResponseListener, BillingResult billingResult, int i10, @Nullable Exception exc) {
        com.google.android.gms.internal.play_billing.zze.zzm("BillingClient", "getBillingConfig got an exception.", exc);
        zzbf(i10, 13, billingResult, zzcg.zza(exc));
        billingConfigResponseListener.onBillingConfigResponse(billingResult, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzbc(AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener, BillingResult billingResult, int i10, @Nullable Exception exc) {
        zzbf(i10, 16, billingResult, zzcg.zza(exc));
        alternativeBillingOnlyInformationDialogListener.onAlternativeBillingOnlyInformationDialogResponse(billingResult);
    }

    private final void zzbd(int i10, int i11, @Nullable Exception exc) {
        zzjz zzjzVar;
        com.google.android.gms.internal.play_billing.zze.zzm("BillingClient", "showInAppMessages error.", exc);
        zzch zzchVar = this.zzg;
        String strZza = zzcg.zza(exc);
        try {
            zzke zzkeVarZzc = zzki.zzc();
            zzkeVarZzc.zzn(i10);
            zzkeVarZzc.zzo(i11);
            if (strZza != null) {
                zzkeVarZzc.zza(strZza);
            }
            zzjx zzjxVarZzc = zzjz.zzc();
            zzjxVarZzc.zza(zzkeVarZzc);
            zzjxVarZzc.zzn(30);
            zzjzVar = (zzjz) zzjxVarZzc.zzf();
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zze.zzm("BillingLogger", "Unable to create logging payload", th);
            zzjzVar = null;
        }
        zzchVar.zza(zzjzVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zzbe(int i10, int i11, BillingResult billingResult) {
        try {
            zzaF(zzcg.zzb(i10, i11, billingResult));
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zze.zzm("BillingClient", "Unable to log.", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzbf(int i10, int i11, BillingResult billingResult, @Nullable String str) {
        try {
            zzaF(zzcg.zzc(i10, i11, billingResult, str));
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zze.zzm("BillingClient", "Unable to log.", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zzbg(int i10) {
        try {
            zzaG(zzcg.zzd(i10));
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zze.zzm("BillingClient", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void acknowledgePurchase(final AcknowledgePurchaseParams acknowledgePurchaseParams, final AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) {
        if (!isReady()) {
            BillingResult billingResult = zzcj.zzm;
            zzbe(2, 3, billingResult);
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult);
            return;
        }
        if (TextUtils.isEmpty(acknowledgePurchaseParams.getPurchaseToken())) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Please provide a valid purchase token.");
            BillingResult billingResult2 = zzcj.zzj;
            zzbe(26, 3, billingResult2);
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult2);
            return;
        }
        if (!this.zzo) {
            BillingResult billingResult3 = zzcj.zzb;
            zzbe(27, 3, billingResult3);
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult3);
        } else if (zzE(new Callable() { // from class: com.android.billingclient.api.zzt
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                this.zza.zzs(acknowledgePurchaseResponseListener, acknowledgePurchaseParams);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzu
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzab(acknowledgePurchaseResponseListener);
            }
        }, zzax(), zzaD()) == null) {
            BillingResult billingResultZzaA = zzaA();
            zzbe(25, 3, billingResultZzaA);
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResultZzaA);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void consumeAsync(final ConsumeParams consumeParams, final ConsumeResponseListener consumeResponseListener) {
        if (!isReady()) {
            BillingResult billingResult = zzcj.zzm;
            zzbe(2, 4, billingResult);
            consumeResponseListener.onConsumeResponse(billingResult, consumeParams.getPurchaseToken());
        } else if (zzE(new Callable() { // from class: com.android.billingclient.api.zzag
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                this.zza.zzt(consumeParams, consumeResponseListener);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzah
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzad(consumeResponseListener, consumeParams);
            }
        }, zzax(), zzaD()) == null) {
            BillingResult billingResultZzaA = zzaA();
            zzbe(25, 4, billingResultZzaA);
            consumeResponseListener.onConsumeResponse(billingResultZzaA, consumeParams.getPurchaseToken());
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    @zzf
    public void createAlternativeBillingOnlyReportingDetailsAsync(final AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener) {
        if (!isReady()) {
            zzaX(alternativeBillingOnlyReportingDetailsListener, zzcj.zzm, 2, null);
            return;
        }
        if (!this.zzy) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Current client doesn't support alternative billing only.");
            zzaX(alternativeBillingOnlyReportingDetailsListener, zzcj.zzE, 66, null);
        } else if (zzE(new Callable() { // from class: com.android.billingclient.api.zzx
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                this.zza.zzx(alternativeBillingOnlyReportingDetailsListener);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzy
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzae(alternativeBillingOnlyReportingDetailsListener);
            }
        }, zzax(), zzaD()) == null) {
            zzaX(alternativeBillingOnlyReportingDetailsListener, zzaA(), 25, null);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    @zzg
    public void createExternalOfferReportingDetailsAsync(final ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener) {
        if (!isReady()) {
            zzaY(externalOfferReportingDetailsListener, zzcj.zzm, 2, null);
            return;
        }
        if (!this.zzz) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Current client doesn't support external offer.");
            zzaY(externalOfferReportingDetailsListener, zzcj.zzx, 103, null);
        } else if (zzE(new Callable() { // from class: com.android.billingclient.api.zzaa
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                this.zza.zzy(externalOfferReportingDetailsListener);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzaj
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzaf(externalOfferReportingDetailsListener);
            }
        }, zzax(), zzaD()) == null) {
            zzaY(externalOfferReportingDetailsListener, zzaA(), 25, null);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void endConnection() {
        zzbg(12);
        synchronized (this.zza) {
            try {
            } finally {
                try {
                    com.google.android.gms.internal.play_billing.zze.zzk("BillingClient", "Unbinding from service.");
                    zzaL();
                } catch (Throwable th) {
                    com.google.android.gms.internal.play_billing.zze.zzm("BillingClient", "There was an exception while unbinding from the service while ending connection!", th);
                }
                try {
                    zzaK();
                } finally {
                    try {
                    } finally {
                    }
                }
            }
            if (this.zze != null) {
                this.zze.zzf();
                com.google.android.gms.internal.play_billing.zze.zzk("BillingClient", "Unbinding from service.");
                zzaL();
                zzaK();
            } else {
                com.google.android.gms.internal.play_billing.zze.zzk("BillingClient", "Unbinding from service.");
                zzaL();
                zzaK();
            }
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    @zzh
    public void getBillingConfigAsync(GetBillingConfigParams getBillingConfigParams, final BillingConfigResponseListener billingConfigResponseListener) {
        if (!isReady()) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Service disconnected.");
            BillingResult billingResult = zzcj.zzm;
            zzbe(2, 13, billingResult);
            billingConfigResponseListener.onBillingConfigResponse(billingResult, null);
            return;
        }
        if (!this.zzv) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Current client doesn't support get billing config.");
            BillingResult billingResult2 = zzcj.zzA;
            zzbe(32, 13, billingResult2);
            billingConfigResponseListener.onBillingConfigResponse(billingResult2, null);
            return;
        }
        if (zzE(new Callable() { // from class: com.android.billingclient.api.zzv
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                this.zza.zzu(billingConfigResponseListener);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzw
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzag(billingConfigResponseListener);
            }
        }, zzax(), zzaD()) == null) {
            BillingResult billingResultZzaA = zzaA();
            zzbe(25, 13, billingResultZzaA);
            billingConfigResponseListener.onBillingConfigResponse(billingResultZzaA, null);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final int getConnectionState() {
        int i10;
        synchronized (this.zza) {
            i10 = this.zzb;
        }
        return i10;
    }

    @Override // com.android.billingclient.api.BillingClient
    @zzf
    public void isAlternativeBillingOnlyAvailableAsync(final AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener) {
        if (!isReady()) {
            zzaV(alternativeBillingOnlyAvailabilityListener, zzcj.zzm, 2, null);
            return;
        }
        if (!this.zzy) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Current client doesn't support alternative billing only.");
            zzaV(alternativeBillingOnlyAvailabilityListener, zzcj.zzE, 66, null);
        } else if (zzE(new Callable() { // from class: com.android.billingclient.api.zzad
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                this.zza.zzz(alternativeBillingOnlyAvailabilityListener);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzae
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzah(alternativeBillingOnlyAvailabilityListener);
            }
        }, zzax(), zzaD()) == null) {
            zzaV(alternativeBillingOnlyAvailabilityListener, zzaA(), 25, null);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    @zzg
    public void isExternalOfferAvailableAsync(final ExternalOfferAvailabilityListener externalOfferAvailabilityListener) {
        if (!isReady()) {
            zzaZ(externalOfferAvailabilityListener, zzcj.zzm, 2, null);
            return;
        }
        if (!this.zzz) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Current client doesn't support external offer.");
            zzaZ(externalOfferAvailabilityListener, zzcj.zzx, 103, null);
        } else if (zzE(new Callable() { // from class: com.android.billingclient.api.zzap
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                this.zza.zzA(externalOfferAvailabilityListener);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzaq
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzai(externalOfferAvailabilityListener);
            }
        }, zzax(), zzaD()) == null) {
            zzaZ(externalOfferAvailabilityListener, zzaA(), 25, null);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d5  */
    @Override // com.android.billingclient.api.BillingClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.android.billingclient.api.BillingResult isFeatureSupported(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.BillingClientImpl.isFeatureSupported(java.lang.String):com.android.billingclient.api.BillingResult");
    }

    @Override // com.android.billingclient.api.BillingClient
    public final boolean isReady() {
        boolean z10;
        synchronized (this.zza) {
            try {
                z10 = false;
                if (this.zzb == 2 && this.zzh != null && this.zzi != null) {
                    z10 = true;
                }
            } finally {
            }
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:172:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x04fd A[Catch: Exception -> 0x0509, CancellationException -> 0x050c, TimeoutException -> 0x050f, TRY_ENTER, TryCatch #6 {CancellationException -> 0x050c, TimeoutException -> 0x050f, Exception -> 0x0509, blocks: (B:202:0x04fd, B:210:0x0512, B:212:0x0527, B:236:0x05b1, B:235:0x059f, B:225:0x057c, B:238:0x05b8), top: B:255:0x04fb }] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0512 A[Catch: Exception -> 0x0509, CancellationException -> 0x050c, TimeoutException -> 0x050f, TryCatch #6 {CancellationException -> 0x050c, TimeoutException -> 0x050f, Exception -> 0x0509, blocks: (B:202:0x04fd, B:210:0x0512, B:212:0x0527, B:236:0x05b1, B:235:0x059f, B:225:0x057c, B:238:0x05b8), top: B:255:0x04fb }] */
    @Override // com.android.billingclient.api.BillingClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.android.billingclient.api.BillingResult launchBillingFlow(android.app.Activity r36, final com.android.billingclient.api.BillingFlowParams r37) {
        /*
            Method dump skipped, instructions count: 1539
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.BillingClientImpl.launchBillingFlow(android.app.Activity, com.android.billingclient.api.BillingFlowParams):com.android.billingclient.api.BillingResult");
    }

    @Override // com.android.billingclient.api.BillingClient
    public void queryProductDetailsAsync(final QueryProductDetailsParams queryProductDetailsParams, final ProductDetailsResponseListener productDetailsResponseListener) {
        if (!isReady()) {
            BillingResult billingResult = zzcj.zzm;
            zzbe(2, 7, billingResult);
            productDetailsResponseListener.onProductDetailsResponse(billingResult, new ArrayList());
        } else {
            if (!this.zzu) {
                com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Querying product details is not supported.");
                BillingResult billingResult2 = zzcj.zzv;
                zzbe(20, 7, billingResult2);
                productDetailsResponseListener.onProductDetailsResponse(billingResult2, new ArrayList());
                return;
            }
            if (zzE(new Callable() { // from class: com.android.billingclient.api.zzam
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zzbj zzbjVarZzh = this.zza.zzh(queryProductDetailsParams);
                    productDetailsResponseListener.onProductDetailsResponse(zzcj.zza(zzbjVarZzh.zza(), zzbjVarZzh.zzb()), zzbjVarZzh.zzc());
                    return null;
                }
            }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzan
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzaj(productDetailsResponseListener);
                }
            }, zzax(), zzaD()) == null) {
                BillingResult billingResultZzaA = zzaA();
                zzbe(25, 7, billingResultZzaA);
                productDetailsResponseListener.onProductDetailsResponse(billingResultZzaA, new ArrayList());
            }
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void queryPurchaseHistoryAsync(QueryPurchaseHistoryParams queryPurchaseHistoryParams, PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        zzaH(queryPurchaseHistoryParams.zza(), purchaseHistoryResponseListener);
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void queryPurchasesAsync(QueryPurchasesParams queryPurchasesParams, PurchasesResponseListener purchasesResponseListener) {
        zzaI(queryPurchasesParams.zza(), purchasesResponseListener);
    }

    @Override // com.android.billingclient.api.BillingClient
    public void querySkuDetailsAsync(SkuDetailsParams skuDetailsParams, final SkuDetailsResponseListener skuDetailsResponseListener) {
        if (!isReady()) {
            BillingResult billingResult = zzcj.zzm;
            zzbe(2, 8, billingResult);
            skuDetailsResponseListener.onSkuDetailsResponse(billingResult, null);
            return;
        }
        final String skuType = skuDetailsParams.getSkuType();
        final List<String> skusList = skuDetailsParams.getSkusList();
        if (TextUtils.isEmpty(skuType)) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Please fix the input params. SKU type can't be empty.");
            BillingResult billingResult2 = zzcj.zzg;
            zzbe(49, 8, billingResult2);
            skuDetailsResponseListener.onSkuDetailsResponse(billingResult2, null);
            return;
        }
        if (skusList == null) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Please fix the input params. The list of SKUs can't be empty.");
            BillingResult billingResult3 = zzcj.zzf;
            zzbe(48, 8, billingResult3);
            skuDetailsResponseListener.onSkuDetailsResponse(billingResult3, null);
            return;
        }
        final String str = null;
        if (zzE(new Callable(skuType, skusList, str, skuDetailsResponseListener) { // from class: com.android.billingclient.api.zzz
            public final /* synthetic */ String zzb;
            public final /* synthetic */ List zzc;
            public final /* synthetic */ SkuDetailsResponseListener zzd;

            {
                this.zzd = skuDetailsResponseListener;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzdc zzdcVarZzn = this.zza.zzn(this.zzb, this.zzc, null);
                this.zzd.onSkuDetailsResponse(zzcj.zza(zzdcVarZzn.zza(), zzdcVarZzn.zzb()), zzdcVarZzn.zzc());
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzab
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzam(skuDetailsResponseListener);
            }
        }, zzax(), zzaD()) == null) {
            BillingResult billingResultZzaA = zzaA();
            zzbe(25, 8, billingResultZzaA);
            skuDetailsResponseListener.onSkuDetailsResponse(billingResultZzaA, null);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    @zzf
    public BillingResult showAlternativeBillingOnlyInformationDialog(final Activity activity, final AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener) {
        if (activity == null) {
            throw new IllegalArgumentException("Please provide a valid activity.");
        }
        if (!isReady()) {
            BillingResult billingResult = zzcj.zzm;
            zzbe(2, 16, billingResult);
            return billingResult;
        }
        if (!this.zzy) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Current Play Store version doesn't support alternative billing only.");
            BillingResult billingResult2 = zzcj.zzE;
            zzbe(66, 16, billingResult2);
            return billingResult2;
        }
        final zzaw zzawVar = new zzaw(this, this.zzd, alternativeBillingOnlyInformationDialogListener);
        if (zzE(new Callable() { // from class: com.android.billingclient.api.zzr
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                this.zza.zzB(alternativeBillingOnlyInformationDialogListener, activity, zzawVar);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzs
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzan(alternativeBillingOnlyInformationDialogListener);
            }
        }, this.zzd, zzaD()) != null) {
            return zzcj.zzl;
        }
        BillingResult billingResultZzaA = zzaA();
        zzbe(25, 16, billingResultZzaA);
        return billingResultZzaA;
    }

    @Override // com.android.billingclient.api.BillingClient
    @zzg
    public BillingResult showExternalOfferInformationDialog(final Activity activity, final ExternalOfferInformationDialogListener externalOfferInformationDialogListener) {
        if (activity == null) {
            throw new IllegalArgumentException("Please provide a valid activity.");
        }
        if (!isReady()) {
            BillingResult billingResult = zzcj.zzm;
            zzbe(2, 25, billingResult);
            return billingResult;
        }
        if (!this.zzz) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Current Play Store version doesn't support external offer.");
            BillingResult billingResult2 = zzcj.zzx;
            zzbe(103, 25, billingResult2);
            return billingResult2;
        }
        final zzax zzaxVar = new zzax(this, this.zzd, externalOfferInformationDialogListener);
        if (zzE(new Callable() { // from class: com.android.billingclient.api.zzai
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                this.zza.zzC(externalOfferInformationDialogListener, activity, zzaxVar);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzak
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzao(externalOfferInformationDialogListener);
            }
        }, this.zzd, zzaD()) != null) {
            return zzcj.zzl;
        }
        BillingResult billingResultZzaA = zzaA();
        zzbe(25, 25, billingResultZzaA);
        return billingResultZzaA;
    }

    @Override // com.android.billingclient.api.BillingClient
    public final BillingResult showInAppMessages(final Activity activity, InAppMessageParams inAppMessageParams, InAppMessageResponseListener inAppMessageResponseListener) {
        if (!isReady()) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Service disconnected.");
            return zzcj.zzm;
        }
        if (!this.zzq) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Current client doesn't support showing in-app messages.");
            return zzcj.zzw;
        }
        View viewFindViewById = activity.findViewById(R.id.content);
        IBinder windowToken = viewFindViewById.getWindowToken();
        Rect rect = new Rect();
        viewFindViewById.getGlobalVisibleRect(rect);
        final Bundle bundle = new Bundle();
        f0.g.a(bundle, "KEY_WINDOW_TOKEN", windowToken);
        bundle.putInt("KEY_DIMEN_LEFT", rect.left);
        bundle.putInt("KEY_DIMEN_TOP", rect.top);
        bundle.putInt("KEY_DIMEN_RIGHT", rect.right);
        bundle.putInt("KEY_DIMEN_BOTTOM", rect.bottom);
        bundle.putString("playBillingLibraryVersion", this.zzc);
        bundle.putIntegerArrayList("KEY_CATEGORY_IDS", inAppMessageParams.zza());
        final zzav zzavVar = new zzav(this, this.zzd, inAppMessageResponseListener);
        zzE(new Callable() { // from class: com.android.billingclient.api.zzao
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                this.zza.zzv(bundle, activity, zzavVar);
                return null;
            }
        }, 5000L, null, this.zzd, zzaD());
        return zzcj.zzl;
    }

    public final /* synthetic */ Void zzA(ExternalOfferAvailabilityListener externalOfferAvailabilityListener) throws Exception {
        com.google.android.gms.internal.play_billing.zzan zzanVar;
        try {
            synchronized (this.zza) {
                zzanVar = this.zzh;
            }
            if (zzanVar == null) {
                zzaZ(externalOfferAvailabilityListener, zzcj.zzm, 119, null);
            } else {
                zzanVar.zzs(22, this.zzf.getPackageName(), com.google.android.gms.internal.play_billing.zze.zze(this.zzc, this.zzF.longValue()), new zzbh(externalOfferAvailabilityListener, this.zzg, this.zzl, null));
            }
        } catch (DeadObjectException e10) {
            zzaZ(externalOfferAvailabilityListener, zzcj.zzm, 91, e10);
        } catch (Exception e11) {
            zzaZ(externalOfferAvailabilityListener, zzcj.zzk, 91, e11);
        }
        return null;
    }

    public final /* synthetic */ Void zzB(AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener, Activity activity, ResultReceiver resultReceiver) throws Exception {
        com.google.android.gms.internal.play_billing.zzan zzanVar;
        try {
            synchronized (this.zza) {
                zzanVar = this.zzh;
            }
            if (zzanVar == null) {
                zzbc(alternativeBillingOnlyInformationDialogListener, zzcj.zzm, 119, null);
            } else {
                zzanVar.zzo(21, this.zzf.getPackageName(), com.google.android.gms.internal.play_billing.zze.zze(this.zzc, this.zzF.longValue()), new zzbd(new WeakReference(activity), resultReceiver, null));
            }
        } catch (DeadObjectException e10) {
            zzbc(alternativeBillingOnlyInformationDialogListener, zzcj.zzm, 74, e10);
        } catch (Exception e11) {
            zzbc(alternativeBillingOnlyInformationDialogListener, zzcj.zzk, 74, e11);
        }
        return null;
    }

    public final /* synthetic */ Void zzC(ExternalOfferInformationDialogListener externalOfferInformationDialogListener, Activity activity, ResultReceiver resultReceiver) throws Exception {
        com.google.android.gms.internal.play_billing.zzan zzanVar;
        try {
            synchronized (this.zza) {
                zzanVar = this.zzh;
            }
            if (zzanVar == null) {
                zzba(externalOfferInformationDialogListener, zzcj.zzm, 119, null);
            } else {
                zzanVar.zzq(22, this.zzf.getPackageName(), com.google.android.gms.internal.play_billing.zze.zze(this.zzc, this.zzF.longValue()), new zzbf(new WeakReference(activity), resultReceiver, null));
            }
        } catch (DeadObjectException e10) {
            zzba(externalOfferInformationDialogListener, zzcj.zzm, 98, e10);
        } catch (Exception e11) {
            zzba(externalOfferInformationDialogListener, zzcj.zzk, 98, e11);
        }
        return null;
    }

    public final /* synthetic */ void zzab(AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) {
        BillingResult billingResult = zzcj.zzn;
        zzbe(24, 3, billingResult);
        acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult);
    }

    public final /* synthetic */ void zzac(BillingResult billingResult) {
        if (this.zze.zzd() != null) {
            this.zze.zzd().onPurchasesUpdated(billingResult, null);
        } else {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "No valid listener is set in BroadcastManager");
        }
    }

    public final /* synthetic */ void zzad(ConsumeResponseListener consumeResponseListener, ConsumeParams consumeParams) {
        BillingResult billingResult = zzcj.zzn;
        zzbe(24, 4, billingResult);
        consumeResponseListener.onConsumeResponse(billingResult, consumeParams.getPurchaseToken());
    }

    public final /* synthetic */ void zzae(AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener) {
        zzaX(alternativeBillingOnlyReportingDetailsListener, zzcj.zzn, 24, null);
    }

    public final /* synthetic */ void zzaf(ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener) {
        zzaY(externalOfferReportingDetailsListener, zzcj.zzn, 24, null);
    }

    public final /* synthetic */ void zzag(BillingConfigResponseListener billingConfigResponseListener) {
        BillingResult billingResult = zzcj.zzn;
        zzbe(24, 13, billingResult);
        billingConfigResponseListener.onBillingConfigResponse(billingResult, null);
    }

    public final /* synthetic */ void zzah(AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener) {
        zzaV(alternativeBillingOnlyAvailabilityListener, zzcj.zzn, 24, null);
    }

    public final /* synthetic */ void zzai(ExternalOfferAvailabilityListener externalOfferAvailabilityListener) {
        zzaZ(externalOfferAvailabilityListener, zzcj.zzn, 24, null);
    }

    public final /* synthetic */ void zzaj(ProductDetailsResponseListener productDetailsResponseListener) {
        BillingResult billingResult = zzcj.zzn;
        zzbe(24, 7, billingResult);
        productDetailsResponseListener.onProductDetailsResponse(billingResult, new ArrayList());
    }

    public final /* synthetic */ void zzak(PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        BillingResult billingResult = zzcj.zzn;
        zzbe(24, 11, billingResult);
        purchaseHistoryResponseListener.onPurchaseHistoryResponse(billingResult, null);
    }

    public final /* synthetic */ void zzal(PurchasesResponseListener purchasesResponseListener) {
        BillingResult billingResult = zzcj.zzn;
        zzbe(24, 9, billingResult);
        purchasesResponseListener.onQueryPurchasesResponse(billingResult, com.google.android.gms.internal.play_billing.zzco.zzl());
    }

    public final /* synthetic */ void zzam(SkuDetailsResponseListener skuDetailsResponseListener) {
        BillingResult billingResult = zzcj.zzn;
        zzbe(24, 8, billingResult);
        skuDetailsResponseListener.onSkuDetailsResponse(billingResult, null);
    }

    public final /* synthetic */ void zzan(AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener) {
        zzbc(alternativeBillingOnlyInformationDialogListener, zzcj.zzn, 24, null);
    }

    public final /* synthetic */ void zzao(ExternalOfferInformationDialogListener externalOfferInformationDialogListener) {
        zzba(externalOfferInformationDialogListener, zzcj.zzn, 24, null);
    }

    public final /* synthetic */ Bundle zzd(int i10, String str, String str2, BillingFlowParams billingFlowParams, Bundle bundle) throws Exception {
        com.google.android.gms.internal.play_billing.zzan zzanVar;
        try {
            synchronized (this.zza) {
                zzanVar = this.zzh;
            }
            return zzanVar == null ? com.google.android.gms.internal.play_billing.zze.zzn(zzcj.zzm, 119) : zzanVar.zzg(i10, this.zzf.getPackageName(), str, str2, null, bundle);
        } catch (DeadObjectException e10) {
            return com.google.android.gms.internal.play_billing.zze.zzo(zzcj.zzm, 5, zzcg.zza(e10));
        } catch (Exception e11) {
            return com.google.android.gms.internal.play_billing.zze.zzo(zzcj.zzk, 5, zzcg.zza(e11));
        }
    }

    public final /* synthetic */ Bundle zze(String str, String str2) throws Exception {
        com.google.android.gms.internal.play_billing.zzan zzanVar;
        try {
            synchronized (this.zza) {
                zzanVar = this.zzh;
            }
            return zzanVar == null ? com.google.android.gms.internal.play_billing.zze.zzn(zzcj.zzm, 119) : zzanVar.zzf(3, this.zzf.getPackageName(), str, str2, null);
        } catch (DeadObjectException e10) {
            return com.google.android.gms.internal.play_billing.zze.zzo(zzcj.zzm, 5, zzcg.zza(e10));
        } catch (Exception e11) {
            return com.google.android.gms.internal.play_billing.zze.zzo(zzcj.zzk, 5, zzcg.zza(e11));
        }
    }

    @VisibleForTesting
    public final zzbj zzh(QueryProductDetailsParams queryProductDetailsParams) {
        com.google.android.gms.internal.play_billing.zzan zzanVar;
        ArrayList arrayList = new ArrayList();
        String strZzb = queryProductDetailsParams.zzb();
        com.google.android.gms.internal.play_billing.zzco zzcoVarZza = queryProductDetailsParams.zza();
        int size = zzcoVarZza.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 20;
            ArrayList arrayList2 = new ArrayList(zzcoVarZza.subList(i10, i11 > size ? size : i11));
            ArrayList<String> arrayList3 = new ArrayList<>();
            int size2 = arrayList2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                arrayList3.add(((QueryProductDetailsParams.Product) arrayList2.get(i12)).zza());
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList3);
            bundle.putString("playBillingLibraryVersion", this.zzc);
            try {
                synchronized (this.zza) {
                    zzanVar = this.zzh;
                }
                if (zzanVar == null) {
                    return zzaO(zzcj.zzm, 119, "Service has been reset to null.", null);
                }
                boolean z10 = true;
                int i13 = true != this.zzx ? 17 : 20;
                String packageName = this.zzf.getPackageName();
                boolean zZzaM = zzaM();
                String str = this.zzc;
                zzaB(queryProductDetailsParams);
                zzaB(queryProductDetailsParams);
                zzaB(queryProductDetailsParams);
                zzaB(queryProductDetailsParams);
                long jLongValue = this.zzF.longValue();
                Bundle bundle2 = new Bundle();
                com.google.android.gms.internal.play_billing.zze.zzc(bundle2, str, jLongValue);
                bundle2.putBoolean("enablePendingPurchases", true);
                bundle2.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
                if (zZzaM) {
                    bundle2.putBoolean("enablePendingPurchaseForSubscriptions", true);
                }
                ArrayList<String> arrayList4 = new ArrayList<>();
                ArrayList<String> arrayList5 = new ArrayList<>();
                int size3 = arrayList2.size();
                int i14 = 0;
                boolean z11 = false;
                boolean z12 = false;
                while (i14 < size3) {
                    QueryProductDetailsParams.Product product = (QueryProductDetailsParams.Product) arrayList2.get(i14);
                    boolean z13 = z10;
                    arrayList4.add(null);
                    z11 |= !TextUtils.isEmpty(null);
                    String strZzb2 = product.zzb();
                    com.google.android.gms.internal.play_billing.zzan zzanVar2 = zzanVar;
                    if (strZzb2.equals("first_party")) {
                        com.google.android.gms.internal.play_billing.zzbe.zzc(null, "Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
                        arrayList5.add(null);
                        z12 = z13;
                    }
                    i14++;
                    zzanVar = zzanVar2;
                    z10 = z13;
                }
                com.google.android.gms.internal.play_billing.zzan zzanVar3 = zzanVar;
                if (z11) {
                    bundle2.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList4);
                }
                if (!arrayList5.isEmpty()) {
                    bundle2.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList5);
                }
                if (z12 && !TextUtils.isEmpty(null)) {
                    bundle2.putString("accountName", null);
                }
                Bundle bundleZzl = zzanVar3.zzl(i13, packageName, strZzb, bundle, bundle2);
                if (bundleZzl == null) {
                    return zzaO(zzcj.zzC, 44, "queryProductDetailsAsync got empty product details response.", null);
                }
                if (!bundleZzl.containsKey("DETAILS_LIST")) {
                    int iZzb = com.google.android.gms.internal.play_billing.zze.zzb(bundleZzl, "BillingClient");
                    String strZzh = com.google.android.gms.internal.play_billing.zze.zzh(bundleZzl, "BillingClient");
                    if (iZzb == 0) {
                        return zzaO(zzcj.zza(6, strZzh), 45, "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.", null);
                    }
                    return zzaO(zzcj.zza(iZzb, strZzh), 23, "getSkuDetails() failed for queryProductDetailsAsync. Response code: " + iZzb, null);
                }
                ArrayList<String> stringArrayList = bundleZzl.getStringArrayList("DETAILS_LIST");
                if (stringArrayList == null) {
                    return zzaO(zzcj.zzC, 46, "queryProductDetailsAsync got null response list", null);
                }
                for (int i15 = 0; i15 < stringArrayList.size(); i15++) {
                    try {
                        ProductDetails productDetails = new ProductDetails(stringArrayList.get(i15));
                        com.google.android.gms.internal.play_billing.zze.zzk("BillingClient", "Got product details: ".concat(productDetails.toString()));
                        arrayList.add(productDetails);
                    } catch (JSONException e10) {
                        return zzaO(zzcj.zza(6, "Error trying to decode SkuDetails."), 47, "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e10);
                    }
                }
                i10 = i11;
            } catch (DeadObjectException e11) {
                return zzaO(zzcj.zzm, 43, "queryProductDetailsAsync got a remote exception (try to reconnect).", e11);
            } catch (Exception e12) {
                return zzaO(zzcj.zzk, 43, "queryProductDetailsAsync got a remote exception (try to reconnect).", e12);
            }
        }
        return new zzbj(0, "", arrayList);
    }

    public final zzch zzk() {
        return this.zzg;
    }

    public final BillingResult zzm(final BillingResult billingResult) {
        if (Thread.interrupted()) {
            return billingResult;
        }
        this.zzd.post(new Runnable() { // from class: com.android.billingclient.api.zzp
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzac(billingResult);
            }
        });
        return billingResult;
    }

    @VisibleForTesting
    public final zzdc zzn(String str, List list, @Nullable String str2) {
        com.google.android.gms.internal.play_billing.zzan zzanVar;
        Bundle bundleZzk;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 20;
            ArrayList<String> arrayList2 = new ArrayList<>(list.subList(i10, i11 > size ? size : i11));
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList2);
            bundle.putString("playBillingLibraryVersion", this.zzc);
            try {
                synchronized (this.zza) {
                    zzanVar = this.zzh;
                }
                if (zzanVar == null) {
                    return zzaS(zzcj.zzm, 119, "Service has been reset to null.", null);
                }
                if (this.zzp) {
                    String packageName = this.zzf.getPackageName();
                    int i12 = this.zzl;
                    boolean zIsEnabledForOneTimeProducts = this.zzB.isEnabledForOneTimeProducts();
                    boolean zZzaM = zzaM();
                    String str3 = this.zzc;
                    long jLongValue = this.zzF.longValue();
                    Bundle bundle2 = new Bundle();
                    if (i12 >= 9) {
                        com.google.android.gms.internal.play_billing.zze.zzc(bundle2, str3, jLongValue);
                    }
                    if (i12 >= 9 && zIsEnabledForOneTimeProducts) {
                        bundle2.putBoolean("enablePendingPurchases", true);
                    }
                    if (zZzaM) {
                        bundle2.putBoolean("enablePendingPurchaseForSubscriptions", true);
                    }
                    bundleZzk = zzanVar.zzl(10, packageName, str, bundle, bundle2);
                } else {
                    bundleZzk = zzanVar.zzk(3, this.zzf.getPackageName(), str, bundle);
                }
                if (bundleZzk == null) {
                    return zzaS(zzcj.zzC, 44, "querySkuDetailsAsync got null sku details list", null);
                }
                if (!bundleZzk.containsKey("DETAILS_LIST")) {
                    int iZzb = com.google.android.gms.internal.play_billing.zze.zzb(bundleZzk, "BillingClient");
                    String strZzh = com.google.android.gms.internal.play_billing.zze.zzh(bundleZzk, "BillingClient");
                    if (iZzb == 0) {
                        return zzaS(zzcj.zza(6, strZzh), 45, "getSkuDetails() returned a bundle with neither an error nor a detail list.", null);
                    }
                    return zzaS(zzcj.zza(iZzb, strZzh), 23, "getSkuDetails() failed. Response code: " + iZzb, null);
                }
                ArrayList<String> stringArrayList = bundleZzk.getStringArrayList("DETAILS_LIST");
                if (stringArrayList == null) {
                    return zzaS(zzcj.zzC, 46, "querySkuDetailsAsync got null response list", null);
                }
                for (int i13 = 0; i13 < stringArrayList.size(); i13++) {
                    try {
                        SkuDetails skuDetails = new SkuDetails(stringArrayList.get(i13));
                        com.google.android.gms.internal.play_billing.zze.zzk("BillingClient", "Got sku details: ".concat(skuDetails.toString()));
                        arrayList.add(skuDetails);
                    } catch (JSONException e10) {
                        return zzaS(zzcj.zza(6, "Error trying to decode SkuDetails."), 47, "Got a JSON exception trying to decode SkuDetails.", e10);
                    }
                }
                i10 = i11;
            } catch (DeadObjectException e11) {
                return zzaS(zzcj.zzm, 43, "querySkuDetailsAsync got a remote exception (try to reconnect).", e11);
            } catch (Exception e12) {
                return zzaS(zzcj.zzk, 43, "querySkuDetailsAsync got a remote exception (try to reconnect).", e12);
            }
        }
        return new zzdc(0, "", arrayList);
    }

    public final synchronized zzev zzp() {
        try {
            if (this.zzE == null) {
                this.zzE = zzfb.zza(zzaD());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.zzE;
    }

    public final /* synthetic */ Object zzs(AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener, AcknowledgePurchaseParams acknowledgePurchaseParams) throws Exception {
        com.google.android.gms.internal.play_billing.zzan zzanVar;
        try {
            synchronized (this.zza) {
                zzanVar = this.zzh;
            }
            if (zzanVar == null) {
                zzaU(acknowledgePurchaseResponseListener, zzcj.zzm, 119, null);
                return null;
            }
            String packageName = this.zzf.getPackageName();
            String purchaseToken = acknowledgePurchaseParams.getPurchaseToken();
            String str = this.zzc;
            long jLongValue = this.zzF.longValue();
            Bundle bundle = new Bundle();
            com.google.android.gms.internal.play_billing.zze.zzc(bundle, str, jLongValue);
            Bundle bundleZzd = zzanVar.zzd(9, packageName, purchaseToken, bundle);
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(zzcj.zza(com.google.android.gms.internal.play_billing.zze.zzb(bundleZzd, "BillingClient"), com.google.android.gms.internal.play_billing.zze.zzh(bundleZzd, "BillingClient")));
            return null;
        } catch (DeadObjectException e10) {
            zzaU(acknowledgePurchaseResponseListener, zzcj.zzm, 28, e10);
            return null;
        } catch (Exception e11) {
            zzaU(acknowledgePurchaseResponseListener, zzcj.zzk, 28, e11);
            return null;
        }
    }

    public final /* synthetic */ Object zzt(ConsumeParams consumeParams, ConsumeResponseListener consumeResponseListener) throws Exception {
        zzaE(consumeParams, consumeResponseListener);
        return null;
    }

    public final /* synthetic */ Object zzu(BillingConfigResponseListener billingConfigResponseListener) throws Exception {
        com.google.android.gms.internal.play_billing.zzan zzanVar;
        try {
            synchronized (this.zza) {
                zzanVar = this.zzh;
            }
            if (zzanVar == null) {
                zzbb(billingConfigResponseListener, zzcj.zzm, 119, null);
            } else {
                String packageName = this.zzf.getPackageName();
                String str = this.zzc;
                long jLongValue = this.zzF.longValue();
                Bundle bundle = new Bundle();
                com.google.android.gms.internal.play_billing.zze.zzc(bundle, str, jLongValue);
                zzanVar.zzp(18, packageName, bundle, new zzbe(billingConfigResponseListener, this.zzg, this.zzl, null));
            }
        } catch (DeadObjectException e10) {
            zzbb(billingConfigResponseListener, zzcj.zzm, 62, e10);
        } catch (Exception e11) {
            zzbb(billingConfigResponseListener, zzcj.zzk, 62, e11);
        }
        return null;
    }

    public final /* synthetic */ Object zzv(Bundle bundle, Activity activity, ResultReceiver resultReceiver) throws Exception {
        com.google.android.gms.internal.play_billing.zzan zzanVar;
        try {
            synchronized (this.zza) {
                zzanVar = this.zzh;
            }
            if (zzanVar == null) {
                zzbd(-1, 119, null);
            } else {
                zzanVar.zzt(12, this.zzf.getPackageName(), bundle, new zzbi(new WeakReference(activity), resultReceiver, null));
            }
        } catch (DeadObjectException e10) {
            zzbd(-1, 118, e10);
        } catch (Exception e11) {
            zzbd(6, 118, e11);
        }
        return null;
    }

    public final /* synthetic */ Void zzx(AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener) throws Exception {
        com.google.android.gms.internal.play_billing.zzan zzanVar;
        try {
            synchronized (this.zza) {
                zzanVar = this.zzh;
            }
            if (zzanVar == null) {
                zzaX(alternativeBillingOnlyReportingDetailsListener, zzcj.zzm, 119, null);
            } else {
                zzanVar.zzm(21, this.zzf.getPackageName(), com.google.android.gms.internal.play_billing.zze.zze(this.zzc, this.zzF.longValue()), new zzbb(alternativeBillingOnlyReportingDetailsListener, this.zzg, this.zzl, null));
            }
        } catch (DeadObjectException e10) {
            zzaX(alternativeBillingOnlyReportingDetailsListener, zzcj.zzm, 70, e10);
        } catch (Exception e11) {
            zzaX(alternativeBillingOnlyReportingDetailsListener, zzcj.zzk, 70, e11);
        }
        return null;
    }

    public final /* synthetic */ Void zzy(ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener) throws Exception {
        com.google.android.gms.internal.play_billing.zzan zzanVar;
        try {
            synchronized (this.zza) {
                zzanVar = this.zzh;
            }
            if (zzanVar == null) {
                zzaY(externalOfferReportingDetailsListener, zzcj.zzm, 119, null);
            } else {
                zzanVar.zzn(22, this.zzf.getPackageName(), com.google.android.gms.internal.play_billing.zze.zze(this.zzc, this.zzF.longValue()), new zzbc(externalOfferReportingDetailsListener, this.zzg, this.zzl, null));
            }
        } catch (DeadObjectException e10) {
            zzaY(externalOfferReportingDetailsListener, zzcj.zzm, 94, e10);
        } catch (Exception e11) {
            zzaY(externalOfferReportingDetailsListener, zzcj.zzk, 94, e11);
        }
        return null;
    }

    public final /* synthetic */ Void zzz(AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener) throws Exception {
        com.google.android.gms.internal.play_billing.zzan zzanVar;
        try {
            synchronized (this.zza) {
                zzanVar = this.zzh;
            }
            if (zzanVar == null) {
                zzaV(alternativeBillingOnlyAvailabilityListener, zzcj.zzm, 119, null);
            } else {
                zzanVar.zzr(21, this.zzf.getPackageName(), com.google.android.gms.internal.play_billing.zze.zze(this.zzc, this.zzF.longValue()), new zzbg(alternativeBillingOnlyAvailabilityListener, this.zzg, this.zzl, null));
            }
        } catch (DeadObjectException e10) {
            zzaV(alternativeBillingOnlyAvailabilityListener, zzcj.zzm, 69, e10);
        } catch (Exception e11) {
            zzaV(alternativeBillingOnlyAvailabilityListener, zzcj.zzk, 69, e11);
        }
        return null;
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void queryPurchaseHistoryAsync(String str, PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        zzaH(str, purchaseHistoryResponseListener);
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void queryPurchasesAsync(String str, PurchasesResponseListener purchasesResponseListener) {
        zzaI(str, purchasesResponseListener);
    }

    @Override // com.android.billingclient.api.BillingClient
    public void startConnection(BillingClientStateListener billingClientStateListener) {
        BillingResult billingResultZzaz;
        synchronized (this.zza) {
            try {
                if (isReady()) {
                    billingResultZzaz = zzaz();
                } else if (this.zzb == 1) {
                    com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Client is already in the process of connecting to billing service.");
                    billingResultZzaz = zzcj.zze;
                    zzbe(37, 6, billingResultZzaz);
                } else if (this.zzb == 3) {
                    com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                    billingResultZzaz = zzcj.zzm;
                    zzbe(38, 6, billingResultZzaz);
                } else {
                    zzaJ(1);
                    zzaL();
                    com.google.android.gms.internal.play_billing.zze.zzk("BillingClient", "Starting in-app billing setup.");
                    this.zzi = new zzba(this, billingClientStateListener, null);
                    Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                    intent.setPackage("com.android.vending");
                    List<ResolveInfo> listQueryIntentServices = this.zzf.getPackageManager().queryIntentServices(intent, 0);
                    int i10 = 41;
                    if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                        zzaJ(0);
                        com.google.android.gms.internal.play_billing.zze.zzk("BillingClient", "Billing service unavailable on device.");
                        billingResultZzaz = zzcj.zzc;
                        zzbe(i10, 6, billingResultZzaz);
                    } else {
                        ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                        i10 = 40;
                        if (serviceInfo != null) {
                            String str = serviceInfo.packageName;
                            String str2 = serviceInfo.name;
                            if (!Objects.equals(str, "com.android.vending") || str2 == null) {
                                com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "The device doesn't have valid Play Store.");
                            } else {
                                ComponentName componentName = new ComponentName(str, str2);
                                Intent intent2 = new Intent(intent);
                                intent2.setComponent(componentName);
                                intent2.putExtra("playBillingLibraryVersion", this.zzc);
                                synchronized (this.zza) {
                                    try {
                                        if (this.zzb == 2) {
                                            billingResultZzaz = zzaz();
                                        } else if (this.zzb != 1) {
                                            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                            billingResultZzaz = zzcj.zzm;
                                            zzbe(117, 6, billingResultZzaz);
                                        } else {
                                            zzba zzbaVar = this.zzi;
                                            if (this.zzf.bindService(intent2, zzbaVar, 1)) {
                                                com.google.android.gms.internal.play_billing.zze.zzk("BillingClient", "Service was bonded successfully.");
                                                billingResultZzaz = null;
                                            } else {
                                                com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Connection to Billing service is blocked.");
                                                i10 = 39;
                                            }
                                        }
                                    } finally {
                                    }
                                }
                            }
                        } else {
                            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "The device doesn't have valid Play Store.");
                        }
                        zzaJ(0);
                        com.google.android.gms.internal.play_billing.zze.zzk("BillingClient", "Billing service unavailable on device.");
                        billingResultZzaz = zzcj.zzc;
                        zzbe(i10, 6, billingResultZzaz);
                    }
                }
            } finally {
            }
        }
        if (billingResultZzaz != null) {
            billingClientStateListener.onBillingSetupFinished(billingResultZzaz);
        }
    }

    @AnyThread
    private BillingClientImpl(Context context, PendingPurchasesParams pendingPurchasesParams, PurchasesUpdatedListener purchasesUpdatedListener, String str, String str2, @Nullable UserChoiceBillingListener userChoiceBillingListener, @Nullable zzch zzchVar, @Nullable ExecutorService executorService) {
        this.zza = new Object();
        this.zzb = 0;
        this.zzd = new Handler(Looper.getMainLooper());
        this.zzl = 0;
        this.zzF = Long.valueOf(new Random().nextLong());
        this.zzc = str;
        initialize(context, purchasesUpdatedListener, pendingPurchasesParams, userChoiceBillingListener, str, (zzch) null);
    }

    private BillingClientImpl(String str) {
        this.zza = new Object();
        this.zzb = 0;
        this.zzd = new Handler(Looper.getMainLooper());
        this.zzl = 0;
        this.zzF = Long.valueOf(new Random().nextLong());
        this.zzc = str;
    }

    @AnyThread
    public BillingClientImpl(@Nullable String str, Context context, @Nullable zzch zzchVar, @Nullable ExecutorService executorService) {
        this.zza = new Object();
        this.zzb = 0;
        this.zzd = new Handler(Looper.getMainLooper());
        this.zzl = 0;
        Long lValueOf = Long.valueOf(new Random().nextLong());
        this.zzF = lValueOf;
        String strZzaC = zzaC();
        this.zzc = strZzaC;
        this.zzf = context.getApplicationContext();
        zzks zzksVarZzc = zzku.zzc();
        zzksVarZzc.zzo(strZzaC);
        zzksVarZzc.zzn(this.zzf.getPackageName());
        zzksVarZzc.zzm(lValueOf.longValue());
        this.zzg = new zzcl(this.zzf, (zzku) zzksVarZzc.zzf());
        this.zzf.getPackageName();
    }

    private void initialize(Context context, PurchasesUpdatedListener purchasesUpdatedListener, PendingPurchasesParams pendingPurchasesParams, @Nullable UserChoiceBillingListener userChoiceBillingListener, String str, @Nullable zzch zzchVar) {
        this.zzf = context.getApplicationContext();
        zzks zzksVarZzc = zzku.zzc();
        zzksVarZzc.zzo(str);
        zzksVarZzc.zzn(this.zzf.getPackageName());
        zzksVarZzc.zzm(this.zzF.longValue());
        if (zzchVar != null) {
            this.zzg = zzchVar;
        } else {
            this.zzg = new zzcl(this.zzf, (zzku) zzksVarZzc.zzf());
        }
        if (purchasesUpdatedListener == null) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.zze = new zzn(this.zzf, purchasesUpdatedListener, null, null, userChoiceBillingListener, this.zzg);
        this.zzB = pendingPurchasesParams;
        this.zzC = userChoiceBillingListener != null;
    }

    @AnyThread
    public BillingClientImpl(@Nullable String str, PendingPurchasesParams pendingPurchasesParams, Context context, zzco zzcoVar, @Nullable zzch zzchVar, @Nullable ExecutorService executorService) {
        this.zza = new Object();
        this.zzb = 0;
        this.zzd = new Handler(Looper.getMainLooper());
        this.zzl = 0;
        Long lValueOf = Long.valueOf(new Random().nextLong());
        this.zzF = lValueOf;
        this.zzc = zzaC();
        this.zzf = context.getApplicationContext();
        zzks zzksVarZzc = zzku.zzc();
        zzksVarZzc.zzo(zzaC());
        zzksVarZzc.zzn(this.zzf.getPackageName());
        zzksVarZzc.zzm(lValueOf.longValue());
        this.zzg = new zzcl(this.zzf, (zzku) zzksVarZzc.zzf());
        com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.zze = new zzn(this.zzf, null, null, null, null, this.zzg);
        this.zzB = pendingPurchasesParams;
        this.zzf.getPackageName();
    }

    @AnyThread
    public BillingClientImpl(@Nullable String str, PendingPurchasesParams pendingPurchasesParams, Context context, PurchasesUpdatedListener purchasesUpdatedListener, @Nullable zzb zzbVar, @Nullable zzch zzchVar, @Nullable ExecutorService executorService) {
        String strZzaC = zzaC();
        this.zza = new Object();
        this.zzb = 0;
        this.zzd = new Handler(Looper.getMainLooper());
        this.zzl = 0;
        this.zzF = Long.valueOf(new Random().nextLong());
        this.zzc = strZzaC;
        initialize(context, purchasesUpdatedListener, pendingPurchasesParams, (zzb) null, strZzaC, (zzch) null);
    }

    @AnyThread
    public BillingClientImpl(@Nullable String str, PendingPurchasesParams pendingPurchasesParams, Context context, PurchasesUpdatedListener purchasesUpdatedListener, @Nullable UserChoiceBillingListener userChoiceBillingListener, @Nullable zzch zzchVar, @Nullable ExecutorService executorService) {
        this(context, pendingPurchasesParams, purchasesUpdatedListener, zzaC(), null, userChoiceBillingListener, null, null);
    }
}
