package com.google.android.exoplayer2.source.hls;

import android.os.SystemClock;
import java.util.List;

/* loaded from: classes.dex */
public final class h extends ob.c {

    /* renamed from: h, reason: collision with root package name */
    public int f4484h;

    @Override // ob.f
    public final int a() {
        return this.f4484h;
    }

    @Override // ob.f
    public final int e() {
        return 0;
    }

    @Override // ob.f
    public final Object g() {
        return null;
    }

    @Override // ob.f
    public final void h(long j, long j7, List list, ab.n[] nVarArr) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (j(this.f4484h, jElapsedRealtime)) {
            for (int i10 = this.f19229b - 1; i10 >= 0; i10--) {
                if (!j(i10, jElapsedRealtime)) {
                    this.f4484h = i10;
                    return;
                }
            }
            throw new IllegalStateException();
        }
    }
}
