package ob;

import android.os.SystemClock;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import java.util.Arrays;
import java.util.List;
import qb.v;

/* loaded from: classes.dex */
public abstract class c implements f {

    /* renamed from: a, reason: collision with root package name */
    public final TrackGroup f19228a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19229b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f19230c;

    /* renamed from: d, reason: collision with root package name */
    public final int f19231d;

    /* renamed from: e, reason: collision with root package name */
    public final Format[] f19232e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f19233f;

    /* renamed from: g, reason: collision with root package name */
    public int f19234g;

    public c(TrackGroup trackGroup, int[] iArr, int i10) {
        int i11 = 0;
        qb.b.j(iArr.length > 0);
        this.f19231d = i10;
        trackGroup.getClass();
        this.f19228a = trackGroup;
        int length = iArr.length;
        this.f19229b = length;
        this.f19232e = new Format[length];
        for (int i12 = 0; i12 < iArr.length; i12++) {
            this.f19232e[i12] = trackGroup.f4454d[iArr[i12]];
        }
        Arrays.sort(this.f19232e, new androidx.media3.exoplayer.trackselection.d(25));
        this.f19230c = new int[this.f19229b];
        while (true) {
            int i13 = this.f19229b;
            if (i11 >= i13) {
                this.f19233f = new long[i13];
                return;
            } else {
                this.f19230c[i11] = trackGroup.d(this.f19232e[i11]);
                i11++;
            }
        }
    }

    @Override // ob.f
    public int c(long j, List list) {
        return list.size();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f19228a == cVar.f19228a && Arrays.equals(this.f19230c, cVar.f19230c)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public final Format getFormat(int i10) {
        return this.f19232e[i10];
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public final int getIndexInTrackGroup(int i10) {
        return this.f19230c[i10];
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public final TrackGroup getTrackGroup() {
        return this.f19228a;
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public final int getType() {
        return this.f19231d;
    }

    public final int hashCode() {
        if (this.f19234g == 0) {
            this.f19234g = Arrays.hashCode(this.f19230c) + (System.identityHashCode(this.f19228a) * 31);
        }
        return this.f19234g;
    }

    public final boolean i(int i10, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zJ = j(i10, jElapsedRealtime);
        int i11 = 0;
        while (i11 < this.f19229b && !zJ) {
            zJ = (i11 == i10 || j(i11, jElapsedRealtime)) ? false : true;
            i11++;
        }
        if (!zJ) {
            return false;
        }
        long[] jArr = this.f19233f;
        long j7 = jArr[i10];
        int i12 = v.f20828a;
        long j10 = jElapsedRealtime + j;
        if (((j ^ j10) & (jElapsedRealtime ^ j10)) < 0) {
            j10 = Long.MAX_VALUE;
        }
        jArr[i10] = Math.max(j7, j10);
        return true;
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public final int indexOf(Format format) {
        for (int i10 = 0; i10 < this.f19229b; i10++) {
            if (this.f19232e[i10] == format) {
                return i10;
            }
        }
        return -1;
    }

    public final boolean j(int i10, long j) {
        return this.f19233f[i10] > j;
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public final int length() {
        return this.f19230c.length;
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public final int indexOf(int i10) {
        for (int i11 = 0; i11 < this.f19229b; i11++) {
            if (this.f19230c[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    @Override // ob.f
    public void b() {
    }

    @Override // ob.f
    public void d() {
    }

    @Override // ob.f
    public void f(float f10) {
    }
}
