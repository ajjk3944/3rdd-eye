package com.ui.wifiman.model.speedtest.result;

import com.ui.wifiman.model.speedtest.result.b;
import gg.z;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class c implements b.a {
    @Override // com.ui.wifiman.model.speedtest.result.b.a
    public z a(String resultServerId) {
        AbstractC6492s.i(resultServerId, "resultServerId");
        z zVarZ = z.z("https://wifiman.com/?result=" + resultServerId);
        AbstractC6492s.h(zVarZ, "just(...)");
        return zVarZ;
    }
}
