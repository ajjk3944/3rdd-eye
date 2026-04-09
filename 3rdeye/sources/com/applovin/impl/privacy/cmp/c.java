package com.applovin.impl.privacy.cmp;

import A2.l;
import C.G;
import C.J;
import C.S;
import C.W;
import C.g0;
import E.u;
import H.g;
import H7.e;
import I.j;
import I.m;
import android.hardware.camera2.CameraDevice;
import android.util.Size;
import androidx.camera.core.impl.C1693i;
import androidx.camera.core.impl.C1695j;
import androidx.camera.core.impl.C1697k;
import androidx.camera.core.impl.H0;
import androidx.camera.core.impl.I0;
import androidx.camera.core.impl.X;
import androidx.camera.core.impl.Z;
import com.applovin.impl.C2120g0;
import com.applovin.impl.privacy.cmp.a;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;
import com.yandex.mobile.ads.impl.A3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import v.l0;
import v.r0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements UserMessagingPlatform.OnConsentFormLoadSuccessListener, I.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20719b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f20720c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f20721d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f20722e;

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f20719b = obj;
        this.f20720c = obj2;
        this.f20721d = obj3;
        this.f20722e = obj4;
    }

    @Override // I.a
    public A4.a apply(Object obj) {
        X x10;
        C1693i c1693i;
        g gVar;
        List list = (List) obj;
        StringBuilder sb = new StringBuilder("-- getSurfaces done, start init (id=");
        l0 l0Var = (l0) this.f20719b;
        int i = l0Var.f46751m;
        sb.append(i);
        sb.append(")");
        S.a("ProcessingCaptureSession", sb.toString());
        if (l0Var.i == l0.a.DE_INITIALIZED) {
            return new m.a(new IllegalStateException("SessionProcessorCaptureSession is closed."));
        }
        boolean zContains = list.contains(null);
        H0 h02 = (H0) this.f20720c;
        if (zContains) {
            return new m.a(new X.a("Surface closed", h02.b().get(list.indexOf(null))));
        }
        boolean z10 = false;
        C1693i c1693i2 = null;
        C1693i c1693i3 = null;
        C1693i c1693i4 = null;
        for (int i10 = 0; i10 < h02.b().size(); i10++) {
            X x11 = h02.b().get(i10);
            boolean zEquals = Objects.equals(x11.f14995j, W.class);
            int i11 = x11.i;
            Size size = x11.f14994h;
            if (zEquals || Objects.equals(x11.f14995j, R.c.class)) {
                c1693i2 = new C1693i(x11.c().get(), size, i11);
            } else if (Objects.equals(x11.f14995j, J.class)) {
                c1693i3 = new C1693i(x11.c().get(), size, i11);
            } else if (Objects.equals(x11.f14995j, G.class)) {
                c1693i4 = new C1693i(x11.c().get(), size, i11);
            }
        }
        C1697k c1697k = h02.f14879b;
        if (c1697k != null) {
            x10 = c1697k.f15064a;
            c1693i = new C1693i(x10.c().get(), x10.f14994h, x10.i);
        } else {
            x10 = null;
            c1693i = null;
        }
        l0Var.i = l0.a.SESSION_INITIALIZED;
        try {
            ArrayList arrayList = new ArrayList(l0Var.f46744e);
            if (x10 != null) {
                arrayList.add(x10);
            }
            Z.b(arrayList);
            S.g("ProcessingCaptureSession", "== initSession (id=" + i + ")");
            try {
                I0 i02 = l0Var.f46740a;
                new C1695j(c1693i2, c1693i3, c1693i4, c1693i);
                H0 h0E = i02.e();
                l0Var.f46747h = h0E;
                j.f(h0E.b().get(0).f14991e).addListener(new A3(9, l0Var, x10), u.y());
                Iterator<X> it = l0Var.f46747h.b().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    gVar = l0Var.f46741b;
                    if (!zHasNext) {
                        break;
                    }
                    X next = it.next();
                    l0.f46738n.add(next);
                    j.f(next.f14991e).addListener(new g0(next, 27), gVar);
                }
                H0.h hVar = new H0.h();
                hVar.a(h02);
                hVar.f14886a.clear();
                hVar.f14887b.f14948a.clear();
                hVar.a(l0Var.f46747h);
                if (hVar.f14897k && hVar.f14896j) {
                    z10 = true;
                }
                l.k("Cannot transform the SessionConfig", z10);
                H0 h0B = hVar.b();
                CameraDevice cameraDevice = (CameraDevice) this.f20721d;
                cameraDevice.getClass();
                A4.a aVarB = l0Var.f46743d.b(h0B, cameraDevice, (r0) this.f20722e);
                j.a(aVarB, new e(l0Var), gVar);
                return aVarB;
            } catch (Throwable th) {
                S.c("ProcessingCaptureSession", "initSession failed", th);
                Z.a(l0Var.f46744e);
                if (x10 != null) {
                    x10.b();
                }
                throw th;
            }
        } catch (X.a e4) {
            return new m.a(e4);
        }
    }

    @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener
    public void onConsentFormLoadSuccess(ConsentForm consentForm) {
        ((a) this.f20719b).a((a.InterfaceC0315a) this.f20720c, (FormError) this.f20721d, (C2120g0) this.f20722e, consentForm);
    }
}
