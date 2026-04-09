package q;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.z1;
import com.google.ar.core.ImageMetadata;
import m0.C6733v0;
import r.N;
import r.O;
import r.P;
import r.s0;

/* renamed from: q.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7381B {
    public static final z1 a(O o10, long j10, long j11, N n10, String str, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        String str2 = (i11 & 8) != 0 ? "ColorAnimation" : str;
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(1901963533, i10, -1, "androidx.compose.animation.animateColor (Transition.kt:101)");
        }
        Object objF = interfaceC3540l.f();
        if (objF == InterfaceC3540l.f21100a.a()) {
            objF = (s0) AbstractC7389h.a(C6733v0.f52951b).invoke(C6733v0.p(j11));
            interfaceC3540l.K(objF);
        }
        int i12 = i10 << 3;
        z1 z1VarB = P.b(o10, C6733v0.g(j10), C6733v0.g(j11), (s0) objF, n10, str2, interfaceC3540l, O.f59497f | (i10 & 14) | (i10 & 112) | (i10 & 896) | (N.f59493d << 12) | (57344 & i12) | (i12 & ImageMetadata.JPEG_GPS_COORDINATES), 0);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return z1VarB;
    }
}
