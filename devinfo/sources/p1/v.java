package p1;

import android.graphics.ColorSpace;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class v {
    public static final ColorSpace a(q1.c cVar) {
        if (nk.k.a(cVar, q1.d.f32095v)) {
            return ColorSpace.get(ColorSpace.Named.BT2020_HLG);
        }
        if (nk.k.a(cVar, q1.d.f32096w)) {
            return ColorSpace.get(ColorSpace.Named.BT2020_PQ);
        }
        return null;
    }
}
