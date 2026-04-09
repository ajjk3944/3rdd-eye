package v4;

import android.view.View;
import ed.y;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d extends ci.b {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f35828k;

    public /* synthetic */ d(int i4) {
        this.f35828k = i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ci.b
    public final void A(y yVar, float f10) {
        switch (this.f35828k) {
            case 0:
                ((View) yVar).setAlpha(f10);
                break;
            case 1:
                ((View) yVar).setScaleX(f10);
                break;
            case 2:
                ((View) yVar).setScaleY(f10);
                break;
            case 3:
                ((View) yVar).setRotation(f10);
                break;
            case 4:
                ((View) yVar).setRotationX(f10);
                break;
            default:
                ((View) yVar).setRotationY(f10);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ci.b
    public final float q(y yVar) {
        switch (this.f35828k) {
            case 0:
                return ((View) yVar).getAlpha();
            case 1:
                return ((View) yVar).getScaleX();
            case 2:
                return ((View) yVar).getScaleY();
            case 3:
                return ((View) yVar).getRotation();
            case 4:
                return ((View) yVar).getRotationX();
            default:
                return ((View) yVar).getRotationY();
        }
    }
}
