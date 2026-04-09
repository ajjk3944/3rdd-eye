package com.apm.insight.runtime;

import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: classes.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    private static volatile p f6453a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile Handler f6454b;

    public static p a() {
        if (f6453a == null) {
            b();
        }
        return f6453a;
    }

    private static HandlerThread b() {
        if (f6453a == null) {
            synchronized (m.class) {
                try {
                    if (f6453a == null) {
                        p pVar = new p("default_npth_thread");
                        f6453a = pVar;
                        pVar.b();
                    }
                } finally {
                }
            }
        }
        return f6453a.c();
    }
}
