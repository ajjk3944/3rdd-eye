package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* renamed from: io.appmetrica.analytics.impl.n4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4810n4 {

    /* renamed from: a, reason: collision with root package name */
    public final C4784m4 f41299a;

    /* renamed from: b, reason: collision with root package name */
    public volatile S9 f41300b;

    /* renamed from: c, reason: collision with root package name */
    public volatile S9 f41301c;

    public C4810n4() {
        this(new C4784m4());
    }

    public final IHandlerExecutor a() {
        if (this.f41300b == null) {
            synchronized (this) {
                try {
                    if (this.f41300b == null) {
                        this.f41299a.getClass();
                        HandlerThreadC5022vb handlerThreadC5022vbA = S9.a("IAA-CDE");
                        this.f41300b = new S9(handlerThreadC5022vbA, handlerThreadC5022vbA.getLooper(), new Handler(handlerThreadC5022vbA.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f41300b;
    }

    public final ICommonExecutor b() {
        if (this.f41301c == null) {
            synchronized (this) {
                try {
                    if (this.f41301c == null) {
                        this.f41299a.getClass();
                        HandlerThreadC5022vb handlerThreadC5022vbA = S9.a("IAA-CRS");
                        this.f41301c = new S9(handlerThreadC5022vbA, handlerThreadC5022vbA.getLooper(), new Handler(handlerThreadC5022vbA.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f41301c;
    }

    public C4810n4(C4784m4 c4784m4) {
        this.f41299a = c4784m4;
    }
}
