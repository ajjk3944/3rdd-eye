package androidx.media3.exoplayer.trackselection;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements ne.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DefaultTrackSelector f1890a;

    public /* synthetic */ f(DefaultTrackSelector defaultTrackSelector) {
        this.f1890a = defaultTrackSelector;
    }

    @Override // ne.j
    public final boolean apply(Object obj) {
        return this.f1890a.isAudioFormatWithinAudioChannelCountConstraints((androidx.media3.common.r) obj);
    }
}
