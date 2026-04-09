package o2;

import al.m;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import c2.l0;
import d3.j;
import j2.r;
import java.util.function.Consumer;
import p1.z;
import p2.p;
import r0.u0;
import u0.d1;
import xk.a0;
import xk.i1;
import xk.x;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c implements ScrollCaptureCallback {

    /* renamed from: a, reason: collision with root package name */
    public final p f30388a;

    /* renamed from: b, reason: collision with root package name */
    public final j f30389b;

    /* renamed from: c, reason: collision with root package name */
    public final e4.d f30390c;

    /* renamed from: d, reason: collision with root package name */
    public final r f30391d;

    /* renamed from: e, reason: collision with root package name */
    public final cl.d f30392e;

    /* renamed from: f, reason: collision with root package name */
    public final g f30393f;

    public c(p pVar, j jVar, cl.d dVar, e4.d dVar2, r rVar) {
        this.f30388a = pVar;
        this.f30389b = jVar;
        this.f30390c = dVar2;
        this.f30391d = rVar;
        this.f30392e = new cl.d(dVar.f2910a.y(e.f30395a));
        this.f30393f = new g(jVar.f21964d - jVar.f21962b, new u0(this, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x009d, code lost:
    
        if (r10 == r5) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(o2.c r12, android.view.ScrollCaptureSession r13, d3.j r14, ek.c r15) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.c.a(o2.c, android.view.ScrollCaptureSession, d3.j, ek.c):java.lang.Object");
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        x.v(this.f30392e, i1.f37197b, null, new al.p(this, runnable, null, 24), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        final a0 a0VarV = x.v(this.f30392e, null, null, new m(this, scrollCaptureSession, rect, consumer, null, 7), 3);
        a0VarV.m(new l0(18, cancellationSignal));
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: o2.d
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                a0VarV.e(null);
            }
        });
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.n(z.t(this.f30389b));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f30393f.f30401c = 0.0f;
        ((d1) this.f30390c.f22317b).setValue(Boolean.TRUE);
        runnable.run();
    }
}
