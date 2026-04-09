package com.instagram.common.viewpoint.core;

import android.view.MotionEvent;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class PN {
    public static boolean A00(MotionEvent motionEvent, int i4) {
        return (motionEvent.getSource() & i4) == i4;
    }
}
