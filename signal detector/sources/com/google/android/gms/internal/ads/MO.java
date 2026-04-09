package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;
import android.os.Build;

/* loaded from: classes.dex */
public final class MO {

    /* renamed from: c, reason: collision with root package name */
    public static final MO f9873c;

    /* renamed from: a, reason: collision with root package name */
    public final String f9874a;

    /* renamed from: b, reason: collision with root package name */
    public final C1014cu f9875b;

    static {
        new MO("");
        f9873c = new MO("preload");
    }

    public MO(String str) {
        C1014cu c1014cu;
        this.f9874a = str;
        if (Build.VERSION.SDK_INT >= 31) {
            c1014cu = new C1014cu(12);
            c1014cu.f13695b = LogSessionId.LOG_SESSION_ID_NONE;
        } else {
            c1014cu = null;
        }
        this.f9875b = c1014cu;
    }
}
