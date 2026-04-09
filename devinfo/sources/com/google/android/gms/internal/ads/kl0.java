package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class kl0 implements pn0 {

    /* renamed from: a, reason: collision with root package name */
    public final hq0 f13190a;

    /* renamed from: b, reason: collision with root package name */
    public final long f13191b;

    /* renamed from: c, reason: collision with root package name */
    public final long f13192c;

    public kl0(hq0 hq0Var, long j, long j8) {
        this.f13190a = hq0Var;
        this.f13191b = j;
        this.f13192c = j8;
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final void c(Object obj) {
        Bundle bundle = ((t50) obj).f16705a;
        hq0 hq0Var = this.f13190a;
        va.z2 z2Var = hq0Var.f11944d;
        int i4 = z2Var.f36208w;
        Bundle bundle2 = z2Var.f36190c;
        bundle.putInt("http_timeout_millis", i4);
        bundle.putString("slotname", hq0Var.g);
        int i10 = hq0Var.f11954p.f15910b;
        if (i10 == 0) {
            throw null;
        }
        int i11 = i10 - 1;
        if (i11 == 1) {
            bundle.putBoolean("is_new_rewarded", true);
        } else if (i11 == 2) {
            bundle.putBoolean("is_rewarded_interstitial", true);
        }
        long j = this.f13191b;
        bundle.putLong("start_signals_timestamp", j);
        if (((Boolean) va.s.f36163e.f36166c.a(sk.Me)).booleanValue()) {
            bundle.putLong("tsi", j - this.f13192c);
        }
        mq0.M(bundle, "is_sdk_preload", true, bundle2.getBoolean("is_sdk_preload", false));
        mq0.v(bundle, "prefetch_type", "zenith_v2", bundle2.getBoolean("zenith_v2", false));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.US);
        long j8 = z2Var.f36189b;
        mq0.v(bundle, "cust_age", simpleDateFormat.format(new Date(j8)), j8 != -1);
        if (bundle2 != null) {
            bundle.putBundle("extras", bundle2);
        }
        int i12 = z2Var.f36191d;
        mq0.I(bundle, "cust_gender", i12, i12 != -1);
        mq0.a0(bundle, "kw", z2Var.f36192e);
        int i13 = z2Var.g;
        mq0.I(bundle, "tag_for_child_directed_treatment", i13, i13 != -1);
        if (z2Var.f36193f) {
            bundle.putBoolean("test_request", true);
        }
        bundle.putInt("ppt_p13n", z2Var.f36210y);
        int i14 = z2Var.f36188a;
        mq0.I(bundle, "d_imp_hdr", 1, i14 >= 2 && z2Var.f36194h);
        String str = z2Var.f36195i;
        mq0.v(bundle, "ppid", str, i14 >= 2 && !TextUtils.isEmpty(str));
        Location location = z2Var.f36196k;
        if (location != null) {
            float accuracy = location.getAccuracy() * 1000.0f;
            long time = location.getTime() * 1000;
            double latitude = location.getLatitude() * 1.0E7d;
            double longitude = 1.0E7d * location.getLongitude();
            Bundle bundle3 = new Bundle();
            bundle3.putFloat("radius", accuracy);
            bundle3.putLong("lat", (long) latitude);
            bundle3.putLong("long", (long) longitude);
            bundle3.putLong("time", time);
            bundle.putBundle("uule", bundle3);
        }
        mq0.V("url", z2Var.f36197l, bundle);
        mq0.a0(bundle, "neighboring_content_urls", z2Var.f36207v);
        Bundle bundle4 = z2Var.f36199n;
        if (bundle4 != null) {
            bundle.putBundle("custom_targeting", bundle4);
        }
        mq0.a0(bundle, "category_exclusions", z2Var.f36200o);
        mq0.V("request_agent", z2Var.f36201p, bundle);
        mq0.V("request_pkg", z2Var.f36202q, bundle);
        mq0.M(bundle, "is_designed_for_families", z2Var.f36203r, i14 >= 7);
        if (i14 >= 8) {
            int i15 = z2Var.f36205t;
            mq0.I(bundle, "tag_for_under_age_of_consent", i15, i15 != -1);
            mq0.V("max_ad_content_rating", z2Var.f36206u, bundle);
        }
        Bundle bundle5 = hq0Var.f11945e;
        bundle.putInt("plcs", bundle5.getInt("plcs"));
        bundle.putInt("plbs", bundle5.getInt("plbs"));
        mq0.V("plid", bundle5.getString("plid"), bundle);
        mq0.I(bundle, "s2s_rr", 1, hq0Var.f11960v && !(z2Var.f36204s == null && z2Var.f36209x == null));
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final void h(Object obj) {
        Bundle bundle = ((t50) obj).f16706b;
        hq0 hq0Var = this.f13190a;
        bundle.putString("slotname", hq0Var.g);
        va.z2 z2Var = hq0Var.f11944d;
        if (z2Var.f36193f) {
            bundle.putBoolean("test_request", true);
        }
        int i4 = z2Var.g;
        mq0.I(bundle, "tag_for_child_directed_treatment", i4, i4 != -1);
        if (z2Var.f36188a >= 8) {
            int i10 = z2Var.f36205t;
            mq0.I(bundle, "tag_for_under_age_of_consent", i10, i10 != -1);
        }
        mq0.V("url", z2Var.f36197l, bundle);
        mq0.a0(bundle, "neighboring_content_urls", z2Var.f36207v);
        Bundle bundle2 = z2Var.f36190c;
        Bundle bundle3 = (Bundle) bundle2.clone();
        HashSet hashSet = new HashSet(Arrays.asList(((String) va.s.f36163e.f36166c.a(sk.f16307r8)).split(",", -1)));
        for (String str : bundle2.keySet()) {
            if (!hashSet.contains(str)) {
                bundle3.remove(str);
            }
        }
        if (bundle3 != null) {
            bundle.putBundle("extras", bundle3);
        }
    }
}
