package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.measurement.internal.C4856g3;

/* loaded from: classes.dex */
public final class AppMeasurementReceiver extends Y1.a implements C4856g3.a {

    /* renamed from: c, reason: collision with root package name */
    private C4856g3 f35763c;

    @Override // com.google.android.gms.measurement.internal.C4856g3.a
    public final void a(Context context, Intent intent) {
        Y1.a.c(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f35763c == null) {
            this.f35763c = new C4856g3(this);
        }
        this.f35763c.a(context, intent);
    }
}
