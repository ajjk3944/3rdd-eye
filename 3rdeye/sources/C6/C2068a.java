package c6;

import E.u;
import G5.f;
import G5.h;
import G5.j;
import G5.k;
import I5.i;
import R9.AbstractC1564a;
import R9.C1568e;
import R9.s;
import R9.t;
import a6.C1660i;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import b9.C1992A;
import java.net.URL;
import java.util.List;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.x;
import p9.l;
import t4.C5606d;
import y9.C5819a;

/* compiled from: NativeOMTracker.kt */
/* renamed from: c6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2068a {
    private G5.a adEvents;
    private G5.b adSession;
    private final AbstractC1564a json;

    /* compiled from: NativeOMTracker.kt */
    /* renamed from: c6.a$a, reason: collision with other inner class name */
    public static final class C0280a extends m implements l<C1568e, C1992A> {
        public static final C0280a INSTANCE = new C0280a();

        public C0280a() {
            super(1);
        }

        @Override // p9.l
        public /* bridge */ /* synthetic */ C1992A invoke(C1568e c1568e) {
            invoke2(c1568e);
            return C1992A.f18074a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(C1568e Json) {
            kotlin.jvm.internal.l.f(Json, "$this$Json");
            Json.f11793c = true;
            Json.f11791a = true;
            Json.f11792b = false;
        }
    }

    public C2068a(String omSdkData) {
        kotlin.jvm.internal.l.f(omSdkData, "omSdkData");
        s sVarA = t.a(C0280a.INSTANCE);
        this.json = sVarA;
        try {
            G5.c cVarA = G5.c.a(f.NATIVE_DISPLAY, h.BEGIN_TO_RENDER, j.NATIVE, j.NONE);
            if (TextUtils.isEmpty("Vungle")) {
                throw new IllegalArgumentException("Name is null or empty");
            }
            if (TextUtils.isEmpty("7.4.1")) {
                throw new IllegalArgumentException("Version is null or empty");
            }
            B7.d dVar = new B7.d(5);
            byte[] bArrDecode = Base64.decode(omSdkData, 0);
            C1660i c1660i = bArrDecode != null ? (C1660i) sVarA.a(u.L(sVarA.f11782b, x.b(C1660i.class)), new String(bArrDecode, C5819a.f48359b)) : null;
            String vendorKey = c1660i != null ? c1660i.getVendorKey() : null;
            URL url = new URL(c1660i != null ? c1660i.getVendorURL() : null);
            String params = c1660i != null ? c1660i.getParams() : null;
            if (TextUtils.isEmpty(vendorKey)) {
                throw new IllegalArgumentException("VendorKey is null or empty");
            }
            if (TextUtils.isEmpty(params)) {
                throw new IllegalArgumentException("VerificationParameters is null or empty");
            }
            List listG = u.G(new k(vendorKey, url, params));
            String oM_JS$vungle_ads_release = C2071d.INSTANCE.getOM_JS$vungle_ads_release();
            C5606d.e(oM_JS$vungle_ads_release, "OM SDK JS script content is null");
            this.adSession = G5.b.a(cVarA, new G5.d(dVar, null, oM_JS$vungle_ads_release, listG, G5.e.NATIVE));
        } catch (Exception e4) {
            com.vungle.ads.internal.util.k.Companion.e("NativeOMTracker", "error occured when create omsdk adSession:", e4);
        }
    }

    public final void impressionOccurred() {
        G5.a aVar = this.adEvents;
        if (aVar != null) {
            G5.l lVar = aVar.f1909a;
            if (lVar.f1929g) {
                throw new IllegalStateException("AdSession is finished");
            }
            G5.c cVar = lVar.f1924b;
            cVar.getClass();
            if (j.NATIVE != ((j) cVar.f1910a)) {
                throw new IllegalStateException("Impression event is not expected from the Native AdSession");
            }
            if (!lVar.f1928f || lVar.f1929g) {
                try {
                    lVar.d();
                } catch (Exception unused) {
                }
            }
            if (!lVar.f1928f || lVar.f1929g) {
                return;
            }
            if (lVar.i) {
                throw new IllegalStateException("Impression event can only be sent once");
            }
            K5.a aVar2 = lVar.f1927e;
            i.f2509a.a(aVar2.f(), "publishImpressionEvent", aVar2.f3149a);
            lVar.i = true;
        }
    }

    public final void start(View view) {
        G5.b bVar;
        kotlin.jvm.internal.l.f(view, "view");
        if (!F5.a.f1654a.f1655a || (bVar = this.adSession) == null) {
            return;
        }
        bVar.c(view);
        bVar.d();
        G5.l lVar = (G5.l) bVar;
        K5.a aVar = lVar.f1927e;
        if (aVar.f3151c != null) {
            throw new IllegalStateException("AdEvents already exists for AdSession");
        }
        boolean z10 = lVar.f1929g;
        if (z10) {
            throw new IllegalStateException("AdSession is finished");
        }
        G5.a aVar2 = new G5.a(lVar);
        aVar.f3151c = aVar2;
        this.adEvents = aVar2;
        if (!lVar.f1928f) {
            throw new IllegalStateException("AdSession is not started");
        }
        if (z10) {
            throw new IllegalStateException("AdSession is finished");
        }
        G5.c cVar = lVar.f1924b;
        cVar.getClass();
        if (j.NATIVE != ((j) cVar.f1910a)) {
            throw new IllegalStateException("Impression event is not expected from the Native AdSession");
        }
        if (lVar.f1931j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
        K5.a aVar3 = lVar.f1927e;
        i.f2509a.a(aVar3.f(), "publishLoadedEvent", null, aVar3.f3149a);
        lVar.f1931j = true;
    }

    public final void stop() {
        G5.b bVar = this.adSession;
        if (bVar != null) {
            bVar.b();
        }
        this.adSession = null;
    }
}
