package com.vungle.ads.internal.downloader;

/* compiled from: Downloader.kt */
/* loaded from: classes2.dex */
public interface d {

    /* compiled from: Downloader.kt */
    public static final class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    void cancel(c cVar);

    void cancelAll();

    void download(c cVar, com.vungle.ads.internal.downloader.a aVar);
}
