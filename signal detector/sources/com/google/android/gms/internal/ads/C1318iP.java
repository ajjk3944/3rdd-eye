package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* renamed from: com.google.android.gms.internal.ads.iP, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1318iP extends AudioTrack$StreamEventCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2041vw f14721a;

    public C1318iP(C2041vw c2041vw) {
        this.f14721a = c2041vw;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i) {
        C1009cp c1009cp = ((C1424kP) this.f14721a.f17371d).f15156h;
        c1009cp.c(-1, EO.f7953f);
        c1009cp.d();
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        C1009cp c1009cp = ((C1424kP) this.f14721a.f17371d).f15156h;
        c1009cp.c(-1, EO.f7951d);
        c1009cp.d();
    }

    public final void onTearDown(AudioTrack audioTrack) {
        C1009cp c1009cp = ((C1424kP) this.f14721a.f17371d).f15156h;
        c1009cp.c(-1, EO.f7952e);
        c1009cp.d();
    }
}
