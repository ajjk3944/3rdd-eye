package com.apm.insight.runtime;

import android.os.Handler;
import android.os.HandlerThread;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    private static volatile p f3490a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile Handler f3491b;

    public static p a() {
        if (f3490a == null) {
            b();
        }
        return f3490a;
    }

    private static HandlerThread b() {
        if (f3490a == null) {
            synchronized (m.class) {
                try {
                    if (f3490a == null) {
                        p pVar = new p("default_npth_thread");
                        f3490a = pVar;
                        pVar.b();
                    }
                } finally {
                }
            }
        }
        return f3490a.c();
    }
}
