package ec;

import android.os.Bundle;
import j$.util.Objects;
import java.util.EnumMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class o {

    /* renamed from: f, reason: collision with root package name */
    public static final o f22939f = new o((Boolean) null, 100, (Boolean) null, (String) null);

    /* renamed from: a, reason: collision with root package name */
    public final int f22940a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22941b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f22942c;

    /* renamed from: d, reason: collision with root package name */
    public final String f22943d;

    /* renamed from: e, reason: collision with root package name */
    public final EnumMap f22944e;

    public o(Boolean bool, int i4, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(z1.class);
        this.f22944e = enumMap;
        enumMap.put((EnumMap) z1.AD_USER_DATA, (z1) (bool == null ? x1.UNINITIALIZED : bool.booleanValue() ? x1.GRANTED : x1.DENIED));
        this.f22940a = i4;
        this.f22941b = d();
        this.f22942c = bool2;
        this.f22943d = str;
    }

    public static o b(String str) throws NumberFormatException {
        if (str == null || str.length() <= 0) {
            return f22939f;
        }
        String[] strArrSplit = str.split(":");
        int i4 = Integer.parseInt(strArrSplit[0]);
        EnumMap enumMap = new EnumMap(z1.class);
        z1[] z1VarArr = y1.DMA.f23203a;
        int length = z1VarArr.length;
        int i10 = 1;
        int i11 = 0;
        while (i11 < length) {
            enumMap.put((EnumMap) z1VarArr[i11], (z1) a2.e(strArrSplit[i10].charAt(0)));
            i11++;
            i10++;
        }
        return new o(enumMap, i4, (Boolean) null, (String) null);
    }

    public static o c(int i4, Bundle bundle) {
        if (bundle == null) {
            return new o((Boolean) null, i4, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(z1.class);
        for (z1 z1Var : y1.DMA.f23203a) {
            enumMap.put((EnumMap) z1Var, (z1) a2.d(bundle.getString(z1Var.f23248a)));
        }
        return new o(enumMap, i4, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    public final x1 a() {
        x1 x1Var = (x1) this.f22944e.get(z1.AD_USER_DATA);
        return x1Var == null ? x1.UNINITIALIZED : x1Var;
    }

    public final String d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f22940a);
        for (z1 z1Var : y1.DMA.f23203a) {
            sb2.append(":");
            sb2.append(a2.h((x1) this.f22944e.get(z1Var)));
        }
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f22941b.equalsIgnoreCase(oVar.f22941b) && Objects.equals(this.f22942c, oVar.f22942c)) {
            return Objects.equals(this.f22943d, oVar.f22943d);
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = this.f22942c;
        int i4 = bool == null ? 3 : true != bool.booleanValue() ? 13 : 7;
        String str = this.f22943d;
        return ((str == null ? 17 : str.hashCode()) * 137) + this.f22941b.hashCode() + (i4 * 29);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(a2.a(this.f22940a));
        for (z1 z1Var : y1.DMA.f23203a) {
            sb2.append(",");
            sb2.append(z1Var.f23248a);
            sb2.append("=");
            x1 x1Var = (x1) this.f22944e.get(z1Var);
            if (x1Var == null) {
                sb2.append("uninitialized");
            } else {
                int iOrdinal = x1Var.ordinal();
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
        Boolean bool = this.f22942c;
        if (bool != null) {
            sb2.append(",isDmaRegion=");
            sb2.append(bool);
        }
        String str = this.f22943d;
        if (str != null) {
            sb2.append(",cpsDisplayStr=");
            sb2.append(str);
        }
        return sb2.toString();
    }

    public o(EnumMap enumMap, int i4, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(z1.class);
        this.f22944e = enumMap2;
        enumMap2.putAll(enumMap);
        this.f22940a = i4;
        this.f22941b = d();
        this.f22942c = bool;
        this.f22943d = str;
    }
}
