package yh;

import ak.b1;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class d implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final long f26255a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26256b;

    /* renamed from: c, reason: collision with root package name */
    public final int f26257c;

    /* renamed from: d, reason: collision with root package name */
    public final int f26258d;

    /* renamed from: e, reason: collision with root package name */
    public final long f26259e;

    /* renamed from: f, reason: collision with root package name */
    public final long f26260f;

    /* renamed from: g, reason: collision with root package name */
    public final long f26261g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f26262h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f26263i;

    public d(long j, int i10, int i11, int i12, long j7, b1 b1Var, long j10) {
        this.f26255a = j;
        this.f26256b = i10;
        this.f26257c = i11;
        this.f26258d = i12;
        this.f26259e = j7;
        this.f26260f = b1Var.f443f;
        this.f26261g = j10;
        this.f26262h = b1Var.f445h;
        this.f26263i = b1Var.f446i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        if (r2.get() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
    
        return yh.m.INVALID_BYTE_COUNT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        if (yh.e.f26267d.get() == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0074, code lost:
    
        return yh.m.CONNECTION_CHANGED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0077, code lost:
    
        if (r0 < r9) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007b, code lost:
    
        return yh.m.TIMEOUT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007e, code lost:
    
        if (r13.f26262h == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0080, code lost:
    
        ch.n.b("TTQoSFileIO", "Using uploadOutputStreamEndTimeNano for uploadEndTime");
        yh.e.f26266c = "OUTPUT_STREAM_BUFFER_END_TIME";
        yh.e.f26265b = r13.f26261g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0092, code lost:
    
        ch.n.b("TTQoSFileIO", "Using current time for uploadEndTime");
        yh.e.f26266c = "TRAFFIC_STATS_END_TIME";
        yh.e.f26265b = android.os.SystemClock.elapsedRealtimeNanos();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a7, code lost:
    
        if (yh.e.f26270g == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ab, code lost:
    
        if (r13.f26263i != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ad, code lost:
    
        yh.e.j(true);
        yh.e.n(yh.e.f26287z);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b8, code lost:
    
        return yh.m.COMPLETED;
     */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object call() throws java.lang.InterruptedException {
        /*
            r13 = this;
            long r0 = android.os.SystemClock.elapsedRealtime()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "UploadMonitor started using trafficStatsFrequency "
            r2.<init>(r3)
            long r3 = r13.f26260f
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r5 = "TTQoSFileIO"
            ch.n.b(r5, r2)
            r6 = 0
        L1f:
            java.util.concurrent.atomic.AtomicBoolean r2 = yh.e.f26268e
            boolean r8 = r2.get()
            long r9 = r13.f26255a
            if (r8 != 0) goto L61
            int r8 = r13.f26256b
            long r11 = (long) r8
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r6 >= 0) goto L61
            int r6 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r6 >= 0) goto L61
            int r0 = r13.f26257c
            int r1 = r13.f26258d
            r2 = 0
            long r0 = yh.e.e(r0, r2, r1)
            yh.e.f26264a = r0
            r6 = -32768(0xffffffffffff8000, double:NaN)
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 != 0) goto L48
            yh.m r0 = yh.m.ERROR_RETRIEVING_BYTECOUNT
            return r0
        L48:
            double r0 = yh.e.f26272i
            r6 = 0
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 <= 0) goto L53
            yh.m r0 = yh.m.COMPLETED
            return r0
        L53:
            long r0 = yh.e.f26264a
            long r6 = r13.f26259e
            long r6 = r0 - r6
            java.lang.Thread.sleep(r3)
            long r0 = android.os.SystemClock.elapsedRealtime()
            goto L1f
        L61:
            boolean r2 = r2.get()
            if (r2 == 0) goto L6a
            yh.m r0 = yh.m.INVALID_BYTE_COUNT
            return r0
        L6a:
            java.util.concurrent.atomic.AtomicBoolean r2 = yh.e.f26267d
            boolean r2 = r2.get()
            if (r2 == 0) goto L75
            yh.m r0 = yh.m.CONNECTION_CHANGED
            return r0
        L75:
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 < 0) goto L7c
            yh.m r0 = yh.m.TIMEOUT
            return r0
        L7c:
            boolean r0 = r13.f26262h
            if (r0 == 0) goto L92
            java.lang.String r0 = "Using uploadOutputStreamEndTimeNano for uploadEndTime"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            ch.n.b(r5, r0)
            java.lang.String r0 = "OUTPUT_STREAM_BUFFER_END_TIME"
            yh.e.f26266c = r0
            long r0 = r13.f26261g
            yh.e.f26265b = r0
            goto La5
        L92:
            java.lang.String r0 = "Using current time for uploadEndTime"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            ch.n.b(r5, r0)
            java.lang.String r0 = "TRAFFIC_STATS_END_TIME"
            yh.e.f26266c = r0
            long r0 = android.os.SystemClock.elapsedRealtimeNanos()
            yh.e.f26265b = r0
        La5:
            boolean r0 = yh.e.f26270g
            if (r0 == 0) goto Lb6
            boolean r0 = r13.f26263i
            if (r0 != 0) goto Lb6
            r0 = 1
            yh.e.j(r0)
            bc.y r0 = yh.e.f26287z
            yh.e.n(r0)
        Lb6:
            yh.m r0 = yh.m.COMPLETED
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yh.d.call():java.lang.Object");
    }
}
