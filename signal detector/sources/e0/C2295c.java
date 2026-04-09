package e0;

import android.view.View;

/* renamed from: e0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2295c extends com.bumptech.glide.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f19866e;

    public /* synthetic */ C2295c(int i) {
        this.f19866e = i;
    }

    @Override // com.bumptech.glide.c
    public final float A(Object obj) {
        switch (this.f19866e) {
            case 0:
                return ((View) obj).getAlpha();
            case 1:
                return ((View) obj).getScaleX();
            case 2:
                return ((View) obj).getScaleY();
            case 3:
                return ((View) obj).getRotation();
            case 4:
                return ((View) obj).getRotationX();
            default:
                return ((View) obj).getRotationY();
        }
    }

    @Override // com.bumptech.glide.c
    public final void L(Object obj, float f2) {
        switch (this.f19866e) {
            case 0:
                ((View) obj).setAlpha(f2);
                break;
            case 1:
                ((View) obj).setScaleX(f2);
                break;
            case 2:
                ((View) obj).setScaleY(f2);
                break;
            case 3:
                ((View) obj).setRotation(f2);
                break;
            case 4:
                ((View) obj).setRotationX(f2);
                break;
            default:
                ((View) obj).setRotationY(f2);
                break;
        }
    }
}
