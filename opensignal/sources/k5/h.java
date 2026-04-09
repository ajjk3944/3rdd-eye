package k5;

import androidx.media3.common.DrmInitData;

/* loaded from: classes.dex */
public abstract class h implements Comparable {
    public final String B;
    public final String D;
    public final long E;
    public final long F;
    public final boolean G;

    /* renamed from: a, reason: collision with root package name */
    public final String f14057a;

    /* renamed from: d, reason: collision with root package name */
    public final g f14058d;

    /* renamed from: g, reason: collision with root package name */
    public final long f14059g;

    /* renamed from: r, reason: collision with root package name */
    public final int f14060r;

    /* renamed from: x, reason: collision with root package name */
    public final long f14061x;

    /* renamed from: y, reason: collision with root package name */
    public final DrmInitData f14062y;

    public h(String str, g gVar, long j, int i10, long j7, DrmInitData drmInitData, String str2, String str3, long j10, long j11, boolean z10) {
        this.f14057a = str;
        this.f14058d = gVar;
        this.f14059g = j;
        this.f14060r = i10;
        this.f14061x = j7;
        this.f14062y = drmInitData;
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
        long j = this.f14061x;
        if (j > jLongValue) {
            return 1;
        }
        return j < l10.longValue() ? -1 : 0;
    }
}
