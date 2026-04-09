package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.C1701m;
import androidx.camera.core.impl.U0;
import java.util.List;
import u.C5616a;

/* compiled from: AttachedSurfaceInfo.java */
/* renamed from: androidx.camera.core.impl.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1677a {
    public abstract List<U0.b> a();

    public abstract C.C b();

    public abstract int c();

    public abstract U d();

    public abstract Size e();

    public abstract N0 f();

    public abstract Range<Integer> g();

    public final C1701m h(C5616a c5616a) {
        Size sizeE = e();
        Range<Integer> range = L0.f14918a;
        C1701m.a aVar = new C1701m.a();
        if (sizeE == null) {
            throw new NullPointerException("Null resolution");
        }
        aVar.f15090a = sizeE;
        Range<Integer> range2 = L0.f14918a;
        if (range2 == null) {
            throw new NullPointerException("Null expectedFrameRateRange");
        }
        aVar.f15092c = range2;
        aVar.f15091b = C.C.f616d;
        aVar.f15094e = Boolean.FALSE;
        C.C cB = b();
        if (cB == null) {
            throw new NullPointerException("Null dynamicRange");
        }
        aVar.f15091b = cB;
        aVar.f15093d = c5616a;
        if (g() != null) {
            Range<Integer> rangeG = g();
            if (rangeG == null) {
                throw new NullPointerException("Null expectedFrameRateRange");
            }
            aVar.f15092c = rangeG;
        }
        return aVar.a();
    }
}
