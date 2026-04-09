package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.Executor;
import o4.AbstractC2763b;
import t2.AbstractC2907C;

/* renamed from: com.google.android.gms.internal.ads.Lm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0613Lm {

    /* renamed from: a, reason: collision with root package name */
    public final t2.u f9753a;

    /* renamed from: b, reason: collision with root package name */
    public final Q2.a f9754b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f9755c;

    public C0613Lm(t2.u uVar, Q2.a aVar, C0623Mf c0623Mf) {
        this.f9753a = uVar;
        this.f9754b = aVar;
        this.f9755c = c0623Mf;
    }

    public final Bitmap a(byte[] bArr, BitmapFactory.Options options) {
        this.f9754b.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        if (bitmapDecodeByteArray != null) {
            long j6 = jElapsedRealtime2 - jElapsedRealtime;
            int width = bitmapDecodeByteArray.getWidth();
            int height = bitmapDecodeByteArray.getHeight();
            int allocationByteCount = bitmapDecodeByteArray.getAllocationByteCount();
            boolean z6 = Looper.getMainLooper().getThread() == Thread.currentThread();
            StringBuilder sb = new StringBuilder(String.valueOf(j6).length() + String.valueOf(width).length() + 20 + String.valueOf(height).length() + 8 + String.valueOf(allocationByteCount).length() + 7 + 15 + String.valueOf(z6).length());
            AbstractC2763b.h(sb, "Decoded image w: ", width, " h:", height);
            sb.append(" bytes: ");
            sb.append(allocationByteCount);
            sb.append(" time: ");
            sb.append(j6);
            sb.append(" on ui thread: ");
            sb.append(z6);
            AbstractC2907C.m(sb.toString());
        }
        return bitmapDecodeByteArray;
    }
}
