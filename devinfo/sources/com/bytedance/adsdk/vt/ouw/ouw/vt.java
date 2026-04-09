package com.bytedance.adsdk.vt.ouw.ouw;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vt {
    private final List<zin> ouw = new ArrayList();

    public final void ouw(zin zinVar) {
        this.ouw.add(zinVar);
    }

    public final void ouw(Path path) {
        for (int size = this.ouw.size() - 1; size >= 0; size--) {
            com.bytedance.adsdk.vt.le.pno.ouw(path, this.ouw.get(size));
        }
    }
}
