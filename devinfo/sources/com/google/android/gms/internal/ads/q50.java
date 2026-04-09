package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.Spanned;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class q50 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f15217a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f15218b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f15219c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f15220d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f15221e;

    static {
        String str = bq0.f9768a;
        f15217a = Integer.toString(0, 36);
        f15218b = Integer.toString(1, 36);
        f15219c = Integer.toString(2, 36);
        f15220d = Integer.toString(3, 36);
        f15221e = Integer.toString(4, 36);
    }

    public static Bundle a(Spanned spanned, Object obj, int i4, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f15217a, spanned.getSpanStart(obj));
        bundle2.putInt(f15218b, spanned.getSpanEnd(obj));
        bundle2.putInt(f15219c, spanned.getSpanFlags(obj));
        bundle2.putInt(f15220d, i4);
        if (bundle != null) {
            bundle2.putBundle(f15221e, bundle);
        }
        return bundle2;
    }
}
