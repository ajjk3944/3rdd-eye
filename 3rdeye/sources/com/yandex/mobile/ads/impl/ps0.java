package com.yandex.mobile.ads.impl;

import android.location.Location;
import com.yandex.mobile.ads.impl.do1;

/* loaded from: classes3.dex */
public final class ps0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f31907a;

    public ps0(Object taskObject) {
        kotlin.jvm.internal.l.f(taskObject, "taskObject");
        this.f31907a = taskObject;
    }

    public final Location a() {
        Object objA = do1.a.a(this.f31907a, "getResult", new Object[0]);
        if (objA instanceof Location) {
            return (Location) objA;
        }
        return null;
    }

    public final boolean b() {
        Object objA = do1.a.a(this.f31907a, "isComplete", new Object[0]);
        Boolean bool = objA instanceof Boolean ? (Boolean) objA : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
