package com.apm.insight.a;

import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.b.i;
import com.apm.insight.runtime.m;

/* loaded from: classes.dex */
public class a implements ICrashCallback {

    /* renamed from: d, reason: collision with root package name */
    private static volatile a f5948d;

    /* renamed from: a, reason: collision with root package name */
    private volatile String f5949a;

    /* renamed from: b, reason: collision with root package name */
    private volatile i.a f5950b;

    /* renamed from: c, reason: collision with root package name */
    private volatile i.a f5951c;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f5952e = false;

    private a() {
    }

    public static a a() {
        if (f5948d == null) {
            synchronized (a.class) {
                try {
                    if (f5948d == null) {
                        f5948d = new a();
                    }
                } finally {
                }
            }
        }
        return f5948d;
    }

    @Override // com.apm.insight.ICrashCallback
    public void onCrash(CrashType crashType, String str, Thread thread) {
        crashType.equals(CrashType.NATIVE);
    }

    public final void a(String str, i.a aVar, i.a aVar2) {
        this.f5949a = str;
        this.f5950b = aVar;
        this.f5951c = aVar2;
        if (this.f5952e) {
            return;
        }
        this.f5952e = true;
        m.a().a(new Runnable() { // from class: com.apm.insight.a.a.1
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
    }
}
