package androidx.fragment.app;

import G0.e;
import I.m;
import android.app.Activity;
import android.hardware.camera2.CameraDevice;
import android.util.Log;
import android.view.View;
import androidx.camera.core.impl.X;
import androidx.fragment.app.C1754g;
import androidx.fragment.app.S;
import com.applovin.impl.AbstractActivityC2127k;
import com.applovin.impl.AbstractC2113d;
import com.applovin.impl.C2131m;
import com.applovin.impl.C2134n;
import com.applovin.impl.j2;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import o0.b;
import v.o0;
import v.q0;
import v.r0;
import w.C5699m;

/* compiled from: R8$$SyntheticClass */
/* renamed from: androidx.fragment.app.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1752e implements e.a, AbstractC2113d.b, b.c, I.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15870b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15871c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f15872d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f15873e;

    public /* synthetic */ C1752e(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f15870b = obj;
        this.f15871c = obj2;
        this.f15872d = obj3;
        this.f15873e = obj4;
    }

    @Override // com.applovin.impl.AbstractC2113d.b
    public void a(Activity activity) {
        AbstractActivityC2127k.a((j2) this.f15870b, (C2131m) this.f15871c, (C2134n) this.f15872d, (com.applovin.impl.sdk.k) this.f15873e, (MaxDebuggerAdUnitDetailActivity) activity);
    }

    @Override // I.a
    public A4.a apply(Object obj) {
        r0 r0Var = (r0) this.f15870b;
        CameraDevice cameraDevice = (CameraDevice) this.f15871c;
        x.l lVar = (x.l) this.f15872d;
        List list = (List) this.f15873e;
        if (r0Var.f46856v.f927a) {
            Iterator it = r0Var.f46835b.a().iterator();
            while (it.hasNext()) {
                ((o0) it.next()).close();
            }
        }
        r0Var.x("start openCaptureSession");
        synchronized (r0Var.f46834a) {
            try {
                if (r0Var.f46845m) {
                    return new m.a(new CancellationException("Opener is disabled"));
                }
                r0Var.f46835b.d(r0Var);
                b.d dVarA = o0.b.a(new C1752e(r0Var, list, new C5699m(cameraDevice, r0Var.f46836c), lVar));
                r0Var.f46841h = dVarA;
                I.j.a(dVarA, new A3.c(r0Var, 8), E.u.y());
                return I.j.f(r0Var.f46841h);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // G0.e.a
    public void b() {
        C1754g this$0 = (C1754g) this.f15871c;
        kotlin.jvm.internal.l.f(this$0, "this$0");
        C1754g.a animationInfo = (C1754g.a) this.f15872d;
        kotlin.jvm.internal.l.f(animationInfo, "$animationInfo");
        S.b operation = (S.b) this.f15873e;
        kotlin.jvm.internal.l.f(operation, "$operation");
        View view = (View) this.f15870b;
        view.clearAnimation();
        this$0.f15833a.endViewTransition(view);
        animationInfo.a();
        if (x.G(2)) {
            Log.v("FragmentManager", "Animation from operation " + operation + " has been cancelled.");
        }
    }

    @Override // o0.b.c
    public Object i(b.a aVar) {
        String str;
        q0 q0Var = (q0) this.f15870b;
        List<X> list = (List) this.f15871c;
        C5699m c5699m = (C5699m) this.f15872d;
        x.l lVar = (x.l) this.f15873e;
        synchronized (q0Var.f46834a) {
            q0Var.q(list);
            A2.l.q("The openCaptureSessionCompleter can only set once!", q0Var.i == null);
            q0Var.i = aVar;
            c5699m.f47145a.a(lVar);
            str = "openCaptureSession[session=" + q0Var + "]";
        }
        return str;
    }
}
