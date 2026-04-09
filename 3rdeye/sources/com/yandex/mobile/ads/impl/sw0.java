package com.yandex.mobile.ads.impl;

import N7.C1094a9;
import java.util.List;

/* loaded from: classes3.dex */
public final class sw0 {

    /* renamed from: a, reason: collision with root package name */
    private final ku0 f33301a;

    /* renamed from: b, reason: collision with root package name */
    private final ya2 f33302b;

    /* renamed from: c, reason: collision with root package name */
    private final List<jj0> f33303c;

    public sw0(ku0 ku0Var, ya2 ya2Var, List<jj0> list) {
        this.f33301a = ku0Var;
        this.f33302b = ya2Var;
        this.f33303c = list;
    }

    public static sw0 a(sw0 sw0Var, ya2 ya2Var) {
        return new sw0(sw0Var.f33301a, ya2Var, sw0Var.f33303c);
    }

    public final ku0 b() {
        return this.f33301a;
    }

    public final ya2 c() {
        return this.f33302b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sw0)) {
            return false;
        }
        sw0 sw0Var = (sw0) obj;
        return kotlin.jvm.internal.l.b(this.f33301a, sw0Var.f33301a) && kotlin.jvm.internal.l.b(this.f33302b, sw0Var.f33302b) && kotlin.jvm.internal.l.b(this.f33303c, sw0Var.f33303c);
    }

    public final int hashCode() {
        ku0 ku0Var = this.f33301a;
        int iHashCode = (ku0Var == null ? 0 : ku0Var.hashCode()) * 31;
        ya2 ya2Var = this.f33302b;
        int iHashCode2 = (iHashCode + (ya2Var == null ? 0 : ya2Var.hashCode())) * 31;
        List<jj0> list = this.f33303c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        ku0 ku0Var = this.f33301a;
        ya2 ya2Var = this.f33302b;
        List<jj0> list = this.f33303c;
        StringBuilder sb = new StringBuilder("MediaValue(media=");
        sb.append(ku0Var);
        sb.append(", video=");
        sb.append(ya2Var);
        sb.append(", imageValues=");
        return C1094a9.h(sb, list, ")");
    }

    public final List<jj0> a() {
        return this.f33303c;
    }
}
