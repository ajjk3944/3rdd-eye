package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.Spanned;

/* renamed from: com.google.android.gms.internal.ads.Tj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0746Tj {

    /* renamed from: a, reason: collision with root package name */
    public static final String f11432a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f11433b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f11434c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f11435d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f11436e;

    static {
        String str = Vt.f12096a;
        f11432a = Integer.toString(0, 36);
        f11433b = Integer.toString(1, 36);
        f11434c = Integer.toString(2, 36);
        f11435d = Integer.toString(3, 36);
        f11436e = Integer.toString(4, 36);
    }

    public static Bundle a(Spanned spanned, Object obj, int i, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f11432a, spanned.getSpanStart(obj));
        bundle2.putInt(f11433b, spanned.getSpanEnd(obj));
        bundle2.putInt(f11434c, spanned.getSpanFlags(obj));
        bundle2.putInt(f11435d, i);
        if (bundle != null) {
            bundle2.putBundle(f11436e, bundle);
        }
        return bundle2;
    }
}
