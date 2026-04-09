package com.applovin.impl;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class u2 implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    private final String f8199a;

    /* renamed from: b, reason: collision with root package name */
    private final String f8200b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f8201c;

    /* renamed from: d, reason: collision with root package name */
    private final e3 f8202d;

    public u2(String str, String str2, boolean z10, e3 e3Var) {
        this.f8199a = str;
        this.f8200b = str2;
        this.f8201c = z10;
        this.f8202d = e3Var;
    }

    public String a() {
        return this.f8200b;
    }

    public List b() {
        List listL = this.f8202d.l();
        return (listL == null || listL.isEmpty()) ? Collections.singletonList(this.f8199a) : listL;
    }

    public String c() {
        return this.f8199a;
    }

    public e3 d() {
        return this.f8202d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            u2 u2Var = (u2) obj;
            String str = this.f8199a;
            if (str == null ? u2Var.f8199a != null : !str.equals(u2Var.f8199a)) {
                return false;
            }
            String str2 = this.f8200b;
            if (str2 == null ? u2Var.f8200b != null : !str2.equals(u2Var.f8200b)) {
                return false;
            }
            if (this.f8201c == u2Var.f8201c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f8199a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f8200b;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.f8201c ? 1 : 0);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(u2 u2Var) {
        return this.f8200b.compareToIgnoreCase(u2Var.f8200b);
    }
}
