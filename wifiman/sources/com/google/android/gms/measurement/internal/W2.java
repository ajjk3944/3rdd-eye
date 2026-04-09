package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import s3.AbstractC7901p;

/* loaded from: classes.dex */
public final class W2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f36241a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f36242b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f36243c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f36244d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ X2 f36245e;

    public W2(X2 x22, String str, boolean z10) {
        this.f36245e = x22;
        AbstractC7901p.f(str);
        this.f36241a = str;
        this.f36242b = z10;
    }

    public final void a(boolean z10) {
        SharedPreferences.Editor editorEdit = this.f36245e.G().edit();
        editorEdit.putBoolean(this.f36241a, z10);
        editorEdit.apply();
        this.f36244d = z10;
    }

    public final boolean b() {
        if (!this.f36243c) {
            this.f36243c = true;
            this.f36244d = this.f36245e.G().getBoolean(this.f36241a, this.f36242b);
        }
        return this.f36244d;
    }
}
