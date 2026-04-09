package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class A1 extends F1 {

    /* renamed from: b, reason: collision with root package name */
    public final String f6911b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6912c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6913d;

    /* renamed from: e, reason: collision with root package name */
    public final long f6914e;

    /* renamed from: f, reason: collision with root package name */
    public final long f6915f;

    /* renamed from: g, reason: collision with root package name */
    public final F1[] f6916g;

    public A1(String str, int i, int i3, long j6, long j7, F1[] f1Arr) {
        super("CHAP");
        this.f6911b = str;
        this.f6912c = i;
        this.f6913d = i3;
        this.f6914e = j6;
        this.f6915f = j7;
        this.f6916g = f1Arr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && A1.class == obj.getClass()) {
            A1 a12 = (A1) obj;
            if (this.f6912c == a12.f6912c && this.f6913d == a12.f6913d && this.f6914e == a12.f6914e && this.f6915f == a12.f6915f && Objects.equals(this.f6911b, a12.f6911b) && Arrays.equals(this.f6916g, a12.f6916g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f6911b.hashCode() + ((((((((this.f6912c + 527) * 31) + this.f6913d) * 31) + ((int) this.f6914e)) * 31) + ((int) this.f6915f)) * 31);
    }
}
