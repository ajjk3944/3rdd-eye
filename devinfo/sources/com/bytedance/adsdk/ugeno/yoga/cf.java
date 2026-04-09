package com.bytedance.adsdk.ugeno.yoga;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class cf extends YogaNodeJNIBase {
    public final void finalize() throws Throwable {
        try {
            long j = this.ouw;
            if (j != 0) {
                this.ouw = 0L;
                YogaNative.jni_YGNodeFinalizeJNI(j);
            }
        } finally {
            super.finalize();
        }
    }
}
