package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.fragment.app.AbstractActivityC3999j;
import s3.AbstractC7901p;

/* renamed from: com.google.android.gms.common.api.internal.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4277f {

    /* renamed from: a, reason: collision with root package name */
    private final Object f34838a;

    public C4277f(Activity activity) {
        AbstractC7901p.m(activity, "Activity must not be null");
        this.f34838a = activity;
    }

    public final Activity a() {
        return (Activity) this.f34838a;
    }

    public final AbstractActivityC3999j b() {
        return (AbstractActivityC3999j) this.f34838a;
    }

    public final boolean c() {
        return this.f34838a instanceof Activity;
    }

    public final boolean d() {
        return this.f34838a instanceof AbstractActivityC3999j;
    }
}
