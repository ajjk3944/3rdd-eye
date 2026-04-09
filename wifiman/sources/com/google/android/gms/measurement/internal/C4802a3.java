package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import s3.AbstractC7901p;

/* renamed from: com.google.android.gms.measurement.internal.a3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4802a3 {

    /* renamed from: a, reason: collision with root package name */
    private final String f36327a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f36328b;

    /* renamed from: c, reason: collision with root package name */
    private String f36329c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ X2 f36330d;

    public C4802a3(X2 x22, String str, String str2) {
        this.f36330d = x22;
        AbstractC7901p.f(str);
        this.f36327a = str;
    }

    public final String a() {
        if (!this.f36328b) {
            this.f36328b = true;
            this.f36329c = this.f36330d.G().getString(this.f36327a, null);
        }
        return this.f36329c;
    }

    public final void b(String str) {
        SharedPreferences.Editor editorEdit = this.f36330d.G().edit();
        editorEdit.putString(this.f36327a, str);
        editorEdit.apply();
        this.f36329c = str;
    }
}
