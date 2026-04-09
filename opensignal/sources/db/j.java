package db;

import com.google.android.exoplayer2.drm.DrmInitData;

/* loaded from: classes.dex */
public abstract class j implements Comparable {
    public final String B;
    public final String D;
    public final long E;
    public final long F;
    public final boolean G;

    /* renamed from: a, reason: collision with root package name */
    public final String f7229a;

    /* renamed from: d, reason: collision with root package name */
    public final i f7230d;

    /* renamed from: g, reason: collision with root package name */
    public final long f7231g;

    /* renamed from: r, reason: collision with root package name */
    public final int f7232r;

    /* renamed from: x, reason: collision with root package name */
    public final long f7233x;

    /* renamed from: y, reason: collision with root package name */
    public final DrmInitData f7234y;

    public j(String str, i iVar, long j, int i10, long j7, DrmInitData drmInitData, String str2, String str3, long j10, long j11, boolean z10) {
        this.f7229a = str;
        this.f7230d = iVar;
        this.f7231g = j;
        this.f7232r = i10;
        this.f7233x = j7;
        this.f7234y = drmInitData;
        this.B = str2;
        this.D = str3;
        this.E = j10;
        this.F = j11;
        this.G = z10;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Long l10 = (Long) obj;
        long jLongValue = l10.longValue();
        long j = this.f7233x;
        if (j > jLongValue) {
            return 1;
        }
        return j < l10.longValue() ? -1 : 0;
    }
}
