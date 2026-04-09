package com.google.android.gms.internal.measurement;

import com.google.common.collect.AbstractC5071q;
import m4.AbstractC6769h;

/* loaded from: classes.dex */
public final class I3 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f35042a;

    public I3(H3 h32) {
        AbstractC6769h.j(h32, "BuildInfo must be non-null");
        this.f35042a = !h32.zza();
    }

    public final boolean a(String str) {
        AbstractC6769h.j(str, "flagName must not be null");
        if (this.f35042a) {
            return ((AbstractC5071q) K3.f35054a.get()).c(str);
        }
        return true;
    }
}
