package com.yandex.mobile.ads.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.yandex.mobile.ads.impl.m60;

/* loaded from: classes3.dex */
final class jh {

    /* renamed from: a, reason: collision with root package name */
    private final Context f29134a;

    /* renamed from: b, reason: collision with root package name */
    private final a f29135b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f29136c;

    public final class a extends BroadcastReceiver implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private final b f29137b;

        /* renamed from: c, reason: collision with root package name */
        private final Handler f29138c;

        public a(Handler handler, b bVar) {
            this.f29138c = handler;
            this.f29137b = bVar;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f29138c.post(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (jh.this.f29136c) {
                ((m60.b) this.f29137b).c();
            }
        }
    }

    public interface b {
    }

    public jh(Context context, Handler handler, b bVar) {
        this.f29134a = context.getApplicationContext();
        this.f29135b = new a(handler, bVar);
    }

    public final void a() {
        if (this.f29136c) {
            this.f29134a.unregisterReceiver(this.f29135b);
            this.f29136c = false;
        }
    }
}
