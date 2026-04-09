package com.google.ar.core;

import com.google.ar.core.Anchor;
import com.google.ar.core.annotations.UsedByNative;
import java.util.function.BiConsumer;

/* loaded from: classes3.dex */
public class HostCloudAnchorFuture extends FutureImpl {

    static class CallbackWrapper {

        /* renamed from: a, reason: collision with root package name */
        private final BiConsumer f38181a;

        public CallbackWrapper(BiConsumer biConsumer) {
            this.f38181a = biConsumer;
        }

        @UsedByNative("callback_context.cc")
        public void accept(String str, int i10) {
            this.f38181a.accept(str, Anchor.CloudAnchorState.forNumber(i10));
        }
    }

    HostCloudAnchorFuture(Session session, long j10, long j11) {
        super(session, j10, j11);
    }

    @Override // com.google.ar.core.FutureImpl, com.google.ar.core.Future
    public /* bridge */ /* synthetic */ boolean cancel() {
        return super.cancel();
    }

    public String getResultCloudAnchorId() {
        return nativeGetResultCloudAnchorId(this.session.nativeWrapperHandle, this.nativeFuture);
    }

    public Anchor.CloudAnchorState getResultCloudAnchorState() {
        return Anchor.CloudAnchorState.forNumber(nativeGetResultCloudAnchorState(this.session.nativeWrapperHandle, this.nativeFuture));
    }

    @Override // com.google.ar.core.FutureImpl, com.google.ar.core.Future
    public /* bridge */ /* synthetic */ FutureState getState() {
        return super.getState();
    }

    native String nativeGetResultCloudAnchorId(long j10, long j11);

    native int nativeGetResultCloudAnchorState(long j10, long j11);
}
