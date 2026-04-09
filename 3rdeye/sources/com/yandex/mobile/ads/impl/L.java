package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraDevice;
import android.view.Surface;
import com.yandex.mobile.ads.impl.c40;
import com.yandex.mobile.ads.impl.if2;
import com.yandex.mobile.ads.impl.oh;
import d0.s;
import f6.C4336a;
import h.AbstractC4401e;
import java.util.Map;
import java.util.Objects;
import o0.b;
import w.C5699m;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class L implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24174b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24175c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f24176d;

    public /* synthetic */ L(int i, Object obj, Object obj2) {
        this.f24174b = i;
        this.f24175c = obj;
        this.f24176d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f24174b) {
            case 0:
                ((c40.a) this.f24175c).a((c40) this.f24176d);
                return;
            case 1:
                cn.c((cn) this.f24175c, (h7) this.f24176d);
                return;
            case 2:
                g01.a((g01) this.f24175c, (Map) this.f24176d);
                return;
            case 3:
                g61.a((g61) this.f24175c, (h61) this.f24176d);
                return;
            case 4:
                gn.b((gn) this.f24175c, (h7) this.f24176d);
                return;
            case 5:
                hm0.a((hm0) this.f24175c, (xs) this.f24176d);
                return;
            case 6:
                ((if2.a) this.f24175c).b((String) this.f24176d);
                return;
            case 7:
                im1.a((im1) this.f24175c, (sf) this.f24176d);
                return;
            case 8:
                mm1.a((mm1) this.f24175c, (bs1) this.f24176d);
                return;
            case 9:
                np0.a((np0) this.f24175c, (Activity) this.f24176d);
                return;
            case 10:
                ((oh.a) this.f24175c).c((ky) this.f24176d);
                return;
            case 11:
                ((oh.a) this.f24175c).b((String) this.f24176d);
                return;
            case 12:
                pe.a((pe) this.f24175c, (oe) this.f24176d);
                return;
            case 13:
                si.a((si) this.f24175c, (C4128i3) this.f24176d);
                return;
            case 14:
                ((b.a) this.f24176d).b(((s.a) this.f24175c).f37284b);
                return;
            case 15:
                ((s.a) this.f24175c).f37285c.remove((A4.a) this.f24176d);
                return;
            case 16:
                C4336a.m138writeUnclosedAdToFile$lambda3((C4336a) this.f24175c, (String) this.f24176d);
                return;
            case 17:
                Runnable runnable = (Runnable) this.f24176d;
                AbstractC4401e.c cVar = (AbstractC4401e.c) this.f24175c;
                cVar.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    cVar.a();
                }
            case 18:
                ((v5.f) this.f24175c).a((v5.c) this.f24176d);
                return;
            case 19:
                ((Surface) this.f24175c).release();
                ((SurfaceTexture) this.f24176d).release();
                return;
            case 20:
                v.q0 q0Var = (v.q0) this.f24175c;
                Objects.requireNonNull(q0Var.f46839f);
                q0Var.f46839f.l((v.o0) this.f24176d);
                return;
            case 21:
                ((C5699m.b) this.f24175c).f47146a.onOpened((CameraDevice) this.f24176d);
                return;
            default:
                Runnable runnable2 = (Runnable) this.f24175c;
                w1.p pVar = (w1.p) this.f24176d;
                try {
                    runnable2.run();
                    return;
                } finally {
                    pVar.a();
                }
        }
    }
}
