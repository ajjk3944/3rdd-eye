package com.mbridge.msdk.thrid.okhttp.internal.connection;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public final class e extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    private IOException f17681a;

    /* renamed from: b, reason: collision with root package name */
    private IOException f17682b;

    public e(IOException iOException) {
        super(iOException);
        this.f17681a = iOException;
        this.f17682b = iOException;
    }

    public void a(IOException iOException) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        com.mbridge.msdk.thrid.okhttp.internal.c.a((Throwable) this.f17681a, (Throwable) iOException);
        this.f17682b = iOException;
    }

    public IOException d() {
        return this.f17681a;
    }

    public IOException g() {
        return this.f17682b;
    }
}
