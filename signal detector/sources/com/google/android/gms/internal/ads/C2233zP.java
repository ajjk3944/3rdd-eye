package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.google.android.gms.internal.ads.zP, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2233zP {

    /* renamed from: a, reason: collision with root package name */
    public final C1749qQ f17874a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f17875b;

    public /* synthetic */ C2233zP(CopyOnWriteArrayList copyOnWriteArrayList, C1749qQ c1749qQ) {
        this.f17875b = copyOnWriteArrayList;
        this.f17874a = c1749qQ;
    }

    public void a(InterfaceC0664Om interfaceC0664Om) {
        Iterator it = this.f17875b.iterator();
        while (it.hasNext()) {
            C1856sQ c1856sQ = (C1856sQ) it.next();
            Object obj = c1856sQ.f16748b;
            Handler handler = c1856sQ.f16747a;
            NP np = new NP(interfaceC0664Om, 1, obj);
            String str = Vt.f12096a;
            Looper looper = handler.getLooper();
            if (looper.getThread().isAlive()) {
                if (looper == Looper.myLooper()) {
                    np.run();
                } else {
                    handler.post(np);
                }
            }
        }
    }
}
