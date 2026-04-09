package defpackage;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class h33 implements n53 {
    public final l83 a;
    public final long b;

    public h33(l83 l83Var, long j) {
        this.a = l83Var;
        this.b = j;
    }

    @Override // defpackage.n53
    public final void c(Object obj) {
        Bundle bundle = ((jm2) obj).a;
        l83 l83Var = this.a;
        pc4 pc4Var = l83Var.d;
        int i = pc4Var.B;
        Bundle bundle2 = pc4Var.h;
        bundle.putInt("http_timeout_millis", i);
        bundle.putString("slotname", l83Var.g);
        int i2 = l83Var.p.g;
        if (i2 == 0) {
            throw null;
        }
        int i3 = i2 - 1;
        if (i3 == 1) {
            bundle.putBoolean("is_new_rewarded", true);
        } else if (i3 == 2) {
            bundle.putBoolean("is_rewarded_interstitial", true);
        }
        bundle.putLong("start_signals_timestamp", this.b);
        i30.n0(bundle, "is_sdk_preload", true, bundle2.getBoolean("is_sdk_preload", false));
        i30.h0(bundle, "prefetch_type", "zenith_v2", bundle2.getBoolean("zenith_v2", false));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.US);
        long j = pc4Var.g;
        i30.h0(bundle, "cust_age", simpleDateFormat.format(new Date(j)), j != -1);
        if (bundle2 != null) {
            bundle.putBundle("extras", bundle2);
        }
        int i4 = pc4Var.i;
        i30.j0(bundle, "cust_gender", i4, i4 != -1);
        i30.r0(bundle, "kw", pc4Var.j);
        int i5 = pc4Var.l;
        i30.j0(bundle, "tag_for_child_directed_treatment", i5, i5 != -1);
        if (pc4Var.k) {
            bundle.putBoolean("test_request", true);
        }
        bundle.putInt("ppt_p13n", pc4Var.D);
        int i6 = pc4Var.f;
        i30.j0(bundle, "d_imp_hdr", 1, i6 >= 2 && pc4Var.m);
        String str = pc4Var.n;
        i30.h0(bundle, "ppid", str, i6 >= 2 && !TextUtils.isEmpty(str));
        Location location = pc4Var.p;
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
        i30.p0("url", bundle, pc4Var.q);
        i30.r0(bundle, "neighboring_content_urls", pc4Var.A);
        Bundle bundle4 = pc4Var.s;
        if (bundle4 != null) {
            bundle.putBundle("custom_targeting", bundle4);
        }
        i30.r0(bundle, "category_exclusions", pc4Var.t);
        i30.p0("request_agent", bundle, pc4Var.u);
        i30.p0("request_pkg", bundle, pc4Var.v);
        i30.n0(bundle, "is_designed_for_families", pc4Var.w, i6 >= 7);
        if (i6 >= 8) {
            int i7 = pc4Var.y;
            i30.j0(bundle, "tag_for_under_age_of_consent", i7, i7 != -1);
            i30.p0("max_ad_content_rating", bundle, pc4Var.z);
        }
        Bundle bundle5 = l83Var.e;
        bundle.putInt("plcs", bundle5.getInt("plcs"));
        bundle.putInt("plbs", bundle5.getInt("plbs"));
        i30.p0("plid", bundle, bundle5.getString("plid"));
    }

    @Override // defpackage.n53
    public final void p(Object obj) {
        Bundle bundle = ((jm2) obj).b;
        l83 l83Var = this.a;
        bundle.putString("slotname", l83Var.g);
        pc4 pc4Var = l83Var.d;
        if (pc4Var.k) {
            bundle.putBoolean("test_request", true);
        }
        int i = pc4Var.l;
        i30.j0(bundle, "tag_for_child_directed_treatment", i, i != -1);
        if (pc4Var.f >= 8) {
            int i2 = pc4Var.y;
            i30.j0(bundle, "tag_for_under_age_of_consent", i2, i2 != -1);
        }
        i30.p0("url", bundle, pc4Var.q);
        i30.r0(bundle, "neighboring_content_urls", pc4Var.A);
        Bundle bundle2 = pc4Var.h;
        Bundle bundle3 = (Bundle) bundle2.clone();
        HashSet hashSet = new HashSet(Arrays.asList(((String) tw1.e.c.a(mz1.W7)).split(",", -1)));
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
