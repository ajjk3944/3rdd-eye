package com.ui.uidb.api;

import Y6.g;
import Y6.i;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u0000 =2\u00020\u0001:\u0001\"Bå\u0001\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u001c\b\u0001\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\f\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f\u0012\u0010\b\u0001\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0017\u0010\u0018Jî\u0001\u0010\u0019\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\b2\u001c\b\u0003\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\f\u0018\u00010\u000b2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0010\b\u0003\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f2\u0010\b\u0003\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f2\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u000e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u001cR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b&\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b'\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b)\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010#\u001a\u0004\b(\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b/\u0010-R+\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\f\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010#\u001a\u0004\b\"\u0010\u001cR\u001f\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b0\u0010:R\u001f\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b&\u00109\u001a\u0004\b.\u0010:R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b6\u0010#\u001a\u0004\b;\u0010\u001cR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b,\u0010#\u001a\u0004\b8\u0010\u001cR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b/\u0010#\u001a\u0004\b4\u0010\u001cR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b2\u00105\u001a\u0004\b*\u00107R\u0019\u0010>\u001a\n\u0012\u0004\u0012\u00020<\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b=\u0010:R\u0019\u0010@\u001a\n\u0012\u0004\u0012\u00020?\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b%\u0010:¨\u0006A"}, d2 = {"Lcom/ui/uidb/api/ApiProductCompliance;", "", "", "modelName", "productName", "fcc", "icEmi", "ic", "", "rfCmFcc", "rfCmIc", "", "", "text", "", "rcm", "anatel", "jrf", "jpa", "wifi", "ncc", "kc", "indoorOnly", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/ui/uidb/api/ApiProductCompliance;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "j", SnmpConfigurator.O_BIND_ADDRESS, "l", SnmpConfigurator.O_COMMUNITY, "d", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "f", "Ljava/lang/Integer;", SnmpConfigurator.O_CONTEXT_NAME, "()Ljava/lang/Integer;", "g", SnmpConfigurator.O_OPERATION, "h", "Ljava/util/Map;", "p", "()Ljava/util/Map;", "i", "Ljava/lang/Boolean;", "m", "()Ljava/lang/Boolean;", "k", "Ljava/util/List;", "()Ljava/util/List;", SnmpConfigurator.O_RETRIES, "LCa/a$g$a;", "q", "usWarning", "LCa/a$c$a;", "caWarning", "uidb"}, k = 1, mv = {2, 0, 0}, xi = 48)
@i(generateAdapter = true)
/* loaded from: classes3.dex */
public final /* data */ class ApiProductCompliance {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String modelName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String productName;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String fcc;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String icEmi;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String ic;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer rfCmFcc;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer rfCmIc;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map text;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean rcm;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String anatel;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final List jrf;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final List jpa;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final String wifi;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final String ncc;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final String kc;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean indoorOnly;

    public ApiProductCompliance(@g(name = "modelName") String str, @g(name = "productName") String str2, @g(name = "fcc") String str3, @g(name = "icEmi") String str4, @g(name = "ic") String str5, @g(name = "rfCmFcc") Integer num, @g(name = "rfCmIc") Integer num2, @g(name = "text") Map<String, ? extends List<String>> map, @g(name = "rcm") Boolean bool, @g(name = "anatel") String str6, @g(name = "jrf") List<String> list, @g(name = "jpa") List<String> list2, @g(name = "wifi") String str7, @g(name = "ncc") String str8, @g(name = "kc") String str9, @g(name = "indoorOnly") Boolean bool2) {
        this.modelName = str;
        this.productName = str2;
        this.fcc = str3;
        this.icEmi = str4;
        this.ic = str5;
        this.rfCmFcc = num;
        this.rfCmIc = num2;
        this.text = map;
        this.rcm = bool;
        this.anatel = str6;
        this.jrf = list;
        this.jpa = list2;
        this.wifi = str7;
        this.ncc = str8;
        this.kc = str9;
        this.indoorOnly = bool2;
    }

    /* renamed from: a, reason: from getter */
    public final String getAnatel() {
        return this.anatel;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List b() {
        /*
            r5 = this;
            java.util.Map r0 = r5.text
            r1 = 0
            if (r0 == 0) goto L94
            java.lang.String r2 = "CA"
            java.lang.Object r0 = r0.get(r2)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L94
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L1a:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L8d
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            int r4 = r3.hashCode()
            switch(r4) {
                case -1734655605: goto L7a;
                case -1734655604: goto L6d;
                case -1019989817: goto L60;
                case 2330: goto L54;
                case 2612: goto L3b;
                case 81860: goto L2e;
                default: goto L2d;
            }
        L2d:
            goto L83
        L2e:
            java.lang.String r4 = "SAR"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L38
            goto L83
        L38:
            Ca.a$c$a$c r3 = Ca.a.c.AbstractC0110a.C0112c.f2456a
            goto L87
        L3b:
            java.lang.String r4 = "RF"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L45
            goto L83
        L45:
            java.lang.Integer r3 = r5.rfCmFcc
            if (r3 == 0) goto L83
            int r3 = r3.intValue()
            Ca.a$c$a$b r4 = new Ca.a$c$a$b
            r4.<init>(r3)
            r3 = r4
            goto L87
        L54:
            java.lang.String r4 = "IC"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L83
            Ca.a$c$a$a r3 = Ca.a.c.AbstractC0110a.C0111a.f2454a
            goto L87
        L60:
            java.lang.String r4 = "WIFI_5_DET_ANT"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L6a
            goto L83
        L6a:
            Ca.a$c$a$d r3 = Ca.a.c.AbstractC0110a.d.f2457a
            goto L87
        L6d:
            java.lang.String r4 = "WIFI_6"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L77
            goto L83
        L77:
            Ca.a$c$a$e r3 = Ca.a.c.AbstractC0110a.e.f2458a
            goto L87
        L7a:
            java.lang.String r4 = "WIFI_5"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L85
        L83:
            r3 = r1
            goto L87
        L85:
            Ca.a$c$a$f r3 = Ca.a.c.AbstractC0110a.f.f2459a
        L87:
            if (r3 == 0) goto L1a
            r2.add(r3)
            goto L1a
        L8d:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L94
            r1 = r2
        L94:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ui.uidb.api.ApiProductCompliance.b():java.util.List");
    }

    /* renamed from: c, reason: from getter */
    public final String getFcc() {
        return this.fcc;
    }

    public final ApiProductCompliance copy(@g(name = "modelName") String modelName, @g(name = "productName") String productName, @g(name = "fcc") String fcc, @g(name = "icEmi") String icEmi, @g(name = "ic") String ic2, @g(name = "rfCmFcc") Integer rfCmFcc, @g(name = "rfCmIc") Integer rfCmIc, @g(name = "text") Map<String, ? extends List<String>> text, @g(name = "rcm") Boolean rcm, @g(name = "anatel") String anatel, @g(name = "jrf") List<String> jrf, @g(name = "jpa") List<String> jpa, @g(name = "wifi") String wifi, @g(name = "ncc") String ncc, @g(name = "kc") String kc2, @g(name = "indoorOnly") Boolean indoorOnly) {
        return new ApiProductCompliance(modelName, productName, fcc, icEmi, ic2, rfCmFcc, rfCmIc, text, rcm, anatel, jrf, jpa, wifi, ncc, kc2, indoorOnly);
    }

    /* renamed from: d, reason: from getter */
    public final String getIc() {
        return this.ic;
    }

    /* renamed from: e, reason: from getter */
    public final String getIcEmi() {
        return this.icEmi;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiProductCompliance)) {
            return false;
        }
        ApiProductCompliance apiProductCompliance = (ApiProductCompliance) other;
        return AbstractC6492s.d(this.modelName, apiProductCompliance.modelName) && AbstractC6492s.d(this.productName, apiProductCompliance.productName) && AbstractC6492s.d(this.fcc, apiProductCompliance.fcc) && AbstractC6492s.d(this.icEmi, apiProductCompliance.icEmi) && AbstractC6492s.d(this.ic, apiProductCompliance.ic) && AbstractC6492s.d(this.rfCmFcc, apiProductCompliance.rfCmFcc) && AbstractC6492s.d(this.rfCmIc, apiProductCompliance.rfCmIc) && AbstractC6492s.d(this.text, apiProductCompliance.text) && AbstractC6492s.d(this.rcm, apiProductCompliance.rcm) && AbstractC6492s.d(this.anatel, apiProductCompliance.anatel) && AbstractC6492s.d(this.jrf, apiProductCompliance.jrf) && AbstractC6492s.d(this.jpa, apiProductCompliance.jpa) && AbstractC6492s.d(this.wifi, apiProductCompliance.wifi) && AbstractC6492s.d(this.ncc, apiProductCompliance.ncc) && AbstractC6492s.d(this.kc, apiProductCompliance.kc) && AbstractC6492s.d(this.indoorOnly, apiProductCompliance.indoorOnly);
    }

    /* renamed from: f, reason: from getter */
    public final Boolean getIndoorOnly() {
        return this.indoorOnly;
    }

    /* renamed from: g, reason: from getter */
    public final List getJpa() {
        return this.jpa;
    }

    /* renamed from: h, reason: from getter */
    public final List getJrf() {
        return this.jrf;
    }

    public int hashCode() {
        String str = this.modelName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.productName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fcc;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.icEmi;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.ic;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.rfCmFcc;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.rfCmIc;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Map map = this.text;
        int iHashCode8 = (iHashCode7 + (map == null ? 0 : map.hashCode())) * 31;
        Boolean bool = this.rcm;
        int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str6 = this.anatel;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List list = this.jrf;
        int iHashCode11 = (iHashCode10 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.jpa;
        int iHashCode12 = (iHashCode11 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str7 = this.wifi;
        int iHashCode13 = (iHashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.ncc;
        int iHashCode14 = (iHashCode13 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.kc;
        int iHashCode15 = (iHashCode14 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Boolean bool2 = this.indoorOnly;
        return iHashCode15 + (bool2 != null ? bool2.hashCode() : 0);
    }

    /* renamed from: i, reason: from getter */
    public final String getKc() {
        return this.kc;
    }

    /* renamed from: j, reason: from getter */
    public final String getModelName() {
        return this.modelName;
    }

    /* renamed from: k, reason: from getter */
    public final String getNcc() {
        return this.ncc;
    }

    /* renamed from: l, reason: from getter */
    public final String getProductName() {
        return this.productName;
    }

    /* renamed from: m, reason: from getter */
    public final Boolean getRcm() {
        return this.rcm;
    }

    /* renamed from: n, reason: from getter */
    public final Integer getRfCmFcc() {
        return this.rfCmFcc;
    }

    /* renamed from: o, reason: from getter */
    public final Integer getRfCmIc() {
        return this.rfCmIc;
    }

    /* renamed from: p, reason: from getter */
    public final Map getText() {
        return this.text;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List q() {
        /*
            r5 = this;
            java.util.Map r0 = r5.text
            r1 = 0
            if (r0 == 0) goto La5
            java.lang.String r2 = "US"
            java.lang.Object r0 = r0.get(r2)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto La5
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L1b:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L9e
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            int r4 = r3.hashCode()
            switch(r4) {
                case -1734655605: goto L8a;
                case -1734655604: goto L7d;
                case -1019989817: goto L70;
                case 2612: goto L57;
                case 81860: goto L4a;
                case 66709864: goto L3d;
                case 66709865: goto L30;
                default: goto L2e;
            }
        L2e:
            goto L93
        L30:
            java.lang.String r4 = "FCC_B"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L3a
            goto L93
        L3a:
            Ca.a$g$a$b r3 = Ca.a.g.AbstractC0113a.b.f2469a
            goto L97
        L3d:
            java.lang.String r4 = "FCC_A"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L47
            goto L93
        L47:
            Ca.a$g$a$a r3 = Ca.a.g.AbstractC0113a.C0114a.f2468a
            goto L97
        L4a:
            java.lang.String r4 = "SAR"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L54
            goto L93
        L54:
            Ca.a$g$a$d r3 = Ca.a.g.AbstractC0113a.d.f2471a
            goto L97
        L57:
            java.lang.String r4 = "RF"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L61
            goto L93
        L61:
            java.lang.Integer r3 = r5.rfCmFcc
            if (r3 == 0) goto L93
            int r3 = r3.intValue()
            Ca.a$g$a$c r4 = new Ca.a$g$a$c
            r4.<init>(r3)
            r3 = r4
            goto L97
        L70:
            java.lang.String r4 = "WIFI_5_DET_ANT"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L7a
            goto L93
        L7a:
            Ca.a$g$a$f r3 = Ca.a.g.AbstractC0113a.f.f2473a
            goto L97
        L7d:
            java.lang.String r4 = "WIFI_6"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L87
            goto L93
        L87:
            Ca.a$g$a$g r3 = Ca.a.g.AbstractC0113a.C0115g.f2474a
            goto L97
        L8a:
            java.lang.String r4 = "WIFI_5"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L95
        L93:
            r3 = r1
            goto L97
        L95:
            Ca.a$g$a$e r3 = Ca.a.g.AbstractC0113a.e.f2472a
        L97:
            if (r3 == 0) goto L1b
            r2.add(r3)
            goto L1b
        L9e:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto La5
            r1 = r2
        La5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ui.uidb.api.ApiProductCompliance.q():java.util.List");
    }

    /* renamed from: r, reason: from getter */
    public final String getWifi() {
        return this.wifi;
    }

    public String toString() {
        return "ApiProductCompliance(modelName=" + this.modelName + ", productName=" + this.productName + ", fcc=" + this.fcc + ", icEmi=" + this.icEmi + ", ic=" + this.ic + ", rfCmFcc=" + this.rfCmFcc + ", rfCmIc=" + this.rfCmIc + ", text=" + this.text + ", rcm=" + this.rcm + ", anatel=" + this.anatel + ", jrf=" + this.jrf + ", jpa=" + this.jpa + ", wifi=" + this.wifi + ", ncc=" + this.ncc + ", kc=" + this.kc + ", indoorOnly=" + this.indoorOnly + ")";
    }
}
