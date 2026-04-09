package com.yandex.mobile.ads.impl;

import android.content.Context;
import c9.C2078B;
import com.facebook.ads.AdSDKNotificationListener;
import com.yandex.mobile.ads.impl.ew1;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ed2 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f26808a;

    public ed2(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.l.e(applicationContext, "getApplicationContext(...)");
        this.f26808a = applicationContext;
    }

    public final Map a(LinkedHashMap rawEvents, mh2 mh2Var) {
        kotlin.jvm.internal.l.f(rawEvents, "rawEvents");
        du1 du1VarA = ew1.a.a().a(this.f26808a);
        if (du1VarA != null && du1VarA.p0()) {
            return rawEvents;
        }
        LinkedHashMap linkedHashMapU = C2078B.u(rawEvents);
        List<String> listA = mh2Var != null ? mh2Var.a() : null;
        List list = (List) linkedHashMapU.get(AdSDKNotificationListener.IMPRESSION_EVENT);
        if (listA != null) {
            linkedHashMapU.put(AdSDKNotificationListener.IMPRESSION_EVENT, listA);
        } else {
            linkedHashMapU.remove(AdSDKNotificationListener.IMPRESSION_EVENT);
        }
        if (list != null) {
            linkedHashMapU.put("render_impression", list);
            return linkedHashMapU;
        }
        linkedHashMapU.remove("render_impression");
        return linkedHashMapU;
    }
}
