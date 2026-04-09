package io.appmetrica.analytics.impl;

import N7.C1154e9;
import android.text.TextUtils;
import java.util.UUID;

/* renamed from: io.appmetrica.analytics.impl.f0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4599f0 implements InterfaceC4804mo {
    @Override // io.appmetrica.analytics.impl.InterfaceC4804mo
    public final C4752ko a(String str) {
        if (TextUtils.isEmpty(str)) {
            return new C4752ko(this, false, "ApiKey is empty. Please, read official documentation how to obtain one: https://appmetrica.io/docs/mobile-sdk-dg/android/about/android-initialize.html");
        }
        try {
            UUID.fromString(str);
            return new C4752ko(this, true, "");
        } catch (Throwable unused) {
            return new C4752ko(this, false, C1154e9.i("Invalid ApiKey=", str, ". Please, read official documentation how to obtain one: https://appmetrica.io/docs/mobile-sdk-dg/android/about/android-initialize.html"));
        }
    }
}
