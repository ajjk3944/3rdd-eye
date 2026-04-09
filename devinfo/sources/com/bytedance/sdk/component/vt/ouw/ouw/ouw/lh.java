package com.bytedance.sdk.component.vt.ouw.ouw.ouw;

import com.bytedance.sdk.component.vt.ouw.jg;
import com.bytedance.sdk.component.vt.ouw.pno;
import com.bytedance.sdk.component.vt.ouw.ryl;
import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class lh implements pno.ouw {

    /* renamed from: lh, reason: collision with root package name */
    int f7654lh = 0;
    List<com.bytedance.sdk.component.vt.ouw.pno> ouw;
    ryl vt;

    public lh(List<com.bytedance.sdk.component.vt.ouw.pno> list, ryl rylVar) {
        this.ouw = list;
        this.vt = rylVar;
    }

    @Override // com.bytedance.sdk.component.vt.ouw.pno.ouw
    public final ryl ouw() {
        return this.vt;
    }

    @Override // com.bytedance.sdk.component.vt.ouw.pno.ouw
    public final jg ouw(ryl rylVar) throws IOException {
        this.vt = rylVar;
        int i4 = this.f7654lh + 1;
        this.f7654lh = i4;
        if (i4 >= this.ouw.size()) {
            return null;
        }
        return this.ouw.get(this.f7654lh).ouw(this);
    }
}
