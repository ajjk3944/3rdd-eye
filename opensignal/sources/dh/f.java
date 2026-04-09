package dh;

import ch.n;
import nh.h;
import w.g;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: p, reason: collision with root package name */
    public static final h f7370p = h.UNKNOWN;

    /* renamed from: a, reason: collision with root package name */
    public final int f7371a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7372b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7373c;

    /* renamed from: d, reason: collision with root package name */
    public final String f7374d;

    /* renamed from: e, reason: collision with root package name */
    public final String f7375e;

    /* renamed from: f, reason: collision with root package name */
    public final h f7376f;

    /* renamed from: g, reason: collision with root package name */
    public final long f7377g;

    /* renamed from: h, reason: collision with root package name */
    public final long f7378h;

    /* renamed from: i, reason: collision with root package name */
    public final long f7379i;
    public final long j;
    public final long k;

    /* renamed from: l, reason: collision with root package name */
    public final long f7380l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f7381m;

    /* renamed from: n, reason: collision with root package name */
    public final int f7382n;

    /* renamed from: o, reason: collision with root package name */
    public final long f7383o;

    public f(int i10, String str, String str2, String str3, long j, long j7, long j10, long j11, long j12, long j13, boolean z10, int i11, h hVar, int i12, long j14) {
        this.f7371a = i10;
        this.f7373c = str;
        this.f7374d = str2;
        this.f7375e = str3;
        this.f7376f = hVar;
        this.f7377g = j;
        this.f7378h = j7;
        this.f7379i = j10;
        this.j = j11;
        this.k = j12;
        this.f7380l = j13;
        this.f7381m = z10;
        this.f7382n = i11;
        this.f7372b = i12;
        this.f7383o = j14;
        n.b("VideoTestConfig", "VideoTestConfig() called with: object = [", toString(), "]");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VideoTestConfig{mProbability=");
        sb2.append(this.f7371a);
        sb2.append(", mRoutine='");
        sb2.append(this.f7373c);
        sb2.append("', mResource='");
        sb2.append(this.f7374d);
        sb2.append("', mQuality='");
        sb2.append(this.f7375e);
        sb2.append("', mManifest=");
        sb2.append(this.f7376f);
        sb2.append(", mTestLength=");
        sb2.append(this.f7377g);
        sb2.append(", mGlobalTimeoutMs=");
        sb2.append(this.f7378h);
        sb2.append(", mInitialisationTimeoutMs=");
        sb2.append(this.f7379i);
        sb2.append(", mBufferingTimeoutMs=");
        sb2.append(this.j);
        sb2.append(", mSeekingTimeoutMs=");
        sb2.append(this.k);
        sb2.append(", mVideoInfoRequestTimeoutMs=");
        sb2.append(this.f7380l);
        sb2.append(", mUseExoplayerAnalyticsListener=");
        sb2.append(this.f7381m);
        sb2.append(", mYoutubeParserVersion=");
        sb2.append(this.f7382n);
        sb2.append(", mIgnoreDeviceScreenResolutionProbability=");
        sb2.append(this.f7372b);
        sb2.append(", mTrafficStatsFrequencyMs=");
        return g.h(sb2, this.f7383o, '}');
    }
}
