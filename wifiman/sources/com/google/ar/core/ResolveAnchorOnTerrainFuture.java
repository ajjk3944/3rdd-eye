package com.google.ar.core;

import com.google.ar.core.Anchor;
import com.google.ar.core.annotations.UsedByNative;
import java.lang.ref.WeakReference;
import java.util.function.BiConsumer;

/* loaded from: classes3.dex */
public class ResolveAnchorOnTerrainFuture extends FutureImpl {

    static class CallbackWrapper {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference f38222a;

        /* renamed from: b, reason: collision with root package name */
        private final long f38223b;

        /* renamed from: c, reason: collision with root package name */
        private final BiConsumer f38224c;

        public CallbackWrapper(Session session, BiConsumer biConsumer) {
            this.f38222a = new WeakReference(session);
            this.f38223b = session.nativeSymbolTableHandle;
            this.f38224c = biConsumer;
        }

        @UsedByNative("callback_context.cc")
        public void accept(long j10, int i10) {
            Session session = (Session) this.f38222a.get();
            if (session != null) {
                this.f38224c.accept(ResolveAnchorOnTerrainFuture.makeAnchor(j10, session), Anchor.TerrainAnchorState.forNumber(i10));
                return;
            }
            this.f38224c.accept(null, Anchor.TerrainAnchorState.ERROR_INTERNAL);
            if (j10 != 0) {
                Anchor.nativeReleaseAnchor(this.f38223b, j10);
            }
        }
    }

    ResolveAnchorOnTerrainFuture(Session session, long j10, long j11) {
        super(session, j10, j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Anchor makeAnchor(long j10, Session session) {
        if (j10 != 0) {
            return new Anchor(j10, session);
        }
        return null;
    }

    @Override // com.google.ar.core.FutureImpl, com.google.ar.core.Future
    public /* bridge */ /* synthetic */ boolean cancel() {
        return super.cancel();
    }

    public Anchor getResultAnchor() {
        return makeAnchor(nativeGetResultAnchor(this.session.nativeWrapperHandle, this.nativeFuture), this.session);
    }

    public Anchor.TerrainAnchorState getResultTerrainAnchorState() {
        return Anchor.TerrainAnchorState.forNumber(nativeGetResultTerrainAnchorState(this.session.nativeWrapperHandle, this.nativeFuture));
    }

    @Override // com.google.ar.core.FutureImpl, com.google.ar.core.Future
    public /* bridge */ /* synthetic */ FutureState getState() {
        return super.getState();
    }

    native long nativeGetResultAnchor(long j10, long j11);

    native int nativeGetResultTerrainAnchorState(long j10, long j11);
}
