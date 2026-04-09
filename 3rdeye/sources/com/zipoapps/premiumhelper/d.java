package com.zipoapps.premiumhelper;

import E.u;
import android.app.Application;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import b9.C1992A;
import c9.C2097r;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.zipoapps.premiumhelper.configuration.appconfig.PremiumHelperConfiguration;
import com.zipoapps.premiumhelper.e;
import com.zipoapps.premiumhelper.performance.StartupPerformanceTracker;
import com.zipoapps.premiumhelper.ui.splash.WarmSplashActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.l;
import t4.C5606d;

/* compiled from: PremiumApplication.kt */
/* loaded from: classes3.dex */
public abstract class d extends Application {
    @Override // android.app.Application
    public void onCreate() throws Resources.NotFoundException, ClassNotFoundException {
        Class<?> cls;
        Class cls2;
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        super.onCreate();
        e.a aVar = e.f37006D;
        HashMap map = new HashMap();
        String str = i8.d.f38558f0.f43924a;
        String string = getString(R.string.support_email);
        l.e(string, "getString(...)");
        C5606d.A(map, str, string);
        String str2 = i8.d.f38560g0.f43924a;
        String string2 = getString(R.string.support_vip_email);
        l.e(string2, "getString(...)");
        C5606d.A(map, str2, string2);
        String str3 = i8.d.f38525E.f43924a;
        String string3 = getString(R.string.main_sku);
        l.e(string3, "getString(...)");
        C5606d.A(map, str3, string3);
        String str4 = i8.d.f38528H.f43924a;
        String string4 = getString(R.string.onetime_offer_sku);
        l.e(string4, "getString(...)");
        C5606d.A(map, str4, string4);
        String str5 = i8.d.f38529I.f43924a;
        String string5 = getString(R.string.onetime_offer_strikethrough_sku);
        l.e(string5, "getString(...)");
        C5606d.A(map, str5, string5);
        String str6 = i8.d.f38532L.f43924a;
        String string6 = getString(R.string.premium_packages);
        l.e(string6, "getString(...)");
        C5606d.A(map, str6, string6);
        map.put(i8.d.f38551c.f43924a, getString(R.string.ad_unit_admob_banner));
        map.put(i8.d.f38553d.f43924a, getString(R.string.ad_unit_admob_interstitial));
        map.put(i8.d.f38555e.f43924a, getString(R.string.ad_unit_admob_native));
        map.put(i8.d.f38557f.f43924a, getString(R.string.ad_unit_admob_rewarded));
        map.put(i8.d.f38559g.f43924a, getString(R.string.ad_unit_applovin_banner));
        map.put(i8.d.i.f43924a, getString(R.string.ad_unit_applovin_mrec_banner));
        map.put(i8.d.f38561h.f43924a, getString(R.string.ad_unit_applovin_interstitial));
        map.put(i8.d.f38564j.f43924a, getString(R.string.ad_unit_applovin_native));
        map.put(i8.d.f38566k.f43924a, getString(R.string.ad_unit_applovin_rewarded));
        map.put(i8.d.f38546Z.f43924a, u.z(this, R.bool.show_interstitial_onboarding_basic));
        map.put(i8.d.f38550b0.f43924a, u.z(this, R.bool.show_relaunch_on_resume));
        map.put(i8.d.f38524D.f43924a, u.z(this, R.bool.in_app_updates_enabled));
        map.put(i8.d.f38552c0.f43924a, u.z(this, R.bool.show_trial_on_cta));
        map.put(i8.d.f38567k0.f43924a, u.z(this, R.bool.toto_enabled));
        map.put(i8.d.f38533M.f43924a, u.z(this, R.bool.prevent_ad_fraud));
        map.put(i8.d.f38522B.f43924a, u.z(this, R.bool.interstitial_muted));
        map.put(i8.d.f38563i0.f43924a, u.z(this, R.bool.totolytics_enabled));
        map.put(i8.d.f38569l0.f43924a, u.z(this, R.bool.wait_first_interstitial_on_ad_fraud));
        map.put(i8.d.f38554d0.f43924a, u.z(this, R.bool.singular_enabled));
        map.put(i8.d.f38562h0.f43924a, getString(R.string.terms_url));
        map.put(i8.d.f38535O.f43924a, getString(R.string.privacy_url));
        map.put(i8.d.f38547a.f43924a, getString(R.string.ads_provider));
        map.put(i8.d.f38578t.f43924a, getString(R.string.happy_moment));
        map.put(i8.d.f38568l.f43924a, getString(R.string.analytics_prefix));
        map.put(i8.d.f38530J.f43924a, u.B(this, R.integer.onetime_start_session));
        map.put(i8.d.f38544X.f43924a, u.B(this, R.integer.session_timeout_seconds));
        map.put(i8.d.f38543W.f43924a, u.B(this, R.integer.session_app_open_capping_minutes));
        map.put(i8.d.f38534N.f43924a, u.B(this, R.integer.prevent_ad_fraud_timeout_seconds));
        map.put(i8.d.f38542V.f43924a, u.z(this, R.bool.send_performance_events));
        map.put(i8.d.f38574p.f43924a, u.z(this, R.bool.consent_request_enabled));
        map.put(i8.d.f38573o.f43924a, u.z(this, R.bool.banner_cache_enabled));
        map.put(i8.d.f38570m.f43924a, u.z(this, R.bool.auto_interstitials_enabled));
        map.put(i8.d.f38556e0.f43924a, u.z(this, R.bool.staging_toto_enabled));
        map.put(i8.d.f38579u.f43924a, u.B(this, R.integer.happy_moment_capping_seconds));
        map.put(i8.d.f38580v.f43924a, getString(R.string.happy_moment_capping_type));
        map.put(i8.d.f38581w.f43924a, u.B(this, R.integer.happy_moment_skip_first));
        map.put(i8.d.f38584z.f43924a, u.B(this, R.integer.interstitial_capping_seconds));
        map.put(i8.d.f38523C.f43924a, u.B(this, R.integer.interstitial_on_action_capping_seconds));
        map.put(i8.d.f38521A.f43924a, getString(R.string.interstitial_capping_type));
        map.put(i8.d.f38582x.f43924a, u.B(this, R.integer.ignore_relaunch_capping_seconds));
        map.put(i8.d.f38565j0.f43924a, u.B(this, R.integer.toto_capping_hours));
        map.put(i8.d.f38577s.f43924a, u.z(this, R.bool.disable_relaunch_premium_offering));
        map.put(i8.d.f38575q.f43924a, u.z(this, R.bool.disable_onboarding_premium_offering));
        map.put(i8.d.f38576r.f43924a, u.z(this, R.bool.disable_premium_offering));
        map.put(i8.d.f38527G.f43924a, u.B(this, R.integer.onboarding_layout_variant));
        map.put(i8.d.f38540T.f43924a, u.B(this, R.integer.relaunch_layout_variant));
        map.put(i8.d.f38541U.f43924a, u.B(this, R.integer.relaunch_onetime_layout_variant));
        map.put(i8.d.f38539S.f43924a, u.B(this, R.integer.relaunch_impressions_count));
        map.put(i8.d.f38545Y.f43924a, u.z(this, R.bool.show_contact_support_dialog));
        map.put(i8.d.f38526F.f43924a, u.B(this, R.integer.max_update_requests));
        map.put(i8.d.f38538R.f43924a, getString(R.string.rate_us_type));
        String str7 = i8.d.f38537Q.f43924a;
        String string7 = getString(R.string.rate_us_mode);
        l.e(string7, "getString(...)");
        C5606d.A(map, str7, string7);
        C5606d.A(map, i8.d.f38536P.f43924a, u.B(this, R.integer.rateus_session_start));
        int[] iArr = new int[0];
        int[] iArr2 = new int[0];
        int[] iArr3 = new int[0];
        z8.e eVar = new z8.e(R.color.ph_rate_bar_button_color, Integer.valueOf(R.color.ph_rate_bar_disabled_button_color), Integer.valueOf(R.color.ph_rate_bar_pressed_button_color), Integer.valueOf(R.color.ph_rate_bar_background_color), Integer.valueOf(R.color.ph_rate_bar_text_color), Integer.valueOf(R.color.ph_rate_bar_button_text_color));
        Bundle bundle = new Bundle();
        String string8 = getString(R.string.ph_debug_consent_device_id);
        l.e(string8, "getString(...)");
        if (string8.length() > 0) {
            bundle.putString("consent_device_id", string8);
        }
        TypedArray typedArrayObtainTypedArray = getResources().obtainTypedArray(R.array.ph_applovin_test_advertising_ids);
        l.e(typedArrayObtainTypedArray, "obtainTypedArray(...)");
        ArrayList arrayList = new ArrayList();
        int length = typedArrayObtainTypedArray.length();
        for (int i = 0; i < length; i++) {
            arrayList.add(typedArrayObtainTypedArray.getString(i));
        }
        typedArrayObtainTypedArray.recycle();
        bundle.putStringArray("test_advertising_ids", (String[]) C2097r.n0(arrayList).toArray(new String[0]));
        List<ResolveInfo> listQueryIntentActivities = getPackageManager().queryIntentActivities(new Intent(PremiumHelperConfiguration.INTENT_FILTER_INTRO).setPackage(getPackageName()), 65536);
        l.e(listQueryIntentActivities, "queryIntentActivities(...)");
        if (listQueryIntentActivities.size() == 0) {
            cls = null;
        } else {
            if (listQueryIntentActivities.size() > 1) {
                throw new IllegalStateException("PremiumHelper: Please configure only one activity class with filter action <com.premiumhelper.INTRO_ACTIVITY>");
            }
            cls = Class.forName(((ResolveInfo) C2097r.p0(listQueryIntentActivities)).activityInfo.name);
        }
        List<ResolveInfo> listQueryIntentActivities2 = getPackageManager().queryIntentActivities(new Intent(PremiumHelperConfiguration.INTENT_FILTER_MAIN).setPackage(getPackageName()), 65536);
        l.e(listQueryIntentActivities2, "queryIntentActivities(...)");
        if (listQueryIntentActivities2.size() != 1) {
            throw new IllegalStateException("PremiumHelper: Please configure only one activity class with filter action <com.premiumhelper.MAIN_ACTIVITY>");
        }
        Class<?> cls3 = Class.forName(((ResolveInfo) C2097r.p0(listQueryIntentActivities2)).activityInfo.name);
        List<ResolveInfo> listQueryIntentActivities3 = getPackageManager().queryIntentActivities(new Intent(PremiumHelperConfiguration.INTENT_FILTER_WARM_SPLASH).setPackage(getPackageName()), 65536);
        l.e(listQueryIntentActivities3, "queryIntentActivities(...)");
        if (listQueryIntentActivities3.size() == 0) {
            cls2 = WarmSplashActivity.class;
        } else {
            if (listQueryIntentActivities3.size() > 1) {
                throw new IllegalStateException("PremiumHelper: Please configure only one activity class with filter action <com.premiumhelper.WARM_SPLASH_ACTIVITY>");
            }
            cls2 = Class.forName(((ResolveInfo) C2097r.p0(listQueryIntentActivities3)).activityInfo.name);
        }
        CharSequence charSequence4 = (CharSequence) map.get(i8.d.f38525E.f43924a);
        if (charSequence4 == null || charSequence4.length() == 0) {
            throw new IllegalArgumentException("PremiumHelper: Please configure default name for main offer SKU.");
        }
        l8.d<String> dVar = i8.d.f38528H;
        String str8 = (String) map.get(dVar.f43924a);
        if (str8 == null || str8.length() != 0) {
            l8.d<String> dVar2 = i8.d.f38529I;
            String str9 = (String) map.get(dVar2.f43924a);
            if (str9 == null || str9.length() != 0) {
                String str10 = (String) map.get(dVar.f43924a);
                if (str10 != null && str10.length() > 0 && ((charSequence3 = (CharSequence) map.get(dVar2.f43924a)) == null || charSequence3.length() == 0)) {
                    throw new IllegalArgumentException("PremiumHelper: You must configure both ONE_TIME and ONETIME_OFFER_STRIKETHROUGH sku to show one-time relaunch view.");
                }
                CharSequence charSequence5 = (CharSequence) map.get(i8.d.f38551c.f43924a);
                if ((charSequence5 == null || charSequence5.length() == 0) && ((charSequence = (CharSequence) map.get(i8.d.f38553d.f43924a)) == null || charSequence.length() == 0)) {
                    throw new IllegalArgumentException("Please provide ads configuration.");
                }
                CharSequence charSequence6 = (CharSequence) map.get(i8.d.f38562h0.f43924a);
                if (charSequence6 == null || charSequence6.length() == 0) {
                    throw new IllegalArgumentException("PremiumHelper: You must configure Terms and Conditions url");
                }
                CharSequence charSequence7 = (CharSequence) map.get(i8.d.f38535O.f43924a);
                if (charSequence7 == null || charSequence7.length() == 0) {
                    throw new IllegalArgumentException("PremiumHelper: You must configure Privacy url");
                }
                CharSequence charSequence8 = (CharSequence) map.get(i8.d.f38538R.f43924a);
                if (charSequence8 == null || charSequence8.length() == 0) {
                    throw new IllegalArgumentException("PremiumHelper: RateDialog is not configured");
                }
                if (l.b(map.get(i8.d.f38547a.f43924a), "APPLOVIN") && ((charSequence2 = (CharSequence) map.get(i8.d.i.f43924a)) == null || charSequence2.length() == 0)) {
                    throw new IllegalArgumentException("PremiumHelper: AppLovin MREC unit ID is not defined");
                }
                boolean z10 = false;
                PremiumHelperConfiguration premiumHelperConfiguration = new PremiumHelperConfiguration(cls3, cls, cls2, null, iArr, iArr2, iArr3, z10, z10, eVar, bundle, map, null);
                aVar.getClass();
                if (e.f37008F != null) {
                    return;
                }
                synchronized (aVar) {
                    try {
                        if (e.f37008F == null) {
                            StartupPerformanceTracker.f37057b.getClass();
                            StartupPerformanceTracker.StartupData startupData = StartupPerformanceTracker.a.a().f37059a;
                            if (startupData != null) {
                                startupData.setPhStartTimestamp(System.currentTimeMillis());
                            }
                            e eVar2 = new e(this, premiumHelperConfiguration);
                            e.f37008F = eVar2;
                            e.d(eVar2);
                        }
                        C1992A c1992a = C1992A.f18074a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            }
        }
        throw new IllegalArgumentException("PremiumHelper: ONE_TIME and ONETIME_OFFER_STRIKETHROUGH cannot be empty");
    }
}
