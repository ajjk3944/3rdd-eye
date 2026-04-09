package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinEventParameters;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class ij0 implements zh0 {
    @Override // com.google.android.gms.internal.ads.zh0
    public final boolean a(dq0 dq0Var, wp0 wp0Var) {
        return !TextUtils.isEmpty(wp0Var.f18112v.optString("pubid", ""));
    }

    @Override // com.google.android.gms.internal.ads.zh0
    public final vd.b b(dq0 dq0Var, wp0 wp0Var) {
        JSONObject jSONObject = wp0Var.f18112v;
        String strOptString = jSONObject.optString("pubid", "");
        hq0 hq0Var = (hq0) dq0Var.f10543a.f15651b;
        gq0 gq0Var = new gq0();
        gq0Var.f11588o.f15910b = hq0Var.f11954p.f15910b;
        va.z2 z2Var = hq0Var.f11944d;
        gq0Var.f11576a = z2Var;
        gq0Var.f11577b = hq0Var.f11946f;
        gq0Var.f11596w = hq0Var.f11961w;
        String str = hq0Var.g;
        gq0Var.f11578c = str;
        gq0Var.f11579d = hq0Var.f11941a;
        gq0Var.f11581f = hq0Var.f11947h;
        gq0Var.g = hq0Var.f11948i;
        gq0Var.f11582h = hq0Var.j;
        gq0Var.f11583i = hq0Var.f11949k;
        sa.a aVar = hq0Var.f11951m;
        gq0Var.j = aVar;
        if (aVar != null) {
            gq0Var.f11580e = aVar.f33510a;
        }
        sa.e eVar = hq0Var.f11952n;
        gq0Var.f11584k = eVar;
        if (eVar != null) {
            gq0Var.f11580e = eVar.f33517a;
            gq0Var.f11585l = eVar.f33518b;
        }
        gq0Var.f11589p = hq0Var.f11955q;
        gq0Var.f11590q = hq0Var.f11956r;
        gq0Var.f11591r = hq0Var.f11943c;
        gq0Var.f11592s = hq0Var.f11957s;
        gq0Var.f11593t = hq0Var.f11958t;
        gq0Var.f11594u.set(hq0Var.f11959u.get());
        gq0Var.f11578c = strOptString;
        gq0Var.f11595v = true;
        Bundle bundle = z2Var.f36198m;
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        Bundle bundle3 = bundle2.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        Bundle bundle4 = bundle3 == null ? new Bundle() : new Bundle(bundle3);
        bundle4.putInt("gw", 1);
        String strOptString2 = jSONObject.optString("mad_hac", null);
        if (strOptString2 != null) {
            bundle4.putString("mad_hac", strOptString2);
        }
        String strOptString3 = jSONObject.optString("adJson", null);
        if (strOptString3 != null) {
            bundle4.putString("_ad", strOptString3);
        }
        bundle4.putBoolean("_noRefresh", true);
        JSONObject jSONObject2 = wp0Var.D;
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString4 = jSONObject2.optString(next, null);
            if (next != null) {
                bundle4.putString(next, strOptString4);
            }
        }
        bundle2.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundle4);
        gq0Var.f11576a = new va.z2(z2Var.f36188a, z2Var.f36189b, bundle4, z2Var.f36191d, z2Var.f36192e, z2Var.f36193f, z2Var.g, z2Var.f36194h, z2Var.f36195i, z2Var.j, z2Var.f36196k, z2Var.f36197l, bundle2, z2Var.f36199n, z2Var.f36200o, z2Var.f36201p, z2Var.f36202q, z2Var.f36203r, z2Var.f36204s, z2Var.f36205t, z2Var.f36206u, z2Var.f36207v, z2Var.f36208w, z2Var.f36209x, z2Var.f36210y, z2Var.f36211z, z2Var.A);
        hq0 hq0VarA = gq0Var.a();
        Bundle bundle5 = new Bundle();
        yp0 yp0Var = (yp0) dq0Var.f10544b.f9452c;
        Bundle bundle6 = new Bundle();
        bundle6.putStringArrayList("nofill_urls", new ArrayList<>(yp0Var.f18819a));
        bundle6.putInt("refresh_interval", yp0Var.f18821c);
        bundle6.putString("gws_query_id", yp0Var.f18820b);
        bundle5.putBundle("parent_common_config", bundle6);
        Bundle bundle7 = new Bundle();
        bundle7.putString("initial_ad_unit_id", str);
        bundle7.putString("allocation_id", wp0Var.f18114w);
        bundle7.putString("ad_source_name", wp0Var.F);
        bundle7.putStringArrayList("click_urls", new ArrayList<>(wp0Var.f18076c));
        bundle7.putStringArrayList("imp_urls", new ArrayList<>(wp0Var.f18078d));
        bundle7.putStringArrayList("manual_tracking_urls", new ArrayList<>(wp0Var.f18100p));
        bundle7.putStringArrayList("fill_urls", new ArrayList<>(wp0Var.f18094m));
        bundle7.putStringArrayList("video_start_urls", new ArrayList<>(wp0Var.g));
        bundle7.putStringArrayList("video_reward_urls", new ArrayList<>(wp0Var.f18085h));
        bundle7.putStringArrayList("video_complete_urls", new ArrayList<>(wp0Var.f18087i));
        bundle7.putString(AppLovinEventParameters.CHECKOUT_TRANSACTION_IDENTIFIER, wp0Var.j);
        bundle7.putString("valid_from_timestamp", wp0Var.f18090k);
        bundle7.putBoolean("is_closable_area_disabled", wp0Var.P);
        bundle7.putString("recursive_server_response_data", wp0Var.f18099o0);
        bundle7.putBoolean("is_analytics_logging_enabled", wp0Var.W);
        xu xuVar = wp0Var.f18092l;
        if (xuVar != null) {
            Bundle bundle8 = new Bundle();
            bundle8.putInt("rb_amount", xuVar.f18499b);
            bundle8.putString("rb_type", xuVar.f18498a);
            bundle7.putParcelableArray("rewards", new Bundle[]{bundle8});
        }
        bundle5.putBundle("parent_ad_config", bundle7);
        return c(hq0VarA, bundle5, wp0Var, dq0Var);
    }

    public abstract pr0 c(hq0 hq0Var, Bundle bundle, wp0 wp0Var, dq0 dq0Var);
}
