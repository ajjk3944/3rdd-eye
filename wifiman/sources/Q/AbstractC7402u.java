package q;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.z1;
import com.google.ar.core.ImageMetadata;
import m0.C6733v0;
import mh.InterfaceC6835l;
import r.AbstractC7521c;
import r.AbstractC7535j;
import r.C7532h0;
import r.InterfaceC7533i;
import r.s0;

/* renamed from: q.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7402u {

    /* renamed from: a, reason: collision with root package name */
    private static final C7532h0 f58324a = AbstractC7535j.j(0.0f, 0.0f, null, 7, null);

    public static final z1 a(long j10, InterfaceC7533i interfaceC7533i, String str, InterfaceC6835l interfaceC6835l, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        InterfaceC7533i interfaceC7533i2 = (i11 & 2) != 0 ? f58324a : interfaceC7533i;
        String str2 = (i11 & 4) != 0 ? "ColorAnimation" : str;
        InterfaceC6835l interfaceC6835l2 = (i11 & 8) != 0 ? null : interfaceC6835l;
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-451899108, i10, -1, "androidx.compose.animation.animateColorAsState (SingleValueAnimation.kt:61)");
        }
        boolean zT = interfaceC3540l.T(C6733v0.p(j10));
        Object objF = interfaceC3540l.f();
        if (zT || objF == InterfaceC3540l.f21100a.a()) {
            objF = (s0) AbstractC7389h.a(C6733v0.f52951b).invoke(C6733v0.p(j10));
            interfaceC3540l.K(objF);
        }
        int i12 = i10 << 6;
        z1 z1VarF = AbstractC7521c.f(C6733v0.g(j10), (s0) objF, interfaceC7533i2, null, str2, interfaceC6835l2, interfaceC3540l, (i10 & 14) | ((i10 << 3) & 896) | (57344 & i12) | (i12 & ImageMetadata.JPEG_GPS_COORDINATES), 8);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return z1VarF;
    }
}
