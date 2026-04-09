package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.graphics.SurfaceTexture;
import android.view.View;
import com.yandex.mobile.ads.impl.c40;
import com.yandex.mobile.ads.impl.if2;
import com.yandex.mobile.ads.impl.nz;
import com.yandex.mobile.ads.impl.o60;
import com.yandex.mobile.ads.impl.oh;
import com.yandex.mobile.ads.impl.uc1;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class V1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24283b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24284c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f24285d;

    public /* synthetic */ V1(int i, Object obj, Object obj2) {
        this.f24283b = i;
        this.f24284c = obj;
        this.f24285d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f24283b) {
            case 0:
                ((m60) this.f24284c).a((o60.d) this.f24285d);
                break;
            case 1:
                ((nz.e) this.f24284c).b((dc0) this.f24285d);
                break;
            case 2:
                ap0.a((ap0) this.f24284c, (h7) this.f24285d);
                break;
            case 3:
                ((c40.a) this.f24284c).c((c40) this.f24285d);
                break;
            case 4:
                ((e12) this.f24284c).a((SurfaceTexture) this.f24285d);
                break;
            case 5:
                g61.a((g61) this.f24284c, (C4128i3) this.f24285d);
                break;
            case 6:
                ((if2.a) this.f24284c).a((Exception) this.f24285d);
                break;
            case 7:
                ij2.a((ij2) this.f24284c, (Map) this.f24285d);
                break;
            case 8:
                km1.a((km1) this.f24284c, (C4128i3) this.f24285d);
                break;
            case 9:
                lm1.a((c6) this.f24284c, (lm1) this.f24285d);
                break;
            case 10:
                nk.a((nk) this.f24284c, (h7) this.f24285d);
                break;
            case 11:
                nm1.a((nm1) this.f24284c, (C4108f4) this.f24285d);
                break;
            case 12:
                ((oh.a) this.f24284c).d((ky) this.f24285d);
                break;
            case 13:
                p51.a((p51) this.f24284c, (View) this.f24285d);
                break;
            case 14:
                sf.a((sf) this.f24284c, (Activity) this.f24285d);
                break;
            case 15:
                sl0.a((sl0) this.f24284c, (bi2) this.f24285d);
                break;
            default:
                ((uc1) this.f24284c).a((uc1.b) this.f24285d);
                break;
        }
    }
}
