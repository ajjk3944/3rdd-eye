package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class r extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public Context f9120a;

    /* renamed from: b, reason: collision with root package name */
    public final y4.a f9121b;

    public r(y4.a aVar) {
        this.f9121b = aVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            Object obj = this.f9121b.f37324b;
            throw null;
        }
    }
}
