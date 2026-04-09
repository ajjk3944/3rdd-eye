package v;

import B.j;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;
import android.view.Surface;
import androidx.camera.core.impl.C1683d;
import androidx.camera.core.impl.C1717u0;
import androidx.camera.core.impl.L0;
import androidx.camera.core.impl.U;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import z.C5845o;

/* compiled from: Camera2CaptureRequestBuilder.java */
/* renamed from: v.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5644E {
    public static void a(CaptureRequest.Builder builder, C1717u0 c1717u0) {
        B.j jVarC = j.a.d(c1717u0).c();
        for (U.a<?> aVar : jVarC.getConfig().l()) {
            CaptureRequest.Key key = (CaptureRequest.Key) aVar.c();
            try {
                builder.set(key, jVarC.getConfig().b(aVar));
            } catch (IllegalArgumentException unused) {
                C.S.b("Camera2CaptureRequestBuilder", "CaptureRequest.Key is not supported: " + key);
            }
        }
    }

    public static void b(CaptureRequest.Builder builder, int i, C5845o c5845o) {
        Map mapUnmodifiableMap;
        if (i == 3 && c5845o.f48404a) {
            HashMap map = new HashMap();
            map.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 1);
            mapUnmodifiableMap = Collections.unmodifiableMap(map);
        } else {
            if (i != 4) {
                c5845o.getClass();
            } else if (c5845o.f48405b) {
                HashMap map2 = new HashMap();
                map2.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 2);
                mapUnmodifiableMap = Collections.unmodifiableMap(map2);
            }
            mapUnmodifiableMap = Collections.EMPTY_MAP;
        }
        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            builder.set((CaptureRequest.Key) entry.getKey(), entry.getValue());
        }
    }

    public static CaptureRequest c(androidx.camera.core.impl.S s10, CameraDevice cameraDevice, HashMap map, boolean z10, C5845o c5845o) throws CameraAccessException {
        CaptureRequest.Builder builderCreateCaptureRequest;
        androidx.camera.core.impl.A a10;
        if (cameraDevice == null) {
            return null;
        }
        List listUnmodifiableList = Collections.unmodifiableList(s10.f14940a);
        ArrayList arrayList = new ArrayList();
        Iterator it = listUnmodifiableList.iterator();
        while (it.hasNext()) {
            Surface surface = (Surface) map.get((androidx.camera.core.impl.X) it.next());
            if (surface == null) {
                throw new IllegalArgumentException("DeferrableSurface not in configuredSurfaceMap");
            }
            arrayList.add(surface);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        int i = s10.f14942c;
        if (i == 5 && (a10 = s10.f14947h) != null && (a10.f() instanceof TotalCaptureResult)) {
            C.S.a("Camera2CaptureRequestBuilder", "createReprocessCaptureRequest");
            builderCreateCaptureRequest = cameraDevice.createReprocessCaptureRequest((TotalCaptureResult) a10.f());
        } else {
            C.S.a("Camera2CaptureRequestBuilder", "createCaptureRequest");
            if (i == 5) {
                builderCreateCaptureRequest = cameraDevice.createCaptureRequest(z10 ? 1 : 2);
            } else {
                builderCreateCaptureRequest = cameraDevice.createCaptureRequest(i);
            }
        }
        b(builderCreateCaptureRequest, i, c5845o);
        C1683d c1683d = androidx.camera.core.impl.S.f14939k;
        Object objB = L0.f14918a;
        C1717u0 c1717u0 = s10.f14941b;
        try {
            objB = c1717u0.b(c1683d);
        } catch (IllegalArgumentException unused) {
        }
        Range range = (Range) objB;
        Objects.requireNonNull(range);
        Object objB2 = L0.f14918a;
        if (!range.equals(objB2)) {
            CaptureRequest.Key key = CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE;
            try {
                objB2 = c1717u0.b(androidx.camera.core.impl.S.f14939k);
            } catch (IllegalArgumentException unused2) {
            }
            Range range2 = (Range) objB2;
            Objects.requireNonNull(range2);
            builderCreateCaptureRequest.set(key, range2);
        }
        if (s10.b() == 1 || s10.c() == 1) {
            builderCreateCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
        } else if (s10.b() == 2) {
            builderCreateCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 2);
        } else if (s10.c() == 2) {
            builderCreateCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 1);
        }
        C1683d c1683d2 = androidx.camera.core.impl.S.i;
        TreeMap<U.a<?>, Map<U.b, Object>> treeMap = c1717u0.f15118G;
        if (treeMap.containsKey(c1683d2)) {
            builderCreateCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, (Integer) c1717u0.b(c1683d2));
        }
        C1683d c1683d3 = androidx.camera.core.impl.S.f14938j;
        if (treeMap.containsKey(c1683d3)) {
            builderCreateCaptureRequest.set(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) c1717u0.b(c1683d3)).byteValue()));
        }
        a(builderCreateCaptureRequest, c1717u0);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            builderCreateCaptureRequest.addTarget((Surface) it2.next());
        }
        builderCreateCaptureRequest.setTag(s10.f14946g);
        return builderCreateCaptureRequest.build();
    }

    public static CaptureRequest d(androidx.camera.core.impl.S s10, CameraDevice cameraDevice, C5845o c5845o) throws CameraAccessException {
        if (cameraDevice == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder("template type = ");
        int i = s10.f14942c;
        sb.append(i);
        C.S.a("Camera2CaptureRequestBuilder", sb.toString());
        CaptureRequest.Builder builderCreateCaptureRequest = cameraDevice.createCaptureRequest(i);
        b(builderCreateCaptureRequest, i, c5845o);
        a(builderCreateCaptureRequest, s10.f14941b);
        return builderCreateCaptureRequest.build();
    }
}
