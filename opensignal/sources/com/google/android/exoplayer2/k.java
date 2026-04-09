package com.google.android.exoplayer2;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final pb.p f4204a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4205b;

    /* renamed from: c, reason: collision with root package name */
    public final long f4206c;

    /* renamed from: d, reason: collision with root package name */
    public final long f4207d;

    /* renamed from: e, reason: collision with root package name */
    public final long f4208e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4209f;

    /* renamed from: g, reason: collision with root package name */
    public final long f4210g;

    /* renamed from: h, reason: collision with root package name */
    public int f4211h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f4212i;

    public k(pb.p pVar, int i10, int i11, int i12, int i13) {
        a("bufferForPlaybackMs", i12, 0, "0");
        a("bufferForPlaybackAfterRebufferMs", i13, 0, "0");
        a("minBufferMs", i10, i12, "bufferForPlaybackMs");
        a("minBufferMs", i10, i13, "bufferForPlaybackAfterRebufferMs");
        a("maxBufferMs", i11, i10, "minBufferMs");
        a("backBufferDurationMs", 0, 0, "0");
        this.f4204a = pVar;
        this.f4205b = h.c(i10);
        this.f4206c = h.c(i11);
        this.f4207d = h.c(i12);
        this.f4208e = h.c(i13);
        this.f4209f = -1;
        this.f4211h = 13107200;
        this.f4210g = h.c(0);
    }

    public static void a(String str, int i10, int i11, String str2) {
        boolean z10 = i10 >= i11;
        StringBuilder sb2 = new StringBuilder(str2.length() + str.length() + 21);
        sb2.append(str);
        sb2.append(" cannot be less than ");
        sb2.append(str2);
        qb.b.f(sb2.toString(), z10);
    }

    public final void b(boolean z10) {
        int i10 = this.f4209f;
        if (i10 == -1) {
            i10 = 13107200;
        }
        this.f4211h = i10;
        this.f4212i = false;
        if (z10) {
            pb.p pVar = this.f4204a;
            synchronized (pVar) {
                if (pVar.f20397a) {
                    pVar.b(0);
                }
            }
        }
    }
}
