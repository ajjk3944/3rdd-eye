package ec;

import android.content.Context;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinEventParameters;
import com.google.android.gms.internal.ads.or;
import com.liuzh.deviceinfo.R;
import java.io.File;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class b2 {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f22578a = {"ad_activeview", "ad_click", "ad_exposure", "ad_query", "ad_reward", "adunit_exposure", "app_clear_data", "app_exception", "app_remove", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "app_upgrade", "app_update", "ga_campaign", "error", "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "session_start_with_rollout", "user_engagement", "ad_impression", "screen_view", "ga_extra_parameter", "app_background", "firebase_campaign"};

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f22579b = {"ad_impression"};

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f22580c = {"_aa", "_ac", "_xa", "_aq", "_ar", "_xu", "_cd", "_ae", "_ui", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "_ug", "_au", "_cmp", "_err", "_f", "_v", "_iap", "_nd", "_nf", "_no", "_nr", "_ou", "_s", "_ssr", "_e", "_ai", "_vs", "_ep", "_ab", "_cmp"};

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f22581d = {"purchase", "refund", "add_payment_info", "add_shipping_info", "add_to_cart", "add_to_wishlist", "begin_checkout", "remove_from_cart", "select_item", "select_promotion", "view_cart", "view_item", "view_item_list", "view_promotion", "ecommerce_purchase", "purchase_refund", "set_checkout_option", "checkout_progress", "select_content", "view_search_results"};

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f22582e = {"ga_conversion", "engagement_time_msec", "exposure_time", "ad_event_id", AppLovinUtils.ServerParameterKeys.AD_UNIT_ID, "ga_error", "ga_error_value", "ga_error_length", "ga_event_origin", "ga_screen", "ga_screen_class", "ga_screen_id", "ga_previous_screen", "ga_previous_class", "ga_previous_id", "manual_tracking", "message_device_time", "message_id", "message_name", "message_time", "message_tracking_id", "message_type", "previous_app_version", "previous_os_version", "topic", "update_with_analytics", "previous_first_open_count", "system_app", "system_app_update", "previous_install_count", "ga_event_id", "ga_extra_params_ct", "ga_group_name", "ga_list_length", "ga_index", "ga_event_name", "campaign_info_source", "cached_campaign", "deferred_analytics_collection", "ga_session_number", "ga_session_id", "campaign_extra_referrer", "app_in_background", "firebase_feature_rollouts", "customer_type", "firebase_conversion", "firebase_error", "firebase_error_value", "firebase_error_length", "firebase_event_origin", "firebase_screen", "firebase_screen_class", "firebase_screen_id", "firebase_previous_screen", "firebase_previous_class", "firebase_previous_id", "session_number", "session_id"};

    /* renamed from: f, reason: collision with root package name */
    public static final String[] f22583f = {"_c", "_et", "_xt", "_aeid", "_ai", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_mst", "_ndt", "_nmid", "_nmn", "_nmt", "_nmtid", "_nmc", "_pv", "_po", "_nt", "_uwa", "_pfo", "_sys", "_sysu", "_pin", "_eid", "_epc", "_gn", "_ll", "_i", "_en", "_cis", "_cc", "_dac", "_sno", "_sid", "_cer", "_aib", "_ffr", "_ct", "_c", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_sno", "_sid"};
    public static final String[] g = {"items"};

    /* renamed from: h, reason: collision with root package name */
    public static final String[] f22584h = {"affiliation", "coupon", "creative_name", "creative_slot", AppLovinEventParameters.REVENUE_CURRENCY, "_ct", "discount", "index", "item_id", "item_brand", "item_category", "item_category2", "item_category3", "item_category4", "item_category5", "item_list_name", "item_list_id", "item_name", "item_variant", "location_id", "payment_type", "price", "promotion_id", "promotion_name", "quantity", "shipping", "shipping_tier", "tax", AppLovinEventParameters.CHECKOUT_TRANSACTION_IDENTIFIER, "value", "item_list", "checkout_step", "checkout_option", "item_location_id"};

    /* renamed from: i, reason: collision with root package name */
    public static final String[] f22585i = {"firebase_last_notification", "first_open_time", "first_visit_time", "last_deep_link_referrer", "user_id", "last_advertising_id_reset", "first_open_after_install", "lifetime_user_engagement", "session_user_engagement", "non_personalized_ads", "ga_session_number", "ga_session_id", "last_gclid", "session_number", "session_id"};
    public static final String[] j = {"_ln", "_fot", "_fvt", "_ldl", "_id", "_lair", "_fi", "_lte", "_se", "_npa", "_sno", "_sid", "_lgclid", "_sno", "_sid"};

    /* renamed from: k, reason: collision with root package name */
    public static b7.h f22586k;

    public static String a(Context context) {
        try {
            return context.getResources().getResourcePackageName(R.string.common_google_play_services_unknown_issue);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    public static String b(Context context, String str) {
        pb.y.h(context);
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str)) {
            str = a(context);
        }
        int identifier = resources.getIdentifier("google_app_id", "string", str);
        if (identifier == 0) {
            return null;
        }
        try {
            return resources.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    public static void c(Bundle bundle, Object obj) {
        if (obj instanceof Double) {
            bundle.putDouble("value", ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong("value", ((Long) obj).longValue());
        } else {
            bundle.putString("value", obj.toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082 A[Catch: SQLiteException -> 0x00b7, TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:26:0x0044, B:28:0x0074, B:30:0x0082, B:32:0x008a, B:33:0x008d, B:34:0x00b6, B:38:0x00bc, B:40:0x00bf, B:42:0x00c7, B:43:0x00ce, B:44:0x00d1, B:46:0x00d7, B:49:0x00e6, B:50:0x00ea, B:27:0x006d), top: B:60:0x0044, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bc A[Catch: SQLiteException -> 0x00b7, LOOP:1: B:38:0x00bc->B:43:0x00ce, LOOP_START, PHI: r1
  0x00bc: PHI (r1v5 int) = (r1v4 int), (r1v6 int) binds: [B:37:0x00ba, B:43:0x00ce] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:26:0x0044, B:28:0x0074, B:30:0x0082, B:32:0x008a, B:33:0x008d, B:34:0x00b6, B:38:0x00bc, B:40:0x00bf, B:42:0x00c7, B:43:0x00ce, B:44:0x00d1, B:46:0x00d7, B:49:0x00e6, B:50:0x00ea, B:27:0x006d), top: B:60:0x0044, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d7 A[Catch: SQLiteException -> 0x00b7, TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:26:0x0044, B:28:0x0074, B:30:0x0082, B:32:0x008a, B:33:0x008d, B:34:0x00b6, B:38:0x00bc, B:40:0x00bf, B:42:0x00c7, B:43:0x00ce, B:44:0x00d1, B:46:0x00d7, B:49:0x00e6, B:50:0x00ea, B:27:0x006d), top: B:60:0x0044, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void d(ec.s0 r10, android.database.sqlite.SQLiteDatabase r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String[] r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.b2.d(ec.s0, android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String, java.lang.String, java.lang.String[]):void");
    }

    public static Object e(Bundle bundle, String str, Class cls, Object obj) {
        Object obj2 = bundle.get(str);
        if (obj2 == null) {
            return obj;
        }
        if (cls.isAssignableFrom(obj2.getClass())) {
            return obj2;
        }
        String canonicalName = cls.getCanonicalName();
        throw new IllegalStateException(d.h.w(r5.c.o("Invalid conditional user property field type. '", str, "' expected [", canonicalName, "] but was ["), obj2.getClass().getCanonicalName(), "]"));
    }

    public static void f(s0 s0Var, SQLiteDatabase sQLiteDatabase) {
        if (s0Var == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        or orVar = s0Var.j;
        File file = new File(sQLiteDatabase.getPath());
        if (!file.setReadable(false, false)) {
            orVar.d("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            orVar.d("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            orVar.d("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        orVar.d("Failed to turn on database write permission for owner");
    }

    public static String g(String str, String[] strArr, String[] strArr2) {
        int iMin = Math.min(strArr.length, strArr2.length);
        for (int i4 = 0; i4 < iMin; i4++) {
            String str2 = strArr[i4];
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return strArr2[i4];
            }
        }
        return null;
    }
}
