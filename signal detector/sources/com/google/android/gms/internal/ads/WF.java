package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class WF {

    /* renamed from: b, reason: collision with root package name */
    public static final WF f12193b = new WF();

    /* renamed from: c, reason: collision with root package name */
    public static final VF f12194c = new VF();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f12195a = new AtomicReference();

    public final VF a() {
        VF vf = (VF) this.f12195a.get();
        return vf == null ? f12194c : vf;
    }
}
