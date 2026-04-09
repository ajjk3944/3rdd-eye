package md;

import com.google.android.gms.internal.measurement.y3;
import com.google.android.material.button.MaterialButton;
import ee.v;

/* loaded from: classes.dex */
public final class a extends y3 {
    @Override // com.google.android.gms.internal.measurement.y3
    public final void O(v vVar, float f10) {
        ((MaterialButton) vVar).setDisplayedWidthIncrease(f10);
    }

    @Override // com.google.android.gms.internal.measurement.y3
    public final float z(v vVar) {
        return ((MaterialButton) vVar).getDisplayedWidthIncrease();
    }
}
