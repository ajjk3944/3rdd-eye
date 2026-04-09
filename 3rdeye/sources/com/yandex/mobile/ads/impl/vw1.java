package com.yandex.mobile.ads.impl;

import N7.C1094a9;

/* loaded from: classes3.dex */
public final class vw1 {

    /* renamed from: c, reason: collision with root package name */
    public static final vw1 f34726c = new vw1(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final long f34727a;

    /* renamed from: b, reason: collision with root package name */
    public final long f34728b;

    public vw1(long j4, long j10) {
        this.f34727a = j4;
        this.f34728b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && vw1.class == obj.getClass()) {
            vw1 vw1Var = (vw1) obj;
            if (this.f34727a == vw1Var.f34727a && this.f34728b == vw1Var.f34728b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f34727a) * 31) + ((int) this.f34728b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[timeUs=");
        sb.append(this.f34727a);
        sb.append(", position=");
        return C1094a9.f(sb, this.f34728b, "]");
    }
}
