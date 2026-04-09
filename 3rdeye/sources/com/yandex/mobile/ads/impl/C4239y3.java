package com.yandex.mobile.ads.impl;

import android.content.Context;
import c9.C2092m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.y3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4239y3 {

    /* renamed from: a, reason: collision with root package name */
    private final C4232x3 f35602a;

    public C4239y3(Context context, zs adBreak, wl0 adPlayerController, ej0 imageProvider, pm0 adViewsHolderManager, cc2<tn0> playbackEventsListener) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adBreak, "adBreak");
        kotlin.jvm.internal.l.f(adPlayerController, "adPlayerController");
        kotlin.jvm.internal.l.f(imageProvider, "imageProvider");
        kotlin.jvm.internal.l.f(adViewsHolderManager, "adViewsHolderManager");
        kotlin.jvm.internal.l.f(playbackEventsListener, "playbackEventsListener");
        this.f35602a = new C4232x3(context, adBreak, C4085c2.a(adBreak.a().c()), imageProvider, adPlayerController, adViewsHolderManager, playbackEventsListener);
    }

    public final ArrayList a(List videoAdInfoList) {
        kotlin.jvm.internal.l.f(videoAdInfoList, "videoAdInfoList");
        ArrayList arrayList = new ArrayList(C2092m.T(videoAdInfoList, 10));
        Iterator it = videoAdInfoList.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f35602a.a((mb2) it.next()));
        }
        return arrayList;
    }
}
