package com.instagram.common.viewpoint.core;

import com.facebook.ads.androidx.media3.exoplayer.drm.DrmSessionEventListener;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: assets/audience_network/classes2.dex */
public class A1 {
    public final int A00;
    public final C2222no A01;
    public final CopyOnWriteArrayList<DrmSessionEventListener.EventDispatcher.ListenerAndHandler> A02;

    public A1() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    public A1(CopyOnWriteArrayList<DrmSessionEventListener.EventDispatcher.ListenerAndHandler> listenerAndHandlers, int i10, C2222no c2222no) {
        this.A02 = listenerAndHandlers;
        this.A00 = i10;
        this.A01 = c2222no;
    }

    public final A1 A00(int i10, C2222no c2222no) {
        return new A1(this.A02, i10, c2222no);
    }
}
