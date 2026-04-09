package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.z32;

/* loaded from: classes3.dex */
public final class w32 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(v32 v32Var, y32 y32Var, String str) {
        z32 z32Var = z32.f36157h;
        z32.b.a().fine(y32Var.f() + " " + C4215v0.a(new Object[]{str}, 1, "%-22s", "format(...)") + ": " + v32Var.b());
    }

    public static final String a(long j4) {
        String str;
        if (j4 <= -999500000) {
            str = ((j4 - 500000000) / 1000000000) + " s ";
        } else if (j4 <= -999500) {
            str = ((j4 - 500000) / 1000000) + " ms";
        } else if (j4 <= 0) {
            str = ((j4 - 500) / 1000) + " µs";
        } else if (j4 < 999500) {
            str = ((j4 + 500) / 1000) + " µs";
        } else if (j4 < 999500000) {
            str = ((j4 + 500000) / 1000000) + " ms";
        } else {
            str = ((j4 + 500000000) / 1000000000) + " s ";
        }
        return C4215v0.a(new Object[]{str}, 1, "%6s", "format(...)");
    }
}
