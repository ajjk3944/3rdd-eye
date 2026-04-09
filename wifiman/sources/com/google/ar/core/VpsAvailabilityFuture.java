package com.google.ar.core;

import com.google.ar.core.annotations.UsedByNative;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
public class VpsAvailabilityFuture extends FutureImpl {

    static class CallbackWrapper {

        /* renamed from: a, reason: collision with root package name */
        private final Consumer f38228a;

        public CallbackWrapper(Consumer consumer) {
            this.f38228a = consumer;
        }

        @UsedByNative("callback_context.cc")
        public void accept(int i10) {
            this.f38228a.accept(VpsAvailability.forNumber(i10));
        }
    }

    VpsAvailabilityFuture(Session session, long j10, long j11) {
        super(session, j10, j11);
    }

    @Override // com.google.ar.core.FutureImpl, com.google.ar.core.Future
    public /* bridge */ /* synthetic */ boolean cancel() {
        return super.cancel();
    }

    public VpsAvailability getResult() {
        return VpsAvailability.forNumber(nativeGetResult(this.session.nativeWrapperHandle, this.nativeFuture));
    }

    @Override // com.google.ar.core.FutureImpl, com.google.ar.core.Future
    public /* bridge */ /* synthetic */ FutureState getState() {
        return super.getState();
    }

    native int nativeGetResult(long j10, long j11);
}
