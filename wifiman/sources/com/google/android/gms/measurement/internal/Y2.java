package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import s3.AbstractC7901p;

/* loaded from: classes.dex */
public final class Y2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f36294a;

    /* renamed from: b, reason: collision with root package name */
    private final long f36295b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f36296c;

    /* renamed from: d, reason: collision with root package name */
    private long f36297d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ X2 f36298e;

    public Y2(X2 x22, String str, long j10) {
        this.f36298e = x22;
        AbstractC7901p.f(str);
        this.f36294a = str;
        this.f36295b = j10;
    }

    public final long a() {
        if (!this.f36296c) {
            this.f36296c = true;
            this.f36297d = this.f36298e.G().getLong(this.f36294a, this.f36295b);
        }
        return this.f36297d;
    }

    public final void b(long j10) {
        SharedPreferences.Editor editorEdit = this.f36298e.G().edit();
        editorEdit.putLong(this.f36294a, j10);
        editorEdit.apply();
        this.f36297d = j10;
    }
}
