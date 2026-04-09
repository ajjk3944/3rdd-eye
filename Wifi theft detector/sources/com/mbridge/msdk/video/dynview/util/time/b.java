package com.mbridge.msdk.video.dynview.util.time;

import android.os.CountDownTimer;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private long f18841a = 0;

    /* renamed from: b, reason: collision with root package name */
    private long f18842b;

    /* renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.video.dynview.util.time.a f18843c;

    /* renamed from: d, reason: collision with root package name */
    private a f18844d;

    public static class a extends CountDownTimer {

        /* renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.video.dynview.util.time.a f18845a;

        public a(long j10, long j11) {
            super(j10, j11);
        }

        public void a(com.mbridge.msdk.video.dynview.util.time.a aVar) {
            this.f18845a = aVar;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            com.mbridge.msdk.video.dynview.util.time.a aVar = this.f18845a;
            if (aVar != null) {
                aVar.onFinish();
            }
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
            com.mbridge.msdk.video.dynview.util.time.a aVar = this.f18845a;
            if (aVar != null) {
                aVar.onTick(j10);
            }
        }
    }

    public b a(long j10) {
        if (j10 < 0) {
            j10 = 1000;
        }
        this.f18842b = j10;
        return this;
    }

    public b b(long j10) {
        this.f18841a = j10;
        return this;
    }

    public void c() {
        if (this.f18844d == null) {
            b();
        }
        this.f18844d.start();
    }

    public b a(com.mbridge.msdk.video.dynview.util.time.a aVar) {
        this.f18843c = aVar;
        return this;
    }

    public void b() {
        a aVar = this.f18844d;
        if (aVar != null) {
            aVar.cancel();
            this.f18844d = null;
        }
        if (this.f18842b <= 0) {
            this.f18842b = this.f18841a + 1000;
        }
        a aVar2 = new a(this.f18841a, this.f18842b);
        this.f18844d = aVar2;
        aVar2.a(this.f18843c);
    }

    public void a(long j10, com.mbridge.msdk.video.dynview.util.time.a aVar) {
        this.f18841a = j10;
        this.f18843c = aVar;
        b();
        a aVar2 = this.f18844d;
        if (aVar2 != null) {
            aVar2.start();
        }
    }

    public void a() {
        a aVar = this.f18844d;
        if (aVar != null) {
            aVar.cancel();
            this.f18844d = null;
        }
    }
}
