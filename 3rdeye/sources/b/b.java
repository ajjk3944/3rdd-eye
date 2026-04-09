package B;

import C.i0;
import C0.o;
import E.E;
import H0.m;
import H6.C0675l;
import N.s;
import N.t;
import W.Y;
import Z.j;
import Z.p;
import android.content.Context;
import android.graphics.Typeface;
import android.hardware.Camera;
import android.os.Trace;
import android.view.View;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.emoji2.text.c;
import androidx.emoji2.text.e;
import androidx.lifecycle.AbstractC1781n;
import androidx.lifecycle.C1791y;
import androidx.lifecycle.J;
import c.ActivityC2008f;
import com.applovin.impl.C2114d0;
import com.applovin.impl.C2158z0;
import com.applovin.impl.e2;
import com.applovin.impl.f3;
import com.applovin.impl.k2;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.q5;
import com.applovin.impl.r1;
import com.applovin.impl.sdk.k;
import com.applovin.impl.t5;
import com.applovin.impl.v1;
import com.applovin.impl.y7;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.services.CameraService;
import com.vungle.ads.internal.c;
import java.nio.MappedByteBuffer;
import kotlin.jvm.internal.l;
import o0.b;
import t4.C5606d;
import z2.AsyncTaskC5857a;
import z2.C5858b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f306b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f307c;

    public /* synthetic */ b(E e4, int i) {
        this.f306b = 2;
        this.f307c = e4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        switch (this.f306b) {
            case 0:
                g gVar = (g) this.f307c;
                b.a<Void> aVar = gVar.f324g;
                if (aVar != null) {
                    aVar.b(null);
                    gVar.f324g = null;
                    return;
                }
                return;
            case 1:
                ((androidx.camera.core.e) this.f307c).c();
                return;
            case 2:
                E e4 = (E) this.f307c;
                e4.f();
                e4.d();
                return;
            case 3:
                C5858b c5858b = (C5858b) this.f307c;
                CameraService cameraService = c5858b.f48431b;
                if (cameraService == null || !cameraService.getPackageManager().hasSystemFeature("android.hardware.camera")) {
                    return;
                }
                int numberOfCameras = Camera.getNumberOfCameras();
                for (int i10 = 0; i10 < numberOfCameras; i10++) {
                    Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                    Camera.getCameraInfo(i10, cameraInfo);
                    if (cameraInfo.facing == 1) {
                        new AsyncTaskC5857a(c5858b).execute(new Void[0]);
                        return;
                    }
                }
                return;
            case 4:
                C0675l this$0 = (C0675l) this.f307c;
                l.f(this$0, "this$0");
                while (i < this$0.getChildCount()) {
                    int i11 = i + 1;
                    View childAt = this$0.getChildAt(i);
                    if (childAt == null) {
                        throw new IndexOutOfBoundsException();
                    }
                    C5606d.I(this$0.getReleaseViewVisitor$div_release(), childAt);
                    i = i11;
                }
                this$0.removeAllViews();
                return;
            case 5:
                ((i0) this.f307c).a();
                return;
            case 6:
                s.a aVar2 = (s.a) this.f307c;
                t tVar = aVar2.f4449r;
                if (tVar != null) {
                    tVar.c();
                }
                if (aVar2.f4448q == null) {
                    aVar2.f4447p.c();
                    return;
                }
                return;
            case 7:
                int i12 = ContentLoadingProgressBar.f15501d;
                ((ContentLoadingProgressBar) this.f307c).setVisibility(8);
                return;
            case 8:
                V1.d.c((V1.d) this.f307c);
                return;
            case 9:
                ((Y) this.f307c).f13227k.b(null);
                return;
            case 10:
                p pVar = (p) this.f307c;
                pVar.getClass();
                try {
                    pVar.f13966g.d();
                    if (pVar.f13969k.getAndSet(true)) {
                        return;
                    }
                    pVar.b();
                    return;
                } catch (j.a e10) {
                    throw new RuntimeException(e10);
                }
            case 11:
                ((b.d) this.f307c).cancel(true);
                return;
            case 12:
                J this$02 = (J) this.f307c;
                l.f(this$02, "this$0");
                int i13 = this$02.f16051c;
                C1791y c1791y = this$02.f16055g;
                if (i13 == 0) {
                    this$02.f16052d = true;
                    c1791y.d(AbstractC1781n.a.ON_PAUSE);
                }
                if (this$02.f16050b == 0 && this$02.f16052d) {
                    c1791y.d(AbstractC1781n.a.ON_STOP);
                    this$02.f16053e = true;
                    return;
                }
                return;
            case 13:
                e.b bVar = (e.b) this.f307c;
                synchronized (bVar.f15737d) {
                    try {
                        if (bVar.f15741h == null) {
                            return;
                        }
                        try {
                            m mVarD = bVar.d();
                            int i14 = mVarD.f2010e;
                            if (i14 == 2) {
                                synchronized (bVar.f15737d) {
                                }
                            }
                            if (i14 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i14 + ")");
                            }
                            try {
                                int i15 = G0.s.f1858a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                e.a aVar3 = bVar.f15736c;
                                Context context = bVar.f15734a;
                                aVar3.getClass();
                                Typeface typefaceB = C0.h.f808a.b(context, new m[]{mVarD}, 0);
                                MappedByteBuffer mappedByteBufferE = o.e(bVar.f15734a, mVarD.f2006a);
                                if (mappedByteBufferE == null || typefaceB == null) {
                                    throw new RuntimeException("Unable to open file.");
                                }
                                try {
                                    Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                    b1.i iVar = new b1.i(typefaceB, b1.h.a(mappedByteBufferE));
                                    Trace.endSection();
                                    Trace.endSection();
                                    synchronized (bVar.f15737d) {
                                        try {
                                            c.h hVar = bVar.f15741h;
                                            if (hVar != null) {
                                                hVar.b(iVar);
                                            }
                                        } finally {
                                        }
                                    }
                                    bVar.b();
                                    return;
                                } finally {
                                    int i16 = G0.s.f1858a;
                                    Trace.endSection();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        } catch (Throwable th2) {
                            synchronized (bVar.f15737d) {
                                try {
                                    c.h hVar2 = bVar.f15741h;
                                    if (hVar2 != null) {
                                        hVar2.a(th2);
                                    }
                                    bVar.b();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            case 14:
                ActivityC2008f.menuHostHelper$lambda$0((ActivityC2008f) this.f307c);
                return;
            case 15:
                ((C2114d0) this.f307c).a();
                return;
            case 16:
                e2.a((k) this.f307c);
                return;
            case 17:
                ((f3) this.f307c).d();
                return;
            case 18:
                ((k2) this.f307c).notifyDataSetChanged();
                return;
            case 19:
                ((MaxFullscreenAdImpl.b) this.f307c).a();
                return;
            case 20:
                ((q5) this.f307c).e();
                return;
            case 21:
                ((r1) this.f307c).k();
                return;
            case 22:
                ((t5) this.f307c).e();
                return;
            case 23:
                ((v1) this.f307c).O();
                return;
            case 24:
                ((y7) this.f307c).a();
                return;
            case 25:
                ((C2158z0) this.f307c).e();
                return;
            case 26:
                ((MaxNativeAdView) this.f307c).a();
                return;
            case 27:
                com.monetization.ads.mediation.banner.e.a((com.monetization.ads.mediation.banner.d) this.f307c);
                return;
            case 28:
                c.a.m35onAdEnd$lambda2((com.vungle.ads.internal.c) this.f307c);
                return;
            default:
                com.vungle.ads.internal.load.c.m73loadAd$lambda0((com.vungle.ads.internal.load.c) this.f307c);
                return;
        }
    }

    public /* synthetic */ b(Object obj, int i) {
        this.f306b = i;
        this.f307c = obj;
    }
}
