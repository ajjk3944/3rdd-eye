package com.google.ar.core;

import com.google.ar.core.exceptions.FatalException;

/* loaded from: classes3.dex */
public enum FutureState {
    PENDING(0),
    CANCELLED(1),
    DONE(2);

    final int nativeCode;

    FutureState(int i10) {
        this.nativeCode = i10;
    }

    static FutureState forNumber(int i10) {
        for (FutureState futureState : values()) {
            if (futureState.nativeCode == i10) {
                return futureState;
            }
        }
        throw new FatalException(F.b((byte) 47, i10, "Unexpected value for native FutureState, value="));
    }
}
