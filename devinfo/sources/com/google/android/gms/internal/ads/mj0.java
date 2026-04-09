package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class mj0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f13909a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13910b;

    /* renamed from: c, reason: collision with root package name */
    public int f13911c;

    /* renamed from: d, reason: collision with root package name */
    public long f13912d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f13913e;

    public mj0(String str, String str2, int i4, long j, Integer num) {
        this.f13909a = str;
        this.f13910b = str2;
        this.f13911c = i4;
        this.f13912d = j;
        this.f13913e = num;
    }

    public final String toString() {
        Integer num;
        int i4 = this.f13911c;
        long j = this.f13912d;
        String str = this.f13909a;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(i4).length() + 1 + String.valueOf(j).length());
        sb2.append(str);
        sb2.append(".");
        sb2.append(i4);
        sb2.append(".");
        sb2.append(j);
        String string = sb2.toString();
        String str2 = this.f13910b;
        if (!TextUtils.isEmpty(str2)) {
            string = r5.c.m(new StringBuilder(string.length() + 1 + String.valueOf(str2).length()), string, ".", str2);
        }
        if (!((Boolean) va.s.f36163e.f36166c.a(sk.Z1)).booleanValue() || (num = this.f13913e) == null || TextUtils.isEmpty(str2)) {
            return string;
        }
        StringBuilder sb3 = new StringBuilder(string.length() + 1 + num.toString().length());
        sb3.append(string);
        sb3.append(".");
        sb3.append(num);
        return sb3.toString();
    }
}
