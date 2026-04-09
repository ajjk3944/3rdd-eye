package org.tensorflow.lite;

import java.nio.MappedByteBuffer;
import java.util.HashMap;

/* compiled from: Interpreter.java */
/* loaded from: classes3.dex */
public final class a implements AutoCloseable {

    /* renamed from: b, reason: collision with root package name */
    public NativeInterpreterWrapper f44958b;

    @Deprecated
    public a(MappedByteBuffer mappedByteBuffer) {
        this.f44958b = new NativeInterpreterWrapper(mappedByteBuffer);
    }

    public final void a(Object[] objArr, HashMap map) {
        NativeInterpreterWrapper nativeInterpreterWrapper = this.f44958b;
        if (nativeInterpreterWrapper == null) {
            throw new IllegalStateException("Internal error: The Interpreter has already been closed.");
        }
        nativeInterpreterWrapper.c(objArr, map);
    }

    @Deprecated
    public final void c(int i) {
        NativeInterpreterWrapper nativeInterpreterWrapper = this.f44958b;
        if (nativeInterpreterWrapper == null) {
            throw new IllegalStateException("Internal error: The Interpreter has already been closed.");
        }
        nativeInterpreterWrapper.d(i);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        NativeInterpreterWrapper nativeInterpreterWrapper = this.f44958b;
        if (nativeInterpreterWrapper != null) {
            nativeInterpreterWrapper.close();
            this.f44958b = null;
        }
    }

    public final void finalize() throws Throwable {
        try {
            close();
        } finally {
            super.finalize();
        }
    }
}
