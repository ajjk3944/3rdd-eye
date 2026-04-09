package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import java.io.IOException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class x91 extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public final int f18331a;

    public x91() {
        this.f18331a = AdError.REMOTE_ADS_SERVICE_ERROR;
    }

    public x91(String str, int i4) {
        super(str);
        this.f18331a = i4;
    }

    public x91(String str, Exception exc, int i4) {
        super(str, exc);
        this.f18331a = i4;
    }

    public x91(int i4, Exception exc) {
        super(exc);
        this.f18331a = i4;
    }
}
