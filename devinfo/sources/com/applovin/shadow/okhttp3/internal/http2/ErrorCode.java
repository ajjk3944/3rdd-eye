package com.applovin.shadow.okhttp3.internal.http2;

import nk.f;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public enum ErrorCode {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    SETTINGS_TIMEOUT(4),
    STREAM_CLOSED(5),
    FRAME_SIZE_ERROR(6),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);

    public static final Companion Companion = new Companion(null);
    private final int httpCode;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final ErrorCode fromHttp2(int i4) {
            for (ErrorCode errorCode : ErrorCode.values()) {
                if (errorCode.getHttpCode() == i4) {
                    return errorCode;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    ErrorCode(int i4) {
        this.httpCode = i4;
    }

    public final int getHttpCode() {
        return this.httpCode;
    }
}
