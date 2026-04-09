package z;

import E.u;
import H6.I;
import I.m;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Log;
import b2.C1841v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import o0.b;
import v.C5667w;

/* compiled from: RequestMonitor.java */
/* renamed from: z.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5841k {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f48395a;

    /* renamed from: b, reason: collision with root package name */
    public final List<A4.a<Void>> f48396b = Collections.synchronizedList(new ArrayList());

    /* compiled from: RequestMonitor.java */
    /* renamed from: z.k$a */
    public static class a extends CameraCaptureSession.CaptureCallback {

        /* renamed from: a, reason: collision with root package name */
        public final b.d f48397a = o0.b.a(new B8.b(this, 19));

        /* renamed from: b, reason: collision with root package name */
        public b.a<Void> f48398b;

        public final void a() {
            b.a<Void> aVar = this.f48398b;
            if (aVar != null) {
                aVar.b(null);
                this.f48398b = null;
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            a();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            a();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
            a();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j4) {
            a();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j4, long j10) {
            a();
        }
    }

    public C5841k(boolean z10) {
        this.f48395a = z10;
    }

    public final CameraCaptureSession.CaptureCallback a(CameraCaptureSession.CaptureCallback captureCallback) {
        if (!this.f48395a) {
            return captureCallback;
        }
        a aVar = new a();
        List<A4.a<Void>> list = this.f48396b;
        b.d dVar = aVar.f48397a;
        list.add(dVar);
        Log.d("RequestMonitor", "RequestListener " + aVar + " monitoring " + this);
        dVar.f44804c.addListener(new J4.h(this, aVar, dVar, 21), u.y());
        return new C5667w(Arrays.asList(aVar, captureCallback));
    }

    public final A4.a<Void> b() {
        List<A4.a<Void>> list = this.f48396b;
        if (list.isEmpty()) {
            return m.c.f2366c;
        }
        I.q qVarI = I.j.i(new ArrayList(list));
        C1841v c1841v = new C1841v(5);
        return I.j.f(I.j.j(qVarI, new I(c1841v, 2), u.y()));
    }

    public final void c() {
        LinkedList linkedList = new LinkedList(this.f48396b);
        while (!linkedList.isEmpty()) {
            A4.a aVar = (A4.a) linkedList.poll();
            Objects.requireNonNull(aVar);
            aVar.cancel(true);
        }
    }
}
