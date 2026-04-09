package com.yandex.mobile.ads.impl;

import N7.C1094a9;
import java.util.List;

/* loaded from: classes3.dex */
public final class f02 {

    /* renamed from: a, reason: collision with root package name */
    private final String f27159a;

    /* renamed from: b, reason: collision with root package name */
    private final String f27160b;

    /* renamed from: c, reason: collision with root package name */
    private final String f27161c;

    /* renamed from: d, reason: collision with root package name */
    private final String f27162d;

    /* renamed from: e, reason: collision with root package name */
    private final ni f27163e;

    /* renamed from: f, reason: collision with root package name */
    private final xz1 f27164f;

    /* renamed from: g, reason: collision with root package name */
    private final List<xz1> f27165g;

    public f02() {
        this(0);
    }

    public final ni a() {
        return this.f27163e;
    }

    public final xz1 b() {
        return this.f27164f;
    }

    public final List<xz1> c() {
        return this.f27165g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f02)) {
            return false;
        }
        f02 f02Var = (f02) obj;
        return kotlin.jvm.internal.l.b(this.f27159a, f02Var.f27159a) && kotlin.jvm.internal.l.b(this.f27160b, f02Var.f27160b) && kotlin.jvm.internal.l.b(this.f27161c, f02Var.f27161c) && kotlin.jvm.internal.l.b(this.f27162d, f02Var.f27162d) && kotlin.jvm.internal.l.b(this.f27163e, f02Var.f27163e) && kotlin.jvm.internal.l.b(this.f27164f, f02Var.f27164f) && kotlin.jvm.internal.l.b(this.f27165g, f02Var.f27165g);
    }

    public final int hashCode() {
        String str = this.f27159a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f27160b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f27161c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f27162d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ni niVar = this.f27163e;
        int iHashCode5 = (iHashCode4 + (niVar == null ? 0 : niVar.hashCode())) * 31;
        xz1 xz1Var = this.f27164f;
        int iHashCode6 = (iHashCode5 + (xz1Var == null ? 0 : xz1Var.hashCode())) * 31;
        List<xz1> list = this.f27165g;
        return iHashCode6 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f27159a;
        String str2 = this.f27160b;
        String str3 = this.f27161c;
        String str4 = this.f27162d;
        ni niVar = this.f27163e;
        xz1 xz1Var = this.f27164f;
        List<xz1> list = this.f27165g;
        StringBuilder sbD = j6.l.d("SmartCenterSettings(colorWizButton=", str, ", colorWizButtonText=", str2, ", colorWizBack=");
        com.google.android.gms.measurement.internal.a.l(sbD, str3, ", colorWizBackRight=", str4, ", backgroundColors=");
        sbD.append(niVar);
        sbD.append(", smartCenter=");
        sbD.append(xz1Var);
        sbD.append(", smartCenters=");
        return C1094a9.h(sbD, list, ")");
    }

    public /* synthetic */ f02(int i) {
        this(null, null, null, null, null, null, null);
    }

    public f02(String str, String str2, String str3, String str4, ni niVar, xz1 xz1Var, List<xz1> list) {
        this.f27159a = str;
        this.f27160b = str2;
        this.f27161c = str3;
        this.f27162d = str4;
        this.f27163e = niVar;
        this.f27164f = xz1Var;
        this.f27165g = list;
    }
}
