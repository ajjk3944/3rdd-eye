package com.apm.insight.a;

import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.b.i;
import com.apm.insight.runtime.m;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class a implements ICrashCallback {

    /* renamed from: d, reason: collision with root package name */
    private static volatile a f3006d;

    /* renamed from: a, reason: collision with root package name */
    private volatile String f3007a;

    /* renamed from: b, reason: collision with root package name */
    private volatile i.a f3008b;

    /* renamed from: c, reason: collision with root package name */
    private volatile i.a f3009c;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f3010e = false;

    private a() {
    }

    public static a a() {
        if (f3006d == null) {
            synchronized (a.class) {
                try {
                    if (f3006d == null) {
                        f3006d = new a();
                    }
                } finally {
                }
            }
        }
        return f3006d;
    }

    @Override // com.apm.insight.ICrashCallback
    public void onCrash(CrashType crashType, String str, Thread thread) {
        crashType.equals(CrashType.NATIVE);
    }

    public final void a(String str, i.a aVar, i.a aVar2) {
        this.f3007a = str;
        this.f3008b = aVar;
        this.f3009c = aVar2;
        if (this.f3010e) {
            return;
        }
        this.f3010e = true;
        m.a().a(new Runnable() { // from class: com.apm.insight.a.a.1
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
    }
}
