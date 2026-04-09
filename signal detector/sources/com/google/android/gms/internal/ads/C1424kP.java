package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.Build;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.kP, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1424kP {

    /* renamed from: p, reason: collision with root package name */
    public static final Object f15146p = new Object();

    /* renamed from: q, reason: collision with root package name */
    public static ScheduledExecutorService f15147q;

    /* renamed from: r, reason: collision with root package name */
    public static int f15148r;

    /* renamed from: a, reason: collision with root package name */
    public final AudioTrack f15149a;

    /* renamed from: b, reason: collision with root package name */
    public final ZO f15150b;

    /* renamed from: c, reason: collision with root package name */
    public C2222zE f15151c;

    /* renamed from: d, reason: collision with root package name */
    public final C1478lP f15152d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f15153e;

    /* renamed from: f, reason: collision with root package name */
    public final int f15154f;

    /* renamed from: g, reason: collision with root package name */
    public final C2041vw f15155g;

    /* renamed from: h, reason: collision with root package name */
    public final C1009cp f15156h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public long f15157j;

    /* renamed from: k, reason: collision with root package name */
    public long f15158k;

    /* renamed from: l, reason: collision with root package name */
    public int f15159l;

    /* renamed from: m, reason: collision with root package name */
    public int f15160m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f15161n;

    /* renamed from: o, reason: collision with root package name */
    public final C1448kw f15162o;

    public C1424kP(AudioTrack audioTrack, ZO zo, C1448kw c1448kw, C1994v2 c1994v2) {
        this.f15149a = audioTrack;
        this.f15150b = zo;
        this.f15162o = c1448kw;
        C1009cp c1009cp = new C1009cp(Thread.currentThread());
        this.f15156h = c1009cp;
        c1009cp.f13673b = false;
        boolean zA = Vt.a(zo.f12882a);
        this.f15153e = zA;
        if (zA) {
            this.f15154f = Vt.d(zo.f12882a) * Integer.bitCount(zo.f12884c);
        } else {
            this.f15154f = -1;
        }
        this.f15152d = new C1478lP(new C2255zu(12, this), c1994v2, audioTrack, zo.f12882a, this.f15154f, zo.f12885d);
        if (Build.VERSION.SDK_INT >= 24 && c1448kw != null) {
            this.f15151c = new C2222zE(audioTrack, c1448kw);
        }
        this.f15155g = b() ? new C2041vw(this) : null;
    }

    public final boolean a(ByteBuffer byteBuffer, int i) {
        int underrunCount;
        boolean z6;
        C1448kw c1448kw;
        boolean z7 = this.f15153e;
        if (!z7 && this.f15159l == 0) {
            this.f15159l = C1801rP.c(byteBuffer, this.f15150b.f12882a);
        }
        long jC = c();
        int i3 = Build.VERSION.SDK_INT;
        AudioTrack audioTrack = this.f15149a;
        if (i3 >= 24) {
            underrunCount = audioTrack.getUnderrunCount();
        } else {
            boolean z8 = this.f15161n;
            long jA = this.f15152d.a();
            int sampleRate = audioTrack.getSampleRate();
            String str = Vt.f12096a;
            boolean z9 = jC > Vt.u(jA, (long) sampleRate, 1000000L, RoundingMode.UP);
            this.f15161n = z9;
            underrunCount = (!z8 || z9 || audioTrack.getPlayState() == 1) ? this.f15160m : this.f15160m + 1;
        }
        int i6 = this.f15160m;
        this.f15160m = underrunCount;
        if (underrunCount > i6) {
            EO eo = EO.f7950c;
            C1009cp c1009cp = this.f15156h;
            c1009cp.c(-1, eo);
            c1009cp.d();
        }
        int iRemaining = byteBuffer.remaining();
        int iWrite = audioTrack.write(byteBuffer, byteBuffer.remaining(), 1);
        if (iWrite >= 0) {
            z6 = iWrite == iRemaining;
            if (z7) {
                this.f15157j += iWrite;
                return z6;
            }
            if (z6) {
                this.f15158k = (this.f15159l * i) + this.f15158k;
            }
            return z6;
        }
        z6 = (i3 >= 24 && iWrite == -6) || iWrite == -32;
        if (z6 && (c1448kw = this.f15162o) != null) {
            K4.c cVar = (K4.c) c1448kw.f15314b;
            C0447Bq c0447Bq = (C0447Bq) cVar.f2215h;
            if (c0447Bq != null) {
                OO oo = OO.f10188c;
                cVar.f2214g = oo;
                c0447Bq.a(oo);
            }
        }
        throw new TO(iWrite, z6);
    }

    public final boolean b() {
        return Build.VERSION.SDK_INT >= 29 && this.f15149a.isOffloadedPlayback();
    }

    public final long c() {
        if (!this.f15153e) {
            return this.f15158k;
        }
        long j6 = this.f15157j;
        String str = Vt.f12096a;
        return ((j6 + r2) - 1) / this.f15154f;
    }
}
