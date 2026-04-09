package mh;

import h7.h0;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class h implements Runnable {
    public final long B;
    public final /* synthetic */ i D;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f16733a;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f16734d;

    /* renamed from: g, reason: collision with root package name */
    public final int f16735g;

    /* renamed from: x, reason: collision with root package name */
    public final h0 f16737x;

    /* renamed from: r, reason: collision with root package name */
    public int f16736r = 0;

    /* renamed from: y, reason: collision with root package name */
    public final AtomicLong f16738y = new AtomicLong(0);

    public h(i iVar, ScheduledExecutorService scheduledExecutorService, int i10, h0 h0Var, long j) {
        this.D = iVar;
        this.f16734d = scheduledExecutorService;
        this.f16735g = i10;
        this.f16737x = h0Var;
        this.f16733a = new ArrayList(i10);
        this.B = j;
    }

    public final long a(int i10) {
        return (i10 * ((long) this.D.f16744f)) + this.f16738y.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ca  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 535
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mh.h.run():void");
    }
}
