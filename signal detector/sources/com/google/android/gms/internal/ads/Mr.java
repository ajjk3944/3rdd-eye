package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import q2.C2841s;

/* loaded from: classes.dex */
public final class Mr implements Ls {

    /* renamed from: a, reason: collision with root package name */
    public final C0960bu f9916a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9917b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9918c;

    public Mr(C0960bu c0960bu, long j6, long j7) {
        this.f9916a = c0960bu;
        this.f9917b = j6;
        this.f9918c = j7;
    }

    @Override // com.google.android.gms.internal.ads.Ls
    public final void b(Object obj) {
        Bundle bundle = ((C0797Wj) obj).f12308a;
        C0960bu c0960bu = this.f9916a;
        q2.a1 a1Var = c0960bu.f13482d;
        int i = a1Var.f23160K;
        Bundle bundle2 = a1Var.f23167c;
        bundle.putInt("http_timeout_millis", i);
        bundle.putString("slotname", c0960bu.f13485g);
        int i3 = c0960bu.f13493p.f3830b;
        if (i3 == 0) {
            throw null;
        }
        int i6 = i3 - 1;
        if (i6 == 1) {
            bundle.putBoolean("is_new_rewarded", true);
        } else if (i6 == 2) {
            bundle.putBoolean("is_rewarded_interstitial", true);
        }
        long j6 = this.f9917b;
        bundle.putLong("start_signals_timestamp", j6);
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.Ke)).booleanValue()) {
            bundle.putLong("tsi", j6 - this.f9918c);
        }
        AbstractC0582Jp.N(bundle, "is_sdk_preload", true, bundle2.getBoolean("is_sdk_preload", false));
        AbstractC0582Jp.v(bundle, "prefetch_type", "zenith_v2", bundle2.getBoolean("zenith_v2", false));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.US);
        long j7 = a1Var.f23166b;
        AbstractC0582Jp.v(bundle, "cust_age", simpleDateFormat.format(new Date(j7)), j7 != -1);
        if (bundle2 != null) {
            bundle.putBundle("extras", bundle2);
        }
        int i7 = a1Var.f23168d;
        AbstractC0582Jp.J(bundle, "cust_gender", i7, i7 != -1);
        AbstractC0582Jp.d0(bundle, "kw", a1Var.f23169e);
        int i8 = a1Var.f23171g;
        AbstractC0582Jp.J(bundle, "tag_for_child_directed_treatment", i8, i8 != -1);
        if (a1Var.f23170f) {
            bundle.putBoolean("test_request", true);
        }
        bundle.putInt("ppt_p13n", a1Var.M);
        int i9 = a1Var.f23165a;
        AbstractC0582Jp.J(bundle, "d_imp_hdr", 1, i9 >= 2 && a1Var.f23172h);
        String str = a1Var.i;
        AbstractC0582Jp.v(bundle, "ppid", str, i9 >= 2 && !TextUtils.isEmpty(str));
        Location location = a1Var.f23174k;
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
        AbstractC0582Jp.X("url", bundle, a1Var.f23175l);
        AbstractC0582Jp.d0(bundle, "neighboring_content_urls", a1Var.f23159J);
        Bundle bundle4 = a1Var.f23177n;
        if (bundle4 != null) {
            bundle.putBundle("custom_targeting", bundle4);
        }
        AbstractC0582Jp.d0(bundle, "category_exclusions", a1Var.f23152C);
        AbstractC0582Jp.X("request_agent", bundle, a1Var.f23153D);
        AbstractC0582Jp.X("request_pkg", bundle, a1Var.f23154E);
        AbstractC0582Jp.N(bundle, "is_designed_for_families", a1Var.f23155F, i9 >= 7);
        if (i9 >= 8) {
            int i10 = a1Var.f23157H;
            AbstractC0582Jp.J(bundle, "tag_for_under_age_of_consent", i10, i10 != -1);
            AbstractC0582Jp.X("max_ad_content_rating", bundle, a1Var.f23158I);
        }
        Bundle bundle5 = c0960bu.f13483e;
        bundle.putInt("plcs", bundle5.getInt("plcs"));
        bundle.putInt("plbs", bundle5.getInt("plbs"));
        AbstractC0582Jp.X("plid", bundle, bundle5.getString("plid"));
        AbstractC0582Jp.J(bundle, "s2s_rr", 1, c0960bu.f13499v && !(a1Var.f23156G == null && a1Var.f23161L == null));
    }

    @Override // com.google.android.gms.internal.ads.Ls
    public final void d(Object obj) {
        Bundle bundle = ((C0797Wj) obj).f12309b;
        C0960bu c0960bu = this.f9916a;
        bundle.putString("slotname", c0960bu.f13485g);
        q2.a1 a1Var = c0960bu.f13482d;
        if (a1Var.f23170f) {
            bundle.putBoolean("test_request", true);
        }
        int i = a1Var.f23171g;
        AbstractC0582Jp.J(bundle, "tag_for_child_directed_treatment", i, i != -1);
        if (a1Var.f23165a >= 8) {
            int i3 = a1Var.f23157H;
            AbstractC0582Jp.J(bundle, "tag_for_under_age_of_consent", i3, i3 != -1);
        }
        AbstractC0582Jp.X("url", bundle, a1Var.f23175l);
        AbstractC0582Jp.d0(bundle, "neighboring_content_urls", a1Var.f23159J);
        Bundle bundle2 = a1Var.f23167c;
        Bundle bundle3 = (Bundle) bundle2.clone();
        HashSet hashSet = new HashSet(Arrays.asList(((String) C2841s.f23267e.f23270c.a(H9.r8)).split(",", -1)));
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
