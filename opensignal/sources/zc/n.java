package zc;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Objects;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: f, reason: collision with root package name */
    public static final n f27013f = new n((Boolean) null, 100, (Boolean) null, (String) null);

    /* renamed from: a, reason: collision with root package name */
    public final int f27014a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27015b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f27016c;

    /* renamed from: d, reason: collision with root package name */
    public final String f27017d;

    /* renamed from: e, reason: collision with root package name */
    public final EnumMap f27018e;

    public n(Boolean bool, int i10, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(n1.class);
        this.f27018e = enumMap;
        enumMap.put((EnumMap) n1.AD_USER_DATA, (n1) (bool == null ? l1.UNINITIALIZED : bool.booleanValue() ? l1.GRANTED : l1.DENIED));
        this.f27014a = i10;
        this.f27015b = e();
        this.f27016c = bool2;
        this.f27017d = str;
    }

    public static n b(String str) throws NumberFormatException {
        if (str == null || str.length() <= 0) {
            return f27013f;
        }
        String[] strArrSplit = str.split(":");
        int i10 = Integer.parseInt(strArrSplit[0]);
        EnumMap enumMap = new EnumMap(n1.class);
        n1[] n1VarArrZza = m1.DMA.zza();
        int length = n1VarArrZza.length;
        int i11 = 1;
        int i12 = 0;
        while (i12 < length) {
            enumMap.put((EnumMap) n1VarArrZza[i12], (n1) o1.e(strArrSplit[i11].charAt(0)));
            i12++;
            i11++;
        }
        return new n(enumMap, i10, (Boolean) null, (String) null);
    }

    public static n c(int i10, Bundle bundle) {
        if (bundle == null) {
            return new n((Boolean) null, i10, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(n1.class);
        for (n1 n1Var : m1.DMA.zza()) {
            enumMap.put((EnumMap) n1Var, (n1) o1.d(bundle.getString(n1Var.zze)));
        }
        return new n(enumMap, i10, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    public static Boolean d(Bundle bundle) {
        l1 l1VarD;
        if (bundle == null || (l1VarD = o1.d(bundle.getString("ad_personalization"))) == null) {
            return null;
        }
        int iOrdinal = l1VarD.ordinal();
        if (iOrdinal == 2) {
            return Boolean.FALSE;
        }
        if (iOrdinal != 3) {
            return null;
        }
        return Boolean.TRUE;
    }

    public final l1 a() {
        l1 l1Var = (l1) this.f27018e.get(n1.AD_USER_DATA);
        return l1Var == null ? l1.UNINITIALIZED : l1Var;
    }

    public final String e() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f27014a);
        for (n1 n1Var : m1.DMA.zza()) {
            sb2.append(":");
            sb2.append(o1.h((l1) this.f27018e.get(n1Var)));
        }
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (this.f27015b.equalsIgnoreCase(nVar.f27015b) && Objects.equals(this.f27016c, nVar.f27016c)) {
            return Objects.equals(this.f27017d, nVar.f27017d);
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = this.f27016c;
        int i10 = bool == null ? 3 : true != bool.booleanValue() ? 13 : 7;
        String str = this.f27017d;
        return ((str == null ? 17 : str.hashCode()) * 137) + this.f27015b.hashCode() + (i10 * 29);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(o1.a(this.f27014a));
        for (n1 n1Var : m1.DMA.zza()) {
            sb2.append(",");
            sb2.append(n1Var.zze);
            sb2.append("=");
            l1 l1Var = (l1) this.f27018e.get(n1Var);
            if (l1Var == null) {
                sb2.append("uninitialized");
            } else {
                int iOrdinal = l1Var.ordinal();
                if (iOrdinal == 0) {
                    sb2.append("uninitialized");
                } else if (iOrdinal == 1) {
                    sb2.append("eu_consent_policy");
                } else if (iOrdinal == 2) {
                    sb2.append("denied");
                } else if (iOrdinal == 3) {
                    sb2.append("granted");
                }
            }
        }
        Boolean bool = this.f27016c;
        if (bool != null) {
            sb2.append(",isDmaRegion=");
            sb2.append(bool);
        }
        String str = this.f27017d;
        if (str != null) {
            sb2.append(",cpsDisplayStr=");
            sb2.append(str);
        }
        return sb2.toString();
    }

    public n(EnumMap enumMap, int i10, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(n1.class);
        this.f27018e = enumMap2;
        enumMap2.putAll(enumMap);
        this.f27014a = i10;
        this.f27015b = e();
        this.f27016c = bool;
        this.f27017d = str;
    }
}
