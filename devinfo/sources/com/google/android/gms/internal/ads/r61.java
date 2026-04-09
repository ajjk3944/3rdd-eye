package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.logging.Level;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class r61 implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque f15554a = new ArrayDeque(4);

    /* renamed from: b, reason: collision with root package name */
    public Throwable f15555b;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Throwable th2 = this.f15555b;
        while (true) {
            ArrayDeque arrayDeque = this.f15554a;
            if (arrayDeque.isEmpty()) {
                break;
            }
            Closeable closeable = (Closeable) arrayDeque.removeFirst();
            try {
                closeable.close();
            } catch (Throwable th3) {
                if (th2 == null) {
                    th2 = th3;
                } else if (th2 != th3) {
                    try {
                        th2.addSuppressed(th3);
                    } catch (Throwable unused) {
                        q61.f15226a.logp(Level.WARNING, "com.google.common.io.Closer", "<init>", "Suppressing exception thrown when closing ".concat(String.valueOf(closeable)), th3);
                    }
                }
            }
        }
        if (this.f15555b != null || th2 == null) {
            return;
        }
        Object obj = o31.f14530a;
        if (IOException.class.isInstance(th2)) {
            throw ((Throwable) IOException.class.cast(th2));
        }
        if (th2 instanceof RuntimeException) {
            throw ((RuntimeException) th2);
        }
        if (!(th2 instanceof Error)) {
            throw new AssertionError(th2);
        }
        throw ((Error) th2);
    }
}
