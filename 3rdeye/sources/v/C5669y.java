package v;

import B.j;
import android.hardware.camera2.CameraCaptureSession;
import android.util.ArrayMap;
import androidx.camera.core.impl.C1683d;
import androidx.camera.core.impl.C1692h0;
import androidx.camera.core.impl.C1710q0;
import androidx.camera.core.impl.C1713s0;
import androidx.camera.core.impl.C1717u0;
import androidx.camera.core.impl.P0;
import androidx.camera.core.impl.S;
import androidx.camera.core.impl.T0;
import java.util.ArrayList;
import java.util.HashSet;
import u.C5616a;

/* compiled from: Camera2CaptureOptionUnpacker.java */
/* renamed from: v.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5669y implements S.b {

    /* renamed from: a, reason: collision with root package name */
    public static final C5669y f46951a = new C5669y();

    @Override // androidx.camera.core.impl.S.b
    public void a(C1692h0 c1692h0, S.a aVar) {
        c1692h0.getClass();
        androidx.camera.core.impl.S s10 = (androidx.camera.core.impl.S) c1692h0.o(T0.f14972w, null);
        C1717u0 c1717u0 = C1717u0.f15117I;
        C1683d c1683d = androidx.camera.core.impl.S.i;
        HashSet hashSet = new HashSet();
        C1710q0 c1710q0K = C1710q0.K();
        ArrayList arrayList = new ArrayList();
        C1713s0 c1713s0A = C1713s0.a();
        ArrayList arrayList2 = new ArrayList(hashSet);
        C1717u0 c1717u0J = C1717u0.J(c1710q0K);
        ArrayList arrayList3 = new ArrayList(arrayList);
        P0 p02 = P0.f14934b;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = c1713s0A.f14935a;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        int i = -1;
        new androidx.camera.core.impl.S(arrayList2, c1717u0J, -1, false, arrayList3, false, new P0(arrayMap), null);
        if (s10 != null) {
            aVar.a(s10.f14944e);
            c1717u0 = s10.f14941b;
            i = s10.f14942c;
        }
        aVar.f14949b = C1710q0.L(c1717u0);
        aVar.f14950c = ((Integer) c1692h0.o(C5616a.f46476H, Integer.valueOf(i))).intValue();
        aVar.b(new U((CameraCaptureSession.CaptureCallback) c1692h0.o(C5616a.f46480L, new C5668x())));
        aVar.c(j.a.d(c1692h0).c());
    }
}
