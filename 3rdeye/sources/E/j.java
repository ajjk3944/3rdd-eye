package E;

import C.S;
import C.k0;
import W.F;
import W.Y;
import W.a0;
import android.content.res.Configuration;
import android.net.Uri;
import android.view.Surface;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.services.BackgroundCameraXService;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements K0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1316a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1317b;

    public /* synthetic */ j(Object obj, int i) {
        this.f1316a = i;
        this.f1317b = obj;
    }

    @Override // K0.b
    public final void accept(Object obj) {
        switch (this.f1316a) {
            case 0:
                ((o) this.f1317b).c((A) obj);
                break;
            case 1:
                BackgroundCameraXService.a((BackgroundCameraXService) this.f1317b, (a0) obj);
                break;
            case 2:
                ((F) this.f1317b).f13089I = (Uri) obj;
                break;
            case 3:
                k0.c cVar = (k0.c) obj;
                Y y10 = (Y) this.f1317b;
                S.a("VideoEncoderSession", "Surface can be closed: " + cVar.b().hashCode());
                Surface surfaceB = cVar.b();
                if (surfaceB != y10.f13222e) {
                    surfaceB.release();
                    break;
                } else {
                    y10.f13222e = null;
                    y10.f13229m.b(y10.f13221d);
                    y10.a();
                    break;
                }
            default:
                Configuration configuration = (Configuration) obj;
                androidx.fragment.app.x xVar = (androidx.fragment.app.x) this.f1317b;
                if (xVar.I()) {
                    xVar.h(false, configuration);
                    break;
                }
                break;
        }
    }
}
