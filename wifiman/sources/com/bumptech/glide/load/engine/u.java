package com.bumptech.glide.load.engine;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes.dex */
class u {

    /* renamed from: a, reason: collision with root package name */
    private boolean f34496a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f34497b = new Handler(Looper.getMainLooper(), new a());

    private static final class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((E2.c) message.obj).c();
            return true;
        }
    }

    u() {
    }

    synchronized void a(E2.c cVar, boolean z10) {
        try {
            if (this.f34496a || z10) {
                this.f34497b.obtainMessage(1, cVar).sendToTarget();
            } else {
                this.f34496a = true;
                cVar.c();
                this.f34496a = false;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
