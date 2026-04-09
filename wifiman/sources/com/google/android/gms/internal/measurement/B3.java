package com.google.android.gms.internal.measurement;

import android.net.Uri;
import m4.InterfaceC6764c;

/* loaded from: classes.dex */
public final class B3 {

    /* renamed from: a, reason: collision with root package name */
    final String f34941a;

    /* renamed from: b, reason: collision with root package name */
    final Uri f34942b;

    /* renamed from: c, reason: collision with root package name */
    final String f34943c;

    /* renamed from: d, reason: collision with root package name */
    final String f34944d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f34945e;

    /* renamed from: f, reason: collision with root package name */
    final boolean f34946f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f34947g;

    /* renamed from: h, reason: collision with root package name */
    final boolean f34948h;

    /* renamed from: i, reason: collision with root package name */
    final InterfaceC6764c f34949i;

    public B3(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }

    public final AbstractC4453s3 a(String str, double d10) {
        return AbstractC4453s3.b(this, str, Double.valueOf(-3.0d), true);
    }

    public final AbstractC4453s3 b(String str, long j10) {
        return AbstractC4453s3.c(this, str, Long.valueOf(j10), true);
    }

    public final AbstractC4453s3 c(String str, String str2) {
        return AbstractC4453s3.d(this, str, str2, true);
    }

    public final AbstractC4453s3 d(String str, boolean z10) {
        return AbstractC4453s3.a(this, str, Boolean.valueOf(z10), true);
    }

    public final B3 e() {
        return new B3(this.f34941a, this.f34942b, this.f34943c, this.f34944d, this.f34945e, this.f34946f, true, this.f34948h, this.f34949i);
    }

    public final B3 f() {
        if (!this.f34943c.isEmpty()) {
            throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
        }
        InterfaceC6764c interfaceC6764c = this.f34949i;
        if (interfaceC6764c == null) {
            return new B3(this.f34941a, this.f34942b, this.f34943c, this.f34944d, true, this.f34946f, this.f34947g, this.f34948h, interfaceC6764c);
        }
        throw new IllegalStateException("Cannot skip gservices both always and conditionally");
    }

    private B3(String str, Uri uri, String str2, String str3, boolean z10, boolean z11, boolean z12, boolean z13, InterfaceC6764c interfaceC6764c) {
        this.f34941a = str;
        this.f34942b = uri;
        this.f34943c = str2;
        this.f34944d = str3;
        this.f34945e = z10;
        this.f34946f = z11;
        this.f34947g = z12;
        this.f34948h = z13;
        this.f34949i = interfaceC6764c;
    }
}
