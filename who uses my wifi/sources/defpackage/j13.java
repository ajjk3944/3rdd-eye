package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class j13 implements zz2 {
    @Override // defpackage.zz2
    public final boolean a(h83 h83Var, a83 a83Var) {
        return !TextUtils.isEmpty(a83Var.v.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, ""));
    }

    @Override // defpackage.zz2
    public final n70 b(h83 h83Var, a83 a83Var) {
        JSONObject jSONObject = a83Var.v;
        String strOptString = jSONObject.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, "");
        l83 l83Var = (l83) h83Var.a.g;
        k83 k83Var = new k83();
        k83Var.o.g = l83Var.p.g;
        pc4 pc4Var = l83Var.d;
        k83Var.a = pc4Var;
        k83Var.b = l83Var.f;
        k83Var.v = l83Var.v;
        String str = l83Var.g;
        k83Var.c = str;
        k83Var.d = l83Var.a;
        k83Var.f = l83Var.h;
        k83Var.g = l83Var.i;
        k83Var.h = l83Var.j;
        k83Var.i = l83Var.k;
        z2 z2Var = l83Var.m;
        k83Var.j = z2Var;
        if (z2Var != null) {
            k83Var.e = z2Var.f;
        }
        vm0 vm0Var = l83Var.n;
        k83Var.k = vm0Var;
        if (vm0Var != null) {
            k83Var.e = vm0Var.f;
            k83Var.l = vm0Var.g;
        }
        k83Var.p = l83Var.q;
        k83Var.q = l83Var.r;
        k83Var.r = l83Var.c;
        k83Var.s = l83Var.s;
        k83Var.t = l83Var.t;
        k83Var.u.set(l83Var.u.get());
        k83Var.c = strOptString;
        Bundle bundle = pc4Var.r;
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
        JSONObject jSONObject2 = a83Var.D;
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString4 = jSONObject2.optString(next, null);
            if (next != null) {
                bundle4.putString(next, strOptString4);
            }
        }
        bundle2.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundle4);
        k83Var.a = new pc4(pc4Var.f, pc4Var.g, bundle4, pc4Var.i, pc4Var.j, pc4Var.k, pc4Var.l, pc4Var.m, pc4Var.n, pc4Var.o, pc4Var.p, pc4Var.q, bundle2, pc4Var.s, pc4Var.t, pc4Var.u, pc4Var.v, pc4Var.w, pc4Var.x, pc4Var.y, pc4Var.z, pc4Var.A, pc4Var.B, pc4Var.C, pc4Var.D, pc4Var.E, pc4Var.F);
        l83 l83VarA = k83Var.a();
        Bundle bundle5 = new Bundle();
        c83 c83Var = (c83) h83Var.b.g;
        Bundle bundle6 = new Bundle();
        bundle6.putStringArrayList("nofill_urls", new ArrayList<>(c83Var.a));
        bundle6.putInt("refresh_interval", c83Var.c);
        bundle6.putString("gws_query_id", c83Var.b);
        bundle5.putBundle("parent_common_config", bundle6);
        Bundle bundle7 = new Bundle();
        bundle7.putString("initial_ad_unit_id", str);
        bundle7.putString("allocation_id", a83Var.w);
        bundle7.putString("ad_source_name", a83Var.F);
        bundle7.putStringArrayList("click_urls", new ArrayList<>(a83Var.c));
        bundle7.putStringArrayList("imp_urls", new ArrayList<>(a83Var.d));
        bundle7.putStringArrayList("manual_tracking_urls", new ArrayList<>(a83Var.p));
        bundle7.putStringArrayList("fill_urls", new ArrayList<>(a83Var.m));
        bundle7.putStringArrayList("video_start_urls", new ArrayList<>(a83Var.g));
        bundle7.putStringArrayList("video_reward_urls", new ArrayList<>(a83Var.h));
        bundle7.putStringArrayList("video_complete_urls", new ArrayList<>(a83Var.i));
        bundle7.putString("transaction_id", a83Var.j);
        bundle7.putString("valid_from_timestamp", a83Var.k);
        bundle7.putBoolean("is_closable_area_disabled", a83Var.P);
        bundle7.putString("recursive_server_response_data", a83Var.o0);
        bundle7.putBoolean("is_analytics_logging_enabled", a83Var.W);
        ta2 ta2Var = a83Var.l;
        if (ta2Var != null) {
            Bundle bundle8 = new Bundle();
            bundle8.putInt("rb_amount", ta2Var.g);
            bundle8.putString("rb_type", ta2Var.f);
            bundle7.putParcelableArray("rewards", new Bundle[]{bundle8});
        }
        bundle5.putBundle("parent_ad_config", bundle7);
        return c(l83VarA, bundle5, a83Var, h83Var);
    }

    public abstract q93 c(l83 l83Var, Bundle bundle, a83 a83Var, h83 h83Var);
}
