package C2;

import E.A;
import E.D;
import E.E;
import E.n;
import N.s;
import N.v;
import O.j;
import W.T;
import Z.p;
import android.graphics.Bitmap;
import androidx.camera.core.impl.X;
import c.DialogC2011i;
import c6.C2069b;
import com.applovin.impl.C2105a;
import com.applovin.impl.C2114d0;
import com.applovin.impl.c2;
import com.applovin.impl.r1;
import com.applovin.impl.s1;
import com.applovin.impl.s3;
import com.applovin.impl.sdk.k;
import com.applovin.impl.v1;
import com.applovin.impl.w3;
import com.applovin.impl.y3;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.objectdetector.cameraui.DetectorActivity;
import com.vungle.ads.AbstractC4062u;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.reporterextension.internal.ReporterExtensionClientModuleEntryPoint;
import java.io.IOException;
import java.util.Iterator;
import o0.b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f900b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f901c;

    public /* synthetic */ h(E e4, Bitmap bitmap) {
        this.f900b = 3;
        this.f901c = e4;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        switch (this.f900b) {
            case 0:
                ((DetectorActivity) this.f901c).f22130B.getClass();
                break;
            case 1:
                A a10 = ((n) this.f901c).f1323a.f1324a;
                if (a10 != null) {
                    a10.f1274f.b();
                    break;
                }
                break;
            case 2:
                D d10 = (D) this.f901c;
                d10.f1291d = null;
                d10.b();
                break;
            case 3:
                E e4 = (E) this.f901c;
                e4.f();
                e4.d();
                break;
            case 4:
                ((b.a) this.f901c).d(new Exception("Failed to snapshot: OpenGLRenderer not ready."));
                break;
            case 5:
                N.j jVar = (N.j) this.f901c;
                jVar.f4405k = true;
                jVar.d();
                break;
            case 6:
                ((X) this.f901c).b();
                break;
            case 7:
                v.c cVar = ((v) this.f901c).f4462c;
                if (cVar != null) {
                    Iterator<s> it = cVar.values().iterator();
                    while (it.hasNext()) {
                        it.next().c();
                    }
                    break;
                }
                break;
            case 8:
                ReporterExtensionClientModuleEntryPoint.a((ClientContext) this.f901c);
                break;
            case 9:
                j.c cVar2 = ((O.j) this.f901c).f10169d;
                if (cVar2 != null) {
                    Iterator<s> it2 = cVar2.values().iterator();
                    while (it2.hasNext()) {
                        it2.next().c();
                    }
                    break;
                }
                break;
            case 10:
                ((T) this.f901c).o();
                break;
            case 11:
                ((p) this.f901c).b();
                break;
            case 12:
                DialogC2011i.a((DialogC2011i) this.f901c);
                break;
            case 13:
                C2069b.m2init$lambda0((C2069b) this.f901c);
                break;
            case 14:
                ((c2) this.f901c).c();
                break;
            case 15:
                ((C2114d0) this.f901c).c();
                break;
            case 16:
                ((r1) this.f901c).l();
                break;
            case 17:
                ((s1) this.f901c).H();
                break;
            case 18:
                ((s3) this.f901c).d();
                break;
            case 19:
                ((com.applovin.impl.sdk.b) this.f901c).c();
                break;
            case 20:
                ((com.applovin.impl.sdk.d) this.f901c).d();
                break;
            case 21:
                ((k) this.f901c).J0();
                break;
            case 22:
                ((C2105a) this.f901c).b();
                break;
            case 23:
                ((v1) this.f901c).Q();
                break;
            case 24:
                ((w3) this.f901c).f();
                break;
            case 25:
                ((y3) this.f901c).k();
                break;
            case 26:
                ((com.google.android.material.timepicker.c) this.f901c).h();
                break;
            case 27:
                AbstractC4062u.a.m124onAdClick$lambda3((AbstractC4062u) this.f901c);
                break;
            case 28:
                com.vungle.ads.internal.j.m63init$lambda4((com.vungle.ads.internal.j) this.f901c);
                break;
            default:
                com.vungle.ads.internal.presenter.g.m93processCommand$lambda6((com.vungle.ads.internal.presenter.g) this.f901c);
                break;
        }
    }

    public /* synthetic */ h(DetectorActivity detectorActivity, boolean z10) {
        this.f900b = 0;
        this.f901c = detectorActivity;
    }

    public /* synthetic */ h(Object obj, int i) {
        this.f900b = i;
        this.f901c = obj;
    }
}
