package ob;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import oe.a0;

/* loaded from: classes.dex */
public final class d implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f19235a;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f19236d;

    public d(Format format, int i10) {
        this.f19235a = (format.f4025r & 1) != 0;
        this.f19236d = DefaultTrackSelector.isSupported(i10, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        d dVar = (d) obj;
        return a0.f19295a.c(this.f19236d, dVar.f19236d).c(this.f19235a, dVar.f19235a).e();
    }
}
