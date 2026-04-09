package com.yandex.mobile.ads.impl;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.yandex.mobile.ads.impl.i3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4128i3 {

    /* renamed from: a, reason: collision with root package name */
    private final int f28451a;

    /* renamed from: b, reason: collision with root package name */
    private final String f28452b;

    /* renamed from: c, reason: collision with root package name */
    private final String f28453c;

    /* renamed from: d, reason: collision with root package name */
    private final String f28454d;

    public C4128i3(int i, String description, String displayMessage, String str) {
        kotlin.jvm.internal.l.f(description, "description");
        kotlin.jvm.internal.l.f(displayMessage, "displayMessage");
        this.f28451a = i;
        this.f28452b = description;
        this.f28453c = displayMessage;
        this.f28454d = str;
    }

    public final String a() {
        return this.f28454d;
    }

    public final int b() {
        return this.f28451a;
    }

    public final String c() {
        return this.f28452b;
    }

    public final String d() {
        return this.f28453c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4128i3)) {
            return false;
        }
        C4128i3 c4128i3 = (C4128i3) obj;
        return this.f28451a == c4128i3.f28451a && kotlin.jvm.internal.l.b(this.f28452b, c4128i3.f28452b) && kotlin.jvm.internal.l.b(this.f28453c, c4128i3.f28453c) && kotlin.jvm.internal.l.b(this.f28454d, c4128i3.f28454d);
    }

    public final int hashCode() {
        int iA = C4121h3.a(this.f28453c, C4121h3.a(this.f28452b, this.f28451a * 31, 31), 31);
        String str = this.f28454d;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return String.format(Locale.US, "AdFetchRequestError (code: %d, description: %s, adUnitId: %s, display_message: %s)", Arrays.copyOf(new Object[]{Integer.valueOf(this.f28451a), this.f28452b, this.f28454d, this.f28453c}, 4));
    }
}
