package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes3.dex */
public final class Vm implements InterfaceC4830no {
    @Override // io.appmetrica.analytics.impl.InterfaceC4830no
    public final byte[] a(C4557d9 c4557d9, C5028vh c5028vh) {
        return !TextUtils.isEmpty(c4557d9.f40723b) ? StringUtils.getUTF8Bytes(c4557d9.f40723b) : new byte[0];
    }
}
