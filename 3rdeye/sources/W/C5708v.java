package w;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import v.C5664t;
import w.C5699m;
import w.C5704r;

/* compiled from: CameraManagerCompatBaseImpl.java */
/* renamed from: w.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5708v implements C5704r.b {

    /* renamed from: a, reason: collision with root package name */
    public final CameraManager f47157a;

    /* renamed from: b, reason: collision with root package name */
    public final a f47158b;

    /* compiled from: CameraManagerCompatBaseImpl.java */
    /* renamed from: w.v$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final HashMap f47159a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        public final Handler f47160b;

        public a(Handler handler) {
            this.f47160b = handler;
        }
    }

    public C5708v(Context context, a aVar) {
        this.f47157a = (CameraManager) context.getSystemService("camera");
        this.f47158b = aVar;
    }

    @Override // w.C5704r.b
    public void a(H.g gVar, C5664t.b bVar) {
        C5704r.a aVar;
        a aVar2 = this.f47158b;
        synchronized (aVar2.f47159a) {
            try {
                aVar = (C5704r.a) aVar2.f47159a.get(bVar);
                if (aVar == null) {
                    aVar = new C5704r.a(gVar, bVar);
                    aVar2.f47159a.put(bVar, aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f47157a.registerAvailabilityCallback(aVar, aVar2.f47160b);
    }

    @Override // w.C5704r.b
    public void b(CameraManager.AvailabilityCallback availabilityCallback) {
        C5704r.a aVar;
        if (availabilityCallback != null) {
            a aVar2 = this.f47158b;
            synchronized (aVar2.f47159a) {
                aVar = (C5704r.a) aVar2.f47159a.remove(availabilityCallback);
            }
        } else {
            aVar = null;
        }
        if (aVar != null) {
            aVar.a();
        }
        this.f47157a.unregisterAvailabilityCallback(aVar);
    }

    @Override // w.C5704r.b
    public CameraCharacteristics c(String str) throws C5687a {
        try {
            return this.f47157a.getCameraCharacteristics(str);
        } catch (CameraAccessException e4) {
            throw new C5687a(e4);
        }
    }

    @Override // w.C5704r.b
    public void d(String str, H.g gVar, CameraDevice.StateCallback stateCallback) throws CameraAccessException, C5687a {
        gVar.getClass();
        stateCallback.getClass();
        try {
            this.f47157a.openCamera(str, new C5699m.b(gVar, stateCallback), this.f47158b.f47160b);
        } catch (CameraAccessException e4) {
            throw new C5687a(e4);
        }
    }

    @Override // w.C5704r.b
    public Set<Set<String>> e() throws C5687a {
        return Collections.EMPTY_SET;
    }
}
