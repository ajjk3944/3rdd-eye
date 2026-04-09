package com.applovin.shadow.okhttp3.internal.http2;

import com.applovin.shadow.okio.BufferedSource;
import java.io.IOException;
import java.util.List;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public interface PushObserver {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final PushObserver CANCEL = new Companion.PushObserverCancel();

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
        public static final class PushObserverCancel implements PushObserver {
            @Override // com.applovin.shadow.okhttp3.internal.http2.PushObserver
            public boolean onData(int i4, BufferedSource bufferedSource, int i10, boolean z3) throws IOException {
                k.e(bufferedSource, "source");
                bufferedSource.skip(i10);
                return true;
            }

            @Override // com.applovin.shadow.okhttp3.internal.http2.PushObserver
            public boolean onHeaders(int i4, List<Header> list, boolean z3) {
                k.e(list, "responseHeaders");
                return true;
            }

            @Override // com.applovin.shadow.okhttp3.internal.http2.PushObserver
            public boolean onRequest(int i4, List<Header> list) {
                k.e(list, "requestHeaders");
                return true;
            }

            @Override // com.applovin.shadow.okhttp3.internal.http2.PushObserver
            public void onReset(int i4, ErrorCode errorCode) {
                k.e(errorCode, "errorCode");
            }
        }

        private Companion() {
        }
    }

    boolean onData(int i4, BufferedSource bufferedSource, int i10, boolean z3) throws IOException;

    boolean onHeaders(int i4, List<Header> list, boolean z3);

    boolean onRequest(int i4, List<Header> list);

    void onReset(int i4, ErrorCode errorCode);
}
