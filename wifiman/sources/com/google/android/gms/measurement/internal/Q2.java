package com.google.android.gms.measurement.internal;

import java.util.Map;
import s3.AbstractC7901p;

/* loaded from: classes.dex */
final class Q2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final R2 f36174a;

    /* renamed from: b, reason: collision with root package name */
    private final int f36175b;

    /* renamed from: c, reason: collision with root package name */
    private final Throwable f36176c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f36177d;

    /* renamed from: e, reason: collision with root package name */
    private final String f36178e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f36179f;

    @Override // java.lang.Runnable
    public final void run() {
        this.f36174a.a(this.f36178e, this.f36175b, this.f36176c, this.f36177d, this.f36179f);
    }

    private Q2(String str, R2 r22, int i10, Throwable th2, byte[] bArr, Map map) {
        AbstractC7901p.l(r22);
        this.f36174a = r22;
        this.f36175b = i10;
        this.f36176c = th2;
        this.f36177d = bArr;
        this.f36178e = str;
        this.f36179f = map;
    }
}
