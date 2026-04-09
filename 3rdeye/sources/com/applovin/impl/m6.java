package com.applovin.impl;

import N7.B8;
import N7.C1154e9;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.applovin.impl.sdk.utils.StringUtils;
import io.appmetrica.analytics.impl.Oo;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* loaded from: classes.dex */
public class m6 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f20154a;

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f20155b;

    /* renamed from: c, reason: collision with root package name */
    private Integer f20156c;

    /* renamed from: d, reason: collision with root package name */
    private Integer f20157d;

    /* renamed from: e, reason: collision with root package name */
    private Integer f20158e;

    /* renamed from: f, reason: collision with root package name */
    private String f20159f;

    /* renamed from: g, reason: collision with root package name */
    private String f20160g;

    /* renamed from: h, reason: collision with root package name */
    private String f20161h;
    private String i;

    /* renamed from: j, reason: collision with root package name */
    private String f20162j;

    public m6(com.applovin.impl.sdk.k kVar) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(com.applovin.impl.sdk.k.o());
        this.f20155b = defaultSharedPreferences;
        this.f20154a = kVar;
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this);
        this.f20156c = a(n4.f20585s.a());
        this.f20157d = a(n4.f20586t.a());
        this.f20158e = h();
        this.f20159f = (String) o4.a(n4.f20588v, (Object) null, defaultSharedPreferences, false);
        this.f20160g = (String) o4.a(n4.f20589w, (Object) null, defaultSharedPreferences, false);
        this.f20161h = (String) o4.a(n4.f20590x, (Object) null, defaultSharedPreferences, false);
        this.i = (String) o4.a(n4.f20592z, (Object) null, defaultSharedPreferences, false);
        this.f20162j = (String) o4.a(n4.f20557B, (Object) null, defaultSharedPreferences, false);
        b(this.f20160g);
    }

    private Integer h() {
        String strA = n4.f20587u.a();
        if (this.f20155b.contains(strA)) {
            Integer num = (Integer) o4.a(strA, null, Integer.class, this.f20155b, false);
            if (num != null) {
                if (num.intValue() == 1 || num.intValue() == 0) {
                    return num;
                }
                this.f20154a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f20154a.O().b("TcfManager", "Integer value (" + num + ") for " + strA + " is invalid - setting GDPR Applies to null");
                }
                return null;
            }
            Long l5 = (Long) o4.a(strA, null, Long.class, this.f20155b, false);
            if (l5 != null) {
                if (l5.longValue() == 1 || l5.longValue() == 0) {
                    return Integer.valueOf(l5.intValue());
                }
                this.f20154a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f20154a.O().b("TcfManager", "Long value (" + l5 + ") for " + strA + " is invalid - setting GDPR Applies to null");
                }
                return null;
            }
            Boolean bool = (Boolean) o4.a(strA, null, Boolean.class, this.f20155b, false);
            if (bool != null) {
                return Integer.valueOf(bool.booleanValue() ? 1 : 0);
            }
            String str = (String) o4.a(strA, null, String.class, this.f20155b, false);
            if (str != null) {
                if ("1".equals(str) || "true".equals(str)) {
                    return 1;
                }
                if (CommonUrlParts.Values.FALSE_INTEGER.equals(str) || "false".equals(str)) {
                    return 0;
                }
                this.f20154a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f20154a.O().b("TcfManager", Oo.h("String value (", str, ") for ", strA, " is invalid - setting GDPR Applies to null"));
                }
                return null;
            }
        }
        return null;
    }

    public Boolean a(int i) {
        return p6.a(i, this.f20160g);
    }

    public boolean b() {
        return p6.a(this.f20160g);
    }

    public String c() {
        return this.f20160g;
    }

    public String d() {
        return k6.a(this.f20156c);
    }

    public Integer e() {
        return this.f20156c;
    }

    public Integer f() {
        return this.f20157d;
    }

    public Integer g() {
        return this.f20158e;
    }

    public String i() {
        return a("CMP Name", d()) + a("CMP SDK ID", this.f20156c) + a("CMP SDK Version", this.f20157d) + a(n4.f20587u.a(), this.f20158e) + a(n4.f20588v.a(), this.f20159f) + a(n4.f20589w.a(), this.f20160g);
    }

    public String j() {
        return this.f20159f;
    }

    public String k() {
        return this.f20161h;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str == null) {
            this.f20154a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f20154a.O().a("TcfManager", "SharedPreferences are cleared - setting all stored TC data to null");
            }
            a();
            return;
        }
        if (str.equals(n4.f20585s.a())) {
            this.f20156c = a(str);
            this.f20154a.O();
            if (com.applovin.impl.sdk.o.a()) {
                com.applovin.impl.sdk.o oVarO = this.f20154a.O();
                StringBuilder sbK = B8.k("SharedPreferences entry updated - key: ", str, ", value: ");
                sbK.append(this.f20156c);
                oVarO.a("TcfManager", sbK.toString());
            }
            this.f20154a.R0();
            return;
        }
        if (str.equals(n4.f20586t.a())) {
            this.f20157d = a(str);
            this.f20154a.O();
            if (com.applovin.impl.sdk.o.a()) {
                com.applovin.impl.sdk.o oVarO2 = this.f20154a.O();
                StringBuilder sbK2 = B8.k("SharedPreferences entry updated - key: ", str, ", value: ");
                sbK2.append(this.f20157d);
                oVarO2.a("TcfManager", sbK2.toString());
                return;
            }
            return;
        }
        if (str.equals(n4.f20587u.a())) {
            this.f20158e = h();
            this.f20154a.O();
            if (com.applovin.impl.sdk.o.a()) {
                com.applovin.impl.sdk.o oVarO3 = this.f20154a.O();
                StringBuilder sbK3 = B8.k("SharedPreferences entry updated - key: ", str, ", value: ");
                sbK3.append(this.f20158e);
                oVarO3.a("TcfManager", sbK3.toString());
                return;
            }
            return;
        }
        if (str.equals(n4.f20588v.a())) {
            this.f20159f = (String) o4.a(str, (Object) null, String.class, sharedPreferences);
            this.f20154a.O();
            if (com.applovin.impl.sdk.o.a()) {
                com.applovin.impl.sdk.o oVarO4 = this.f20154a.O();
                StringBuilder sbK4 = B8.k("SharedPreferences entry updated - key: ", str, ", value: ");
                sbK4.append(this.f20159f);
                oVarO4.a("TcfManager", sbK4.toString());
            }
            this.f20154a.R0();
            return;
        }
        if (str.equals(n4.f20589w.a())) {
            this.f20160g = (String) o4.a(str, (Object) null, String.class, sharedPreferences);
            this.f20154a.O();
            if (com.applovin.impl.sdk.o.a()) {
                com.applovin.impl.sdk.o oVarO5 = this.f20154a.O();
                StringBuilder sbK5 = B8.k("SharedPreferences entry updated - key: ", str, ", value: ");
                sbK5.append(this.f20160g);
                oVarO5.a("TcfManager", sbK5.toString());
            }
            b(this.f20160g);
            return;
        }
        if (str.equals(n4.f20590x.a())) {
            this.f20161h = (String) o4.a(str, (Object) null, String.class, sharedPreferences);
            this.f20154a.O();
            if (com.applovin.impl.sdk.o.a()) {
                com.applovin.impl.sdk.o oVarO6 = this.f20154a.O();
                StringBuilder sbK6 = B8.k("SharedPreferences entry updated - key: ", str, ", value: ");
                sbK6.append(this.f20161h);
                oVarO6.a("TcfManager", sbK6.toString());
                return;
            }
            return;
        }
        if (str.equals(n4.f20591y.a())) {
            String str2 = (String) o4.a(str, (Object) null, String.class, sharedPreferences);
            this.f20154a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f20154a.O().a("TcfManager", Oo.f("SharedPreferences entry updated - key: ", str, ", value: ", str2));
                return;
            }
            return;
        }
        if (str.equals(n4.f20592z.a())) {
            this.i = (String) o4.a(str, (Object) null, String.class, sharedPreferences);
            this.f20154a.O();
            if (com.applovin.impl.sdk.o.a()) {
                com.applovin.impl.sdk.o oVarO7 = this.f20154a.O();
                StringBuilder sbK7 = B8.k("SharedPreferences entry updated - key: ", str, ", value: ");
                sbK7.append(this.i);
                oVarO7.a("TcfManager", sbK7.toString());
                return;
            }
            return;
        }
        if (str.equals(n4.f20556A.a())) {
            String str3 = (String) o4.a(str, (Object) null, String.class, sharedPreferences);
            this.f20154a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f20154a.O().a("TcfManager", Oo.f("SharedPreferences entry updated - key: ", str, ", value: ", str3));
                return;
            }
            return;
        }
        if (!str.equals(n4.f20557B.a())) {
            if (str.contains("IABTCF_PublisherRestrictions")) {
                String str4 = (String) o4.a(str, (Object) null, String.class, sharedPreferences);
                this.f20154a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f20154a.O().a("TcfManager", Oo.f("SharedPreferences entry updated - key: ", str, ", value: ", str4));
                    return;
                }
                return;
            }
            return;
        }
        this.f20162j = (String) o4.a(str, (Object) null, String.class, sharedPreferences);
        this.f20154a.O();
        if (com.applovin.impl.sdk.o.a()) {
            com.applovin.impl.sdk.o oVarO8 = this.f20154a.O();
            StringBuilder sbK8 = B8.k("SharedPreferences entry updated - key: ", str, ", value: ");
            sbK8.append(this.f20162j);
            oVarO8.a("TcfManager", sbK8.toString());
        }
    }

    private Integer a(String str) {
        if (this.f20155b.contains(str)) {
            Integer num = (Integer) o4.a(str, null, Integer.class, this.f20155b, false);
            if (num != null) {
                return num;
            }
            Long l5 = (Long) o4.a(str, null, Long.class, this.f20155b, false);
            if (l5 != null && l5.longValue() >= -2147483648L && l5.longValue() <= 2147483647L) {
                return Integer.valueOf(l5.intValue());
            }
            String str2 = (String) o4.a(str, null, String.class, this.f20155b, false);
            if (str2 != null) {
                if (StringUtils.isNumeric(str2)) {
                    return Integer.valueOf(Integer.parseInt(str2));
                }
                this.f20154a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f20154a.O().b("TcfManager", Oo.h("String value (", str2, ") for ", str, " is not numeric - storing value as null"));
                }
            }
        }
        return null;
    }

    public Boolean b(int i) {
        String str = this.i;
        if (str == null) {
            return null;
        }
        return Boolean.valueOf(p6.a(str, i - 1));
    }

    public Boolean c(int i) {
        String str = this.f20162j;
        if (str == null) {
            return null;
        }
        return Boolean.valueOf(p6.a(str, i - 1));
    }

    public Boolean d(int i) {
        String str = this.f20161h;
        if (str == null) {
            return null;
        }
        return Boolean.valueOf(p6.a(str, i - 1));
    }

    private void b(String str) {
        this.f20154a.O();
        if (com.applovin.impl.sdk.o.a()) {
            C1154e9.m("Attempting to update consent from Additional Consent string: ", str, this.f20154a.O(), "TcfManager");
        }
        Boolean boolA = p6.a(1301, str);
        if (boolA != null) {
            if (boolA.booleanValue()) {
                this.f20154a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f20154a.O().a("TcfManager", "Found AppLovin ID in the list of consented ATP IDs - setting user consent to true");
                }
                AbstractC2130l0.b(true, com.applovin.impl.sdk.k.o());
            } else {
                this.f20154a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f20154a.O().a("TcfManager", "Could not find AppLovin ID in the list of consented ATP IDs - setting user consent to false");
                }
                AbstractC2130l0.b(false, com.applovin.impl.sdk.k.o());
            }
            this.f20154a.R0();
            return;
        }
        this.f20154a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f20154a.O().a("TcfManager", "AC string is not valid or AppLovin was not listed on the CMP flow - no consent update");
        }
    }

    private void a() {
        this.f20156c = null;
        this.f20158e = null;
        this.f20159f = null;
        this.f20160g = null;
        this.f20161h = null;
    }

    private String a(String str, Object obj) {
        StringBuilder sbK = B8.k("\n", str, " - ");
        sbK.append(obj != null ? obj.toString() : "No value set");
        return sbK.toString();
    }
}
