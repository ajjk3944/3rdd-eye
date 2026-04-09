package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import s3.AbstractC7901p;

/* renamed from: com.google.android.gms.measurement.internal.q3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4937q3 {

    /* renamed from: a, reason: collision with root package name */
    private final Resources f36672a;

    /* renamed from: b, reason: collision with root package name */
    private final String f36673b;

    public C4937q3(Context context, String str) {
        AbstractC7901p.l(context);
        this.f36672a = context.getResources();
        if (TextUtils.isEmpty(str)) {
            this.f36673b = a(context);
        } else {
            this.f36673b = str;
        }
    }

    public static String a(Context context) {
        try {
            return context.getResources().getResourcePackageName(r3.j.f60096a);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    public final String b(String str) {
        int identifier = this.f36672a.getIdentifier(str, "string", this.f36673b);
        if (identifier == 0) {
            return null;
        }
        try {
            return this.f36672a.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
