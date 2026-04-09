package ob;

import com.google.android.exoplayer2.trackselection.TrackSelection;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f19247a;

    /* renamed from: b, reason: collision with root package name */
    public final TrackSelection[] f19248b;

    /* renamed from: c, reason: collision with root package name */
    public int f19249c;

    public j(TrackSelection... trackSelectionArr) {
        this.f19248b = trackSelectionArr;
        this.f19247a = trackSelectionArr.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f19248b, ((j) obj).f19248b);
    }

    public final int hashCode() {
        if (this.f19249c == 0) {
            this.f19249c = 527 + Arrays.hashCode(this.f19248b);
        }
        return this.f19249c;
    }
}
