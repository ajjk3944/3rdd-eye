package com.yandex.mobile.ads.impl;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
final class sh {

    /* renamed from: A, reason: collision with root package name */
    private long f33036A;

    /* renamed from: B, reason: collision with root package name */
    private long f33037B;

    /* renamed from: C, reason: collision with root package name */
    private long f33038C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f33039D;

    /* renamed from: E, reason: collision with root package name */
    private long f33040E;

    /* renamed from: F, reason: collision with root package name */
    private long f33041F;

    /* renamed from: a, reason: collision with root package name */
    private final a f33042a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f33043b;

    /* renamed from: c, reason: collision with root package name */
    private AudioTrack f33044c;

    /* renamed from: d, reason: collision with root package name */
    private int f33045d;

    /* renamed from: e, reason: collision with root package name */
    private int f33046e;

    /* renamed from: f, reason: collision with root package name */
    private rh f33047f;

    /* renamed from: g, reason: collision with root package name */
    private int f33048g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f33049h;
    private long i;

    /* renamed from: j, reason: collision with root package name */
    private float f33050j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f33051k;

    /* renamed from: l, reason: collision with root package name */
    private long f33052l;

    /* renamed from: m, reason: collision with root package name */
    private long f33053m;

    /* renamed from: n, reason: collision with root package name */
    private Method f33054n;

    /* renamed from: o, reason: collision with root package name */
    private long f33055o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f33056p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f33057q;

    /* renamed from: r, reason: collision with root package name */
    private long f33058r;

    /* renamed from: s, reason: collision with root package name */
    private long f33059s;

    /* renamed from: t, reason: collision with root package name */
    private long f33060t;

    /* renamed from: u, reason: collision with root package name */
    private long f33061u;

    /* renamed from: v, reason: collision with root package name */
    private int f33062v;

    /* renamed from: w, reason: collision with root package name */
    private int f33063w;

    /* renamed from: x, reason: collision with root package name */
    private long f33064x;

    /* renamed from: y, reason: collision with root package name */
    private long f33065y;

    /* renamed from: z, reason: collision with root package name */
    private long f33066z;

    public interface a {
        void a(int i, long j4);

        void a(long j4);

        void a(long j4, long j10, long j11, long j12);

        void b(long j4);

        void b(long j4, long j10, long j11, long j12);
    }

    public sh(a aVar) {
        this.f33042a = (a) zf.a(aVar);
        if (s82.f32899a >= 18) {
            try {
                this.f33054n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f33043b = new long[10];
    }

    private long a(long j4) {
        return (j4 * 1000000) / this.f33048g;
    }

    public final int b(long j4) {
        return this.f33046e - ((int) (j4 - (a() * this.f33045d)));
    }

    public final void c(long j4) {
        this.f33066z = a();
        this.f33064x = SystemClock.elapsedRealtime() * 1000;
        this.f33036A = j4;
    }

    public final boolean d(long j4) {
        if (j4 > a()) {
            return true;
        }
        if (!this.f33049h) {
            return false;
        }
        AudioTrack audioTrack = this.f33044c;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 2 && a() == 0;
    }

    public final boolean e(long j4) {
        return this.f33065y != -9223372036854775807L && j4 > 0 && SystemClock.elapsedRealtime() - this.f33065y >= 200;
    }

    public final boolean f(long j4) {
        AudioTrack audioTrack = this.f33044c;
        audioTrack.getClass();
        int playState = audioTrack.getPlayState();
        if (this.f33049h) {
            if (playState == 2) {
                this.f33056p = false;
                return false;
            }
            if (playState == 1 && a() == 0) {
                return false;
            }
        }
        boolean z10 = this.f33056p;
        boolean zD = d(j4);
        this.f33056p = zD;
        if (z10 && !zD && playState != 1) {
            this.f33042a.a(this.f33046e, s82.b(this.i));
        }
        return true;
    }

    public final long a(boolean z10) {
        long jA;
        float f10;
        long j4;
        long j10;
        long jRound;
        Method method;
        AudioTrack audioTrack = this.f33044c;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 3) {
            long jA2 = a(a());
            if (jA2 != 0) {
                long jNanoTime = System.nanoTime() / 1000;
                if (jNanoTime - this.f33053m >= 30000) {
                    long[] jArr = this.f33043b;
                    int i = this.f33062v;
                    jArr[i] = jA2 - jNanoTime;
                    this.f33062v = (i + 1) % 10;
                    int i10 = this.f33063w;
                    if (i10 < 10) {
                        this.f33063w = i10 + 1;
                    }
                    this.f33053m = jNanoTime;
                    this.f33052l = 0L;
                    int i11 = 0;
                    while (true) {
                        int i12 = this.f33063w;
                        if (i11 >= i12) {
                            break;
                        }
                        this.f33052l = (this.f33043b[i11] / i12) + this.f33052l;
                        i11++;
                    }
                }
                if (!this.f33049h) {
                    rh rhVar = this.f33047f;
                    rhVar.getClass();
                    if (rhVar.a(jNanoTime)) {
                        long jC = rhVar.c();
                        long jB = rhVar.b();
                        if (Math.abs(jC - jNanoTime) > 5000000) {
                            this.f33042a.b(jB, jC, jNanoTime, jA2);
                            rhVar.e();
                        } else if (Math.abs(a(jB) - jA2) > 5000000) {
                            this.f33042a.a(jB, jC, jNanoTime, jA2);
                            rhVar.e();
                        } else {
                            rhVar.a();
                        }
                    }
                    if (this.f33057q && (method = this.f33054n) != null && jNanoTime - this.f33058r >= 500000) {
                        try {
                            AudioTrack audioTrack2 = this.f33044c;
                            audioTrack2.getClass();
                            Integer num = (Integer) method.invoke(audioTrack2, new Object[0]);
                            int i13 = s82.f32899a;
                            long jIntValue = (num.intValue() * 1000) - this.i;
                            this.f33055o = jIntValue;
                            long jMax = Math.max(jIntValue, 0L);
                            this.f33055o = jMax;
                            if (jMax > 5000000) {
                                this.f33042a.b(jMax);
                                this.f33055o = 0L;
                            }
                        } catch (Exception unused) {
                            this.f33054n = null;
                        }
                        this.f33058r = jNanoTime;
                    }
                }
            }
        }
        long jNanoTime2 = System.nanoTime() / 1000;
        rh rhVar2 = this.f33047f;
        rhVar2.getClass();
        boolean zD = rhVar2.d();
        if (zD) {
            long jA3 = a(rhVar2.b());
            long jC2 = jNanoTime2 - rhVar2.c();
            float f11 = this.f33050j;
            int i14 = s82.f32899a;
            if (f11 != 1.0f) {
                jC2 = Math.round(jC2 * f11);
            }
            jA = jC2 + jA3;
        } else {
            jA = this.f33063w == 0 ? a(a()) : this.f33052l + jNanoTime2;
            if (!z10) {
                jA = Math.max(0L, jA - this.f33055o);
            }
        }
        if (this.f33039D != zD) {
            this.f33041F = this.f33038C;
            this.f33040E = this.f33037B;
        }
        long j11 = jNanoTime2 - this.f33041F;
        if (j11 < 1000000) {
            long j12 = this.f33040E;
            float f12 = this.f33050j;
            int i15 = s82.f32899a;
            if (f12 == 1.0f) {
                f10 = 1.0f;
                j4 = jA;
                j10 = 1000000;
                jRound = j11;
            } else {
                f10 = 1.0f;
                j4 = jA;
                j10 = 1000000;
                jRound = Math.round(j11 * f12);
            }
            long j13 = (j11 * 1000) / j10;
            jA = (((1000 - j13) * (jRound + j12)) + (j4 * j13)) / 1000;
        } else {
            f10 = 1.0f;
        }
        if (!this.f33051k) {
            long j14 = this.f33037B;
            if (jA > j14) {
                this.f33051k = true;
                long jB2 = s82.b(jA - j14);
                float f13 = this.f33050j;
                if (f13 != f10) {
                    jB2 = Math.round(jB2 / f13);
                }
                this.f33042a.a(System.currentTimeMillis() - s82.b(jB2));
            }
        }
        this.f33038C = jNanoTime2;
        this.f33037B = jA;
        this.f33039D = zD;
        return jA;
    }

    public final boolean b() {
        AudioTrack audioTrack = this.f33044c;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 3;
    }

    public final void e() {
        rh rhVar = this.f33047f;
        rhVar.getClass();
        rhVar.f();
    }

    public final boolean c() {
        this.f33052l = 0L;
        this.f33063w = 0;
        this.f33062v = 0;
        this.f33053m = 0L;
        this.f33038C = 0L;
        this.f33041F = 0L;
        this.f33051k = false;
        if (this.f33064x != -9223372036854775807L) {
            return false;
        }
        rh rhVar = this.f33047f;
        rhVar.getClass();
        rhVar.f();
        return true;
    }

    public final void d() {
        this.f33052l = 0L;
        this.f33063w = 0;
        this.f33062v = 0;
        this.f33053m = 0L;
        this.f33038C = 0L;
        this.f33041F = 0L;
        this.f33051k = false;
        this.f33044c = null;
        this.f33047f = null;
    }

    private long a() {
        AudioTrack audioTrack = this.f33044c;
        audioTrack.getClass();
        if (this.f33064x != -9223372036854775807L) {
            return Math.min(this.f33036A, this.f33066z + ((((SystemClock.elapsedRealtime() * 1000) - this.f33064x) * this.f33048g) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
        if (this.f33049h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f33061u = this.f33059s;
            }
            playbackHeadPosition += this.f33061u;
        }
        if (s82.f32899a <= 29) {
            if (playbackHeadPosition == 0 && this.f33059s > 0 && playState == 3) {
                if (this.f33065y == -9223372036854775807L) {
                    this.f33065y = SystemClock.elapsedRealtime();
                }
                return this.f33059s;
            }
            this.f33065y = -9223372036854775807L;
        }
        if (this.f33059s > playbackHeadPosition) {
            this.f33060t++;
        }
        this.f33059s = playbackHeadPosition;
        return playbackHeadPosition + (this.f33060t << 32);
    }

    public final void a(AudioTrack audioTrack, boolean z10, int i, int i10, int i11) {
        this.f33044c = audioTrack;
        this.f33045d = i10;
        this.f33046e = i11;
        this.f33047f = new rh(audioTrack);
        this.f33048g = audioTrack.getSampleRate();
        this.f33049h = z10 && s82.f32899a < 23 && (i == 5 || i == 6);
        boolean zE = s82.e(i);
        this.f33057q = zE;
        this.i = zE ? a(i11 / i10) : -9223372036854775807L;
        this.f33059s = 0L;
        this.f33060t = 0L;
        this.f33061u = 0L;
        this.f33056p = false;
        this.f33064x = -9223372036854775807L;
        this.f33065y = -9223372036854775807L;
        this.f33058r = 0L;
        this.f33055o = 0L;
        this.f33050j = 1.0f;
    }

    public final void a(float f10) {
        this.f33050j = f10;
        rh rhVar = this.f33047f;
        if (rhVar != null) {
            rhVar.f();
        }
    }
}
