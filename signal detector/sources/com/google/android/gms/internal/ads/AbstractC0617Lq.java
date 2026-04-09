package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import f4.InterfaceFutureC2326a;
import java.util.ArrayList;
import java.util.Iterator;
import m2.C2654a;
import m2.C2658e;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Lq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0617Lq implements InterfaceC0956bq {
    @Override // com.google.android.gms.internal.ads.InterfaceC0956bq
    public final boolean a(Xt xt, Qt qt) {
        return !TextUtils.isEmpty(qt.f10797v.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, ""));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0956bq
    public final InterfaceFutureC2326a b(Xt xt, Qt qt) {
        JSONObject jSONObject = qt.f10797v;
        String strOptString = jSONObject.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, "");
        C0960bu c0960bu = (C0960bu) xt.f12509a.f10110b;
        C0905au c0905au = new C0905au();
        c0905au.f13254o.f3830b = c0960bu.f13493p.f3830b;
        q2.a1 a1Var = c0960bu.f13482d;
        c0905au.f13241a = a1Var;
        c0905au.f13242b = c0960bu.f13484f;
        c0905au.f13262w = c0960bu.f13500w;
        String str = c0960bu.f13485g;
        c0905au.f13243c = str;
        c0905au.f13244d = c0960bu.f13479a;
        c0905au.f13246f = c0960bu.f13486h;
        c0905au.f13247g = c0960bu.i;
        c0905au.f13248h = c0960bu.f13487j;
        c0905au.i = c0960bu.f13488k;
        C2654a c2654a = c0960bu.f13490m;
        c0905au.f13249j = c2654a;
        if (c2654a != null) {
            c0905au.f13245e = c2654a.f21941a;
        }
        C2658e c2658e = c0960bu.f13491n;
        c0905au.f13250k = c2658e;
        if (c2658e != null) {
            c0905au.f13245e = c2658e.f21949a;
            c0905au.f13251l = c2658e.f21950b;
        }
        c0905au.f13255p = c0960bu.f13494q;
        c0905au.f13256q = c0960bu.f13495r;
        c0905au.f13257r = c0960bu.f13481c;
        c0905au.f13258s = c0960bu.f13496s;
        c0905au.f13259t = c0960bu.f13497t;
        c0905au.f13260u.set(c0960bu.f13498u.get());
        c0905au.f13243c = strOptString;
        c0905au.f13261v = true;
        Bundle bundle = a1Var.f23176m;
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
        JSONObject jSONObject2 = qt.f10730D;
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString4 = jSONObject2.optString(next, null);
            if (next != null) {
                bundle4.putString(next, strOptString4);
            }
        }
        bundle2.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundle4);
        c0905au.f13241a = new q2.a1(a1Var.f23165a, a1Var.f23166b, bundle4, a1Var.f23168d, a1Var.f23169e, a1Var.f23170f, a1Var.f23171g, a1Var.f23172h, a1Var.i, a1Var.f23173j, a1Var.f23174k, a1Var.f23175l, bundle2, a1Var.f23177n, a1Var.f23152C, a1Var.f23153D, a1Var.f23154E, a1Var.f23155F, a1Var.f23156G, a1Var.f23157H, a1Var.f23158I, a1Var.f23159J, a1Var.f23160K, a1Var.f23161L, a1Var.M, a1Var.f23162N, a1Var.f23163O);
        C0960bu c0960buA = c0905au.a();
        Bundle bundle5 = new Bundle();
        St st = (St) xt.f12510b.f15174c;
        Bundle bundle6 = new Bundle();
        bundle6.putStringArrayList("nofill_urls", new ArrayList<>(st.f11268a));
        bundle6.putInt("refresh_interval", st.f11270c);
        bundle6.putString("gws_query_id", st.f11269b);
        bundle5.putBundle("parent_common_config", bundle6);
        Bundle bundle7 = new Bundle();
        bundle7.putString("initial_ad_unit_id", str);
        bundle7.putString("allocation_id", qt.f10798w);
        bundle7.putString("ad_source_name", qt.f10734F);
        bundle7.putStringArrayList("click_urls", new ArrayList<>(qt.f10760c));
        bundle7.putStringArrayList("imp_urls", new ArrayList<>(qt.f10762d));
        bundle7.putStringArrayList("manual_tracking_urls", new ArrayList<>(qt.f10785p));
        bundle7.putStringArrayList("fill_urls", new ArrayList<>(qt.f10779m));
        bundle7.putStringArrayList("video_start_urls", new ArrayList<>(qt.f10768g));
        bundle7.putStringArrayList("video_reward_urls", new ArrayList<>(qt.f10770h));
        bundle7.putStringArrayList("video_complete_urls", new ArrayList<>(qt.i));
        bundle7.putString("transaction_id", qt.f10773j);
        bundle7.putString("valid_from_timestamp", qt.f10775k);
        bundle7.putBoolean("is_closable_area_disabled", qt.f10746P);
        bundle7.putString("recursive_server_response_data", qt.f10784o0);
        bundle7.putBoolean("is_analytics_logging_enabled", qt.f10753W);
        C0520Ge c0520Ge = qt.f10777l;
        if (c0520Ge != null) {
            Bundle bundle8 = new Bundle();
            bundle8.putInt("rb_amount", c0520Ge.f8407b);
            bundle8.putString("rb_type", c0520Ge.f8406a);
            bundle7.putParcelableArray("rewards", new Bundle[]{bundle8});
        }
        bundle5.putBundle("parent_ad_config", bundle7);
        return c(c0960buA, bundle5, qt, xt);
    }

    public abstract Ju c(C0960bu c0960bu, Bundle bundle, Qt qt, Xt xt);
}
