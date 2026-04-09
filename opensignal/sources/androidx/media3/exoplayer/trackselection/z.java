package androidx.media3.exoplayer.trackselection;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final TrackSelection[] f1935a;

    /* renamed from: b, reason: collision with root package name */
    public int f1936b;

    public z(TrackSelection... trackSelectionArr) {
        this.f1935a = trackSelectionArr;
        int length = trackSelectionArr.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f1935a, ((z) obj).f1935a);
    }

    public final int hashCode() {
        if (this.f1936b == 0) {
            this.f1936b = 527 + Arrays.hashCode(this.f1935a);
        }
        return this.f1936b;
    }
}
