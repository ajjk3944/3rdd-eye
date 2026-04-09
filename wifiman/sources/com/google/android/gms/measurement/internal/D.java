package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.C4839e4;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: f, reason: collision with root package name */
    private static final D f35828f = new D(null, 100);

    /* renamed from: a, reason: collision with root package name */
    private final int f35829a;

    /* renamed from: b, reason: collision with root package name */
    private final String f35830b;

    /* renamed from: c, reason: collision with root package name */
    private final Boolean f35831c;

    /* renamed from: d, reason: collision with root package name */
    private final String f35832d;

    /* renamed from: e, reason: collision with root package name */
    private final EnumMap f35833e;

    D(Boolean bool, int i10) {
        this((Boolean) null, i10, (Boolean) null, (String) null);
    }

    public static D b(Bundle bundle, int i10) {
        if (bundle == null) {
            return new D(null, i10);
        }
        EnumMap enumMap = new EnumMap(C4839e4.a.class);
        for (C4839e4.a aVar : EnumC4857g4.DMA.zza()) {
            enumMap.put((EnumMap) aVar, (C4839e4.a) C4839e4.i(bundle.getString(aVar.zze)));
        }
        return new D(enumMap, i10, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    static D c(EnumC4866h4 enumC4866h4, int i10) {
        EnumMap enumMap = new EnumMap(C4839e4.a.class);
        enumMap.put((EnumMap) C4839e4.a.AD_USER_DATA, (C4839e4.a) enumC4866h4);
        return new D(enumMap, -10, (Boolean) null, (String) null);
    }

    public static D d(String str) throws NumberFormatException {
        if (str == null || str.length() <= 0) {
            return f35828f;
        }
        String[] strArrSplit = str.split(":");
        int i10 = Integer.parseInt(strArrSplit[0]);
        EnumMap enumMap = new EnumMap(C4839e4.a.class);
        C4839e4.a[] aVarArrZza = EnumC4857g4.DMA.zza();
        int length = aVarArrZza.length;
        int i11 = 1;
        int i12 = 0;
        while (i12 < length) {
            enumMap.put((EnumMap) aVarArrZza[i12], (C4839e4.a) C4839e4.g(strArrSplit[i11].charAt(0)));
            i12++;
            i11++;
        }
        return new D(enumMap, i10, (Boolean) null, (String) null);
    }

    public static Boolean e(Bundle bundle) {
        EnumC4866h4 enumC4866h4I;
        if (bundle == null || (enumC4866h4I = C4839e4.i(bundle.getString("ad_personalization"))) == null) {
            return null;
        }
        int i10 = G.f35874a[enumC4866h4I.ordinal()];
        if (i10 == 3) {
            return Boolean.FALSE;
        }
        if (i10 != 4) {
            return null;
        }
        return Boolean.TRUE;
    }

    private final String l() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f35829a);
        for (C4839e4.a aVar : EnumC4857g4.DMA.zza()) {
            sb2.append(":");
            sb2.append(C4839e4.a((EnumC4866h4) this.f35833e.get(aVar)));
        }
        return sb2.toString();
    }

    public final int a() {
        return this.f35829a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof D)) {
            return false;
        }
        D d10 = (D) obj;
        if (this.f35830b.equalsIgnoreCase(d10.f35830b) && Objects.equals(this.f35831c, d10.f35831c)) {
            return Objects.equals(this.f35832d, d10.f35832d);
        }
        return false;
    }

    public final Bundle f() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f35833e.entrySet()) {
            String strQ = C4839e4.q((EnumC4866h4) entry.getValue());
            if (strQ != null) {
                bundle.putString(((C4839e4.a) entry.getKey()).zze, strQ);
            }
        }
        Boolean bool = this.f35831c;
        if (bool != null) {
            bundle.putString("is_dma_region", bool.toString());
        }
        String str = this.f35832d;
        if (str != null) {
            bundle.putString("cps_display_str", str);
        }
        return bundle;
    }

    public final EnumC4866h4 g() {
        EnumC4866h4 enumC4866h4 = (EnumC4866h4) this.f35833e.get(C4839e4.a.AD_USER_DATA);
        return enumC4866h4 == null ? EnumC4866h4.UNINITIALIZED : enumC4866h4;
    }

    public final Boolean h() {
        return this.f35831c;
    }

    public final int hashCode() {
        Boolean bool = this.f35831c;
        int i10 = bool == null ? 3 : bool.booleanValue() ? 7 : 13;
        String str = this.f35832d;
        return this.f35830b.hashCode() + (i10 * 29) + ((str == null ? 17 : str.hashCode()) * 137);
    }

    public final String i() {
        return this.f35832d;
    }

    public final String j() {
        return this.f35830b;
    }

    public final boolean k() {
        Iterator it = this.f35833e.values().iterator();
        while (it.hasNext()) {
            if (((EnumC4866h4) it.next()) != EnumC4866h4.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(C4839e4.j(this.f35829a));
        for (C4839e4.a aVar : EnumC4857g4.DMA.zza()) {
            sb2.append(",");
            sb2.append(aVar.zze);
            sb2.append("=");
            EnumC4866h4 enumC4866h4 = (EnumC4866h4) this.f35833e.get(aVar);
            if (enumC4866h4 == null) {
                sb2.append("uninitialized");
            } else {
                int i10 = G.f35874a[enumC4866h4.ordinal()];
                if (i10 == 1) {
                    sb2.append("uninitialized");
                } else if (i10 == 2) {
                    sb2.append("eu_consent_policy");
                } else if (i10 == 3) {
                    sb2.append("denied");
                } else if (i10 == 4) {
                    sb2.append("granted");
                }
            }
        }
        if (this.f35831c != null) {
            sb2.append(",isDmaRegion=");
            sb2.append(this.f35831c);
        }
        if (this.f35832d != null) {
            sb2.append(",cpsDisplayStr=");
            sb2.append(this.f35832d);
        }
        return sb2.toString();
    }

    D(Boolean bool, int i10, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(C4839e4.a.class);
        this.f35833e = enumMap;
        enumMap.put((EnumMap) C4839e4.a.AD_USER_DATA, (C4839e4.a) C4839e4.h(bool));
        this.f35829a = i10;
        this.f35830b = l();
        this.f35831c = bool2;
        this.f35832d = str;
    }

    private D(EnumMap enumMap, int i10, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(C4839e4.a.class);
        this.f35833e = enumMap2;
        enumMap2.putAll(enumMap);
        this.f35829a = i10;
        this.f35830b = l();
        this.f35831c = bool;
        this.f35832d = str;
    }
}
