package com.wifihacker.detector.common.bill;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import com.android.billingclient.api.AcknowledgePurchaseParams;
import com.android.billingclient.api.AcknowledgePurchaseResponseListener;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ConsumeParams;
import com.android.billingclient.api.ConsumeResponseListener;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.ProductDetailsResponseListener;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesResponseListener;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.android.billingclient.api.QueryPurchasesParams;
import com.wifihacker.detector.HackerApplication;
import com.wifihacker.detector.common.bill.BillingDataSource;
import d8.d;
import d8.e;
import g8.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public class BillingDataSource implements BillingClientStateListener, PurchasesUpdatedListener, ProductDetailsResponseListener {

    /* renamed from: n, reason: collision with root package name */
    public static volatile BillingDataSource f20292n;

    /* renamed from: o, reason: collision with root package name */
    public static final Handler f20293o = new Handler(Looper.getMainLooper());

    /* renamed from: p, reason: collision with root package name */
    public static final String[] f20294p = {"hacker_pro", "hacker_pro_pro"};

    /* renamed from: q, reason: collision with root package name */
    public static final String[] f20295q = {"premium_bill_monthly", "premium_bill_yearly"};

    /* renamed from: r, reason: collision with root package name */
    public static final String[] f20296r = {"hacker_pro_pro"};

    /* renamed from: s, reason: collision with root package name */
    public static final String f20297s = "WiFiMasterPro:" + BillingDataSource.class.getSimpleName();

    /* renamed from: d, reason: collision with root package name */
    public final Set f20301d;

    /* renamed from: k, reason: collision with root package name */
    public final BillingClient f20308k;

    /* renamed from: a, reason: collision with root package name */
    public boolean f20298a = false;

    /* renamed from: e, reason: collision with root package name */
    public final Map f20302e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final Map f20303f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final t f20304g = new t();

    /* renamed from: h, reason: collision with root package name */
    public final Set f20305h = new HashSet();

    /* renamed from: i, reason: collision with root package name */
    public final e f20306i = new e();

    /* renamed from: j, reason: collision with root package name */
    public final e f20307j = new e();

    /* renamed from: l, reason: collision with root package name */
    public long f20309l = 1000;

    /* renamed from: m, reason: collision with root package name */
    public long f20310m = -14400000;

    /* renamed from: b, reason: collision with root package name */
    public final List f20299b = Arrays.asList(f20294p);

    /* renamed from: c, reason: collision with root package name */
    public final List f20300c = Arrays.asList(f20295q);

    public enum SkuState {
        SKU_STATE_UNPURCHASED,
        SKU_STATE_PENDING,
        SKU_STATE_PURCHASED,
        SKU_STATE_PURCHASED_AND_ACKNOWLEDGED
    }

    public class a implements PurchasesResponseListener {
        public a() {
        }

        @Override // com.android.billingclient.api.PurchasesResponseListener
        public void onQueryPurchasesResponse(BillingResult billingResult, List list) {
            if (billingResult.getResponseCode() == 0) {
                BillingDataSource billingDataSource = BillingDataSource.this;
                billingDataSource.q(list, billingDataSource.f20299b);
                return;
            }
            Log.e(BillingDataSource.f20297s, "Problem getting purchases: " + billingResult.getDebugMessage());
        }
    }

    public class b implements PurchasesResponseListener {
        public b() {
        }

        @Override // com.android.billingclient.api.PurchasesResponseListener
        public void onQueryPurchasesResponse(BillingResult billingResult, List list) {
            if (billingResult.getResponseCode() == 0) {
                BillingDataSource billingDataSource = BillingDataSource.this;
                billingDataSource.q(list, billingDataSource.f20300c);
                return;
            }
            Log.e(BillingDataSource.f20297s, "Problem getting subscriptions: " + billingResult.getDebugMessage());
        }
    }

    public BillingDataSource(Application application) {
        HashSet hashSet = new HashSet();
        this.f20301d = hashSet;
        hashSet.addAll(Arrays.asList(f20296r));
        BillingClient billingClientBuild = BillingClient.newBuilder(application).setListener(this).enablePendingPurchases().build();
        this.f20308k = billingClientBuild;
        billingClientBuild.startConnection(this);
        n();
    }

    public static /* synthetic */ void a(BillingDataSource billingDataSource, Purchase purchase, BillingResult billingResult) {
        billingDataSource.getClass();
        if (billingResult.getResponseCode() == 0) {
            ArrayList<String> skus = purchase.getSkus();
            int size = skus.size();
            int i10 = 0;
            while (i10 < size) {
                String str = skus.get(i10);
                i10++;
                String str2 = str;
                billingDataSource.w(str2, SkuState.SKU_STATE_PURCHASED_AND_ACKNOWLEDGED);
                try {
                    o.c().m(HackerApplication.l(), str2, true);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
            billingDataSource.f20306i.i(purchase.getSkus());
        }
    }

    public static /* synthetic */ void b(BillingDataSource billingDataSource, Purchase purchase, BillingResult billingResult, String str) {
        billingDataSource.f20305h.remove(purchase);
        if (billingResult.getResponseCode() == 0) {
            Log.d(f20297s, "Consumption successful. Delivering entitlement.");
            billingDataSource.f20307j.i(purchase.getSkus());
            ArrayList<String> skus = purchase.getSkus();
            int size = skus.size();
            int i10 = 0;
            while (i10 < size) {
                String str2 = skus.get(i10);
                i10++;
                billingDataSource.w(str2, SkuState.SKU_STATE_UNPURCHASED);
            }
            billingDataSource.f20306i.i(purchase.getSkus());
        } else {
            Log.e(f20297s, "Error while consuming: " + billingResult.getDebugMessage());
        }
        Log.d(f20297s, "End consumption flow.");
    }

    public static BillingDataSource l(Application application) {
        if (f20292n == null) {
            synchronized (BillingDataSource.class) {
                try {
                    if (f20292n == null) {
                        f20292n = new BillingDataSource(application);
                    }
                } finally {
                }
            }
        }
        return f20292n;
    }

    public final void h(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f20302e.put((String) it.next(), SkuState.SKU_STATE_UNPURCHASED);
        }
        if (SystemClock.elapsedRealtime() - this.f20310m > 14400000) {
            this.f20310m = SystemClock.elapsedRealtime();
            Log.v(f20297s, "Skus not fresh, requerying");
            s();
        }
    }

    public boolean i() {
        return j("hacker_pro") && !o("hacker_pro");
    }

    public boolean j(String str) {
        new r();
        ProductDetails productDetails = (ProductDetails) this.f20303f.get(str);
        if (((SkuState) this.f20302e.get(str)) == null || productDetails == null) {
            return false;
        }
        SkuState skuState = SkuState.SKU_STATE_UNPURCHASED;
        return true;
    }

    public final void k(final Purchase purchase) {
        if (this.f20305h.contains(purchase)) {
            return;
        }
        this.f20305h.add(purchase);
        this.f20308k.consumeAsync(ConsumeParams.newBuilder().setPurchaseToken(purchase.getPurchaseToken()).build(), new ConsumeResponseListener() { // from class: d8.c
            @Override // com.android.billingclient.api.ConsumeResponseListener
            public final void onConsumeResponse(BillingResult billingResult, String str) {
                BillingDataSource.b(this.f20806a, purchase, billingResult, str);
            }
        });
    }

    public final String m(String str) {
        ProductDetails productDetails = (ProductDetails) this.f20303f.get(str);
        return productDetails != null ? productDetails.getOneTimePurchaseOfferDetails().getFormattedPrice() : "";
    }

    public final void n() {
        h(this.f20299b);
        h(this.f20300c);
        this.f20304g.k(Boolean.FALSE);
    }

    public boolean o(String str) {
        SkuState skuState = (SkuState) this.f20302e.get(str);
        return skuState != null && skuState == SkuState.SKU_STATE_PURCHASED_AND_ACKNOWLEDGED;
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public void onBillingServiceDisconnected() {
        this.f20298a = false;
        v();
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public void onBillingSetupFinished(BillingResult billingResult) {
        int responseCode = billingResult.getResponseCode();
        String debugMessage = billingResult.getDebugMessage();
        Log.d(f20297s, "onBillingSetupFinished: " + responseCode + " " + debugMessage);
        if (responseCode != 0) {
            v();
            return;
        }
        this.f20309l = 1000L;
        this.f20298a = true;
        s();
        u();
    }

    @Override // com.android.billingclient.api.ProductDetailsResponseListener
    public void onProductDetailsResponse(BillingResult billingResult, List list) {
        int responseCode = billingResult.getResponseCode();
        String debugMessage = billingResult.getDebugMessage();
        switch (responseCode) {
            case -1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                Log.e(f20297s, "onSkuDetailsResponse: " + responseCode + " " + debugMessage);
                break;
            case 0:
                String str = f20297s;
                Log.i(str, "onSkuDetailsResponse: " + responseCode + " " + debugMessage);
                if (list != null && !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ProductDetails productDetails = (ProductDetails) it.next();
                        String productId = productDetails.getProductId();
                        if (this.f20302e.get(productId) != null) {
                            this.f20303f.put(productId, productDetails);
                        } else {
                            Log.e(f20297s, "Unknown sku: " + productId);
                        }
                    }
                    break;
                } else {
                    Log.e(str, "onSkuDetailsResponse: Found null or empty SkuDetails. Check to see if the SKUs you requested are correctly published in the Google Play Console.");
                    break;
                }
                break;
            case 1:
                Log.i(f20297s, "onSkuDetailsResponse: " + responseCode + " " + debugMessage);
                break;
            default:
                Log.wtf(f20297s, "onSkuDetailsResponse: " + responseCode + " " + debugMessage);
                break;
        }
        if (responseCode == 0) {
            this.f20310m = SystemClock.elapsedRealtime();
        } else {
            this.f20310m = -14400000L;
        }
    }

    @Override // com.android.billingclient.api.PurchasesUpdatedListener
    public void onPurchasesUpdated(BillingResult billingResult, List list) {
        int responseCode = billingResult.getResponseCode();
        if (responseCode != 0) {
            if (responseCode == 1) {
                Log.i(f20297s, "onPurchasesUpdated: User canceled the purchase");
            } else if (responseCode == 5) {
                Log.e(f20297s, "onPurchasesUpdated: Developer error means that Google Play does not recognize the configuration. If you are just getting started, make sure you have configured the application correctly in the Google Play Console. The SKU product ID must match and the APK you are using must be signed with release keys.");
            } else if (responseCode != 7) {
                Log.d(f20297s, "BillingResult [" + billingResult.getResponseCode() + "]: " + billingResult.getDebugMessage());
            } else {
                Log.i(f20297s, "onPurchasesUpdated: The user already owns this item");
            }
        } else {
            if (list != null) {
                q(list, null);
                return;
            }
            Log.d(f20297s, "Null Purchase List Returned from OK response!");
        }
        this.f20304g.i(Boolean.FALSE);
    }

    public final boolean p(Purchase purchase) {
        return d.c(purchase.getOriginalJson(), purchase.getSignature());
    }

    public final void q(List list, List list2) {
        HashSet hashSet = new HashSet();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                final Purchase purchase = (Purchase) it.next();
                for (String str : purchase.getProducts()) {
                    if (this.f20302e.get(str) == null) {
                        Log.e(f20297s, "Unknown SKU " + str + ". Check to make sure SKU matches SKUS in the Play developer console.");
                    } else {
                        hashSet.add(str);
                    }
                }
                if (purchase.getPurchaseState() != 1) {
                    x(purchase);
                } else if (p(purchase)) {
                    x(purchase);
                    ArrayList<String> skus = purchase.getSkus();
                    int size = skus.size();
                    boolean z10 = false;
                    boolean z11 = false;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            z10 = z11;
                            break;
                        }
                        String str2 = skus.get(i10);
                        i10++;
                        if (!this.f20301d.contains(str2)) {
                            if (z11) {
                                Log.e(f20297s, "Purchase cannot contain a mixture of consumableand non-consumable items: " + purchase.getSkus().toString());
                                break;
                            }
                        } else {
                            z11 = true;
                        }
                    }
                    if (z10) {
                        k(purchase);
                    } else if (!purchase.isAcknowledged()) {
                        this.f20308k.acknowledgePurchase(AcknowledgePurchaseParams.newBuilder().setPurchaseToken(purchase.getPurchaseToken()).build(), new AcknowledgePurchaseResponseListener() { // from class: d8.b
                            @Override // com.android.billingclient.api.AcknowledgePurchaseResponseListener
                            public final void onAcknowledgePurchaseResponse(BillingResult billingResult) {
                                BillingDataSource.a(this.f20804a, purchase, billingResult);
                            }
                        });
                    }
                } else {
                    Log.e(f20297s, "Invalid signature on purchase. Check to make sure your public key is correct.");
                }
            }
        } else {
            Log.d(f20297s, "Empty purchase list.");
        }
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                String str3 = (String) it2.next();
                if (!hashSet.contains(str3)) {
                    w(str3, SkuState.SKU_STATE_UNPURCHASED);
                }
            }
        }
    }

    public final void r() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f20299b.iterator();
        while (it.hasNext()) {
            arrayList.add(QueryProductDetailsParams.Product.newBuilder().setProductId((String) it.next()).setProductType("inapp").build());
        }
        this.f20308k.queryProductDetailsAsync(QueryProductDetailsParams.newBuilder().setProductList(arrayList).build(), this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void resume() {
        Boolean bool = (Boolean) this.f20304g.e();
        if (this.f20298a) {
            if (bool == null || !bool.booleanValue()) {
                u();
            }
        }
    }

    public final void s() {
        t();
        r();
    }

    public final void t() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f20300c.iterator();
        while (it.hasNext()) {
            arrayList.add(QueryProductDetailsParams.Product.newBuilder().setProductId((String) it.next()).setProductType("subs").build());
        }
        this.f20308k.queryProductDetailsAsync(QueryProductDetailsParams.newBuilder().setProductList(arrayList).build(), this);
    }

    public void u() {
        this.f20308k.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType("inapp").build(), new a());
        this.f20308k.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType("subs").build(), new b());
        Log.d(f20297s, "Refreshing purchases started.");
    }

    public final void v() {
        f20293o.postDelayed(new Runnable() { // from class: d8.a
            @Override // java.lang.Runnable
            public final void run() {
                BillingDataSource billingDataSource = this.f20803a;
                billingDataSource.f20308k.startConnection(billingDataSource);
            }
        }, this.f20309l);
        this.f20309l = Math.min(this.f20309l * 2, 900000L);
    }

    public final void w(String str, SkuState skuState) {
        if (this.f20302e.get(str) != null) {
            this.f20302e.put(str, skuState);
            return;
        }
        Log.e(f20297s, "Unknown SKU " + str + ". Check to make sure SKU matches SKUS in the Play developer console.");
    }

    public final void x(Purchase purchase) {
        ArrayList<String> skus = purchase.getSkus();
        int size = skus.size();
        int i10 = 0;
        while (i10 < size) {
            String str = skus.get(i10);
            i10++;
            String str2 = str;
            if (this.f20302e.get(str2) == null) {
                Log.e(f20297s, "Unknown SKU " + str2 + ". Check to make sure SKU matches SKUS in the Play developer console.");
            } else {
                int purchaseState = purchase.getPurchaseState();
                if (purchaseState == 0) {
                    this.f20302e.put(str2, SkuState.SKU_STATE_UNPURCHASED);
                } else if (purchaseState != 1) {
                    if (purchaseState != 2) {
                        Log.e(f20297s, "Purchase in unknown state: " + purchase.getPurchaseState());
                    } else {
                        this.f20302e.put(str2, SkuState.SKU_STATE_PENDING);
                    }
                } else if (purchase.isAcknowledged()) {
                    this.f20302e.put(str2, SkuState.SKU_STATE_PURCHASED_AND_ACKNOWLEDGED);
                    try {
                        o.c().m(HackerApplication.l(), str2, true);
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                } else {
                    this.f20302e.put(str2, SkuState.SKU_STATE_PURCHASED);
                    try {
                        o.c().m(HackerApplication.l(), str2, true);
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                }
            }
        }
    }
}
