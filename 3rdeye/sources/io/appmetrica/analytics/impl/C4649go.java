package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import io.appmetrica.analytics.internal.IdentifiersResult;

/* renamed from: io.appmetrica.analytics.impl.go, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4649go implements InterfaceC4559db {
    @Override // io.appmetrica.analytics.impl.InterfaceC4559db
    public final String a(Context context) {
        IdentifiersResult identifiersResultQ = new C4666hf(C4916r7.a(context.getApplicationContext()).a()).q();
        if (TextUtils.isEmpty(identifiersResultQ.id)) {
            return null;
        }
        return identifiersResultQ.id;
    }
}
