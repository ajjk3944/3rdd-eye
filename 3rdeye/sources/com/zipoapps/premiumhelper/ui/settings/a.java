package com.zipoapps.premiumhelper.ui.settings;

import A9.I;
import B.d;
import C.e0;
import D0.a;
import N7.C1154e9;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import androidx.preference.b;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.zipoapps.premiumhelper.e;
import com.zipoapps.premiumhelper.ui.preferences.common.AppVersionPreference;
import com.zipoapps.premiumhelper.ui.preferences.common.PersonalizedAdsPreference;
import com.zipoapps.premiumhelper.ui.preferences.common.PremiumSupportPreference;
import com.zipoapps.premiumhelper.ui.preferences.common.PrivacyPolicyPreference;
import com.zipoapps.premiumhelper.ui.preferences.common.RateUsPreference;
import com.zipoapps.premiumhelper.ui.preferences.common.RemoveAdsPreference;
import com.zipoapps.premiumhelper.ui.preferences.common.SafeClickPreference;
import com.zipoapps.premiumhelper.ui.preferences.common.TermsConditionsPreference;
import com.zipoapps.premiumhelper.ui.settings.b;
import com.zipoapps.premiumhelper.ui.settings.delete_account.PhDeleteAccountActivity;
import e.AbstractC4292c;
import kotlin.jvm.internal.l;
import n1.e;
import n1.f;

/* compiled from: PhSettingsFragment.kt */
/* loaded from: classes3.dex */
public class a extends androidx.preference.b {

    /* renamed from: j, reason: collision with root package name */
    public b f37124j;

    /* renamed from: k, reason: collision with root package name */
    public final PhDeleteAccountActivity.b f37125k;

    public a() {
        int i = PhDeleteAccountActivity.f37155f;
        AbstractC4292c abstractC4292cRegisterForActivityResult = registerForActivityResult(new PhDeleteAccountActivity.a(), new d(new B8.c(this, 0), 2));
        l.e(abstractC4292cRegisterForActivityResult, "registerForActivityResult(...)");
        this.f37125k = new PhDeleteAccountActivity.b(abstractC4292cRegisterForActivityResult);
    }

    @Override // androidx.preference.b
    public final void c(String str) throws Resources.NotFoundException {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        String string7;
        String string8;
        String string9;
        String string10;
        String string11;
        String string12;
        String string13;
        String string14;
        String string15;
        String string16;
        String string17;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        Integer num6;
        Integer num7;
        Integer num8;
        Integer num9;
        TypedValue typedValue = new TypedValue();
        requireContext().getTheme().resolveAttribute(R.attr.settingsTheme, typedValue, true);
        Resources.Theme themeNewTheme = getResources().newTheme();
        themeNewTheme.applyStyle(typedValue.resourceId, true);
        TypedValue typedValue2 = new TypedValue();
        themeNewTheme.resolveAttribute(R.attr.settingsSectionTheme, typedValue2, true);
        int i = typedValue2.resourceId;
        if (i == 0) {
            i = R.style.PhSettingsSectionTheme;
        }
        requireContext().getTheme().applyStyle(i, false);
        this.f37124j = b.C0432b.a(getArguments());
        f fVar = this.f16321c;
        if (fVar == null) {
            throw new RuntimeException("This should be called after super.onCreate.");
        }
        Context contextRequireContext = requireContext();
        fVar.f44219e = true;
        e eVar = new e(contextRequireContext, fVar);
        XmlResourceParser xml = contextRequireContext.getResources().getXml(R.xml.ph_settings);
        try {
            PreferenceGroup preferenceGroupC = eVar.c(xml);
            xml.close();
            PreferenceScreen preferenceScreen = (PreferenceScreen) preferenceGroupC;
            preferenceScreen.k(fVar);
            SharedPreferences.Editor editor = fVar.f44218d;
            if (editor != null) {
                editor.apply();
            }
            fVar.f44219e = false;
            Preference preference = preferenceScreen;
            if (str != null) {
                Preference preferenceA = preferenceScreen.A(str);
                boolean z10 = preferenceA instanceof PreferenceScreen;
                preference = preferenceA;
                if (!z10) {
                    throw new IllegalArgumentException(C1154e9.i("Preference object with key ", str, " is not a PreferenceScreen"));
                }
            }
            PreferenceScreen preferenceScreen2 = (PreferenceScreen) preference;
            f fVar2 = this.f16321c;
            PreferenceScreen preferenceScreen3 = fVar2.f44221g;
            if (preferenceScreen2 != preferenceScreen3) {
                if (preferenceScreen3 != null) {
                    preferenceScreen3.n();
                }
                fVar2.f44221g = preferenceScreen2;
                if (preferenceScreen2 != null) {
                    this.f16323e = true;
                    if (this.f16324f) {
                        b.a aVar = this.f16326h;
                        if (!aVar.hasMessages(1)) {
                            aVar.obtainMessage(1).sendToTarget();
                        }
                    }
                }
            }
            b bVar = this.f37124j;
            int iIntValue = (bVar == null || (num9 = bVar.f37134g) == null) ? R.drawable.ph_ic_remove_ads : num9.intValue();
            b bVar2 = this.f37124j;
            if (bVar2 == null || (string = bVar2.f37132e) == null) {
                string = getString(R.string.ph_remove_ads);
                l.e(string, "getString(...)");
            }
            b bVar3 = this.f37124j;
            if (bVar3 == null || (string2 = bVar3.f37133f) == null) {
                string2 = getString(R.string.ph_remove_ads_summary);
                l.e(string2, "getString(...)");
            }
            SafeClickPreference safeClickPreference = (RemoveAdsPreference) a("pref_remove_ads");
            if (safeClickPreference != null) {
                safeClickPreference.f16239E = R.layout.ph_settings_section;
                safeClickPreference.w(string);
                safeClickPreference.v(string2);
                d(safeClickPreference, iIntValue);
            }
            b bVar4 = this.f37124j;
            int iIntValue2 = (bVar4 == null || (num8 = bVar4.f37136j) == null) ? R.drawable.ph_ic_consent : num8.intValue();
            b bVar5 = this.f37124j;
            if (bVar5 == null || (string3 = bVar5.f37135h) == null) {
                string3 = getString(R.string.ph_personalized_ads);
                l.e(string3, "getString(...)");
            }
            b bVar6 = this.f37124j;
            if (bVar6 == null || (string4 = bVar6.i) == null) {
                string4 = getString(R.string.ph_personalized_ads_summary);
                l.e(string4, "getString(...)");
            }
            SafeClickPreference safeClickPreference2 = (PersonalizedAdsPreference) a("pref_personalized_ads");
            if (safeClickPreference2 != null) {
                safeClickPreference2.f16239E = R.layout.ph_settings_section;
                safeClickPreference2.w(string3);
                safeClickPreference2.v(string4);
                d(safeClickPreference2, iIntValue2);
            }
            b bVar7 = this.f37124j;
            if (bVar7 == null || (string5 = bVar7.f37128a) == null) {
                string5 = getString(R.string.ph_customer_support);
                l.e(string5, "getString(...)");
            }
            b bVar8 = this.f37124j;
            if (bVar8 == null || (string6 = bVar8.f37129b) == null) {
                string6 = getString(R.string.ph_vip_customer_support);
                l.e(string6, "getString(...)");
            }
            b bVar9 = this.f37124j;
            if (bVar9 == null || (string7 = bVar9.f37130c) == null) {
                string7 = getString(R.string.ph_customer_support_summary);
                l.e(string7, "getString(...)");
            }
            b bVar10 = this.f37124j;
            int iIntValue3 = (bVar10 == null || (num7 = bVar10.f37131d) == null) ? R.drawable.ph_ic_customer_support : num7.intValue();
            PremiumSupportPreference premiumSupportPreference = (PremiumSupportPreference) a("pref_support");
            if (premiumSupportPreference != null) {
                com.zipoapps.premiumhelper.e.f37006D.getClass();
                com.zipoapps.premiumhelper.e eVarA = e.a.a();
                l8.d<String> PH_SUPPORT_EMAIL = i8.d.f38558f0;
                l.e(PH_SUPPORT_EMAIL, "PH_SUPPORT_EMAIL");
                Object objH = eVarA.f37020j.h(PH_SUPPORT_EMAIL);
                l.e(objH, "get(...)");
                com.zipoapps.premiumhelper.e eVarA2 = e.a.a();
                l8.d<String> PH_SUPPORT_VIP_EMAIL = i8.d.f38560g0;
                l.e(PH_SUPPORT_VIP_EMAIL, "PH_SUPPORT_VIP_EMAIL");
                Object objH2 = eVarA2.f37020j.h(PH_SUPPORT_VIP_EMAIL);
                l.e(objH2, "get(...)");
                premiumSupportPreference.f37078Q = (String) objH;
                premiumSupportPreference.f37079R = (String) objH2;
                premiumSupportPreference.C(string5, string6);
                premiumSupportPreference.v(string7);
                d(premiumSupportPreference, iIntValue3);
            }
            b bVar11 = this.f37124j;
            if (bVar11 == null || (string8 = bVar11.f37137k) == null) {
                string8 = getString(R.string.ph_rate_us);
                l.e(string8, "getString(...)");
            }
            b bVar12 = this.f37124j;
            if (bVar12 == null || (string9 = bVar12.f37138l) == null) {
                string9 = getString(R.string.ph_rate_us_summary);
                l.e(string9, "getString(...)");
            }
            b bVar13 = this.f37124j;
            int iIntValue4 = (bVar13 == null || (num6 = bVar13.f37131d) == null) ? R.drawable.ph_ic_rate_us : num6.intValue();
            SafeClickPreference safeClickPreference3 = (RateUsPreference) a("pref_rate_us");
            if (safeClickPreference3 != null) {
                safeClickPreference3.w(string8);
                safeClickPreference3.v(string9);
                d(safeClickPreference3, iIntValue4);
            }
            b bVar14 = this.f37124j;
            if (bVar14 == null || (string10 = bVar14.f37140n) == null) {
                string10 = getString(R.string.ph_share_app);
                l.e(string10, "getString(...)");
            }
            b bVar15 = this.f37124j;
            if (bVar15 == null || (string11 = bVar15.f37141o) == null) {
                string11 = getString(R.string.ph_share_app_summary);
                l.e(string11, "getString(...)");
            }
            b bVar16 = this.f37124j;
            int iIntValue5 = (bVar16 == null || (num5 = bVar16.f37142p) == null) ? R.drawable.ph_ic_share : num5.intValue();
            SafeClickPreference safeClickPreference4 = (SafeClickPreference) a("pref_share_app");
            if (safeClickPreference4 != null) {
                safeClickPreference4.w(string10);
                safeClickPreference4.v(string11);
                d(safeClickPreference4, iIntValue5);
                safeClickPreference4.f16252f = new e0(20, safeClickPreference4, new B.f(this, 1));
            }
            b bVar17 = this.f37124j;
            if (bVar17 == null || (string12 = bVar17.f37143q) == null) {
                string12 = getString(R.string.ph_privacy_policy);
                l.e(string12, "getString(...)");
            }
            b bVar18 = this.f37124j;
            if (bVar18 == null || (string13 = bVar18.f37144r) == null) {
                string13 = getString(R.string.ph_privacy_policy_summary);
                l.e(string13, "getString(...)");
            }
            b bVar19 = this.f37124j;
            int iIntValue6 = (bVar19 == null || (num4 = bVar19.f37145s) == null) ? R.drawable.ph_ic_privacy_policy : num4.intValue();
            SafeClickPreference safeClickPreference5 = (PrivacyPolicyPreference) a("pref_privacy_policy");
            if (safeClickPreference5 != null) {
                safeClickPreference5.w(string12);
                safeClickPreference5.v(string13);
                d(safeClickPreference5, iIntValue6);
            }
            b bVar20 = this.f37124j;
            if (bVar20 == null || (string14 = bVar20.f37146t) == null) {
                string14 = getString(R.string.ph_terms);
                l.e(string14, "getString(...)");
            }
            b bVar21 = this.f37124j;
            if (bVar21 == null || (string15 = bVar21.f37147u) == null) {
                string15 = getString(R.string.ph_terms_summary);
                l.e(string15, "getString(...)");
            }
            b bVar22 = this.f37124j;
            int iIntValue7 = (bVar22 == null || (num3 = bVar22.f37148v) == null) ? R.drawable.ph_ic_terms : num3.intValue();
            SafeClickPreference safeClickPreference6 = (TermsConditionsPreference) a("pref_terms");
            if (safeClickPreference6 != null) {
                safeClickPreference6.w(string14);
                safeClickPreference6.v(string15);
                d(safeClickPreference6, iIntValue7);
            }
            b bVar23 = this.f37124j;
            if (bVar23 == null || (string16 = bVar23.f37149w) == null) {
                string16 = getString(R.string.ph_delete_account);
                l.e(string16, "getString(...)");
            }
            b bVar24 = this.f37124j;
            if (bVar24 == null || (string17 = bVar24.f37150x) == null) {
                string17 = getString(R.string.ph_delete_account_summary);
                l.e(string17, "getString(...)");
            }
            b bVar25 = this.f37124j;
            int iIntValue8 = (bVar25 == null || (num2 = bVar25.f37151y) == null) ? R.drawable.ph_ic_delete_account : num2.intValue();
            SafeClickPreference safeClickPreference7 = (SafeClickPreference) a("pref_delete_account");
            if (safeClickPreference7 != null) {
                safeClickPreference7.w(string16);
                safeClickPreference7.v(string17);
                d(safeClickPreference7, iIntValue8);
                b bVar26 = this.f37124j;
                safeClickPreference7.x((bVar26 != null ? bVar26.f37127B : null) != null);
                safeClickPreference7.f16252f = new e0(20, safeClickPreference7, new d(this, 1));
            }
            b bVar27 = this.f37124j;
            int iIntValue9 = (bVar27 == null || (num = bVar27.f37152z) == null) ? R.drawable.ph_app_version : num.intValue();
            SafeClickPreference safeClickPreference8 = (AppVersionPreference) a("pref_app_version");
            if (safeClickPreference8 != null) {
                d(safeClickPreference8, iIntValue9);
                safeClickPreference8.f16252f = new e0(20, safeClickPreference8, new B8.b(this, 0));
            }
        } catch (Throwable th) {
            xml.close();
            throw th;
        }
    }

    public final void d(SafeClickPreference safeClickPreference, int i) {
        b bVar = this.f37124j;
        if (bVar != null && !bVar.f37126A) {
            if (safeClickPreference.f16236B) {
                safeClickPreference.f16236B = false;
                safeClickPreference.h();
            }
            if (safeClickPreference.f16256k != null) {
                safeClickPreference.f16256k = null;
                safeClickPreference.f16255j = 0;
                safeClickPreference.h();
                return;
            }
            return;
        }
        TypedValue typedValue = new TypedValue();
        requireContext().getTheme().resolveAttribute(R.attr.settingsSectionIconColor, typedValue, true);
        int i10 = typedValue.data;
        Context context = safeClickPreference.f16248b;
        Drawable drawableW = I.w(context, i);
        if (safeClickPreference.f16256k != drawableW) {
            safeClickPreference.f16256k = drawableW;
            safeClickPreference.f16255j = 0;
            safeClickPreference.h();
        }
        safeClickPreference.f16255j = i;
        if (safeClickPreference.f16256k == null && i != 0) {
            safeClickPreference.f16256k = I.w(context, i);
        }
        Drawable drawable = safeClickPreference.f16256k;
        if (drawable != null) {
            a.C0009a.g(drawable, i10);
        }
    }
}
