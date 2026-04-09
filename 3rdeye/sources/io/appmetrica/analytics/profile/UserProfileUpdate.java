package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.Nd;
import io.appmetrica.analytics.impl.Yn;

/* loaded from: classes3.dex */
public class UserProfileUpdate<T extends Yn> {

    /* renamed from: a, reason: collision with root package name */
    private final Yn f42473a;

    public UserProfileUpdate(Nd nd) {
        this.f42473a = nd;
    }

    public T getUserProfileUpdatePatcher() {
        return (T) this.f42473a;
    }
}
