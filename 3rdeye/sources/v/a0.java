package v;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: CaptureSessionRepository.java */
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final H.g f46662a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f46663b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f46664c = new LinkedHashSet();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f46665d = new LinkedHashSet();

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f46666e = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public final a f46667f = new a();

    public a0(H.g gVar) {
        this.f46662a = gVar;
    }

    public final ArrayList a() {
        ArrayList arrayList;
        synchronized (this.f46663b) {
            arrayList = new ArrayList(this.f46664c);
        }
        return arrayList;
    }

    public final ArrayList b() {
        ArrayList arrayList;
        synchronized (this.f46663b) {
            arrayList = new ArrayList(this.f46666e);
        }
        return arrayList;
    }

    public final ArrayList c() {
        ArrayList arrayList;
        synchronized (this.f46663b) {
            arrayList = new ArrayList();
            arrayList.addAll(a());
            arrayList.addAll(b());
        }
        return arrayList;
    }

    public final void d(o0 o0Var) {
        synchronized (this.f46663b) {
            this.f46666e.add(o0Var);
        }
    }

    /* compiled from: CaptureSessionRepository.java */
    public class a extends CameraDevice.StateCallback {
        public a() {
        }

        public final void a() {
            ArrayList arrayListC;
            synchronized (a0.this.f46663b) {
                arrayListC = a0.this.c();
                a0.this.f46666e.clear();
                a0.this.f46664c.clear();
                a0.this.f46665d.clear();
            }
            Iterator it = arrayListC.iterator();
            while (it.hasNext()) {
                ((o0) it.next()).c();
            }
        }

        public final void b() {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            synchronized (a0.this.f46663b) {
                linkedHashSet.addAll(a0.this.f46666e);
                linkedHashSet.addAll(a0.this.f46664c);
            }
            a0.this.f46662a.execute(new C.g0(linkedHashSet, 26));
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onClosed(CameraDevice cameraDevice) {
            b();
            a();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onDisconnected(CameraDevice cameraDevice) {
            b();
            a();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onError(CameraDevice cameraDevice, int i) {
            b();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            synchronized (a0.this.f46663b) {
                linkedHashSet.addAll(a0.this.f46666e);
                linkedHashSet.addAll(a0.this.f46664c);
            }
            a0.this.f46662a.execute(new B0.h(i, 4, linkedHashSet));
            a();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onOpened(CameraDevice cameraDevice) {
        }
    }
}
