package com.mbridge.msdk.click.entity;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public String f12942a;

    /* renamed from: b, reason: collision with root package name */
    public String f12943b;

    /* renamed from: c, reason: collision with root package name */
    public String f12944c;

    /* renamed from: d, reason: collision with root package name */
    public String f12945d;

    /* renamed from: e, reason: collision with root package name */
    public int f12946e;

    /* renamed from: f, reason: collision with root package name */
    public int f12947f;

    /* renamed from: g, reason: collision with root package name */
    public String f12948g;

    /* renamed from: h, reason: collision with root package name */
    public String f12949h;

    public String a() {
        return "statusCode=" + this.f12947f + ", location=" + this.f12942a + ", contentType=" + this.f12943b + ", contentLength=" + this.f12946e + ", contentEncoding=" + this.f12944c + ", referer=" + this.f12945d;
    }

    @NonNull
    public String toString() {
        return "ClickResponseHeader{location='" + this.f12942a + "', contentType='" + this.f12943b + "', contentEncoding='" + this.f12944c + "', referer='" + this.f12945d + "', contentLength=" + this.f12946e + ", statusCode=" + this.f12947f + ", url='" + this.f12948g + "', exception='" + this.f12949h + "'}";
    }
}
