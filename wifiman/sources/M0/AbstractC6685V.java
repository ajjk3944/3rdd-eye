package m0;

import android.graphics.CornerPathEffect;
import android.graphics.DashPathEffect;
import android.graphics.PathEffect;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: m0.V, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6685V {
    public static final V0 a(float f10) {
        return new C6684U(new CornerPathEffect(f10));
    }

    public static final V0 b(float[] fArr, float f10) {
        return new C6684U(new DashPathEffect(fArr, f10));
    }

    public static final PathEffect c(V0 v02) {
        AbstractC6492s.g(v02, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidPathEffect");
        return ((C6684U) v02).a();
    }
}
