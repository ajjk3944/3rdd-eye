package com.applovin.impl;

import com.applovin.mediation.MaxAdFormat;
import java.util.Map;

/* loaded from: classes.dex */
public class a3 {

    /* renamed from: a, reason: collision with root package name */
    private final String f5372a;

    /* renamed from: b, reason: collision with root package name */
    private final MaxAdFormat f5373b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f5374c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f5375d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f5376e;

    /* renamed from: f, reason: collision with root package name */
    private final h f5377f;

    public a3(String str, MaxAdFormat maxAdFormat, Map map, Map map2, Map map3, h hVar) {
        this.f5372a = str;
        this.f5373b = maxAdFormat;
        this.f5374c = map;
        this.f5375d = map2;
        this.f5376e = map3;
        this.f5377f = hVar;
    }

    public boolean a(Object obj) {
        return obj instanceof a3;
    }

    public String b() {
        return this.f5372a;
    }

    public Map c() {
        return this.f5376e;
    }

    public Map d() {
        return this.f5375d;
    }

    public Map e() {
        return this.f5374c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a3)) {
            return false;
        }
        a3 a3Var = (a3) obj;
        if (!a3Var.a(this)) {
            return false;
        }
        String strB = b();
        String strB2 = a3Var.b();
        if (strB != null ? !strB.equals(strB2) : strB2 != null) {
            return false;
        }
        MaxAdFormat maxAdFormatA = a();
        MaxAdFormat maxAdFormatA2 = a3Var.a();
        if (maxAdFormatA != null ? !maxAdFormatA.equals(maxAdFormatA2) : maxAdFormatA2 != null) {
            return false;
        }
        Map mapE = e();
        Map mapE2 = a3Var.e();
        if (mapE != null ? !mapE.equals(mapE2) : mapE2 != null) {
            return false;
        }
        Map mapD = d();
        Map mapD2 = a3Var.d();
        if (mapD != null ? !mapD.equals(mapD2) : mapD2 != null) {
            return false;
        }
        Map mapC = c();
        Map mapC2 = a3Var.c();
        if (mapC != null ? !mapC.equals(mapC2) : mapC2 != null) {
            return false;
        }
        h hVarF = f();
        h hVarF2 = a3Var.f();
        return hVarF != null ? hVarF.equals(hVarF2) : hVarF2 == null;
    }

    public h f() {
        return this.f5377f;
    }

    public int hashCode() {
        String strB = b();
        int iHashCode = strB == null ? 43 : strB.hashCode();
        MaxAdFormat maxAdFormatA = a();
        int iHashCode2 = ((iHashCode + 59) * 59) + (maxAdFormatA == null ? 43 : maxAdFormatA.hashCode());
        Map mapE = e();
        int iHashCode3 = (iHashCode2 * 59) + (mapE == null ? 43 : mapE.hashCode());
        Map mapD = d();
        int iHashCode4 = (iHashCode3 * 59) + (mapD == null ? 43 : mapD.hashCode());
        Map mapC = c();
        int iHashCode5 = (iHashCode4 * 59) + (mapC == null ? 43 : mapC.hashCode());
        h hVarF = f();
        return (iHashCode5 * 59) + (hVarF != null ? hVarF.hashCode() : 43);
    }

    public String toString() {
        return "MediatedAdRequestParameters(adUnitId=" + b() + ", adFormat=" + a() + ")";
    }

    public MaxAdFormat a() {
        return this.f5373b;
    }
}
