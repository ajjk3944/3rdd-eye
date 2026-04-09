package com.google.android.gms.internal.play_billing;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import com.google.android.gms.internal.ads.d7;
import java.util.ArrayList;
import org.json.JSONException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final int f20232a = Runtime.getRuntime().availableProcessors();

    public static int a(Bundle bundle, String str) {
        if (bundle == null) {
            h(str, "Unexpected null bundle received!");
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            g(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        h(str, "Unexpected type for bundle response code: ".concat(obj.getClass().getName()));
        return 6;
    }

    public static void b(long j, Bundle bundle, String str, String str2) {
        bundle.putString("playBillingLibraryVersion", str);
        if (str2 != null) {
            bundle.putString("playBillingLibraryWrapperVersion", str2);
        }
        bundle.putLong("billingClientSessionId", j);
    }

    public static Bundle c(int i4, t7.c cVar) {
        Bundle bundle = new Bundle();
        bundle.putInt("RESPONSE_CODE", cVar.f34435a);
        bundle.putString("DEBUG_MESSAGE", cVar.f34437c);
        bundle.putInt("LOG_REASON", d7.g(i4));
        return bundle;
    }

    public static Bundle d(String str, String str2, ArrayList arrayList, bh.v vVar, long j) {
        Bundle bundle = new Bundle();
        b(j, bundle, str, str2);
        bundle.putBoolean("enablePendingPurchases", true);
        bundle.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
        o oVar = q.f20213b;
        Object[] objArr = {"subs", "inapp"};
        pd.b.w(objArr, 2);
        bundle.putStringArrayList("PRODUCT_TYPES_TO_RETURN_MULTIPLE_OFFERS", new ArrayList<>(q.k(objArr, 2)));
        Object[] objArr2 = {"inapp"};
        pd.b.w(objArr2, 1);
        bundle.putStringArrayList("PRODUCT_TYPES_TO_RETURN_RENT_OFFERS", new ArrayList<>(q.k(objArr2, 1)));
        bundle.putBoolean("SHOULD_RETURN_UNFETCHED_PRODUCTS", true);
        if (vVar.f2243a) {
            bundle.putBoolean("enablePendingPurchaseForSubscriptions", true);
        }
        ArrayList<String> arrayList2 = new ArrayList<>();
        ArrayList<String> arrayList3 = new ArrayList<>();
        ArrayList<String> arrayList4 = new ArrayList<>();
        int size = arrayList.size();
        boolean z3 = false;
        boolean z10 = false;
        for (int i4 = 0; i4 < size; i4++) {
            t7.i iVar = (t7.i) arrayList.get(i4);
            arrayList2.add(null);
            z3 |= !TextUtils.isEmpty(null);
            arrayList4.add(null);
            z10 |= !TextUtils.isEmpty(null);
            if (iVar.f34460b.equals("first_party")) {
                throw new NullPointerException("Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
            }
        }
        if (z3) {
            bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList2);
        }
        if (!arrayList3.isEmpty()) {
            bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList3);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putString("accountName", null);
        }
        if (z10) {
            bundle.putStringArrayList("SKU_DYNAMIC_PRODUCT_TOKEN_LIST", arrayList4);
        }
        return bundle;
    }

    public static t7.c e(Intent intent, String str) {
        if (intent != null) {
            n3.f fVarA = t7.c.a();
            fVarA.f29626a = a(intent.getExtras(), str);
            fVarA.f29628c = f(intent.getExtras(), str);
            return fVarA.b();
        }
        h("BillingHelper", "Got null intent!");
        n3.f fVarA2 = t7.c.a();
        fVarA2.f29626a = 6;
        fVarA2.f29628c = "An internal error occurred.";
        return fVarA2.b();
    }

    public static String f(Bundle bundle, String str) {
        if (bundle == null) {
            h(str, "Unexpected null bundle received!");
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            g(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        h(str, "Unexpected type for debug message: ".concat(obj.getClass().getName()));
        return "";
    }

    public static void g(String str, String str2) {
        if (Log.isLoggable(str, 2)) {
            if (str2.isEmpty()) {
                Log.v(str, str2);
                return;
            }
            int i4 = 40000;
            while (!str2.isEmpty() && i4 > 0) {
                int iMin = Math.min(str2.length(), Math.min(4000, i4));
                Log.v(str, str2.substring(0, iMin));
                str2 = str2.substring(iMin);
                i4 -= iMin;
            }
        }
    }

    public static void h(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    public static void i(String str, String str2, Throwable th2) {
        try {
            if (Log.isLoggable(str, 5)) {
                if (th2 == null) {
                    Log.w(str, str2);
                } else {
                    Log.w(str, str2, th2);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static Purchase j(String str, String str2) {
        if (str == null || str2 == null) {
            g("BillingHelper", "Received a null purchase data.");
            return null;
        }
        try {
            return new Purchase(str, str2);
        } catch (JSONException e2) {
            h("BillingHelper", "Got JSONException while parsing purchase data: ".concat(e2.toString()));
            return null;
        }
    }
}
