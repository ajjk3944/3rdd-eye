package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class H4 {

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f8550c = I4.f9068a;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f8551a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public boolean f8552b = false;

    public final synchronized void a(long j6, String str) {
        if (this.f8552b) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.f8551a.add(new G4(j6, SystemClock.elapsedRealtime(), str));
    }

    public final synchronized void b(String str) {
        this.f8552b = true;
        ArrayList arrayList = this.f8551a;
        long j6 = arrayList.size() == 0 ? 0L : ((G4) arrayList.get(arrayList.size() - 1)).f8287c - ((G4) arrayList.get(0)).f8287c;
        if (j6 > 0) {
            long j7 = ((G4) arrayList.get(0)).f8287c;
            I4.b("(%-4d ms) %s", Long.valueOf(j6), str);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                G4 g42 = (G4) obj;
                long j8 = g42.f8287c;
                I4.b("(+%-4d) [%2d] %s", Long.valueOf(j8 - j7), Long.valueOf(g42.f8286b), g42.f8285a);
                j7 = j8;
            }
        }
    }

    public final void finalize() {
        if (this.f8552b) {
            return;
        }
        b("Request on the loose");
        I4.c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }
}
