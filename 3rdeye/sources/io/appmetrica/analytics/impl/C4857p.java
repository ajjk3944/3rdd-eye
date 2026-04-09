package io.appmetrica.analytics.impl;

import android.app.Activity;
import java.util.WeakHashMap;

/* renamed from: io.appmetrica.analytics.impl.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4857p {

    /* renamed from: a, reason: collision with root package name */
    public final WeakHashMap f41401a = new WeakHashMap();

    public final boolean a(Activity activity, EnumC4831o enumC4831o) {
        if (activity != null && this.f41401a.get(activity) == enumC4831o) {
            return false;
        }
        if (activity == null) {
            return true;
        }
        this.f41401a.put(activity, enumC4831o);
        return true;
    }
}
