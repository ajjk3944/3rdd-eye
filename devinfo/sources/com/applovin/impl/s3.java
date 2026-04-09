package com.applovin.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class s3 {

    /* renamed from: c, reason: collision with root package name */
    private static final Set f5287c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    private static final Map f5288d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final s3 f5289e;

    /* renamed from: f, reason: collision with root package name */
    public static final s3 f5290f;
    public static final s3 g;

    /* renamed from: a, reason: collision with root package name */
    private String f5291a;

    /* renamed from: b, reason: collision with root package name */
    private Set f5292b;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public enum a {
        SESSION("session"),
        INSTALL("install");


        /* renamed from: a, reason: collision with root package name */
        private final String f5296a;

        a(String str) {
            this.f5296a = str;
        }

        public String b() {
            return this.f5296a;
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface b {
        Object a(Object obj);
    }

    static {
        a aVar = a.SESSION;
        f5289e = a("ars", aVar, a.INSTALL);
        f5290f = a("ar", aVar);
        g = a("ttdasi_ms", aVar);
    }

    private s3(String str, Set set) {
        this.f5291a = str;
        this.f5292b = set;
    }

    public boolean a(Object obj) {
        return obj instanceof s3;
    }

    public Set b() {
        return this.f5292b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s3)) {
            return false;
        }
        s3 s3Var = (s3) obj;
        if (!s3Var.a(this)) {
            return false;
        }
        String strA = a();
        String strA2 = s3Var.a();
        if (strA != null ? !strA.equals(strA2) : strA2 != null) {
            return false;
        }
        Set setB = b();
        Set setB2 = s3Var.b();
        return setB != null ? setB.equals(setB2) : setB2 == null;
    }

    public int hashCode() {
        String strA = a();
        int iHashCode = strA == null ? 43 : strA.hashCode();
        Set setB = b();
        return ((iHashCode + 59) * 59) + (setB != null ? setB.hashCode() : 43);
    }

    public String toString() {
        return this.f5291a;
    }

    public String a() {
        return this.f5291a;
    }

    private static s3 a(String str, a... aVarArr) {
        Set set = f5287c;
        if (!set.contains(str)) {
            s3 s3Var = new s3(str, new HashSet(Arrays.asList(aVarArr)));
            set.add(str);
            f5288d.put(str, s3Var);
            return s3Var;
        }
        throw new IllegalArgumentException(je.u.t("Key has already been used: ", str));
    }

    public boolean a(a aVar) {
        return this.f5292b.contains(aVar);
    }

    public static s3 a(String str) {
        return (s3) f5288d.get(str);
    }
}
