package com.yandex.mobile.ads.impl;

import android.content.Context;
import c9.C2092m;
import com.facebook.ads.AdSDKNotificationListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class xf2 {

    /* renamed from: c, reason: collision with root package name */
    private static final List<String> f35289c = C2092m.W("clickTracking", AdSDKNotificationListener.IMPRESSION_EVENT);

    /* renamed from: a, reason: collision with root package name */
    private final ee2 f35290a;

    /* renamed from: b, reason: collision with root package name */
    private final f82 f35291b;

    public xf2(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        this.f35290a = new ee2(context);
        this.f35291b = new f82(context);
    }

    public final void a(wf2 trackable, String eventName) {
        kotlin.jvm.internal.l.f(trackable, "trackable");
        kotlin.jvm.internal.l.f(eventName, "eventName");
        List<String> list = trackable.a().get(eventName);
        if (f35289c.contains(eventName)) {
            if (list != null) {
                ArrayList arrayList = new ArrayList(C2092m.T(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(this.f35291b.a((String) it.next()));
                }
                list = arrayList;
            } else {
                list = null;
            }
        }
        if (list != null) {
            this.f35290a.a(list, null);
        }
    }

    public final void a(wf2 trackable, String eventName, Map<String, String> macros) {
        kotlin.jvm.internal.l.f(trackable, "trackable");
        kotlin.jvm.internal.l.f(eventName, "eventName");
        kotlin.jvm.internal.l.f(macros, "macros");
        List<String> list = trackable.a().get(eventName);
        if (list != null) {
            this.f35290a.a(list, macros);
        }
    }
}
