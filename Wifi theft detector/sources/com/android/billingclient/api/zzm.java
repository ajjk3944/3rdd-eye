package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.internal.play_billing.zzgw;
import com.google.android.gms.internal.play_billing.zzjz;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@VisibleForTesting
/* loaded from: classes.dex */
final class zzm extends BroadcastReceiver {
    final /* synthetic */ zzn zza;
    private boolean zzb;
    private final boolean zzc;

    public zzm(zzn zznVar, boolean z10) {
        this.zza = zznVar;
        this.zzc = z10;
    }

    private final void zzd(Bundle bundle, BillingResult billingResult, int i10) {
        try {
            if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") != null) {
                this.zza.zze.zza(zzjz.zzC(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD"), zzgw.zza()));
            } else {
                this.zza.zze.zza(zzcg.zzb(23, i10, billingResult));
            }
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingBroadcastManager", "Bundle is null.");
            zzch zzchVar = this.zza.zze;
            BillingResult billingResult = zzcj.zzk;
            zzchVar.zza(zzcg.zzb(11, 1, billingResult));
            zzn zznVar = this.zza;
            if (zznVar.zzb != null) {
                zznVar.zzb.onPurchasesUpdated(billingResult, null);
                return;
            }
            return;
        }
        BillingResult billingResultZzf = com.google.android.gms.internal.play_billing.zze.zzf(intent, "BillingBroadcastManager");
        String action = intent.getAction();
        int i10 = true != Objects.equals(extras.getString("INTENT_SOURCE"), "LAUNCH_BILLING_FLOW") ? 1 : 2;
        if (action.equals("com.android.vending.billing.PURCHASES_UPDATED") || action.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
            List<Purchase> listZzj = com.google.android.gms.internal.play_billing.zze.zzj(extras);
            if (billingResultZzf.getResponseCode() == 0) {
                this.zza.zze.zzc(zzcg.zzd(i10));
            } else {
                zzd(extras, billingResultZzf, i10);
            }
            this.zza.zzb.onPurchasesUpdated(billingResultZzf, listZzj);
            return;
        }
        if (action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
            if (billingResultZzf.getResponseCode() != 0) {
                zzd(extras, billingResultZzf, i10);
                this.zza.zzb.onPurchasesUpdated(billingResultZzf, com.google.android.gms.internal.play_billing.zzco.zzl());
                return;
            }
            zzn zznVar2 = this.zza;
            if (zznVar2.zzc == null && zznVar2.zzd == null) {
                com.google.android.gms.internal.play_billing.zze.zzl("BillingBroadcastManager", "AlternativeBillingListener and UserChoiceBillingListener is null.");
                zzch zzchVar2 = this.zza.zze;
                BillingResult billingResult2 = zzcj.zzk;
                zzchVar2.zza(zzcg.zzb(77, i10, billingResult2));
                this.zza.zzb.onPurchasesUpdated(billingResult2, com.google.android.gms.internal.play_billing.zzco.zzl());
                return;
            }
            String string = extras.getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
            if (string == null) {
                com.google.android.gms.internal.play_billing.zze.zzl("BillingBroadcastManager", "Couldn't find alternative billing user choice data in bundle.");
                zzch zzchVar3 = this.zza.zze;
                BillingResult billingResult3 = zzcj.zzk;
                zzchVar3.zza(zzcg.zzb(16, i10, billingResult3));
                this.zza.zzb.onPurchasesUpdated(billingResult3, com.google.android.gms.internal.play_billing.zzco.zzl());
                return;
            }
            try {
                if (this.zza.zzd != null) {
                    this.zza.zzd.userSelectedAlternativeBilling(new UserChoiceDetails(string));
                } else {
                    JSONArray jSONArrayOptJSONArray = new JSONObject(string).optJSONArray("products");
                    ArrayList arrayList = new ArrayList();
                    if (jSONArrayOptJSONArray != null) {
                        for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
                            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i11);
                            if (jSONObjectOptJSONObject != null) {
                                arrayList.add(new zzc(jSONObjectOptJSONObject, null));
                            }
                        }
                    }
                    this.zza.zzc.zza();
                }
                this.zza.zze.zzc(zzcg.zzd(i10));
            } catch (JSONException unused) {
                com.google.android.gms.internal.play_billing.zze.zzl("BillingBroadcastManager", String.format("Error when parsing invalid user choice data: [%s]", string));
                zzch zzchVar4 = this.zza.zze;
                BillingResult billingResult4 = zzcj.zzk;
                zzchVar4.zza(zzcg.zzb(17, i10, billingResult4));
                this.zza.zzb.onPurchasesUpdated(billingResult4, com.google.android.gms.internal.play_billing.zzco.zzl());
            }
        }
    }

    public final synchronized void zza(Context context, IntentFilter intentFilter) {
        try {
            if (this.zzb) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, true != this.zzc ? 4 : 2);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.zzb = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzb(Context context, IntentFilter intentFilter, String str) {
        zzm zzmVar;
        try {
            try {
                if (this.zzb) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    zzmVar = this;
                    context.registerReceiver(zzmVar, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != this.zzc ? 4 : 2);
                } else {
                    zzmVar = this;
                    context.registerReceiver(this, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                }
                zzmVar.zzb = true;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final synchronized void zzc(Context context) {
        if (!this.zzb) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingBroadcastManager", "Receiver is not registered.");
        } else {
            context.unregisterReceiver(this);
            this.zzb = false;
        }
    }
}
