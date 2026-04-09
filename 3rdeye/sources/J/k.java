package J;

import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.I;
import androidx.camera.core.impl.InterfaceC1698k0;
import t4.C5606d;

/* compiled from: SupportedOutputSizesSorterLegacy.java */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f2686a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2687b;

    /* renamed from: c, reason: collision with root package name */
    public final Rational f2688c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2689d;

    public k(I i, Rational rational) {
        this.f2686a = i.b();
        this.f2687b = i.g();
        this.f2688c = rational;
        boolean z10 = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z10 = false;
        }
        this.f2689d = z10;
    }

    public final Size a(InterfaceC1698k0 interfaceC1698k0) {
        int iY = interfaceC1698k0.y();
        Size sizeZ = interfaceC1698k0.z();
        if (sizeZ != null) {
            int iW = C5606d.w(C5606d.E(iY), this.f2686a, 1 == this.f2687b);
            if (iW == 90 || iW == 270) {
                return new Size(sizeZ.getHeight(), sizeZ.getWidth());
            }
        }
        return sizeZ;
    }
}
