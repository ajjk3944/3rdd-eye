package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Range;

/* loaded from: classes.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    public final Context f9408a;

    /* renamed from: b, reason: collision with root package name */
    public final T f9409b;

    /* renamed from: c, reason: collision with root package name */
    public N f9410c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9411d;

    /* renamed from: e, reason: collision with root package name */
    public C1994v2 f9412e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9413f;

    /* renamed from: g, reason: collision with root package name */
    public long f9414g = 15000;

    /* renamed from: h, reason: collision with root package name */
    public final U f9415h;

    public K(Context context, T t6) {
        this.f9408a = context.getApplicationContext();
        this.f9409b = t6;
        U u6 = new U();
        Range range = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d));
        u6.f11530d = range;
        u6.f11529c = ((Double) range.getUpper()).doubleValue();
        u6.f11527a = -9223372036854775807L;
        u6.f11528b = -9223372036854775807L;
        this.f9415h = u6;
        this.f9412e = C1994v2.f17209f;
    }
}
