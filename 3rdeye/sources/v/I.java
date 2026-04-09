package v;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.ArrayMap;
import android.view.Surface;
import androidx.camera.core.impl.C1710q0;
import androidx.camera.core.impl.C1712s;
import androidx.camera.core.impl.C1713s0;
import androidx.camera.core.impl.C1717u0;
import androidx.camera.core.impl.E0;
import androidx.camera.core.impl.H0;
import androidx.camera.core.impl.J0;
import androidx.camera.core.impl.P0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import v.Y;

/* compiled from: Camera2RequestProcessor.java */
/* loaded from: classes.dex */
public final class I implements E0 {

    /* renamed from: b, reason: collision with root package name */
    public Y f46621b;

    /* renamed from: c, reason: collision with root package name */
    public List<J0> f46622c;

    /* renamed from: e, reason: collision with root package name */
    public volatile H0 f46624e;

    /* renamed from: a, reason: collision with root package name */
    public final Object f46620a = new Object();

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f46623d = false;

    /* compiled from: Camera2RequestProcessor.java */
    public class a extends CameraCaptureSession.CaptureCallback {

        /* renamed from: a, reason: collision with root package name */
        public final E0.a f46625a;

        /* renamed from: b, reason: collision with root package name */
        public final E0.b f46626b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f46627c;

        public a(E0.b bVar, E0.a aVar, boolean z10) {
            this.f46625a = aVar;
            this.f46626b = bVar;
            this.f46627c = z10;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j4) {
            int i;
            E0.a aVar = this.f46625a;
            E0.b bVar = this.f46626b;
            I i10 = I.this;
            synchronized (i10.f46620a) {
                try {
                    List<J0> list = i10.f46622c;
                    i = -1;
                    if (list != null) {
                        Iterator<J0> it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            } else if (it.next().c().get() == surface) {
                                i = 0;
                                break;
                            }
                        }
                    }
                } finally {
                }
            }
            aVar.onCaptureBufferLost(bVar, j4, i);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            this.f46625a.onCaptureCompleted(this.f46626b, new C5651f(totalCaptureResult));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            this.f46625a.onCaptureFailed(this.f46626b, new C5650e(C1712s.a.ERROR, captureFailure));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            this.f46625a.onCaptureProgressed(this.f46626b, new C5651f(captureResult));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
            if (this.f46627c) {
                this.f46625a.onCaptureSequenceAborted(i);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j4) {
            if (this.f46627c) {
                this.f46625a.onCaptureSequenceCompleted(i, j4);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j4, long j10) {
            this.f46625a.onCaptureStarted(this.f46626b, j10, j4);
        }
    }

    public I(Y y10, ArrayList arrayList) {
        A2.l.k("CaptureSession state must be OPENED. Current state:" + y10.i, y10.i == Y.a.OPENED);
        this.f46621b = y10;
        this.f46622c = Collections.unmodifiableList(new ArrayList(arrayList));
    }

    public final J0 a(int i) {
        synchronized (this.f46620a) {
            try {
                List<J0> list = this.f46622c;
                if (list == null) {
                    return null;
                }
                for (J0 j02 : list) {
                    j02.getClass();
                    if (i == 0) {
                        return j02;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b(E0.b bVar) {
        if (bVar.getTargetOutputConfigIds().isEmpty()) {
            C.S.b("Camera2RequestProcessor", "Unable to submit the RequestProcessor.Request: empty targetOutputConfigIds");
            return false;
        }
        for (Integer num : bVar.getTargetOutputConfigIds()) {
            if (a(num.intValue()) == null) {
                C.S.b("Camera2RequestProcessor", "Unable to submit the RequestProcessor.Request: targetOutputConfigId(" + num + ") is not a valid id");
                return false;
            }
        }
        return true;
    }

    public final int c(List<E0.b> list, E0.a aVar) {
        synchronized (this.f46620a) {
            try {
                if (!this.f46623d) {
                    Iterator<E0.b> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            if (this.f46621b != null) {
                                ArrayList arrayList = new ArrayList();
                                boolean z10 = true;
                                for (E0.b bVar : list) {
                                    HashSet hashSet = new HashSet();
                                    C1710q0.K();
                                    ArrayList arrayList2 = new ArrayList();
                                    C1713s0 c1713s0A = C1713s0.a();
                                    int templateId = bVar.getTemplateId();
                                    C1710q0 c1710q0L = C1710q0.L(bVar.getParameters());
                                    U u8 = new U(new a(bVar, aVar, z10));
                                    if (!arrayList2.contains(u8)) {
                                        arrayList2.add(u8);
                                    }
                                    Iterator<Integer> it2 = bVar.getTargetOutputConfigIds().iterator();
                                    while (it2.hasNext()) {
                                        hashSet.add(a(it2.next().intValue()));
                                    }
                                    ArrayList arrayList3 = new ArrayList(hashSet);
                                    C1717u0 c1717u0J = C1717u0.J(c1710q0L);
                                    ArrayList arrayList4 = new ArrayList(arrayList2);
                                    P0 p02 = P0.f14934b;
                                    ArrayMap arrayMap = new ArrayMap();
                                    for (String str : c1713s0A.f14935a.keySet()) {
                                        arrayMap.put(str, c1713s0A.f14935a.get(str));
                                    }
                                    arrayList.add(new androidx.camera.core.impl.S(arrayList3, c1717u0J, templateId, false, arrayList4, false, new P0(arrayMap), null));
                                    z10 = false;
                                }
                                return this.f46621b.p(arrayList);
                            }
                        } else if (!b(it.next())) {
                        }
                    }
                }
                return -1;
            } finally {
            }
        }
    }
}
