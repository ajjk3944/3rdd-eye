package com.google.android.exoplayer2;

/* loaded from: classes.dex */
public final /* synthetic */ class u implements qb.h, a5.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4591a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4592d;

    public /* synthetic */ u(int i10, int i11) {
        this.f4591a = i11;
        this.f4592d = i10;
    }

    @Override // qb.h, a5.j
    public final void a(Object obj) {
        switch (this.f4591a) {
            case 0:
                ((d1) obj).onRepeatModeChanged(this.f4592d);
                break;
            case 1:
                ((androidx.media3.common.q0) obj).onAudioSessionIdChanged(this.f4592d);
                break;
            default:
                ((androidx.media3.common.q0) obj).onRepeatModeChanged(this.f4592d);
                break;
        }
    }
}
