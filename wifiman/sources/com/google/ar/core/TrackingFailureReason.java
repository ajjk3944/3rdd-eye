package com.google.ar.core;

import com.google.ar.core.exceptions.FatalException;

/* loaded from: classes3.dex */
public enum TrackingFailureReason {
    NONE(0),
    BAD_STATE(1),
    INSUFFICIENT_LIGHT(2),
    EXCESSIVE_MOTION(3),
    INSUFFICIENT_FEATURES(4),
    CAMERA_UNAVAILABLE(5);

    final int nativeCode;

    TrackingFailureReason(int i10) {
        this.nativeCode = i10;
    }

    static TrackingFailureReason forNumber(int i10) {
        for (TrackingFailureReason trackingFailureReason : values()) {
            if (trackingFailureReason.nativeCode == i10) {
                return trackingFailureReason;
            }
        }
        throw new FatalException(F.b((byte) 57, i10, "Unexpected value for native TrackingFailureReason, value="));
    }
}
