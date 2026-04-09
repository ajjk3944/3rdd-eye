package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class P2 {

    /* renamed from: a, reason: collision with root package name */
    public String f36162a;

    /* renamed from: b, reason: collision with root package name */
    public String f36163b;

    /* renamed from: c, reason: collision with root package name */
    private long f36164c;

    /* renamed from: d, reason: collision with root package name */
    public Bundle f36165d;

    public P2(String str, String str2, Bundle bundle, long j10) {
        this.f36162a = str;
        this.f36163b = str2;
        this.f36165d = bundle == null ? new Bundle() : bundle;
        this.f36164c = j10;
    }

    public static P2 b(L l10) {
        return new P2(l10.f35974a, l10.f35976c, l10.f35975b.g(), l10.f35977d);
    }

    public final L a() {
        return new L(this.f36162a, new K(new Bundle(this.f36165d)), this.f36163b, this.f36164c);
    }

    public final String toString() {
        return "origin=" + this.f36163b + ",name=" + this.f36162a + ",params=" + String.valueOf(this.f36165d);
    }
}
