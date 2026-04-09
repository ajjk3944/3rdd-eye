package io.appmetrica.analytics.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public abstract class Jd {

    /* renamed from: a, reason: collision with root package name */
    public static P9 f39689a;

    public static final synchronized P9 a(Context context) {
        P9 p92;
        p92 = f39689a;
        if (p92 == null) {
            p92 = new P9(context, "uuid.dat");
            f39689a = p92;
        }
        return p92;
    }
}
