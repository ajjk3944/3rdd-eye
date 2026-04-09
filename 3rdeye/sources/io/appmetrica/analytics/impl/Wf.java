package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import android.util.Base64;

/* loaded from: classes3.dex */
public final class Wf implements InterfaceC4830no, O8 {
    @Override // io.appmetrica.analytics.impl.O8
    public final int a(Y8 y82) {
        return 2;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4830no
    public final byte[] a(C4557d9 c4557d9, C5028vh c5028vh) {
        return TextUtils.isEmpty(c4557d9.f40723b) ? new byte[0] : Base64.decode(c4557d9.f40723b, 0);
    }
}
