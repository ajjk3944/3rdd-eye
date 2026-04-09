package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.Pq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0685Pq {

    /* renamed from: a, reason: collision with root package name */
    public final String f10517a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10518b;

    /* renamed from: c, reason: collision with root package name */
    public int f10519c;

    /* renamed from: d, reason: collision with root package name */
    public long f10520d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f10521e;

    public C0685Pq(String str, String str2, int i, long j6, Integer num) {
        this.f10517a = str;
        this.f10518b = str2;
        this.f10519c = i;
        this.f10520d = j6;
        this.f10521e = num;
    }

    public final String toString() {
        Integer num;
        int i = this.f10519c;
        long j6 = this.f10520d;
        String str = this.f10517a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(i).length() + 1 + String.valueOf(j6).length());
        sb.append(str);
        sb.append(".");
        sb.append(i);
        sb.append(".");
        sb.append(j6);
        String string = sb.toString();
        String str2 = this.f10518b;
        if (!TextUtils.isEmpty(str2)) {
            string = AbstractC1135f5.n(new StringBuilder(string.length() + 1 + String.valueOf(str2).length()), string, ".", str2);
        }
        if (!((Boolean) C2841s.f23267e.f23270c.a(H9.Z1)).booleanValue() || (num = this.f10521e) == null || TextUtils.isEmpty(str2)) {
            return string;
        }
        StringBuilder sb2 = new StringBuilder(string.length() + 1 + num.toString().length());
        sb2.append(string);
        sb2.append(".");
        sb2.append(num);
        return sb2.toString();
    }
}
