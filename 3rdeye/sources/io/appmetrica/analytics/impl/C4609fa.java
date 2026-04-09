package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;

/* renamed from: io.appmetrica.analytics.impl.fa, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4609fa {

    /* renamed from: a, reason: collision with root package name */
    public final Context f40847a;

    /* renamed from: b, reason: collision with root package name */
    public final Sm f40848b;

    /* renamed from: c, reason: collision with root package name */
    public final C4938s3 f40849c;

    /* renamed from: d, reason: collision with root package name */
    public final SafePackageManager f40850d;

    public C4609fa(Context context, Sm sm, C4938s3 c4938s3, SafePackageManager safePackageManager) {
        this.f40847a = context;
        this.f40848b = sm;
        this.f40849c = c4938s3;
        this.f40850d = safePackageManager;
    }

    public C4609fa(Context context) {
        this(context, new Sm(context, "io.appmetrica.analytics.build_id"), new C4938s3(context, "io.appmetrica.analytics.is_offline"), new SafePackageManager());
    }
}
