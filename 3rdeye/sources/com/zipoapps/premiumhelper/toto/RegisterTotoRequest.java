package com.zipoapps.premiumhelper.toto;

import B4.g;
import kotlin.jvm.internal.l;

/* compiled from: RegisterTotoRequest.kt */
/* loaded from: classes3.dex */
public final class RegisterTotoRequest {
    private final String fcmToken;
    private final long installTimestamp;
    private final String obfuscatedUserID;
    private final String offer;
    private final String packageName;
    private final String purchaseToken;
    private final String sku;
    private final String version;

    public RegisterTotoRequest(String packageName, String version, long j4, String obfuscatedUserID, String sku, String purchaseToken, String fcmToken, String offer) {
        l.f(packageName, "packageName");
        l.f(version, "version");
        l.f(obfuscatedUserID, "obfuscatedUserID");
        l.f(sku, "sku");
        l.f(purchaseToken, "purchaseToken");
        l.f(fcmToken, "fcmToken");
        l.f(offer, "offer");
        this.packageName = packageName;
        this.version = version;
        this.installTimestamp = j4;
        this.obfuscatedUserID = obfuscatedUserID;
        this.sku = sku;
        this.purchaseToken = purchaseToken;
        this.fcmToken = fcmToken;
        this.offer = offer;
    }

    public static /* synthetic */ RegisterTotoRequest copy$default(RegisterTotoRequest registerTotoRequest, String str, String str2, long j4, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = registerTotoRequest.packageName;
        }
        if ((i & 2) != 0) {
            str2 = registerTotoRequest.version;
        }
        if ((i & 4) != 0) {
            j4 = registerTotoRequest.installTimestamp;
        }
        if ((i & 8) != 0) {
            str3 = registerTotoRequest.obfuscatedUserID;
        }
        if ((i & 16) != 0) {
            str4 = registerTotoRequest.sku;
        }
        if ((i & 32) != 0) {
            str5 = registerTotoRequest.purchaseToken;
        }
        if ((i & 64) != 0) {
            str6 = registerTotoRequest.fcmToken;
        }
        if ((i & 128) != 0) {
            str7 = registerTotoRequest.offer;
        }
        String str8 = str7;
        String str9 = str5;
        String str10 = str3;
        long j10 = j4;
        return registerTotoRequest.copy(str, str2, j10, str10, str4, str9, str6, str8);
    }

    public final String component1() {
        return this.packageName;
    }

    public final String component2() {
        return this.version;
    }

    public final long component3() {
        return this.installTimestamp;
    }

    public final String component4() {
        return this.obfuscatedUserID;
    }

    public final String component5() {
        return this.sku;
    }

    public final String component6() {
        return this.purchaseToken;
    }

    public final String component7() {
        return this.fcmToken;
    }

    public final String component8() {
        return this.offer;
    }

    public final RegisterTotoRequest copy(String packageName, String version, long j4, String obfuscatedUserID, String sku, String purchaseToken, String fcmToken, String offer) {
        l.f(packageName, "packageName");
        l.f(version, "version");
        l.f(obfuscatedUserID, "obfuscatedUserID");
        l.f(sku, "sku");
        l.f(purchaseToken, "purchaseToken");
        l.f(fcmToken, "fcmToken");
        l.f(offer, "offer");
        return new RegisterTotoRequest(packageName, version, j4, obfuscatedUserID, sku, purchaseToken, fcmToken, offer);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterTotoRequest)) {
            return false;
        }
        RegisterTotoRequest registerTotoRequest = (RegisterTotoRequest) obj;
        return l.b(this.packageName, registerTotoRequest.packageName) && l.b(this.version, registerTotoRequest.version) && this.installTimestamp == registerTotoRequest.installTimestamp && l.b(this.obfuscatedUserID, registerTotoRequest.obfuscatedUserID) && l.b(this.sku, registerTotoRequest.sku) && l.b(this.purchaseToken, registerTotoRequest.purchaseToken) && l.b(this.fcmToken, registerTotoRequest.fcmToken) && l.b(this.offer, registerTotoRequest.offer);
    }

    public final String getFcmToken() {
        return this.fcmToken;
    }

    public final long getInstallTimestamp() {
        return this.installTimestamp;
    }

    public final String getObfuscatedUserID() {
        return this.obfuscatedUserID;
    }

    public final String getOffer() {
        return this.offer;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    public final String getSku() {
        return this.sku;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        int iN = g.n(this.packageName.hashCode() * 31, 31, this.version);
        long j4 = this.installTimestamp;
        return this.offer.hashCode() + g.n(g.n(g.n(g.n((iN + ((int) (j4 ^ (j4 >>> 32)))) * 31, 31, this.obfuscatedUserID), 31, this.sku), 31, this.purchaseToken), 31, this.fcmToken);
    }

    public String toString() {
        String str = this.packageName;
        String str2 = this.version;
        long j4 = this.installTimestamp;
        String str3 = this.obfuscatedUserID;
        String str4 = this.sku;
        String str5 = this.purchaseToken;
        String str6 = this.fcmToken;
        String str7 = this.offer;
        StringBuilder sbD = j6.l.d("RegisterTotoRequest(packageName=", str, ", version=", str2, ", installTimestamp=");
        sbD.append(j4);
        sbD.append(", obfuscatedUserID=");
        sbD.append(str3);
        com.google.android.gms.measurement.internal.a.l(sbD, ", sku=", str4, ", purchaseToken=", str5);
        com.google.android.gms.measurement.internal.a.l(sbD, ", fcmToken=", str6, ", offer=", str7);
        sbD.append(")");
        return sbD.toString();
    }
}
