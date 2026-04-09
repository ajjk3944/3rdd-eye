package w;

import C.S;
import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import io.appmetrica.analytics.impl.Oo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import w.C5699m;
import x.l;

/* compiled from: CameraDeviceCompatBaseImpl.java */
/* renamed from: w.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5703q implements C5699m.a {

    /* renamed from: a, reason: collision with root package name */
    public final CameraDevice f47148a;

    /* renamed from: b, reason: collision with root package name */
    public final a f47149b;

    /* compiled from: CameraDeviceCompatBaseImpl.java */
    /* renamed from: w.q$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f47150a;

        public a(Handler handler) {
            this.f47150a = handler;
        }
    }

    public C5703q(CameraDevice cameraDevice, a aVar) {
        cameraDevice.getClass();
        this.f47148a = cameraDevice;
        this.f47149b = aVar;
    }

    public static void b(CameraDevice cameraDevice, x.l lVar) {
        cameraDevice.getClass();
        l.c cVar = lVar.f47623a;
        cVar.b().getClass();
        List<x.f> listF = cVar.f();
        if (listF == null) {
            throw new IllegalArgumentException("Invalid output configurations");
        }
        if (cVar.d() == null) {
            throw new IllegalArgumentException("Invalid executor");
        }
        String id = cameraDevice.getId();
        Iterator<x.f> it = listF.iterator();
        while (it.hasNext()) {
            String strE = it.next().f47605a.e();
            if (strE != null && !strE.isEmpty()) {
                S.g("CameraDeviceCompat", Oo.h("Camera ", id, ": Camera doesn't support physicalCameraId ", strE, ". Ignoring."));
            }
        }
    }

    public static ArrayList c(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((x.f) it.next()).f47605a.a());
        }
        return arrayList;
    }
}
