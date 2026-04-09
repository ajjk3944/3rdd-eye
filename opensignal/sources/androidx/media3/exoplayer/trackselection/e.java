package androidx.media3.exoplayer.trackselection;

import a5.d0;
import android.os.SystemClock;
import androidx.media3.common.b1;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class e implements v {

    /* renamed from: a, reason: collision with root package name */
    public final b1 f1883a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1884b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f1885c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1886d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.media3.common.r[] f1887e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f1888f;

    /* renamed from: g, reason: collision with root package name */
    public int f1889g;

    public e(int i10, b1 b1Var, int[] iArr) {
        int i11 = 0;
        a5.a.i(iArr.length > 0);
        this.f1886d = i10;
        b1Var.getClass();
        this.f1883a = b1Var;
        int length = iArr.length;
        this.f1884b = length;
        this.f1887e = new androidx.media3.common.r[length];
        for (int i12 = 0; i12 < iArr.length; i12++) {
            this.f1887e[i12] = b1Var.f1575r[iArr[i12]];
        }
        Arrays.sort(this.f1887e, new d(0));
        this.f1885c = new int[this.f1884b];
        while (true) {
            int i13 = this.f1884b;
            if (i11 >= i13) {
                this.f1888f = new long[i13];
                return;
            } else {
                this.f1885c[i11] = b1Var.a(this.f1887e[i11]);
                i11++;
            }
        }
    }

    @Override // androidx.media3.exoplayer.trackselection.v
    public void b() {
    }

    @Override // androidx.media3.exoplayer.trackselection.v
    public int c(long j, List list) {
        return list.size();
    }

    @Override // androidx.media3.exoplayer.trackselection.v
    public void d() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            e eVar = (e) obj;
            if (this.f1883a == eVar.f1883a && Arrays.equals(this.f1885c, eVar.f1885c)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.trackselection.v
    public void f(float f10) {
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public final androidx.media3.common.r getFormat(int i10) {
        return this.f1887e[i10];
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public final int getIndexInTrackGroup(int i10) {
        return this.f1885c[i10];
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public final b1 getTrackGroup() {
        return this.f1883a;
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public final int getType() {
        return this.f1886d;
    }

    public final int hashCode() {
        if (this.f1889g == 0) {
            this.f1889g = Arrays.hashCode(this.f1885c) + (System.identityHashCode(this.f1883a) * 31);
        }
        return this.f1889g;
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public final int indexOf(androidx.media3.common.r rVar) {
        for (int i10 = 0; i10 < this.f1884b; i10++) {
            if (this.f1887e[i10] == rVar) {
                return i10;
            }
        }
        return -1;
    }

    @Override // androidx.media3.exoplayer.trackselection.v
    public final boolean j(int i10, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zK = k(i10, jElapsedRealtime);
        int i11 = 0;
        while (i11 < this.f1884b && !zK) {
            zK = (i11 == i10 || k(i11, jElapsedRealtime)) ? false : true;
            i11++;
        }
        if (!zK) {
            return false;
        }
        long[] jArr = this.f1888f;
        long j7 = jArr[i10];
        int i12 = d0.f105a;
        long j10 = jElapsedRealtime + j;
        if (((j ^ j10) & (jElapsedRealtime ^ j10)) < 0) {
            j10 = Long.MAX_VALUE;
        }
        jArr[i10] = Math.max(j7, j10);
        return true;
    }

    @Override // androidx.media3.exoplayer.trackselection.v
    public final boolean k(int i10, long j) {
        return this.f1888f[i10] > j;
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public final int length() {
        return this.f1885c.length;
    }

    @Override // androidx.media3.exoplayer.trackselection.v
    public final int m() {
        return this.f1885c[a()];
    }

    @Override // androidx.media3.exoplayer.trackselection.v
    public final androidx.media3.common.r n() {
        return this.f1887e[a()];
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public final int indexOf(int i10) {
        for (int i11 = 0; i11 < this.f1884b; i11++) {
            if (this.f1885c[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }
}
