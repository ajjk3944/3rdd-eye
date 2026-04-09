package defpackage;

import android.location.Location;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class g93 implements f93 {
    public final Object[] a;

    public g93(pc4 pc4Var, String str, int i, String str2, vi4 vi4Var) {
        HashSet hashSet = new HashSet(Arrays.asList(str2.split(",")));
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        arrayList.add(str);
        if (hashSet.contains("networkType")) {
            arrayList.add(Integer.valueOf(i));
        }
        if (hashSet.contains("birthday")) {
            arrayList.add(Long.valueOf(pc4Var.g));
        }
        if (hashSet.contains("extras")) {
            arrayList.add(a(pc4Var.h));
        } else if (hashSet.contains("npa")) {
            arrayList.add(pc4Var.h.getString("npa"));
        }
        if (hashSet.contains("gender")) {
            arrayList.add(Integer.valueOf(pc4Var.i));
        }
        if (hashSet.contains("keywords")) {
            List list = pc4Var.j;
            if (list != null) {
                arrayList.add(list.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("isTestDevice")) {
            arrayList.add(Boolean.valueOf(pc4Var.k));
        }
        if (hashSet.contains("tagForChildDirectedTreatment")) {
            arrayList.add(Integer.valueOf(pc4Var.l));
        }
        if (hashSet.contains("manualImpressionsEnabled")) {
            arrayList.add(Boolean.valueOf(pc4Var.m));
        }
        if (hashSet.contains("publisherProvidedId")) {
            arrayList.add(pc4Var.n);
        }
        if (hashSet.contains("location")) {
            Location location = pc4Var.p;
            if (location != null) {
                arrayList.add(location.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("contentUrl")) {
            arrayList.add(pc4Var.q);
        }
        if (hashSet.contains("networkExtras")) {
            arrayList.add(a(pc4Var.r));
        }
        if (hashSet.contains("customTargeting")) {
            arrayList.add(a(pc4Var.s));
        }
        if (hashSet.contains("categoryExclusions")) {
            List list2 = pc4Var.t;
            if (list2 != null) {
                arrayList.add(list2.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("requestAgent")) {
            arrayList.add(pc4Var.u);
        }
        if (hashSet.contains("requestPackage")) {
            arrayList.add(pc4Var.v);
        }
        if (hashSet.contains("isDesignedForFamilies")) {
            arrayList.add(Boolean.valueOf(pc4Var.w));
        }
        if (hashSet.contains("tagForUnderAgeOfConsent")) {
            arrayList.add(Integer.valueOf(pc4Var.y));
        }
        if (hashSet.contains("maxAdContentRating")) {
            arrayList.add(pc4Var.z);
        }
        if (hashSet.contains("orientation")) {
            if (vi4Var != null) {
                arrayList.add(Integer.valueOf(vi4Var.f));
            } else {
                arrayList.add(null);
            }
        }
        this.a = arrayList.toArray();
    }

    public static String a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            Object obj = bundle.get((String) it.next());
            sb.append(obj == null ? "null" : obj instanceof Bundle ? a((Bundle) obj) : obj.toString());
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g93) {
            return Arrays.equals(this.a, ((g93) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        Object[] objArr = this.a;
        int iHashCode = Arrays.hashCode(objArr);
        String string = Arrays.toString(objArr);
        StringBuilder sb = new StringBuilder(String.valueOf(iHashCode).length() + 10 + String.valueOf(string).length() + 1);
        sb.append("[PoolKey#");
        sb.append(iHashCode);
        sb.append(" ");
        sb.append(string);
        sb.append("]");
        return sb.toString();
    }
}
