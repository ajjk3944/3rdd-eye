package ml;

import com.google.android.gms.internal.ads.be1;
import com.google.android.gms.internal.ads.ur0;
import d0.z0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c implements il.a {

    /* renamed from: a, reason: collision with root package name */
    public static final c f29402a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static final n f29403b = new n("kotlin.Double", kl.b.f28373d);

    @Override // il.a
    public final Object a(be1 be1Var) throws NumberFormatException {
        nk.k.e(be1Var, "decoder");
        ol.i iVar = (ol.i) be1Var.f9660d;
        String strH = iVar.h();
        try {
            double d10 = Double.parseDouble(strH);
            ((nl.b) be1Var.f9658b).f29991a.getClass();
            if (!Double.isInfinite(d10) && !Double.isNaN(d10)) {
                return Double.valueOf(d10);
            }
            ol.i.k(iVar, "Unexpected special floating-point value " + Double.valueOf(d10) + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            ol.i.k(iVar, d.h.p('\'', "Failed to parse type 'double' for input '", strH), 0, 6);
            throw null;
        }
    }

    @Override // il.a
    public final void b(z0 z0Var, Object obj) {
        double dDoubleValue = ((Number) obj).doubleValue();
        a4.d dVar = (a4.d) z0Var.f21913b;
        if (z0Var.f21912a) {
            z0Var.m(String.valueOf(dDoubleValue));
        } else {
            ((t7.m) dVar.f189b).B(String.valueOf(dDoubleValue));
        }
        ((ur0) z0Var.f21917f).getClass();
        if (Double.isInfinite(dDoubleValue) || Double.isNaN(dDoubleValue)) {
            throw new ol.e("Unexpected special floating-point value " + Double.valueOf(dDoubleValue) + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) ol.g.d(-1, ((t7.m) dVar.f189b).toString())));
        }
    }

    @Override // il.a
    public final kl.d d() {
        return f29403b;
    }
}
