package com.applovin.impl;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.applovin.impl.sdk.utils.StringUtils;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class z6 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f6336a;

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f6337b;

    /* renamed from: c, reason: collision with root package name */
    private Integer f6338c;

    /* renamed from: d, reason: collision with root package name */
    private Integer f6339d;

    /* renamed from: e, reason: collision with root package name */
    private Integer f6340e;

    /* renamed from: f, reason: collision with root package name */
    private String f6341f;
    private String g;

    /* renamed from: h, reason: collision with root package name */
    private String f6342h;

    /* renamed from: i, reason: collision with root package name */
    private String f6343i;
    private String j;

    public z6(com.applovin.impl.sdk.k kVar) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(com.applovin.impl.sdk.k.o());
        this.f6337b = defaultSharedPreferences;
        this.f6336a = kVar;
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this);
        this.f6338c = a(z4.f6327u.a());
        this.f6339d = a(z4.f6328v.a());
        this.f6340e = h();
        this.f6341f = (String) a5.a(z4.f6330x, (Object) null, defaultSharedPreferences, false);
        this.g = (String) a5.a(z4.f6331y, (Object) null, defaultSharedPreferences, false);
        this.f6342h = (String) a5.a(z4.f6332z, (Object) null, defaultSharedPreferences, false);
        this.f6343i = (String) a5.a(z4.B, (Object) null, defaultSharedPreferences, false);
        this.j = (String) a5.a(z4.D, (Object) null, defaultSharedPreferences, false);
        b(this.g);
    }

    private Integer h() {
        String strA = z4.f6329w.a();
        if (this.f6337b.contains(strA)) {
            Integer num = (Integer) a5.a(strA, null, Integer.class, this.f6337b, false);
            if (num != null) {
                if (num.intValue() == 1 || num.intValue() == 0) {
                    return num;
                }
                this.f6336a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f6336a.O().b("TcfManager", "Integer value (" + num + ") for " + strA + " is invalid - setting GDPR Applies to null");
                }
                return null;
            }
            Long l10 = (Long) a5.a(strA, null, Long.class, this.f6337b, false);
            if (l10 != null) {
                if (l10.longValue() == 1 || l10.longValue() == 0) {
                    return Integer.valueOf(l10.intValue());
                }
                this.f6336a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f6336a.O().b("TcfManager", "Long value (" + l10 + ") for " + strA + " is invalid - setting GDPR Applies to null");
                }
                return null;
            }
            Boolean bool = (Boolean) a5.a(strA, null, Boolean.class, this.f6337b, false);
            if (bool != null) {
                return Integer.valueOf(bool.booleanValue() ? 1 : 0);
            }
            String str = (String) a5.a(strA, null, String.class, this.f6337b, false);
            if (str != null) {
                if ("1".equals(str) || "true".equals(str)) {
                    return 1;
                }
                if ("0".equals(str) || "false".equals(str)) {
                    return 0;
                }
                this.f6336a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f6336a.O().b("TcfManager", a0.g.n("String value (", str, ") for ", strA, " is invalid - setting GDPR Applies to null"));
                }
                return null;
            }
        }
        return null;
    }

    public Boolean a(int i4) {
        return c7.a(i4, this.g);
    }

    public boolean b() {
        return c7.a(this.g);
    }

    public String c() {
        return this.g;
    }

    public String d() {
        return x6.a(this.f6338c);
    }

    public Integer e() {
        return this.f6338c;
    }

    public Integer f() {
        return this.f6339d;
    }

    public Integer g() {
        return this.f6340e;
    }

    public String i() {
        return a("CMP Name", d()) + a("CMP SDK ID", this.f6338c) + a("CMP SDK Version", this.f6339d) + a(z4.f6329w.a(), this.f6340e) + a(z4.f6330x.a(), this.f6341f) + a(z4.f6331y.a(), this.g);
    }

    public String j() {
        return this.f6341f;
    }

    public String k() {
        return this.f6342h;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str == null) {
            this.f6336a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f6336a.O().a("TcfManager", "SharedPreferences are cleared - setting all stored TC data to null");
            }
            a();
            return;
        }
        if (str.equals(z4.f6327u.a())) {
            this.f6338c = a(str);
            this.f6336a.O();
            if (com.applovin.impl.sdk.o.a()) {
                com.applovin.impl.sdk.o oVarO = this.f6336a.O();
                StringBuilder sbA = d.h.A("SharedPreferences entry updated - key: ", str, ", value: ");
                sbA.append(this.f6338c);
                oVarO.a("TcfManager", sbA.toString());
            }
            this.f6336a.Q0();
            return;
        }
        if (str.equals(z4.f6328v.a())) {
            this.f6339d = a(str);
            this.f6336a.O();
            if (com.applovin.impl.sdk.o.a()) {
                com.applovin.impl.sdk.o oVarO2 = this.f6336a.O();
                StringBuilder sbA2 = d.h.A("SharedPreferences entry updated - key: ", str, ", value: ");
                sbA2.append(this.f6339d);
                oVarO2.a("TcfManager", sbA2.toString());
                return;
            }
            return;
        }
        if (str.equals(z4.f6329w.a())) {
            this.f6340e = h();
            this.f6336a.O();
            if (com.applovin.impl.sdk.o.a()) {
                com.applovin.impl.sdk.o oVarO3 = this.f6336a.O();
                StringBuilder sbA3 = d.h.A("SharedPreferences entry updated - key: ", str, ", value: ");
                sbA3.append(this.f6340e);
                oVarO3.a("TcfManager", sbA3.toString());
                return;
            }
            return;
        }
        if (str.equals(z4.f6330x.a())) {
            this.f6341f = (String) a5.a(str, (Object) null, String.class, sharedPreferences);
            this.f6336a.O();
            if (com.applovin.impl.sdk.o.a()) {
                a0.g.B(d.h.A("SharedPreferences entry updated - key: ", str, ", value: "), this.f6341f, this.f6336a.O(), "TcfManager");
            }
            this.f6336a.Q0();
            return;
        }
        if (str.equals(z4.f6331y.a())) {
            this.g = (String) a5.a(str, (Object) null, String.class, sharedPreferences);
            this.f6336a.O();
            if (com.applovin.impl.sdk.o.a()) {
                a0.g.B(d.h.A("SharedPreferences entry updated - key: ", str, ", value: "), this.g, this.f6336a.O(), "TcfManager");
            }
            b(this.g);
            return;
        }
        if (str.equals(z4.f6332z.a())) {
            this.f6342h = (String) a5.a(str, (Object) null, String.class, sharedPreferences);
            this.f6336a.O();
            if (com.applovin.impl.sdk.o.a()) {
                a0.g.B(d.h.A("SharedPreferences entry updated - key: ", str, ", value: "), this.f6342h, this.f6336a.O(), "TcfManager");
                return;
            }
            return;
        }
        if (str.equals(z4.A.a())) {
            String str2 = (String) a5.a(str, (Object) null, String.class, sharedPreferences);
            this.f6336a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f6336a.O().a("TcfManager", je.u.u("SharedPreferences entry updated - key: ", str, ", value: ", str2));
                return;
            }
            return;
        }
        if (str.equals(z4.B.a())) {
            this.f6343i = (String) a5.a(str, (Object) null, String.class, sharedPreferences);
            this.f6336a.O();
            if (com.applovin.impl.sdk.o.a()) {
                a0.g.B(d.h.A("SharedPreferences entry updated - key: ", str, ", value: "), this.f6343i, this.f6336a.O(), "TcfManager");
                return;
            }
            return;
        }
        if (str.equals(z4.C.a())) {
            String str3 = (String) a5.a(str, (Object) null, String.class, sharedPreferences);
            this.f6336a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f6336a.O().a("TcfManager", je.u.u("SharedPreferences entry updated - key: ", str, ", value: ", str3));
                return;
            }
            return;
        }
        if (str.equals(z4.D.a())) {
            this.j = (String) a5.a(str, (Object) null, String.class, sharedPreferences);
            this.f6336a.O();
            if (com.applovin.impl.sdk.o.a()) {
                a0.g.B(d.h.A("SharedPreferences entry updated - key: ", str, ", value: "), this.j, this.f6336a.O(), "TcfManager");
                return;
            }
            return;
        }
        if (str.contains("IABTCF_PublisherRestrictions")) {
            String str4 = (String) a5.a(str, (Object) null, String.class, sharedPreferences);
            this.f6336a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f6336a.O().a("TcfManager", je.u.u("SharedPreferences entry updated - key: ", str, ", value: ", str4));
            }
        }
    }

    private Integer a(String str) {
        if (this.f6337b.contains(str)) {
            Integer num = (Integer) a5.a(str, null, Integer.class, this.f6337b, false);
            if (num != null) {
                return num;
            }
            Long l10 = (Long) a5.a(str, null, Long.class, this.f6337b, false);
            if (l10 != null && l10.longValue() >= -2147483648L && l10.longValue() <= 2147483647L) {
                return Integer.valueOf(l10.intValue());
            }
            String str2 = (String) a5.a(str, null, String.class, this.f6337b, false);
            if (str2 != null) {
                if (StringUtils.isNumeric(str2)) {
                    return Integer.valueOf(Integer.parseInt(str2));
                }
                this.f6336a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f6336a.O().b("TcfManager", a0.g.n("String value (", str2, ") for ", str, " is not numeric - storing value as null"));
                }
            }
        }
        return null;
    }

    public Boolean b(int i4) {
        String str = this.f6343i;
        if (str == null) {
            return null;
        }
        return Boolean.valueOf(c7.a(str, i4 - 1));
    }

    public Boolean c(int i4) {
        String str = this.j;
        if (str == null) {
            return null;
        }
        return Boolean.valueOf(c7.a(str, i4 - 1));
    }

    public Boolean d(int i4) {
        String str = this.f6342h;
        if (str == null) {
            return null;
        }
        return Boolean.valueOf(c7.a(str, i4 - 1));
    }

    private void b(String str) {
        this.f6336a.O();
        if (com.applovin.impl.sdk.o.a()) {
            a0.g.x("Attempting to update consent from Additional Consent string: ", str, this.f6336a.O(), "TcfManager");
        }
        Boolean boolA = c7.a(1301, str);
        if (boolA != null) {
            if (boolA.booleanValue()) {
                this.f6336a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f6336a.O().a("TcfManager", "Found AppLovin ID in the list of consented ATP IDs - setting user consent to true");
                }
                p0.b(true, com.applovin.impl.sdk.k.o());
            } else {
                this.f6336a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f6336a.O().a("TcfManager", "Could not find AppLovin ID in the list of consented ATP IDs - setting user consent to false");
                }
                p0.b(false, com.applovin.impl.sdk.k.o());
            }
            this.f6336a.Q0();
            return;
        }
        this.f6336a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f6336a.O().a("TcfManager", "AC string is not valid or AppLovin was not listed on the CMP flow - no consent update");
        }
    }

    private void a() {
        this.f6338c = null;
        this.f6340e = null;
        this.f6341f = null;
        this.g = null;
        this.f6342h = null;
    }

    private String a(String str, Object obj) {
        StringBuilder sbA = d.h.A("\n", str, " - ");
        sbA.append(obj != null ? obj.toString() : "No value set");
        return sbA.toString();
    }
}
