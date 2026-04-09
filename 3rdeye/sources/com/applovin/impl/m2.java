package com.applovin.impl;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class m2 implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    private final String f20142a;

    /* renamed from: b, reason: collision with root package name */
    private final String f20143b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f20144c;

    /* renamed from: d, reason: collision with root package name */
    private final v2 f20145d;

    public m2(String str, String str2, boolean z10, v2 v2Var) {
        this.f20142a = str;
        this.f20143b = str2;
        this.f20144c = z10;
        this.f20145d = v2Var;
    }

    public String a() {
        return this.f20143b;
    }

    public List b() {
        List listL = this.f20145d.l();
        return (listL == null || listL.isEmpty()) ? Collections.singletonList(this.f20142a) : listL;
    }

    public String c() {
        return this.f20142a;
    }

    public v2 d() {
        return this.f20145d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            m2 m2Var = (m2) obj;
            String str = this.f20142a;
            if (str == null ? m2Var.f20142a != null : !str.equals(m2Var.f20142a)) {
                return false;
            }
            String str2 = this.f20143b;
            if (str2 == null ? m2Var.f20143b != null : !str2.equals(m2Var.f20143b)) {
                return false;
            }
            if (this.f20144c == m2Var.f20144c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f20142a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f20143b;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.f20144c ? 1 : 0);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(m2 m2Var) {
        return this.f20143b.compareToIgnoreCase(m2Var.f20143b);
    }
}
