package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* renamed from: com.google.android.gms.internal.ads.uu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1985uu implements InterfaceC1931tu {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f17187a;

    public C1985uu(q2.a1 a1Var, String str, int i, String str2, q2.g1 g1Var) {
        HashSet hashSet = new HashSet(Arrays.asList(str2.split(",")));
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        arrayList.add(str);
        if (hashSet.contains("networkType")) {
            arrayList.add(Integer.valueOf(i));
        }
        if (hashSet.contains("birthday")) {
            arrayList.add(Long.valueOf(a1Var.f23166b));
        }
        if (hashSet.contains("extras")) {
            arrayList.add(a(a1Var.f23167c));
        } else if (hashSet.contains("npa")) {
            arrayList.add(a1Var.f23167c.getString("npa"));
        }
        if (hashSet.contains("gender")) {
            arrayList.add(Integer.valueOf(a1Var.f23168d));
        }
        if (hashSet.contains("keywords")) {
            List list = a1Var.f23169e;
            if (list != null) {
                arrayList.add(list.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("isTestDevice")) {
            arrayList.add(Boolean.valueOf(a1Var.f23170f));
        }
        if (hashSet.contains("tagForChildDirectedTreatment")) {
            arrayList.add(Integer.valueOf(a1Var.f23171g));
        }
        if (hashSet.contains("manualImpressionsEnabled")) {
            arrayList.add(Boolean.valueOf(a1Var.f23172h));
        }
        if (hashSet.contains("publisherProvidedId")) {
            arrayList.add(a1Var.i);
        }
        if (hashSet.contains("location")) {
            Location location = a1Var.f23174k;
            if (location != null) {
                arrayList.add(location.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("contentUrl")) {
            arrayList.add(a1Var.f23175l);
        }
        if (hashSet.contains("networkExtras")) {
            arrayList.add(a(a1Var.f23176m));
        }
        if (hashSet.contains("customTargeting")) {
            arrayList.add(a(a1Var.f23177n));
        }
        if (hashSet.contains("categoryExclusions")) {
            List list2 = a1Var.f23152C;
            if (list2 != null) {
                arrayList.add(list2.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("requestAgent")) {
            arrayList.add(a1Var.f23153D);
        }
        if (hashSet.contains("requestPackage")) {
            arrayList.add(a1Var.f23154E);
        }
        if (hashSet.contains("isDesignedForFamilies")) {
            arrayList.add(Boolean.valueOf(a1Var.f23155F));
        }
        if (hashSet.contains("tagForUnderAgeOfConsent")) {
            arrayList.add(Integer.valueOf(a1Var.f23157H));
        }
        if (hashSet.contains("maxAdContentRating")) {
            arrayList.add(a1Var.f23158I);
        }
        if (hashSet.contains("orientation")) {
            if (g1Var != null) {
                arrayList.add(Integer.valueOf(g1Var.f23223a));
            } else {
                arrayList.add(null);
            }
        }
        this.f17187a = arrayList.toArray();
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
        if (obj instanceof C1985uu) {
            return Arrays.equals(this.f17187a, ((C1985uu) obj).f17187a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f17187a);
    }

    public final String toString() {
        Object[] objArr = this.f17187a;
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
