package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class cl0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f25695a;

    /* renamed from: b, reason: collision with root package name */
    private final int f25696b;

    /* renamed from: c, reason: collision with root package name */
    private final int f25697c;

    public cl0(int i, int i10, String name) {
        kotlin.jvm.internal.l.f(name, "name");
        this.f25695a = name;
        this.f25696b = i;
        this.f25697c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cl0)) {
            return false;
        }
        cl0 cl0Var = (cl0) obj;
        return kotlin.jvm.internal.l.b(this.f25695a, cl0Var.f25695a) && this.f25696b == cl0Var.f25696b && this.f25697c == cl0Var.f25697c;
    }

    public final int hashCode() {
        return this.f25697c + sx1.a(this.f25696b, this.f25695a.hashCode() * 31, 31);
    }

    public final String toString() {
        String str = this.f25695a;
        int i = this.f25696b;
        int i10 = this.f25697c;
        StringBuilder sb = new StringBuilder("InstalledPackage(name=");
        sb.append(str);
        sb.append(", minVersion=");
        sb.append(i);
        sb.append(", maxVersion=");
        return B4.i.j(sb, i10, ")");
    }
}
