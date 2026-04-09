package com.yandex.mobile.ads.impl;

import N7.C1154e9;

/* loaded from: classes3.dex */
public final class ni {

    /* renamed from: a, reason: collision with root package name */
    private final String f30881a;

    /* renamed from: b, reason: collision with root package name */
    private final String f30882b;

    /* renamed from: c, reason: collision with root package name */
    private final String f30883c;

    /* renamed from: d, reason: collision with root package name */
    private final String f30884d;

    public ni(String str, String str2, String str3, String str4) {
        this.f30881a = str;
        this.f30882b = str2;
        this.f30883c = str3;
        this.f30884d = str4;
    }

    public final String a() {
        return this.f30884d;
    }

    public final String b() {
        return this.f30883c;
    }

    public final String c() {
        return this.f30882b;
    }

    public final String d() {
        return this.f30881a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ni)) {
            return false;
        }
        ni niVar = (ni) obj;
        return kotlin.jvm.internal.l.b(this.f30881a, niVar.f30881a) && kotlin.jvm.internal.l.b(this.f30882b, niVar.f30882b) && kotlin.jvm.internal.l.b(this.f30883c, niVar.f30883c) && kotlin.jvm.internal.l.b(this.f30884d, niVar.f30884d);
    }

    public final int hashCode() {
        String str = this.f30881a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f30882b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f30883c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f30884d;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f30881a;
        String str2 = this.f30882b;
        return C1154e9.j(j6.l.d("BackgroundColors(top=", str, ", right=", str2, ", left="), this.f30883c, ", bottom=", this.f30884d, ")");
    }
}
