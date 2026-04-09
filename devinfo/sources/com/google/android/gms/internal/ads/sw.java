package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class sw implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f16563a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gx f16564b;

    public sw(tw twVar, Context context, gx gxVar) {
        this.f16563a = context;
        this.f16564b = gxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gx gxVar = this.f16564b;
        try {
            gxVar.b(AdvertisingIdClient.getAdvertisingIdInfo(this.f16563a));
        } catch (IOException | IllegalStateException | nb.g | nb.h e2) {
            gxVar.d(e2);
            za.i.f("Exception while getting advertising Id info", e2);
        }
    }
}
