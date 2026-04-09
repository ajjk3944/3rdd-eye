package v;

import C.C0635w;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraDevice;
import android.util.ArrayMap;
import android.view.Surface;
import androidx.camera.core.impl.C1697k;
import androidx.camera.core.impl.C1710q0;
import androidx.camera.core.impl.C1713s0;
import androidx.camera.core.impl.C1717u0;
import androidx.camera.core.impl.H0;
import androidx.camera.core.impl.P0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import o0.b;
import v.o0;

/* compiled from: Camera2CameraImpl.java */
/* loaded from: classes.dex */
public final class r extends CameraDevice.StateCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b.a f46847a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5664t f46848b;

    public r(C5664t c5664t, b.a aVar) {
        this.f46848b = c5664t;
        this.f46847a = aVar;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        this.f46848b.u("openCameraConfigAndClose camera closed", null);
        this.f46847a.b(null);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        this.f46848b.u("openCameraConfigAndClose camera disconnected", null);
        this.f46847a.b(null);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i) {
        this.f46848b.u("openCameraConfigAndClose camera error " + i, null);
        this.f46847a.b(null);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        C5664t c5664t = this.f46848b;
        c5664t.u("openCameraConfigAndClose camera opened", null);
        Y y10 = new Y(c5664t.f46869H, false);
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(640, 480);
        Surface surface = new Surface(surfaceTexture);
        C.i0 i0Var = new C.i0(surface);
        I.j.f(i0Var.f14991e).addListener(new com.yandex.mobile.ads.impl.L(19, surface, surfaceTexture), E.u.y());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        HashSet hashSet = new HashSet();
        C1710q0 c1710q0K = C1710q0.K();
        ArrayList arrayList = new ArrayList();
        C1713s0 c1713s0A = C1713s0.a();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        C.C c10 = C.C.f616d;
        C1697k.a aVarA = H0.f.a(i0Var);
        aVarA.f15073e = c10;
        linkedHashSet.add(aVarA.a());
        c5664t.u("Start configAndClose.", null);
        ArrayList arrayList5 = new ArrayList(linkedHashSet);
        ArrayList arrayList6 = new ArrayList(arrayList2);
        ArrayList arrayList7 = new ArrayList(arrayList3);
        ArrayList arrayList8 = new ArrayList(arrayList4);
        ArrayList arrayList9 = new ArrayList(hashSet);
        C1717u0 c1717u0J = C1717u0.J(c1710q0K);
        ArrayList arrayList10 = new ArrayList(arrayList);
        P0 p02 = P0.f14934b;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = c1713s0A.f14935a;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        H0 h02 = new H0(arrayList5, arrayList6, arrayList7, arrayList8, new androidx.camera.core.impl.S(arrayList9, c1717u0J, 1, false, arrayList10, false, new P0(arrayMap), null), null, null, null);
        o0.a aVar = c5664t.f46862A;
        H.c cVar = aVar.f46818b;
        a0 a0Var = aVar.f46820d;
        int i = 0;
        I.d dVarA = I.d.a(o0.b.a(new I.h(i, y10.b(h02, cameraDevice, new r0(cVar, aVar.f46817a, aVar.f46819c, aVar.f46821e, aVar.f46822f, a0Var)))));
        C0635w c0635w = new C0635w(11, y10, i0Var);
        dVarA.getClass();
        H.g gVar = c5664t.f46874d;
        I.b bVarJ = I.j.j(dVarA, c0635w, gVar);
        Objects.requireNonNull(cameraDevice);
        bVarJ.addListener(new o.b0(cameraDevice, 2), gVar);
    }
}
