package com.android.billingclient.api;

import Q9.C1553s;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.internal.play_billing.zzga;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes.dex */
public final class v extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public boolean f18712a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f18713b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f18714c;

    public v(w wVar, boolean z10) {
        this.f18714c = wVar;
        this.f18713b = z10;
    }

    public final synchronized void a(Context context, IntentFilter intentFilter) {
        try {
            if (this.f18712a) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, true != this.f18713b ? 4 : 2);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.f18712a = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(Context context) {
        if (!this.f18712a) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingBroadcastManager", "Receiver is not registered.");
        } else {
            context.unregisterReceiver(this);
            this.f18712a = false;
        }
    }

    public final void c(Bundle bundle, BillingResult billingResult, int i) {
        byte[] byteArray = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
        w wVar = this.f18714c;
        if (byteArray == null) {
            wVar.f18718d.f(zzcb.zza(23, i, billingResult));
            return;
        }
        try {
            wVar.f18718d.f(zzga.zzA(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD"), com.google.android.gms.internal.play_billing.zzcd.zza()));
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        w wVar = this.f18714c;
        if (extras == null) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingBroadcastManager", "Bundle is null.");
            C1553s c1553s = wVar.f18718d;
            BillingResult billingResult = r.f18691j;
            c1553s.f(zzcb.zza(11, 1, billingResult));
            PurchasesUpdatedListener purchasesUpdatedListener = wVar.f18716b;
            if (purchasesUpdatedListener != null) {
                purchasesUpdatedListener.onPurchasesUpdated(billingResult, null);
                return;
            }
            return;
        }
        BillingResult billingResultZze = com.google.android.gms.internal.play_billing.zzb.zze(intent, "BillingBroadcastManager");
        String action = intent.getAction();
        int i = true == Objects.equals(extras.getString("INTENT_SOURCE"), "LAUNCH_BILLING_FLOW") ? 2 : 1;
        if (action.equals("com.android.vending.billing.PURCHASES_UPDATED") || action.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
            List<Purchase> listZzi = com.google.android.gms.internal.play_billing.zzb.zzi(extras);
            if (billingResultZze.getResponseCode() == 0) {
                wVar.f18718d.h(zzcb.zzc(i));
            } else {
                c(extras, billingResultZze, i);
            }
            wVar.f18716b.onPurchasesUpdated(billingResultZze, listZzi);
            return;
        }
        if (action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
            if (billingResultZze.getResponseCode() != 0) {
                c(extras, billingResultZze, i);
                wVar.f18716b.onPurchasesUpdated(billingResultZze, com.google.android.gms.internal.play_billing.zzai.zzk());
                return;
            }
            wVar.getClass();
            PurchasesUpdatedListener purchasesUpdatedListener2 = wVar.f18716b;
            UserChoiceBillingListener userChoiceBillingListener = wVar.f18717c;
            C1553s c1553s2 = wVar.f18718d;
            if (userChoiceBillingListener == null) {
                com.google.android.gms.internal.play_billing.zzb.zzk("BillingBroadcastManager", "AlternativeBillingListener and UserChoiceBillingListener is null.");
                BillingResult billingResult2 = r.f18691j;
                c1553s2.f(zzcb.zza(77, i, billingResult2));
                purchasesUpdatedListener2.onPurchasesUpdated(billingResult2, com.google.android.gms.internal.play_billing.zzai.zzk());
                return;
            }
            String string = extras.getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
            if (string == null) {
                com.google.android.gms.internal.play_billing.zzb.zzk("BillingBroadcastManager", "Couldn't find alternative billing user choice data in bundle.");
                BillingResult billingResult3 = r.f18691j;
                c1553s2.f(zzcb.zza(16, i, billingResult3));
                purchasesUpdatedListener2.onPurchasesUpdated(billingResult3, com.google.android.gms.internal.play_billing.zzai.zzk());
                return;
            }
            try {
                if (userChoiceBillingListener != null) {
                    userChoiceBillingListener.userSelectedAlternativeBilling(new UserChoiceDetails(string));
                    c1553s2.h(zzcb.zzc(i));
                    return;
                }
                JSONArray jSONArrayOptJSONArray = new JSONObject(string).optJSONArray("products");
                ArrayList arrayList = new ArrayList();
                if (jSONArrayOptJSONArray == null) {
                    throw null;
                }
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                    if (jSONObjectOptJSONObject != null) {
                        arrayList.add(new zze(jSONObjectOptJSONObject, null));
                    }
                }
                throw null;
            } catch (JSONException unused) {
                com.google.android.gms.internal.play_billing.zzb.zzk("BillingBroadcastManager", "Error when parsing invalid user choice data: [" + string + "]");
                BillingResult billingResult4 = r.f18691j;
                c1553s2.f(zzcb.zza(17, i, billingResult4));
                purchasesUpdatedListener2.onPurchasesUpdated(billingResult4, com.google.android.gms.internal.play_billing.zzai.zzk());
            }
        }
    }
}
