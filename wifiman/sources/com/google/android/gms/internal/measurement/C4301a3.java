package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.google.android.gms.internal.measurement.a3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4301a3 extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ X2 f35176a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C4301a3(X2 x22, Handler handler) {
        super(null);
        this.f35176a = x22;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        this.f35176a.f35152a.set(true);
    }
}
