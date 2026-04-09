package com.mbridge.msdk.config.component.load.downloader.core;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes3.dex */
public class o implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private final int f13477a;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f13478a;

        public a(Runnable runnable) {
            this.f13478a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Process.setThreadPriority(o.this.f13477a);
            } catch (Throwable unused) {
            }
            try {
                this.f13478a.run();
            } catch (Exception unused2) {
            }
        }
    }

    public o(int i10) {
        this.f13477a = i10;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(new a(runnable));
        thread.setName("mb_download_thread");
        return thread;
    }
}
