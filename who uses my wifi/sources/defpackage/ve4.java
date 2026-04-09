package defpackage;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.os.Handler;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class ve4 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ ve4(Object obj, Object obj2, int i) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f) {
            case 0:
                mc2 mc2Var = (mc2) this.g;
                AudioDeviceInfo routedDevice = ((AudioRouting) this.h).getRoutedDevice();
                if (routedDevice != null) {
                    ((Handler) mc2Var.i).post(new ve4(mc2Var, routedDevice, 1));
                    break;
                }
                break;
            case 1:
                mc2 mc2Var2 = (mc2) this.g;
                AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) this.h;
                if (((bf4) mc2Var2.j) != null) {
                    ((x03) mc2Var2.h).a(audioDeviceInfo);
                    break;
                }
                break;
            case 2:
                ((np2) this.g).mo6c(this.h);
                break;
            case 3:
                bi4 bi4Var = (bi4) this.g;
                cg1 cg1Var = (cg1) this.h;
                bi4Var.D = bi4Var.v == null ? cg1Var : new qf1(-9223372036854775807L, 0L);
                bi4Var.E = cg1Var.a();
                boolean z = false;
                if (!bi4Var.L && cg1Var.a() == -9223372036854775807L) {
                    z = true;
                }
                bi4Var.F = z;
                bi4Var.G = true == z ? 7 : 1;
                if (!bi4Var.z) {
                    bi4Var.u();
                    break;
                } else {
                    bi4Var.k.s(bi4Var.E, cg1Var, z);
                    break;
                }
                break;
            default:
                gi4 gi4Var = (gi4) this.g;
                try {
                    gi4Var.e(((w53) this.h).call());
                    break;
                } catch (Exception e) {
                    gi4Var.d(e);
                } catch (Throwable th) {
                    gi4Var.d(new RuntimeException(th));
                    return;
                }
        }
    }
}
