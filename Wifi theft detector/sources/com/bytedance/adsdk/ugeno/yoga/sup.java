package com.bytedance.adsdk.ugeno.yoga;

/* loaded from: classes.dex */
public class sup extends YogaNodeJNIBase {
    public void finalize() throws Throwable {
        try {
            sz();
        } finally {
            super.finalize();
        }
    }

    public void sz() {
        long j10 = this.emc;
        if (j10 != 0) {
            this.emc = 0L;
            YogaNative.jni_YGNodeFinalizeJNI(j10);
        }
    }
}
