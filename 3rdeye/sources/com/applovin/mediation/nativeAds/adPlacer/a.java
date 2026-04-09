package com.applovin.mediation.nativeAds.adPlacer;

import android.hardware.camera2.CameraDevice;
import java.util.Collection;
import w.C5699m;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22003b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f22004c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f22005d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f22006e;

    public /* synthetic */ a(MaxAdPlacer maxAdPlacer, int i, Collection collection) {
        this.f22005d = maxAdPlacer;
        this.f22004c = i;
        this.f22006e = collection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22003b) {
            case 0:
                ((MaxAdPlacer) this.f22005d).a(this.f22004c, (Collection) this.f22006e);
                break;
            default:
                ((C5699m.b) this.f22005d).f47146a.onError((CameraDevice) this.f22006e, this.f22004c);
                break;
        }
    }

    public /* synthetic */ a(C5699m.b bVar, CameraDevice cameraDevice, int i) {
        this.f22005d = bVar;
        this.f22006e = cameraDevice;
        this.f22004c = i;
    }
}
