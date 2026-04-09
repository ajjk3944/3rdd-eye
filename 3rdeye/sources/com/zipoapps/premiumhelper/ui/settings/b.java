package com.zipoapps.premiumhelper.ui.settings;

import android.os.Bundle;

/* compiled from: Settings.kt */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: A, reason: collision with root package name */
    public final boolean f37126A;

    /* renamed from: B, reason: collision with root package name */
    public final String f37127B;

    /* renamed from: a, reason: collision with root package name */
    public final String f37128a;

    /* renamed from: b, reason: collision with root package name */
    public final String f37129b;

    /* renamed from: c, reason: collision with root package name */
    public final String f37130c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f37131d;

    /* renamed from: e, reason: collision with root package name */
    public final String f37132e;

    /* renamed from: f, reason: collision with root package name */
    public final String f37133f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f37134g;

    /* renamed from: h, reason: collision with root package name */
    public final String f37135h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final Integer f37136j;

    /* renamed from: k, reason: collision with root package name */
    public final String f37137k;

    /* renamed from: l, reason: collision with root package name */
    public final String f37138l;

    /* renamed from: m, reason: collision with root package name */
    public final Integer f37139m;

    /* renamed from: n, reason: collision with root package name */
    public final String f37140n;

    /* renamed from: o, reason: collision with root package name */
    public final String f37141o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f37142p;

    /* renamed from: q, reason: collision with root package name */
    public final String f37143q;

    /* renamed from: r, reason: collision with root package name */
    public final String f37144r;

    /* renamed from: s, reason: collision with root package name */
    public final Integer f37145s;

    /* renamed from: t, reason: collision with root package name */
    public final String f37146t;

    /* renamed from: u, reason: collision with root package name */
    public final String f37147u;

    /* renamed from: v, reason: collision with root package name */
    public final Integer f37148v;

    /* renamed from: w, reason: collision with root package name */
    public final String f37149w;

    /* renamed from: x, reason: collision with root package name */
    public final String f37150x;

    /* renamed from: y, reason: collision with root package name */
    public final Integer f37151y;

    /* renamed from: z, reason: collision with root package name */
    public final Integer f37152z;

    /* compiled from: Settings.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public String f37153a;
    }

    /* compiled from: Settings.kt */
    /* renamed from: com.zipoapps.premiumhelper.ui.settings.b$b, reason: collision with other inner class name */
    public static final class C0432b {
        public static b a(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            String string = bundle.getString("SETTINGS_CUSTOMER_SUPPORT_TITLE");
            String string2 = bundle.getString("SETTINGS_VIP_CUSTOMER_SUPPORT_TITLE");
            String string3 = bundle.getString("SETTINGS_CUSTOMER_SUPPORT_SUMMARY");
            int i = bundle.getInt("SETTINGS_CUSTOMER_SUPPORT_ICON");
            Integer numValueOf = i != 0 ? Integer.valueOf(i) : null;
            String string4 = bundle.getString("SETTINGS_REMOVE_ADS_TITLE");
            String string5 = bundle.getString("SETTINGS_REMOVE_ADS_SUMMARY");
            int i10 = bundle.getInt("SETTINGS_REMOVE_ADS_ICON");
            Integer numValueOf2 = i10 != 0 ? Integer.valueOf(i10) : null;
            String string6 = bundle.getString("SETTINGS_PERSONALIZED_ADS_TITLE");
            String string7 = bundle.getString("SETTINGS_PERSONALIZED_ADS_SUMMARY");
            int i11 = bundle.getInt("SETTINGS_PERSONALIZED_ADS_ICON");
            Integer numValueOf3 = i11 != 0 ? Integer.valueOf(i11) : null;
            String string8 = bundle.getString("SETTINGS_RATE_US_TITLE");
            String string9 = bundle.getString("SETTINGS_RATE_US_SUMMARY");
            int i12 = bundle.getInt("SETTINGS_RATE_US_ICON");
            Integer numValueOf4 = i12 != 0 ? Integer.valueOf(i12) : null;
            String string10 = bundle.getString("SETTINGS_SHARE_APP_TITLE");
            String string11 = bundle.getString("SETTINGS_SHARE_APP_SUMMARY");
            int i13 = bundle.getInt("SETTINGS_SHARE_APP_ICON");
            Integer numValueOf5 = i13 != 0 ? Integer.valueOf(i13) : null;
            String string12 = bundle.getString("SETTINGS_PRIVACY_POLICY_TITLE");
            String string13 = bundle.getString("SETTINGS_PRIVACY_POLICY_SUMMARY");
            int i14 = bundle.getInt("SETTINGS_PRIVACY_POLICY_ICON");
            Integer numValueOf6 = i14 != 0 ? Integer.valueOf(i14) : null;
            String string14 = bundle.getString("SETTINGS_TERMS_TITLE");
            String string15 = bundle.getString("SETTINGS_TERMS_SUMMARY");
            int i15 = bundle.getInt("SETTINGS_TERMS_ICON");
            Integer numValueOf7 = i15 != 0 ? Integer.valueOf(i15) : null;
            String string16 = bundle.getString("SETTINGS_DELETE_ACCOUNT_TITLE");
            String string17 = bundle.getString("SETTINGS_DELETE_ACCOUNT_SUMMARY");
            int i16 = bundle.getInt("SETTINGS_DELETE_ACCOUNT_ICON");
            Integer numValueOf8 = i16 != 0 ? Integer.valueOf(i16) : null;
            int i17 = bundle.getInt("SETTINGS_APP_VERSION_ICON");
            Integer numValueOf9 = i17 != 0 ? Integer.valueOf(i17) : null;
            boolean z10 = bundle.getBoolean("SETTINGS_SHOW_ICONS", true);
            String string18 = bundle.getString("SETTINGS_DELETE_ACCOUNT_URL");
            return new b(string, string2, string3, numValueOf, string4, string5, numValueOf2, string6, string7, numValueOf3, string8, string9, numValueOf4, string10, string11, numValueOf5, string12, string13, numValueOf6, string14, string15, numValueOf7, string16, string17, numValueOf8, numValueOf9, z10, (string18 == null || string18.length() <= 0) ? null : string18);
        }
    }

    public b(String str, String str2, String str3, Integer num, String str4, String str5, Integer num2, String str6, String str7, Integer num3, String str8, String str9, Integer num4, String str10, String str11, Integer num5, String str12, String str13, Integer num6, String str14, String str15, Integer num7, String str16, String str17, Integer num8, Integer num9, boolean z10, String str18) {
        this.f37128a = str;
        this.f37129b = str2;
        this.f37130c = str3;
        this.f37131d = num;
        this.f37132e = str4;
        this.f37133f = str5;
        this.f37134g = num2;
        this.f37135h = str6;
        this.i = str7;
        this.f37136j = num3;
        this.f37137k = str8;
        this.f37138l = str9;
        this.f37139m = num4;
        this.f37140n = str10;
        this.f37141o = str11;
        this.f37142p = num5;
        this.f37143q = str12;
        this.f37144r = str13;
        this.f37145s = num6;
        this.f37146t = str14;
        this.f37147u = str15;
        this.f37148v = num7;
        this.f37149w = str16;
        this.f37150x = str17;
        this.f37151y = num8;
        this.f37152z = num9;
        this.f37126A = z10;
        this.f37127B = str18;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("SETTINGS_CUSTOMER_SUPPORT_TITLE", this.f37128a);
        bundle.putString("SETTINGS_VIP_CUSTOMER_SUPPORT_TITLE", this.f37129b);
        bundle.putString("SETTINGS_CUSTOMER_SUPPORT_SUMMARY", this.f37130c);
        Integer num = this.f37131d;
        if (num != null) {
            bundle.putInt("SETTINGS_CUSTOMER_SUPPORT_ICON", num.intValue());
        }
        bundle.putString("SETTINGS_REMOVE_ADS_TITLE", this.f37132e);
        bundle.putString("SETTINGS_REMOVE_ADS_SUMMARY", this.f37133f);
        Integer num2 = this.f37134g;
        if (num2 != null) {
            bundle.putInt("SETTINGS_REMOVE_ADS_ICON", num2.intValue());
        }
        bundle.putString("SETTINGS_PERSONALIZED_ADS_TITLE", this.f37135h);
        bundle.putString("SETTINGS_PERSONALIZED_ADS_SUMMARY", this.i);
        Integer num3 = this.f37136j;
        if (num3 != null) {
            bundle.putInt("SETTINGS_PERSONALIZED_ADS_ICON", num3.intValue());
        }
        bundle.putString("SETTINGS_RATE_US_TITLE", this.f37137k);
        bundle.putString("SETTINGS_RATE_US_SUMMARY", this.f37138l);
        Integer num4 = this.f37139m;
        if (num4 != null) {
            bundle.putInt("SETTINGS_RATE_US_ICON", num4.intValue());
        }
        bundle.putString("SETTINGS_SHARE_APP_TITLE", this.f37140n);
        bundle.putString("SETTINGS_SHARE_APP_SUMMARY", this.f37141o);
        Integer num5 = this.f37142p;
        if (num5 != null) {
            bundle.putInt("SETTINGS_SHARE_APP_ICON", num5.intValue());
        }
        bundle.putString("SETTINGS_PRIVACY_POLICY_TITLE", this.f37143q);
        bundle.putString("SETTINGS_PRIVACY_POLICY_SUMMARY", this.f37144r);
        Integer num6 = this.f37145s;
        if (num6 != null) {
            bundle.putInt("SETTINGS_PRIVACY_POLICY_ICON", num6.intValue());
        }
        bundle.putString("SETTINGS_TERMS_TITLE", this.f37146t);
        bundle.putString("SETTINGS_TERMS_SUMMARY", this.f37147u);
        Integer num7 = this.f37148v;
        if (num7 != null) {
            bundle.putInt("SETTINGS_TERMS_ICON", num7.intValue());
        }
        bundle.putString("SETTINGS_DELETE_ACCOUNT_TITLE", this.f37149w);
        bundle.putString("SETTINGS_DELETE_ACCOUNT_SUMMARY", this.f37150x);
        Integer num8 = this.f37151y;
        if (num8 != null) {
            bundle.putInt("SETTINGS_DELETE_ACCOUNT_ICON", num8.intValue());
        }
        Integer num9 = this.f37152z;
        if (num9 != null) {
            bundle.putInt("SETTINGS_APP_VERSION_ICON", num9.intValue());
        }
        bundle.putBoolean("SETTINGS_SHOW_ICONS", this.f37126A);
        String str = this.f37127B;
        if (str != null) {
            bundle.putString("SETTINGS_DELETE_ACCOUNT_URL", str);
        }
        return bundle;
    }
}
