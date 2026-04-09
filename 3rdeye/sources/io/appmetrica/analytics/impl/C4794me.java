package io.appmetrica.analytics.impl;

import android.text.TextUtils;

/* renamed from: io.appmetrica.analytics.impl.me, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4794me implements InterfaceC4804mo {

    /* renamed from: a, reason: collision with root package name */
    public final String f41256a;

    public C4794me(String str) {
        this.f41256a = str;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4804mo
    public final C4752ko a(String str) {
        return TextUtils.isEmpty(str) ? new C4752ko(this, false, B4.f.c(new StringBuilder(), this.f41256a, " is empty.")) : new C4752ko(this, true, "");
    }
}
