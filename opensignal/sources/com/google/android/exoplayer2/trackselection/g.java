package com.google.android.exoplayer2.trackselection;

import android.os.SystemClock;
import pb.d0;

/* loaded from: classes.dex */
public abstract class g {
    public static d0 a(ob.f fVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = ((ob.c) fVar).f19230c.length;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (((ob.c) fVar).j(i11, jElapsedRealtime)) {
                i10++;
            }
        }
        return new d0(1, 0, length, i10, 0);
    }
}
