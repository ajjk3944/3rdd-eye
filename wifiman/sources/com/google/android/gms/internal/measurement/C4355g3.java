package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.google.android.gms.internal.measurement.g3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4355g3 extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ C4337e3 f35230a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C4355g3(C4337e3 c4337e3, Handler handler) {
        super(null);
        this.f35230a = c4337e3;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        this.f35230a.e();
    }
}
