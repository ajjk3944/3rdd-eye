package com.applovin.impl;

import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class u2 implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    private final String f5809a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5810b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f5811c;

    /* renamed from: d, reason: collision with root package name */
    private final e3 f5812d;

    public u2(String str, String str2, boolean z3, e3 e3Var) {
        this.f5809a = str;
        this.f5810b = str2;
        this.f5811c = z3;
        this.f5812d = e3Var;
    }

    public String a() {
        return this.f5810b;
    }

    public List b() {
        List listL = this.f5812d.l();
        return (listL == null || listL.isEmpty()) ? Collections.singletonList(this.f5809a) : listL;
    }

    public String c() {
        return this.f5809a;
    }

    public e3 d() {
        return this.f5812d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            u2 u2Var = (u2) obj;
            String str = this.f5809a;
            if (str == null ? u2Var.f5809a != null : !str.equals(u2Var.f5809a)) {
                return false;
            }
            String str2 = this.f5810b;
            if (str2 == null ? u2Var.f5810b != null : !str2.equals(u2Var.f5810b)) {
                return false;
            }
            if (this.f5811c == u2Var.f5811c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f5809a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f5810b;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.f5811c ? 1 : 0);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(u2 u2Var) {
        return this.f5810b.compareToIgnoreCase(u2Var.f5810b);
    }
}
