package com.apm.insight.runtime;

import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: classes.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    private static volatile p f5276a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile Handler f5277b;

    public static p a() {
        if (f5276a == null) {
            b();
        }
        return f5276a;
    }

    private static HandlerThread b() {
        if (f5276a == null) {
            synchronized (m.class) {
                try {
                    if (f5276a == null) {
                        p pVar = new p("default_npth_thread");
                        f5276a = pVar;
                        pVar.b();
                    }
                } finally {
                }
            }
        }
        return f5276a.c();
    }
}
