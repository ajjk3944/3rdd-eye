package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class gb0 {

    /* renamed from: a, reason: collision with root package name */
    public final ya.r f11475a;

    /* renamed from: b, reason: collision with root package name */
    public final tb.a f11476b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f11477c;

    public gb0(ya.r rVar, tb.a aVar, ex exVar) {
        this.f11475a = rVar;
        this.f11476b = aVar;
        this.f11477c = exVar;
    }

    public final Bitmap a(byte[] bArr, BitmapFactory.Options options) {
        this.f11476b.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        if (bitmapDecodeByteArray != null) {
            long j = jElapsedRealtime2 - jElapsedRealtime;
            int width = bitmapDecodeByteArray.getWidth();
            int height = bitmapDecodeByteArray.getHeight();
            int allocationByteCount = bitmapDecodeByteArray.getAllocationByteCount();
            boolean z3 = Looper.getMainLooper().getThread() == Thread.currentThread();
            StringBuilder sb2 = new StringBuilder(String.valueOf(j).length() + String.valueOf(width).length() + 20 + String.valueOf(height).length() + 8 + String.valueOf(allocationByteCount).length() + 7 + 15 + String.valueOf(z3).length());
            r5.c.q(width, height, "Decoded image w: ", " h:", sb2);
            sb2.append(" bytes: ");
            sb2.append(allocationByteCount);
            sb2.append(" time: ");
            sb2.append(j);
            sb2.append(" on ui thread: ");
            sb2.append(z3);
            ya.a0.m(sb2.toString());
        }
        return bitmapDecodeByteArray;
    }
}
