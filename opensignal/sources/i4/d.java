package i4;

import android.view.View;
import com.google.android.gms.internal.measurement.y3;
import ee.v;

/* loaded from: classes.dex */
public final class d extends y3 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11207b;

    public /* synthetic */ d(int i10) {
        this.f11207b = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.y3
    public final void O(v vVar, float f10) {
        switch (this.f11207b) {
            case 0:
                ((View) vVar).setAlpha(f10);
                break;
            case 1:
                ((View) vVar).setScaleX(f10);
                break;
            case 2:
                ((View) vVar).setScaleY(f10);
                break;
            case 3:
                ((View) vVar).setRotation(f10);
                break;
            case 4:
                ((View) vVar).setRotationX(f10);
                break;
            default:
                ((View) vVar).setRotationY(f10);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.y3
    public final float z(v vVar) {
        switch (this.f11207b) {
            case 0:
                return ((View) vVar).getAlpha();
            case 1:
                return ((View) vVar).getScaleX();
            case 2:
                return ((View) vVar).getScaleY();
            case 3:
                return ((View) vVar).getRotation();
            case 4:
                return ((View) vVar).getRotationX();
            default:
                return ((View) vVar).getRotationY();
        }
    }
}
