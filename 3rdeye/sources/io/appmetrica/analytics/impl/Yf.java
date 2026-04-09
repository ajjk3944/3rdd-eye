package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import android.util.Base64;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* loaded from: classes3.dex */
public final class Yf implements InterfaceC4830no {
    @Override // io.appmetrica.analytics.impl.InterfaceC4830no
    public final byte[] a(C4557d9 c4557d9, C5028vh c5028vh) {
        if (!TextUtils.isEmpty(c4557d9.f40723b)) {
            try {
                byte[] bArrDecode = Base64.decode(c4557d9.f40723b, 0);
                C5102yg c5102yg = (bArrDecode == null || bArrDecode.length == 0) ? null : new C5102yg(bArrDecode);
                C4641gg c4641gg = new C4641gg();
                String str = c5102yg.f42142a;
                c4641gg.f40942a = str == null ? new byte[0] : str.getBytes();
                c4641gg.f40944c = c5102yg.f42143b;
                c4641gg.f40943b = c5102yg.f42144c;
                int iOrdinal = c5102yg.f42145d.ordinal();
                int i = 1;
                if (iOrdinal != 1) {
                    i = 2;
                    if (iOrdinal != 2) {
                        i = 0;
                    }
                }
                c4641gg.f40945d = i;
                return MessageNano.toByteArray(c4641gg);
            } catch (Throwable unused) {
            }
        }
        return new byte[0];
    }
}
