package com.applovin.impl;

import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class h3 {

    /* renamed from: b, reason: collision with root package name */
    private static final Set f19495b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    public static final h3 f19496c = a("ar");

    /* renamed from: d, reason: collision with root package name */
    public static final h3 f19497d = a("ttdasi_ms");

    /* renamed from: a, reason: collision with root package name */
    private String f19498a;

    public interface a {
        Object a(Object obj);
    }

    private h3(String str) {
        this.f19498a = str;
    }

    public boolean a(Object obj) {
        return obj instanceof h3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h3)) {
            return false;
        }
        h3 h3Var = (h3) obj;
        if (!h3Var.a(this)) {
            return false;
        }
        String strA = a();
        String strA2 = h3Var.a();
        return strA != null ? strA.equals(strA2) : strA2 == null;
    }

    public int hashCode() {
        String strA = a();
        return (strA == null ? 43 : strA.hashCode()) + 59;
    }

    public String toString() {
        return this.f19498a;
    }

    public String a() {
        return this.f19498a;
    }

    private static h3 a(String str) {
        Set set = f19495b;
        if (!set.contains(str)) {
            set.add(str);
            return new h3(str);
        }
        throw new IllegalArgumentException(androidx.work.s.d("Key has already been used: ", str));
    }
}
