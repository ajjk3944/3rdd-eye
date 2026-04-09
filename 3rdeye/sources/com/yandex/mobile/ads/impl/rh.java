package com.yandex.mobile.ads.impl;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* loaded from: classes3.dex */
final class rh {

    /* renamed from: a, reason: collision with root package name */
    private final a f32631a;

    /* renamed from: b, reason: collision with root package name */
    private int f32632b;

    /* renamed from: c, reason: collision with root package name */
    private long f32633c;

    /* renamed from: d, reason: collision with root package name */
    private long f32634d;

    /* renamed from: e, reason: collision with root package name */
    private long f32635e;

    /* renamed from: f, reason: collision with root package name */
    private long f32636f;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final AudioTrack f32637a;

        /* renamed from: b, reason: collision with root package name */
        private final AudioTimestamp f32638b = new AudioTimestamp();

        /* renamed from: c, reason: collision with root package name */
        private long f32639c;

        /* renamed from: d, reason: collision with root package name */
        private long f32640d;

        /* renamed from: e, reason: collision with root package name */
        private long f32641e;

        public a(AudioTrack audioTrack) {
            this.f32637a = audioTrack;
        }

        public final boolean b() {
            boolean timestamp = this.f32637a.getTimestamp(this.f32638b);
            if (timestamp) {
                long j4 = this.f32638b.framePosition;
                if (this.f32640d > j4) {
                    this.f32639c++;
                }
                this.f32640d = j4;
                this.f32641e = j4 + (this.f32639c << 32);
            }
            return timestamp;
        }

        public final long a() {
            return this.f32638b.nanoTime / 1000;
        }
    }

    public rh(AudioTrack audioTrack) {
        if (s82.f32899a >= 19) {
            this.f32631a = new a(audioTrack);
            f();
        } else {
            this.f32631a = null;
            a(3);
        }
    }

    public final void a() {
        if (this.f32632b == 4) {
            f();
        }
    }

    @TargetApi(19)
    public final long b() {
        a aVar = this.f32631a;
        if (aVar != null) {
            return aVar.f32641e;
        }
        return -1L;
    }

    @TargetApi(19)
    public final long c() {
        a aVar = this.f32631a;
        if (aVar != null) {
            return aVar.a();
        }
        return -9223372036854775807L;
    }

    public final boolean d() {
        return this.f32632b == 2;
    }

    public final void e() {
        a(4);
    }

    public final void f() {
        if (this.f32631a != null) {
            a(0);
        }
    }

    @TargetApi(19)
    public final boolean a(long j4) {
        a aVar = this.f32631a;
        if (aVar == null || j4 - this.f32635e < this.f32634d) {
            return false;
        }
        this.f32635e = j4;
        boolean zB = aVar.b();
        int i = this.f32632b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException();
                        }
                    } else if (zB) {
                        f();
                        return zB;
                    }
                } else if (!zB) {
                    f();
                    return zB;
                }
            } else {
                if (!zB) {
                    f();
                    return zB;
                }
                if (this.f32631a.f32641e > this.f32636f) {
                    a(2);
                    return zB;
                }
            }
        } else {
            if (zB) {
                if (this.f32631a.a() < this.f32633c) {
                    return false;
                }
                this.f32636f = this.f32631a.f32641e;
                a(1);
                return zB;
            }
            if (j4 - this.f32633c > 500000) {
                a(3);
            }
        }
        return zB;
    }

    private void a(int i) {
        this.f32632b = i;
        if (i == 0) {
            this.f32635e = 0L;
            this.f32636f = -1L;
            this.f32633c = System.nanoTime() / 1000;
            this.f32634d = 10000L;
            return;
        }
        if (i == 1) {
            this.f32634d = 10000L;
            return;
        }
        if (i == 2 || i == 3) {
            this.f32634d = 10000000L;
        } else {
            if (i == 4) {
                this.f32634d = 500000L;
                return;
            }
            throw new IllegalStateException();
        }
    }
}
