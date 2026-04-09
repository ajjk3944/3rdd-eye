package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class cr0 implements br0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f10200a;

    public cr0(va.z2 z2Var, String str, int i4, String str2, va.f3 f3Var) {
        HashSet hashSet = new HashSet(Arrays.asList(str2.split(",")));
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        arrayList.add(str);
        if (hashSet.contains("networkType")) {
            arrayList.add(Integer.valueOf(i4));
        }
        if (hashSet.contains("birthday")) {
            arrayList.add(Long.valueOf(z2Var.f36189b));
        }
        if (hashSet.contains("extras")) {
            arrayList.add(a(z2Var.f36190c));
        } else if (hashSet.contains("npa")) {
            arrayList.add(z2Var.f36190c.getString("npa"));
        }
        if (hashSet.contains("gender")) {
            arrayList.add(Integer.valueOf(z2Var.f36191d));
        }
        if (hashSet.contains("keywords")) {
            List list = z2Var.f36192e;
            if (list != null) {
                arrayList.add(list.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("isTestDevice")) {
            arrayList.add(Boolean.valueOf(z2Var.f36193f));
        }
        if (hashSet.contains("tagForChildDirectedTreatment")) {
            arrayList.add(Integer.valueOf(z2Var.g));
        }
        if (hashSet.contains("manualImpressionsEnabled")) {
            arrayList.add(Boolean.valueOf(z2Var.f36194h));
        }
        if (hashSet.contains("publisherProvidedId")) {
            arrayList.add(z2Var.f36195i);
        }
        if (hashSet.contains("location")) {
            Location location = z2Var.f36196k;
            if (location != null) {
                arrayList.add(location.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("contentUrl")) {
            arrayList.add(z2Var.f36197l);
        }
        if (hashSet.contains("networkExtras")) {
            arrayList.add(a(z2Var.f36198m));
        }
        if (hashSet.contains("customTargeting")) {
            arrayList.add(a(z2Var.f36199n));
        }
        if (hashSet.contains("categoryExclusions")) {
            List list2 = z2Var.f36200o;
            if (list2 != null) {
                arrayList.add(list2.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("requestAgent")) {
            arrayList.add(z2Var.f36201p);
        }
        if (hashSet.contains("requestPackage")) {
            arrayList.add(z2Var.f36202q);
        }
        if (hashSet.contains("isDesignedForFamilies")) {
            arrayList.add(Boolean.valueOf(z2Var.f36203r));
        }
        if (hashSet.contains("tagForUnderAgeOfConsent")) {
            arrayList.add(Integer.valueOf(z2Var.f36205t));
        }
        if (hashSet.contains("maxAdContentRating")) {
            arrayList.add(z2Var.f36206u);
        }
        if (hashSet.contains("orientation")) {
            if (f3Var != null) {
                arrayList.add(Integer.valueOf(f3Var.f36093a));
            } else {
                arrayList.add(null);
            }
        }
        this.f10200a = arrayList.toArray();
    }

    public static String a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            Object obj = bundle.get((String) it.next());
            sb2.append(obj == null ? "null" : obj instanceof Bundle ? a((Bundle) obj) : obj.toString());
        }
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cr0) {
            return Arrays.equals(this.f10200a, ((cr0) obj).f10200a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f10200a);
    }

    public final String toString() {
        Object[] objArr = this.f10200a;
        int iHashCode = Arrays.hashCode(objArr);
        String string = Arrays.toString(objArr);
        StringBuilder sb2 = new StringBuilder(String.valueOf(iHashCode).length() + 10 + String.valueOf(string).length() + 1);
        sb2.append("[PoolKey#");
        sb2.append(iHashCode);
        sb2.append(" ");
        sb2.append(string);
        sb2.append("]");
        return sb2.toString();
    }
}
