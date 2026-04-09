package com.mbridge.msdk.config.component.load.downloader.core;

/* loaded from: classes3.dex */
public interface p<T> {
    p<T> a(com.mbridge.msdk.config.component.load.downloader.c cVar);

    p<T> a(com.mbridge.msdk.config.component.load.downloader.h hVar);

    d<T> build();

    p<T> withHttpRetryCounter(int i10);

    p<T> withTimeout(long j10);
}
