package com.squareup.picasso;

import java.io.PrintWriter;

/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f5957a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5958b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5959c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5960d;

    /* renamed from: e, reason: collision with root package name */
    public final long f5961e;

    /* renamed from: f, reason: collision with root package name */
    public final long f5962f;

    /* renamed from: g, reason: collision with root package name */
    public final long f5963g;

    /* renamed from: h, reason: collision with root package name */
    public final long f5964h;

    /* renamed from: i, reason: collision with root package name */
    public final long f5965i;
    public final long j;
    public final int k;

    /* renamed from: l, reason: collision with root package name */
    public final int f5966l;

    /* renamed from: m, reason: collision with root package name */
    public final int f5967m;

    /* renamed from: n, reason: collision with root package name */
    public final long f5968n;

    public o0(int i10, int i11, long j, long j7, long j10, long j11, long j12, long j13, long j14, long j15, int i12, int i13, int i14, long j16) {
        this.f5957a = i10;
        this.f5958b = i11;
        this.f5959c = j;
        this.f5960d = j7;
        this.f5961e = j10;
        this.f5962f = j11;
        this.f5963g = j12;
        this.f5964h = j13;
        this.f5965i = j14;
        this.j = j15;
        this.k = i12;
        this.f5966l = i13;
        this.f5967m = i14;
        this.f5968n = j16;
    }

    public final void a(PrintWriter printWriter) {
        printWriter.println("===============BEGIN PICASSO STATS ===============");
        printWriter.println("Memory Cache Stats");
        printWriter.print("  Max Cache Size: ");
        printWriter.println(this.f5957a);
        printWriter.print("  Cache Size: ");
        printWriter.println(this.f5958b);
        printWriter.print("  Cache % Full: ");
        printWriter.println((int) Math.ceil((r1 / r0) * 100.0f));
        printWriter.print("  Cache Hits: ");
        printWriter.println(this.f5959c);
        printWriter.print("  Cache Misses: ");
        printWriter.println(this.f5960d);
        printWriter.println("Network Stats");
        printWriter.print("  Download Count: ");
        printWriter.println(this.k);
        printWriter.print("  Total Download Size: ");
        printWriter.println(this.f5961e);
        printWriter.print("  Average Download Size: ");
        printWriter.println(this.f5964h);
        printWriter.println("Bitmap Stats");
        printWriter.print("  Total Bitmaps Decoded: ");
        printWriter.println(this.f5966l);
        printWriter.print("  Total Bitmap Size: ");
        printWriter.println(this.f5962f);
        printWriter.print("  Total Transformed Bitmaps: ");
        printWriter.println(this.f5967m);
        printWriter.print("  Total Transformed Bitmap Size: ");
        printWriter.println(this.f5963g);
        printWriter.print("  Average Bitmap Size: ");
        printWriter.println(this.f5965i);
        printWriter.print("  Average Transformed Bitmap Size: ");
        printWriter.println(this.j);
        printWriter.println("===============END PICASSO STATS ===============");
        printWriter.flush();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StatsSnapshot{maxSize=");
        sb2.append(this.f5957a);
        sb2.append(", size=");
        sb2.append(this.f5958b);
        sb2.append(", cacheHits=");
        sb2.append(this.f5959c);
        sb2.append(", cacheMisses=");
        sb2.append(this.f5960d);
        sb2.append(", downloadCount=");
        sb2.append(this.k);
        sb2.append(", totalDownloadSize=");
        sb2.append(this.f5961e);
        sb2.append(", averageDownloadSize=");
        sb2.append(this.f5964h);
        sb2.append(", totalOriginalBitmapSize=");
        sb2.append(this.f5962f);
        sb2.append(", totalTransformedBitmapSize=");
        sb2.append(this.f5963g);
        sb2.append(", averageOriginalBitmapSize=");
        sb2.append(this.f5965i);
        sb2.append(", averageTransformedBitmapSize=");
        sb2.append(this.j);
        sb2.append(", originalBitmapCount=");
        sb2.append(this.f5966l);
        sb2.append(", transformedBitmapCount=");
        sb2.append(this.f5967m);
        sb2.append(", timeStamp=");
        return w.g.h(sb2, this.f5968n, '}');
    }
}
