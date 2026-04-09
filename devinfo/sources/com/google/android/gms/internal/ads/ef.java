package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ef implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10770a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ff f10771b;

    public /* synthetic */ ef(ff ffVar, int i4) {
        this.f10770a = i4;
        this.f10771b = ffVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10770a) {
            case 0:
                ff ffVar = this.f10771b;
                ffVar.getClass();
                try {
                    if (ffVar.f11121f == null && ffVar.g) {
                        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(ffVar.f11116a);
                        advertisingIdClient.start();
                        ffVar.f11121f = advertisingIdClient;
                        break;
                    }
                } catch (IOException | nb.g | nb.h unused) {
                    ffVar.f11121f = null;
                    return;
                }
                break;
            default:
                sk.a(this.f10771b.f11116a);
                break;
        }
    }
}
