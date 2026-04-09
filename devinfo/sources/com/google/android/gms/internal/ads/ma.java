package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ma {

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f13826c = na.f14189a;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f13827a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public boolean f13828b = false;

    public final synchronized void a(long j, String str) {
        if (this.f13828b) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.f13827a.add(new la(str, j, SystemClock.elapsedRealtime()));
    }

    public final synchronized void b(String str) {
        this.f13828b = true;
        ArrayList arrayList = this.f13827a;
        long j = arrayList.size() == 0 ? 0L : ((la) arrayList.get(arrayList.size() - 1)).f13430c - ((la) arrayList.get(0)).f13430c;
        if (j > 0) {
            long j8 = ((la) arrayList.get(0)).f13430c;
            na.b("(%-4d ms) %s", Long.valueOf(j), str);
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                la laVar = (la) obj;
                long j9 = laVar.f13430c;
                na.b("(+%-4d) [%2d] %s", Long.valueOf(j9 - j8), Long.valueOf(laVar.f13429b), laVar.f13428a);
                j8 = j9;
            }
        }
    }

    public final void finalize() {
        if (this.f13828b) {
            return;
        }
        b("Request on the loose");
        na.c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }
}
