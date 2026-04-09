package com.mbridge.msdk.mbsignalcommon.windvane;

/* loaded from: classes3.dex */
public enum d {
    JS("js", "application/x-javascript"),
    CSS("css", "text/css"),
    JPG("jpg", "image/jpeg"),
    JPEG("jpep", "image/jpeg"),
    PNG("png", "image/png"),
    WEBP("webp", "image/webp"),
    GIF("gif", "image/gif"),
    HTM("htm", "text/html"),
    HTML("html", "text/html");


    /* renamed from: a, reason: collision with root package name */
    private String f16260a;

    /* renamed from: b, reason: collision with root package name */
    private String f16261b;

    d(String str, String str2) {
        this.f16260a = str;
        this.f16261b = str2;
    }

    public String g() {
        return this.f16261b;
    }

    public String h() {
        return this.f16260a;
    }
}
