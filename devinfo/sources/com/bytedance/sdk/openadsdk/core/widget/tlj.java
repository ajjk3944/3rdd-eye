package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.os.SystemClock;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class tlj extends ra {
    public long ouw;
    public long vt;

    public tlj(Context context) {
        super(context);
        setVisibility(8);
        setClickable(true);
    }

    public final long getDisplayDuration() {
        if (this.ouw == 0) {
            return 0L;
        }
        if (this.vt == 0) {
            this.vt = SystemClock.elapsedRealtime();
        }
        return this.vt - this.ouw;
    }

    public final void lh() {
        setVisibility(8);
        if (this.ouw != 0) {
            this.vt = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.ra
    public final boolean ouw() {
        return false;
    }
}
