package j5;

import android.os.SystemClock;
import java.util.List;

/* loaded from: classes.dex */
public final class e extends androidx.media3.exoplayer.trackselection.e {

    /* renamed from: h, reason: collision with root package name */
    public int f13265h;

    @Override // androidx.media3.exoplayer.trackselection.v
    public final int a() {
        return this.f13265h;
    }

    @Override // androidx.media3.exoplayer.trackselection.v
    public final int e() {
        return 0;
    }

    @Override // androidx.media3.exoplayer.trackselection.v
    public final Object g() {
        return null;
    }

    @Override // androidx.media3.exoplayer.trackselection.v
    public final void h(long j, long j7, long j10, List list, p5.m[] mVarArr) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (k(this.f13265h, jElapsedRealtime)) {
            for (int i10 = this.f1884b - 1; i10 >= 0; i10--) {
                if (!k(i10, jElapsedRealtime)) {
                    this.f13265h = i10;
                    return;
                }
            }
            throw new IllegalStateException();
        }
    }
}
