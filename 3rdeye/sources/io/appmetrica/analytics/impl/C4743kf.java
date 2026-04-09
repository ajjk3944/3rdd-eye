package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.kf, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4743kf {

    /* renamed from: a, reason: collision with root package name */
    public final String f41140a;

    /* renamed from: b, reason: collision with root package name */
    public final String f41141b;

    public C4743kf(String str, String str2) {
        this.f41140a = str;
        this.f41141b = a(str2);
    }

    public final String a(String str) {
        return str != null ? B4.f.c(new StringBuilder(), this.f41140a, str) : this.f41140a;
    }
}
