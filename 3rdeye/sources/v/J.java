package v;

import B.j;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk;
import androidx.camera.core.impl.C1683d;
import androidx.camera.core.impl.C1710q0;
import androidx.camera.core.impl.C1717u0;
import androidx.camera.core.impl.H0;
import androidx.camera.core.impl.S;
import androidx.camera.core.impl.T0;
import java.util.ArrayList;
import u.C5616a;
import v.O;
import y.C5787a;
import z.C5840j;

/* compiled from: Camera2SessionOptionUnpacker.java */
/* loaded from: classes.dex */
public final class J implements H0.e {

    /* renamed from: a, reason: collision with root package name */
    public static final J f46629a = new J();

    @Override // androidx.camera.core.impl.H0.e
    public final void a(Size size, T0<?> t02, H0.b bVar) {
        H0 h0T = t02.t();
        C1717u0 c1717u0 = C1717u0.f15117I;
        int i = H0.a().f14884g.f14942c;
        if (h0T != null) {
            i = h0T.f14884g.f14942c;
            for (CameraDevice.StateCallback stateCallback : h0T.f14880c) {
                ArrayList arrayList = bVar.f14888c;
                if (!arrayList.contains(stateCallback)) {
                    arrayList.add(stateCallback);
                }
            }
            for (CameraCaptureSession.StateCallback stateCallback2 : h0T.f14881d) {
                ArrayList arrayList2 = bVar.f14889d;
                if (!arrayList2.contains(stateCallback2)) {
                    arrayList2.add(stateCallback2);
                }
            }
            bVar.f14887b.a(h0T.f14884g.f14944e);
            c1717u0 = h0T.f14884g.f14941b;
        }
        S.a aVar = bVar.f14887b;
        aVar.getClass();
        aVar.f14949b = C1710q0.L(c1717u0);
        if (t02 instanceof androidx.camera.core.impl.x0) {
            Rational rational = C5840j.f48394a;
            if (((PreviewPixelHDRnetQuirk) C5787a.f47852a.e(PreviewPixelHDRnetQuirk.class)) != null && !C5840j.f48394a.equals(new Rational(size.getWidth(), size.getHeight()))) {
                C1710q0 c1710q0K = C1710q0.K();
                c1710q0K.N(C5616a.J(CaptureRequest.TONEMAP_MODE), 2);
                bVar.f14887b.c(new C5616a(C1717u0.J(c1710q0K)));
            }
        }
        bVar.f14887b.f14950c = ((Integer) t02.o(C5616a.f46476H, Integer.valueOf(i))).intValue();
        CameraDevice.StateCallback stateCallback3 = (CameraDevice.StateCallback) t02.o(C5616a.f46478J, new O.b());
        ArrayList arrayList3 = bVar.f14888c;
        if (!arrayList3.contains(stateCallback3)) {
            arrayList3.add(stateCallback3);
        }
        CameraCaptureSession.StateCallback stateCallback4 = (CameraCaptureSession.StateCallback) t02.o(C5616a.f46479K, new N());
        ArrayList arrayList4 = bVar.f14889d;
        if (!arrayList4.contains(stateCallback4)) {
            arrayList4.add(stateCallback4);
        }
        bVar.a(new U((CameraCaptureSession.CaptureCallback) t02.o(C5616a.f46480L, new C5668x())));
        int iB = t02.B();
        if (iB != 0) {
            S.a aVar2 = bVar.f14887b;
            aVar2.getClass();
            if (iB != 0) {
                aVar2.f14949b.N(T0.f14970F, Integer.valueOf(iB));
            }
        }
        int iF = t02.F();
        if (iF != 0) {
            S.a aVar3 = bVar.f14887b;
            aVar3.getClass();
            if (iF != 0) {
                aVar3.f14949b.N(T0.f14969E, Integer.valueOf(iF));
            }
        }
        C1710q0 c1710q0K2 = C1710q0.K();
        C1683d c1683d = C5616a.f46481M;
        c1710q0K2.N(c1683d, (String) t02.o(c1683d, null));
        C1683d c1683d2 = C5616a.f46477I;
        Long l5 = (Long) t02.o(c1683d2, -1L);
        l5.getClass();
        c1710q0K2.N(c1683d2, l5);
        bVar.f14887b.c(c1710q0K2);
        bVar.f14887b.c(j.a.d(t02).c());
    }
}
