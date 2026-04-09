package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: com.google.android.gms.measurement.internal.a5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4804a5 implements w7 {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ C4945r4 f36332a;

    C4804a5(C4945r4 c4945r4) {
        this.f36332a = c4945r4;
    }

    @Override // com.google.android.gms.measurement.internal.w7
    public final void c(String str, String str2, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            this.f36332a.W0("auto", str2, bundle);
        } else {
            this.f36332a.k0("auto", str2, bundle, str);
        }
    }
}
