package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.Looper;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* renamed from: io.appmetrica.analytics.impl.ok, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4852ok {

    /* renamed from: a, reason: collision with root package name */
    public final C4826nk f41384a;

    /* renamed from: b, reason: collision with root package name */
    public volatile S9 f41385b;

    /* renamed from: c, reason: collision with root package name */
    public volatile S9 f41386c;

    /* renamed from: d, reason: collision with root package name */
    public volatile S9 f41387d;

    /* renamed from: e, reason: collision with root package name */
    public volatile S9 f41388e;

    /* renamed from: f, reason: collision with root package name */
    public volatile S9 f41389f;

    /* renamed from: g, reason: collision with root package name */
    public volatile S9 f41390g;

    /* renamed from: h, reason: collision with root package name */
    public volatile ExecutorC4800mk f41391h;

    public C4852ok() {
        this(new C4826nk());
    }

    public final IHandlerExecutor a() {
        if (this.f41390g == null) {
            synchronized (this) {
                try {
                    if (this.f41390g == null) {
                        this.f41384a.getClass();
                        HandlerThreadC5022vb handlerThreadC5022vbA = S9.a("IAA-SDE");
                        this.f41390g = new S9(handlerThreadC5022vbA, handlerThreadC5022vbA.getLooper(), new Handler(handlerThreadC5022vbA.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f41390g;
    }

    public final IHandlerExecutor b() {
        if (this.f41385b == null) {
            synchronized (this) {
                try {
                    if (this.f41385b == null) {
                        this.f41384a.getClass();
                        HandlerThreadC5022vb handlerThreadC5022vbA = S9.a("IAA-SC");
                        this.f41385b = new S9(handlerThreadC5022vbA, handlerThreadC5022vbA.getLooper(), new Handler(handlerThreadC5022vbA.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f41385b;
    }

    public final IHandlerExecutor c() {
        if (this.f41387d == null) {
            synchronized (this) {
                try {
                    if (this.f41387d == null) {
                        this.f41384a.getClass();
                        HandlerThreadC5022vb handlerThreadC5022vbA = S9.a("IAA-SMH-1");
                        this.f41387d = new S9(handlerThreadC5022vbA, handlerThreadC5022vbA.getLooper(), new Handler(handlerThreadC5022vbA.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f41387d;
    }

    public final IHandlerExecutor d() {
        if (this.f41388e == null) {
            synchronized (this) {
                try {
                    if (this.f41388e == null) {
                        this.f41384a.getClass();
                        HandlerThreadC5022vb handlerThreadC5022vbA = S9.a("IAA-SNTPE");
                        this.f41388e = new S9(handlerThreadC5022vbA, handlerThreadC5022vbA.getLooper(), new Handler(handlerThreadC5022vbA.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f41388e;
    }

    public final IHandlerExecutor e() {
        if (this.f41386c == null) {
            synchronized (this) {
                try {
                    if (this.f41386c == null) {
                        this.f41384a.getClass();
                        HandlerThreadC5022vb handlerThreadC5022vbA = S9.a("IAA-STE");
                        this.f41386c = new S9(handlerThreadC5022vbA, handlerThreadC5022vbA.getLooper(), new Handler(handlerThreadC5022vbA.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f41386c;
    }

    public final Executor f() {
        if (this.f41391h == null) {
            synchronized (this) {
                try {
                    if (this.f41391h == null) {
                        this.f41384a.getClass();
                        this.f41391h = new ExecutorC4800mk(new Handler(Looper.getMainLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f41391h;
    }

    public C4852ok(C4826nk c4826nk) {
        new HashMap();
        this.f41384a = c4826nk;
    }
}
