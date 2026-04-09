package M8;

import C.RunnableC0615b;
import E.i;
import G0.e;
import L0.C0773d;
import L0.I;
import N.s;
import Q0.f;
import W.Y;
import Z.h;
import a9.InterfaceC1676a;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Intent;
import android.hardware.camera2.CameraCharacteristics;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.Log;
import androidx.camera.core.impl.C1704n0;
import androidx.fragment.app.S;
import com.applovin.impl.h3;
import com.applovin.impl.j3;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import d0.r;
import g0.C4356c;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.location.impl.u;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.l;
import n5.C5359B;
import n5.C5361D;
import o.C5391i;
import o0.b;
import v.C5658m;
import v.C5670z;
import w.C5698l;
import y7.c;
import z.InterfaceC5833c;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements FunctionWithThrowable, b.c, c.f, Continuation, I.a, e.a, h3.a, InterfaceC1676a, OnSuccessListener, OnCompleteListener, InterfaceC5833c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4341b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4342c;

    public /* synthetic */ a(Object obj, int i) {
        this.f4341b = i;
        this.f4342c = obj;
    }

    @Override // com.applovin.impl.h3.a
    public Object a(Object obj) {
        return j3.a((Long) this.f4342c, (Long) obj);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable, I.a
    public Object apply(Object obj) {
        return u.a((u) this.f4342c, (LocationManager) obj);
    }

    @Override // G0.e.a
    public void b() {
        S.b this$0 = (S.b) this.f4342c;
        l.f(this$0, "this$0");
        this$0.a();
    }

    public boolean c(f fVar, int i, Bundle bundle) {
        C0773d.b aVar;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 25 && (i & 1) != 0) {
            try {
                fVar.f10858a.b();
                Parcelable parcelable = (Parcelable) fVar.f10858a.d();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e4) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e4);
                return false;
            }
        }
        ClipDescription description = fVar.f10858a.getDescription();
        f.c cVar = fVar.f10858a;
        ClipData clipData = new ClipData(description, new ClipData.Item(cVar.a()));
        if (i10 >= 31) {
            aVar = new C0773d.a(clipData, 2);
        } else {
            C0773d.c cVar2 = new C0773d.c();
            cVar2.f3891a = clipData;
            cVar2.f3892b = 2;
            aVar = cVar2;
        }
        aVar.a(cVar.c());
        aVar.setExtras(bundle);
        return I.k((C5391i) this.f4342c, aVar.build()) == null;
    }

    @Override // a9.InterfaceC1676a
    public Object get() {
        switch (this.f4341b) {
            case 12:
                e7.f parsingHistogramReporter = (e7.f) this.f4342c;
                l.f(parsingHistogramReporter, "$parsingHistogramReporter");
                return parsingHistogramReporter;
            default:
                return ((C5698l) this.f4342c).a(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        }
    }

    @Override // o0.b.c
    public Object i(b.a aVar) {
        switch (this.f4341b) {
            case 1:
                s.a aVar2 = (s.a) this.f4342c;
                aVar2.f4447p = aVar;
                return "SettableFuture hashCode: " + aVar2.hashCode();
            case 7:
                Y y10 = (Y) this.f4342c;
                y10.f13227k = aVar;
                return "ReleasedFuture " + y10;
            case 8:
                h hVar = (h) this.f4342c;
                hVar.f13910a.execute(new B.c(7, hVar, aVar));
                return "AudioSource-release";
            default:
                C1704n0 c1704n0 = (C1704n0) this.f4342c;
                c1704n0.getClass();
                E.u.H().execute(new RunnableC0615b(12, c1704n0, aVar));
                return c1704n0 + " [fetch@" + SystemClock.uptimeMillis() + "]";
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        C5361D.a((Intent) this.f4342c);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        boolean z10;
        C5359B c5359b = (C5359B) obj;
        if (!((FirebaseMessaging) this.f4342c).f23263f.b() || c5359b.f44294h.a() == null) {
            return;
        }
        synchronized (c5359b) {
            z10 = c5359b.f44293g;
        }
        if (z10) {
            return;
        }
        c5359b.h(0L);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        boolean zIsSuccessful = task.isSuccessful();
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f4342c;
        if (zIsSuccessful) {
            taskCompletionSource.trySetResult(task.getResult());
            return null;
        }
        if (task.getException() == null) {
            return null;
        }
        taskCompletionSource.trySetException(task.getException());
        return null;
    }

    @Override // y7.c.f
    public List a() {
        return (ArrayList) this.f4342c;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable, I.a
    public A4.a apply(Object obj) {
        switch (this.f4341b) {
            case 5:
                return ((i) ((A4.a) this.f4342c).get()).a();
            case 6:
                return (A4.a) ((E7.a) this.f4342c).invoke(obj);
            default:
                C4356c c4356c = new C4356c(11);
                C5670z.h hVar = (C5670z.h) this.f4342c;
                H.c cVar = hVar.f46997e;
                long millis = TimeUnit.NANOSECONDS.toMillis(C5670z.h.f46991g);
                C5670z.f fVar = new C5670z.f(c4356c);
                C5658m c5658m = hVar.f46993a;
                c5658m.l(fVar);
                r rVar = new r(4, c5658m, fVar);
                b.d dVar = fVar.f46982b;
                dVar.f44804c.addListener(rVar, c5658m.f46753c);
                return b.a(new I.i(dVar, cVar, millis));
        }
    }
}
