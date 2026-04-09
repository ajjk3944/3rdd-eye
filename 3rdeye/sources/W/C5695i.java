package w;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import java.util.ArrayList;
import w.C5688b;

/* compiled from: CameraCaptureSessionCompatBaseImpl.java */
/* renamed from: w.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5695i implements C5688b.a {

    /* renamed from: a, reason: collision with root package name */
    public final CameraCaptureSession f47137a;

    /* renamed from: b, reason: collision with root package name */
    public final a f47138b;

    /* compiled from: CameraCaptureSessionCompatBaseImpl.java */
    /* renamed from: w.i$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f47139a;

        public a(Handler handler) {
            this.f47139a = handler;
        }
    }

    public C5695i(CameraCaptureSession cameraCaptureSession, a aVar) {
        cameraCaptureSession.getClass();
        this.f47137a = cameraCaptureSession;
        this.f47138b = aVar;
    }

    @Override // w.C5688b.a
    public int a(ArrayList arrayList, H.g gVar, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.f47137a.captureBurst(arrayList, new C5688b.C0541b(gVar, captureCallback), this.f47138b.f47139a);
    }

    @Override // w.C5688b.a
    public int b(CaptureRequest captureRequest, H.g gVar, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.f47137a.setRepeatingRequest(captureRequest, new C5688b.C0541b(gVar, captureCallback), this.f47138b.f47139a);
    }
}
