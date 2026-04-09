package com.android.billingclient.api;

import N7.C1154e9;
import com.android.billingclient.api.BillingResult;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: A, reason: collision with root package name */
    public static final BillingResult f18679A;

    /* renamed from: B, reason: collision with root package name */
    public static final BillingResult f18680B;

    /* renamed from: C, reason: collision with root package name */
    public static final BillingResult f18681C;

    /* renamed from: D, reason: collision with root package name */
    public static final BillingResult f18682D;

    /* renamed from: a, reason: collision with root package name */
    public static final BillingResult f18683a = C1154e9.d(3, "Google Play In-app Billing API version is less than 3");

    /* renamed from: b, reason: collision with root package name */
    public static final BillingResult f18684b = C1154e9.d(3, "Google Play In-app Billing API version is less than 9");

    /* renamed from: c, reason: collision with root package name */
    public static final BillingResult f18685c = C1154e9.d(3, "Billing service unavailable on device.");

    /* renamed from: d, reason: collision with root package name */
    public static final BillingResult f18686d = C1154e9.d(5, "Client is already in the process of connecting to billing service.");

    /* renamed from: e, reason: collision with root package name */
    public static final BillingResult f18687e = C1154e9.d(5, "The list of SKUs can't be empty.");

    /* renamed from: f, reason: collision with root package name */
    public static final BillingResult f18688f = C1154e9.d(5, "SKU type can't be empty.");

    /* renamed from: g, reason: collision with root package name */
    public static final BillingResult f18689g = C1154e9.d(5, "Product type can't be empty.");

    /* renamed from: h, reason: collision with root package name */
    public static final BillingResult f18690h = C1154e9.d(-2, "Client does not support extra params.");
    public static final BillingResult i = C1154e9.d(5, "Invalid purchase token.");

    /* renamed from: j, reason: collision with root package name */
    public static final BillingResult f18691j = C1154e9.d(6, "An internal error occurred.");

    /* renamed from: k, reason: collision with root package name */
    public static final BillingResult f18692k;

    /* renamed from: l, reason: collision with root package name */
    public static final BillingResult f18693l;

    /* renamed from: m, reason: collision with root package name */
    public static final BillingResult f18694m;

    /* renamed from: n, reason: collision with root package name */
    public static final BillingResult f18695n;

    /* renamed from: o, reason: collision with root package name */
    public static final BillingResult f18696o;

    /* renamed from: p, reason: collision with root package name */
    public static final BillingResult f18697p;

    /* renamed from: q, reason: collision with root package name */
    public static final BillingResult f18698q;

    /* renamed from: r, reason: collision with root package name */
    public static final BillingResult f18699r;

    /* renamed from: s, reason: collision with root package name */
    public static final BillingResult f18700s;

    /* renamed from: t, reason: collision with root package name */
    public static final BillingResult f18701t;

    /* renamed from: u, reason: collision with root package name */
    public static final BillingResult f18702u;

    /* renamed from: v, reason: collision with root package name */
    public static final BillingResult f18703v;

    /* renamed from: w, reason: collision with root package name */
    public static final BillingResult f18704w;

    /* renamed from: x, reason: collision with root package name */
    public static final BillingResult f18705x;

    /* renamed from: y, reason: collision with root package name */
    public static final BillingResult f18706y;

    /* renamed from: z, reason: collision with root package name */
    public static final BillingResult f18707z;

    static {
        BillingResult.Builder builderNewBuilder = BillingResult.newBuilder();
        builderNewBuilder.setResponseCode(5);
        builderNewBuilder.setDebugMessage("SKU can't be null.");
        builderNewBuilder.build();
        BillingResult.Builder builderNewBuilder2 = BillingResult.newBuilder();
        builderNewBuilder2.setResponseCode(0);
        f18692k = builderNewBuilder2.build();
        f18693l = C1154e9.d(-1, "Service connection is disconnected.");
        f18694m = C1154e9.d(2, "Timeout communicating with service.");
        f18695n = C1154e9.d(-2, "Client does not support subscriptions.");
        f18696o = C1154e9.d(-2, "Client does not support subscriptions update.");
        f18697p = C1154e9.d(-2, "Client does not support get purchase history.");
        f18698q = C1154e9.d(-2, "Client does not support price change confirmation.");
        f18699r = C1154e9.d(-2, "Play Store version installed does not support cross selling products.");
        f18700s = C1154e9.d(-2, "Client does not support multi-item purchases.");
        f18701t = C1154e9.d(-2, "Client does not support offer_id_token.");
        f18702u = C1154e9.d(-2, "Client does not support ProductDetails.");
        f18703v = C1154e9.d(-2, "Client does not support in-app messages.");
        BillingResult.Builder builderNewBuilder3 = BillingResult.newBuilder();
        builderNewBuilder3.setResponseCode(-2);
        builderNewBuilder3.setDebugMessage("Client does not support user choice billing.");
        builderNewBuilder3.build();
        BillingResult.Builder builderNewBuilder4 = BillingResult.newBuilder();
        builderNewBuilder4.setResponseCode(-2);
        builderNewBuilder4.setDebugMessage("Play Store version installed does not support external offer.");
        f18704w = builderNewBuilder4.build();
        f18705x = C1154e9.d(5, "Unknown feature");
        f18706y = C1154e9.d(-2, "Play Store version installed does not support get billing config.");
        f18707z = C1154e9.d(-2, "Query product details with serialized docid is not supported.");
        f18679A = C1154e9.d(4, "Item is unavailable for purchase.");
        f18680B = C1154e9.d(-2, "Query product details with developer specified account is not supported.");
        f18681C = C1154e9.d(-2, "Play Store version installed does not support alternative billing only.");
        f18682D = C1154e9.d(5, "To use this API you must specify a PurchasesUpdateListener when initializing a BillingClient.");
    }

    public static BillingResult a(int i10, String str) {
        return C1154e9.d(i10, str);
    }
}
