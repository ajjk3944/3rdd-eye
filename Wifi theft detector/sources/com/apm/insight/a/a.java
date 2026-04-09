package com.apm.insight.a;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.b.i;
import com.apm.insight.runtime.m;

/* loaded from: classes.dex */
public class a implements ICrashCallback {

    /* renamed from: d, reason: collision with root package name */
    private static volatile a f4766d;

    /* renamed from: a, reason: collision with root package name */
    private volatile String f4767a;

    /* renamed from: b, reason: collision with root package name */
    private volatile i.a f4768b;

    /* renamed from: c, reason: collision with root package name */
    private volatile i.a f4769c;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f4770e = false;

    private a() {
    }

    public static a a() {
        if (f4766d == null) {
            synchronized (a.class) {
                try {
                    if (f4766d == null) {
                        f4766d = new a();
                    }
                } finally {
                }
            }
        }
        return f4766d;
    }

    @Override // com.apm.insight.ICrashCallback
    public void onCrash(@NonNull CrashType crashType, @Nullable String str, @Nullable Thread thread) {
        crashType.equals(CrashType.NATIVE);
    }

    public final void a(String str, i.a aVar, i.a aVar2) {
        this.f4767a = str;
        this.f4768b = aVar;
        this.f4769c = aVar2;
        if (this.f4770e) {
            return;
        }
        this.f4770e = true;
        m.a().a(new Runnable() { // from class: com.apm.insight.a.a.1
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
    }
}
