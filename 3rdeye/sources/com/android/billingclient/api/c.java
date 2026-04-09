package com.android.billingclient.api;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONException;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes.dex */
public final class c implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f18641a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PurchasesResponseListener f18642b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f18643c;

    public c(a aVar, String str, PurchasesResponseListener purchasesResponseListener) {
        this.f18641a = str;
        this.f18642b = purchasesResponseListener;
        this.f18643c = aVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Exception {
        zzcz zzczVar;
        Bundle bundleZzi;
        zzcz zzczVar2;
        a aVar = this.f18643c;
        String str = this.f18641a;
        com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        Bundle bundleZzc = com.google.android.gms.internal.play_billing.zzb.zzc(aVar.f18626n, aVar.f18634v, aVar.f18638z.isEnabledForOneTimeProducts(), aVar.f18638z.isEnabledForPrepaidPlans(), aVar.f18615b);
        List list = null;
        String string = null;
        while (true) {
            int i = 9;
            try {
                if (aVar.f18626n) {
                    bundleZzi = aVar.f18620g.zzj(true != aVar.f18634v ? 9 : 19, aVar.f18618e.getPackageName(), str, string, bundleZzc);
                } else {
                    bundleZzi = aVar.f18620g.zzi(3, aVar.f18618e.getPackageName(), str, string);
                }
                t tVarA = u.a(bundleZzi, "getPurchase()");
                BillingResult billingResult = tVarA.f18710a;
                if (billingResult != r.f18692k) {
                    aVar.f(zzcb.zza(tVarA.f18711b, 9, billingResult));
                    zzczVar = new zzcz(billingResult, list);
                    break;
                }
                ArrayList<String> stringArrayList = bundleZzi.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = bundleZzi.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = bundleZzi.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                int i10 = 0;
                boolean z10 = false;
                while (i10 < stringArrayList2.size()) {
                    String str2 = stringArrayList2.get(i10);
                    String str3 = stringArrayList3.get(i10);
                    com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList.get(i10))));
                    try {
                        Purchase purchase = new Purchase(str2, str3);
                        if (TextUtils.isEmpty(purchase.getPurchaseToken())) {
                            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "BUG: empty/null token!");
                            z10 = true;
                        }
                        arrayList.add(purchase);
                        i10++;
                        i = 9;
                    } catch (JSONException e4) {
                        com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Got an exception trying to decode the purchase!", e4);
                        BillingResult billingResult2 = r.f18691j;
                        aVar.f(zzcb.zza(51, 9, billingResult2));
                        zzczVar2 = new zzcz(billingResult2, null);
                    }
                }
                int i11 = i;
                if (z10) {
                    aVar.f(zzcb.zza(26, i11, r.f18691j));
                }
                string = bundleZzi.getString("INAPP_CONTINUATION_TOKEN");
                com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Continuation token: ".concat(String.valueOf(string)));
                if (TextUtils.isEmpty(string)) {
                    zzczVar2 = new zzcz(r.f18692k, arrayList);
                    break;
                }
                list = null;
            } catch (Exception e10) {
                BillingResult billingResult3 = r.f18693l;
                aVar.f(zzcb.zza(52, 9, billingResult3));
                com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Got exception trying to get purchasesm try to reconnect", e10);
                zzczVar = new zzcz(billingResult3, null);
            }
        }
        zzczVar = zzczVar2;
        if (zzczVar.zzb() != null) {
            this.f18642b.onQueryPurchasesResponse(zzczVar.zza(), zzczVar.zzb());
            return null;
        }
        this.f18642b.onQueryPurchasesResponse(zzczVar.zza(), com.google.android.gms.internal.play_billing.zzai.zzk());
        return null;
    }
}
