package org.webrtc;

/* loaded from: classes2.dex */
interface BitrateAdjuster {
    int getAdjustedBitrateBps();

    double getAdjustedFramerateFps();

    void reportEncodedFrame(int i10);

    void setTargets(int i10, double d10);
}
