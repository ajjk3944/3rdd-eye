package com.bytedance.sdk.openadsdk.yu.ouw;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class cf {
    public static cf ouw = new cf();

    /* renamed from: lh, reason: collision with root package name */
    public final Map<String, ouw> f8830lh = new HashMap();
    public ouw vt;
    public volatile boolean yu;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class ouw {
        final int ouw;
        final int vt;

        public ouw(int i4, int i10) {
            this.ouw = (i4 < 0 || i4 > 5) ? 3 : i4;
            this.vt = i10 < 10 ? 30 : i10;
        }
    }

    private int ouw() {
        ouw ouwVar = this.vt;
        if (ouwVar != null) {
            return ouwVar.ouw;
        }
        return 3;
    }

    public final int ouw(String str) {
        if (!this.yu) {
            return 4;
        }
        ouw ouwVar = this.f8830lh.get(str);
        if (ouwVar == null) {
            return ouw();
        }
        return ouwVar.ouw;
    }
}
