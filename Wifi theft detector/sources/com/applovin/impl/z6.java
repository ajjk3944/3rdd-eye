package com.applovin.impl;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.applovin.impl.sdk.utils.StringUtils;
import com.mbridge.msdk.MBridgeConstans;
import org.xbill.DNS.TTL;

/* loaded from: classes.dex */
public class z6 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f8803a;

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f8804b;

    /* renamed from: c, reason: collision with root package name */
    private Integer f8805c;

    /* renamed from: d, reason: collision with root package name */
    private Integer f8806d;

    /* renamed from: e, reason: collision with root package name */
    private Integer f8807e;

    /* renamed from: f, reason: collision with root package name */
    private String f8808f;

    /* renamed from: g, reason: collision with root package name */
    private String f8809g;

    /* renamed from: h, reason: collision with root package name */
    private String f8810h;

    /* renamed from: i, reason: collision with root package name */
    private String f8811i;

    /* renamed from: j, reason: collision with root package name */
    private String f8812j;

    public z6(com.applovin.impl.sdk.k kVar) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(com.applovin.impl.sdk.k.o());
        this.f8804b = defaultSharedPreferences;
        this.f8803a = kVar;
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this);
        this.f8805c = a(z4.f8794u.a());
        this.f8806d = a(z4.f8795v.a());
        this.f8807e = h();
        this.f8808f = (String) a5.a(z4.f8797x, (Object) null, defaultSharedPreferences, false);
        this.f8809g = (String) a5.a(z4.f8798y, (Object) null, defaultSharedPreferences, false);
        this.f8810h = (String) a5.a(z4.f8799z, (Object) null, defaultSharedPreferences, false);
        this.f8811i = (String) a5.a(z4.B, (Object) null, defaultSharedPreferences, false);
        this.f8812j = (String) a5.a(z4.D, (Object) null, defaultSharedPreferences, false);
        b(this.f8809g);
    }

    private Integer h() {
        String strA = z4.f8796w.a();
        if (this.f8804b.contains(strA)) {
            Integer num = (Integer) a5.a(strA, null, Integer.class, this.f8804b, false);
            if (num != null) {
                if (num.intValue() == 1 || num.intValue() == 0) {
                    return num;
                }
                this.f8803a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f8803a.O().b("TcfManager", "Integer value (" + num + ") for " + strA + " is invalid - setting GDPR Applies to null");
                }
                return null;
            }
            Long l10 = (Long) a5.a(strA, null, Long.class, this.f8804b, false);
            if (l10 != null) {
                if (l10.longValue() == 1 || l10.longValue() == 0) {
                    return Integer.valueOf(l10.intValue());
                }
                this.f8803a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f8803a.O().b("TcfManager", "Long value (" + l10 + ") for " + strA + " is invalid - setting GDPR Applies to null");
                }
                return null;
            }
            Boolean bool = (Boolean) a5.a(strA, null, Boolean.class, this.f8804b, false);
            if (bool != null) {
                return Integer.valueOf(bool.booleanValue() ? 1 : 0);
            }
            String str = (String) a5.a(strA, null, String.class, this.f8804b, false);
            if (str != null) {
                if ("1".equals(str) || "true".equals(str)) {
                    return 1;
                }
                if (MBridgeConstans.ENDCARD_URL_TYPE_PL.equals(str) || "false".equals(str)) {
                    return 0;
                }
                this.f8803a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f8803a.O().b("TcfManager", "String value (" + str + ") for " + strA + " is invalid - setting GDPR Applies to null");
                }
                return null;
            }
        }
        return null;
    }

    public Boolean a(int i10) {
        return c7.a(i10, this.f8809g);
    }

    public boolean b() {
        return c7.a(this.f8809g);
    }

    public String c() {
        return this.f8809g;
    }

    public String d() {
        return x6.a(this.f8805c);
    }

    public Integer e() {
        return this.f8805c;
    }

    public Integer f() {
        return this.f8806d;
    }

    public Integer g() {
        return this.f8807e;
    }

    public String i() {
        return a("CMP Name", d()) + a("CMP SDK ID", this.f8805c) + a("CMP SDK Version", this.f8806d) + a(z4.f8796w.a(), this.f8807e) + a(z4.f8797x.a(), this.f8808f) + a(z4.f8798y.a(), this.f8809g);
    }

    public String j() {
        return this.f8808f;
    }

    public String k() {
        return this.f8810h;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str == null) {
            this.f8803a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f8803a.O().a("TcfManager", "SharedPreferences are cleared - setting all stored TC data to null");
            }
            a();
            return;
        }
        if (str.equals(z4.f8794u.a())) {
            this.f8805c = a(str);
            this.f8803a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f8803a.O().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.f8805c);
            }
            this.f8803a.Q0();
            return;
        }
        if (str.equals(z4.f8795v.a())) {
            this.f8806d = a(str);
            this.f8803a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f8803a.O().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.f8806d);
                return;
            }
            return;
        }
        if (str.equals(z4.f8796w.a())) {
            this.f8807e = h();
            this.f8803a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f8803a.O().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.f8807e);
                return;
            }
            return;
        }
        if (str.equals(z4.f8797x.a())) {
            this.f8808f = (String) a5.a(str, (Object) null, String.class, sharedPreferences);
            this.f8803a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f8803a.O().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.f8808f);
            }
            this.f8803a.Q0();
            return;
        }
        if (str.equals(z4.f8798y.a())) {
            this.f8809g = (String) a5.a(str, (Object) null, String.class, sharedPreferences);
            this.f8803a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f8803a.O().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.f8809g);
            }
            b(this.f8809g);
            return;
        }
        if (str.equals(z4.f8799z.a())) {
            this.f8810h = (String) a5.a(str, (Object) null, String.class, sharedPreferences);
            this.f8803a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f8803a.O().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.f8810h);
                return;
            }
            return;
        }
        if (str.equals(z4.A.a())) {
            String str2 = (String) a5.a(str, (Object) null, String.class, sharedPreferences);
            this.f8803a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f8803a.O().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + str2);
                return;
            }
            return;
        }
        if (str.equals(z4.B.a())) {
            this.f8811i = (String) a5.a(str, (Object) null, String.class, sharedPreferences);
            this.f8803a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f8803a.O().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.f8811i);
                return;
            }
            return;
        }
        if (str.equals(z4.C.a())) {
            String str3 = (String) a5.a(str, (Object) null, String.class, sharedPreferences);
            this.f8803a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f8803a.O().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + str3);
                return;
            }
            return;
        }
        if (str.equals(z4.D.a())) {
            this.f8812j = (String) a5.a(str, (Object) null, String.class, sharedPreferences);
            this.f8803a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f8803a.O().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.f8812j);
                return;
            }
            return;
        }
        if (str.contains("IABTCF_PublisherRestrictions")) {
            String str4 = (String) a5.a(str, (Object) null, String.class, sharedPreferences);
            this.f8803a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f8803a.O().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + str4);
            }
        }
    }

    private Integer a(String str) {
        if (this.f8804b.contains(str)) {
            Integer num = (Integer) a5.a(str, null, Integer.class, this.f8804b, false);
            if (num != null) {
                return num;
            }
            Long l10 = (Long) a5.a(str, null, Long.class, this.f8804b, false);
            if (l10 != null && l10.longValue() >= -2147483648L && l10.longValue() <= TTL.MAX_VALUE) {
                return Integer.valueOf(l10.intValue());
            }
            String str2 = (String) a5.a(str, null, String.class, this.f8804b, false);
            if (str2 != null) {
                if (StringUtils.isNumeric(str2)) {
                    return Integer.valueOf(Integer.parseInt(str2));
                }
                this.f8803a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f8803a.O().b("TcfManager", "String value (" + str2 + ") for " + str + " is not numeric - storing value as null");
                }
            }
        }
        return null;
    }

    public Boolean b(int i10) {
        String str = this.f8811i;
        if (str == null) {
            return null;
        }
        return Boolean.valueOf(c7.a(str, i10 - 1));
    }

    public Boolean c(int i10) {
        String str = this.f8812j;
        if (str == null) {
            return null;
        }
        return Boolean.valueOf(c7.a(str, i10 - 1));
    }

    public Boolean d(int i10) {
        String str = this.f8810h;
        if (str == null) {
            return null;
        }
        return Boolean.valueOf(c7.a(str, i10 - 1));
    }

    private void b(String str) {
        this.f8803a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f8803a.O().a("TcfManager", "Attempting to update consent from Additional Consent string: " + str);
        }
        Boolean boolA = c7.a(1301, str);
        if (boolA != null) {
            if (boolA.booleanValue()) {
                this.f8803a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f8803a.O().a("TcfManager", "Found AppLovin ID in the list of consented ATP IDs - setting user consent to true");
                }
                p0.b(true, com.applovin.impl.sdk.k.o());
            } else {
                this.f8803a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f8803a.O().a("TcfManager", "Could not find AppLovin ID in the list of consented ATP IDs - setting user consent to false");
                }
                p0.b(false, com.applovin.impl.sdk.k.o());
            }
            this.f8803a.Q0();
            return;
        }
        this.f8803a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f8803a.O().a("TcfManager", "AC string is not valid or AppLovin was not listed on the CMP flow - no consent update");
        }
    }

    private void a() {
        this.f8805c = null;
        this.f8807e = null;
        this.f8808f = null;
        this.f8809g = null;
        this.f8810h = null;
    }

    private String a(String str, Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append(str);
        sb.append(" - ");
        sb.append(obj != null ? obj.toString() : "No value set");
        return sb.toString();
    }
}
