package com.zipoapps.premiumhelper.billing;

import B4.g;
import k8.I;
import kotlin.jvm.internal.l;

/* compiled from: Billing.kt */
/* loaded from: classes3.dex */
public final class ActivePurchaseInfo {
    private final long purchaseTime;
    private final String purchaseToken;
    private final String registerOffer;
    private final String sku;
    private final I status;

    public ActivePurchaseInfo(String sku, String purchaseToken, long j4, I i, String registerOffer) {
        l.f(sku, "sku");
        l.f(purchaseToken, "purchaseToken");
        l.f(registerOffer, "registerOffer");
        this.sku = sku;
        this.purchaseToken = purchaseToken;
        this.purchaseTime = j4;
        this.status = i;
        this.registerOffer = registerOffer;
    }

    public static /* synthetic */ ActivePurchaseInfo copy$default(ActivePurchaseInfo activePurchaseInfo, String str, String str2, long j4, I i, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = activePurchaseInfo.sku;
        }
        if ((i10 & 2) != 0) {
            str2 = activePurchaseInfo.purchaseToken;
        }
        if ((i10 & 4) != 0) {
            j4 = activePurchaseInfo.purchaseTime;
        }
        if ((i10 & 8) != 0) {
            i = activePurchaseInfo.status;
        }
        if ((i10 & 16) != 0) {
            str3 = activePurchaseInfo.registerOffer;
        }
        long j10 = j4;
        return activePurchaseInfo.copy(str, str2, j10, i, str3);
    }

    public final String component1() {
        return this.sku;
    }

    public final String component2() {
        return this.purchaseToken;
    }

    public final long component3() {
        return this.purchaseTime;
    }

    public final I component4() {
        return this.status;
    }

    public final String component5() {
        return this.registerOffer;
    }

    public final ActivePurchaseInfo copy(String sku, String purchaseToken, long j4, I i, String registerOffer) {
        l.f(sku, "sku");
        l.f(purchaseToken, "purchaseToken");
        l.f(registerOffer, "registerOffer");
        return new ActivePurchaseInfo(sku, purchaseToken, j4, i, registerOffer);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivePurchaseInfo)) {
            return false;
        }
        ActivePurchaseInfo activePurchaseInfo = (ActivePurchaseInfo) obj;
        return l.b(this.sku, activePurchaseInfo.sku) && l.b(this.purchaseToken, activePurchaseInfo.purchaseToken) && this.purchaseTime == activePurchaseInfo.purchaseTime && this.status == activePurchaseInfo.status && l.b(this.registerOffer, activePurchaseInfo.registerOffer);
    }

    public final long getPurchaseTime() {
        return this.purchaseTime;
    }

    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    public final String getRegisterOffer() {
        return this.registerOffer;
    }

    public final String getSku() {
        return this.sku;
    }

    public final I getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iN = g.n(this.sku.hashCode() * 31, 31, this.purchaseToken);
        long j4 = this.purchaseTime;
        int i = (iN + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        I i10 = this.status;
        return this.registerOffer.hashCode() + ((i + (i10 == null ? 0 : i10.hashCode())) * 31);
    }

    public String toString() {
        String str = this.sku;
        String str2 = this.purchaseToken;
        long j4 = this.purchaseTime;
        I i = this.status;
        String str3 = this.registerOffer;
        StringBuilder sbD = j6.l.d("ActivePurchaseInfo(sku=", str, ", purchaseToken=", str2, ", purchaseTime=");
        sbD.append(j4);
        sbD.append(", status=");
        sbD.append(i);
        sbD.append(", registerOffer=");
        sbD.append(str3);
        sbD.append(")");
        return sbD.toString();
    }
}
