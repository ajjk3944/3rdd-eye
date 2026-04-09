package androidx.media3.exoplayer.trackselection;

/* loaded from: classes.dex */
public final class j implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1899a;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1900d;

    public j(int i10, androidx.media3.common.r rVar) {
        this.f1899a = (rVar.f1787r & 1) != 0;
        this.f1900d = DefaultTrackSelector.isSupported(i10, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        j jVar = (j) obj;
        return oe.a0.f19295a.c(this.f1900d, jVar.f1900d).c(this.f1899a, jVar.f1899a).e();
    }
}
