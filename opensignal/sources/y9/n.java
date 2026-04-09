package y9;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class n {
    public long A;
    public long B;
    public long C;
    public boolean D;
    public long E;
    public long F;

    /* renamed from: a, reason: collision with root package name */
    public final oh.p f25934a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f25935b;

    /* renamed from: c, reason: collision with root package name */
    public AudioTrack f25936c;

    /* renamed from: d, reason: collision with root package name */
    public int f25937d;

    /* renamed from: e, reason: collision with root package name */
    public int f25938e;

    /* renamed from: f, reason: collision with root package name */
    public f5.n f25939f;

    /* renamed from: g, reason: collision with root package name */
    public int f25940g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f25941h;

    /* renamed from: i, reason: collision with root package name */
    public long f25942i;
    public float j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public long f25943l;

    /* renamed from: m, reason: collision with root package name */
    public long f25944m;

    /* renamed from: n, reason: collision with root package name */
    public Method f25945n;

    /* renamed from: o, reason: collision with root package name */
    public long f25946o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f25947p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f25948q;

    /* renamed from: r, reason: collision with root package name */
    public long f25949r;

    /* renamed from: s, reason: collision with root package name */
    public long f25950s;

    /* renamed from: t, reason: collision with root package name */
    public long f25951t;

    /* renamed from: u, reason: collision with root package name */
    public long f25952u;

    /* renamed from: v, reason: collision with root package name */
    public int f25953v;

    /* renamed from: w, reason: collision with root package name */
    public int f25954w;

    /* renamed from: x, reason: collision with root package name */
    public long f25955x;

    /* renamed from: y, reason: collision with root package name */
    public long f25956y;

    /* renamed from: z, reason: collision with root package name */
    public long f25957z;

    public n(oh.p pVar) {
        this.f25934a = pVar;
        if (qb.v.f20828a >= 18) {
            try {
                this.f25945n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f25935b = new long[10];
    }

    public final long a() {
        AudioTrack audioTrack = this.f25936c;
        audioTrack.getClass();
        if (this.f25955x != -9223372036854775807L) {
            return Math.min(this.A, this.f25957z + ((((SystemClock.elapsedRealtime() * 1000) - this.f25955x) * this.f25940g) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
        if (this.f25941h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f25952u = this.f25950s;
            }
            playbackHeadPosition += this.f25952u;
        }
        if (qb.v.f20828a <= 29) {
            if (playbackHeadPosition == 0 && this.f25950s > 0 && playState == 3) {
                if (this.f25956y == -9223372036854775807L) {
                    this.f25956y = SystemClock.elapsedRealtime();
                }
                return this.f25950s;
            }
            this.f25956y = -9223372036854775807L;
        }
        if (this.f25950s > playbackHeadPosition) {
            this.f25951t++;
        }
        this.f25950s = playbackHeadPosition;
        return playbackHeadPosition + (this.f25951t << 32);
    }

    public final boolean b(long j) {
        if (j > a()) {
            return true;
        }
        if (!this.f25941h) {
            return false;
        }
        AudioTrack audioTrack = this.f25936c;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 2 && a() == 0;
    }
}
