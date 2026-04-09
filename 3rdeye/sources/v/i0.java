package v;

import C.C0626m;
import I.m;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Build;
import android.util.Log;
import androidx.camera.core.impl.AbstractC1707p;
import androidx.camera.core.impl.C1710q0;
import androidx.camera.core.impl.C1712s;
import androidx.camera.core.impl.C1717u0;
import androidx.camera.core.impl.F;
import androidx.camera.core.impl.S;
import com.yandex.mobile.ads.impl.O5;
import java.util.Collections;
import o0.b;
import u.C5616a;

/* compiled from: FocusMeteringControl.java */
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: j, reason: collision with root package name */
    public static final MeteringRectangle[] f46710j = new MeteringRectangle[0];

    /* renamed from: a, reason: collision with root package name */
    public final C5658m f46711a;

    /* renamed from: b, reason: collision with root package name */
    public final H.g f46712b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f46713c = false;

    /* renamed from: d, reason: collision with root package name */
    public int f46714d = 1;

    /* renamed from: e, reason: collision with root package name */
    public MeteringRectangle[] f46715e;

    /* renamed from: f, reason: collision with root package name */
    public MeteringRectangle[] f46716f;

    /* renamed from: g, reason: collision with root package name */
    public MeteringRectangle[] f46717g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f46718h;
    public g0 i;

    /* compiled from: FocusMeteringControl.java */
    public class a extends AbstractC1707p {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.a f46719a;

        public a(b.a aVar) {
            this.f46719a = aVar;
        }

        @Override // androidx.camera.core.impl.AbstractC1707p
        public final void a(int i) {
            b.a aVar = this.f46719a;
            if (aVar != null) {
                aVar.d(new C0626m("Camera is closed"));
            }
        }

        @Override // androidx.camera.core.impl.AbstractC1707p
        public final void b(int i, androidx.camera.core.impl.A a10) {
            b.a aVar = this.f46719a;
            if (aVar != null) {
                C.S.a("FocusMeteringControl", "triggerAePrecapture: triggering capture request completed");
                aVar.b(null);
            }
        }

        @Override // androidx.camera.core.impl.AbstractC1707p
        public final void c(int i, C1712s c1712s) {
            this.f46719a.d(new F.b());
        }
    }

    public i0(C5658m c5658m, H.c cVar, H.g gVar) {
        MeteringRectangle[] meteringRectangleArr = f46710j;
        this.f46715e = meteringRectangleArr;
        this.f46716f = meteringRectangleArr;
        this.f46717g = meteringRectangleArr;
        this.f46718h = false;
        this.i = null;
        this.f46711a = c5658m;
        this.f46712b = gVar;
    }

    public final void a(boolean z10, boolean z11) {
        if (this.f46713c) {
            S.a aVar = new S.a();
            aVar.f14953f = true;
            aVar.f14950c = this.f46714d;
            C1710q0 c1710q0K = C1710q0.K();
            if (z10) {
                c1710q0K.N(C5616a.J(CaptureRequest.CONTROL_AF_TRIGGER), 2);
            }
            if (z11) {
                c1710q0K.N(C5616a.J(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER), 2);
            }
            aVar.c(new C5616a(C1717u0.J(c1710q0K)));
            this.f46711a.u(Collections.singletonList(aVar.d()));
        }
    }

    public final A4.a<Void> b(boolean z10) {
        int i = Build.VERSION.SDK_INT;
        m.c cVar = m.c.f2366c;
        if (i < 28) {
            com.google.android.gms.measurement.internal.a.i(i, "CONTROL_AE_MODE_ON_EXTERNAL_FLASH is not supported in API ", "FocusMeteringControl");
            return cVar;
        }
        if (C5658m.p(this.f46711a.f46755e, 5) != 5) {
            Log.d("FocusMeteringControl", "CONTROL_AE_MODE_ON_EXTERNAL_FLASH is not supported in this device");
            return cVar;
        }
        Log.d("FocusMeteringControl", "enableExternalFlashAeMode: CONTROL_AE_MODE_ON_EXTERNAL_FLASH supported");
        return o0.b.a(new O5(this, z10));
    }

    public final void c(b.a<Void> aVar) {
        C.S.a("FocusMeteringControl", "triggerAePrecapture");
        if (!this.f46713c) {
            aVar.d(new C0626m("Camera is not active."));
            return;
        }
        S.a aVar2 = new S.a();
        aVar2.f14950c = this.f46714d;
        aVar2.f14953f = true;
        C1710q0 c1710q0K = C1710q0.K();
        c1710q0K.N(C5616a.J(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER), 1);
        aVar2.c(new C5616a(C1717u0.J(c1710q0K)));
        aVar2.b(new a(aVar));
        this.f46711a.u(Collections.singletonList(aVar2.d()));
    }
}
