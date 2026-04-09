package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class xf0 implements e81 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18382a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ iu f18383b;

    public /* synthetic */ xf0(iu iuVar, int i4) {
        this.f18382a = i4;
        this.f18383b = iuVar;
    }

    @Override // com.google.android.gms.internal.ads.e81
    public final /* synthetic */ vd.b c(Object obj) {
        InputStream inputStream = (InputStream) obj;
        switch (this.f18382a) {
            case 0:
                return yo0.e(new pg0(inputStream, this.f18383b));
            case 1:
                return yo0.e(new pg0(inputStream, this.f18383b));
            default:
                String str = new String(p61.a(inputStream), StandardCharsets.UTF_8);
                iu iuVar = this.f18383b;
                iuVar.j = str;
                return yo0.e(iuVar);
        }
    }
}
