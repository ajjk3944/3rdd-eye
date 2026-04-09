package com.mbridge.msdk.util.timer;

import android.os.CountDownTimer;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.util.timer.a f18491a;

    /* renamed from: b, reason: collision with root package name */
    private long f18492b;

    /* renamed from: c, reason: collision with root package name */
    private a f18493c;

    /* renamed from: d, reason: collision with root package name */
    private long f18494d = 0;

    public static class a extends CountDownTimer {

        /* renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.util.timer.a f18495a;

        public a(long j10, long j11) {
            super(j10, j11);
        }

        public void a(com.mbridge.msdk.util.timer.a aVar) {
            this.f18495a = aVar;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            com.mbridge.msdk.util.timer.a aVar = this.f18495a;
            if (aVar != null) {
                aVar.onFinish();
            }
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
            com.mbridge.msdk.util.timer.a aVar = this.f18495a;
            if (aVar != null) {
                aVar.onTick(j10);
            }
        }
    }

    public void a() {
        a aVar = this.f18493c;
        if (aVar != null) {
            aVar.cancel();
            this.f18493c = null;
        }
    }

    public b b(long j10) {
        this.f18494d = j10;
        return this;
    }

    public void c() {
        if (this.f18493c == null) {
            b();
        }
        this.f18493c.start();
    }

    public void b() {
        a aVar = this.f18493c;
        if (aVar != null) {
            aVar.cancel();
            this.f18493c = null;
        }
        if (this.f18492b <= 0) {
            this.f18492b = this.f18494d + 1000;
        }
        a aVar2 = new a(this.f18494d, this.f18492b);
        this.f18493c = aVar2;
        aVar2.a(this.f18491a);
    }

    public b a(long j10) {
        if (j10 < 0) {
            j10 = 1000;
        }
        this.f18492b = j10;
        return this;
    }

    public b a(com.mbridge.msdk.util.timer.a aVar) {
        this.f18491a = aVar;
        return this;
    }
}
