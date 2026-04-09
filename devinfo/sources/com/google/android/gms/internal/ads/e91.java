package com.google.android.gms.internal.ads;

import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e91 extends TimeoutException {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10747a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e91(String str, int i4) {
        super(str);
        this.f10747a = i4;
    }

    private final synchronized Throwable a() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    private final synchronized Throwable b() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        switch (this.f10747a) {
            case 0:
                a();
                break;
            default:
                b();
                break;
        }
        return this;
    }
}
