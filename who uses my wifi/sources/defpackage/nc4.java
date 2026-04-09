package defpackage;

import android.os.SystemClock;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class nc4 implements ob4 {
    public boolean f;
    public long g;
    public long h;
    public sr1 i;

    public final void a(long j) {
        this.g = j;
        if (this.f) {
            this.h = SystemClock.elapsedRealtime();
        }
    }

    @Override // defpackage.ob4
    public final void b(sr1 sr1Var) {
        if (this.f) {
            a(e());
        }
        this.i = sr1Var;
    }

    @Override // defpackage.ob4
    public final long e() {
        long j = this.g;
        if (!this.f) {
            return j;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.h;
        return (this.i.a == 1.0f ? v23.r(jElapsedRealtime) : jElapsedRealtime * r4.c) + j;
    }

    @Override // defpackage.ob4
    public final sr1 g() {
        return this.i;
    }
}
