package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class Ca implements InterfaceC4844oc {
    @Override // io.appmetrica.analytics.impl.InterfaceC4844oc
    public final C4918r9 a(B7 b72) {
        C4918r9 c4918r9 = null;
        if ((b72 != null ? b72.f39148b : null) != null && b72.f39149c != null) {
            c4918r9 = new C4918r9();
            c4918r9.f41559b = b72.f39148b.doubleValue();
            c4918r9.f41558a = b72.f39149c.doubleValue();
            Integer num = b72.f39150d;
            if (num != null) {
                c4918r9.f41564g = num.intValue();
            }
            Integer num2 = b72.f39151e;
            if (num2 != null) {
                c4918r9.f41562e = num2.intValue();
            }
            Integer num3 = b72.f39152f;
            if (num3 != null) {
                c4918r9.f41561d = num3.intValue();
            }
            Integer num4 = b72.f39153g;
            if (num4 != null) {
                c4918r9.f41563f = num4.intValue();
            }
            Long l5 = b72.f39154h;
            if (l5 != null) {
                c4918r9.f41560c = TimeUnit.MILLISECONDS.toSeconds(l5.longValue());
            }
            String str = b72.i;
            if (str != null) {
                if (str.equals("gps")) {
                    c4918r9.f41565h = 1;
                } else if (str.equals("network")) {
                    c4918r9.f41565h = 2;
                }
            }
            String str2 = b72.f39155j;
            if (str2 != null) {
                c4918r9.i = str2;
            }
        }
        return c4918r9;
    }
}
