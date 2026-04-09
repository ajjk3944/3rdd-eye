package com.applovin.impl.mediation;

import C.S;
import C.k0;
import android.app.Activity;
import android.view.Surface;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1781n;
import com.yandex.mobile.ads.impl.e20;
import g0.C4366m;
import o0.b;
import w6.C5739c;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20510b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f20511c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f20512d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f20513e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f20514f;

    public /* synthetic */ r(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f20510b = i;
        this.f20511c = obj;
        this.f20512d = obj2;
        this.f20513e = obj3;
        this.f20514f = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20510b) {
            case 0:
                ((h) this.f20511c).a((ViewGroup) this.f20512d, (AbstractC1781n) this.f20513e, (Activity) this.f20514f);
                break;
            case 1:
                e20.a((kotlin.jvm.internal.w) this.f20511c, (e20) this.f20512d, (String) this.f20513e, (C5739c) this.f20514f);
                break;
            default:
                C4366m c4366m = (C4366m) this.f20511c;
                c4366m.getClass();
                S.a("TextureViewImpl", "Safe to release surface.");
                D3.b bVar = c4366m.f37936l;
                if (bVar != null) {
                    bVar.b();
                    c4366m.f37936l = null;
                }
                ((Surface) this.f20512d).release();
                if (c4366m.f37932g == ((b.d) this.f20513e)) {
                    c4366m.f37932g = null;
                }
                if (c4366m.f37933h == ((k0) this.f20514f)) {
                    c4366m.f37933h = null;
                    break;
                }
                break;
        }
    }
}
