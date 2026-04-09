package v;

import C.C0626m;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import o0.b;
import v.C5658m;
import w.C5698l;
import z.C5834d;

/* compiled from: TorchControl.java */
/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final C5658m f46933a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.E<Integer> f46934b = new androidx.lifecycle.E<>(0);

    /* renamed from: c, reason: collision with root package name */
    public final boolean f46935c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f46936d;

    /* renamed from: e, reason: collision with root package name */
    public b.a<Void> f46937e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f46938f;

    public v0(C5658m c5658m, C5698l c5698l, H.g gVar) {
        this.f46933a = c5658m;
        this.f46935c = C5834d.a(new M8.a(c5698l, 15));
        c5658m.l(new C5658m.c() { // from class: v.u0
            @Override // v.C5658m.c
            public final boolean a(TotalCaptureResult totalCaptureResult) {
                v0 v0Var = this.f46922a;
                if (v0Var.f46937e != null) {
                    Integer num = (Integer) totalCaptureResult.getRequest().get(CaptureRequest.FLASH_MODE);
                    if ((num != null && num.intValue() == 2) == v0Var.f46938f) {
                        v0Var.f46937e.b(null);
                        v0Var.f46937e = null;
                    }
                }
                return false;
            }
        });
    }

    public final void a(b.a<Void> aVar, boolean z10) {
        if (!this.f46935c) {
            if (aVar != null) {
                aVar.d(new IllegalStateException("No flash unit"));
                return;
            }
            return;
        }
        boolean z11 = this.f46936d;
        androidx.lifecycle.E<Integer> e4 = this.f46934b;
        if (!z11) {
            if (G.n.b()) {
                e4.j(0);
            } else {
                e4.k(0);
            }
            if (aVar != null) {
                aVar.d(new C0626m("Camera is not active."));
                return;
            }
            return;
        }
        this.f46938f = z10;
        this.f46933a.n(z10);
        Integer numValueOf = Integer.valueOf(z10 ? 1 : 0);
        if (G.n.b()) {
            e4.j(numValueOf);
        } else {
            e4.k(numValueOf);
        }
        b.a<Void> aVar2 = this.f46937e;
        if (aVar2 != null) {
            aVar2.d(new C0626m("There is a new enableTorch being set"));
        }
        this.f46937e = aVar;
    }
}
