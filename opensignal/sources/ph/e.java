package ph;

import com.google.android.exoplayer2.source.MediaSourceEventListener;

/* loaded from: classes.dex */
public final class e implements oh.d {

    /* renamed from: a, reason: collision with root package name */
    public final MediaSourceEventListener.MediaLoadData f20560a;

    public e(MediaSourceEventListener.MediaLoadData mediaLoadData) {
        br.l.e(mediaLoadData, "mediaLoadDataDelegate");
        this.f20560a = mediaLoadData;
    }

    @Override // oh.d
    public final long b() {
        return this.f20560a.mediaEndTimeMs;
    }

    @Override // oh.d
    public final int r() {
        return this.f20560a.dataType;
    }

    @Override // oh.d
    public final oh.l v() {
        return new h(this.f20560a.trackFormat);
    }

    @Override // oh.d
    public final long w() {
        return this.f20560a.mediaStartTimeMs;
    }

    @Override // oh.d
    public final int x() {
        return this.f20560a.trackType;
    }
}
