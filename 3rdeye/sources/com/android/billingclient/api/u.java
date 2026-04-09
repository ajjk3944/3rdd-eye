package com.android.billingclient.api;

import N7.C1154e9;
import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes.dex */
public final class u {
    public static t a(Bundle bundle, String str) {
        BillingResult billingResult = r.f18691j;
        if (bundle == null) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", str.concat(" got null owned items list"));
            return new t(billingResult, 54);
        }
        int iZzb = com.google.android.gms.internal.play_billing.zzb.zzb(bundle, "BillingClient");
        BillingResult billingResultD = C1154e9.d(iZzb, com.google.android.gms.internal.play_billing.zzb.zzg(bundle, "BillingClient"));
        if (iZzb != 0) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", str + " failed. Response code: " + iZzb);
            return new t(billingResultD, 23);
        }
        if (!bundle.containsKey("INAPP_PURCHASE_ITEM_LIST") || !bundle.containsKey("INAPP_PURCHASE_DATA_LIST") || !bundle.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Bundle returned from " + str + " doesn't contain required fields.");
            return new t(billingResult, 55);
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        if (stringArrayList == null) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Bundle returned from " + str + " contains null SKUs list.");
            return new t(billingResult, 56);
        }
        if (stringArrayList2 == null) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Bundle returned from " + str + " contains null purchases list.");
            return new t(billingResult, 57);
        }
        if (stringArrayList3 != null) {
            return new t(r.f18692k, 1);
        }
        com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Bundle returned from " + str + " contains null signatures list.");
        return new t(billingResult, 58);
    }
}
