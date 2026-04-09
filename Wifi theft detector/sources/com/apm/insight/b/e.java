package com.apm.insight.b;

import androidx.annotation.CallSuper;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static long f4816a;

    /* renamed from: b, reason: collision with root package name */
    public static long f4817b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f4818c = false;

    public boolean a() {
        return false;
    }

    @CallSuper
    public void b(String str) {
        this.f4818c = false;
    }

    @CallSuper
    public void a(String str) {
        this.f4818c = true;
    }
}
