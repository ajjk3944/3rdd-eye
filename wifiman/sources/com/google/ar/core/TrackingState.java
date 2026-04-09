package com.google.ar.core;

import com.google.ar.core.exceptions.FatalException;

/* loaded from: classes3.dex */
public enum TrackingState {
    TRACKING(0),
    PAUSED(1),
    STOPPED(2);

    final int nativeCode;

    TrackingState(int i10) {
        this.nativeCode = i10;
    }

    static TrackingState forNumber(int i10) {
        for (TrackingState trackingState : values()) {
            if (trackingState.nativeCode == i10) {
                return trackingState;
            }
        }
        throw new FatalException(F.b((byte) 49, i10, "Unexpected value for native TrackingState, value="));
    }
}
